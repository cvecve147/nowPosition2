package p208e.p221b.p228e.p237g;

import java.util.concurrent.Callable;

/* renamed from: e.b.e.g.i */
public final class C6380i extends C6365a implements Callable<Void> {
    public C6380i(Runnable runnable) {
        super(runnable);
    }

    public Void call() {
        this.f17667d = Thread.currentThread();
        try {
            this.f17666c.run();
            return null;
        } finally {
            lazySet(C6365a.f17664a);
            this.f17667d = null;
        }
    }
}
