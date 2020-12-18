package com.google.android.gms.internal.ads;

import java.lang.Thread;

/* renamed from: com.google.android.gms.internal.ads.Ga */
final class C2336Ga implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private final /* synthetic */ Thread.UncaughtExceptionHandler f7042a;

    /* renamed from: b */
    private final /* synthetic */ C2308Fa f7043b;

    C2336Ga(C2308Fa fa, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f7043b = fa;
        this.f7042a = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            this.f7043b.mo8062a(thread, th);
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f7042a;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        } catch (Throwable th2) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f7042a;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
            throw th2;
        }
    }
}
