package p208e.p209a.p210a.p211a.p212a.p215c;

import android.annotation.TargetApi;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: e.a.a.a.a.c.r */
public class C6129r extends ThreadPoolExecutor {

    /* renamed from: a */
    private static final int f17120a = Runtime.getRuntime().availableProcessors();

    /* renamed from: b */
    private static final int f17121b;

    /* renamed from: c */
    private static final int f17122c;

    /* renamed from: e.a.a.a.a.c.r$a */
    protected static final class C6130a implements ThreadFactory {

        /* renamed from: a */
        private final int f17123a;

        public C6130a(int i) {
            this.f17123a = i;
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(this.f17123a);
            thread.setName("Queue");
            return thread;
        }
    }

    static {
        int i = f17120a;
        f17121b = i + 1;
        f17122c = (i * 2) + 1;
    }

    <T extends Runnable & C6118h & C6131s & C6127p> C6129r(int i, int i2, long j, TimeUnit timeUnit, C6119i<T> iVar, ThreadFactory threadFactory) {
        super(i, i2, j, timeUnit, iVar, threadFactory);
        prestartAllCoreThreads();
    }

    /* renamed from: a */
    public static C6129r m23192a() {
        return m23193a(f17121b, f17122c);
    }

    /* renamed from: a */
    public static <T extends Runnable & C6118h & C6131s & C6127p> C6129r m23193a(int i, int i2) {
        return new C6129r(i, i2, 1, TimeUnit.SECONDS, new C6119i(), new C6130a(10));
    }

    /* access modifiers changed from: protected */
    public void afterExecute(Runnable runnable, Throwable th) {
        C6131s sVar = (C6131s) runnable;
        sVar.mo16142a(true);
        sVar.mo16140a(th);
        getQueue().mo16119a();
        super.afterExecute(runnable, th);
    }

    @TargetApi(9)
    public void execute(Runnable runnable) {
        if (!C6128q.m23183b(runnable)) {
            runnable = newTaskFor(runnable, (Object) null);
        }
        super.execute(runnable);
    }

    public C6119i getQueue() {
        return (C6119i) super.getQueue();
    }

    /* access modifiers changed from: protected */
    public <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new C6126o(runnable, t);
    }

    /* access modifiers changed from: protected */
    public <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new C6126o(callable);
    }
}
