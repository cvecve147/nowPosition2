package com.google.android.gms.common.util;

import com.google.android.gms.common.internal.C2059x;
import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: com.google.android.gms.common.util.b */
public final class C2080b {
    /* renamed from: a */
    public static <T> boolean m9104a(T[] tArr, T t) {
        return m9107b(tArr, t) >= 0;
    }

    /* renamed from: a */
    public static <T> T[] m9105a(T[] tArr, int i) {
        if (tArr == null) {
            return null;
        }
        return i != tArr.length ? Arrays.copyOf(tArr, i) : tArr;
    }

    /* renamed from: a */
    public static <T> T[] m9106a(T[] tArr, T... tArr2) {
        int i;
        if (tArr == null) {
            return null;
        }
        if (tArr2 == null || tArr2.length == 0) {
            return Arrays.copyOf(tArr, tArr.length);
        }
        Object[] objArr = (Object[]) Array.newInstance(tArr2.getClass().getComponentType(), tArr.length);
        if (tArr2.length == 1) {
            i = 0;
            for (T t : tArr) {
                if (!C2059x.m9064a(tArr2[0], t)) {
                    objArr[i] = t;
                    i++;
                }
            }
        } else {
            i = 0;
            for (T t2 : tArr) {
                if (!m9104a(tArr2, t2)) {
                    objArr[i] = t2;
                    i++;
                }
            }
        }
        return m9105a((T[]) objArr, i);
    }

    /* renamed from: b */
    public static <T> int m9107b(T[] tArr, T t) {
        int length = tArr != null ? tArr.length : 0;
        for (int i = 0; i < length; i++) {
            if (C2059x.m9064a(tArr[i], t)) {
                return i;
            }
        }
        return -1;
    }
}
