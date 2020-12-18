package p101d.p129g.p152e.p154b;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: d.g.e.b.A */
public final class C5602A {

    /* renamed from: a */
    private static final Map<Class<?>, Class<?>> f15577a;

    /* renamed from: b */
    private static final Map<Class<?>, Class<?>> f15578b;

    static {
        HashMap hashMap = new HashMap(16);
        HashMap hashMap2 = new HashMap(16);
        m21252a(hashMap, hashMap2, Boolean.TYPE, Boolean.class);
        m21252a(hashMap, hashMap2, Byte.TYPE, Byte.class);
        m21252a(hashMap, hashMap2, Character.TYPE, Character.class);
        m21252a(hashMap, hashMap2, Double.TYPE, Double.class);
        m21252a(hashMap, hashMap2, Float.TYPE, Float.class);
        m21252a(hashMap, hashMap2, Integer.TYPE, Integer.class);
        m21252a(hashMap, hashMap2, Long.TYPE, Long.class);
        m21252a(hashMap, hashMap2, Short.TYPE, Short.class);
        m21252a(hashMap, hashMap2, Void.TYPE, Void.class);
        f15577a = Collections.unmodifiableMap(hashMap);
        f15578b = Collections.unmodifiableMap(hashMap2);
    }

    /* renamed from: a */
    private static void m21252a(Map<Class<?>, Class<?>> map, Map<Class<?>, Class<?>> map2, Class<?> cls, Class<?> cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }

    /* renamed from: a */
    public static boolean m21253a(Type type) {
        return f15577a.containsKey(type);
    }
}
