package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.apache.http.protocol.HTTP;

/* renamed from: com.google.android.gms.internal.ads.Qm */
public final class C2641Qm {

    /* renamed from: a */
    static final Charset f8145a = Charset.forName(HTTP.UTF_8);

    /* renamed from: b */
    private static final Charset f8146b = Charset.forName("ISO-8859-1");

    /* renamed from: c */
    public static final byte[] f8147c;

    /* renamed from: d */
    private static final ByteBuffer f8148d;

    /* renamed from: e */
    private static final C3411qm f8149e;

    static {
        byte[] bArr = new byte[0];
        f8147c = bArr;
        f8148d = ByteBuffer.wrap(bArr);
        byte[] bArr2 = f8147c;
        f8149e = C3411qm.m13539a(bArr2, 0, bArr2.length, false);
    }

    /* renamed from: a */
    static int m10983a(int i, byte[] bArr, int i2, int i3) {
        int i4 = i;
        for (int i5 = i2; i5 < i2 + i3; i5++) {
            i4 = (i4 * 31) + bArr[i5];
        }
        return i4;
    }

    /* renamed from: a */
    public static int m10984a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: a */
    public static int m10985a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: a */
    public static int m10986a(byte[] bArr) {
        int length = bArr.length;
        int a = m10983a(length, bArr, 0, length);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: a */
    static <T> T m10987a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    static Object m10988a(Object obj, Object obj2) {
        C3528un f = ((C3498tn) obj).mo8617f();
        f.mo9074a((C3498tn) obj2);
        return f.mo8625b();
    }

    /* renamed from: a */
    static <T> T m10989a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    static boolean m10990a(C3498tn tnVar) {
        return false;
    }

    /* renamed from: b */
    public static boolean m10991b(byte[] bArr) {
        return C3271lo.m12993a(bArr);
    }

    /* renamed from: c */
    public static String m10992c(byte[] bArr) {
        return new String(bArr, f8145a);
    }
}
