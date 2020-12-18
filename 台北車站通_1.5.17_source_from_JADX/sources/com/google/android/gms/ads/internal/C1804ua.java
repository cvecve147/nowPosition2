package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.internal.ads.C2314Fg;
import com.google.android.gms.internal.ads.C2478La;
import com.google.android.gms.internal.ads.C2514Mg;
import com.google.android.gms.internal.ads.C2914_g;
import com.google.android.gms.internal.ads.C3231kd;
import com.google.android.gms.internal.ads.C3235kh;
import com.google.android.gms.internal.ads.C3259ld;
import com.google.android.gms.internal.ads.C3373pd;
import com.google.android.gms.internal.ads.C3389ps;

@C2478La
/* renamed from: com.google.android.gms.ads.internal.ua */
public final class C1804ua {

    /* renamed from: a */
    public final C3235kh f5897a;

    /* renamed from: b */
    public final C2314Fg f5898b;

    /* renamed from: c */
    public final C3373pd f5899c;

    /* renamed from: d */
    public final C3389ps f5900d;

    private C1804ua(C3235kh khVar, C2314Fg fg, C3373pd pdVar, C3389ps psVar) {
        this.f5897a = khVar;
        this.f5898b = fg;
        this.f5899c = pdVar;
        this.f5900d = psVar;
    }

    /* renamed from: a */
    public static C1804ua m8050a(Context context) {
        return new C1804ua(new C2914_g(), new C2514Mg(), new C3231kd(new C3259ld()), new C3389ps(context));
    }
}
