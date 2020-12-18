package org.apache.http.impl.auth;

import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.HashSet;
import java.util.Locale;
import java.util.StringTokenizer;
import org.apache.http.Consts;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.NameValuePair;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.ChallengeState;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.message.BasicHeaderValueFormatter;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.message.BufferedHeader;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;
import org.apache.http.util.EncodingUtils;

@NotThreadSafe
public class DigestScheme extends RFC2617Scheme {
    private static final char[] HEXADECIMAL = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final int QOP_AUTH = 2;
    private static final int QOP_AUTH_INT = 1;
    private static final int QOP_MISSING = 0;
    private static final int QOP_UNKNOWN = -1;
    private static final long serialVersionUID = 3883908186234566916L;

    /* renamed from: a1 */
    private String f19298a1;

    /* renamed from: a2 */
    private String f19299a2;
    private String cnonce;
    private boolean complete;
    private String lastNonce;
    private long nounceCount;

    public DigestScheme() {
        this(Consts.ASCII);
    }

    public DigestScheme(Charset charset) {
        super(charset);
        this.complete = false;
    }

    @Deprecated
    public DigestScheme(ChallengeState challengeState) {
        super(challengeState);
    }

    public static String createCnonce() {
        byte[] bArr = new byte[8];
        new SecureRandom().nextBytes(bArr);
        return encode(bArr);
    }

