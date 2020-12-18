package p101d.p119e.p120a.p121a;

import com.nostra13.universalimageloader.core.download.BaseImageDownloader;
import java.net.URI;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import p101d.p119e.p120a.C5284q;

/* renamed from: d.e.a.a.f */
public class C5256f implements C5259h {

    /* renamed from: a */
    protected final HttpClient f14890a;

    /* renamed from: d.e.a.a.f$a */
    public static final class C5257a extends HttpEntityEnclosingRequestBase {
        public C5257a(String str) {
            setURI(URI.create(str));
        }

        public String getMethod() {
            return HttpPatch.METHOD_NAME;
        }
    }

    public C5256f(HttpClient httpClient) {
        this.f14890a = httpClient;
    }

    /* renamed from: a */
    private static void m20359a(HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase, C5284q<?> qVar) {
        byte[] a = qVar.mo14593a();
        if (a != null) {
            httpEntityEnclosingRequestBase.setEntity(new ByteArrayEntity(a));
        }
    }

    /* renamed from: a */
    private static void m20360a(HttpUriRequest httpUriRequest, Map<String, String> map) {
        for (String next : map.keySet()) {
            httpUriRequest.setHeader(next, map.get(next));
        }
    }

    /* renamed from: b */
    static HttpUriRequest m20361b(C5284q<?> qVar, Map<String, String> map) {
        switch (qVar.mo14637m()) {
            case -1:
                byte[] q = qVar.mo14595q();
                if (q == null) {
                    return new HttpGet(qVar.mo14647x());
                }
                HttpPost httpPost = new HttpPost(qVar.mo14647x());
                httpPost.addHeader("Content-Type", qVar.mo14596r());
                httpPost.setEntity(new ByteArrayEntity(q));
                return httpPost;
            case 0:
                return new HttpGet(qVar.mo14647x());
            case 1:
                HttpPost httpPost2 = new HttpPost(qVar.mo14647x());
                httpPost2.addHeader("Content-Type", qVar.mo14594b());
                m20359a((HttpEntityEnclosingRequestBase) httpPost2, qVar);
                return httpPost2;
            case 2:
                HttpPut httpPut = new HttpPut(qVar.mo14647x());
                httpPut.addHeader("Content-Type", qVar.mo14594b());
                m20359a((HttpEntityEnclosingRequestBase) httpPut, qVar);
                return httpPut;
            case 3:
                return new HttpDelete(qVar.mo14647x());
            case 4:
                return new HttpHead(qVar.mo14647x());
            case 5:
                return new HttpOptions(qVar.mo14647x());
            case 6:
                return new HttpTrace(qVar.mo14647x());
            case 7:
                C5257a aVar = new C5257a(qVar.mo14647x());
                aVar.addHeader("Content-Type", qVar.mo14594b());
                m20359a((HttpEntityEnclosingRequestBase) aVar, qVar);
                return aVar;
            default:
                throw new IllegalStateException("Unknown request method.");
        }
    }

    /* renamed from: a */
    public HttpResponse mo14585a(C5284q<?> qVar, Map<String, String> map) {
        HttpUriRequest b = m20361b(qVar, map);
        m20360a(b, map);
        m20360a(b, qVar.mo14636l());
        mo14586a(b);
        HttpParams params = b.getParams();
        int v = qVar.mo14645v();
        HttpConnectionParams.setConnectionTimeout(params, BaseImageDownloader.DEFAULT_HTTP_CONNECT_TIMEOUT);
        HttpConnectionParams.setSoTimeout(params, v);
        return this.f14890a.execute(b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14586a(HttpUriRequest httpUriRequest) {
    }
}
