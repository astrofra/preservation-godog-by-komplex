#pragma once
#include "engine/core.hpp"
#include "surface_platform.hpp"
namespace godog {
    // One update and one audio block at a time: no platform loop inside the artwork.
    class NativeDemo {
      public:
        NativeHeap heap;
        Ref<godog> demo;
        Ref<Scene> isolatedScene;
        Ref<RgbSurfacePresenter> presenter;
        Ref<MAD> device;
        Ref<MixerBus> mixer;
        uint64_t mixedFrames = 0;
        float previous = 0;
        NativeDemo(const std::string &assets, const std::string &scene);
        ~NativeDemo();
        void update(double seconds);
        void mixBlock(Array<int32_t> block);
        Ref<RgbSurface> surface() const { return presenter->kamAJAk; }
    };
    std::vector<uint32_t> displayPixels(Ref<RgbSurface> surface);
    void capturePpm(const std::string &path, Ref<RgbSurface> surface);
} // namespace godog
