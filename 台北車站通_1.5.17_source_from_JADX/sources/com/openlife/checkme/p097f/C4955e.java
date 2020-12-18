package com.openlife.checkme.p097f;

import com.openlife.checkme.C4968s;
import com.openlife.checkme.p094d.C4947j;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import p101d.p187h.p188a.p189a.p190a.C5930g;
import p263h.C6616c;
import p263h.C6618d;
import p263h.C6652r;
import p263h.p264a.p265a.C6593a;

/* renamed from: com.openlife.checkme.f.e */
public class C4955e {

    /* renamed from: a */
    private static C4955e f14124a;

    /* renamed from: b */
    private static C4951a f14125b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f14126c = C4947j.m19536a().mo13554e().mo13533e();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f14127d = C4947j.m19536a().mo13554e().mo13542h();

    /* renamed from: a */
    public static C4955e m19580a() {
        if (f14124a == null) {
            f14124a = new C4955e();
        }
        return f14124a;
    }

    /* renamed from: a */
    private <T> T m19581a(Class<T> cls) {
        C6652r.C6653a aVar = new C6652r.C6653a();
        aVar.mo17069a("https://api.checkme.com.tw/");
        aVar.mo17072a(m19584c());
        aVar.mo17068a((C6618d.C6619a) C6593a.m25181a());
        aVar.mo17067a((C6616c.C6617a) C5930g.m22438a());
        return aVar.mo17073a().mo17062a(cls);
    }

    /* renamed from: c */
    private OkHttpClient m19584c() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        C4954d dVar = new C4954d(this);
        C4968s.m19590a(builder);
        builder.connectTimeout(15, TimeUnit.SECONDS);
        builder.readTimeout(15, TimeUnit.SECONDS);
        builder.addInterceptor(dVar);
        return builder.build();
    }

    /* renamed from: a */
    public void mo13604a(String str) {
        this.f14126c = str;
        C4947j.m19536a().mo13554e().mo13541g(str);
    }

    /* renamed from: b */
    public C4951a mo13605b() {
        C4951a aVar = f14125b;
        return aVar != null ? aVar : (C4951a) m19581a(C4951a.class);
    }

    /* renamed from: b */
    public void mo13606b(String str) {
        this.f14127d = str;
        C4947j.m19536a().mo13554e().mo13545i(str);
    }
}
