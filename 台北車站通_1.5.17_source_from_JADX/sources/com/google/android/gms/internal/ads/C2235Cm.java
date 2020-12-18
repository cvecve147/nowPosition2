package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Cm */
final class C2235Cm {

    /* renamed from: a */
    private final Object f6810a;

    /* renamed from: b */
    private final int f6811b;

    C2235Cm(Object obj, int i) {
        this.f6810a = obj;
        this.f6811b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2235Cm)) {
            return false;
        }
        C2235Cm cm = (C2235Cm) obj;
        return this.f6810a == cm.f6810a && this.f6811b == cm.f6811b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f6810a) * 65535) + this.f6811b;
    }
}
