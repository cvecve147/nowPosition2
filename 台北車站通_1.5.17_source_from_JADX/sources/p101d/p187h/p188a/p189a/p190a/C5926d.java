package p101d.p187h.p188a.p189a.p190a;

import p263h.C6650p;

/* renamed from: d.h.a.a.a.d */
public final class C5926d<T> {

    /* renamed from: a */
    private final C6650p<T> f16382a;

    /* renamed from: b */
    private final Throwable f16383b;

    private C5926d(C6650p<T> pVar, Throwable th) {
        this.f16382a = pVar;
        this.f16383b = th;
    }

    /* renamed from: a */
    public static <T> C5926d<T> m22428a(C6650p<T> pVar) {
        if (pVar != null) {
            return new C5926d<>(pVar, (Throwable) null);
        }
        throw new NullPointerException("response == null");
    }

    /* renamed from: a */
    public static <T> C5926d<T> m22429a(Throwable th) {
        if (th != null) {
            return new C5926d<>((C6650p) null, th);
        }
        throw new NullPointerException("error == null");
    }
}
