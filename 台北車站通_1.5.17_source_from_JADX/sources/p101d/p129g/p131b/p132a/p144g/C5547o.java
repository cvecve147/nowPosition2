package p101d.p129g.p131b.p132a.p144g;

import java.util.concurrent.Executor;

/* renamed from: d.g.b.a.g.o */
final class C5547o<TResult> implements C5553u<TResult> {

    /* renamed from: a */
    private final Executor f15465a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f15466b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C5532c<TResult> f15467c;

    public C5547o(Executor executor, C5532c<TResult> cVar) {
        this.f15465a = executor;
        this.f15467c = cVar;
    }

    /* renamed from: a */
    public final void mo15004a(C5536g<TResult> gVar) {
        synchronized (this.f15466b) {
            if (this.f15467c != null) {
                this.f15465a.execute(new C5548p(this, gVar));
            }
        }
    }
}
