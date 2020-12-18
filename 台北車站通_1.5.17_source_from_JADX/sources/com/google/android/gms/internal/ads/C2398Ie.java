package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* renamed from: com.google.android.gms.internal.ads.Ie */
final class C2398Ie implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f7249a;

    /* renamed from: b */
    private final /* synthetic */ String f7250b;

    /* renamed from: c */
    private final /* synthetic */ boolean f7251c;

    /* renamed from: d */
    private final /* synthetic */ boolean f7252d;

    C2398Ie(C2370He he, Context context, String str, boolean z, boolean z2) {
        this.f7249a = context;
        this.f7250b = str;
        this.f7251c = z;
        this.f7252d = z2;
    }

    public final void run() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f7249a);
        builder.setMessage(this.f7250b);
        builder.setTitle(this.f7251c ? "Error" : "Info");
        if (this.f7252d) {
            builder.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builder.setPositiveButton("Learn More", new C2426Je(this));
            builder.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builder.create().show();
    }
}
