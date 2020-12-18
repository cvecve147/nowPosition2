package p101d.p119e.p120a;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: d.e.a.f */
class C5272f implements Executor {

    /* renamed from: a */
    final /* synthetic */ Handler f14917a;

    /* renamed from: b */
    final /* synthetic */ C5273g f14918b;

    C5272f(C5273g gVar, Handler handler) {
        this.f14918b = gVar;
        this.f14917a = handler;
    }

    public void execute(Runnable runnable) {
        this.f14917a.post(runnable);
    }
}
