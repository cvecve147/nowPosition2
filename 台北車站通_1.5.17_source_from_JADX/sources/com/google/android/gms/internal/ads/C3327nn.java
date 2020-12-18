package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.nn */
public final class C3327nn<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: a */
    private static final C3327nn f9877a;

    /* renamed from: b */
    private boolean f9878b = true;

    static {
        C3327nn nnVar = new C3327nn();
        f9877a = nnVar;
        nnVar.f9878b = false;
    }

    private C3327nn() {
    }

    private C3327nn(Map<K, V> map) {
        super(map);
    }

    /* renamed from: a */
    private static int m13161a(Object obj) {
        if (obj instanceof byte[]) {
            return C2641Qm.m10986a((byte[]) obj);
        }
        if (!(obj instanceof C2671Rm)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    public static <K, V> C3327nn<K, V> m13162f() {
        return f9877a;
    }

    /* renamed from: h */
    private final void m13163h() {
        if (!this.f9878b) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: a */
    public final void mo9792a(C3327nn<K, V> nnVar) {
        m13163h();
        if (!nnVar.isEmpty()) {
            putAll(nnVar);
        }
    }

    public final void clear() {
        m13163h();
        super.clear();
    }

    /* renamed from: d */
    public final boolean mo9794d() {
        return this.f9878b;
    }

    /* renamed from: e */
    public final void mo9795e() {
        this.f9878b = false;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L_0x005d
            java.util.Map r7 = (java.util.Map) r7
            r0 = 1
            if (r6 == r7) goto L_0x0059
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L_0x0016
        L_0x0014:
            r7 = r1
            goto L_0x005a
        L_0x0016:
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x001e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0059
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L_0x0035
            goto L_0x0014
        L_0x0035:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L_0x0052
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L_0x0052
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L_0x0056
        L_0x0052:
            boolean r3 = r4.equals(r3)
        L_0x0056:
            if (r3 != 0) goto L_0x001e
            goto L_0x0014
        L_0x0059:
            r7 = r0
        L_0x005a:
            if (r7 == 0) goto L_0x005d
            return r0
        L_0x005d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3327nn.equals(java.lang.Object):boolean");
    }

    /* renamed from: g */
    public final C3327nn<K, V> mo9798g() {
        return isEmpty() ? new C3327nn<>() : new C3327nn<>(this);
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += m13161a(entry.getValue()) ^ m13161a(entry.getKey());
        }
        return i;
    }

    public final V put(K k, V v) {
        m13163h();
        C2641Qm.m10987a(k);
        C2641Qm.m10987a(v);
        return super.put(k, v);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        m13163h();
        for (Object next : map.keySet()) {
            C2641Qm.m10987a(next);
            C2641Qm.m10987a(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        m13163h();
        return super.remove(obj);
    }
}
