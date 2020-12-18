package com.google.android.gms.common.p072c;

import android.content.Context;
import com.google.android.gms.common.util.C2092n;

/* renamed from: com.google.android.gms.common.c.a */
public class C1987a {

    /* renamed from: a */
    private static Context f6360a;

    /* renamed from: b */
    private static Boolean f6361b;

    /* renamed from: a */
    public static synchronized boolean m8739a(Context context) {
        boolean z;
        synchronized (C1987a.class) {
            Context applicationContext = context.getApplicationContext();
            if (f6360a == null || f6361b == null || f6360a != applicationContext) {
                f6361b = null;
                if (C2092n.m9171l()) {
                    z = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
                } else {
                    try {
                        context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                        f6361b = true;
                    } catch (ClassNotFoundException unused) {
                        z = false;
                    }
                    f6360a = applicationContext;
                    boolean booleanValue = f6361b.booleanValue();
                    return booleanValue;
                }
                f6361b = z;
                f6360a = applicationContext;
                boolean booleanValue2 = f6361b.booleanValue();
                return booleanValue2;
            }
            boolean booleanValue3 = f6361b.booleanValue();
            return booleanValue3;
        }
    }
}
