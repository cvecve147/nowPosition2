package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.util.Log;
import com.facebook.C1529k;
import com.facebook.C1601x;
import com.facebook.C1603y;
import java.util.Collection;
import java.util.List;

/* renamed from: com.facebook.internal.ca */
public final class C1484ca {

    /* renamed from: a */
    private static final String f5131a = "com.facebook.internal.ca";

    /* renamed from: a */
    public static String m6974a() {
        String c = C1601x.m7389c();
        if (c != null) {
            return c;
        }
        throw new IllegalStateException("No App ID found, please set the App ID.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m6975a(android.content.Context r3, boolean r4) {
        /*
            java.lang.String r0 = "context"
            m6976a((java.lang.Object) r3, (java.lang.String) r0)
            android.content.pm.PackageManager r0 = r3.getPackageManager()
            if (r0 == 0) goto L_0x0018
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.Class<com.facebook.FacebookActivity> r2 = com.facebook.FacebookActivity.class
            r1.<init>(r3, r2)
            r3 = 1
            android.content.pm.ActivityInfo r3 = r0.getActivityInfo(r1, r3)     // Catch:{ NameNotFoundException -> 0x0018 }
            goto L_0x0019
        L_0x0018:
            r3 = 0
        L_0x0019:
            if (r3 != 0) goto L_0x002b
            java.lang.String r3 = "FacebookActivity is not declared in the AndroidManifest.xml, please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info."
            if (r4 != 0) goto L_0x0025
            java.lang.String r4 = f5131a
            android.util.Log.w(r4, r3)
            goto L_0x002b
        L_0x0025:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>(r3)
            throw r4
        L_0x002b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C1484ca.m6975a(android.content.Context, boolean):void");
    }

    /* renamed from: a */
    public static void m6976a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException("Argument '" + str + "' cannot be null");
        }
    }

    /* renamed from: a */
    public static void m6977a(String str, String str2) {
        if (C1480ba.m6958b(str)) {
            throw new IllegalArgumentException("Argument '" + str2 + "' cannot be null or empty");
        }
    }

    /* renamed from: a */
    public static <T> void m6978a(Collection<T> collection, String str) {
        m6976a((Object) collection, str);
        for (T t : collection) {
            if (t == null) {
                throw new NullPointerException("Container '" + str + "' cannot contain null values");
            }
        }
    }

    /* renamed from: a */
    public static boolean m6979a(Context context) {
        List<ResolveInfo> list;
        m6976a((Object) context, "context");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse("fb" + C1601x.m7389c() + "://authorize"));
            list = packageManager.queryIntentActivities(intent, 64);
        } else {
            list = null;
        }
        if (list == null) {
            return false;
        }
        boolean z = false;
        for (ResolveInfo resolveInfo : list) {
            if (!resolveInfo.activityInfo.name.equals(C1529k.class.getName())) {
                return false;
            }
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    public static String m6980b() {
        String g = C1601x.m7394g();
        if (g != null) {
            return g;
        }
        throw new IllegalStateException("No Client Token found, please set the Client Token.");
    }

    /* renamed from: b */
    public static void m6981b(Context context, boolean z) {
        m6976a((Object) context, "context");
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") != -1) {
            return;
        }
        if (!z) {
            Log.w(f5131a, "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
            return;
        }
        throw new IllegalStateException("No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
    }

    /* renamed from: b */
    public static <T> void m6982b(Collection<T> collection, String str) {
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("Container '" + str + "' cannot be empty");
        }
    }

    /* renamed from: c */
    public static void m6983c() {
        if (!C1601x.m7402o()) {
            throw new C1603y("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }

    /* renamed from: c */
    public static <T> void m6984c(Collection<T> collection, String str) {
        m6978a(collection, str);
        m6982b(collection, str);
    }
}
