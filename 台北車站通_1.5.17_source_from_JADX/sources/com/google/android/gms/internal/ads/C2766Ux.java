package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C1766na;
import java.util.Arrays;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Ux */
final class C2766Ux {

    /* renamed from: a */
    private final Object[] f8418a;

    C2766Ux(zzjj zzjj, String str, int i) {
        this.f8418a = C1766na.m7950a((String) C3390pt.m13458f().mo8515a(C2558Nu.f8009zb), zzjj, str, i, (zzjn) null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2766Ux)) {
            return false;
        }
        return Arrays.equals(this.f8418a, ((C2766Ux) obj).f8418a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8418a);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f8418a);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 24);
        sb.append("[InterstitialAdPoolKey ");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}
