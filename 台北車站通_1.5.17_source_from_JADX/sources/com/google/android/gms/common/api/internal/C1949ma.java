package com.google.android.gms.common.api.internal;

import com.google.android.gms.signin.internal.SignInResponse;

/* renamed from: com.google.android.gms.common.api.internal.ma */
final class C1949ma implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ SignInResponse f6285a;

    /* renamed from: b */
    private final /* synthetic */ C1943ja f6286b;

    C1949ma(C1943ja jaVar, SignInResponse signInResponse) {
        this.f6286b = jaVar;
        this.f6285a = signInResponse;
    }

    public final void run() {
        this.f6286b.m8604b(this.f6285a);
    }
}