    private Header createDigestHeader(Credentials credentials, HttpRequest httpRequest) {
        String str;
        char c;
        String str2;
        String str3;
        boolean z;
        char c2;
        String str4;
        StringBuilder sb;
        HttpRequest httpRequest2 = httpRequest;
        String parameter = getParameter("uri");
        String parameter2 = getParameter("realm");
        String parameter3 = getParameter("nonce");
        String parameter4 = getParameter("opaque");
        String parameter5 = getParameter("methodname");
        String parameter6 = getParameter("algorithm");
        if (parameter6 == null) {
            parameter6 = "MD5";
        }
        HashSet hashSet = new HashSet(8);
        String str5 = "MD5";
        String parameter7 = getParameter("qop");
        String str6 = "opaque";
        String str7 = parameter4;
        String str8 = "algorithm";
        if (parameter7 != null) {
            str = "qop";
            for (StringTokenizer stringTokenizer = new StringTokenizer(parameter7, ","); stringTokenizer.hasMoreTokens(); stringTokenizer = stringTokenizer) {
                hashSet.add(stringTokenizer.nextToken().trim().toLowerCase(Locale.ROOT));
            }
            c = (!(httpRequest2 instanceof HttpEntityEnclosingRequest) || !hashSet.contains("auth-int")) ? hashSet.contains("auth") ? (char) 2 : 65535 : 1;
        } else {
            str = "qop";
            c = 0;
        }
        if (c != 65535) {
            String parameter8 = getParameter("charset");
            if (parameter8 == null) {
                parameter8 = "ISO-8859-1";
            }
            String str9 = parameter6.equalsIgnoreCase("MD5-sess") ? str5 : parameter6;
            try {
                MessageDigest createMessageDigest = createMessageDigest(str9);
                String str10 = "auth-int";
                String name = credentials.getUserPrincipal().getName();
                String str11 = "uri";
                String password = credentials.getPassword();
                String str12 = "nonce";
                String str13 = "realm";
                if (parameter3.equals(this.lastNonce)) {
                    str2 = parameter2;
                    this.nounceCount++;
                } else {
                    str2 = parameter2;
                    this.nounceCount = 1;
                    this.cnonce = null;
                    this.lastNonce = parameter3;
                }
                StringBuilder sb2 = new StringBuilder(256);
                String str14 = "auth";
                Formatter formatter = new Formatter(sb2, Locale.US);
                HashSet hashSet2 = hashSet;
                String str15 = parameter5;
                formatter.format("%08x", new Object[]{Long.valueOf(this.nounceCount)});
                formatter.close();
                String sb3 = sb2.toString();
                if (this.cnonce == null) {
                    this.cnonce = createCnonce();
                }
                this.f19298a1 = null;
                this.f19299a2 = null;
                if (parameter6.equalsIgnoreCase("MD5-sess")) {
                    sb2.setLength(0);
                    sb2.append(name);
                    sb2.append(':');
                    sb2.append(str2);
                    sb2.append(':');
                    sb2.append(password);
                    String encode = encode(createMessageDigest.digest(EncodingUtils.getBytes(sb2.toString(), parameter8)));
                    sb2.setLength(0);
                    sb2.append(encode);
                    sb2.append(':');
                    sb2.append(parameter3);
                    sb2.append(':');
                    password = this.cnonce;
                } else {
                    sb2.setLength(0);
                    sb2.append(name);
                    sb2.append(':');
                    sb2.append(str2);
                    sb2.append(':');
                }
                sb2.append(password);
                this.f19298a1 = sb2.toString();
                String encode2 = encode(createMessageDigest.digest(EncodingUtils.getBytes(this.f19298a1, parameter8)));
                if (c == 2) {
                    this.f19299a2 = str15 + ':' + parameter;
                    str3 = str14;
                } else {
                    String str16 = str15;
                    if (c == 1) {
                        HttpEntity entity = httpRequest2 instanceof HttpEntityEnclosingRequest ? ((HttpEntityEnclosingRequest) httpRequest2).getEntity() : null;
                        if (entity == null || entity.isRepeatable()) {
                            str3 = str14;
                            HttpEntityDigester httpEntityDigester = new HttpEntityDigester(createMessageDigest);
                            if (entity != null) {
                                try {
                                    entity.writeTo(httpEntityDigester);
                                } catch (IOException e) {
                                    throw new AuthenticationException("I/O error reading entity content", e);
                                }
                            }
                            httpEntityDigester.close();
                            sb = new StringBuilder();
                            sb.append(str16);
                            sb.append(':');
                            sb.append(parameter);
                            sb.append(':');
                            sb.append(encode(httpEntityDigester.getDigest()));
                        } else {
                            str3 = str14;
                            if (hashSet2.contains(str3)) {
                                this.f19299a2 = str16 + ':' + parameter;
                                c = 2;
                            } else {
                                throw new AuthenticationException("Qop auth-int cannot be used with a non-repeatable entity");
                            }
                        }
                    } else {
                        str3 = str14;
                        sb = new StringBuilder();
                        sb.append(str16);
                        sb.append(':');
                        sb.append(parameter);
                    }
                    this.f19299a2 = sb.toString();
                }
                String encode3 = encode(createMessageDigest.digest(EncodingUtils.getBytes(this.f19299a2, parameter8)));
                if (c == 0) {
                    z = false;
                    sb2.setLength(0);
                    sb2.append(encode2);
                    c2 = ':';
                    sb2.append(':');
                    sb2.append(parameter3);
                } else {
                    z = false;
                    c2 = ':';
                    sb2.setLength(0);
                    sb2.append(encode2);
                    sb2.append(':');
                    sb2.append(parameter3);
                    sb2.append(':');
                    sb2.append(sb3);
                    sb2.append(':');
                    sb2.append(this.cnonce);
                    sb2.append(':');
                    sb2.append(c == 1 ? str10 : str3);
                }
                sb2.append(c2);
                sb2.append(encode3);
                String encode4 = encode(createMessageDigest.digest(EncodingUtils.getAsciiBytes(sb2.toString())));
                CharArrayBuffer charArrayBuffer = new CharArrayBuffer(128);
                charArrayBuffer.append(isProxy() ? "Proxy-Authorization" : "Authorization");
                charArrayBuffer.append(": Digest ");
                ArrayList arrayList = new ArrayList(20);
                arrayList.add(new BasicNameValuePair("username", name));
                arrayList.add(new BasicNameValuePair(str13, str2));
                arrayList.add(new BasicNameValuePair(str12, parameter3));
                arrayList.add(new BasicNameValuePair(str11, parameter));
                arrayList.add(new BasicNameValuePair("response", encode4));
                if (c != 0) {
                    if (c == 1) {
                        str3 = str10;
                    }
                    str4 = str;
                    arrayList.add(new BasicNameValuePair(str4, str3));
                    arrayList.add(new BasicNameValuePair("nc", sb3));
                    arrayList.add(new BasicNameValuePair("cnonce", this.cnonce));
                } else {
                    str4 = str;
                }
                String str17 = str8;
                arrayList.add(new BasicNameValuePair(str17, parameter6));
                if (str7 != null) {
                    arrayList.add(new BasicNameValuePair(str6, str7));
                }
                for (int i = z; i < arrayList.size(); i++) {
                    BasicNameValuePair basicNameValuePair = (BasicNameValuePair) arrayList.get(i);
                    if (i > 0) {
                        charArrayBuffer.append(", ");
                    }
                    String name2 = basicNameValuePair.getName();
                    BasicHeaderValueFormatter.INSTANCE.formatNameValuePair(charArrayBuffer, (NameValuePair) basicNameValuePair, !(("nc".equals(name2) || str4.equals(name2) || str17.equals(name2)) ? true : z));
                }
                return new BufferedHeader(charArrayBuffer);
            } catch (UnsupportedDigestAlgorithmException unused) {
                throw new AuthenticationException("Unsuppported digest algorithm: " + str9);
            }
        } else {
            throw new AuthenticationException("None of the qop methods is supported: " + parameter7);
        }
    }

