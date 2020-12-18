package com.onesignal;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.p007v4.app.C0312ba;
import com.onesignal.C4306Xa;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.onesignal.V */
class C4299V {
    /* renamed from: a */
    static void m17076a(Context context, Intent intent) {
        if (m17080a(intent)) {
            C4306Xa.m17176f(context);
            m17083c(context, intent);
            m17082b(context, intent);
        }
    }

    /* renamed from: a */
    private static void m17077a(Context context, Intent intent, SQLiteDatabase sQLiteDatabase) {
        String[] strArr;
        String str;
        String stringExtra = intent.getStringExtra("summary");
        if (stringExtra != null) {
            strArr = new String[]{stringExtra};
            str = "group_id = ?";
        } else {
            str = "android_notification_id = " + intent.getIntExtra("notificationId", 0);
            strArr = null;
        }
        sQLiteDatabase.update("notification", m17081b(intent), str, strArr);
        C4381j.m17375a(sQLiteDatabase, context);
    }

    /* renamed from: a */
    private static void m17078a(JSONArray jSONArray, String str, SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Cursor query = sQLiteDatabase2.query("notification", new String[]{"full_data"}, "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", new String[]{str}, (String) null, (String) null, (String) null);
        if (query.getCount() > 1) {
            query.moveToFirst();
            do {
                try {
                    jSONArray.put(new JSONObject(query.getString(query.getColumnIndex("full_data"))));
                } catch (Throwable unused) {
                    C4306Xa.C4316j jVar = C4306Xa.C4316j.ERROR;
                    C4306Xa.m17135a(jVar, "Could not parse JSON of sub notification in group: " + str);
                }
            } while (query.moveToNext());
        }
        query.close();
    }

    /* renamed from: a */
    private static boolean m17079a(Context context, JSONObject jSONObject) {
        String c = C4277O.m16980c(jSONObject);
        if (c == null) {
            return false;
        }
        C4306Xa.m17183h(context);
        C4406pa.m17450b().mo12524a(c);
        return true;
    }

    /* renamed from: a */
    private static boolean m17080a(Intent intent) {
        return intent.hasExtra("onesignal_data") || intent.hasExtra("summary") || intent.hasExtra("notificationId");
    }

