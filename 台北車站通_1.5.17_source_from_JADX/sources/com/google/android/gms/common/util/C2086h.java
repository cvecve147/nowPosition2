package com.google.android.gms.common.util;

import android.os.SystemClock;

/* renamed from: com.google.android.gms.common.util.h */
public class C2086h implements C2083e {

    /* renamed from: a */
    private static final C2086h f6555a = new C2086h();

    private C2086h() {
    }

    /* renamed from: d */
    public static C2083e m9144d() {
        return f6555a;
    }

    /* renamed from: a */
    public long mo7725a() {
        return System.currentTimeMillis();
    }

    /* renamed from: b */
    public long mo7726b() {
        return SystemClock.elapsedRealtime();
    }

    /* renamed from: c */
    public long mo7727c() {
        return System.nanoTime();
    }
}
