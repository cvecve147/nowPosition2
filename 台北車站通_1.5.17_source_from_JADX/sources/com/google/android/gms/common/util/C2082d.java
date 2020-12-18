package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.common.C2064k;
import com.google.android.gms.common.p072c.C1989c;

/* renamed from: com.google.android.gms.common.util.d */
public class C2082d {
    /* renamed from: a */
    public static int m9109a(Context context, String str) {
        return m9110a(m9112b(context, str));
    }

    /* renamed from: a */
    public static int m9110a(PackageInfo packageInfo) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null || (bundle = applicationInfo.metaData) == null) {
            return -1;
        }
        return bundle.getInt(C2064k.KEY_METADATA_GOOGLE_PLAY_SERVICES_VERSION, -1);
    }

    /* renamed from: a */
    public static boolean m9111a() {
        return false;
    }

    /* renamed from: b */
    public static PackageInfo m9112b(Context context, String str) {
        try {
            return C1989c.m8748b(context).mo7521b(str, 128);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static boolean m9113c(Context context, String str) {
        "com.google.android.gms".equals(str);
        try {
            return (C1989c.m8748b(context).mo7517a(str, 0).flags & 2097152) != 0;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
