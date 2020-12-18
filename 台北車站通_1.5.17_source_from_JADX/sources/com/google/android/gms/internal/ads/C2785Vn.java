package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Vn */
final class C2785Vn implements Comparable<C2785Vn>, Map.Entry<K, V> {

    /* renamed from: a */
    private final K f8455a;

    /* renamed from: b */
    private V f8456b;

    /* renamed from: c */
    private final /* synthetic */ C2583On f8457c;

    C2785Vn(C2583On on, K k, V v) {
        this.f8457c = on;
        this.f8455a = k;
        this.f8456b = v;
    }

    C2785Vn(C2583On on, Map.Entry<K, V> entry) {
        this(on, (Comparable) entry.getKey(), entry.getValue());
    }

    /* renamed from: a */
    private static boolean m11442a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((C2785Vn) obj).getKey());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return m11442a(this.f8455a, entry.getKey()) && m11442a(this.f8456b, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.f8455a;
    }

    public final V getValue() {
        return this.f8456b;
    }

    public final int hashCode() {
        K k = this.f8455a;
        int i = 0;
        int hashCode = k == null ? 0 : k.hashCode();
        V v = this.f8456b;
        if (v != null) {
            i = v.hashCode();
        }
        return hashCode ^ i;
    }

    public final V setValue(V v) {
        this.f8457c.m10831f();
        V v2 = this.f8456b;
        this.f8456b = v;
        return v2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f8455a);
        String valueOf2 = String.valueOf(this.f8456b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
