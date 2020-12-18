package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.l */
final class C3864l {

    /* renamed from: a */
    final int f11525a;

    /* renamed from: b */
    final byte[] f11526b;

    C3864l(int i, byte[] bArr) {
        this.f11525a = i;
        this.f11526b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3864l)) {
            return false;
        }
        C3864l lVar = (C3864l) obj;
        return this.f11525a == lVar.f11525a && Arrays.equals(this.f11526b, lVar.f11526b);
    }

    public final int hashCode() {
        return ((this.f11525a + 527) * 31) + Arrays.hashCode(this.f11526b);
    }
}
