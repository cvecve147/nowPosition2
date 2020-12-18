package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.C2064k;
import com.google.android.gms.internal.ads.C3185it;
import p101d.p129g.p131b.p132a.p134b.C5468d;

/* renamed from: com.google.android.gms.internal.ads.kt */
final class C3247kt extends C3185it.C3186a<C2357Gt> {

    /* renamed from: b */
    private final /* synthetic */ Context f9703b;

    /* renamed from: c */
    private final /* synthetic */ zzjn f9704c;

    /* renamed from: d */
    private final /* synthetic */ String f9705d;

    /* renamed from: e */
    private final /* synthetic */ C3185it f9706e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3247kt(C3185it itVar, Context context, zzjn zzjn, String str) {
        super();
        this.f9706e = itVar;
        this.f9703b = context;
        this.f9704c = zzjn;
        this.f9705d = str;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9568a() {
        C2357Gt a = this.f9706e.f9507c.mo9195a(this.f9703b, this.f9704c, this.f9705d, (C2533Mz) null, 3);
        if (a != null) {
            return a;
        }
        C3185it.m12648a(this.f9703b, "search");
        return new C3505tu();
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9569a(C2706St st) {
        return st.createSearchAdManager(C5468d.m20961a(this.f9703b), this.f9704c, this.f9705d, C2064k.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }
}
