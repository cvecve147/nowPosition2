package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C1697X;
import java.math.BigInteger;
import java.util.Locale;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Sd */
public final class C2689Sd {

    /* renamed from: a */
    private static final Object f8243a = new Object();

    /* renamed from: b */
    private static String f8244b;

    /* renamed from: a */
    public static String m11152a() {
        String str;
        synchronized (f8243a) {
            str = f8244b;
        }
        return str;
    }

    /* renamed from: a */
    public static String m11153a(Context context, String str, String str2) {
        String str3;
        String str4;
        synchronized (f8243a) {
            if (f8244b == null && !TextUtils.isEmpty(str)) {
                try {
                    ClassLoader classLoader = context.createPackageContext(str2, 3).getClassLoader();
                    Class<?> cls = Class.forName("com.google.ads.mediation.MediationAdapter", false, classLoader);
                    BigInteger bigInteger = new BigInteger(new byte[1]);
                    String[] split = str.split(",");
                    BigInteger bigInteger2 = bigInteger;
                    for (int i = 0; i < split.length; i++) {
                        C1697X.m7698e();
                        if (C3114ge.m12420a(classLoader, cls, split[i])) {
                            bigInteger2 = bigInteger2.setBit(i);
                        }
                    }
                    str4 = String.format(Locale.US, "%X", new Object[]{bigInteger2});
                } catch (Throwable unused) {
                    str4 = "err";
                }
                f8244b = str4;
            }
            str3 = f8244b;
        }
        return str3;
    }
}
