package p101d.p129g.p131b.p132a.p144g;

import java.util.concurrent.Executor;

/* renamed from: d.g.b.a.g.q */
final class C5549q<TResult> implements C5553u<TResult> {

    /* renamed from: a */
    private final Executor f15470a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f15471b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C5533d f15472c;

    public C5549q(Executor executor, C5533d dVar) {
        this.f15470a = executor;
        this.f15472c = dVar;
    }

    /* renamed from: a */
    public final void mo15004a(C5536g<TResult> gVar) {
        if (!gVar.mo14995e() && !gVar.mo14993c()) {
            synchronized (this.f15471b) {
                if (this.f15472c != null) {
                    this.f15470a.execute(new C5550r(this, gVar));
                }
            }
        }
    }
}
