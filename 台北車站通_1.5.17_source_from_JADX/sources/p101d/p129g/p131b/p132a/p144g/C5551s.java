package p101d.p129g.p131b.p132a.p144g;

import java.util.concurrent.Executor;

/* renamed from: d.g.b.a.g.s */
final class C5551s<TResult> implements C5553u<TResult> {

    /* renamed from: a */
    private final Executor f15475a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f15476b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C5534e<? super TResult> f15477c;

    public C5551s(Executor executor, C5534e<? super TResult> eVar) {
        this.f15475a = executor;
        this.f15477c = eVar;
    }

    /* renamed from: a */
    public final void mo15004a(C5536g<TResult> gVar) {
        if (gVar.mo14995e()) {
            synchronized (this.f15476b) {
                if (this.f15477c != null) {
                    this.f15475a.execute(new C5552t(this, gVar));
                }
            }
        }
    }
}
