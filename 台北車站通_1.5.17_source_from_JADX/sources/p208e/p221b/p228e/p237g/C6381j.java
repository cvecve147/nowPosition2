package p208e.p221b.p228e.p237g;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p208e.p221b.p225b.C6223b;
import p208e.p221b.p228e.p229a.C6248a;

/* renamed from: e.b.e.g.j */
public final class C6381j extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, C6223b {

    /* renamed from: a */
    static final Object f17707a = new Object();

    /* renamed from: b */
    static final Object f17708b = new Object();

    /* renamed from: c */
    final Runnable f17709c;

    public C6381j(Runnable runnable, C6248a aVar) {
        super(3);
        this.f17709c = runnable;
        lazySet(0, aVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo15709a() {
        /*
            r5 = this;
        L_0x0000:
            r0 = 1
            java.lang.Object r1 = r5.get(r0)
            java.lang.Object r2 = f17708b
            r3 = 0
            if (r1 == r2) goto L_0x0029
            java.lang.Object r2 = f17707a
            if (r1 != r2) goto L_0x000f
            goto L_0x0029
        L_0x000f:
            boolean r2 = r5.compareAndSet(r0, r1, r2)
            if (r2 == 0) goto L_0x0000
            if (r1 == 0) goto L_0x0029
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1
            r2 = 2
            java.lang.Object r2 = r5.get(r2)
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            if (r2 == r4) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r0 = r3
        L_0x0026:
            r1.cancel(r0)
        L_0x0029:
            java.lang.Object r0 = r5.get(r3)
            java.lang.Object r1 = f17708b
            if (r0 == r1) goto L_0x0043
            java.lang.Object r1 = f17707a
            if (r0 == r1) goto L_0x0043
            if (r0 != 0) goto L_0x0038
            goto L_0x0043
        L_0x0038:
            boolean r1 = r5.compareAndSet(r3, r0, r1)
            if (r1 == 0) goto L_0x0029
            e.b.e.a.a r0 = (p208e.p221b.p228e.p229a.C6248a) r0
            r0.mo16326c(r5)
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p208e.p221b.p228e.p237g.C6381j.mo15709a():void");
    }

    /* renamed from: a */
    public void mo16477a(Future<?> future) {
        Object obj;
        do {
            boolean z = true;
            obj = get(1);
            if (obj != f17708b) {
                if (obj == f17707a) {
                    if (get(2) == Thread.currentThread()) {
                        z = false;
                    }
                    future.cancel(z);
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    public Object call() {
        run();
        return null;
    }

    public void run() {
        Object obj;
        Object obj2;
        lazySet(2, Thread.currentThread());
        try {
            this.f17709c.run();
        } catch (Throwable th) {
            lazySet(2, (Object) null);
            Object obj3 = get(0);
            if (!(obj3 == f17707a || obj3 == null || !compareAndSet(0, obj3, f17708b))) {
                ((C6248a) obj3).mo16326c(this);
            }
            do {
                obj2 = get(1);
                if (obj2 == f17707a || compareAndSet(1, obj2, f17708b)) {
                    throw th;
                }
                obj2 = get(1);
                break;
            } while (compareAndSet(1, obj2, f17708b));
            throw th;
        }
        lazySet(2, (Object) null);
        Object obj4 = get(0);
        if (!(obj4 == f17707a || obj4 == null || !compareAndSet(0, obj4, f17708b))) {
            ((C6248a) obj4).mo16326c(this);
        }
        do {
            obj = get(1);
            if (obj == f17707a || compareAndSet(1, obj, f17708b)) {
            }
            obj = get(1);
            return;
        } while (compareAndSet(1, obj, f17708b));
    }
}
