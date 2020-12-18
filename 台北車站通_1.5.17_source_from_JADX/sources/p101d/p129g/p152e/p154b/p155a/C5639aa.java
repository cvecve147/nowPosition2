package p101d.p129g.p152e.p154b.p155a;

import p101d.p129g.p152e.C5593I;
import p101d.p129g.p152e.C5594J;
import p101d.p129g.p152e.C5731p;
import p101d.p129g.p152e.p157c.C5713a;

/* renamed from: d.g.e.b.a.aa */
class C5639aa implements C5594J {

    /* renamed from: a */
    final /* synthetic */ Class f15600a;

    /* renamed from: b */
    final /* synthetic */ C5593I f15601b;

    C5639aa(Class cls, C5593I i) {
        this.f15600a = cls;
        this.f15601b = i;
    }

    /* renamed from: a */
    public <T2> C5593I<T2> mo15100a(C5731p pVar, C5713a<T2> aVar) {
        Class<? super T2> a = aVar.mo15267a();
        if (!this.f15600a.isAssignableFrom(a)) {
            return null;
        }
        return new C5636Z(this, a);
    }

    public String toString() {
        return "Factory[typeHierarchy=" + this.f15600a.getName() + ",adapter=" + this.f15601b + "]";
    }
}
