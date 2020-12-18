package org.apache.http.client.methods;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.apache.http.Consts;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.NameValuePair;
import org.apache.http.ProtocolVersion;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.entity.ContentType;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.message.HeaderGroup;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.Args;

@NotThreadSafe
public class RequestBuilder {
    private Charset charset;
    private RequestConfig config;
    private HttpEntity entity;
    private HeaderGroup headergroup;
    private String method;
    private List<NameValuePair> parameters;
    private URI uri;
    private ProtocolVersion version;

    static class InternalEntityEclosingRequest extends HttpEntityEnclosingRequestBase {
        private final String method;

        InternalEntityEclosingRequest(String str) {
            this.method = str;
        }

        public String getMethod() {
            return this.method;
        }
    }

    static class InternalRequest extends HttpRequestBase {
        private final String method;

        InternalRequest(String str) {
            this.method = str;
        }

        public String getMethod() {
            return this.method;
        }
    }

    RequestBuilder() {
        this((String) null);
    }

    RequestBuilder(String str) {
        this.charset = Consts.UTF_8;
        this.method = str;
    }

    RequestBuilder(String str, String str2) {
        this.method = str;
        this.uri = str2 != null ? URI.create(str2) : null;
    }

    RequestBuilder(String str, URI uri2) {
        this.method = str;
        this.uri = uri2;
    }

    public static RequestBuilder copy(HttpRequest httpRequest) {
        Args.notNull(httpRequest, "HTTP request");
        RequestBuilder requestBuilder = new RequestBuilder();
        requestBuilder.doCopy(httpRequest);
        return requestBuilder;
    }

    public static RequestBuilder create(String str) {
        Args.notBlank(str, "HTTP method");
        return new RequestBuilder(str);
    }

    public static RequestBuilder delete() {
        return new RequestBuilder(HttpDelete.METHOD_NAME);
    }

    public static RequestBuilder delete(String str) {
        return new RequestBuilder(HttpDelete.METHOD_NAME, str);
    }

    public static RequestBuilder delete(URI uri2) {
        return new RequestBuilder(HttpDelete.METHOD_NAME, uri2);
    }

    private RequestBuilder doCopy(HttpRequest httpRequest) {
        if (httpRequest == null) {
            return this;
        }
        this.method = httpRequest.getRequestLine().getMethod();
        this.version = httpRequest.getRequestLine().getProtocolVersion();
        if (this.headergroup == null) {
            this.headergroup = new HeaderGroup();
        }
        this.headergroup.clear();
        this.headergroup.setHeaders(httpRequest.getAllHeaders());
        this.parameters = null;
        this.entity = null;
        if (httpRequest instanceof HttpEntityEnclosingRequest) {
            HttpEntity entity2 = ((HttpEntityEnclosingRequest) httpRequest).getEntity();
            ContentType contentType = ContentType.get(entity2);
            if (contentType == null || !contentType.getMimeType().equals(ContentType.APPLICATION_FORM_URLENCODED.getMimeType())) {
                this.entity = entity2;
            } else {
                try {
                    List<NameValuePair> parse = URLEncodedUtils.parse(entity2);
                    if (!parse.isEmpty()) {
                        this.parameters = parse;
                    }
                } catch (IOException unused) {
                }
            }
        }
        URI uri2 = httpRequest instanceof HttpUriRequest ? ((HttpUriRequest) httpRequest).getURI() : URI.create(httpRequest.getRequestLine().getUri());
        URIBuilder uRIBuilder = new URIBuilder(uri2);
        if (this.parameters == null) {
            List<NameValuePair> queryParams = uRIBuilder.getQueryParams();
            if (!queryParams.isEmpty()) {
                this.parameters = queryParams;
                uRIBuilder.clearParameters();
            } else {
                this.parameters = null;
            }
        }
        try {
            this.uri = uRIBuilder.build();
        } catch (URISyntaxException unused2) {
            this.uri = uri2;
        }
        if (httpRequest instanceof Configurable) {
            this.config = ((Configurable) httpRequest).getConfig();
        } else {
            this.config = null;
        }
        return this;
    }

