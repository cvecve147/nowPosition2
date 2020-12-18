package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* renamed from: com.google.android.gms.internal.ads.i */
final class C3164i implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ C3108g f9447a;

    C3164i(C3108g gVar) {
        this.f9447a = gVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f9447a.mo9766a("User canceled the download.");
    }
}
