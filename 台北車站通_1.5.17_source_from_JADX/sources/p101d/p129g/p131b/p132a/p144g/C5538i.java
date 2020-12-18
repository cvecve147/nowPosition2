package p101d.p129g.p131b.p132a.p144g;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: d.g.b.a.g.i */
public final class C5538i {

    /* renamed from: a */
    public static final Executor f15452a = new C5539a();

    /* renamed from: b */
    static final Executor f15453b = new C5555w();

    /* renamed from: d.g.b.a.g.i$a */
    private static final class C5539a implements Executor {

        /* renamed from: a */
        private final Handler f15454a = new Handler(Looper.getMainLooper());

        public final void execute(Runnable runnable) {
            this.f15454a.post(runnable);
        }
    }
}
