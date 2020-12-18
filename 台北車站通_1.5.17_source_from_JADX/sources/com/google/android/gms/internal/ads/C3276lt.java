package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.C2064k;
import com.google.android.gms.internal.ads.C3185it;
import p101d.p129g.p131b.p132a.p134b.C5468d;

/* renamed from: com.google.android.gms.internal.ads.lt */
final class C3276lt extends C3185it.C3186a<C2357Gt> {

    /* renamed from: b */
    private final /* synthetic */ Context f9756b;

    /* renamed from: c */
    private final /* synthetic */ zzjn f9757c;

    /* renamed from: d */
    private final /* synthetic */ String f9758d;

    /* renamed from: e */
    private final /* synthetic */ C2533Mz f9759e;

    /* renamed from: f */
    private final /* synthetic */ C3185it f9760f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3276lt(C3185it itVar, Context context, zzjn zzjn, String str, C2533Mz mz) {
        super();
        this.f9760f = itVar;
        this.f9756b = context;
        this.f9757c = zzjn;
        this.f9758d = str;
        this.f9759e = mz;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9568a() {
        C2357Gt a = this.f9760f.f9507c.mo9195a(this.f9756b, this.f9757c, this.f9758d, this.f9759e, 2);
        if (a != null) {
            return a;
        }
        C3185it.m12648a(this.f9756b, "interstitial");
        return new C3505tu();
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9569a(C2706St st) {
        return st.createInterstitialAdManager(C5468d.m20961a(this.f9756b), this.f9757c, this.f9758d, this.f9759e, C2064k.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }
}
