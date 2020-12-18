package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.gms.internal.ads.Ej */
final class C2288Ej {
    /* renamed from: a */
    public static C3496tl m9699a(C3553vk vkVar) {
        int i = C2317Fj.f6996b[vkVar.ordinal()];
        if (i == 1) {
            return C3496tl.NIST_P256;
        }
        if (i == 2) {
            return C3496tl.NIST_P384;
        }
        if (i == 3) {
            return C3496tl.NIST_P521;
        }
        String valueOf = String.valueOf(vkVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("unknown curve type: ");
        sb.append(valueOf);
        throw new GeneralSecurityException(sb.toString());
    }

    /* renamed from: a */
    public static C3524ul m9700a(C3148hk hkVar) {
        int i = C2317Fj.f6997c[hkVar.ordinal()];
        if (i == 1) {
            return C3524ul.UNCOMPRESSED;
        }
        if (i == 2) {
            return C3524ul.COMPRESSED;
        }
        String valueOf = String.valueOf(hkVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("unknown point format: ");
        sb.append(valueOf);
        throw new GeneralSecurityException(sb.toString());
    }

    /* renamed from: a */
    public static String m9701a(C3637yk ykVar) {
        int i = C2317Fj.f6995a[ykVar.ordinal()];
        if (i == 1) {
            return "HmacSha1";
        }
        if (i == 2) {
            return "HmacSha256";
        }
        if (i == 3) {
            return "HmacSha512";
        }
        String valueOf = String.valueOf(ykVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("hash unsupported for HMAC: ");
        sb.append(valueOf);
        throw new NoSuchAlgorithmException(sb.toString());
    }

    /* renamed from: a */
    public static void m9702a(C3323nk nkVar) {
        C3439rl.m13666a(m9699a(nkVar.mo9789l().mo10052l()));
        m9701a(nkVar.mo9789l().mo10053m());
        if (nkVar.mo9791n() != C3148hk.UNKNOWN_FORMAT) {
            C3237kj.m12880a(nkVar.mo9790m().mo9595l());
            return;
        }
        throw new GeneralSecurityException("unknown EC point format");
    }
}
