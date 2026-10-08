#include "engine/core.hpp"
#include "surface_platform.hpp"
#include "assets/original_asset_loader.hpp"
#include <zlib.h>
namespace godog {

    std::function<Ref<SoftwareImageSurface>(Ref<URL>)> ImageMathSupport::decoderOverride;
    GZIPInputStream::GZIPInputStream(Ref<InputStream> s) {
        z_stream z{};
        z.next_in = s->bytes.data() + s->cursor;
        z.avail_in = static_cast<uInt>(s->bytes.size() - s->cursor);
        if (inflateInit2(&z, 15 + 16) != Z_OK)
            throw std::runtime_error("gzip initialization failed");
        int status = Z_OK;
        do {
            uint8_t buffer[32768];
            z.next_out = buffer;
            z.avail_out = sizeof(buffer);
            status = inflate(&z, Z_NO_FLUSH);
            bytes.insert(bytes.end(), buffer, buffer + sizeof(buffer) - z.avail_out);
        } while (status == Z_OK);
        s->cursor += z.total_in;
        inflateEnd(&z);
        if (status != Z_STREAM_END)
            throw std::runtime_error("Invalid gzip asset");
    }
    Ref<SoftwareImageSurface> ImageMathSupport::MAjaKkA(Ref<URL> url) {
        if (decoderOverride)
            return decoderOverride(url);
        const auto path = url->path.text;
        std::string error;
        if (url->path.endsWith(String(".gif"))) {
            godog_assets::IndexedAsset a;
            if (!godog_assets::load_original_gif_indexed(path, &a, &error))
                throw std::runtime_error(error);
            auto pixels = make_array<int8_t>(a.width * a.height), r = make_array<int8_t>(256),
                 g = make_array<int8_t>(256), b = make_array<int8_t>(256);
            for (int i = 0; i < pixels->length; ++i)
                (*pixels)[i] = jbyte(a.pixels[i]);
            for (int i = 0; i < 256; ++i) {
                (*r)[i] = jbyte(a.palette_red[i]);
                (*g)[i] = jbyte(a.palette_green[i]);
                (*b)[i] = jbyte(a.palette_blue[i]);
            }
            return make_ref<IndexedSurface>(a.width, a.height, pixels, r, g, b);
        }
        godog_assets::PackedRgbAsset a;
        if (!godog_assets::load_original_jpeg_packed_rgb(path, &a, &error))
            throw std::runtime_error(error);
        auto surface = make_ref<RgbSurface>(a.width, a.height, 1, false);
        for (int i = 0; i < surface->AMAjakk_field->length; ++i)
            (*surface->AMAjakk_field)[i] = jint(a.packed_pixels[i]);
        return surface;
    }
    Ref<ModuleSong> ModuleLoader::kKAmAjA(Array<int8_t> bytes) {
        if (kkAmAjA(bytes))
            return KKAmAjA(bytes);
        if (KkamAjA(bytes))
            return kkamAjA(bytes);
        throw std::runtime_error("Only original MOD/XM assets are supported; legacy ZipHoax is unavailable");
    }
    void RgbSurfacePresenter::AkKaMaJ(Ref<DesktopDemoBase>) {
        kamAJAk = make_ref<RgbSurface>(jAkkamA, JaKKamA, 2, true);
        KAmAJAk = make_ref<TexturedTriangleRasterizer>(kamAJAk);
        kAmAJAk = make_ref<LineRasterizer>(kamAJAk, jAkkamA, JaKKamA);
    }
    void RgbSurfacePresenter::AKKaMaJ(Ref<Graphics>, int32_t, int32_t) {
        throw std::logic_error("AWT drawing is replaced by the SDL presenter");
    }
    void RgbSurfacePresenter::aKkaMaJ(Ref<Graphics>, int32_t, int32_t) {
        throw std::logic_error("AWT drawing is replaced by the SDL presenter");
    }
    void SurfacePresenter::aKKaMaJ(Ref<Graphics>, int32_t, int32_t) {} // The host uploads kamAJAk after this call.
    void MetaballMesh::KKAMaJa(Ref<Graphics>) { throw std::logic_error("Unused AWT debug view is not ported"); }
} // namespace godog

