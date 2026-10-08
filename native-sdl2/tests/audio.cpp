#include "engine/core.hpp"
#include <fstream>
using namespace godog;
int main(int argc, char **argv) {
    try {
        if (argc != 3)
            throw std::runtime_error("audio-test XM EXPECTED_PCM");
        initialize_engine();
        std::ifstream xm(argv[1], std::ios::binary);
        std::vector<char> raw((std::istreambuf_iterator<char>(xm)), {});
        auto data = make_array<int8_t>(int32_t(raw.size()));
        for (size_t i = 0; i < raw.size(); ++i)
            (*data)[int32_t(i)] = jbyte(raw[i]);
        auto song = ModuleLoader::kKAmAjA(data);
        auto mixer = make_ref<MixerBus>();
        song->JakkAMa(mixer);
        auto device = make_ref<MAD>();
        auto block = make_array<int32_t>(1024);
        std::ifstream expected(argv[2], std::ios::binary);
        if (!expected)
            throw std::runtime_error("Missing PCM fixture");
        for (int b = 0; b < 4092; b++) {
            device->bufferStartTime = INT64_C(4000000000000) + b * INT64_C(1024000) / 22050;
            std::fill(block->values.begin(), block->values.end(), 0);
            mixer->mix(device, block, 0, 1024);
            for (int i = 0; i < 1024; i++) {
                uint8_t p[4];
                if (!expected.read(reinterpret_cast<char *>(p), 4))
                    throw std::runtime_error("Truncated PCM fixture");
                uint32_t v = uint32_t(p[0]) | uint32_t(p[1]) << 8 | uint32_t(p[2]) << 16 | uint32_t(p[3]) << 24;
                if (v != uint32_t((*block)[i])) {
                    std::cerr << "Audio mismatch block=" << b << " frame=" << i << " java=" << v
                              << " cpp=" << uint32_t((*block)[i]) << '\n';
                    return 1;
                }
            }
        }
        std::cout << "PASS: 4092 stereo XM blocks / 190 seconds match Java bit for bit.\n";
        return 0;
    } catch (const std::exception &e) {
        std::cerr << e.what() << '\n';
        return 1;
    }
}
