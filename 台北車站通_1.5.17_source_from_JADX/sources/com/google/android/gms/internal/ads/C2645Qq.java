package com.google.android.gms.internal.ads;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.ads.Qq */
final class C2645Qq extends ContentObserver {

    /* renamed from: a */
    private final /* synthetic */ C2554Nq f8159a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2645Qq(C2554Nq nq, Handler handler) {
        super(handler);
        this.f8159a = nq;
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        this.f8159a.mo8594d();
    }
}
