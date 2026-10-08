#include "engine/core.hpp"
#include "surface_platform.hpp"
#include <fstream>
using namespace godog;
static uint32_t u32(std::istream &f) {
    unsigned char b[4];
    if (!f.read(reinterpret_cast<char *>(b), 4))
        throw std::runtime_error("Truncated reference");
    return uint32_t(b[0]) << 24 | uint32_t(b[1]) << 16 | uint32_t(b[2]) << 8 | b[3];
}
static float f32(std::istream &f) {
    uint32_t u = u32(f);
    float x;
    std::memcpy(&x, &u, 4);
    return x;
}
static Ref<SoftwareImageSurface> load_reference(std::string path) {
    std::ifstream f(path, std::ios::binary);
    if (!f)
        throw std::runtime_error("Missing fixture " + path);
    int w = int(u32(f)), h = int(u32(f)), indexed = int(u32(f));
    if (!indexed) {
        auto out = make_ref<RgbSurface>(w, h, 1, false);
        for (int i = 0; i < w * h; ++i)
            (*out->AMAjakk_field)[i] = signed32(u32(f));
        return out;
    }
    auto p = make_array<int8_t>(w * h), r = make_array<int8_t>(256), g = make_array<int8_t>(256),
         b = make_array<int8_t>(256);
    for (auto a : {p, r, g, b})
        if (!f.read(reinterpret_cast<char *>(a->values.data()), a->length))
            throw std::runtime_error("Truncated image reference");
    return make_ref<IndexedSurface>(w, h, p, r, g, b);
}
int main(int argc, char **argv) {
    try {
        if (argc != 3)
            throw std::runtime_error("reference-test ASSETS FIXTURES");
        std::string fixtures = argv[2];
        initialize_engine();
        auto context = make_ref<DesktopDemoBase>(String(argv[1]));
        size_t assetFailures = 0;
        double jpegError = 0;
        uint64_t jpegChannels = 0;
        int jpegMaximum = 0;
        std::ifstream list(fixtures + "/images.txt");
        if (!list)
            throw std::runtime_error("Missing image manifest");
        std::string name;
        while (std::getline(list, name)) {
            auto actual = ImageMathSupport::MAjaKkA(context->aMajAKK(String("images/" + name))),
                 reference = load_reference(fixtures + "/images/" + name + ".bin");
            if (actual->width != reference->width || actual->height != reference->height)
                throw std::runtime_error("Image size mismatch: " + name);
            if (auto a = std::dynamic_pointer_cast<IndexedSurface>(actual)) {
                auto b = std::dynamic_pointer_cast<IndexedSurface>(reference);
                if (!b || a->kamAJaK_field->values != b->kamAJaK_field->values ||
                    a->kaMajaK_field->values != b->kaMajaK_field->values ||
                    a->KAMajaK_field->values != b->KAMajaK_field->values ||
                    a->kAMajaK_field->values != b->kAMajaK_field->values) {
                    std::cerr << "Indexed image mismatch: " << name << "\n";
                    ++assetFailures;
                }
            } else {
                auto rgb = std::dynamic_pointer_cast<RgbSurface>(actual),
                     b = std::dynamic_pointer_cast<RgbSurface>(reference);
                for (int i = 0; i < rgb->AMAjakk_field->length; ++i)
                    for (int shift : {20, 10, 0}) {
                        int e = std::abs(((*rgb->AMAjakk_field)[i] >> shift & 255) -
                                         ((*b->AMAjakk_field)[i] >> shift & 255));
                        jpegError += e;
                        ++jpegChannels;
                        jpegMaximum = std::max(jpegMaximum, e);
                    }
            }
        }
        std::cout << "Original asset decoding: GIF failures=" << assetFailures
                  << "; JPEG maximum channel difference=" << jpegMaximum << ", mean=" << jpegError / jpegChannels
                  << "\n";
        const char *names[] = {"movieintro", "paa", "trav", "vehje", "evil", "linjanen"};
        auto presenter = make_ref<RgbSurfacePresenter>();
        ::godog::godog::KKAMAjA = presenter;
        presenter->akkaMaJ(context, 512, 256);
        ImageMathSupport::decoderOverride = [&](Ref<URL> url) {
            return load_reference(fixtures + "/images/" + url->path.text.substr(url->path.text.find_last_of('/') + 1) +
                                  ".bin");
        };
        std::vector<Ref<Scene>> scenes = {make_ref<MovieIntroScene>(), make_ref<PaaScene>(),
                                          make_ref<TravScene>(),       make_ref<VehjeScene>(),
                                          make_ref<EvilScene>(),       make_ref<LinjanenScene>()};
        const float times[] = {0, .02f, .04f, .5f, 1, 5, 9.98f, 10, 10.02f, 19.98f, 20, 20.02f};
        size_t failures = assetFailures;
        if (jpegMaximum > 10 || jpegError / jpegChannels > .03) {
            std::cerr << "JPEG decoder error exceeds the recorded tolerance\n";
            ++failures;
        }
        for (size_t s = 0; s < scenes.size(); ++s) {
            auto scene = scenes[s];
            java_random().setSeed(888);
            scene->load(context);
            java_random().setSeed(888);
            scene->enter();
            for (int i = 0; i < 12; ++i) {
                java_random().setSeed(888 + int(times[i]));
                scene->render(presenter->kamAJAk, times[i], .02f);
                std::ifstream f(fixtures + "/" + names[s] + "-" + std::to_string(i) + ".bin", std::ios::binary);
                size_t different = 0;
                for (int p : presenter->kamAJAk->AMAjakk_field->values)
                    if (uint32_t(p) != u32(f))
                        ++different;
                std::cout << names[s] << " t=" << times[i] << " differing packed pixels=" << different << "\n";
                if (different)
                    ++failures;
            }
        }
        auto target = make_ref<RgbSurface>(512, 256, 1, false);
        auto lines = make_ref<LineRasterizer>(target, 512, 256);
        std::ifstream f(fixtures + "/lines.bin", std::ios::binary);
        for (int mode = 0; mode < 3; ++mode)
            for (int i = 0; i < 160; ++i) {
                float x = f32(f), y = f32(f), x2 = f32(f), y2 = f32(f);
                uint64_t expected = uint64_t(u32(f)) << 32;
                expected |= u32(f);
                std::fill(target->AMAjakk_field->values.begin(), target->AMAjakk_field->values.end(), 0);
                if (mode == 0)
                    lines->KamAjak(x, y, x2, y2, 64, 32, 5);
                else if (mode == 1)
                    lines->kamAjak(x, y, x2, y2, 64, 32, 5);
                else
                    lines->KamaJAk(x, y, x2, y2, 64, 32, 5);
                uint64_t hash = UINT64_C(0xcbf29ce484222325);
                for (int p : target->AMAjakk_field->values) {
                    hash ^= uint32_t(p);
                    hash *= UINT64_C(0x100000001b3);
                }
                if (hash != expected) {
                    std::cerr << "Line mismatch " << mode << " " << i << "\n";
                    ++failures;
                }
            }
        std::cout << "Compared 72 packed scene frames and 480 line cases; failures=" << failures << "\n";
        return failures ? 1 : 0;
    } catch (const std::exception &e) {
        std::cerr << e.what() << '\n';
        return 1;
    }
}
