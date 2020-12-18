package org.apache.http.client.protocol;

import java.io.InputStream;
import java.util.Locale;
import java.util.zip.GZIPInputStream;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.annotation.Immutable;
import org.apache.http.client.entity.DecompressingEntity;
import org.apache.http.client.entity.DeflateInputStream;
import org.apache.http.client.entity.InputStreamFactory;
import org.apache.http.config.Lookup;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.protocol.HTTP;
import org.apache.http.protocol.HttpContext;

@Immutable
public class ResponseContentEncoding implements HttpResponseInterceptor {
    private static final InputStreamFactory DEFLATE = new InputStreamFactory() {
        public InputStream create(InputStream inputStream) {
            return new DeflateInputStream(inputStream);
        }
    };
    private static final InputStreamFactory GZIP = new InputStreamFactory() {
        public InputStream create(InputStream inputStream) {
            return new GZIPInputStream(inputStream);
        }
    };
    public static final String UNCOMPRESSED = "http.client.response.uncompressed";
    private final Lookup<InputStreamFactory> decoderRegistry;
    private final boolean ignoreUnknown;

    public ResponseContentEncoding() {
        this((Lookup<InputStreamFactory>) null);
    }

    public ResponseContentEncoding(Lookup<InputStreamFactory> lookup) {
        this(lookup, true);
    }

    public ResponseContentEncoding(Lookup<InputStreamFactory> lookup, boolean z) {
        this.decoderRegistry = lookup == null ? RegistryBuilder.create().register("gzip", GZIP).register("x-gzip", GZIP).register("deflate", DEFLATE).build() : lookup;
        this.ignoreUnknown = z;
    }

    public ResponseContentEncoding(boolean z) {
        this((Lookup<InputStreamFactory>) null, z);
    }

    public void process(HttpResponse httpResponse, HttpContext httpContext) {
        Header contentEncoding;
        HttpEntity entity = httpResponse.getEntity();
        if (HttpClientContext.adapt(httpContext).getRequestConfig().isContentCompressionEnabled() && entity != null && entity.getContentLength() != 0 && (contentEncoding = entity.getContentEncoding()) != null) {
            for (HeaderElement headerElement : contentEncoding.getElements()) {
                String lowerCase = headerElement.getName().toLowerCase(Locale.ROOT);
                InputStreamFactory lookup = this.decoderRegistry.lookup(lowerCase);
                if (lookup != null) {
                    httpResponse.setEntity(new DecompressingEntity(httpResponse.getEntity(), lookup));
                    httpResponse.removeHeaders("Content-Length");
                    httpResponse.removeHeaders("Content-Encoding");
                    httpResponse.removeHeaders(HttpHeaders.CONTENT_MD5);
                } else if (!HTTP.IDENTITY_CODING.equals(lowerCase) && !this.ignoreUnknown) {
                    throw new HttpException("Unsupported Content-Encoding: " + headerElement.getName());
                }
            }
        }
    }
}
