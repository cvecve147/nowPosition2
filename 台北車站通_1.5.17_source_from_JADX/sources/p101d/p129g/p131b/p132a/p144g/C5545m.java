package p101d.p129g.p131b.p132a.p144g;

import java.util.concurrent.Executor;

/* renamed from: d.g.b.a.g.m */
final class C5545m<TResult> implements C5553u<TResult> {

    /* renamed from: a */
    private final Executor f15461a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f15462b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C5531b f15463c;

    public C5545m(Executor executor, C5531b bVar) {
        this.f15461a = executor;
        this.f15463c = bVar;
    }

    /* renamed from: a */
    public final void mo15004a(C5536g gVar) {
        if (gVar.mo14993c()) {
            synchronized (this.f15462b) {
                if (this.f15463c != null) {
                    this.f15461a.execute(new C5546n(this));
                }
            }
        }
    }
}
