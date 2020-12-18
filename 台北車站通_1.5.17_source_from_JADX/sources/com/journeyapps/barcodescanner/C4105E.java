package com.journeyapps.barcodescanner;

import android.os.Looper;

/* renamed from: com.journeyapps.barcodescanner.E */
public class C4105E {
    /* renamed from: a */
    public static void m16407a() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Must be called from the main thread.");
        }
    }
}
