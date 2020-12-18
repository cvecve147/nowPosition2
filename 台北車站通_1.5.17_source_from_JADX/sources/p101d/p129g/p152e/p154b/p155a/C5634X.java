package p101d.p129g.p152e.p154b.p155a;

import p101d.p129g.p152e.C5593I;
import p101d.p129g.p152e.C5594J;
import p101d.p129g.p152e.C5731p;
import p101d.p129g.p152e.p157c.C5713a;

/* renamed from: d.g.e.b.a.X */
class C5634X implements C5594J {

    /* renamed from: a */
    final /* synthetic */ Class f15591a;

    /* renamed from: b */
    final /* synthetic */ Class f15592b;

    /* renamed from: c */
    final /* synthetic */ C5593I f15593c;

    C5634X(Class cls, Class cls2, C5593I i) {
        this.f15591a = cls;
        this.f15592b = cls2;
        this.f15593c = i;
    }

    /* renamed from: a */
    public <T> C5593I<T> mo15100a(C5731p pVar, C5713a<T> aVar) {
        Class<? super T> a = aVar.mo15267a();
        if (a == this.f15591a || a == this.f15592b) {
            return this.f15593c;
        }
        return null;
    }

    public String toString() {
        return "Factory[type=" + this.f15592b.getName() + "+" + this.f15591a.getName() + ",adapter=" + this.f15593c + "]";
    }
}
