package p208e.p221b.p228e.p237g;

/* renamed from: e.b.e.g.h */
public final class C6379h extends C6365a implements Runnable {
    public C6379h(Runnable runnable) {
        super(runnable);
    }

    public void run() {
        this.f17667d = Thread.currentThread();
        try {
            this.f17666c.run();
        } catch (Throwable th) {
            this.f17667d = null;
            throw th;
        }
        this.f17667d = null;
    }
}
