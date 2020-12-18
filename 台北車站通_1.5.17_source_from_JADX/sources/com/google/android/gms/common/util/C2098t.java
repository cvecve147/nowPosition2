package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.C2065l;
import com.google.android.gms.common.p072c.C1989c;

/* renamed from: com.google.android.gms.common.util.t */
public final class C2098t {
    /* renamed from: a */
    public static boolean m9180a(Context context, int i) {
        if (!m9181a(context, i, "com.google.android.gms")) {
            return false;
        }
        try {
            return C2065l.m9082a(context).mo7716a(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            }
            return false;
        }
    }

    @TargetApi(19)
    /* renamed from: a */
    public static boolean m9181a(Context context, int i, String str) {
        return C1989c.m8748b(context).mo7519a(i, str);
    }
}
