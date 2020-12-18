package p208e.p209a.p210a.p211a.p212a.p213a;

import android.content.Context;

/* renamed from: e.a.a.a.a.a.a */
public abstract class C6061a<T> implements C6063c<T> {

    /* renamed from: a */
    private final C6063c<T> f16973a;

    public C6061a(C6063c<T> cVar) {
        this.f16973a = cVar;
    }

    /* renamed from: b */
    private void m22982b(Context context, T t) {
        if (t != null) {
            mo16036a(context, t);
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo16034a(Context context);

    /* renamed from: a */
    public final synchronized T mo16035a(Context context, C6064d<T> dVar) {
        T a;
        a = mo16034a(context);
        if (a == null) {
            a = this.f16973a != null ? this.f16973a.mo16035a(context, dVar) : dVar.mo14747a(context);
            m22982b(context, a);
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo16036a(Context context, T t);
}
