package com.facebook.p060a.p061a;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.facebook.C1601x;
import p052c.C1154a;

/* renamed from: com.facebook.a.a.n */
class C1385n {

    /* renamed from: a */
    private String f4896a;

    /* renamed from: b */
    private boolean f4897b;

    /* renamed from: com.facebook.a.a.n$a */
    public static class C1386a {
        /* renamed from: a */
        public static C1385n m6667a(Activity activity) {
            ComponentName callingActivity = activity.getCallingActivity();
            if (callingActivity == null) {
                return null;
            }
            String packageName = callingActivity.getPackageName();
            if (packageName.equals(activity.getPackageName())) {
                return null;
            }
            Intent intent = activity.getIntent();
            boolean z = false;
            if (intent != null && !intent.getBooleanExtra("_fbSourceApplicationHasBeenSet", false)) {
                intent.putExtra("_fbSourceApplicationHasBeenSet", true);
                Bundle a = C1154a.m5854a(intent);
                if (a != null) {
                    Bundle bundle = a.getBundle("referer_app_link");
                    if (bundle != null) {
                        packageName = bundle.getString("package");
                    }
                    z = true;
                }
            }
            intent.putExtra("_fbSourceApplicationHasBeenSet", true);
            return new C1385n(packageName, z);
        }
    }

    private C1385n(String str, boolean z) {
        this.f4896a = str;
        this.f4897b = z;
    }

    /* renamed from: a */
    public static void m6664a() {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(C1601x.m7386b()).edit();
        edit.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
        edit.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
        edit.apply();
    }

    /* renamed from: b */
    public static C1385n m6665b() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C1601x.m7386b());
        if (!defaultSharedPreferences.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage")) {
            return null;
        }
        return new C1385n(defaultSharedPreferences.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", (String) null), defaultSharedPreferences.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false));
    }

    /* renamed from: c */
    public void mo6043c() {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(C1601x.m7386b()).edit();
        edit.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", this.f4896a);
        edit.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", this.f4897b);
        edit.apply();
    }

    public String toString() {
        String str = this.f4897b ? "Applink" : "Unclassified";
        if (this.f4896a == null) {
            return str;
        }
        return str + "(" + this.f4896a + ")";
    }
}
