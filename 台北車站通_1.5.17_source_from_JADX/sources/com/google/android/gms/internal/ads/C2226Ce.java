package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* renamed from: com.google.android.gms.internal.ads.Ce */
final /* synthetic */ class C2226Ce implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final C2169Ae f6797a;

    /* renamed from: b */
    private final int f6798b;

    /* renamed from: c */
    private final int f6799c;

    /* renamed from: d */
    private final int f6800d;

    C2226Ce(C2169Ae ae, int i, int i2, int i3) {
        this.f6797a = ae;
        this.f6798b = i;
        this.f6799c = i2;
        this.f6800d = i3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f6797a.mo7807a(this.f6798b, this.f6799c, this.f6800d, dialogInterface, i);
    }
}
