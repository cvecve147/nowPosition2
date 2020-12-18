package p208e.p221b.p228e.p237g;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import p208e.p221b.p225b.C6223b;
import p208e.p221b.p228e.p230b.C6253a;

/* renamed from: e.b.e.g.a */
abstract class C6365a extends AtomicReference<Future<?>> implements C6223b {

    /* renamed from: a */
    protected static final FutureTask<Void> f17664a = new FutureTask<>(C6253a.f17366b, (Object) null);

    /* renamed from: b */
    protected static final FutureTask<Void> f17665b = new FutureTask<>(C6253a.f17366b, (Object) null);

    /* renamed from: c */
    protected final Runnable f17666c;

    /* renamed from: d */
    protected Thread f17667d;

    C6365a(Runnable runnable) {
        this.f17666c = runnable;
    }

    /* renamed from: a */
    public final void mo15709a() {
        FutureTask<Void> futureTask;
        Future future = (Future) get();
        if (future != f17664a && future != (futureTask = f17665b) && compareAndSet(future, futureTask) && future != null) {
            future.cancel(this.f17667d != Thread.currentThread());
        }
    }

    /* renamed from: a */
    public final void mo16454a(Future<?> future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 != f17664a) {
                if (future2 == f17665b) {
                    future.cancel(this.f17667d != Thread.currentThread());
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(future2, future));
    }
}
