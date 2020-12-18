package com.google.android.gms.internal.ads;

import android.content.Context;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.ez */
public final class C3078ez {

    /* renamed from: a */
    private final Object f9121a = new Object();

    /* renamed from: b */
    private C3282lz f9122b;

    /* renamed from: a */
    public final C3282lz mo9416a(Context context, zzang zzang) {
        C3282lz lzVar;
        synchronized (this.f9121a) {
            if (this.f9122b == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                this.f9122b = new C3282lz(context, zzang, (String) C3390pt.m13458f().mo8515a(C2558Nu.f7863b));
            }
            lzVar = this.f9122b;
        }
        return lzVar;
    }
}
