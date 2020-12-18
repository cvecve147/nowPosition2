package com.onesignal;

import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.onesignal.C4306Xa;
import java.util.ArrayList;
import org.apache.http.HttpStatus;

/* renamed from: com.onesignal.X */
class C4305X {

    /* renamed from: a */
    static final String[] f12730a = {"android_notification_id", "full_data", "created_time"};

    /* renamed from: b */
    public static boolean f12731b;

    /* renamed from: a */
    private static Intent m17088a(Intent intent, Cursor cursor) {
        int i = cursor.getInt(cursor.getColumnIndex("android_notification_id"));
        String string = cursor.getString(cursor.getColumnIndex("full_data"));
        intent.putExtra("json_payload", string).putExtra("android_notif_id", i).putExtra("restoring", true).putExtra("timestamp", Long.valueOf(cursor.getLong(cursor.getColumnIndex("created_time"))));
        return intent;
    }

    /* renamed from: a */
    static void m17089a(Context context) {
        new Thread(new C4302W(context), "OS_RESTORE_NOTIFS").start();
    }

    /* renamed from: a */
    static void m17090a(Context context, Cursor cursor, int i) {
        int i2;
        ComponentName componentName;
        Intent intent;
        if (cursor.moveToFirst()) {
            boolean z = C4284Q.m17023a(context) != null;
            do {
                if (z) {
                    intent = C4284Q.m17023a(context);
                    m17088a(intent, cursor);
                    componentName = intent.getComponent();
                    i2 = 2071862121;
                } else {
                    intent = new Intent();
                    m17088a(intent, cursor);
                    componentName = new ComponentName(context, RestoreJobService.class);
                    i2 = 2071862122;
                }
                JobIntentService.m16911a(context, componentName, i2, intent, false);
                if (i > 0) {
                    C4252Ia.m16865a(i);
                }
            } while (cursor.moveToNext());
        }
    }

    /* renamed from: a */
    private static void m17091a(Context context, C4353cb cbVar, StringBuilder sb) {
        C4306Xa.C4316j jVar = C4306Xa.C4316j.INFO;
        C4306Xa.m17135a(jVar, "Querying DB for notifs to restore: " + sb.toString());
        Cursor cursor = null;
        try {
            SQLiteDatabase a = cbVar.mo12480a();
            cursor = a.query("notification", f12730a, sb.toString(), (String[]) null, (String) null, (String) null, "_id DESC", C4293T.f12722a);
            m17090a(context, cursor, (int) HttpStatus.SC_OK);
            C4381j.m17375a(a, context);
            if (cursor == null || cursor.isClosed()) {
                return;
            }
        } catch (Throwable th) {
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
            throw th;
        }
        cursor.close();
    }

    /* renamed from: a */
    private static void m17092a(Context context, StringBuilder sb) {
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                StatusBarNotification[] activeNotifications = ((NotificationManager) context.getSystemService("notification")).getActiveNotifications();
                if (activeNotifications.length != 0) {
                    ArrayList arrayList = new ArrayList();
                    for (StatusBarNotification id : activeNotifications) {
                        arrayList.add(Integer.valueOf(id.getId()));
                    }
                    sb.append(" AND android_notification_id NOT IN (");
                    sb.append(TextUtils.join(",", arrayList));
                    sb.append(")");
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private static void m17093a(C4353cb cbVar) {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = cbVar.mo12481b();
            sQLiteDatabase.beginTransaction();
            C4277O.m16970a(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            if (sQLiteDatabase != null) {
                sQLiteDatabase.endTransaction();
                return;
            }
            return;
        } catch (Throwable th) {
            C4306Xa.m17136a(C4306Xa.C4316j.ERROR, "Error closing transaction! ", th);
            return;
        }
        throw th;
    }

    /* renamed from: b */
    public static void m17094b(Context context) {
        if (C4252Ia.m16869a(context) && !f12731b) {
            f12731b = true;
            C4306Xa.m17135a(C4306Xa.C4316j.INFO, "Restoring notifications");
            C4353cb a = C4353cb.m17322a(context);
            m17093a(a);
            StringBuilder c = C4353cb.m17327c();
            m17092a(context, c);
            m17091a(context, a, c);
        }
    }

    /* renamed from: c */
    static void m17095c(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            C4306Xa.m17135a(C4306Xa.C4316j.INFO, "scheduleRestoreKickoffJob");
            ((JobScheduler) context.getSystemService("jobscheduler")).schedule(new JobInfo.Builder(2071862120, new ComponentName(context, RestoreKickoffJobService.class)).setOverrideDeadline(15000).setMinimumLatency(15000).build());
            return;
        }
        C4306Xa.m17135a(C4306Xa.C4316j.INFO, "scheduleRestoreKickoffAlarmTask");
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context.getPackageName(), NotificationRestoreService.class.getName()));
        PendingIntent service = PendingIntent.getService(context, 2071862120, intent, 268435456);
        ((AlarmManager) context.getSystemService("alarm")).set(1, System.currentTimeMillis() + 15000, service);
    }
}
