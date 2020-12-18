package p267i.p274b.p277b.p278a;

import android.os.Bundle;
import com.nostra13.universalimageloader.core.download.BaseImageDownloader;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;
import p267i.p274b.p277b.p278a.C6711d;
import p267i.p274b.p277b.p278a.p279a.C6704a;

/* renamed from: i.b.b.a.b */
public class C6707b {

    /* renamed from: a */
    private static OkHttpClient f18624a;

    /* renamed from: b */
    public static final MediaType f18625b = MediaType.parse("application/json; charset=utf-8");

    /* renamed from: c */
    public static final MediaType f18626c = MediaType.parse("text/plain; charset=utf-8");

    /* renamed from: d */
    private int f18627d;

    /* renamed from: e */
    protected String f18628e;

    /* renamed from: f */
    protected C6708a f18629f;

    /* renamed from: g */
    protected Bundle f18630g;

    /* renamed from: h */
    protected Callback f18631h;

    /* renamed from: i */
    private Call f18632i;

    /* renamed from: j */
    private C6707b f18633j;

    /* renamed from: k */
    private C6711d.C6712a f18634k;

    /* renamed from: l */
    private String f18635l;

    /* renamed from: m */
    private int f18636m;

    /* renamed from: n */
    private HashMap<String, String> f18637n;

    /* renamed from: o */
    private String f18638o;

    /* renamed from: i.b.b.a.b$a */
    public enum C6708a {
        GET,
        POST,
        PUT,
        DELETE
    }

    /* renamed from: i.b.b.a.b$b */
    private class C6709b implements Interceptor {

        /* renamed from: a */
        private String f18644a;

        private C6709b(String str) {
            this.f18644a = str;
        }

        /* synthetic */ C6709b(C6707b bVar, String str, C6703a aVar) {
            this(str);
        }

        public Response intercept(Interceptor.Chain chain) {
            return chain.proceed(chain.request().newBuilder().header("User-Agent", this.f18644a).build());
        }
    }

    protected C6707b(String str, Bundle bundle, C6708a aVar, Callback callback, int i) {
        this(str, aVar, callback, i);
        this.f18630g = bundle;
    }

    private C6707b(String str, C6708a aVar, Callback callback, int i) {
        this.f18627d = BaseImageDownloader.DEFAULT_HTTP_CONNECT_TIMEOUT;
        this.f18630g = null;
        this.f18631h = null;
        this.f18636m = this.f18627d;
        this.f18628e = str;
        this.f18629f = aVar;
        this.f18631h = callback;
        if (callback instanceof C6704a) {
            ((C6704a) callback).mo17155a(this);
        }
        if (f18624a == null) {
            long j = (long) (i == -1 ? this.f18627d : i);
            f18624a = new OkHttpClient.Builder().connectTimeout(j, TimeUnit.SECONDS).writeTimeout(j, TimeUnit.SECONDS).readTimeout(j, TimeUnit.SECONDS).build();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m25450e() {
        RequestBody requestBody = null;
        if (this.f18635l != null) {
            f18624a.networkInterceptors().add(new C6709b(this, this.f18635l, (C6703a) null));
        }
        C6708a aVar = this.f18629f;
        if (aVar == C6708a.GET) {
            if (this.f18630g != null) {
                HttpUrl.Builder newBuilder = HttpUrl.parse(this.f18628e).newBuilder();
                for (String str : this.f18630g.keySet()) {
                    newBuilder.addQueryParameter(str, (String) this.f18630g.get(str));
                }
                this.f18628e = newBuilder.toString();
            }
        } else if (aVar == C6708a.POST || aVar == C6708a.PUT) {
            String str2 = this.f18638o;
            if (str2 != null) {
                requestBody = RequestBody.create(f18625b, str2);
            } else {
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (this.f18630g != null) {
                        for (String str3 : this.f18630g.keySet()) {
                            jSONObject.put(str3, this.f18630g.get(str3));
                        }
                        requestBody = RequestBody.create(f18625b, jSONObject.toString());
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        Request.Builder builder = new Request.Builder();
        builder.url(this.f18628e);
        C6708a aVar2 = this.f18629f;
        if (aVar2 == C6708a.POST) {
            builder.post(requestBody);
        } else if (aVar2 == C6708a.PUT) {
            builder.put(requestBody);
        } else if (aVar2 == C6708a.DELETE) {
            builder.delete();
        }
        HashMap<String, String> hashMap = this.f18637n;
        if (hashMap != null) {
            for (String next : hashMap.keySet()) {
                builder.addHeader(next, this.f18637n.get(next));
            }
        }
        this.f18632i = f18624a.newCall(builder.build());
        this.f18632i.enqueue(this.f18631h);
    }

    /* renamed from: a */
    public void mo17157a() {
        new C6703a(this).start();
    }

    /* renamed from: a */
    public void mo17158a(C6711d.C6712a aVar) {
        this.f18634k = aVar;
    }

    /* renamed from: a */
    public void mo17159a(String str, String str2) {
        if (this.f18637n == null) {
            this.f18637n = new HashMap<>();
        }
        this.f18637n.put(str, str2);
    }

    /* renamed from: a */
    public boolean mo17160a(C6707b bVar, boolean z) {
        C6711d.C6712a aVar = this.f18634k;
        if (aVar == null) {
            return false;
        }
        aVar.mo17168a(bVar, z);
        return true;
    }

    /* renamed from: b */
    public Bundle mo17161b() {
        return this.f18630g;
    }

    /* renamed from: c */
    public C6707b mo17162c() {
        return this.f18633j;
    }

    /* renamed from: d */
    public void mo17163d() {
        Call call = this.f18632i;
        if (call != null) {
            call.cancel();
        }
    }
}
