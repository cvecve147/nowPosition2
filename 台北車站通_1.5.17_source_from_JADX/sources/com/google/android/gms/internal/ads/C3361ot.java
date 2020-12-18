package com.google.android.gms.internal.ads;

import android.app.Activity;
import com.google.android.gms.internal.ads.C3185it;
import p101d.p129g.p131b.p132a.p134b.C5468d;

/* renamed from: com.google.android.gms.internal.ads.ot */
final class C3361ot extends C3185it.C3186a<C3425r> {

    /* renamed from: b */
    private final /* synthetic */ Activity f9968b;

    /* renamed from: c */
    private final /* synthetic */ C3185it f9969c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3361ot(C3185it itVar, Activity activity) {
        super();
        this.f9969c = itVar;
        this.f9968b = activity;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9568a() {
        C3425r a = this.f9969c.f9512h.mo9921a(this.f9968b);
        if (a != null) {
            return a;
        }
        C3185it.m12648a(this.f9968b, "ad_overlay");
        return null;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9569a(C2706St st) {
        return st.createAdOverlay(C5468d.m20961a(this.f9968b));
    }
}
