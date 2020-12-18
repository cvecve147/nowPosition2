package com.google.android.gms.internal.ads;

import java.lang.Thread;

/* renamed from: com.google.android.gms.internal.ads.Ha */
final class C2366Ha implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private final /* synthetic */ Thread.UncaughtExceptionHandler f7119a;

    /* renamed from: b */
    private final /* synthetic */ C2308Fa f7120b;

    C2366Ha(C2308Fa fa, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f7120b = fa;
        this.f7119a = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            this.f7120b.mo8062a(thread, th);
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f7119a;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        } catch (Throwable th2) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f7119a;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
            throw th2;
        }
    }
}
