package com.google.android.gms.internal.ads;

import android.content.Context;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.lz */
public final class C3282lz {

    /* renamed from: a */
    private static final C2482Le<C3452ry> f9766a = new C3310mz();

    /* renamed from: b */
    private static final C2482Le<C3452ry> f9767b = new C3339nz();

    /* renamed from: c */
    private final C2275Dy f9768c;

    public C3282lz(Context context, zzang zzang, String str) {
        this.f9768c = new C2275Dy(context, zzang, str, f9766a, f9767b);
    }

    /* renamed from: a */
    public final <I, O> C3050dz<I, O> mo9706a(String str, C3135gz<I> gzVar, C3107fz<O> fzVar) {
        return new C3367oz(this.f9768c, str, gzVar, fzVar);
    }
}
