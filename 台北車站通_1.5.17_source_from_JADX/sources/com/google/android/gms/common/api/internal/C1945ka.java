package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.api.internal.ka */
final class C1945ka implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C1943ja f6283a;

    C1945ka(C1943ja jaVar) {
        this.f6283a = jaVar;
    }

    public final void run() {
        this.f6283a.f6281h.mo7446b(new ConnectionResult(4));
    }
}
