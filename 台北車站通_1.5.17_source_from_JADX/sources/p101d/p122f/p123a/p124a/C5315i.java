package p101d.p122f.p123a.p124a;

import android.content.Context;
import android.os.Looper;
import p208e.p209a.p210a.p211a.p212a.p214b.C6065A;
import p208e.p209a.p210a.p211a.p212a.p217d.C6141h;
import p208e.p209a.p210a.p211a.p212a.p219f.C6161a;

/* renamed from: d.f.a.a.i */
class C5315i {

    /* renamed from: a */
    final Context f15048a;

    /* renamed from: b */
    final C6161a f15049b;

    public C5315i(Context context, C6161a aVar) {
        this.f15048a = context;
        this.f15049b = aVar;
    }

    /* renamed from: a */
    public C5330w mo14692a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return new C5330w(this.f15048a, new C5305D(), new C6065A(), new C6141h(this.f15048a, this.f15049b.mo16233a(), "session_analytics.tap", "session_analytics_to_send"));
        }
        throw new IllegalStateException("AnswersFilesManagerProvider cannot be called on the main thread");
    }
}
