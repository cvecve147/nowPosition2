package com.google.firebase.components;

/* renamed from: com.google.firebase.components.f */
public final class C4036f {

    /* renamed from: a */
    private final Class<?> f12010a;

    /* renamed from: b */
    private final int f12011b;

    /* renamed from: c */
    private final int f12012c;

    private C4036f(Class<?> cls, int i, int i2) {
        C4050t.m16216a(cls, "Null dependency interface.");
        this.f12010a = cls;
        this.f12011b = i;
        this.f12012c = i2;
    }

    /* renamed from: a */
    public static C4036f m16195a(Class<?> cls) {
        return new C4036f(cls, 1, 0);
    }

    /* renamed from: a */
    public final Class<?> mo11439a() {
        return this.f12010a;
    }

    /* renamed from: b */
    public final boolean mo11440b() {
        return this.f12011b == 1;
    }

    /* renamed from: c */
    public final boolean mo11441c() {
        return this.f12012c == 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4036f) {
            C4036f fVar = (C4036f) obj;
            return this.f12010a == fVar.f12010a && this.f12011b == fVar.f12011b && this.f12012c == fVar.f12012c;
        }
    }

    public final int hashCode() {
        return ((((this.f12010a.hashCode() ^ 1000003) * 1000003) ^ this.f12011b) * 1000003) ^ this.f12012c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Dependency{interface=");
        sb.append(this.f12010a);
        sb.append(", required=");
        boolean z = false;
        sb.append(this.f12011b == 1);
        sb.append(", direct=");
        if (this.f12012c == 0) {
            z = true;
        }
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
