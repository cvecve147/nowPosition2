package p101d.p129g.p152e.p154b;

import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import p101d.p129g.p152e.C5733q;
import p101d.p129g.p152e.p157c.C5713a;

/* renamed from: d.g.e.b.q */
public final class C5698q {

    /* renamed from: a */
    private final Map<Type, C5733q<?>> f15748a;

    public C5698q(Map<Type, C5733q<?>> map) {
        this.f15748a = map;
    }

    /* renamed from: a */
    private <T> C5711z<T> m21528a(Class<? super T> cls) {
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return new C5691j(this, declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private <T> C5711z<T> m21529a(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return SortedSet.class.isAssignableFrom(cls) ? new C5692k(this) : EnumSet.class.isAssignableFrom(cls) ? new C5693l(this, type) : Set.class.isAssignableFrom(cls) ? new C5694m(this) : Queue.class.isAssignableFrom(cls) ? new C5695n(this) : new C5696o(this);
        }
        if (Map.class.isAssignableFrom(cls)) {
            return ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new C5697p(this) : ConcurrentMap.class.isAssignableFrom(cls) ? new C5684c(this) : SortedMap.class.isAssignableFrom(cls) ? new C5685d(this) : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(C5713a.m21562a(((ParameterizedType) type).getActualTypeArguments()[0]).mo15267a())) ? new C5687f(this) : new C5686e(this);
        }
        return null;
    }

    /* renamed from: b */
    private <T> C5711z<T> m21530b(Type type, Class<? super T> cls) {
        return new C5688g(this, cls, type);
    }

    /* renamed from: a */
    public <T> C5711z<T> mo15215a(C5713a<T> aVar) {
        Type b = aVar.mo15268b();
        Class<? super T> a = aVar.mo15267a();
        C5733q qVar = this.f15748a.get(b);
        if (qVar != null) {
            return new C5689h(this, qVar, b);
        }
        C5733q qVar2 = this.f15748a.get(a);
        if (qVar2 != null) {
            return new C5690i(this, qVar2, b);
        }
        C5711z<T> a2 = m21528a(a);
        if (a2 != null) {
            return a2;
        }
        C5711z<T> a3 = m21529a(b, a);
        return a3 != null ? a3 : m21530b(b, a);
    }

    public String toString() {
        return this.f15748a.toString();
    }
}
