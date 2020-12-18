package p101d.p129g.p131b.p132a.p137e.p139b;

/* renamed from: d.g.b.a.e.b.k */
final class C5499k extends C5496h {

    /* renamed from: b */
    private final C5497i f15408b = new C5497i();

    C5499k() {
    }

    /* renamed from: a */
    public final void mo14944a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        } else if (th2 != null) {
            this.f15408b.mo14945a(th, true).add(th2);
        } else {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
    }
}
