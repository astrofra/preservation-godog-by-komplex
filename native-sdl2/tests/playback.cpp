#include "demo.hpp"
#include <iostream>
using namespace godog;
int main(int argc, char **argv) {
    try {
        if (argc != 2)
            throw std::invalid_argument("playback-test ASSETS");
        NativeDemo demo(argv[1], "");
        auto block = make_array<int32_t>(1024);
        const char *expected[] = {"movieintro", "paa", "trav", "vehje", "evil", "linjanen", "endscreen"};
        // Music-cue times checked against the working Java restoration, not derived
        // from the C++ implementation. Allow one mixer block plus one video frame.
        const double times[] = {0, 60, 94.28, 120, 128.57, 162.86, 188.57};
        std::string previous;
        size_t next = 0;
        for (int frame = 0; frame < 192 * 50; ++frame) {
            double t = frame / 50.0;
            System::clock() = int64_t(t * 1000);
            while (demo.mixedFrames / 22050.0 < t + .093)
                demo.mixBlock(block);
            demo.update(t);
            std::string id = demo.demo->kkaMAJA   ? demo.demo->kkaMAJA->getSceneId().text
                             : demo.demo->KKaMAJA ? demo.demo->KKaMAJA->getRoutineId().text
                                                  : "";
            if (!id.empty() && id != previous) {
                if (next >= 7 || id != expected[next] || std::abs(t - times[next]) > .1)
                    throw std::runtime_error("Unexpected scene or cue time: " + id + " at " + std::to_string(t));
                previous = id;
                ++next;
            }
        }
        if (next != 7)
            throw std::runtime_error("The complete sequence did not reach the end screen");
        std::cout << "PASS: all seven scene/routine cues within 100 ms of the Java reference.\n";
        return 0;
    } catch (const std::exception &e) {
        std::cerr << e.what() << '\n';
        return 1;
    }
}
