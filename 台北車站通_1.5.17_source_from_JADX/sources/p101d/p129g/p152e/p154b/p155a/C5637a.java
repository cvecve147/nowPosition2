package p101d.p129g.p152e.p154b.p155a;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import p101d.p129g.p152e.C5593I;
import p101d.p129g.p152e.C5594J;
import p101d.p129g.p152e.C5731p;
import p101d.p129g.p152e.p154b.C5680b;
import p101d.p129g.p152e.p157c.C5713a;

/* renamed from: d.g.e.b.a.a */
class C5637a implements C5594J {
    C5637a() {
    }

    /* renamed from: a */
    public <T> C5593I<T> mo15100a(C5731p pVar, C5713a<T> aVar) {
        Type b = aVar.mo15268b();
        if (!(b instanceof GenericArrayType) && (!(b instanceof Class) || !((Class) b).isArray())) {
            return null;
        }
        Type d = C5680b.m21509d(b);
        return new C5640b(pVar, pVar.mo15288a(C5713a.m21562a(d)), C5680b.m21510e(d));
    }
}
