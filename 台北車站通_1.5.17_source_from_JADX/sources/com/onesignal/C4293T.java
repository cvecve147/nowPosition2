package com.onesignal;

import android.app.NotificationManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.onesignal.T */
class C4293T {

    /* renamed from: a */
    static final String f12722a = Integer.toString(49);

    /* renamed from: a */
    private static int m17056a() {
        return 49;
    }

    /* renamed from: a */
    static void m17057a(Context context, int i) {
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                m17061c(context, i);
            } else {
                m17060b(context, i);
            }
        } catch (Throwable unused) {
            m17060b(context, i);
        }
    }

    /* renamed from: a */
    static boolean m17058a(StatusBarNotification statusBarNotification) {
        return (statusBarNotification.getNotification().flags & 512) != 0;
    }

    /* renamed from: b */
    private static String m17059b() {
        return f12722a;
    }

    /* renamed from: b */
    static void m17060b(Context context, int i) {
        Cursor cursor = null;
        try {
            cursor = C4353cb.m17322a(context).mo12480a().query("notification", new String[]{"android_notification_id"}, C4353cb.m17327c().toString(), (String[]) null, (String) null, (String) null, "_id", m17059b() + i);
            int count = (cursor.getCount() - m17056a()) + i;
            if (count >= 1) {
                do {
                    if (!cursor.moveToNext()) {
                        break;
                    }
                    C4306Xa.m17161c(cursor.getInt(cursor.getColumnIndex("android_notification_id")));
                    count--;
                } while (count > 0);
                if (cursor == null || cursor.isClosed()) {
                    return;
                }
                cursor.close();
            } else if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        } catch (Throwable th) {
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: c */
    static void m17061c(Context context, int i) {
        StatusBarNotification[] activeNotifications = ((NotificationManager) context.getSystemService("notification")).getActiveNotifications();
        int length = (activeNotifications.length - m17056a()) + i;
        if (length >= 1) {
            TreeMap treeMap = new TreeMap();
            for (StatusBarNotification statusBarNotification : activeNotifications) {
                if (!m17058a(statusBarNotification)) {
                    treeMap.put(Long.valueOf(statusBarNotification.getNotification().when), Integer.valueOf(statusBarNotification.getId()));
                }
            }
            for (Map.Entry value : treeMap.entrySet()) {
                C4306Xa.m17161c(((Integer) value.getValue()).intValue());
                length--;
                if (length <= 0) {
                    return;
                }
            }
        }
    }
}
