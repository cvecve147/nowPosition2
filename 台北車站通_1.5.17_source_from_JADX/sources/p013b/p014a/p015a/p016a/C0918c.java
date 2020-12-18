package p013b.p014a.p015a.p016a;

import java.util.concurrent.Executor;

/* renamed from: b.a.a.a.c */
public class C0918c extends C0920e {

    /* renamed from: a */
    private static volatile C0918c f3722a;

    /* renamed from: b */
    private static final Executor f3723b = new C0916a();

    /* renamed from: c */
    private static final Executor f3724c = new C0917b();

    /* renamed from: d */
    private C0920e f3725d = this.f3726e;

    /* renamed from: e */
    private C0920e f3726e = new C0919d();

    private C0918c() {
    }

    /* renamed from: b */
    public static C0918c m5203b() {
        if (f3722a != null) {
            return f3722a;
        }
        synchronized (C0918c.class) {
            if (f3722a == null) {
                f3722a = new C0918c();
            }
        }
        return f3722a;
    }

    /* renamed from: a */
    public void mo4795a(Runnable runnable) {
        this.f3725d.mo4795a(runnable);
    }

    /* renamed from: a */
    public boolean mo4796a() {
        return this.f3725d.mo4796a();
    }

    /* renamed from: b */
    public void mo4797b(Runnable runnable) {
        this.f3725d.mo4797b(runnable);
    }
}
