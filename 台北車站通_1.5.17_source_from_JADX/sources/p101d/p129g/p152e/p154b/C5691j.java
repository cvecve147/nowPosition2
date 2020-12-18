package p101d.p129g.p152e.p154b;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* renamed from: d.g.e.b.j */
class C5691j implements C5711z<T> {

    /* renamed from: a */
    final /* synthetic */ Constructor f15739a;

    /* renamed from: b */
    final /* synthetic */ C5698q f15740b;

    C5691j(C5698q qVar, Constructor constructor) {
        this.f15740b = qVar;
        this.f15739a = constructor;
    }

    /* renamed from: a */
    public T mo15214a() {
        try {
            return this.f15739a.newInstance((Object[]) null);
        } catch (InstantiationException e) {
            throw new RuntimeException("Failed to invoke " + this.f15739a + " with no args", e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException("Failed to invoke " + this.f15739a + " with no args", e2.getTargetException());
        } catch (IllegalAccessException e3) {
            throw new AssertionError(e3);
        }
    }
}
