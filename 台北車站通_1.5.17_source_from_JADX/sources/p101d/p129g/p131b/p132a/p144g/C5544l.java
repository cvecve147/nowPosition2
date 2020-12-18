package p101d.p129g.p131b.p132a.p144g;

/* renamed from: d.g.b.a.g.l */
final class C5544l implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C5536g f15459a;

    /* renamed from: b */
    private final /* synthetic */ C5543k f15460b;

    C5544l(C5543k kVar, C5536g gVar) {
        this.f15460b = kVar;
        this.f15459a = gVar;
    }

    public final void run() {
        if (this.f15459a.mo14993c()) {
            this.f15460b.f15458c.mo15017f();
            return;
        }
        try {
            this.f15460b.f15458c.mo15014a(this.f15460b.f15457b.mo11461a(this.f15459a));
        } catch (C5535f e) {
            if (e.getCause() instanceof Exception) {
                this.f15460b.f15458c.mo15013a((Exception) e.getCause());
            } else {
                this.f15460b.f15458c.mo15013a((Exception) e);
            }
        } catch (Exception e2) {
            this.f15460b.f15458c.mo15013a(e2);
        }
    }
}
