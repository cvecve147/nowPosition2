package com.google.android.gms.common.p070a;

/* renamed from: com.google.android.gms.common.a.a */
public final class C1846a {

    /* renamed from: a */
    private final int f6020a;

    /* renamed from: b */
    private final int f6021b;

    public C1846a(int i, int i2) {
        this.f6020a = i;
        this.f6021b = i2;
    }

    /* renamed from: a */
    public final int mo7235a() {
        return this.f6021b;
    }

    /* renamed from: b */
    public final int mo7236b() {
        return this.f6020a;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1846a) {
            C1846a aVar = (C1846a) obj;
            return this.f6020a == aVar.f6020a && this.f6021b == aVar.f6021b;
        }
    }

    public final int hashCode() {
        int i = this.f6021b;
        int i2 = this.f6020a;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public final String toString() {
        int i = this.f6020a;
        int i2 = this.f6021b;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        return sb.toString();
    }
}
