package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.ads.internal.C1697X;

/* renamed from: com.google.android.gms.internal.ads.NA */
final class C2535NA implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ C2507MA f7630a;

    C2535NA(C2507MA ma) {
        this.f7630a = ma;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent a = this.f7630a.mo8522a();
        C1697X.m7698e();
        C3114ge.m12407a(this.f7630a.f7551d, a);
    }
}
