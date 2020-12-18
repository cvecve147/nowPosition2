package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C1690P;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.ads.internal.C1804ua;

/* renamed from: com.google.android.gms.internal.ads.Ch */
final /* synthetic */ class C2229Ch implements C2341Gf {

    /* renamed from: a */
    private final Context f6802a;

    /* renamed from: b */
    private final C2209Bp f6803b;

    /* renamed from: c */
    private final zzang f6804c;

    /* renamed from: d */
    private final C1804ua f6805d;

    /* renamed from: e */
    private final String f6806e;

    C2229Ch(Context context, C2209Bp bp, zzang zzang, C1804ua uaVar, String str) {
        this.f6802a = context;
        this.f6803b = bp;
        this.f6804c = zzang;
        this.f6805d = uaVar;
        this.f6806e = str;
    }

    /* renamed from: b */
    public final C2804Wf mo6904b(Object obj) {
        Context context = this.f6802a;
        C2209Bp bp = this.f6803b;
        zzang zzang = this.f6804c;
        C1804ua uaVar = this.f6805d;
        String str = this.f6806e;
        C1697X.m7699f();
        C3520uh a = C2201Bh.m9441a(context, C3146hi.m12526b(), "", false, false, bp, zzang, (C2930_u) null, (C1690P) null, uaVar, C3275ls.m13004a());
        C3087fg c = C3087fg.m12317c(a);
        a.mo8182mb().mo9230a((C3003ci) new C2286Eh(c));
        a.loadUrl(str);
        return c;
    }
}
