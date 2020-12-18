package p101d.p129g.p131b.p132a.p144g;

import java.util.concurrent.Executor;

/* renamed from: d.g.b.a.g.k */
final class C5543k<TResult, TContinuationResult> implements C5553u<TResult> {

    /* renamed from: a */
    private final Executor f15456a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C5530a<TResult, TContinuationResult> f15457b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C5556x<TContinuationResult> f15458c;

    public C5543k(Executor executor, C5530a<TResult, TContinuationResult> aVar, C5556x<TContinuationResult> xVar) {
        this.f15456a = executor;
        this.f15457b = aVar;
        this.f15458c = xVar;
    }

    /* renamed from: a */
    public final void mo15004a(C5536g<TResult> gVar) {
        this.f15456a.execute(new C5544l(this, gVar));
    }
}
