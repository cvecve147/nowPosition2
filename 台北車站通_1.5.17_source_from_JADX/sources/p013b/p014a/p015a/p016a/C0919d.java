package p013b.p014a.p015a.p016a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: b.a.a.a.d */
public class C0919d extends C0920e {

    /* renamed from: a */
    private final Object f3727a = new Object();

    /* renamed from: b */
    private ExecutorService f3728b = Executors.newFixedThreadPool(2);

    /* renamed from: c */
    private volatile Handler f3729c;

    /* renamed from: a */
    public void mo4795a(Runnable runnable) {
        this.f3728b.execute(runnable);
    }

    /* renamed from: a */
    public boolean mo4796a() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: b */
    public void mo4797b(Runnable runnable) {
        if (this.f3729c == null) {
            synchronized (this.f3727a) {
                if (this.f3729c == null) {
                    this.f3729c = new Handler(Looper.getMainLooper());
                }
            }
        }
        this.f3729c.post(runnable);
    }
}
