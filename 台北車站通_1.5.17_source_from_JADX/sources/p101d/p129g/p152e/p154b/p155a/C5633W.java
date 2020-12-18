package p101d.p129g.p152e.p154b.p155a;

import p101d.p129g.p152e.C5593I;
import p101d.p129g.p152e.C5594J;
import p101d.p129g.p152e.C5731p;
import p101d.p129g.p152e.p157c.C5713a;

/* renamed from: d.g.e.b.a.W */
class C5633W implements C5594J {

    /* renamed from: a */
    final /* synthetic */ Class f15589a;

    /* renamed from: b */
    final /* synthetic */ C5593I f15590b;

    C5633W(Class cls, C5593I i) {
        this.f15589a = cls;
        this.f15590b = i;
    }

    /* renamed from: a */
    public <T> C5593I<T> mo15100a(C5731p pVar, C5713a<T> aVar) {
        if (aVar.mo15267a() == this.f15589a) {
            return this.f15590b;
        }
        return null;
    }

    public String toString() {
        return "Factory[type=" + this.f15589a.getName() + ",adapter=" + this.f15590b + "]";
    }
}
