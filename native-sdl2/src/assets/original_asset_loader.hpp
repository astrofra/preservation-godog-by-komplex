#ifndef FORWARD_OFFLINE_ASSETS_ORIGINAL_ASSET_LOADER_H
#define FORWARD_OFFLINE_ASSETS_ORIGINAL_ASSET_LOADER_H

#include <cstdint>
#include <string>
#include <vector>

namespace godog_assets {
    struct PackedRgbAsset {
        int width, height;
        std::vector<std::uint32_t> packed_pixels;
    };
    struct IndexedAsset {
        int width, height;
        std::vector<std::uint8_t> palette_red, palette_green, palette_blue, pixels;
    };
} // namespace godog_assets

namespace godog_assets {

    std::uint32_t unpack_original_packed_rgb(std::uint32_t packed);
    void convert_original_packed_rgb_asset(PackedRgbAsset *asset);

    bool load_original_jpeg_packed_rgb(const std::string &path, PackedRgbAsset *asset, std::string *error_message);

    bool load_original_gif_palette(const std::string &path, std::vector<std::uint8_t> *palette_red,
                                   std::vector<std::uint8_t> *palette_green, std::vector<std::uint8_t> *palette_blue,
                                   std::string *error_message);

    bool load_original_gif_indexed(const std::string &path, IndexedAsset *asset, std::string *error_message);

} // namespace godog_assets

#endif // FORWARD_OFFLINE_ASSETS_ORIGINAL_ASSET_LOADER_H
