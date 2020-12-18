package p101d.p129g.p131b.p132a.p137e.p140c;

/* renamed from: d.g.b.a.e.c.g */
final class C5508g extends C5505d {

    /* renamed from: b */
    private final C5506e f15418b = new C5506e();

    C5508g() {
    }

    /* renamed from: a */
    public final void mo14951a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        } else if (th2 != null) {
            this.f15418b.mo14952a(th, true).add(th2);
        } else {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
    }
}
