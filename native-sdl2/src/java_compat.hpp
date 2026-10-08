#pragma once
#include <algorithm>
#include <cmath>
#include <cstdint>
#include <cstring>
#include <initializer_list>
#include <iostream>
#include <limits>
#include <memory>
#include <sstream>
#include <stdexcept>
#include <string>
#include <type_traits>
#include <vector>
#include <map>
#include <fstream>
#include <cctype>

namespace godog {
    template <class T> using Ref = std::shared_ptr<T>;
    struct Object : std::enable_shared_from_this<Object> {
        virtual ~Object() {}
        virtual void releaseReferences() {}
        template <class T> Ref<T> self() {
            try {
                return std::static_pointer_cast<T>(shared_from_this());
            } catch (const std::bad_weak_ptr &) {
                return Ref<T>(static_cast<T *>(this), [](T *) {});
            }
        }
    };
    // Java object graphs contain back references. Keep weak allocation records so a
    // complete demo session can release those graphs without changing artistic fields.
    struct NativeHeap {
        std::vector<std::weak_ptr<Object>> records;
        static NativeHeap *&active() {
            static NativeHeap *heap = nullptr;
            return heap;
        }
        void begin() {
            if (active())
                throw std::logic_error("Only one native demo session can own the Java globals");
            active() = this;
        }
        void prune() {
            records.erase(std::remove_if(records.begin(), records.end(),
                                         [](const std::weak_ptr<Object> &p) { return p.expired(); }),
                          records.end());
        }
        void release() {
            if (active() != this)
                return;
            active() = nullptr;
            std::vector<Ref<Object>> live;
            for (auto &p : records)
                if (auto o = p.lock())
                    live.push_back(o);
            for (auto &o : live)
                o->releaseReferences();
            records.clear();
        }
        ~NativeHeap() { release(); }
    };
    template <class T, class... Args> Ref<T> make_ref(Args &&...args) {
        auto out = std::make_shared<T>(std::forward<Args>(args)...);
        if (NativeHeap::active())
            NativeHeap::active()->records.push_back(out);
        return out;
    }
    template <class T> struct JArray : Object {
        std::int32_t length;
        std::vector<T> values;
        void releaseReferences() override { values.clear(); }
        explicit JArray(std::int32_t n)
            : length(n),
              values(n < 0 ? throw std::length_error("Negative Java array size") : static_cast<std::size_t>(n)) {}
        explicit JArray(std::initializer_list<T> v) : length(static_cast<std::int32_t>(v.size())), values(v) {}
        typename std::vector<T>::reference operator[](std::int32_t i) { return values.at(static_cast<std::size_t>(i)); }
        const typename std::vector<T>::reference operator[](std::int32_t i) const {
            return values.at(static_cast<std::size_t>(i));
        }
    };
    template <class T> using Array = Ref<JArray<T>>;
    template <class T> Array<T> make_array(std::int32_t n) { return make_ref<JArray<T>>(n); }
    template <class T> Array<T> make_array(std::initializer_list<T> n) { return make_ref<JArray<T>>(n); }
    template <class T> Array<Array<T>> make_array2(int32_t n, int32_t m) {
        auto a = make_array<Array<T>>(n);
        for (int32_t i = 0; i < n; ++i)
            (*a)[i] = make_array<T>(m);
        return a;
    }
    template <class T> Array<Array<Array<T>>> make_array3(int32_t n, int32_t m, int32_t k) {
        auto a = make_array<Array<Array<T>>>(n);
        for (int32_t i = 0; i < n; ++i)
            (*a)[i] = make_array2<T>(m, k);
        return a;
    }
    template <class T> void arraycopy(Array<T> from, std::int32_t a, Array<T> to, std::int32_t b, std::int32_t count) {
        if (!from || !to || a < 0 || b < 0 || count < 0 || std::int64_t(a) + count > from->length ||
            std::int64_t(b) + count > to->length)
            throw std::out_of_range("Java arraycopy");
        if (from == to && b > a)
            for (std::int32_t i = count; i > 0; --i)
                (*to)[b + i - 1] = (*from)[a + i - 1];
        else
            for (std::int32_t i = 0; i < count; ++i)
                (*to)[b + i] = (*from)[a + i];
    }
    template <class T> void arraycopy(Ref<Object> from, int32_t a, Array<T> to, int32_t b, int32_t n) {
        arraycopy(std::dynamic_pointer_cast<JArray<T>>(from), a, to, b, n);
    }
    inline std::int32_t signed32(std::uint32_t n) {
        std::int32_t out;
        std::memcpy(&out, &n, 4);
        return out;
    }
    inline std::int64_t signed64(std::uint64_t n) {
        std::int64_t out;
        std::memcpy(&out, &n, 8);
        return out;
    }
    template <class T> typename std::enable_if<std::is_integral<T>::value, std::int32_t>::type jint(T n) {
        return signed32(static_cast<std::uint32_t>(n));
    }
    template <class T> typename std::enable_if<std::is_floating_point<T>::value, std::int32_t>::type jint(T n) {
        if (std::isnan(n))
            return 0;
        if (n >= 2147483647.0)
            return INT32_MAX;
        if (n <= -2147483648.0)
            return INT32_MIN;
        return static_cast<std::int32_t>(n);
    }
    template <class T> typename std::enable_if<std::is_integral<T>::value, std::int64_t>::type jlong(T n) {
        return static_cast<std::int64_t>(n);
    }
    template <class T> typename std::enable_if<std::is_floating_point<T>::value, std::int64_t>::type jlong(T n) {
        if (std::isnan(n))
            return 0;
        if (n >= 9223372036854775808.0)
            return INT64_MAX;
        if (n <= -9223372036854775808.0)
            return INT64_MIN;
        return static_cast<std::int64_t>(n);
    }
    template <class T> std::int8_t jbyte(T n) {
        std::uint8_t u = static_cast<std::uint8_t>(jint(n));
        std::int8_t s;
        std::memcpy(&s, &u, 1);
        return s;
    }
    template <class T> std::int16_t jshort(T n) {
        std::uint16_t u = static_cast<std::uint16_t>(jint(n));
        std::int16_t s;
        std::memcpy(&s, &u, 2);
        return s;
    }
    inline std::int32_t jadd(std::int32_t a, std::int32_t b) { return signed32(std::uint32_t(a) + std::uint32_t(b)); }
    inline std::int32_t jsub(std::int32_t a, std::int32_t b) { return signed32(std::uint32_t(a) - std::uint32_t(b)); }
    inline std::int32_t jmul(std::int32_t a, std::int32_t b) { return signed32(std::uint32_t(a) * std::uint32_t(b)); }
    inline std::int64_t jadd(std::int64_t a, std::int64_t b) { return signed64(std::uint64_t(a) + std::uint64_t(b)); }
    inline std::int64_t jsub(std::int64_t a, std::int64_t b) { return signed64(std::uint64_t(a) - std::uint64_t(b)); }
    inline std::int64_t jmul(std::int64_t a, std::int64_t b) { return signed64(std::uint64_t(a) * std::uint64_t(b)); }
    inline std::int32_t jneg(std::int32_t a) { return jsub(0, a); }
    inline std::int64_t jneg(std::int64_t a) { return jsub(std::int64_t(0), a); }
    inline std::int32_t jdiv(std::int32_t a, std::int32_t b) {
        if (!b)
            throw std::domain_error("Java division by zero");
        return a == INT32_MIN && b == -1 ? a : a / b;
    }
    inline std::int32_t jrem(std::int32_t a, std::int32_t b) {
        if (!b)
            throw std::domain_error("Java division by zero");
        return a == INT32_MIN && b == -1 ? 0 : a % b;
    }
    inline std::int64_t jdiv(std::int64_t a, std::int64_t b) {
        if (!b)
            throw std::domain_error("Java division by zero");
        return a == INT64_MIN && b == -1 ? a : a / b;
    }
    inline std::int64_t jrem(std::int64_t a, std::int64_t b) {
        if (!b)
            throw std::domain_error("Java division by zero");
        return a == INT64_MIN && b == -1 ? 0 : a % b;
    }
    inline std::int64_t jshl(std::int64_t a, std::int64_t b) {
        return signed64(std::uint64_t(a) << (std::uint64_t(b) & 63));
    }
    inline std::int64_t jushr(std::int64_t a, std::int64_t b) {
        return signed64(std::uint64_t(a) >> (std::uint64_t(b) & 63));
    }
    inline std::int64_t jshr(std::int64_t a, std::int64_t b) {
        unsigned n = std::uint64_t(b) & 63;
        if (!n)
            return a;
        std::uint64_t x = std::uint64_t(a) >> n;
        if (a < 0)
            x |= (~std::uint64_t(0)) << (64 - n);
        return signed64(x);
    }
    inline std::int32_t jshl(std::int32_t a, std::int32_t b) {
        return signed32(std::uint32_t(a) << (std::uint32_t(b) & 31));
    }
    inline std::int32_t jushr(std::int32_t a, std::int32_t b) {
        return signed32(std::uint32_t(a) >> (std::uint32_t(b) & 31));
    }
    inline std::int32_t jshr(std::int32_t a, std::int32_t b) {
        unsigned n = std::uint32_t(b) & 31;
        if (!n)
            return a;
        std::uint32_t x = std::uint32_t(a) >> n;
        if (a < 0)
            x |= (~std::uint32_t(0)) << (32 - n);
        return signed32(x);
    }
    inline float jadd(float a, float b) { return a + b; }
    inline double jadd(double a, double b) { return a + b; }
    inline float jsub(float a, float b) { return a - b; }
    inline double jsub(double a, double b) { return a - b; }
    template <class T> T &jpreinc(T &a) {
        a = jadd(a, T(1));
        return a;
    }
    template <class T> T jpostinc(T &a) {
        T old = a;
        jpreinc(a);
        return old;
    }
    template <class T> T &jpredec(T &a) {
        a = jsub(a, T(1));
        return a;
    }
    template <class T> T jpostdec(T &a) {
        T old = a;
        jpredec(a);
        return old;
    }
    template <class T> T jmin(T a, T b) { return std::min(a, b); }
    template <class T> T jmax(T a, T b) { return std::max(a, b); }
    inline float jmin(float a, float b) {
        if (std::isnan(a) || std::isnan(b))
            return a + b;
        if (a == 0 && b == 0)
            return std::signbit(a) ? a : b;
        return a < b ? a : b;
    }
    inline float jmax(float a, float b) {
        if (std::isnan(a) || std::isnan(b))
            return a + b;
        if (a == 0 && b == 0)
            return std::signbit(a) ? b : a;
        return a > b ? a : b;
    }
    inline double jmin(double a, double b) {
        if (std::isnan(a) || std::isnan(b))
            return a + b;
        if (a == 0 && b == 0)
            return std::signbit(a) ? a : b;
        return a < b ? a : b;
    }
    inline double jmax(double a, double b) {
        if (std::isnan(a) || std::isnan(b))
            return a + b;
        if (a == 0 && b == 0)
            return std::signbit(a) ? b : a;
        return a > b ? a : b;
    }
    inline std::int32_t jabs(std::int32_t a) { return a < 0 ? jneg(a) : a; }
    inline float jabs(float a) { return std::fabs(a); }
    inline double jabs(double a) { return std::fabs(a); }
    struct StringObject : Object {
        std::string text;
        explicit StringObject(std::string s) : text(s) {}
    };
    struct String {
        std::string text;
        bool null;
        String() : null(true) {}
        String(std::nullptr_t) : null(true) {}
        String(const char *s) : text(s), null(false) {}
        String(std::string s) : text(s), null(false) {}
        String(Array<int8_t> a, int hibyte, int start, int count) : null(false) {
            if (hibyte)
                throw std::invalid_argument("Non-ASCII Java string");
            for (int i = 0; i < count; ++i)
                text += char((*a)[start + i]);
        }
        String(Ref<Object> o) : null(!o) {
            if (o)
                text = std::dynamic_pointer_cast<StringObject>(o)->text;
        }
        operator Ref<Object>() const { return null ? nullptr : make_ref<StringObject>(text); }
        int32_t length() const { return jint(text.size()); }
        char charAt(int32_t i) const { return text.at(i); }
        String trim() const {
            size_t a = text.find_first_not_of(" \t\n\r"), b = text.find_last_not_of(" \t\n\r");
            return a == std::string::npos ? String("") : String(text.substr(a, b - a + 1));
        }
        String substring(int a) const { return String(text.substr(a)); }
        String substring(int a, int b) const { return String(text.substr(a, b - a)); }
        bool startsWith(String a) const { return text.compare(0, a.text.size(), a.text) == 0; }
        bool endsWith(String a) const {
            return text.size() >= a.text.size() &&
                   text.compare(text.size() - a.text.size(), a.text.size(), a.text) == 0;
        }
        String toLowerCase() const {
            String s = *this;
            for (auto &c : s.text)
                c = char(std::tolower(static_cast<unsigned char>(c)));
            return s;
        }
        String replace(char a, char b) const {
            String s = *this;
            std::replace(s.text.begin(), s.text.end(), a, b);
            return s;
        }
        bool equals(String s) const { return null == s.null && text == s.text; }
        bool equalsIgnoreCase(String s) const {
            if (text.size() != s.text.size())
                return false;
            for (size_t i = 0; i < text.size(); ++i)
                if (std::tolower(text[i]) != std::tolower(s.text[i]))
                    return false;
            return true;
        }
        int32_t indexOf(int c) const {
            auto i = text.find(char(c));
            return i == std::string::npos ? -1 : jint(i);
        }
        bool operator==(std::nullptr_t) const { return null; }
        bool operator!=(std::nullptr_t) const { return !null; }
        String operator+(const String &rhs) const {
            return String((null ? "null" : text) + (rhs.null ? "null" : rhs.text));
        }
    };
    inline String jstr(String s) { return s.null ? String("null") : s; }
    struct Integer : Object {
        int32_t value;
        explicit Integer(int32_t v) : value(v) {}
        static int32_t parseInt(String s, int base = 10) {
            size_t used = 0;
            long long x = std::stoll(s.text, &used, base);
            if (used != s.text.size() || x < INT32_MIN || x > INT32_MAX)
                throw std::invalid_argument("Invalid Java integer");
            return int32_t(x);
        }
    };
    struct Float {
        static float valueOf(String s) { return std::stof(s.text); }
    };
    struct Double {
        static double valueOf(String s) { return std::stod(s.text); }
    };
    template <class T> String jstr(T n) {
        std::ostringstream s;
        s << n;
        return String(s.str());
    }
    inline void print_line(String s) { std::cout << s.text << '\n'; }
    struct StringBuffer : Object {
        String s;
        explicit StringBuffer(String text) : s(text) {}
        template <class T> Ref<StringBuffer> append(T n) {
            s = s + jstr(n);
            return self<StringBuffer>();
        }
        String toString() { return s; }
    };
    struct StringTokenizer : Object {
        std::vector<String> tokens;
        size_t cursor = 0;
        StringTokenizer(String s, String delimiters = String(" \t\n\r\f")) {
            size_t start = s.text.find_first_not_of(delimiters.text);
            while (start != std::string::npos) {
                size_t end = s.text.find_first_of(delimiters.text, start);
                tokens.push_back(s.text.substr(start, end - start));
                if (end == std::string::npos)
                    break;
                start = s.text.find_first_not_of(delimiters.text, end);
            }
        }
        bool hasMoreTokens() const { return cursor < tokens.size(); }
        String nextToken() { return tokens.at(cursor++); }
    };
    struct Enumeration : Object {
        std::vector<Ref<Object>> data;
        size_t cursor = 0;
        explicit Enumeration(std::vector<Ref<Object>> d) : data(d) {}
        bool hasMoreElements() { return cursor < data.size(); }
        Ref<Object> nextElement() { return data.at(cursor++); }
    };
    struct Vector : Object {
        std::vector<Ref<Object>> data;
        void releaseReferences() override { data.clear(); }
        explicit Vector(int n = 0) { data.reserve(n); }
        void addElement(Ref<Object> o) { data.push_back(o); }
        int32_t size() { return jint(data.size()); }
        Ref<Object> elementAt(int i) { return data.at(i); }
        Ref<Enumeration> elements() { return make_ref<Enumeration>(data); }
    };
    struct Hashtable : Object {
        std::vector<std::pair<Ref<Object>, Ref<Object>>> data;
        explicit Hashtable(int = 11) {}
        void releaseReferences() override { data.clear(); }
        void clear() { data.clear(); }
        void remove(Ref<Object> key) {
            for (auto i = data.begin(); i != data.end(); ++i)
                if (same(i->first, key)) {
                    data.erase(i);
                    return;
                }
        }
        Ref<Enumeration> keys() {
            std::vector<Ref<Object>> out;
            for (auto &p : data)
                out.push_back(p.first);
            return make_ref<Enumeration>(out);
        }
        static bool same(Ref<Object> a, Ref<Object> b) {
            auto sa = std::dynamic_pointer_cast<StringObject>(a), sb = std::dynamic_pointer_cast<StringObject>(b);
            if (sa && sb)
                return sa->text == sb->text;
            auto ia = std::dynamic_pointer_cast<Integer>(a), ib = std::dynamic_pointer_cast<Integer>(b);
            return ia && ib ? ia->value == ib->value : a == b;
        }
        Ref<Object> get(Ref<Object> key) {
            for (auto &p : data)
                if (same(p.first, key))
                    return p.second;
            return nullptr;
        }
        void put(Ref<Object> k, Ref<Object> v) {
            for (auto &p : data)
                if (same(p.first, k)) {
                    p.second = v;
                    return;
                }
            data.push_back(std::make_pair(k, v));
        }
        Ref<Enumeration> elements() {
            std::vector<Ref<Object>> out;
            for (auto &p : data)
                out.push_back(p.second);
            return make_ref<Enumeration>(out);
        }
    };
    struct InputStream : Object {
        std::vector<uint8_t> bytes;
        size_t cursor = 0;
        InputStream() {}
        explicit InputStream(std::string file) {
            std::ifstream f(file, std::ios::binary);
            if (!f)
                throw std::runtime_error("Cannot open " + file);
            bytes.assign(std::istreambuf_iterator<char>(f), {});
        }
        explicit InputStream(Ref<InputStream> s) {
            bytes.assign(s->bytes.begin() + s->cursor, s->bytes.end());
            s->cursor = s->bytes.size();
        }
        int32_t read(Array<int8_t> a) {
            if (cursor == bytes.size())
                return -1;
            int32_t n = std::min(a->length, jint(bytes.size() - cursor));
            for (int32_t i = 0; i < n; ++i)
                (*a)[i] = jbyte(bytes[cursor++]);
            return n;
        }
        int32_t read() { return cursor < bytes.size() ? bytes[cursor++] : -1; }
        int64_t skip(int64_t n) {
            auto count = std::min(uint64_t(std::max(int64_t(0), n)), uint64_t(bytes.size() - cursor));
            cursor += count;
            return count;
        }
        void close() {}
    };
    struct BufferedInputStream : InputStream {
        explicit BufferedInputStream(Ref<InputStream> s, int = 8192) : InputStream(s) {}
    };
    using FilterInputStream = InputStream;
    struct GZIPInputStream : InputStream {
        explicit GZIPInputStream(Ref<InputStream> s);
    };
    struct DataInputStream : InputStream {
        explicit DataInputStream(Ref<InputStream> s) : InputStream(s) {}
        String readLine() {
            if (cursor == bytes.size())
                return nullptr;
            std::string s;
            int c;
            while ((c = read()) >= 0 && c != 10 && c != 13)
                s += char(c);
            if (c == 13 && cursor < bytes.size() && bytes[cursor] == 10)
                ++cursor;
            return String(s);
        }
        void readFully(Array<int8_t> a) {
            for (int i = 0; i < a->length; i++) {
                int c = read();
                if (c < 0)
                    throw std::runtime_error("Unexpected end of asset");
                (*a)[i] = jbyte(c);
            }
        }
    };
    struct URL : Object {
        String path;
        explicit URL(String s) : path(s) {}
        String getFile() { return path; }
        Ref<InputStream> openStream() { return make_ref<InputStream>(path.text); }
        Ref<URL> openConnection() { return self<URL>(); }
        Ref<InputStream> getInputStream() { return openStream(); }
    };
    struct Point : Object {
        int32_t x = 0, y = 0;
        Point() {}
        Point(int32_t a, int32_t b) : x(a), y(b) {}
    };
    struct Graphics : Object {};
    struct Container : Object {};
    struct Font : Object {};
    class SoftwareImageSurface;
    struct ImageProducer;
    struct Image : Object {
        Ref<SoftwareImageSurface> surface;
        Ref<ImageProducer> getSource() { throw std::logic_error("No embedded bitmap tags in intro4.swz"); }
        void flush() {}
    };
    struct ColorModel : Object {
        static Ref<ColorModel> getRGBdefault() { return make_ref<ColorModel>(); }
        virtual int getRGB(int p) { return p; }
    };
    struct DirectColorModel : ColorModel {
        DirectColorModel(int, int, int, int) {}
    };
    struct IndexColorModel : ColorModel {
        Array<std::int8_t> red, green, blue;
        IndexColorModel(int, int, Array<std::int8_t> r, Array<std::int8_t> g, Array<std::int8_t> b)
            : red(r), green(g), blue(b) {}
        int getMapSize() { return red->length; }
        int getRGB(int p) {
            return signed32(0xff000000U | (uint32_t(uint8_t((*red)[p])) << 16) | (uint32_t(uint8_t((*green)[p])) << 8) |
                            uint8_t((*blue)[p]));
        }
        void getReds(Array<std::int8_t> a) { arraycopy(red, 0, a, 0, red->length); }
        void getGreens(Array<std::int8_t> a) { arraycopy(green, 0, a, 0, green->length); }
        void getBlues(Array<std::int8_t> a) { arraycopy(blue, 0, a, 0, blue->length); }
    };
    struct ImageConsumer : Object {
        virtual void setPixels(int, int, int, int, Ref<ColorModel>, Array<int32_t>, int, int) {}
        virtual void setPixels(int, int, int, int, Ref<ColorModel>, Array<int8_t>, int, int) {}
        virtual void imageComplete(int) {}
        virtual void setDimensions(int, int) {}
        virtual void setColorModel(Ref<ColorModel>) {}
        virtual void setHints(int) {}
        virtual void setProperties(Ref<Hashtable>) {}
    };
    struct ImageProducer : Object {
        virtual void startProduction(Ref<ImageConsumer>) = 0;
        virtual void removeConsumer(Ref<ImageConsumer>) = 0;
    };
    struct Rectangle : Object {
        std::int32_t x, y, width, height;
        Rectangle(int w, int h) : x(0), y(0), width(w), height(h) {}
        Rectangle(int a, int b, int c, int d) : x(a), y(b), width(c), height(d) {}
        bool isEmpty() const { return width <= 0 || height <= 0; }
        Ref<Rectangle> intersection(Ref<Rectangle> b) {
            int a = std::max(x, b->x), c = std::max(y, b->y);
            return make_ref<Rectangle>(a, c, std::min(x + width, b->x + b->width) - a,
                                       std::min(y + height, b->y + b->height) - c);
        }
    };
    struct Component : ImageConsumer {
        virtual Ref<Rectangle> bounds() { return make_ref<Rectangle>(512, 256); }
        virtual void repaint() {}
    };
    struct MovieSignal : Object {
        bool signalled;
        explicit MovieSignal(bool b) : signalled(b) {}
        void signal() { signalled = true; }
    };
    struct System {
        static int64_t &clock() {
            static int64_t t = 0;
            return t;
        }
        static int64_t currentTimeMillis() { return clock(); }
    };
    struct GodogDesktop {
        static void sceneStarted(String s) {
            std::cout << "scene=" << s.text << " at " << System::currentTimeMillis() / 1000.0 << " s\n";
        }
    };
    class DesktopDemoBase : public Object {
      public:
        String assetRoot;
        explicit DesktopDemoBase(String root = String("")) : assetRoot(root) {}
        Ref<URL> aMajAKK(String path) { return make_ref<URL>(assetRoot + String("/") + path); }
        Ref<Container> getParent() { return nullptr; }
        void repaint(int64_t) {}
    };
    struct MAD : Object {
        int32_t frequency = 22050, boost = 128;
        bool stereo = true;
        int64_t bufferStartTime = 0;
    };
    struct ScriptEventScheduler : Object {
        void schedulePosition(int32_t, int64_t) {
            throw std::logic_error("Native script events are dispatched from song positions");
        }
    };
    struct SongPositionQueue : Object {
        std::vector<std::pair<int32_t, int64_t>> positions;
        void publish(int32_t n, int64_t t) { positions.push_back(std::make_pair(n, t)); }
        int awaitAndSleepUntil(int) { throw std::logic_error("Native transport does not block"); }
        bool hasReached(int n, int offset) {
            const int64_t now = System::currentTimeMillis();
            while (!positions.empty() && positions.front().second <= now)
                positions.erase(positions.begin());
            for (size_t i = 0; i < positions.size(); ++i) {
                auto p = positions[i];
                if ((i == 0 && p.first > n) || (p.first >= n && p.second <= now + offset))
                    return true;
            }
            return false;
        }
        void dump() {}
    };
    class JavaRandom {
        std::uint64_t state;
        std::uint32_t next(unsigned bits) {
            state = (state * UINT64_C(0x5deece66d) + 11) & ((UINT64_C(1) << 48) - 1);
            return std::uint32_t(state >> (48 - bits));
        }

      public:
        explicit JavaRandom(std::uint64_t seed = 888) { setSeed(seed); }
        void setSeed(std::uint64_t seed) { state = (seed ^ UINT64_C(0x5deece66d)) & ((UINT64_C(1) << 48) - 1); }
        double nextDouble() {
            const auto a = next(26);
            const auto b = next(27);
            return (double(a) * 134217728.0 + b) / 9007199254740992.0;
        }
    };
    inline JavaRandom &java_random() {
        static JavaRandom random;
        return random;
    }
} // namespace godog
