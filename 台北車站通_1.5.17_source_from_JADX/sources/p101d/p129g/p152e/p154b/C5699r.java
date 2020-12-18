package p101d.p129g.p152e.p154b;

import p101d.p129g.p152e.C5593I;
import p101d.p129g.p152e.C5594J;
import p101d.p129g.p152e.C5731p;
import p101d.p129g.p152e.p157c.C5713a;
import p101d.p129g.p152e.p158d.C5716b;
import p101d.p129g.p152e.p158d.C5718d;

/* renamed from: d.g.e.b.r */
class C5699r extends C5593I<T> {

    /* renamed from: a */
    private C5593I<T> f15749a;

    /* renamed from: b */
    final /* synthetic */ boolean f15750b;

    /* renamed from: c */
    final /* synthetic */ boolean f15751c;

    /* renamed from: d */
    final /* synthetic */ C5731p f15752d;

    /* renamed from: e */
    final /* synthetic */ C5713a f15753e;

    /* renamed from: f */
    final /* synthetic */ C5700s f15754f;

    C5699r(C5700s sVar, boolean z, boolean z2, C5731p pVar, C5713a aVar) {
        this.f15754f = sVar;
        this.f15750b = z;
        this.f15751c = z2;
        this.f15752d = pVar;
        this.f15753e = aVar;
    }

    /* renamed from: b */
    private C5593I<T> m21532b() {
        C5593I<T> i = this.f15749a;
        if (i != null) {
            return i;
        }
        C5593I<T> a = this.f15752d.mo15287a((C5594J) this.f15754f, this.f15753e);
        this.f15749a = a;
        return a;
    }

    /* renamed from: a */
    public T mo15096a(C5716b bVar) {
        if (!this.f15750b) {
            return m21532b().mo15096a(bVar);
        }
        bVar.mo15166q();
        return null;
    }

    /* renamed from: a */
    public void mo15097a(C5718d dVar, T t) {
        if (this.f15751c) {
            dVar.mo15186h();
        } else {
            m21532b().mo15097a(dVar, t);
        }
    }
}
