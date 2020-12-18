package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C2037n;
import com.google.android.gms.common.p072c.C1989c;
import com.google.android.gms.common.util.C2087i;

/* renamed from: com.google.android.gms.common.f */
public class C1993f {

    /* renamed from: a */
    public static final int f6371a = C2064k.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    /* renamed from: b */
    private static final C1993f f6372b = new C1993f();

    C1993f() {
    }

    /* renamed from: a */
    public static C1993f m8774a() {
        return f6372b;
    }

    /* renamed from: b */
    private static String m8775b(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(f6371a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(C1989c.m8748b(context).mo7521b(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public int mo7526a(Context context, int i) {
        int isGooglePlayServicesAvailable = C2064k.isGooglePlayServicesAvailable(context, i);
        if (C2064k.isPlayServicesPossiblyUpdating(context, isGooglePlayServicesAvailable)) {
            return 18;
        }
        return isGooglePlayServicesAvailable;
    }

    /* renamed from: a */
    public PendingIntent mo7528a(Context context, int i, int i2) {
        return mo7529a(context, i, i2, (String) null);
    }

    /* renamed from: a */
    public PendingIntent mo7529a(Context context, int i, int i2, String str) {
        Intent a = mo7532a(context, i, str);
        if (a == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, a, 134217728);
    }

    @Deprecated
    /* renamed from: a */
    public Intent mo7531a(int i) {
        return mo7532a((Context) null, i, (String) null);
    }

    /* renamed from: a */
    public Intent mo7532a(Context context, int i, String str) {
        if (i == 1 || i == 2) {
            return (context == null || !C2087i.m9152d(context)) ? C2037n.m8985a("com.google.android.gms", m8775b(context, str)) : C2037n.m8983a();
        }
        if (i != 3) {
            return null;
        }
        return C2037n.m8984a("com.google.android.gms");
    }

    /* renamed from: a */
    public void mo7545a(Context context) {
        C2064k.cancelAvailabilityErrorNotifications(context);
    }

    /* renamed from: a */
    public boolean mo7546a(Context context, String str) {
        return C2064k.isUninstalledAppPossiblyUpdating(context, str);
    }

    /* renamed from: b */
    public int mo7535b(Context context) {
        return C2064k.getApkVersion(context);
    }

    /* renamed from: b */
    public String mo7536b(int i) {
        return C2064k.getErrorString(i);
    }

    /* renamed from: b */
    public boolean mo7539b(Context context, int i) {
        return C2064k.isPlayServicesPossiblyUpdating(context, i);
    }

    /* renamed from: c */
    public int mo7540c(Context context) {
        return mo7526a(context, f6371a);
    }

    /* renamed from: c */
    public boolean mo7542c(int i) {
        return C2064k.isUserRecoverableError(i);
    }
}
