package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.net.Uri;
import com.google.android.gms.ads.internal.C1697X;

/* renamed from: com.google.android.gms.internal.ads.Je */
final class C2426Je implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ C2398Ie f7309a;

    C2426Je(C2398Ie ie) {
        this.f7309a = ie;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C1697X.m7698e();
        C3114ge.m12408a(this.f7309a.f7249a, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
