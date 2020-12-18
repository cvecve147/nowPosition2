package p245f.p246a.p247a.p248a;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: f.a.a.a.a */
public final class C6446a extends HandlerThread {

    /* renamed from: a */
    private static C6446a f17832a;

    /* renamed from: b */
    private static Handler f17833b;

    private C6446a() {
        super("me.tatarka.support.io", 0);
    }

    /* renamed from: a */
    public static Handler m24070a() {
        Handler handler;
        synchronized (C6446a.class) {
            m24071b();
            handler = f17833b;
        }
        return handler;
    }

    /* renamed from: b */
    private static void m24071b() {
        if (f17832a == null) {
            f17832a = new C6446a();
            f17832a.start();
            f17833b = new Handler(f17832a.getLooper());
        }
    }
}
