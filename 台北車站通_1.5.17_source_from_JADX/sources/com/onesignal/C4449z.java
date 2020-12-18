package com.onesignal;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.C1991e;

/* renamed from: com.onesignal.z */
class C4449z {
    /* renamed from: a */
    static void m17648a() {
        if (!m17651b() && m17652c() && !C4370gb.m17355a(C4370gb.f12909a, "GT_DO_NOT_SHOW_MISSING_GPS", false)) {
            C4252Ia.m16867a((Runnable) new C4446y());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m17650b(Activity activity) {
        try {
            C1991e a = C1991e.m8751a();
            a.mo7528a((Context) activity, a.mo7540c(C4306Xa.f12759e), 9000).send();
        } catch (PendingIntent.CanceledException unused) {
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: b */
    static boolean m17651b() {
        try {
            return C4306Xa.f12759e.getPackageManager().getPackageInfo("com.google.android.gms", 128).applicationInfo.enabled;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: c */
    private static boolean m17652c() {
        try {
            PackageManager packageManager = C4306Xa.f12759e.getPackageManager();
            String str = (String) packageManager.getPackageInfo("com.google.android.gms", 128).applicationInfo.loadLabel(packageManager);
            return str != null && !str.equals("Market");
        } catch (Throwable unused) {
            return false;
        }
    }
}