    /* renamed from: b */
    private static ContentValues m17081b(Intent intent) {
        ContentValues contentValues = new ContentValues();
        if (intent.getBooleanExtra("dismissed", false)) {
            contentValues.put("dismissed", 1);
        } else {
            contentValues.put("opened", 1);
        }
        return contentValues;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: org.json.JSONArray} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: org.json.JSONArray} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: org.json.JSONArray} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006e A[SYNTHETIC, Splitter:B:23:0x006e] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m17082b(android.content.Context r9, android.content.Intent r10) {
        /*
            java.lang.String r0 = "notificationId"
            java.lang.String r1 = "Error closing transaction! "
            java.lang.String r2 = "onesignal_data"
            java.lang.String r3 = "summary"
            java.lang.String r3 = r10.getStringExtra(r3)
            r4 = 0
            java.lang.String r5 = "dismissed"
            boolean r5 = r10.getBooleanExtra(r5, r4)
            r6 = 0
            if (r5 != 0) goto L_0x0046
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0042 }
            java.lang.String r8 = r10.getStringExtra(r2)     // Catch:{ Throwable -> 0x0042 }
            r7.<init>(r8)     // Catch:{ Throwable -> 0x0042 }
            boolean r8 = m17079a((android.content.Context) r9, (org.json.JSONObject) r7)     // Catch:{ Throwable -> 0x0042 }
            if (r8 == 0) goto L_0x0026
            return
        L_0x0026:
            int r8 = r10.getIntExtra(r0, r4)     // Catch:{ Throwable -> 0x0042 }
            r7.put(r0, r8)     // Catch:{ Throwable -> 0x0042 }
            java.lang.String r0 = r7.toString()     // Catch:{ Throwable -> 0x0042 }
            r10.putExtra(r2, r0)     // Catch:{ Throwable -> 0x0042 }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0042 }
            java.lang.String r2 = r10.getStringExtra(r2)     // Catch:{ Throwable -> 0x0042 }
            r0.<init>(r2)     // Catch:{ Throwable -> 0x0042 }
            org.json.JSONArray r0 = com.onesignal.C4277O.m16984d((org.json.JSONObject) r0)     // Catch:{ Throwable -> 0x0042 }
            goto L_0x0047
        L_0x0042:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0046:
            r0 = r6
        L_0x0047:
            com.onesignal.cb r2 = com.onesignal.C4353cb.m17322a((android.content.Context) r9)
            android.database.sqlite.SQLiteDatabase r6 = r2.mo12481b()     // Catch:{ Exception -> 0x0074 }
            r6.beginTransaction()     // Catch:{ Exception -> 0x0074 }
            if (r5 != 0) goto L_0x0059
            if (r3 == 0) goto L_0x0059
            m17078a((org.json.JSONArray) r0, (java.lang.String) r3, (android.database.sqlite.SQLiteDatabase) r6)     // Catch:{ Exception -> 0x0074 }
        L_0x0059:
            m17077a((android.content.Context) r9, (android.content.Intent) r10, (android.database.sqlite.SQLiteDatabase) r6)     // Catch:{ Exception -> 0x0074 }
            if (r3 != 0) goto L_0x0069
            java.lang.String r2 = "grp"
            java.lang.String r2 = r10.getStringExtra(r2)     // Catch:{ Exception -> 0x0074 }
            if (r2 == 0) goto L_0x0069
            com.onesignal.C4322Y.m17229a(r9, r6, r2, r5)     // Catch:{ Exception -> 0x0074 }
        L_0x0069:
            r6.setTransactionSuccessful()     // Catch:{ Exception -> 0x0074 }
            if (r6 == 0) goto L_0x0088
            r6.endTransaction()     // Catch:{ Throwable -> 0x0082 }
            goto L_0x0088
        L_0x0072:
            r9 = move-exception
            goto L_0x0094
        L_0x0074:
            r2 = move-exception
            com.onesignal.Xa$j r3 = com.onesignal.C4306Xa.C4316j.ERROR     // Catch:{ all -> 0x0072 }
            java.lang.String r7 = "Error processing notification open or dismiss record! "
            com.onesignal.C4306Xa.m17136a((com.onesignal.C4306Xa.C4316j) r3, (java.lang.String) r7, (java.lang.Throwable) r2)     // Catch:{ all -> 0x0072 }
            if (r6 == 0) goto L_0x0088
            r6.endTransaction()     // Catch:{ Throwable -> 0x0082 }
            goto L_0x0088
        L_0x0082:
            r2 = move-exception
            com.onesignal.Xa$j r3 = com.onesignal.C4306Xa.C4316j.ERROR
            com.onesignal.C4306Xa.m17136a((com.onesignal.C4306Xa.C4316j) r3, (java.lang.String) r1, (java.lang.Throwable) r2)
        L_0x0088:
            if (r5 != 0) goto L_0x0093
            java.lang.String r1 = "from_alert"
            boolean r10 = r10.getBooleanExtra(r1, r4)
            com.onesignal.C4306Xa.m17132a((android.content.Context) r9, (org.json.JSONArray) r0, (boolean) r10)
        L_0x0093:
            return
        L_0x0094:
            if (r6 == 0) goto L_0x00a0
            r6.endTransaction()     // Catch:{ Throwable -> 0x009a }
            goto L_0x00a0
        L_0x009a:
            r10 = move-exception
            com.onesignal.Xa$j r0 = com.onesignal.C4306Xa.C4316j.ERROR
            com.onesignal.C4306Xa.m17136a((com.onesignal.C4306Xa.C4316j) r0, (java.lang.String) r1, (java.lang.Throwable) r10)
        L_0x00a0:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C4299V.m17082b(android.content.Context, android.content.Intent):void");
    }

    /* renamed from: c */
    private static void m17083c(Context context, Intent intent) {
        if (intent.getBooleanExtra("action_button", false)) {
            C0312ba.m1395a(context).mo1238a(intent.getIntExtra("notificationId", 0));
            context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        }
    }
}
