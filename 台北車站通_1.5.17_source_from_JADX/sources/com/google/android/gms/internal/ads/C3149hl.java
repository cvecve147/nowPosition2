package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.hl */
public final class C3149hl implements C2778Vi {

    /* renamed from: a */
    private final SecretKey f9433a;

    public C3149hl(byte[] bArr) {
        this.f9433a = new SecretKeySpec(bArr, "AES");
    }

    /* renamed from: a */
    public final byte[] mo8580a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[(bArr.length + 12 + 16)];
            byte[] a = C2461Kl.m10431a(12);
            System.arraycopy(a, 0, bArr3, 0, 12);
            Cipher a2 = C3582wl.f10443c.mo10164a("AES/GCM/NoPadding");
            a2.init(1, this.f9433a, new GCMParameterSpec(128, a));
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            a2.updateAAD(bArr2);
            a2.doFinal(bArr, 0, bArr.length, bArr3, 12);
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
