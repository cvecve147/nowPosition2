package p101d.p129g.p152e.p154b.p155a;

import p101d.p129g.p152e.C5593I;
import p101d.p129g.p152e.C5594J;
import p101d.p129g.p152e.C5731p;
import p101d.p129g.p152e.p157c.C5713a;

/* renamed from: d.g.e.b.a.Y */
class C5635Y implements C5594J {

    /* renamed from: a */
    final /* synthetic */ Class f15594a;

    /* renamed from: b */
    final /* synthetic */ Class f15595b;

    /* renamed from: c */
    final /* synthetic */ C5593I f15596c;

    C5635Y(Class cls, Class cls2, C5593I i) {
        this.f15594a = cls;
        this.f15595b = cls2;
        this.f15596c = i;
    }

    /* renamed from: a */
    public <T> C5593I<T> mo15100a(C5731p pVar, C5713a<T> aVar) {
        Class<? super T> a = aVar.mo15267a();
        if (a == this.f15594a || a == this.f15595b) {
            return this.f15596c;
        }
        return null;
    }

    public String toString() {
        return "Factory[type=" + this.f15594a.getName() + "+" + this.f15595b.getName() + ",adapter=" + this.f15596c + "]";
    }
}
