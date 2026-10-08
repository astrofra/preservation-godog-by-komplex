#include "demo.hpp"
#include <fstream>
namespace godog {
    NativeDemo::NativeDemo(const std::string &assets, const std::string &scene) {
        initialize_engine();
        heap.begin();
        java_random().setSeed(888);
        System::clock() = 0;
        demo = make_ref<godog>();
        demo->assetRoot = String(assets);
        presenter = make_ref<RgbSurfacePresenter>();
        godog::KKAMAjA = presenter;
        presenter->akkaMaJ(demo, 512, 256);
        godog::kKAMAjA = surface();
        if (!scene.empty()) {
            if (scene == "movieintro")
                isolatedScene = make_ref<MovieIntroScene>();
            else if (scene == "paa")
                isolatedScene = make_ref<PaaScene>();
            else if (scene == "trav")
                isolatedScene = make_ref<TravScene>();
            else if (scene == "vehje")
                isolatedScene = make_ref<VehjeScene>();
            else if (scene == "evil")
                isolatedScene = make_ref<EvilScene>();
            else if (scene == "linjanen")
                isolatedScene = make_ref<LinjanenScene>();
            else
                throw std::invalid_argument("Unknown scene: " + scene);
            isolatedScene->load(demo);
            java_random().setSeed(888);
            isolatedScene->enter();
            return;
        }
        device = make_ref<MAD>();
        mixer = make_ref<MixerBus>();
        demo->KkamAjA = device;
        demo->kkamAjA = mixer;
        auto xm = demo->aMajAKK(String("data/rocket.xm"))->openStream();
        auto bytes = make_array<int8_t>(int(xm->bytes.size()));
        for (int i = 0; i < bytes->length; ++i)
            (*bytes)[i] = jbyte(xm->bytes[i]);
        demo->KKamAjA = ModuleLoader::kKAmAjA(bytes);
        if (!demo->KKamAjA)
            throw std::runtime_error("Cannot decode rocket.xm");
        demo->kAMAJAk();
        demo->KkAmaJA = make_ref<SmoothedFrameTimer>(10, 60);
        demo->KAMAjAk(); // Original init/loaded/mod commands, up to the first music cue.
    }
    void NativeDemo::mixBlock(Array<int32_t> block) {
        std::fill(block->values.begin(), block->values.end(), 0);
        if (mixer) {
            device->bufferStartTime = int64_t(mixedFrames * 1000 / 22050);
            mixer->mix(device, block, 0, block->length);
        }
        mixedFrames += block->length;
    }
    void NativeDemo::update(double seconds) {
        System::clock() = int64_t(seconds * 1000);
        if (isolatedScene) {
            isolatedScene->render(surface(), float(seconds), float(seconds) - previous);
            previous = float(seconds);
            heap.prune();
            return;
        }
        demo->KAMAjAk();
        demo->KKAmaJA = float(demo->KkAmaJA->getElapsedMillis()) / 1000.0f;
        demo->kkAmaJA = demo->KKAmaJA - demo->kKAmaJA;
        if (demo->kkaMAJA)
            demo->renderFrame();
        if (demo->KKaMAJA)
            demo->KKaMAJA->render(nullptr, demo->KKAmaJA - demo->KkamaJA, demo->kkAmaJA);
        demo->kKAmaJA = demo->KKAmaJA;
        demo->KkAmaJA->recordFrame();
        ++demo->kKaMAJA;
        heap.prune();
    }
    NativeDemo::~NativeDemo() {
        // Session teardown releases the graph directly. Some original dispose()
        // methods assume fields that are never initialized by the shipped script.
        // Break host/scene ownership cycles introduced by Java's collecting heap.
        if (demo) {
            demo->kkaMAJA.reset();
            demo->KKaMAJA.reset();
            demo->kKAmajA->clear();
            demo->KkamajA->clear();
            demo->KkAMAjA.reset();
            demo->KKamAjA.reset();
            demo->kkamAjA.reset();
        }
        if (mixer)
            mixer->MAJAKKA.reset();
        godog::KKAMAjA.reset();
        godog::kKAMAjA.reset();
        RenderPrimitive::aMaJAKK.reset();
        releaseMovieSessions();
        heap.release();
    }
    std::vector<uint32_t> displayPixels(Ref<RgbSurface> s) {
        std::vector<uint32_t> out(s->AMAjakk_field->length);
        for (size_t i = 0; i < out.size(); ++i) {
            uint32_t p = (*s->AMAjakk_field)[int(i)];
            out[i] = 0xff000000 | ((p >> 20 & 255) << 16) | ((p >> 10 & 255) << 8) | (p & 255);
        }
        return out;
    }
    void capturePpm(const std::string &path, Ref<RgbSurface> s) {
        std::ofstream f(path, std::ios::binary);
        if (!f)
            throw std::runtime_error("Cannot write " + path);
        f << "P6\n" << s->width << " " << s->height << "\n255\n";
        for (uint32_t p : displayPixels(s)) {
            char b[] = {char(p >> 16), char(p >> 8), char(p)};
            f.write(b, 3);
        }
        if (!f)
            throw std::runtime_error("Failed to write " + path);
    }
} // namespace godog
