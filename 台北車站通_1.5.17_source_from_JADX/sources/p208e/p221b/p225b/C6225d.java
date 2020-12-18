package p208e.p221b.p225b;

import java.util.concurrent.atomic.AtomicReference;
import p208e.p221b.p228e.p230b.C6268b;

/* renamed from: e.b.b.d */
abstract class C6225d<T> extends AtomicReference<T> implements C6223b {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6225d(T t) {
        super(t);
        C6268b.m23590a(t, "value is null");
    }

    /* renamed from: a */
    public final void mo15709a() {
        Object andSet;
        if (get() != null && (andSet = getAndSet((Object) null)) != null) {
            mo16327a(andSet);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo16327a(T t);

    /* renamed from: b */
    public final boolean mo16328b() {
        return get() == null;
    }
}
