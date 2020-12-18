package com.google.android.gms.internal.ads;

import android.text.TextUtils;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Su */
public final class C2707Su {
    /* renamed from: a */
    public static void m11216a(C2649Qu qu, C2621Pu pu) {
        if (pu.mo8699a() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        } else if (!TextUtils.isEmpty(pu.mo8700b())) {
            qu.mo8754a(pu.mo8699a(), pu.mo8700b(), pu.mo8701c(), pu.mo8702d());
        } else {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
    }
}
