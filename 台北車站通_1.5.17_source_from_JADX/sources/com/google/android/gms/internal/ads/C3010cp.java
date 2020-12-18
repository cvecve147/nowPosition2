package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.apache.http.protocol.HTTP;

/* renamed from: com.google.android.gms.internal.ads.cp */
final class C3010cp {

    /* renamed from: a */
    private static boolean f9003a = false;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static MessageDigest f9004b;

    /* renamed from: c */
    private static final Object f9005c = new Object();

    /* renamed from: d */
    private static final Object f9006d = new Object();

    /* renamed from: e */
    static CountDownLatch f9007e = new CountDownLatch(1);

    /* renamed from: a */
    private static C2921_l m12100a(long j) {
        C2921_l _lVar = new C2921_l();
        _lVar.f8845v = 4096L;
        return _lVar;
    }

    /* renamed from: a */
    static String m12101a(C2921_l _lVar, String str) {
        byte[] bArr;
        byte[] a = C2408Io.m10310a((C2408Io) _lVar);
        if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7992wc)).booleanValue()) {
            Vector<byte[]> a2 = m12103a(a, 255);
            if (a2 == null || a2.size() == 0) {
                bArr = m12106a(C2408Io.m10310a((C2408Io) m12100a(4096)), str, true);
            } else {
                C2896Zo zo = new C2896Zo();
                zo.f8697c = new byte[a2.size()][];
                Iterator<byte[]> it = a2.iterator();
                int i = 0;
                while (it.hasNext()) {
                    zo.f8697c[i] = m12106a(it.next(), str, false);
                    i++;
                }
                zo.f8698d = m12105a(a);
                bArr = C2408Io.m10310a((C2408Io) zo);
            }
        } else if (C2870Yp.f8657a != null) {
            byte[] a3 = C2870Yp.f8657a.mo7993a(a, str != null ? str.getBytes() : new byte[0]);
            C2896Zo zo2 = new C2896Zo();
            zo2.f8697c = new byte[][]{a3};
            zo2.f8700f = 2;
            bArr = C2408Io.m10310a((C2408Io) zo2);
        } else {
            throw new GeneralSecurityException();
        }
        return C2953ap.m11934a(bArr, true);
    }

    /* renamed from: a */
    private static Vector<byte[]> m12103a(byte[] bArr, int i) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        int length = ((bArr.length + 255) - 1) / 255;
        Vector<byte[]> vector = new Vector<>();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 * 255;
            try {
                vector.add(Arrays.copyOfRange(bArr, i3, bArr.length - i3 > 255 ? i3 + 255 : bArr.length));
                i2++;
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    /* renamed from: a */
    static void m12104a() {
        synchronized (f9006d) {
            if (!f9003a) {
                f9003a = true;
                new Thread(new C3068ep()).start();
            }
        }
    }

    /* renamed from: a */
    public static byte[] m12105a(byte[] bArr) {
        byte[] digest;
        synchronized (f9005c) {
            MessageDigest b = m12107b();
            if (b != null) {
                b.reset();
                b.update(bArr);
                digest = f9004b.digest();
            } else {
                throw new NoSuchAlgorithmException("Cannot compute hash");
            }
        }
        return digest;
    }

    /* renamed from: a */
    private static byte[] m12106a(byte[] bArr, String str, boolean z) {
        ByteBuffer byteBuffer;
        int i = z ? 239 : 255;
        if (bArr.length > i) {
            bArr = C2408Io.m10310a((C2408Io) m12100a(4096));
        }
        if (bArr.length < i) {
            byte[] bArr2 = new byte[(i - bArr.length)];
            new SecureRandom().nextBytes(bArr2);
            byteBuffer = ByteBuffer.allocate(i + 1).put((byte) bArr.length).put(bArr).put(bArr2);
        } else {
            byteBuffer = ByteBuffer.allocate(i + 1).put((byte) bArr.length).put(bArr);
        }
        byte[] array = byteBuffer.array();
        if (z) {
            array = ByteBuffer.allocate(256).put(m12105a(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        for (C3153hp a : new C3097fp().f9195Lc) {
            a.mo9525a(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new C2810Wl(str.getBytes(HTTP.UTF_8)).mo9001a(bArr3);
        }
        return bArr3;
    }

    /* renamed from: b */
    private static MessageDigest m12107b() {
        boolean z;
        MessageDigest messageDigest;
        m12104a();
        try {
            z = f9007e.await(2, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            z = false;
        }
        if (z && (messageDigest = f9004b) != null) {
            return messageDigest;
        }
        return null;
    }
}