    public static RequestBuilder get() {
        return new RequestBuilder(HttpGet.METHOD_NAME);
    }

    public static RequestBuilder get(String str) {
        return new RequestBuilder(HttpGet.METHOD_NAME, str);
    }

    public static RequestBuilder get(URI uri2) {
        return new RequestBuilder(HttpGet.METHOD_NAME, uri2);
    }

    public static RequestBuilder head() {
        return new RequestBuilder(HttpHead.METHOD_NAME);
    }

    public static RequestBuilder head(String str) {
        return new RequestBuilder(HttpHead.METHOD_NAME, str);
    }

    public static RequestBuilder head(URI uri2) {
        return new RequestBuilder(HttpHead.METHOD_NAME, uri2);
    }

    public static RequestBuilder options() {
        return new RequestBuilder(HttpOptions.METHOD_NAME);
    }

    public static RequestBuilder options(String str) {
        return new RequestBuilder(HttpOptions.METHOD_NAME, str);
    }

    public static RequestBuilder options(URI uri2) {
        return new RequestBuilder(HttpOptions.METHOD_NAME, uri2);
    }

    public static RequestBuilder patch() {
        return new RequestBuilder(HttpPatch.METHOD_NAME);
    }

    public static RequestBuilder patch(String str) {
        return new RequestBuilder(HttpPatch.METHOD_NAME, str);
    }

    public static RequestBuilder patch(URI uri2) {
        return new RequestBuilder(HttpPatch.METHOD_NAME, uri2);
    }

    public static RequestBuilder post() {
        return new RequestBuilder(HttpPost.METHOD_NAME);
    }

    public static RequestBuilder post(String str) {
        return new RequestBuilder(HttpPost.METHOD_NAME, str);
    }

    public static RequestBuilder post(URI uri2) {
        return new RequestBuilder(HttpPost.METHOD_NAME, uri2);
    }

    public static RequestBuilder put() {
        return new RequestBuilder(HttpPut.METHOD_NAME);
    }

    public static RequestBuilder put(String str) {
        return new RequestBuilder(HttpPut.METHOD_NAME, str);
    }

    public static RequestBuilder put(URI uri2) {
        return new RequestBuilder(HttpPut.METHOD_NAME, uri2);
    }

    public static RequestBuilder trace() {
        return new RequestBuilder(HttpTrace.METHOD_NAME);
    }

    public static RequestBuilder trace(String str) {
        return new RequestBuilder(HttpTrace.METHOD_NAME, str);
    }

    public static RequestBuilder trace(URI uri2) {
        return new RequestBuilder(HttpTrace.METHOD_NAME, uri2);
    }

    public RequestBuilder addHeader(String str, String str2) {
        if (this.headergroup == null) {
            this.headergroup = new HeaderGroup();
        }
        this.headergroup.addHeader(new BasicHeader(str, str2));
        return this;
    }

    public RequestBuilder addHeader(Header header) {
        if (this.headergroup == null) {
            this.headergroup = new HeaderGroup();
        }
        this.headergroup.addHeader(header);
        return this;
    }

    public RequestBuilder addParameter(String str, String str2) {
        return addParameter(new BasicNameValuePair(str, str2));
    }

    public RequestBuilder addParameter(NameValuePair nameValuePair) {
        Args.notNull(nameValuePair, "Name value pair");
        if (this.parameters == null) {
            this.parameters = new LinkedList();
        }
        this.parameters.add(nameValuePair);
        return this;
    }

    public RequestBuilder addParameters(NameValuePair... nameValuePairArr) {
        for (NameValuePair addParameter : nameValuePairArr) {
            addParameter(addParameter);
        }
        return this;
    }

