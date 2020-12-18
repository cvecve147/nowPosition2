package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* renamed from: com.google.android.gms.internal.ads.De */
final /* synthetic */ class C2255De implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final C2169Ae f6888a;

    /* renamed from: b */
    private final String f6889b;

    C2255De(C2169Ae ae, String str) {
        this.f6888a = ae;
        this.f6889b = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f6888a.mo7810a(this.f6889b, dialogInterface, i);
    }
}
