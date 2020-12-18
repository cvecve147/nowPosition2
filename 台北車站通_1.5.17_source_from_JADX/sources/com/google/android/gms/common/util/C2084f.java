package com.google.android.gms.common.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p013b.p018b.p028h.p039h.C1080b;
import p013b.p018b.p028h.p039h.C1082d;

/* renamed from: com.google.android.gms.common.util.f */
public final class C2084f {
    @Deprecated
    /* renamed from: a */
    public static <T> List<T> m9117a() {
        return Collections.emptyList();
    }

    @Deprecated
    /* renamed from: a */
    public static <T> List<T> m9118a(T t) {
        return Collections.singletonList(t);
    }

    @Deprecated
    /* renamed from: a */
    public static <T> List<T> m9119a(T... tArr) {
        int length = tArr.length;
        return length != 0 ? length != 1 ? Collections.unmodifiableList(Arrays.asList(tArr)) : m9118a(tArr[0]) : m9117a();
    }

    /* renamed from: a */
    private static <K, V> Map<K, V> m9120a(int i, boolean z, K[] kArr, V[] vArr) {
        Map<K, V> b = m9130b(i, z);
        m9128a(b, kArr, vArr);
        return b;
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m9121a(K k, V v) {
        return Collections.singletonMap(k, v);
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m9122a(K k, V v, K k2, V v2, K k3, V v3) {
        Map b = m9130b(3, false);
        b.put(k, v);
        b.put(k2, v2);
        b.put(k3, v3);
        return Collections.unmodifiableMap(b);
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m9123a(K[] kArr, V[] vArr) {
        m9134b(kArr, vArr);
        int length = kArr.length;
        return length != 0 ? length != 1 ? Collections.unmodifiableMap(m9120a(kArr.length, false, kArr, vArr)) : m9121a(kArr[0], vArr[0]) : m9129b();
    }

    /* renamed from: a */
    private static <T> Set<T> m9124a(int i, boolean z) {
        return i <= (z ? 128 : 256) ? new C1082d(i) : new HashSet(i, z ? 0.75f : 1.0f);
    }

    /* renamed from: a */
    private static <T> Set<T> m9125a(int i, boolean z, T[] tArr) {
        Set<T> a = m9124a(i, z);
        Collections.addAll(a, tArr);
        return a;
    }

    @Deprecated
    /* renamed from: a */
    public static <T> Set<T> m9126a(T t, T t2, T t3) {
        Set a = m9124a(3, false);
        a.add(t);
        a.add(t2);
        a.add(t3);
        return Collections.unmodifiableSet(a);
    }

    @Deprecated
    /* renamed from: a */
    public static <T> Set<T> m9127a(T t, T t2, T t3, T t4) {
        Set a = m9124a(4, false);
        a.add(t);
        a.add(t2);
        a.add(t3);
        a.add(t4);
        return Collections.unmodifiableSet(a);
    }

    /* renamed from: a */
    private static <K, V> void m9128a(Map<K, V> map, K[] kArr, V[] vArr) {
        for (int i = 0; i < kArr.length; i++) {
            map.put(kArr[i], vArr[i]);
        }
    }

    /* renamed from: b */
    public static <K, V> Map<K, V> m9129b() {
        return Collections.emptyMap();
    }

    /* renamed from: b */
    private static <K, V> Map<K, V> m9130b(int i, boolean z) {
        return i <= (z ? 128 : 256) ? new C1080b(i) : new HashMap(i, z ? 0.75f : 1.0f);
    }

    @Deprecated
    /* renamed from: b */
    public static <T> Set<T> m9131b(T t) {
        return Collections.singleton(t);
    }

    @Deprecated
    /* renamed from: b */
    public static <T> Set<T> m9132b(T t, T t2) {
        Set a = m9124a(2, false);
        a.add(t);
        a.add(t2);
        return Collections.unmodifiableSet(a);
    }

    @Deprecated
    /* renamed from: b */
    public static <T> Set<T> m9133b(T... tArr) {
        int length = tArr.length;
        return length != 0 ? length != 1 ? length != 2 ? length != 3 ? length != 4 ? Collections.unmodifiableSet(m9125a(tArr.length, false, tArr)) : m9127a(tArr[0], tArr[1], tArr[2], tArr[3]) : m9126a(tArr[0], tArr[1], tArr[2]) : m9132b(tArr[0], tArr[1]) : m9131b(tArr[0]) : m9135c();
    }

    /* renamed from: b */
    private static <K, V> void m9134b(K[] kArr, V[] vArr) {
        if (kArr.length != vArr.length) {
            int length = kArr.length;
            int length2 = vArr.length;
            StringBuilder sb = new StringBuilder(66);
            sb.append("Key and values array lengths not equal: ");
            sb.append(length);
            sb.append(" != ");
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    @Deprecated
    /* renamed from: c */
    public static <T> Set<T> m9135c() {
        return Collections.emptySet();
    }
}
