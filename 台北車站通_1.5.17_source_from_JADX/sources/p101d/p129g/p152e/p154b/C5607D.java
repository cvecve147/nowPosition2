package p101d.p129g.p152e.p154b;

import java.lang.reflect.Method;

/* renamed from: d.g.e.b.D */
class C5607D extends C5610G {

    /* renamed from: a */
    final /* synthetic */ Method f15584a;

    /* renamed from: b */
    final /* synthetic */ int f15585b;

    C5607D(Method method, int i) {
        this.f15584a = method;
        this.f15585b = i;
    }

    /* renamed from: b */
    public <T> T mo15117b(Class<T> cls) {
        C5610G.m21263c(cls);
        return this.f15584a.invoke((Object) null, new Object[]{cls, Integer.valueOf(this.f15585b)});
    }
}
