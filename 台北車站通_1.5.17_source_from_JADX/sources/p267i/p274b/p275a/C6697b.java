package p267i.p274b.p275a;

import android.os.Bundle;
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
import p267i.p274b.p275a.p276a.C6694a;

/* renamed from: i.b.a.b */
public class C6697b {

    /* renamed from: a */
    private static OkHttpClient f18592a;

    /* renamed from: b */
    public static final MediaType f18593b = MediaType.parse("application/json; charset=utf-8");

    /* renamed from: c */
    public static final MediaType f18594c = MediaType.parse("text/plain; charset=utf-8");

    /* renamed from: d */
    private int f18595d;

    /* renamed from: e */
    protected String f18596e;

    /* renamed from: f */
    protected C6698a f18597f;

    /* renamed from: g */
    protected Bundle f18598g;

    /* renamed from: h */
    protected Callback f18599h;

    /* renamed from: i */
    private Call f18600i;

    /* renamed from: j */
    private C6697b f18601j;

    /* renamed from: k */
    private C6701d f18602k;

    /* renamed from: l */
    private String f18603l;

    /* renamed from: m */
    private int f18604m;

    /* renamed from: n */
    private HashMap<String, String> f18605n;

    /* renamed from: o */
    private String f18606o;

    /* renamed from: i.b.a.b$a */
    public enum C6698a {
        GET,
        POST,
        PUT
    }

    /* renamed from: i.b.a.b$b */
    private class C6699b implements Interceptor {

        /* renamed from: a */
        private String f18611a;

        private C6699b(String str) {
            this.f18611a = str;
        }

        /* synthetic */ C6699b(C6697b bVar, String str, C6693a aVar) {
            this(str);
        }

        public Response intercept(Interceptor.Chain chain) {
            return chain.proceed(chain.request().newBuilder().header("User-Agent", this.f18611a).build());
        }
    }

    protected C6697b(String str, Bundle bundle, C6698a aVar, Callback callback, int i) {
        this(str, aVar, callback, i);
        this.f18598g = bundle;
    }

    private C6697b(String str, C6698a aVar, Callback callback, int i) {
        this.f18595d = 5;
        this.f18598g = null;
        this.f18599h = null;
        this.f18604m = this.f18595d;
        this.f18596e = str;
        this.f18597f = aVar;
        this.f18599h = callback;
        if (callback instanceof C6694a) {
            ((C6694a) callback).mo17145a(this);
        }
        if (f18592a == null) {
            long j = (long) (i == -1 ? this.f18595d : i);
            f18592a = new OkHttpClient.Builder().connectTimeout(j, TimeUnit.SECONDS).writeTimeout(j, TimeUnit.SECONDS).readTimeout(j, TimeUnit.SECONDS).build();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m25434c() {
        RequestBody requestBody = null;
        if (this.f18603l != null) {
            f18592a.networkInterceptors().add(new C6699b(this, this.f18603l, (C6693a) null));
        }
        if (this.f18597f != C6698a.GET) {
            String str = this.f18606o;
            if (str != null) {
                requestBody = RequestBody.create(f18593b, str);
            } else {
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (this.f18598g != null) {
                        for (String str2 : this.f18598g.keySet()) {
                            jSONObject.put(str2, this.f18598g.get(str2));
                        }
                        requestBody = RequestBody.create(f18593b, jSONObject.toString());
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        } else if (this.f18598g != null) {
            HttpUrl.Builder newBuilder = HttpUrl.parse(this.f18596e).newBuilder();
            for (String str3 : this.f18598g.keySet()) {
                newBuilder.addQueryParameter(str3, (String) this.f18598g.get(str3));
            }
            this.f18596e = newBuilder.toString();
        }
        Request.Builder builder = new Request.Builder();
        builder.url(this.f18596e);
        C6698a aVar = this.f18597f;
        if (aVar == C6698a.POST) {
            builder.post(requestBody);
        } else if (aVar == C6698a.PUT) {
            builder.put(requestBody);
        }
        HashMap<String, String> hashMap = this.f18605n;
        if (hashMap != null) {
            for (String next : hashMap.keySet()) {
                builder.addHeader(next, this.f18605n.get(next));
            }
        }
        this.f18600i = f18592a.newCall(builder.build());
        this.f18600i.enqueue(this.f18599h);
    }

    /* renamed from: a */
    public void mo17148a() {
        new C6693a(this).start();
    }

    /* renamed from: a */
    public void mo17149a(String str, String str2) {
        if (this.f18605n == null) {
            this.f18605n = new HashMap<>();
        }
        this.f18605n.put(str, str2);
    }

    /* renamed from: a */
    public boolean mo17150a(C6697b bVar, boolean z) {
        C6701d dVar = this.f18602k;
        if (dVar == null) {
            return false;
        }
        dVar.mo17152a(bVar, z);
        return true;
    }

    /* renamed from: b */
    public C6697b mo17151b() {
        return this.f18601j;
    }
}