    public HttpUriRequest build() {
        HttpRequestBase httpRequestBase;
        URI uri2 = this.uri;
        if (uri2 == null) {
            uri2 = URI.create("/");
        }
        HttpEntity httpEntity = this.entity;
        List<NameValuePair> list = this.parameters;
        if (list != null && !list.isEmpty()) {
            if (httpEntity != null || (!HttpPost.METHOD_NAME.equalsIgnoreCase(this.method) && !HttpPut.METHOD_NAME.equalsIgnoreCase(this.method))) {
                try {
                    uri2 = new URIBuilder(uri2).setCharset(this.charset).addParameters(this.parameters).build();
                } catch (URISyntaxException unused) {
                }
            } else {
                httpEntity = new UrlEncodedFormEntity((Iterable<? extends NameValuePair>) this.parameters, HTTP.DEF_CONTENT_CHARSET);
            }
        }
        if (httpEntity == null) {
            httpRequestBase = new InternalRequest(this.method);
        } else {
            InternalEntityEclosingRequest internalEntityEclosingRequest = new InternalEntityEclosingRequest(this.method);
            internalEntityEclosingRequest.setEntity(httpEntity);
            httpRequestBase = internalEntityEclosingRequest;
        }
        httpRequestBase.setProtocolVersion(this.version);
        httpRequestBase.setURI(uri2);
        HeaderGroup headerGroup = this.headergroup;
        if (headerGroup != null) {
            httpRequestBase.setHeaders(headerGroup.getAllHeaders());
        }
        httpRequestBase.setConfig(this.config);
        return httpRequestBase;
    }

    public Charset getCharset() {
        return this.charset;
    }

    public RequestConfig getConfig() {
        return this.config;
    }

    public HttpEntity getEntity() {
        return this.entity;
    }

    public Header getFirstHeader(String str) {
        HeaderGroup headerGroup = this.headergroup;
        if (headerGroup != null) {
            return headerGroup.getFirstHeader(str);
        }
        return null;
    }

    public Header[] getHeaders(String str) {
        HeaderGroup headerGroup = this.headergroup;
        if (headerGroup != null) {
            return headerGroup.getHeaders(str);
        }
        return null;
    }

    public Header getLastHeader(String str) {
        HeaderGroup headerGroup = this.headergroup;
        if (headerGroup != null) {
            return headerGroup.getLastHeader(str);
        }
        return null;
    }

    public String getMethod() {
        return this.method;
    }

    public List<NameValuePair> getParameters() {
        List<NameValuePair> list = this.parameters;
        return list != null ? new ArrayList(list) : new ArrayList();
    }

    public URI getUri() {
        return this.uri;
    }

    public ProtocolVersion getVersion() {
        return this.version;
    }

    public RequestBuilder removeHeader(Header header) {
        if (this.headergroup == null) {
            this.headergroup = new HeaderGroup();
        }
        this.headergroup.removeHeader(header);
        return this;
    }

    public RequestBuilder removeHeaders(String str) {
        HeaderGroup headerGroup;
        if (!(str == null || (headerGroup = this.headergroup) == null)) {
            HeaderIterator it = headerGroup.iterator();
            while (it.hasNext()) {
                if (str.equalsIgnoreCase(it.nextHeader().getName())) {
                    it.remove();
                }
            }
        }
        return this;
    }

    public RequestBuilder setCharset(Charset charset2) {
        this.charset = charset2;
        return this;
    }

    public RequestBuilder setConfig(RequestConfig requestConfig) {
        this.config = requestConfig;
        return this;
    }

    public RequestBuilder setEntity(HttpEntity httpEntity) {
        this.entity = httpEntity;
        return this;
    }

    public RequestBuilder setHeader(String str, String str2) {
        if (this.headergroup == null) {
            this.headergroup = new HeaderGroup();
        }
        this.headergroup.updateHeader(new BasicHeader(str, str2));
        return this;
    }

    public RequestBuilder setHeader(Header header) {
        if (this.headergroup == null) {
            this.headergroup = new HeaderGroup();
        }
        this.headergroup.updateHeader(header);
        return this;
    }

    public RequestBuilder setUri(String str) {
        this.uri = str != null ? URI.create(str) : null;
        return this;
    }

    public RequestBuilder setUri(URI uri2) {
        this.uri = uri2;
        return this;
    }

    public RequestBuilder setVersion(ProtocolVersion protocolVersion) {
        this.version = protocolVersion;
        return this;
    }
}
