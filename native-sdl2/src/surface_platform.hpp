#pragma once
#include <functional>
namespace godog {
    void releaseMovieSessions();
    class ImageMathSupport {
      public:
        static std::function<Ref<SoftwareImageSurface>(Ref<URL>)> decoderOverride;
        static Ref<SoftwareImageSurface> MAjaKkA(Ref<URL> url);
    };
    class IndexedSurfacePresenter : public Object {
      public:
        void akKaMaJ() { throw std::logic_error("clear8 is not used by Godog's script"); }
    };
    class MoviePlayer : public Object {
      public:
        bool aMAjaKk = false, AMAJaKk_field = false;
        Ref<Component> AmajaKk = make_ref<Component>();
        bool aMAJaKk(bool, int, int, int, int) { return false; }
    };
    class MovieAudioClip : public Object {
      public:
        Ref<MovieAudioClip> akkamAJ;
        int32_t AKkamAJ = 0;
        MovieAudioClip(int, int, Array<int8_t>, int, Ref<MoviePlayer>) {}
        void stop() {}
        bool kKamaja() { throw std::logic_error("Unexpected audio tag in the preserved silent SWF"); }
        int Kkamaja() { throw std::logic_error("Unexpected audio tag in the preserved silent SWF"); }
        void kkAmAJa(int) { throw std::logic_error("Unexpected SWF audio playback"); }
        void KKAmAJa(int) { throw std::logic_error("Unexpected SWF audio playback"); }
        void kkamaja(Ref<MovieAudioClip>, Ref<MovieTimeline>) {
            throw std::logic_error("Unexpected SWF audio playback");
        }
        void kKAMaja(Ref<MovieTimeline>) { throw std::logic_error("Unexpected SWF audio playback"); }
    };
} // namespace godog
