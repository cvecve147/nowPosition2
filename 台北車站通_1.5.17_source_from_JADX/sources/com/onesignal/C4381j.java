package com.onesignal;

import android.app.NotificationManager;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import com.onesignal.C4306Xa;
import com.onesignal.p085a.C4337c;

/* renamed from: com.onesignal.j */
class C4381j {

    /* renamed from: a */
    private static int f12922a = -1;

    /* renamed from: a */
    static void m17374a(int i, Context context) {
        if (m17376a(context)) {
            try {
                C4337c.m17284a(context, i);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    static void m17375a(SQLiteDatabase sQLiteDatabase, Context context) {
        if (m17378b(context)) {
            if (Build.VERSION.SDK_INT >= 23) {
                m17379c(context);
            } else {
                m17377b(sQLiteDatabase, context);
            }
        }
    }

    /* renamed from: a */
    private static boolean m17376a(Context context) {
        int i = f12922a;
        if (i != -1) {
            return i == 1;
        }
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle != null) {
                f12922a = "DISABLE".equals(bundle.getString("com.onesignal.BadgeCount")) ? 0 : 1;
            } else {
                f12922a = 1;
            }
        } catch (Throwable th) {
            f12922a = 0;
            C4306Xa.m17136a(C4306Xa.C4316j.ERROR, "Error reading meta-data tag 'com.onesignal.BadgeCount'. Disabling badge setting.", th);
        }
        return f12922a == 1;
    }

    /* renamed from: b */
    private static void m17377b(SQLiteDatabase sQLiteDatabase, Context context) {
        Cursor query = sQLiteDatabase.query("notification", (String[]) null, C4353cb.m17327c().toString(), (String[]) null, (String) null, (String) null, (String) null, C4293T.f12722a);
        int count = query.getCount();
        query.close();
        m17374a(count, context);
    }

    /* renamed from: b */
    private static boolean m17378b(Context context) {
        return m17376a(context) && C4252Ia.m16869a(context);
    }

    /* renamed from: c */
    private static void m17379c(Context context) {
        int i = 0;
        for (StatusBarNotification a : ((NotificationManager) context.getSystemService("notification")).getActiveNotifications()) {
            if (!C4293T.m17058a(a)) {
                i++;
            }
        }
        m17374a(i, context);
    }
}
