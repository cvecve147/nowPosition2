package com.google.android.gms.internal.location;

import android.os.Looper;
import com.google.android.gms.common.internal.C2061y;

/* renamed from: com.google.android.gms.internal.location.x */
public final class C3711x {
    /* renamed from: a */
    public static Looper m14830a() {
        C2061y.m9078b(Looper.myLooper() != null, "Can't create handler inside thread that has not called Looper.prepare()");
        return Looper.myLooper();
    }
}
