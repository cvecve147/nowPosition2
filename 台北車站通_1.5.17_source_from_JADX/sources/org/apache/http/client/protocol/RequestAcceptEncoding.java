package org.apache.http.client.protocol;

import java.util.List;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.annotation.Immutable;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.protocol.HttpContext;

@Immutable
public class RequestAcceptEncoding implements HttpRequestInterceptor {
    private final String acceptEncoding;

    public RequestAcceptEncoding() {
        this((List<String>) null);
    }

    public RequestAcceptEncoding(List<String> list) {
        String str;
        if (list == null || list.isEmpty()) {
            str = "gzip,deflate";
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                if (i > 0) {
                    sb.append(",");
                }
                sb.append(list.get(i));
            }
            str = sb.toString();
        }
        this.acceptEncoding = str;
    }

    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        RequestConfig requestConfig = HttpClientContext.adapt(httpContext).getRequestConfig();
        if (!httpRequest.containsHeader(HttpHeaders.ACCEPT_ENCODING) && requestConfig.isContentCompressionEnabled()) {
            httpRequest.addHeader(HttpHeaders.ACCEPT_ENCODING, this.acceptEncoding);
        }
    }
}
