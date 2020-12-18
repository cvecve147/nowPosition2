package p101d.p129g.p152e.p154b;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;
import p101d.p129g.p152e.C5738v;

/* renamed from: d.g.e.b.l */
class C5693l implements C5711z<T> {

    /* renamed from: a */
    final /* synthetic */ Type f15742a;

    /* renamed from: b */
    final /* synthetic */ C5698q f15743b;

    C5693l(C5698q qVar, Type type) {
        this.f15743b = qVar;
        this.f15742a = type;
    }

    /* renamed from: a */
    public T mo15214a() {
        Type type = this.f15742a;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            throw new C5738v("Invalid EnumSet type: " + this.f15742a.toString());
        }
        throw new C5738v("Invalid EnumSet type: " + this.f15742a.toString());
    }
}
