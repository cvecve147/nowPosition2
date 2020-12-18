package p208e.p209a.p210a.p211a.p212a.p215c;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.LinkedList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: e.a.a.a.a.c.e */
public abstract class C6110e<Params, Progress, Result> {

    /* renamed from: a */
    private static final int f17080a = Runtime.getRuntime().availableProcessors();

    /* renamed from: b */
    private static final int f17081b;

    /* renamed from: c */
    private static final int f17082c;

    /* renamed from: d */
    private static final ThreadFactory f17083d = new C6101a();

    /* renamed from: e */
    private static final BlockingQueue<Runnable> f17084e = new LinkedBlockingQueue(128);

    /* renamed from: f */
    public static final Executor f17085f = new ThreadPoolExecutor(f17081b, f17082c, 1, TimeUnit.SECONDS, f17084e, f17083d);

    /* renamed from: g */
    public static final Executor f17086g = new C6113c((C6101a) null);

    /* renamed from: h */
    private static final C6112b f17087h = new C6112b();

    /* renamed from: i */
    private static volatile Executor f17088i = f17086g;

    /* renamed from: j */
    private final C6115e<Params, Result> f17089j = new C6107b(this);

    /* renamed from: k */
    private final FutureTask<Result> f17090k = new C6108c(this, this.f17089j);

    /* renamed from: l */
    private volatile C6114d f17091l = C6114d.PENDING;

    /* renamed from: m */
    private final AtomicBoolean f17092m = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final AtomicBoolean f17093n = new AtomicBoolean();

    /* renamed from: e.a.a.a.a.c.e$a */
    private static class C6111a<Data> {

        /* renamed from: a */
        final C6110e f17094a;

        /* renamed from: b */
        final Data[] f17095b;

        C6111a(C6110e eVar, Data... dataArr) {
            this.f17094a = eVar;
            this.f17095b = dataArr;
        }
    }

    /* renamed from: e.a.a.a.a.c.e$b */
    private static class C6112b extends Handler {
        public C6112b() {
            super(Looper.getMainLooper());
        }

        public void handleMessage(Message message) {
            C6111a aVar = (C6111a) message.obj;
            int i = message.what;
            if (i == 1) {
                aVar.f17094a.m23138d(aVar.f17095b[0]);
            } else if (i == 2) {
                aVar.f17094a.mo16105b((Progress[]) aVar.f17095b);
            }
        }
    }

    /* renamed from: e.a.a.a.a.c.e$c */
    private static class C6113c implements Executor {

        /* renamed from: a */
        final LinkedList<Runnable> f17096a;

        /* renamed from: b */
        Runnable f17097b;

        private C6113c() {
            this.f17096a = new LinkedList<>();
        }

        /* synthetic */ C6113c(C6101a aVar) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public synchronized void mo16112a() {
            Runnable poll = this.f17096a.poll();
            this.f17097b = poll;
            if (poll != null) {
                C6110e.f17085f.execute(this.f17097b);
            }
        }

        public synchronized void execute(Runnable runnable) {
            this.f17096a.offer(new C6116f(this, runnable));
            if (this.f17097b == null) {
                mo16112a();
            }
        }
    }

    /* renamed from: e.a.a.a.a.c.e$d */
    public enum C6114d {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* renamed from: e.a.a.a.a.c.e$e */
    private static abstract class C6115e<Params, Result> implements Callable<Result> {

        /* renamed from: a */
        Params[] f17102a;

        private C6115e() {
        }

        /* synthetic */ C6115e(C6101a aVar) {
            this();
        }
    }

    static {
        int i = f17080a;
        f17081b = i + 1;
        f17082c = (i * 2) + 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m23138d(Result result) {
        if (mo16109e()) {
            mo16104b(result);
        } else {
            mo16107c(result);
        }
        this.f17091l = C6114d.FINISHED;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public Result m23139e(Result result) {
        f17087h.obtainMessage(1, new C6111a(this, result)).sendToTarget();
        return result;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m23140f(Result result) {
        if (!this.f17093n.get()) {
            m23139e(result);
        }
    }

    /* renamed from: a */
    public final C6110e<Params, Progress, Result> mo16102a(Executor executor, Params... paramsArr) {
        if (this.f17091l != C6114d.PENDING) {
            int i = C6109d.f17079a[this.f17091l.ordinal()];
            if (i == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            } else if (i == 2) {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        }
        this.f17091l = C6114d.RUNNING;
        mo16110g();
        this.f17089j.f17102a = paramsArr;
        executor.execute(this.f17090k);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Result mo16103a(Params... paramsArr);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo16104b(Result result);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo16105b(Progress... progressArr) {
    }

    /* renamed from: b */
    public final boolean mo16106b(boolean z) {
        this.f17092m.set(true);
        return this.f17090k.cancel(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo16107c(Result result);

    /* renamed from: d */
    public final C6114d mo16108d() {
        return this.f17091l;
    }

    /* renamed from: e */
    public final boolean mo16109e() {
        return this.f17092m.get();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo16110g() {
    }
}
