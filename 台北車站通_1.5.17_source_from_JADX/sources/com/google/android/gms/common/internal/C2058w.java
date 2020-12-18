package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.C2064k;
import com.google.android.gms.common.p072c.C1989c;

/* renamed from: com.google.android.gms.common.internal.w */
public class C2058w {

    /* renamed from: a */
    private static Object f6517a = new Object();

    /* renamed from: b */
    private static boolean f6518b;

    /* renamed from: c */
    private static String f6519c;

    /* renamed from: d */
    private static int f6520d;

    /* renamed from: a */
    public static String m9059a(Context context) {
        m9061c(context);
        return f6519c;
    }

    /* renamed from: b */
    public static int m9060b(Context context) {
        m9061c(context);
        return f6520d;
    }

    /* renamed from: c */
    private static void m9061c(Context context) {
        synchronized (f6517a) {
            if (!f6518b) {
                f6518b = true;
                try {
                    Bundle bundle = C1989c.m8748b(context).mo7517a(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        f6519c = bundle.getString("com.google.app.id");
                        f6520d = bundle.getInt(C2064k.KEY_METADATA_GOOGLE_PLAY_SERVICES_VERSION);
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e);
                }
            }
        }
    }
}
