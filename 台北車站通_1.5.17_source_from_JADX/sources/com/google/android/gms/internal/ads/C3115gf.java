package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C1697X;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.gf */
public final class C3115gf {

    /* renamed from: a */
    private long f9359a;

    /* renamed from: b */
    private long f9360b = Long.MIN_VALUE;

    /* renamed from: c */
    private Object f9361c = new Object();

    public C3115gf(long j) {
        this.f9359a = j;
    }

    /* renamed from: a */
    public final boolean mo9462a() {
        synchronized (this.f9361c) {
            long b = C1697X.m7705l().mo7726b();
            if (this.f9360b + this.f9359a > b) {
                return false;
            }
            this.f9360b = b;
            return true;
        }
    }
}
