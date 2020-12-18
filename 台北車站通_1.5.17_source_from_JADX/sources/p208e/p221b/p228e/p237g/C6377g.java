package p208e.p221b.p228e.p237g;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: e.b.e.g.g */
public final class C6377g extends AtomicLong implements ThreadFactory {

    /* renamed from: a */
    final String f17704a;

    /* renamed from: b */
    final int f17705b;

    /* renamed from: c */
    final boolean f17706c;

    /* renamed from: e.b.e.g.g$a */
    static final class C6378a extends Thread implements C6376f {
        C6378a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public C6377g(String str) {
        this(str, 5, false);
    }

    public C6377g(String str, int i) {
        this(str, i, false);
    }

    public C6377g(String str, int i, boolean z) {
        this.f17704a = str;
        this.f17705b = i;
        this.f17706c = z;
    }

    public Thread newThread(Runnable runnable) {
        String str = this.f17704a + '-' + incrementAndGet();
        Thread aVar = this.f17706c ? new C6378a(runnable, str) : new Thread(runnable, str);
        aVar.setPriority(this.f17705b);
        aVar.setDaemon(true);
        return aVar;
    }

    public String toString() {
        return "RxThreadFactory[" + this.f17704a + "]";
    }
}
