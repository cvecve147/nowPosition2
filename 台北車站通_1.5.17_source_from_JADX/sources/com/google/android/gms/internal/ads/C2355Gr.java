package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.Gr */
final class C2355Gr implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ View f7093a;

    /* renamed from: b */
    private final /* synthetic */ C2325Fr f7094b;

    C2355Gr(C2325Fr fr, View view) {
        this.f7094b = fr;
        this.f7093a = view;
    }

    public final void run() {
        this.f7094b.mo8095a(this.f7093a);
    }
}
