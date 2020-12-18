package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C1690P;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.ads.internal.C1804ua;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.Dh */
final /* synthetic */ class C2258Dh implements Callable {

    /* renamed from: a */
    private final Context f6891a;

    /* renamed from: b */
    private final C3146hi f6892b;

    /* renamed from: c */
    private final String f6893c;

    /* renamed from: d */
    private final boolean f6894d;

    /* renamed from: e */
    private final boolean f6895e;

    /* renamed from: f */
    private final C2209Bp f6896f;

    /* renamed from: g */
    private final zzang f6897g;

    /* renamed from: h */
    private final C2930_u f6898h;

    /* renamed from: i */
    private final C1690P f6899i;

    /* renamed from: j */
    private final C1804ua f6900j;

    /* renamed from: k */
    private final C3275ls f6901k;

    C2258Dh(Context context, C3146hi hiVar, String str, boolean z, boolean z2, C2209Bp bp, zzang zzang, C2930_u _uVar, C1690P p, C1804ua uaVar, C3275ls lsVar) {
        this.f6891a = context;
        this.f6892b = hiVar;
        this.f6893c = str;
        this.f6894d = z;
        this.f6895e = z2;
        this.f6896f = bp;
        this.f6897g = zzang;
        this.f6898h = _uVar;
        this.f6899i = p;
        this.f6900j = uaVar;
        this.f6901k = lsVar;
    }

    public final Object call() {
        Context context = this.f6891a;
        C3146hi hiVar = this.f6892b;
        String str = this.f6893c;
        boolean z = this.f6894d;
        boolean z2 = this.f6895e;
        C2343Gh gh = new C2343Gh(C2373Hh.m10068a(context, hiVar, str, z, z2, this.f6896f, this.f6897g, this.f6898h, this.f6899i, this.f6900j, this.f6901k));
        gh.setWebViewClient(C1697X.m7700g().mo9715a((C3520uh) gh, z2));
        gh.setWebChromeClient(new C3292mh(gh));
        return gh;
    }
}
