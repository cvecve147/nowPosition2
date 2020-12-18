package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.C2064k;
import com.google.android.gms.internal.ads.C3185it;
import p101d.p129g.p131b.p132a.p134b.C5468d;

/* renamed from: com.google.android.gms.internal.ads.mt */
final class C3304mt extends C3185it.C3186a<C2213Bt> {

    /* renamed from: b */
    private final /* synthetic */ Context f9821b;

    /* renamed from: c */
    private final /* synthetic */ String f9822c;

    /* renamed from: d */
    private final /* synthetic */ C2533Mz f9823d;

    /* renamed from: e */
    private final /* synthetic */ C3185it f9824e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3304mt(C3185it itVar, Context context, String str, C2533Mz mz) {
        super();
        this.f9824e = itVar;
        this.f9821b = context;
        this.f9822c = str;
        this.f9823d = mz;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9568a() {
        C2213Bt a = this.f9824e.f9508d.mo9173a(this.f9821b, this.f9822c, this.f9823d);
        if (a != null) {
            return a;
        }
        C3185it.m12648a(this.f9821b, "native_ad");
        return new C3391pu();
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9569a(C2706St st) {
        return st.createAdLoaderBuilder(C5468d.m20961a(this.f9821b), this.f9822c, this.f9823d, C2064k.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }
}
