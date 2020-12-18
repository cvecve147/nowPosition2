package p101d.p129g.p149d.p151b;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import p101d.p129g.p149d.C5574a;

/* renamed from: d.g.d.b.b */
public final class C5582b {

    /* renamed from: a */
    private static final AtomicReference<C5582b> f15569a = new AtomicReference<>();

    private C5582b(Context context) {
    }

    /* renamed from: a */
    public static C5582b m21226a(Context context) {
        f15569a.compareAndSet((Object) null, new C5582b(context));
        return f15569a.get();
    }

    /* renamed from: a */
    public static void m21227a(C5574a aVar) {
    }
}
