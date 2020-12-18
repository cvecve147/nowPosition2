package com.google.android.gms.ads.internal.gmsg;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.internal.ads.C2209Bp;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.ads.internal.gmsg.f */
public final class C1732f {

    /* renamed from: a */
    private final Context f5708a;

    /* renamed from: b */
    private final C2209Bp f5709b;

    /* renamed from: c */
    private final View f5710c;

    public C1732f(Context context, C2209Bp bp, View view) {
        this.f5708a = context;
        this.f5709b = bp;
        this.f5710c = view;
    }

    /* renamed from: a */
    private static Intent m7871a(Intent intent, ResolveInfo resolveInfo) {
        Intent intent2 = new Intent(intent);
        intent2.setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        return intent2;
    }

    /* renamed from: a */
    private static Intent m7872a(Uri uri) {
        if (uri == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        return intent;
    }

    /* renamed from: a */
    private final ResolveInfo m7873a(Intent intent) {
        return m7874a(intent, (ArrayList<ResolveInfo>) new ArrayList());
    }

    /* renamed from: a */
    private final ResolveInfo m7874a(Intent intent, ArrayList<ResolveInfo> arrayList) {
        ResolveInfo resolveInfo = null;
        try {
            PackageManager packageManager = this.f5708a.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 65536);
            if (queryIntentActivities != null && resolveActivity != null) {
                int i = 0;
                while (true) {
                    if (i >= queryIntentActivities.size()) {
                        break;
                    }
                    ResolveInfo resolveInfo2 = queryIntentActivities.get(i);
                    if (resolveActivity != null && resolveActivity.activityInfo.name.equals(resolveInfo2.activityInfo.name)) {
                        resolveInfo = resolveActivity;
                        break;
                    }
                    i++;
                }
            }
            arrayList.addAll(queryIntentActivities);
            return resolveInfo;
        } catch (Throwable th) {
            C1697X.m7702i().mo8319a(th, "OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00bd A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.Intent mo6936a(java.util.Map<java.lang.String, java.lang.String> r11) {
        /*
            r10 = this;
            android.content.Context r0 = r10.f5708a
            java.lang.String r1 = "activity"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            java.lang.String r1 = "u"
            java.lang.Object r1 = r11.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            r3 = 0
            if (r2 == 0) goto L_0x001a
            return r3
        L_0x001a:
            android.content.Context r2 = r10.f5708a
            com.google.android.gms.internal.ads.Bp r4 = r10.f5709b
            android.view.View r5 = r10.f5710c
            java.lang.String r1 = com.google.android.gms.ads.internal.gmsg.C1731e.m7867a(r2, r4, r1, r5, r3)
            android.net.Uri r1 = android.net.Uri.parse(r1)
            java.lang.String r2 = "use_first_package"
            java.lang.Object r2 = r11.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = java.lang.Boolean.parseBoolean(r2)
            java.lang.String r4 = "use_running_process"
            java.lang.Object r4 = r11.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            java.lang.String r5 = "use_custom_tabs"
            java.lang.Object r11 = r11.get(r5)
            java.lang.String r11 = (java.lang.String) r11
            boolean r11 = java.lang.Boolean.parseBoolean(r11)
            r5 = 0
            if (r11 != 0) goto L_0x0064
            com.google.android.gms.internal.ads.Du<java.lang.Boolean> r11 = com.google.android.gms.internal.ads.C2558Nu.f7837Wd
            com.google.android.gms.internal.ads.Lu r6 = com.google.android.gms.internal.ads.C3390pt.m13458f()
            java.lang.Object r11 = r6.mo8515a(r11)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x0062
            goto L_0x0064
        L_0x0062:
            r11 = r5
            goto L_0x0065
        L_0x0064:
            r11 = 1
        L_0x0065:
            java.lang.String r6 = r1.getScheme()
            java.lang.String r7 = "http"
            boolean r6 = r7.equalsIgnoreCase(r6)
            java.lang.String r8 = "https"
            if (r6 == 0) goto L_0x0080
            android.net.Uri$Builder r3 = r1.buildUpon()
            android.net.Uri$Builder r3 = r3.scheme(r8)
        L_0x007b:
            android.net.Uri r3 = r3.build()
            goto L_0x0093
        L_0x0080:
            java.lang.String r6 = r1.getScheme()
            boolean r6 = r8.equalsIgnoreCase(r6)
            if (r6 == 0) goto L_0x0093
            android.net.Uri$Builder r3 = r1.buildUpon()
            android.net.Uri$Builder r3 = r3.scheme(r7)
            goto L_0x007b
        L_0x0093:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            android.content.Intent r1 = m7872a((android.net.Uri) r1)
            android.content.Intent r3 = m7872a((android.net.Uri) r3)
            if (r11 == 0) goto L_0x00b2
            com.google.android.gms.ads.internal.C1697X.m7698e()
            android.content.Context r11 = r10.f5708a
            com.google.android.gms.internal.ads.C3114ge.m12425b((android.content.Context) r11, (android.content.Intent) r1)
            com.google.android.gms.ads.internal.C1697X.m7698e()
            android.content.Context r11 = r10.f5708a
            com.google.android.gms.internal.ads.C3114ge.m12425b((android.content.Context) r11, (android.content.Intent) r3)
        L_0x00b2:
            android.content.pm.ResolveInfo r11 = r10.m7874a((android.content.Intent) r1, (java.util.ArrayList<android.content.pm.ResolveInfo>) r6)
            if (r11 == 0) goto L_0x00bd
            android.content.Intent r11 = m7871a((android.content.Intent) r1, (android.content.pm.ResolveInfo) r11)
            return r11
        L_0x00bd:
            if (r3 == 0) goto L_0x00d0
            android.content.pm.ResolveInfo r11 = r10.m7873a((android.content.Intent) r3)
            if (r11 == 0) goto L_0x00d0
            android.content.Intent r11 = m7871a((android.content.Intent) r1, (android.content.pm.ResolveInfo) r11)
            android.content.pm.ResolveInfo r3 = r10.m7873a((android.content.Intent) r11)
            if (r3 == 0) goto L_0x00d0
            return r11
        L_0x00d0:
            int r11 = r6.size()
            if (r11 != 0) goto L_0x00d7
            return r1
        L_0x00d7:
            if (r4 == 0) goto L_0x0111
            if (r0 == 0) goto L_0x0111
            java.util.List r11 = r0.getRunningAppProcesses()
            if (r11 == 0) goto L_0x0111
            int r0 = r6.size()
            r3 = r5
        L_0x00e6:
            if (r3 >= r0) goto L_0x0111
            java.lang.Object r4 = r6.get(r3)
            int r3 = r3 + 1
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            java.util.Iterator r7 = r11.iterator()
        L_0x00f4:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00e6
            java.lang.Object r8 = r7.next()
            android.app.ActivityManager$RunningAppProcessInfo r8 = (android.app.ActivityManager.RunningAppProcessInfo) r8
            java.lang.String r8 = r8.processName
            android.content.pm.ActivityInfo r9 = r4.activityInfo
            java.lang.String r9 = r9.packageName
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x00f4
            android.content.Intent r11 = m7871a((android.content.Intent) r1, (android.content.pm.ResolveInfo) r4)
            return r11
        L_0x0111:
            if (r2 == 0) goto L_0x011e
            java.lang.Object r11 = r6.get(r5)
            android.content.pm.ResolveInfo r11 = (android.content.pm.ResolveInfo) r11
            android.content.Intent r11 = m7871a((android.content.Intent) r1, (android.content.pm.ResolveInfo) r11)
            return r11
        L_0x011e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.gmsg.C1732f.mo6936a(java.util.Map):android.content.Intent");
    }
}
