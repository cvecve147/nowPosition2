package p263h;

import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okio.Buffer;
import okio.BufferedSink;

/* renamed from: h.o */
final class C6648o {

    /* renamed from: a */
    private static final char[] f18372a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b */
    private final String f18373b;

    /* renamed from: c */
    private final HttpUrl f18374c;

    /* renamed from: d */
    private String f18375d;

    /* renamed from: e */
    private HttpUrl.Builder f18376e;

    /* renamed from: f */
    private final Request.Builder f18377f = new Request.Builder();

    /* renamed from: g */
    private MediaType f18378g;

    /* renamed from: h */
    private final boolean f18379h;

    /* renamed from: i */
    private MultipartBody.Builder f18380i;

    /* renamed from: j */
    private FormBody.Builder f18381j;

    /* renamed from: k */
    private RequestBody f18382k;

    /* renamed from: h.o$a */
    private static class C6649a extends RequestBody {

        /* renamed from: a */
        private final RequestBody f18383a;

        /* renamed from: b */
        private final MediaType f18384b;

        C6649a(RequestBody requestBody, MediaType mediaType) {
            this.f18383a = requestBody;
            this.f18384b = mediaType;
        }

        public long contentLength() {
            return this.f18383a.contentLength();
        }

        public MediaType contentType() {
            return this.f18384b;
        }

        public void writeTo(BufferedSink bufferedSink) {
            this.f18383a.writeTo(bufferedSink);
        }
    }

    C6648o(String str, HttpUrl httpUrl, String str2, Headers headers, MediaType mediaType, boolean z, boolean z2, boolean z3) {
        this.f18373b = str;
        this.f18374c = httpUrl;
        this.f18375d = str2;
        this.f18378g = mediaType;
        this.f18379h = z;
        if (headers != null) {
            this.f18377f.headers(headers);
        }
        if (z2) {
            this.f18381j = new FormBody.Builder();
        } else if (z3) {
            this.f18380i = new MultipartBody.Builder();
            this.f18380i.setType(MultipartBody.FORM);
        }
    }

    /* renamed from: a */
    private static String m25241a(String str, boolean z) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                Buffer buffer = new Buffer();
                buffer.writeUtf8(str, 0, i);
                m25242a(buffer, str, i, length, z);
                return buffer.readUtf8();
            }
            i += Character.charCount(codePointAt);
        }
        return str;
    }

    /* renamed from: a */
    private static void m25242a(Buffer buffer, String str, int i, int i2, boolean z) {
        Buffer buffer2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                    if (buffer2 == null) {
                        buffer2 = new Buffer();
                    }
                    buffer2.writeUtf8CodePoint(codePointAt);
                    while (!buffer2.exhausted()) {
                        byte readByte = buffer2.readByte() & 255;
                        buffer.writeByte(37);
                        buffer.writeByte((int) f18372a[(readByte >> 4) & 15]);
                        buffer.writeByte((int) f18372a[readByte & 15]);
                    }
                } else {
                    buffer.writeUtf8CodePoint(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Request mo17040a() {
        HttpUrl httpUrl;
        HttpUrl.Builder builder = this.f18376e;
        if (builder != null) {
            httpUrl = builder.build();
        } else {
            httpUrl = this.f18374c.resolve(this.f18375d);
            if (httpUrl == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f18374c + ", Relative: " + this.f18375d);
            }
        }
        C6649a aVar = this.f18382k;
        if (aVar == null) {
            FormBody.Builder builder2 = this.f18381j;
            if (builder2 != null) {
                aVar = builder2.build();
            } else {
                MultipartBody.Builder builder3 = this.f18380i;
                if (builder3 != null) {
                    aVar = builder3.build();
                } else if (this.f18379h) {
                    aVar = RequestBody.create((MediaType) null, new byte[0]);
                }
            }
        }
        MediaType mediaType = this.f18378g;
        if (mediaType != null) {
            if (aVar != null) {
                aVar = new C6649a(aVar, mediaType);
            } else {
                this.f18377f.addHeader("Content-Type", mediaType.toString());
            }
        }
        return this.f18377f.url(httpUrl).method(this.f18373b, aVar).build();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo17041a(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            MediaType parse = MediaType.parse(str2);
            if (parse != null) {
                this.f18378g = parse;
                return;
            }
            throw new IllegalArgumentException("Malformed content type: " + str2);
        }
        this.f18377f.addHeader(str, str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo17042a(String str, String str2, boolean z) {
        if (z) {
            this.f18381j.addEncoded(str, str2);
        } else {
            this.f18381j.add(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo17043a(Headers headers, RequestBody requestBody) {
        this.f18380i.addPart(headers, requestBody);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo17044a(MultipartBody.Part part) {
        this.f18380i.addPart(part);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo17045a(RequestBody requestBody) {
        this.f18382k = requestBody;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo17046b(String str, String str2, boolean z) {
        String str3 = this.f18375d;
        if (str3 != null) {
            this.f18375d = str3.replace("{" + str + "}", m25241a(str2, z));
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo17047c(String str, String str2, boolean z) {
        String str3 = this.f18375d;
        if (str3 != null) {
            this.f18376e = this.f18374c.newBuilder(str3);
            if (this.f18376e != null) {
                this.f18375d = null;
            } else {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f18374c + ", Relative: " + this.f18375d);
            }
        }
        if (z) {
            this.f18376e.addEncodedQueryParameter(str, str2);
        } else {
            this.f18376e.addQueryParameter(str, str2);
        }
    }
}
