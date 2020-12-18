package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* renamed from: com.google.android.gms.internal.ads.c */
final class C2993c implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ C2507MA f8985a;

    C2993c(C2507MA ma) {
        this.f8985a = ma;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f8985a.mo9766a("Operation denied by user.");
    }
}
