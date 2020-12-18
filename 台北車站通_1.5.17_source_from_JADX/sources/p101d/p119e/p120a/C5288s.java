package p101d.p119e.p120a;

import p101d.p119e.p120a.C5267b;

/* renamed from: d.e.a.s */
public class C5288s<T> {

    /* renamed from: a */
    public final T f14970a;

    /* renamed from: b */
    public final C5267b.C5268a f14971b;

    /* renamed from: c */
    public final C5295x f14972c;

    /* renamed from: d */
    public boolean f14973d;

    /* renamed from: d.e.a.s$a */
    public interface C5289a {
        /* renamed from: a */
        void mo14131a(C5295x xVar);
    }

    /* renamed from: d.e.a.s$b */
    public interface C5290b<T> {
        /* renamed from: a */
        void mo14126a(T t);
    }

    private C5288s(C5295x xVar) {
        this.f14973d = false;
        this.f14970a = null;
        this.f14971b = null;
        this.f14972c = xVar;
    }

    private C5288s(T t, C5267b.C5268a aVar) {
        this.f14973d = false;
        this.f14970a = t;
        this.f14971b = aVar;
        this.f14972c = null;
    }

    /* renamed from: a */
    public static <T> C5288s<T> m20457a(C5295x xVar) {
        return new C5288s<>(xVar);
    }

    /* renamed from: a */
    public static <T> C5288s<T> m20458a(T t, C5267b.C5268a aVar) {
        return new C5288s<>(t, aVar);
    }

    /* renamed from: a */
    public boolean mo14656a() {
        return this.f14972c == null;
    }
}
