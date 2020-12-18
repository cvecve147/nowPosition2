package okhttp3.logging;

import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.concurrent.TimeUnit;
import okhttp3.Connection;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.platform.Platform;
import okio.Buffer;
import okio.BufferedSource;
import org.apache.http.message.TokenParser;
import org.apache.http.protocol.HTTP;

public final class HttpLoggingInterceptor implements Interceptor {
    private static final Charset UTF8 = Charset.forName(HTTP.UTF_8);
    private volatile Level level;
    private final Logger logger;

    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    public interface Logger {
        public static final Logger DEFAULT = new Logger() {
            public void log(String str) {
                Platform.get().log(4, str, (Throwable) null);
            }
        };

        void log(String str);
    }

    public HttpLoggingInterceptor() {
        this(Logger.DEFAULT);
    }

    public HttpLoggingInterceptor(Logger logger2) {
        this.level = Level.NONE;
        this.logger = logger2;
    }

    private boolean bodyEncoded(Headers headers) {
        String str = headers.get("Content-Encoding");
        return str != null && !str.equalsIgnoreCase(HTTP.IDENTITY_CODING);
    }

    static boolean isPlaintext(Buffer buffer) {
        try {
            Buffer buffer2 = new Buffer();
            buffer.copyTo(buffer2, 0, buffer.size() < 64 ? buffer.size() : 64);
            for (int i = 0; i < 16; i++) {
                if (buffer2.exhausted()) {
                    return true;
                }
                int readUtf8CodePoint = buffer2.readUtf8CodePoint();
                if (Character.isISOControl(readUtf8CodePoint) && !Character.isWhitespace(readUtf8CodePoint)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public Level getLevel() {
        return this.level;
    }

    public Response intercept(Interceptor.Chain chain) {
        boolean z;
        String str;
        String str2;
        Logger logger2;
        String str3;
        StringBuilder sb;
        Logger logger3;
        String str4;
        boolean z2;
        Interceptor.Chain chain2 = chain;
        Level level2 = this.level;
        Request request = chain.request();
        if (level2 == Level.NONE) {
            return chain2.proceed(request);
        }
        boolean z3 = true;
        boolean z4 = level2 == Level.BODY;
        boolean z5 = z4 || level2 == Level.HEADERS;
        RequestBody body = request.body();
        if (body == null) {
            z3 = false;
        }
        Connection connection = chain.connection();
        String str5 = "--> " + request.method() + TokenParser.f19315SP + request.url() + TokenParser.f19315SP + (connection != null ? connection.protocol() : Protocol.HTTP_1_1);
        if (!z5 && z3) {
            str5 = str5 + " (" + body.contentLength() + "-byte body)";
        }
        this.logger.log(str5);
        if (z5) {
            if (z3) {
                if (body.contentType() != null) {
                    this.logger.log("Content-Type: " + body.contentType());
                }
                if (body.contentLength() != -1) {
                    this.logger.log("Content-Length: " + body.contentLength());
                }
            }
            Headers headers = request.headers();
            int size = headers.size();
            int i = 0;
            while (i < size) {
                String name = headers.name(i);
                int i2 = size;
                if ("Content-Type".equalsIgnoreCase(name) || "Content-Length".equalsIgnoreCase(name)) {
                    z2 = z5;
                } else {
                    z2 = z5;
                    this.logger.log(name + ": " + headers.value(i));
                }
                i++;
                size = i2;
                z5 = z2;
            }
            z = z5;
            if (!z4 || !z3) {
                logger3 = this.logger;
                sb = new StringBuilder();
                sb.append("--> END ");
                str4 = request.method();
            } else if (bodyEncoded(request.headers())) {
                logger3 = this.logger;
                sb = new StringBuilder();
                sb.append("--> END ");
                sb.append(request.method());
                str4 = " (encoded body omitted)";
            } else {
                Buffer buffer = new Buffer();
                body.writeTo(buffer);
                Charset charset = UTF8;
                MediaType contentType = body.contentType();
                if (contentType != null) {
                    charset = contentType.charset(UTF8);
                }
                this.logger.log("");
                if (isPlaintext(buffer)) {
                    this.logger.log(buffer.readString(charset));
                    logger3 = this.logger;
                    sb = new StringBuilder();
                    sb.append("--> END ");
                    sb.append(request.method());
                    sb.append(" (");
                    sb.append(body.contentLength());
                    sb.append("-byte body)");
                } else {
                    logger3 = this.logger;
                    sb = new StringBuilder();
                    sb.append("--> END ");
                    sb.append(request.method());
                    sb.append(" (binary ");
                    sb.append(body.contentLength());
                    sb.append("-byte body omitted)");
                }
                logger3.log(sb.toString());
            }
            sb.append(str4);
            logger3.log(sb.toString());
        } else {
            z = z5;
        }
        long nanoTime = System.nanoTime();
        try {
            Response proceed = chain2.proceed(request);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            ResponseBody body2 = proceed.body();
            long contentLength = body2.contentLength();
            if (contentLength != -1) {
                str = contentLength + "-byte";
            } else {
                str = "unknown-length";
            }
            Logger logger4 = this.logger;
            StringBuilder sb2 = new StringBuilder();
            String str6 = "-byte body)";
            sb2.append("<-- ");
            sb2.append(proceed.code());
            sb2.append(TokenParser.f19315SP);
            long j = contentLength;
            sb2.append(proceed.message());
            sb2.append(TokenParser.f19315SP);
            sb2.append(proceed.request().url());
            sb2.append(" (");
            sb2.append(millis);
            sb2.append("ms");
            if (!z) {
                str2 = ", " + str + " body";
            } else {
                str2 = "";
            }
            sb2.append(str2);
            sb2.append(')');
            logger4.log(sb2.toString());
            if (z) {
                Headers headers2 = proceed.headers();
                int size2 = headers2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    this.logger.log(headers2.name(i3) + ": " + headers2.value(i3));
                }
                if (!z4 || !HttpHeaders.hasBody(proceed)) {
                    this.logger.log("<-- END HTTP");
                } else {
                    if (bodyEncoded(proceed.headers())) {
                        logger2 = this.logger;
                        str3 = "<-- END HTTP (encoded body omitted)";
                    } else {
                        BufferedSource source = body2.source();
                        source.request(Long.MAX_VALUE);
                        Buffer buffer2 = source.buffer();
                        Charset charset2 = UTF8;
                        MediaType contentType2 = body2.contentType();
                        if (contentType2 != null) {
                            try {
                                charset2 = contentType2.charset(UTF8);
                            } catch (UnsupportedCharsetException unused) {
                                this.logger.log("");
                                this.logger.log("Couldn't decode the response body; charset is likely malformed.");
                                this.logger.log("<-- END HTTP");
                                return proceed;
                            }
                        }
                        if (!isPlaintext(buffer2)) {
                            this.logger.log("");
                            this.logger.log("<-- END HTTP (binary " + buffer2.size() + "-byte body omitted)");
                            return proceed;
                        }
                        if (j != 0) {
                            this.logger.log("");
                            this.logger.log(buffer2.clone().readString(charset2));
                        }
                        logger2 = this.logger;
                        str3 = "<-- END HTTP (" + buffer2.size() + str6;
                    }
                    logger2.log(str3);
                }
            }
            return proceed;
        } catch (Exception e) {
            Exception exc = e;
            this.logger.log("<-- HTTP FAILED: " + exc);
            throw exc;
        }
    }

    public HttpLoggingInterceptor setLevel(Level level2) {
        if (level2 != null) {
            this.level = level2;
            return this;
        }
        throw new NullPointerException("level == null. Use Level.NONE instead.");
    }
}
