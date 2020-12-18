package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.C2061y;
import java.lang.Thread;

/* renamed from: com.google.android.gms.internal.measurement.xa */
final class C3913xa implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private final String f11715a;

    /* renamed from: b */
    private final /* synthetic */ C3909wa f11716b;

    public C3913xa(C3909wa waVar, String str) {
        this.f11716b = waVar;
        C2061y.m9067a(str);
        this.f11715a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f11716b.mo10385b().mo10585y().mo10593a(this.f11715a, th);
    }
}