    private static MessageDigest createMessageDigest(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (Exception unused) {
            throw new UnsupportedDigestAlgorithmException("Unsupported algorithm in HTTP Digest authentication: " + str);
        }
    }

    static String encode(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[(length * 2)];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            char[] cArr2 = HEXADECIMAL;
            cArr[i2] = cArr2[(bArr[i] & 240) >> 4];
            cArr[i2 + 1] = cArr2[bArr[i] & 15];
        }
        return new String(cArr);
    }

    @Deprecated
    public Header authenticate(Credentials credentials, HttpRequest httpRequest) {
        return authenticate(credentials, httpRequest, new BasicHttpContext());
    }

    public Header authenticate(Credentials credentials, HttpRequest httpRequest, HttpContext httpContext) {
        Args.notNull(credentials, "Credentials");
        Args.notNull(httpRequest, "HTTP request");
        if (getParameter("realm") == null) {
            throw new AuthenticationException("missing realm in challenge");
        } else if (getParameter("nonce") != null) {
            getParameters().put("methodname", httpRequest.getRequestLine().getMethod());
            getParameters().put("uri", httpRequest.getRequestLine().getUri());
            if (getParameter("charset") == null) {
                getParameters().put("charset", getCredentialsCharset(httpRequest));
            }
            return createDigestHeader(credentials, httpRequest);
        } else {
            throw new AuthenticationException("missing nonce in challenge");
        }
    }

    /* access modifiers changed from: package-private */
    public String getA1() {
        return this.f19298a1;
    }

    /* access modifiers changed from: package-private */
    public String getA2() {
        return this.f19299a2;
    }

    /* access modifiers changed from: package-private */
    public String getCnonce() {
        return this.cnonce;
    }

    public String getSchemeName() {
        return "digest";
    }

    public boolean isComplete() {
        if ("true".equalsIgnoreCase(getParameter("stale"))) {
            return false;
        }
        return this.complete;
    }

    public boolean isConnectionBased() {
        return false;
    }

    public void overrideParamter(String str, String str2) {
        getParameters().put(str, str2);
    }

    public void processChallenge(Header header) {
        super.processChallenge(header);
        this.complete = true;
        if (getParameters().isEmpty()) {
            throw new MalformedChallengeException("Authentication challenge is empty");
        }
    }

    public String toString() {
        return "DIGEST [complete=" + this.complete + ", nonce=" + this.lastNonce + ", nc=" + this.nounceCount + "]";
    }
}
