package org.apache.http.client.utils;

import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.Consts;
import org.apache.http.NameValuePair;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.message.BasicNameValuePair;

@NotThreadSafe
public class URIBuilder {
    private Charset charset;
    private String encodedAuthority;
    private String encodedFragment;
    private String encodedPath;
    private String encodedQuery;
    private String encodedSchemeSpecificPart;
    private String encodedUserInfo;
    private String fragment;
    private String host;
    private String path;
    private int port;
    private String query;
    private List<NameValuePair> queryParams;
    private String scheme;
    private String userInfo;

    public URIBuilder() {
        this.port = -1;
    }

    public URIBuilder(String str) {
        digestURI(new URI(str));
    }

    public URIBuilder(URI uri) {
        digestURI(uri);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String buildString() {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.scheme
            if (r1 == 0) goto L_0x0011
            r0.append(r1)
            r1 = 58
            r0.append(r1)
        L_0x0011:
            java.lang.String r1 = r3.encodedSchemeSpecificPart
            if (r1 == 0) goto L_0x001a
        L_0x0015:
            r0.append(r1)
            goto L_0x00b1
        L_0x001a:
            java.lang.String r1 = r3.encodedAuthority
            java.lang.String r2 = "//"
            if (r1 == 0) goto L_0x0029
            r0.append(r2)
            java.lang.String r1 = r3.encodedAuthority
            r0.append(r1)
            goto L_0x006e
        L_0x0029:
            java.lang.String r1 = r3.host
            if (r1 == 0) goto L_0x006e
            r0.append(r2)
            java.lang.String r1 = r3.encodedUserInfo
            java.lang.String r2 = "@"
            if (r1 == 0) goto L_0x003d
        L_0x0036:
            r0.append(r1)
            r0.append(r2)
            goto L_0x0046
        L_0x003d:
            java.lang.String r1 = r3.userInfo
            if (r1 == 0) goto L_0x0046
            java.lang.String r1 = r3.encodeUserInfo(r1)
            goto L_0x0036
        L_0x0046:
            java.lang.String r1 = r3.host
            boolean r1 = org.apache.http.conn.util.InetAddressUtils.isIPv6Address(r1)
            if (r1 == 0) goto L_0x005b
            java.lang.String r1 = "["
            r0.append(r1)
            java.lang.String r1 = r3.host
            r0.append(r1)
            java.lang.String r1 = "]"
            goto L_0x005d
        L_0x005b:
            java.lang.String r1 = r3.host
        L_0x005d:
            r0.append(r1)
            int r1 = r3.port
            if (r1 < 0) goto L_0x006e
            java.lang.String r1 = ":"
            r0.append(r1)
            int r1 = r3.port
            r0.append(r1)
        L_0x006e:
            java.lang.String r1 = r3.encodedPath
            if (r1 == 0) goto L_0x007a
            java.lang.String r1 = normalizePath(r1)
        L_0x0076:
            r0.append(r1)
            goto L_0x0087
        L_0x007a:
            java.lang.String r1 = r3.path
            if (r1 == 0) goto L_0x0087
            java.lang.String r1 = normalizePath(r1)
            java.lang.String r1 = r3.encodePath(r1)
            goto L_0x0076
        L_0x0087:
            java.lang.String r1 = r3.encodedQuery
            java.lang.String r2 = "?"
            if (r1 == 0) goto L_0x0093
            r0.append(r2)
            java.lang.String r1 = r3.encodedQuery
            goto L_0x0015
        L_0x0093:
            java.util.List<org.apache.http.NameValuePair> r1 = r3.queryParams
            if (r1 == 0) goto L_0x00a2
            r0.append(r2)
            java.util.List<org.apache.http.NameValuePair> r1 = r3.queryParams
            java.lang.String r1 = r3.encodeUrlForm(r1)
            goto L_0x0015
        L_0x00a2:
            java.lang.String r1 = r3.query
            if (r1 == 0) goto L_0x00b1
            r0.append(r2)
            java.lang.String r1 = r3.query
            java.lang.String r1 = r3.encodeUric(r1)
            goto L_0x0015
        L_0x00b1:
            java.lang.String r1 = r3.encodedFragment
            java.lang.String r2 = "#"
            if (r1 == 0) goto L_0x00c0
            r0.append(r2)
            java.lang.String r1 = r3.encodedFragment
        L_0x00bc:
            r0.append(r1)
            goto L_0x00ce
        L_0x00c0:
            java.lang.String r1 = r3.fragment
            if (r1 == 0) goto L_0x00ce
            r0.append(r2)
            java.lang.String r1 = r3.fragment
            java.lang.String r1 = r3.encodeUric(r1)
            goto L_0x00bc
        L_0x00ce:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.client.utils.URIBuilder.buildString():java.lang.String");
    }

    private void digestURI(URI uri) {
        this.scheme = uri.getScheme();
        this.encodedSchemeSpecificPart = uri.getRawSchemeSpecificPart();
        this.encodedAuthority = uri.getRawAuthority();
        this.host = uri.getHost();
        this.port = uri.getPort();
        this.encodedUserInfo = uri.getRawUserInfo();
        this.userInfo = uri.getUserInfo();
        this.encodedPath = uri.getRawPath();
        this.path = uri.getPath();
        this.encodedQuery = uri.getRawQuery();
        String rawQuery = uri.getRawQuery();
        Charset charset2 = this.charset;
        if (charset2 == null) {
            charset2 = Consts.UTF_8;
        }
        this.queryParams = parseQuery(rawQuery, charset2);
        this.encodedFragment = uri.getRawFragment();
        this.fragment = uri.getFragment();
    }

    private String encodePath(String str) {
        Charset charset2 = this.charset;
        if (charset2 == null) {
            charset2 = Consts.UTF_8;
        }
        return URLEncodedUtils.encPath(str, charset2);
    }

    private String encodeUric(String str) {
        Charset charset2 = this.charset;
        if (charset2 == null) {
            charset2 = Consts.UTF_8;
        }
        return URLEncodedUtils.encUric(str, charset2);
    }

    private String encodeUrlForm(List<NameValuePair> list) {
        Charset charset2 = this.charset;
        if (charset2 == null) {
            charset2 = Consts.UTF_8;
        }
        return URLEncodedUtils.format((Iterable<? extends NameValuePair>) list, charset2);
    }

    private String encodeUserInfo(String str) {
        Charset charset2 = this.charset;
        if (charset2 == null) {
            charset2 = Consts.UTF_8;
        }
        return URLEncodedUtils.encUserInfo(str, charset2);
    }

    private static String normalizePath(String str) {
        if (str == null) {
            return null;
        }
        int i = 0;
        while (i < str.length() && str.charAt(i) == '/') {
            i++;
        }
        return i > 1 ? str.substring(i - 1) : str;
    }

    private List<NameValuePair> parseQuery(String str, Charset charset2) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return URLEncodedUtils.parse(str, charset2);
    }

