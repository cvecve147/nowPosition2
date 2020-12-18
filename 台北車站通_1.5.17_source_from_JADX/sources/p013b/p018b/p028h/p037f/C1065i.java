package p013b.p018b.p028h.p037f;

import android.os.Handler;
import java.util.concurrent.Callable;
import p013b.p018b.p028h.p037f.C1067k;

/* renamed from: b.b.h.f.i */
class C1065i implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Callable f3996a;

    /* renamed from: b */
    final /* synthetic */ Handler f3997b;

    /* renamed from: c */
    final /* synthetic */ C1067k.C1068a f3998c;

    /* renamed from: d */
    final /* synthetic */ C1067k f3999d;

    C1065i(C1067k kVar, Callable callable, Handler handler, C1067k.C1068a aVar) {
        this.f3999d = kVar;
        this.f3996a = callable;
        this.f3997b = handler;
        this.f3998c = aVar;
    }

    public void run() {
        Object obj;
        try {
            obj = this.f3996a.call();
        } catch (Exception unused) {
            obj = null;
        }
        this.f3997b.post(new C1064h(this, obj));
    }
}
