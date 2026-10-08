#include <SDL.h>
#include "demo.hpp"
#include <chrono>
#include <iostream>
using namespace godog;
struct SdlSession {
    ~SdlSession() { SDL_Quit(); }
};
struct AudioDevice {
    SDL_AudioDeviceID id = 0;
    ~AudioDevice() {
        if (id)
            SDL_CloseAudioDevice(id);
    }
};
int main(int argc, char **argv) {
    SDL_SetMainReady();
    SdlSession session;
    std::string assets, scene, output;
    double duration = 0, at = -1;
    bool headless = false, mute = false;
    int scale = 2;
    try {
        for (int i = 1; i < argc; ++i) {
            std::string arg = argv[i];
            auto value = [&]() {
                if (++i >= argc)
                    throw std::invalid_argument("Missing value for " + arg);
                return std::string(argv[i]);
            };
            if (arg == "--assets")
                assets = value();
            else if (arg == "--scene")
                scene = value();
            else if (arg == "--duration")
                duration = std::stod(value());
            else if (arg == "--at")
                at = std::stod(value());
            else if (arg == "--capture")
                output = value();
            else if (arg == "--headless")
                headless = true;
            else if (arg == "--mute")
                mute = true;
            else if (arg == "--scale")
                scale = std::stoi(value());
            else if (arg == "--help") {
                std::cout << "Godog — Komplex / C++11 + SDL2\n--duration SECONDS (default: until closed) --scale 1..4 "
                             "--mute\n--assets PATH --headless --capture FRAME.ppm\n--scene "
                             "movieintro|paa|trav|vehje|evil|linjanen [--at SCENE_SECONDS]\nEscape quits; Space "
                             "pauses. Isolated scenes are silent.\n";
                return 0;
            } else
                throw std::invalid_argument("Unknown option: " + arg);
        }
        if (scale < 1 || scale > 4 || duration < 0 || !std::isfinite(duration) || !std::isfinite(at) || at < -1)
            throw std::invalid_argument("Invalid scale, time or duration");
        if (at >= 0 && scene.empty())
            throw std::invalid_argument("--at requires an isolated --scene");
        if (assets.empty()) {
            char *base = SDL_GetBasePath();
            if (!base)
                throw std::runtime_error(SDL_GetError());
            assets = std::string(base) + "assets";
            SDL_free(base);
        }
        NativeDemo demo(assets, scene);
        auto block = make_array<int32_t>(1024);
        if (headless) {
            if (duration == 0)
                duration = 192;
            if (!scene.empty()) {
                java_random().setSeed(888 + int(std::max(0.0, at)));
                demo.isolatedScene->render(demo.surface(), float(std::max(0.0, at)), .02f);
            } else
                for (uint64_t frame = 0; frame / 50.0 < duration; ++frame) {
                    double t = frame / 50.0;
                    System::clock() = int64_t(t * 1000);
                    while (demo.mixedFrames / 22050.0 < t + .093)
                        demo.mixBlock(block);
                    demo.update(t);
                }
            if (!output.empty())
                capturePpm(output, demo.surface());
            return 0;
        }
        if (SDL_Init(SDL_INIT_VIDEO | SDL_INIT_TIMER) != 0)
            throw std::runtime_error(SDL_GetError());
        std::unique_ptr<SDL_Window, void (*)(SDL_Window *)> window(
            SDL_CreateWindow("Godog — Komplex", SDL_WINDOWPOS_CENTERED, SDL_WINDOWPOS_CENTERED, 512 * scale,
                             256 * scale, SDL_WINDOW_RESIZABLE | SDL_WINDOW_ALLOW_HIGHDPI),
            SDL_DestroyWindow);
        if (!window)
            throw std::runtime_error(SDL_GetError());
        std::unique_ptr<SDL_Renderer, void (*)(SDL_Renderer *)> renderer(
            SDL_CreateRenderer(window.get(), -1, SDL_RENDERER_ACCELERATED | SDL_RENDERER_PRESENTVSYNC),
            SDL_DestroyRenderer);
        if (!renderer)
            renderer.reset(SDL_CreateRenderer(window.get(), -1, SDL_RENDERER_SOFTWARE));
        if (!renderer)
            throw std::runtime_error(SDL_GetError());
        if (SDL_RenderSetLogicalSize(renderer.get(), 512, 256) != 0)
            throw std::runtime_error(SDL_GetError());
        std::unique_ptr<SDL_Texture, void (*)(SDL_Texture *)> texture(
            SDL_CreateTexture(renderer.get(), SDL_PIXELFORMAT_ARGB8888, SDL_TEXTUREACCESS_STREAMING, 512, 256),
            SDL_DestroyTexture);
        if (!texture)
            throw std::runtime_error(SDL_GetError());
        SDL_SetTextureBlendMode(texture.get(), SDL_BLENDMODE_NONE);
        AudioDevice audio;
        if (!mute && scene.empty()) {
            if (SDL_InitSubSystem(SDL_INIT_AUDIO) != 0)
                throw std::runtime_error(SDL_GetError());
            SDL_AudioSpec want{};
            want.freq = 22050;
            want.format = AUDIO_S16LSB;
            want.channels = 2;
            want.samples = 1024;
            audio.id = SDL_OpenAudioDevice(nullptr, 0, &want, nullptr, 0);
            if (!audio.id)
                throw std::runtime_error(std::string("Audio: ") + SDL_GetError() + " (use --mute to disable sound)");
        }
        auto start = std::chrono::steady_clock::now();
        bool running = true, paused = false, audioStarted = false;
        double pauseTotal = 0, pauseStart = 0;
        while (running) {
            const double wall = std::chrono::duration<double>(std::chrono::steady_clock::now() - start).count();
            SDL_Event event;
            while (SDL_PollEvent(&event)) {
                if (event.type == SDL_QUIT || (event.type == SDL_KEYDOWN && event.key.keysym.sym == SDLK_ESCAPE))
                    running = false;
                if (event.type == SDL_KEYDOWN && !event.key.repeat && event.key.keysym.sym == SDLK_SPACE) {
                    paused = !paused;
                    if (paused)
                        pauseStart = wall;
                    else
                        pauseTotal += wall - pauseStart;
                    if (audio.id)
                        SDL_PauseAudioDevice(audio.id, paused);
                }
            }
            if (!running)
                break;
            if (paused) {
                SDL_Delay(10);
                continue;
            }
            double t = wall - pauseTotal;
            if (audio.id && audioStarted)
                t = double(demo.mixedFrames - SDL_GetQueuedAudioSize(audio.id) / 4) / 22050.0;
            if (duration > 0 && t >= duration)
                break;
            System::clock() = int64_t(t * 1000);
            if (scene.empty()) {
                while (audio.id ? SDL_GetQueuedAudioSize(audio.id) < 8192 : demo.mixedFrames / 22050.0 < t + .093) {
                    demo.mixBlock(block);
                    if (audio.id) {
                        uint8_t pcm[4096];
                        for (int i = 0; i < 1024; ++i)
                            for (int b = 0; b < 4; ++b)
                                pcm[i * 4 + b] = uint8_t(uint32_t((*block)[i]) >> (8 * b));
                        if (SDL_QueueAudio(audio.id, pcm, sizeof pcm) != 0)
                            throw std::runtime_error(SDL_GetError());
                    }
                }
                if (audio.id && !audioStarted) {
                    SDL_PauseAudioDevice(audio.id, 0);
                    audioStarted = true;
                    t = 0;
                }
            }
            demo.update(at >= 0 ? at : t);
            auto rgb = displayPixels(demo.surface());
            if (SDL_UpdateTexture(texture.get(), nullptr, rgb.data(), 512 * 4) != 0)
                throw std::runtime_error(SDL_GetError());
            SDL_RenderClear(renderer.get());
            SDL_RenderCopy(renderer.get(), texture.get(), nullptr, nullptr);
            SDL_RenderPresent(renderer.get());
            SDL_Delay(1);
        }
        if (!output.empty())
            capturePpm(output, demo.surface());
        return 0;
    } catch (const std::exception &e) {
        std::cerr << "Godog: " << e.what() << '\n';
        return 1;
    }
}
