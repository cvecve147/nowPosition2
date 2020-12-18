package p208e.p221b.p222a.p224b;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import p208e.p221b.C6439r;
import p208e.p221b.p225b.C6223b;
import p208e.p221b.p225b.C6224c;
import p208e.p221b.p242g.C6416a;

/* renamed from: e.b.a.b.c */
final class C6218c extends C6439r {

    /* renamed from: b */
    private final Handler f17344b;

    /* renamed from: e.b.a.b.c$a */
    private static final class C6219a extends C6439r.C6442c {

        /* renamed from: a */
        private final Handler f17345a;

        /* renamed from: b */
        private volatile boolean f17346b;

        C6219a(Handler handler) {
            this.f17345a = handler;
        }

        /* renamed from: a */
        public C6223b mo16320a(Runnable runnable, long j, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            } else if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            } else if (this.f17346b) {
                return C6224c.m23513a();
            } else {
                C6220b bVar = new C6220b(this.f17345a, C6416a.m23984a(runnable));
                Message obtain = Message.obtain(this.f17345a, bVar);
                obtain.obj = this;
                this.f17345a.sendMessageDelayed(obtain, Math.max(0, timeUnit.toMillis(j)));
                if (!this.f17346b) {
                    return bVar;
                }
                this.f17345a.removeCallbacks(bVar);
                return C6224c.m23513a();
            }
        }

        /* renamed from: a */
        public void mo15709a() {
            this.f17346b = true;
            this.f17345a.removeCallbacksAndMessages(this);
        }
    }

    /* renamed from: e.b.a.b.c$b */
    private static final class C6220b implements Runnable, C6223b {

        /* renamed from: a */
        private final Handler f17347a;

        /* renamed from: b */
        private final Runnable f17348b;

        /* renamed from: c */
        private volatile boolean f17349c;

        C6220b(Handler handler, Runnable runnable) {
            this.f17347a = handler;
            this.f17348b = runnable;
        }

        /* renamed from: a */
        public void mo15709a() {
            this.f17349c = true;
            this.f17347a.removeCallbacks(this);
        }

        public void run() {
            try {
                this.f17348b.run();
            } catch (Throwable th) {
                IllegalStateException illegalStateException = new IllegalStateException("Fatal Exception thrown on Scheduler.", th);
                C6416a.m23988b((Throwable) illegalStateException);
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, illegalStateException);
            }
        }
    }

    C6218c(Handler handler) {
        this.f17344b = handler;
    }

    /* renamed from: a */
    public C6223b mo16318a(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        } else if (timeUnit != null) {
            C6220b bVar = new C6220b(this.f17344b, C6416a.m23984a(runnable));
            this.f17344b.postDelayed(bVar, Math.max(0, timeUnit.toMillis(j)));
            return bVar;
        } else {
            throw new NullPointerException("unit == null");
        }
    }

    /* renamed from: a */
    public C6439r.C6442c mo16319a() {
        return new C6219a(this.f17344b);
    }
}
