package p208e.p221b.p228e.p237g;

import java.util.concurrent.ThreadFactory;
import p208e.p221b.C6439r;

/* renamed from: e.b.e.g.d */
public final class C6374d extends C6439r {

    /* renamed from: b */
    private static final C6377g f17700b = new C6377g("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));

    /* renamed from: c */
    final ThreadFactory f17701c;

    public C6374d() {
        this(f17700b);
    }

    public C6374d(ThreadFactory threadFactory) {
        this.f17701c = threadFactory;
    }

    /* renamed from: a */
    public C6439r.C6442c mo16319a() {
        return new C6375e(this.f17701c);
    }
}