    public URIBuilder addParameter(String str, String str2) {
        if (this.queryParams == null) {
            this.queryParams = new ArrayList();
        }
        this.queryParams.add(new BasicNameValuePair(str, str2));
        this.encodedQuery = null;
        this.encodedSchemeSpecificPart = null;
        this.query = null;
        return this;
    }

    public URIBuilder addParameters(List<NameValuePair> list) {
        if (this.queryParams == null) {
            this.queryParams = new ArrayList();
        }
        this.queryParams.addAll(list);
        this.encodedQuery = null;
        this.encodedSchemeSpecificPart = null;
        this.query = null;
        return this;
    }

    public URI build() {
        return new URI(buildString());
    }

    public URIBuilder clearParameters() {
        this.queryParams = null;
        this.encodedQuery = null;
        this.encodedSchemeSpecificPart = null;
        return this;
    }

    public Charset getCharset() {
        return this.charset;
    }

    public String getFragment() {
        return this.fragment;
    }

    public String getHost() {
        return this.host;
    }

    public String getPath() {
        return this.path;
    }

    public int getPort() {
        return this.port;
    }

    public List<NameValuePair> getQueryParams() {
        List<NameValuePair> list = this.queryParams;
        return list != null ? new ArrayList(list) : new ArrayList();
    }

