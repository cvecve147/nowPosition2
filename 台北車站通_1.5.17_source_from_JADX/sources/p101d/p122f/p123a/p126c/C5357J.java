package p101d.p122f.p123a.p126c;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
import p208e.p209a.p210a.p211a.C6199f;

/* renamed from: d.f.a.c.J */
class C5357J implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private final C5358a f15142a;

    /* renamed from: b */
    private final Thread.UncaughtExceptionHandler f15143b;

    /* renamed from: c */
    private final AtomicBoolean f15144c = new AtomicBoolean(false);

    /* renamed from: d.f.a.c.J$a */
    interface C5358a {
        /* renamed from: a */
        void mo14777a(Thread thread, Throwable th);
    }

    public C5357J(C5358a aVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f15142a = aVar;
        this.f15143b = uncaughtExceptionHandler;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo14775a() {
        return this.f15144c.get();
    }

    public void uncaughtException(Thread thread, Throwable th) {
        this.f15144c.set(true);
        try {
            this.f15142a.mo14777a(thread, th);
        } catch (Exception e) {
            C6199f.m23420f().mo16266b("CrashlyticsCore", "An error occurred in the uncaught exception handler", e);
        } catch (Throwable th2) {
            C6199f.m23420f().mo16269d("CrashlyticsCore", "Crashlytics completed exception processing. Invoking default exception handler.");
            this.f15143b.uncaughtException(thread, th);
            this.f15144c.set(false);
            throw th2;
        }
        C6199f.m23420f().mo16269d("CrashlyticsCore", "Crashlytics completed exception processing. Invoking default exception handler.");
        this.f15143b.uncaughtException(thread, th);
        this.f15144c.set(false);
    }
}
