package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.Arrays;
import org.apache.http.protocol.HTTP;

/* renamed from: com.google.android.gms.internal.measurement.h */
public final class C3848h {

    /* renamed from: a */
    protected static final Charset f11466a = Charset.forName(HTTP.UTF_8);

    /* renamed from: b */
    private static final Charset f11467b = Charset.forName("ISO-8859-1");

    /* renamed from: c */
    public static final Object f11468c = new Object();

    /* renamed from: a */
    public static int m15457a(long[] jArr) {
        if (jArr == null || jArr.length == 0) {
            return 0;
        }
        return Arrays.hashCode(jArr);
    }

    /* renamed from: a */
    public static int m15458a(Object[] objArr) {
        int length = objArr == null ? 0 : objArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = objArr[i2];
            if (obj != null) {
                i = (i * 31) + obj.hashCode();
            }
        }
        return i;
    }

    /* renamed from: a */
    public static void m15459a(C3832d dVar, C3832d dVar2) {
        C3840f fVar = dVar.f11405b;
        if (fVar != null) {
            dVar2.f11405b = (C3840f) fVar.clone();
        }
    }

    /* renamed from: a */
    public static boolean m15460a(long[] jArr, long[] jArr2) {
        return (jArr == null || jArr.length == 0) ? jArr2 == null || jArr2.length == 0 : Arrays.equals(jArr, jArr2);
    }

    /* renamed from: a */
    public static boolean m15461a(Object[] objArr, Object[] objArr2) {
        int length = objArr == null ? 0 : objArr.length;
        int length2 = objArr2 == null ? 0 : objArr2.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length || objArr[i] != null) {
                while (i2 < length2 && objArr2[i2] == null) {
                    i2++;
                }
                boolean z = i >= length;
                boolean z2 = i2 >= length2;
                if (z && z2) {
                    return true;
                }
                if (z != z2 || !objArr[i].equals(objArr2[i2])) {
                    return false;
                }
                i++;
                i2++;
            } else {
                i++;
            }
        }
    }
}