namespace godog {
    void MovieTimeline::AmAjAkK(Ref<InputStream> stream) {
        maJAkKa();
        maJAkKa_field = stream;
        run();
    }
    void MovieTimeline::AmajAkK(int32_t, int32_t) {
        throw std::logic_error("Unexpected embedded bitmap tag in intro4.swz");
    }
    int32_t MovieTimeline::aMAjakK() { return 1; }
    void MovieBitmap::AMaJaKK() { throw std::logic_error("Unexpected AWT bitmap loading in intro4.swz"); }
    // The original movie player was an AWT component with two worker threads. Loading
    // and explicit frame selection are synchronous here, so the SDL/browser caller
    // owns scheduling. Rasterization and timeline decoding remain translated methods.
    static std::map<MovieSurfaceBridge *, Ref<MovieTimeline>> movie_timelines;
    void releaseMovieSessions() { movie_timelines.clear(); }
    MovieSurfaceBridge::MovieSurfaceBridge(Ref<RgbSurface> surface, Ref<InputStream> stream) {
        MaJakka = surface;
        MAjAKka = make_ref<MoviePlayer>();
        auto raster = make_ref<MovieRasterizer>(MAjAKka);
        auto timeline = make_ref<MovieTimeline>(MAjAKka, raster);
        timeline->AmAjAkK(stream);
        raster->jAkkamA(surface->width, surface->height, ColorModel::getRGBdefault());
        raster->JAkkAMA(timeline->MaJAkka, true, 0, false);
        maJakka = raster;
        raster->startProduction(self<MovieSurfaceBridge>());
        raster->JaKKAMA(timeline, 0);
        raster->JAkKamA();
        movie_timelines[this] = timeline;
    }
    void MovieSurfaceBridge::majakKa(int32_t n) {
        auto timeline = movie_timelines.at(this);
        auto raster = std::dynamic_pointer_cast<MovieRasterizer>(maJakka);
        if (n != timeline->maJaKKa) {
            raster->jaKKAMA(timeline, n);
            raster->JAkKamA();
        }
    }
    int32_t MovieSurfaceBridge::MajakKa() { return movie_timelines.at(this)->mAJAkka; }
} // namespace godog
namespace godog {
    void godog::kamAJAk(Ref<ModuleSong> song, int32_t boost) {
        KkamAjA->boost = boost;
        KkAMAjA = song;
        song->JakkAMa(kkamAjA);
        kkAMAjA = true;
    }
    void godog::kamajAk() { throw std::logic_error("The obsolete AWT speed probe is not available"); }
    void EndscreenRoutine::load(Ref<DesktopDemoBase> context) {
        AkkAmAj = context;
        akkAmAj = make_ref<Image>();
        akkAmAj->surface = ImageMathSupport::MAjaKkA(context->aMajAKK(String("images/endscreen.gif")));
    }
    void EndscreenRoutine::render(Ref<Graphics>, float, float) {
        auto src = std::dynamic_pointer_cast<IndexedSurface>(akkAmAj->surface);
        auto dest = godog::kKAMAjA;
        for (int y = 0; y < std::min(src->height, dest->height); ++y)
            for (int x = 0; x < std::min(src->width, dest->width); ++x) {
                int p = uint8_t((*src->kamAJaK_field)[y * src->width + x]);
                (*dest->AMAjakk_field)[y * dest->width + x] =
                    int(uint32_t(uint8_t((*src->kaMajaK_field)[p])) << 20 |
                        uint32_t(uint8_t((*src->KAMajaK_field)[p])) << 10 | uint8_t((*src->kAMajaK_field)[p]));
            }
    }
} // namespace godog
