package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Zm */
final class C2894Zm<K> implements Map.Entry<K, Object> {

    /* renamed from: a */
    private Map.Entry<K, C2839Xm> f8692a;

    private C2894Zm(Map.Entry<K, C2839Xm> entry) {
        this.f8692a = entry;
    }

    /* renamed from: a */
    public final C2839Xm mo9118a() {
        return this.f8692a.getValue();
    }

    public final K getKey() {
        return this.f8692a.getKey();
    }

    public final Object getValue() {
        if (this.f8692a.getValue() == null) {
            return null;
        }
        C2839Xm.m11590c();
        throw null;
    }

    public final Object setValue(Object obj) {
        if (obj instanceof C3498tn) {
            return this.f8692a.getValue().mo9254a((C3498tn) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
