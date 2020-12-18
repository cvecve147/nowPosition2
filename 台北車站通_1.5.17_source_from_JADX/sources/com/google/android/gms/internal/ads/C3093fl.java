package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.fl */
public final class C3093fl implements C2377Hl {

    /* renamed from: a */
    private final SecretKeySpec f9142a;

    /* renamed from: b */
    private final int f9143b;

    /* renamed from: c */
    private final int f9144c = C3582wl.f10443c.mo10164a("AES/CTR/NoPadding").getBlockSize();

    public C3093fl(byte[] bArr, int i) {
        this.f9142a = new SecretKeySpec(bArr, "AES");
        if (i < 12 || i > this.f9144c) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f9143b = i;
    }

    /* renamed from: a */
    public final byte[] mo8282a(byte[] bArr) {
        int length = bArr.length;
        int i = this.f9143b;
        if (length <= Integer.MAX_VALUE - i) {
            byte[] bArr2 = new byte[(bArr.length + i)];
            byte[] a = C2461Kl.m10431a(i);
            System.arraycopy(a, 0, bArr2, 0, this.f9143b);
            int length2 = bArr.length;
            int i2 = this.f9143b;
            Cipher a2 = C3582wl.f10443c.mo10164a("AES/CTR/NoPadding");
            byte[] bArr3 = new byte[this.f9144c];
            System.arraycopy(a, 0, bArr3, 0, this.f9143b);
            a2.init(1, this.f9142a, new IvParameterSpec(bArr3));
            if (a2.doFinal(bArr, 0, length2, bArr2, i2) == length2) {
                return bArr2;
            }
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
        int i3 = Integer.MAX_VALUE - i;
        StringBuilder sb = new StringBuilder(43);
        sb.append("plaintext length can not exceed ");
        sb.append(i3);
        throw new GeneralSecurityException(sb.toString());
    }
}
