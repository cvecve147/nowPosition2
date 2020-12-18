package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.gl */
public final class C3121gl implements C2778Vi {

    /* renamed from: a */
    private final byte[] f9378a;

    /* renamed from: b */
    private final byte[] f9379b;

    /* renamed from: c */
    private final SecretKeySpec f9380c;

    /* renamed from: d */
    private final int f9381d;

    public C3121gl(byte[] bArr, int i) {
        if (i == 12 || i == 16) {
            this.f9381d = i;
            this.f9380c = new SecretKeySpec(bArr, "AES");
            Cipher instance = Cipher.getInstance("AES/ECB/NOPADDING");
            instance.init(1, this.f9380c);
            this.f9378a = m12472a(instance.doFinal(new byte[16]));
            this.f9379b = m12472a(this.f9378a);
            return;
        }
        throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
    }

    /* renamed from: a */
    private final byte[] m12471a(Cipher cipher, int i, byte[] bArr, int i2, int i3) {
        byte[] bArr2;
        byte[] b;
        byte[] bArr3 = new byte[16];
        bArr3[15] = (byte) i;
        if (i3 == 0) {
            b = m12473b(bArr3, this.f9378a);
        } else {
            byte[] doFinal = cipher.doFinal(bArr3);
            byte[] bArr4 = doFinal;
            int i4 = 0;
            while (i3 - i4 > 16) {
                for (int i5 = 0; i5 < 16; i5++) {
                    bArr4[i5] = (byte) (bArr4[i5] ^ bArr[(i2 + i4) + i5]);
                }
                bArr4 = cipher.doFinal(bArr4);
                i4 += 16;
            }
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i4 + i2, i2 + i3);
            if (copyOfRange.length == 16) {
                bArr2 = m12473b(copyOfRange, this.f9378a);
            } else {
                byte[] copyOf = Arrays.copyOf(this.f9379b, 16);
                for (int i6 = 0; i6 < copyOfRange.length; i6++) {
                    copyOf[i6] = (byte) (copyOf[i6] ^ copyOfRange[i6]);
                }
                copyOf[copyOfRange.length] = (byte) (copyOf[copyOfRange.length] ^ 128);
                bArr2 = copyOf;
            }
            b = m12473b(bArr4, bArr2);
        }
        return cipher.doFinal(b);
    }

    /* renamed from: a */
    private static byte[] m12472a(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        int i2 = 0;
        while (i2 < 15) {
            int i3 = i2 + 1;
            bArr2[i2] = (byte) ((bArr[i2] << 1) ^ ((bArr[i3] & 255) >>> 7));
            i2 = i3;
        }
        int i4 = bArr[15] << 1;
        if ((bArr[0] & 128) != 0) {
            i = 135;
        }
        bArr2[15] = (byte) (i4 ^ i);
        return bArr2;
    }

    /* renamed from: b */
    private static byte[] m12473b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    /* renamed from: a */
    public final byte[] mo8580a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        int length = bArr3.length;
        int i = this.f9381d;
        if (length <= (Integer.MAX_VALUE - i) - 16) {
            byte[] bArr4 = new byte[(bArr3.length + i + 16)];
            byte[] a = C2461Kl.m10431a(i);
            System.arraycopy(a, 0, bArr4, 0, this.f9381d);
            Cipher instance = Cipher.getInstance("AES/ECB/NOPADDING");
            instance.init(1, this.f9380c);
            byte[] a2 = m12471a(instance, 0, a, 0, a.length);
            byte[] bArr5 = bArr2 == null ? new byte[0] : bArr2;
            byte[] a3 = m12471a(instance, 1, bArr5, 0, bArr5.length);
            Cipher instance2 = Cipher.getInstance("AES/CTR/NOPADDING");
            instance2.init(1, this.f9380c, new IvParameterSpec(a2));
            instance2.doFinal(bArr, 0, bArr3.length, bArr4, this.f9381d);
            byte[] a4 = m12471a(instance, 2, bArr4, this.f9381d, bArr3.length);
            int length2 = bArr3.length + this.f9381d;
            for (int i2 = 0; i2 < 16; i2++) {
                bArr4[length2 + i2] = (byte) ((a3[i2] ^ a2[i2]) ^ a4[i2]);
            }
            return bArr4;
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
