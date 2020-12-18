package p013b.p018b.p028h.p029a;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.TypedValue;
import java.io.File;

/* renamed from: b.b.h.a.a */
public class C1006a {

    /* renamed from: a */
    private static final Object f3900a = new Object();

    /* renamed from: b */
    private static TypedValue f3901b;

    /* renamed from: a */
    public static int m5386a(Context context, int i) {
        return Build.VERSION.SDK_INT >= 23 ? context.getColor(i) : context.getResources().getColor(i);
    }

    /* renamed from: a */
    public static int m5387a(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    /* renamed from: a */
    public static File m5388a(Context context) {
        return Build.VERSION.SDK_INT >= 21 ? context.getNoBackupFilesDir() : m5389a(new File(context.getApplicationInfo().dataDir, "no_backup"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        return r4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized java.io.File m5389a(java.io.File r4) {
        /*
            java.lang.Class<b.b.h.a.a> r0 = p013b.p018b.p028h.p029a.C1006a.class
            monitor-enter(r0)
            boolean r1 = r4.exists()     // Catch:{ all -> 0x0036 }
            if (r1 != 0) goto L_0x0034
            boolean r1 = r4.mkdirs()     // Catch:{ all -> 0x0036 }
            if (r1 != 0) goto L_0x0034
            boolean r1 = r4.exists()     // Catch:{ all -> 0x0036 }
            if (r1 == 0) goto L_0x0017
            monitor-exit(r0)
            return r4
        L_0x0017:
            java.lang.String r1 = "ContextCompat"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0036 }
            r2.<init>()     // Catch:{ all -> 0x0036 }
            java.lang.String r3 = "Unable to create files subdir "
            r2.append(r3)     // Catch:{ all -> 0x0036 }
            java.lang.String r4 = r4.getPath()     // Catch:{ all -> 0x0036 }
            r2.append(r4)     // Catch:{ all -> 0x0036 }
            java.lang.String r4 = r2.toString()     // Catch:{ all -> 0x0036 }
            android.util.Log.w(r1, r4)     // Catch:{ all -> 0x0036 }
            r4 = 0
            monitor-exit(r0)
            return r4
        L_0x0034:
            monitor-exit(r0)
            return r4
        L_0x0036:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p018b.p028h.p029a.C1006a.m5389a(java.io.File):java.io.File");
    }

    /* renamed from: a */
    public static void m5390a(Context context, Intent intent, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            context.startActivity(intent, bundle);
        } else {
            context.startActivity(intent);
        }
    }

    /* renamed from: a */
    public static boolean m5391a(Context context, Intent[] intentArr, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            context.startActivities(intentArr, bundle);
            return true;
        }
        context.startActivities(intentArr);
        return true;
    }

    /* renamed from: b */
    public static ColorStateList m5392b(Context context, int i) {
        return Build.VERSION.SDK_INT >= 23 ? context.getColorStateList(i) : context.getResources().getColorStateList(i);
    }

    /* renamed from: b */
    public static boolean m5393b(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return context.isDeviceProtectedStorage();
        }
        return false;
    }

    /* renamed from: c */
    public static Drawable m5394c(Context context, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            return context.getDrawable(i);
        }
        if (i2 < 16) {
            synchronized (f3900a) {
                if (f3901b == null) {
                    f3901b = new TypedValue();
                }
                context.getResources().getValue(i, f3901b, true);
                i = f3901b.resourceId;
            }
        }
        return context.getResources().getDrawable(i);
    }
}
