package p101d.p119e.p120a.p121a;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;
import p101d.p119e.p120a.C5284q;

/* renamed from: d.e.a.a.i */
public class C5260i implements C5259h {

    /* renamed from: a */
    private final C5261a f14891a;

    /* renamed from: b */
    private final SSLSocketFactory f14892b;

    /* renamed from: d.e.a.a.i$a */
    public interface C5261a {
        /* renamed from: a */
        String mo14589a(String str);
    }

    public C5260i() {
        this((C5261a) null);
    }

    public C5260i(C5261a aVar) {
        this(aVar, (SSLSocketFactory) null);
    }

    public C5260i(C5261a aVar, SSLSocketFactory sSLSocketFactory) {
        this.f14891a = aVar;
        this.f14892b = sSLSocketFactory;
    }

    /* renamed from: a */
    private HttpURLConnection m20369a(URL url, C5284q<?> qVar) {
        SSLSocketFactory sSLSocketFactory;
        HttpURLConnection a = mo14588a(url);
        int v = qVar.mo14645v();
        a.setConnectTimeout(v);
        a.setReadTimeout(v);
        a.setUseCaches(false);
        a.setDoInput(true);
        if ("https".equals(url.getProtocol()) && (sSLSocketFactory = this.f14892b) != null) {
            ((HttpsURLConnection) a).setSSLSocketFactory(sSLSocketFactory);
        }
        return a;
    }

    /* renamed from: a */
    private static HttpEntity m20370a(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        BasicHttpEntity basicHttpEntity = new BasicHttpEntity();
        try {
            inputStream = httpURLConnection.getInputStream();
        } catch (IOException unused) {
            inputStream = httpURLConnection.getErrorStream();
        }
        basicHttpEntity.setContent(inputStream);
        basicHttpEntity.setContentLength((long) httpURLConnection.getContentLength());
        basicHttpEntity.setContentEncoding(httpURLConnection.getContentEncoding());
        basicHttpEntity.setContentType(httpURLConnection.getContentType());
        return basicHttpEntity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        r3.setRequestMethod(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        m20373b(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        r3.setRequestMethod(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m20371a(java.net.HttpURLConnection r3, p101d.p119e.p120a.C5284q<?> r4) {
        /*
            int r0 = r4.mo14637m()
            java.lang.String r1 = "POST"
            switch(r0) {
                case -1: goto L_0x0033;
                case 0: goto L_0x002d;
                case 1: goto L_0x0026;
                case 2: goto L_0x0020;
                case 3: goto L_0x001d;
                case 4: goto L_0x001a;
                case 5: goto L_0x0017;
                case 6: goto L_0x0014;
                case 7: goto L_0x0011;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Unknown method type."
            r3.<init>(r4)
            throw r3
        L_0x0011:
            java.lang.String r0 = "PATCH"
            goto L_0x0022
        L_0x0014:
            java.lang.String r4 = "TRACE"
            goto L_0x002f
        L_0x0017:
            java.lang.String r4 = "OPTIONS"
            goto L_0x002f
        L_0x001a:
            java.lang.String r4 = "HEAD"
            goto L_0x002f
        L_0x001d:
            java.lang.String r4 = "DELETE"
            goto L_0x002f
        L_0x0020:
            java.lang.String r0 = "PUT"
        L_0x0022:
            r3.setRequestMethod(r0)
            goto L_0x0029
        L_0x0026:
            r3.setRequestMethod(r1)
        L_0x0029:
            m20373b(r3, r4)
            goto L_0x0058
        L_0x002d:
            java.lang.String r4 = "GET"
        L_0x002f:
            r3.setRequestMethod(r4)
            goto L_0x0058
        L_0x0033:
            byte[] r0 = r4.mo14595q()
            if (r0 == 0) goto L_0x0058
            r2 = 1
            r3.setDoOutput(r2)
            r3.setRequestMethod(r1)
            java.lang.String r4 = r4.mo14596r()
            java.lang.String r1 = "Content-Type"
            r3.addRequestProperty(r1, r4)
            java.io.DataOutputStream r4 = new java.io.DataOutputStream
            java.io.OutputStream r3 = r3.getOutputStream()
            r4.<init>(r3)
            r4.write(r0)
            r4.close()
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p119e.p120a.p121a.C5260i.m20371a(java.net.HttpURLConnection, d.e.a.q):void");
    }

    /* renamed from: a */
    private static boolean m20372a(int i, int i2) {
        return (i == 4 || (100 <= i2 && i2 < 200) || i2 == 204 || i2 == 304) ? false : true;
    }

    /* renamed from: b */
    private static void m20373b(HttpURLConnection httpURLConnection, C5284q<?> qVar) {
        byte[] a = qVar.mo14593a();
        if (a != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.addRequestProperty("Content-Type", qVar.mo14594b());
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.write(a);
            dataOutputStream.close();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public HttpURLConnection mo14588a(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    /* renamed from: a */
    public HttpResponse mo14585a(C5284q<?> qVar, Map<String, String> map) {
        String str;
        String x = qVar.mo14647x();
        HashMap hashMap = new HashMap();
        hashMap.putAll(qVar.mo14636l());
        hashMap.putAll(map);
        C5261a aVar = this.f14891a;
        if (aVar != null) {
            str = aVar.mo14589a(x);
            if (str == null) {
                throw new IOException("URL blocked by rewriter: " + x);
            }
        } else {
            str = x;
        }
        HttpURLConnection a = m20369a(new URL(str), qVar);
        for (String str2 : hashMap.keySet()) {
            a.addRequestProperty(str2, (String) hashMap.get(str2));
        }
        m20371a(a, qVar);
        ProtocolVersion protocolVersion = new ProtocolVersion(HttpVersion.HTTP, 1, 1);
        if (a.getResponseCode() != -1) {
            BasicStatusLine basicStatusLine = new BasicStatusLine(protocolVersion, a.getResponseCode(), a.getResponseMessage());
            BasicHttpResponse basicHttpResponse = new BasicHttpResponse(basicStatusLine);
            if (m20372a(qVar.mo14637m(), basicStatusLine.getStatusCode())) {
                basicHttpResponse.setEntity(m20370a(a));
            }
            for (Map.Entry entry : a.getHeaderFields().entrySet()) {
                if (entry.getKey() != null) {
                    basicHttpResponse.addHeader(new BasicHeader((String) entry.getKey(), (String) ((List) entry.getValue()).get(0)));
                }
            }
            return basicHttpResponse;
        }
        throw new IOException("Could not retrieve response code from HttpUrlConnection.");
    }
}
