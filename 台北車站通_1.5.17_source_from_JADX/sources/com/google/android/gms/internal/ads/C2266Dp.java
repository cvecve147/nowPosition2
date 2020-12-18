package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.Dp */
public final class C2266Dp {

    /* renamed from: a */
    private static Cipher f6907a;

    /* renamed from: b */
    private static final Object f6908b = new Object();

    /* renamed from: c */
    private static final Object f6909c = new Object();

    /* renamed from: d */
    private final SecureRandom f6910d = null;

    public C2266Dp(SecureRandom secureRandom) {
    }

    /* renamed from: a */
    private static Cipher m9641a() {
        Cipher cipher;
        synchronized (f6909c) {
            if (f6907a == null) {
                f6907a = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = f6907a;
        }
        return cipher;
    }

    /* renamed from: a */
    public final String mo8004a(byte[] bArr, byte[] bArr2) {
        byte[] doFinal;
        byte[] iv;
        if (bArr.length == 16) {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                synchronized (f6908b) {
                    m9641a().init(1, secretKeySpec, (SecureRandom) null);
                    doFinal = m9641a().doFinal(bArr2);
                    iv = m9641a().getIV();
                }
                int length = doFinal.length + iv.length;
                ByteBuffer allocate = ByteBuffer.allocate(length);
                allocate.put(iv).put(doFinal);
                allocate.flip();
                byte[] bArr3 = new byte[length];
                allocate.get(bArr3);
                return C2953ap.m11934a(bArr3, false);
            } catch (NoSuchAlgorithmException e) {
                throw new C2295Ep(this, e);
            } catch (InvalidKeyException e2) {
                throw new C2295Ep(this, e2);
            } catch (IllegalBlockSizeException e3) {
                throw new C2295Ep(this, e3);
            } catch (NoSuchPaddingException e4) {
                throw new C2295Ep(this, e4);
            } catch (BadPaddingException e5) {
                throw new C2295Ep(this, e5);
            }
        } else {
            throw new C2295Ep(this);
        }
    }

    /* renamed from: a */
    public final byte[] mo8005a(String str) {
        try {
            byte[] a = C2953ap.m11935a(str, false);
            if (a.length == 32) {
                byte[] bArr = new byte[16];
                ByteBuffer.wrap(a, 4, 16).get(bArr);
                for (int i = 0; i < 16; i++) {
                    bArr[i] = (byte) (bArr[i] ^ 68);
                }
                return bArr;
            }
            throw new C2295Ep(this);
        } catch (IllegalArgumentException e) {
            throw new C2295Ep(this, e);
        }
    }

    /* renamed from: a */
    public final byte[] mo8006a(byte[] bArr, String str) {
        byte[] doFinal;
        if (bArr.length == 16) {
            try {
                byte[] a = C2953ap.m11935a(str, false);
                if (a.length > 16) {
                    ByteBuffer allocate = ByteBuffer.allocate(a.length);
                    allocate.put(a);
                    allocate.flip();
                    byte[] bArr2 = new byte[16];
                    byte[] bArr3 = new byte[(a.length - 16)];
                    allocate.get(bArr2);
                    allocate.get(bArr3);
                    SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                    synchronized (f6908b) {
                        m9641a().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                        doFinal = m9641a().doFinal(bArr3);
                    }
                    return doFinal;
                }
                throw new C2295Ep(this);
            } catch (NoSuchAlgorithmException e) {
                throw new C2295Ep(this, e);
            } catch (InvalidKeyException e2) {
                throw new C2295Ep(this, e2);
            } catch (IllegalBlockSizeException e3) {
                throw new C2295Ep(this, e3);
            } catch (NoSuchPaddingException e4) {
                throw new C2295Ep(this, e4);
            } catch (BadPaddingException e5) {
                throw new C2295Ep(this, e5);
            } catch (InvalidAlgorithmParameterException e6) {
                throw new C2295Ep(this, e6);
            } catch (IllegalArgumentException e7) {
                throw new C2295Ep(this, e7);
            }
        } else {
            throw new C2295Ep(this);
        }
    }
}
