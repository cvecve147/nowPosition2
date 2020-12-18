package p101d.p122f.p123a.p126c;

import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import p208e.p209a.p210a.p211a.C6199f;

/* renamed from: d.f.a.c.m */
class C5429m {

    /* renamed from: a */
    private final ExecutorService f15299a;

    public C5429m(ExecutorService executorService) {
        this.f15299a = executorService;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Future<?> mo14874a(Runnable runnable) {
        try {
            return this.f15299a.submit(new C5425k(this, runnable));
        } catch (RejectedExecutionException unused) {
            C6199f.m23420f().mo16269d("CrashlyticsCore", "Executor is shut down because we're handling a fatal crash.");
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public <T> Future<T> mo14875a(Callable<T> callable) {
        try {
            return this.f15299a.submit(new C5427l(this, callable));
        } catch (RejectedExecutionException unused) {
            C6199f.m23420f().mo16269d("CrashlyticsCore", "Executor is shut down because we're handling a fatal crash.");
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public <T> T mo14876b(Callable<T> callable) {
        try {
            return Looper.getMainLooper() == Looper.myLooper() ? this.f15299a.submit(callable).get(4, TimeUnit.SECONDS) : this.f15299a.submit(callable).get();
        } catch (RejectedExecutionException unused) {
            C6199f.m23420f().mo16269d("CrashlyticsCore", "Executor is shut down because we're handling a fatal crash.");
            return null;
        } catch (Exception e) {
            C6199f.m23420f().mo16266b("CrashlyticsCore", "Failed to execute task.", e);
            return null;
        }
    }
}
