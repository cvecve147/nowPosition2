package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.Ko */
final class C2464Ko {

    /* renamed from: a */
    final int f7467a;

    /* renamed from: b */
    final byte[] f7468b;

    C2464Ko(int i, byte[] bArr) {
        this.f7467a = i;
        this.f7468b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2464Ko)) {
            return false;
        }
        C2464Ko ko = (C2464Ko) obj;
        return this.f7467a == ko.f7467a && Arrays.equals(this.f7468b, ko.f7468b);
    }

    public final int hashCode() {
        return ((this.f7467a + 527) * 31) + Arrays.hashCode(this.f7468b);
    }
}
