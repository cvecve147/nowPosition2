package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.C2064k;
import com.google.android.gms.internal.ads.C3185it;
import p101d.p129g.p131b.p132a.p134b.C5468d;

/* renamed from: com.google.android.gms.internal.ads.jt */
final class C3219jt extends C3185it.C3186a<C2357Gt> {

    /* renamed from: b */
    private final /* synthetic */ Context f9656b;

    /* renamed from: c */
    private final /* synthetic */ zzjn f9657c;

    /* renamed from: d */
    private final /* synthetic */ String f9658d;

    /* renamed from: e */
    private final /* synthetic */ C2533Mz f9659e;

    /* renamed from: f */
    private final /* synthetic */ C3185it f9660f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3219jt(C3185it itVar, Context context, zzjn zzjn, String str, C2533Mz mz) {
        super();
        this.f9660f = itVar;
        this.f9656b = context;
        this.f9657c = zzjn;
        this.f9658d = str;
        this.f9659e = mz;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9568a() {
        C2357Gt a = this.f9660f.f9507c.mo9195a(this.f9656b, this.f9657c, this.f9658d, this.f9659e, 1);
        if (a != null) {
            return a;
        }
        C3185it.m12648a(this.f9656b, "banner");
        return new C3505tu();
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9569a(C2706St st) {
        return st.createBannerAdManager(C5468d.m20961a(this.f9656b), this.f9657c, this.f9658d, this.f9659e, C2064k.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }
}
