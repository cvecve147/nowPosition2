package p101d.p129g.p152e.p157c;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import p101d.p129g.p152e.p154b.C5611a;
import p101d.p129g.p152e.p154b.C5680b;

/* renamed from: d.g.e.c.a */
public class C5713a<T> {

    /* renamed from: a */
    final Class<? super T> f15788a;

    /* renamed from: b */
    final Type f15789b;

    /* renamed from: c */
    final int f15790c;

    protected C5713a() {
        this.f15789b = m21563b(getClass());
        this.f15788a = C5680b.m21510e(this.f15789b);
        this.f15790c = this.f15789b.hashCode();
    }

    C5713a(Type type) {
        C5611a.m21265a(type);
        this.f15789b = C5680b.m21505b(type);
        this.f15788a = C5680b.m21510e(this.f15789b);
        this.f15790c = this.f15789b.hashCode();
    }

    /* renamed from: a */
    public static <T> C5713a<T> m21561a(Class<T> cls) {
        return new C5713a<>(cls);
    }

    /* renamed from: a */
    public static C5713a<?> m21562a(Type type) {
        return new C5713a<>(type);
    }

    /* renamed from: b */
    static Type m21563b(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            return C5680b.m21505b(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        }
        throw new RuntimeException("Missing type parameter.");
    }

    /* renamed from: a */
    public final Class<? super T> mo15267a() {
        return this.f15788a;
    }

    /* renamed from: b */
    public final Type mo15268b() {
        return this.f15789b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C5713a) && C5680b.m21504a(this.f15789b, ((C5713a) obj).f15789b);
    }

    public final int hashCode() {
        return this.f15790c;
    }

    public final String toString() {
        return C5680b.m21513h(this.f15789b);
    }
}
