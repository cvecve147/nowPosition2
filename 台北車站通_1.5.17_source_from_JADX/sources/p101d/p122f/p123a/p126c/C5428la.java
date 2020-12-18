package p101d.p122f.p123a.p126c;

/* renamed from: d.f.a.c.la */
class C5428la {

    /* renamed from: a */
    public final String f15295a;

    /* renamed from: b */
    public final String f15296b;

    /* renamed from: c */
    public final StackTraceElement[] f15297c;

    /* renamed from: d */
    public final C5428la f15298d;

    public C5428la(Throwable th, C5426ka kaVar) {
        this.f15295a = th.getLocalizedMessage();
        this.f15296b = th.getClass().getName();
        this.f15297c = kaVar.mo14806a(th.getStackTrace());
        Throwable cause = th.getCause();
        this.f15298d = cause != null ? new C5428la(cause, kaVar) : null;
    }
}
