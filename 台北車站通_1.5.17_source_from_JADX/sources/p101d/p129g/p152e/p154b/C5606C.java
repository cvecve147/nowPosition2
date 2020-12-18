package p101d.p129g.p152e.p154b;

import java.lang.reflect.Method;

/* renamed from: d.g.e.b.C */
class C5606C extends C5610G {

    /* renamed from: a */
    final /* synthetic */ Method f15582a;

    /* renamed from: b */
    final /* synthetic */ Object f15583b;

    C5606C(Method method, Object obj) {
        this.f15582a = method;
        this.f15583b = obj;
    }

    /* renamed from: b */
    public <T> T mo15117b(Class<T> cls) {
        C5610G.m21263c(cls);
        return this.f15582a.invoke(this.f15583b, new Object[]{cls});
    }
}
