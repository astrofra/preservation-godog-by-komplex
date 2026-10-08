#include "demo.hpp"
#include <iostream>
using namespace godog;
static void require(bool ok, const char *label) {
    if (!ok)
        throw std::runtime_error(label);
}
int main(int argc, char **argv) {
    try {
        require(jadd(INT32_MAX, 1) == INT32_MIN, "32-bit addition wrap");
        require(jmul(INT32_MAX, 2) == -2, "32-bit multiplication wrap");
        require(jdiv(INT32_MIN, -1) == INT32_MIN && jrem(INT32_MIN, -1) == 0, "division overflow");
        require(jadd(int64_t(INT64_MAX), int64_t(1)) == INT64_MIN, "64-bit addition wrap");
        require(jshl(int32_t(1), 32) == 1 && jshl(int32_t(1), -1) == INT32_MIN, "32-bit shift masking");
        require(jshl(int64_t(1), int64_t(64)) == 1 && jshr(int64_t(-1), int64_t(17)) == -1, "64-bit shifts");
        require(jushr(-1, 1) == INT32_MAX && jshr(INT32_MIN, 31) == -1, "right shifts");
        require(jint(std::numeric_limits<double>::quiet_NaN()) == 0, "NaN narrowing");
        require(jint(std::numeric_limits<double>::infinity()) == INT32_MAX, "infinite narrowing");
        require(jint(jlong(4294967296.0)) == 0 && jint(jlong(3221225472.0)) == -1073741824,
                "original two-stage UV conversion");
        require(jbyte(255) == -1 && jshort(65535) == -1, "narrowing wrap");
        require(std::signbit(jmin(0.0f, -0.0f)) && !std::signbit(jmax(-0.0f, 0.0f)), "signed zero min/max");
        auto a = make_array<int32_t>({1, 2, 3, 4});
        auto alias = a;
        arraycopy(a, 0, alias, 1, 3);
        require(a->values == std::vector<int32_t>({1, 1, 2, 3}), "overlapping aliased arraycopy");
        bool zero = false;
        try {
            jdiv(1, 0);
        } catch (const std::domain_error &) {
            zero = true;
        }
        require(zero, "zero division error");
        require(argc == 2, "semantics-test ASSETS");
        for (const char *scene : {"movieintro", "paa", "trav", "vehje", "evil", "linjanen"}) {
            std::weak_ptr<::godog::godog> session;
            {
                NativeDemo demo(argv[1], scene);
                session = demo.demo;
                demo.update(0);
                demo.update(.5);
                demo.update(1);
            }
            require(session.expired() && !NativeHeap::active(), "native session graph release");
        }
        std::cout << "PASS: Java numeric/array semantics and six scene create-render-destroy cycles.\n";
        return 0;
    } catch (const std::exception &e) {
        std::cerr << e.what() << '\n';
        return 1;
    }
}