    public String getScheme() {
        return this.scheme;
    }

    public String getUserInfo() {
        return this.userInfo;
    }

    public boolean isAbsolute() {
        return this.scheme != null;
    }

    public boolean isOpaque() {
        return this.path == null;
    }

    public URIBuilder removeQuery() {
        this.queryParams = null;
        this.query = null;
        this.encodedQuery = null;
        this.encodedSchemeSpecificPart = null;
        return this;
    }

    public URIBuilder setCharset(Charset charset2) {
        this.charset = charset2;
        return this;
    }

    public URIBuilder setCustomQuery(String str) {
        this.query = str;
        this.encodedQuery = null;
        this.encodedSchemeSpecificPart = null;
        this.queryParams = null;
        return this;
    }

    public URIBuilder setFragment(String str) {
        this.fragment = str;
        this.encodedFragment = null;
        return this;
    }

    public URIBuilder setHost(String str) {
        this.host = str;
        this.encodedSchemeSpecificPart = null;
        this.encodedAuthority = null;
        return this;
    }

    public URIBuilder setParameter(String str, String str2) {
        if (this.queryParams == null) {
            this.queryParams = new ArrayList();
        }
        if (!this.queryParams.isEmpty()) {
            Iterator<NameValuePair> it = this.queryParams.iterator();
            while (it.hasNext()) {
                if (it.next().getName().equals(str)) {
                    it.remove();
                }
            }
        }
        this.queryParams.add(new BasicNameValuePair(str, str2));
        this.encodedQuery = null;
        this.encodedSchemeSpecificPart = null;
        this.query = null;
        return this;
    }

    public URIBuilder setParameters(List<NameValuePair> list) {
        List<NameValuePair> list2 = this.queryParams;
        if (list2 == null) {
            this.queryParams = new ArrayList();
        } else {
            list2.clear();
        }
        this.queryParams.addAll(list);
        this.encodedQuery = null;
        this.encodedSchemeSpecificPart = null;
        this.query = null;
        return this;
    }

    public URIBuilder setParameters(NameValuePair... nameValuePairArr) {
        List<NameValuePair> list = this.queryParams;
        if (list == null) {
            this.queryParams = new ArrayList();
        } else {
            list.clear();
        }
        for (NameValuePair add : nameValuePairArr) {
            this.queryParams.add(add);
        }
        this.encodedQuery = null;
        this.encodedSchemeSpecificPart = null;
        this.query = null;
        return this;
    }

    public URIBuilder setPath(String str) {
        this.path = str;
        this.encodedSchemeSpecificPart = null;
        this.encodedPath = null;
        return this;
    }

    public URIBuilder setPort(int i) {
        if (i < 0) {
            i = -1;
        }
        this.port = i;
        this.encodedSchemeSpecificPart = null;
        this.encodedAuthority = null;
        return this;
    }

    @Deprecated
    public URIBuilder setQuery(String str) {
        Charset charset2 = this.charset;
        if (charset2 == null) {
            charset2 = Consts.UTF_8;
        }
        this.queryParams = parseQuery(str, charset2);
        this.query = null;
        this.encodedQuery = null;
        this.encodedSchemeSpecificPart = null;
        return this;
    }

    public URIBuilder setScheme(String str) {
        this.scheme = str;
        return this;
    }

    public URIBuilder setUserInfo(String str) {
        this.userInfo = str;
        this.encodedSchemeSpecificPart = null;
        this.encodedAuthority = null;
        this.encodedUserInfo = null;
        return this;
    }

    public URIBuilder setUserInfo(String str, String str2) {
        return setUserInfo(str + ':' + str2);
    }

    public String toString() {
        return buildString();
    }
}
