package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C1690P;
import com.google.android.gms.ads.internal.C1804ua;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.oi */
final /* synthetic */ class C3350oi implements Callable {

    /* renamed from: a */
    private final Context f9948a;

    /* renamed from: b */
    private final C3146hi f9949b;

    /* renamed from: c */
    private final String f9950c;

    /* renamed from: d */
    private final boolean f9951d;

    /* renamed from: e */
    private final boolean f9952e;

    /* renamed from: f */
    private final C2209Bp f9953f;

    /* renamed from: g */
    private final zzang f9954g;

    /* renamed from: h */
    private final C2930_u f9955h;

    /* renamed from: i */
    private final C1690P f9956i;

    /* renamed from: j */
    private final C1804ua f9957j;

    /* renamed from: k */
    private final C3275ls f9958k;

    C3350oi(Context context, C3146hi hiVar, String str, boolean z, boolean z2, C2209Bp bp, zzang zzang, C2930_u _uVar, C1690P p, C1804ua uaVar, C3275ls lsVar) {
        this.f9948a = context;
        this.f9949b = hiVar;
        this.f9950c = str;
        this.f9951d = z;
        this.f9952e = z2;
        this.f9953f = bp;
        this.f9954g = zzang;
        this.f9955h = _uVar;
        this.f9956i = p;
        this.f9957j = uaVar;
        this.f9958k = lsVar;
    }

    public final Object call() {
        Context context = this.f9948a;
        C3146hi hiVar = this.f9949b;
        String str = this.f9950c;
        boolean z = this.f9951d;
        boolean z2 = this.f9952e;
        C3378pi a = C3378pi.m13341a(context, hiVar, str, z, z2, this.f9953f, this.f9954g, this.f9955h, this.f9956i, this.f9957j, this.f9958k);
        C2343Gh gh = new C2343Gh(a);
        C3174ii iiVar = new C3174ii(gh, z2);
        a.setWebChromeClient(new C3292mh(gh));
        a.mo9974a((C3579wi) iiVar);
        a.mo9973a((C2202Bi) iiVar);
        a.mo9972a((C2173Ai) iiVar);
        a.mo9975a((C3635yi) iiVar);
        a.mo9880a(iiVar);
        return gh;
    }
}
