package com.google.android.gms.internal.ads;

import java.util.Map;
import org.apache.http.client.methods.HttpGet;

/* renamed from: com.google.android.gms.internal.ads.Ze */
public final class C2886Ze extends C2216Bw<C2272Dv> {

    /* renamed from: p */
    private final C3116gg<C2272Dv> f8682p;

    /* renamed from: q */
    private final Map<String, String> f8683q;

    /* renamed from: r */
    private final C3548vf f8684r;

    public C2886Ze(String str, C3116gg<C2272Dv> ggVar) {
        this(str, (Map<String, String>) null, ggVar);
    }

    private C2886Ze(String str, Map<String, String> map, C3116gg<C2272Dv> ggVar) {
        super(0, str, new C2912_e(ggVar));
        this.f8683q = null;
        this.f8682p = ggVar;
        this.f8684r = new C3548vf();
        this.f8684r.mo10123a(str, HttpGet.METHOD_NAME, (Map<String, ?>) null, (byte[]) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C3652yz<C2272Dv> mo7900a(C2272Dv dv) {
        return C3652yz.m14676a(dv, C3605xg.m14418a(dv));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo7905a(Object obj) {
        C2272Dv dv = (C2272Dv) obj;
        this.f8684r.mo10126a((Map<String, ?>) dv.f6921c, dv.f6919a);
        C3548vf vfVar = this.f8684r;
        byte[] bArr = dv.f6920b;
        if (C3548vf.m14223a() && bArr != null) {
            vfVar.mo10127a(bArr);
        }
        this.f8682p.mo9464b(dv);
    }
}
