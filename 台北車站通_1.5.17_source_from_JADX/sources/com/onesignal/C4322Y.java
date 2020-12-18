package com.onesignal;

import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.onesignal.C4306Xa;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.Y */
class C4322Y {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: android.database.Cursor} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Integer m17227a(android.database.sqlite.SQLiteDatabase r11, java.lang.String r12) {
        /*
            java.lang.String r0 = "android_notification_id"
            r1 = 0
            java.lang.String r3 = "notification"
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch:{ Throwable -> 0x0054 }
            java.lang.String r5 = "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 1"
            r2 = 1
            java.lang.String[] r6 = new java.lang.String[r2]     // Catch:{ Throwable -> 0x0054 }
            r2 = 0
            r6[r2] = r12     // Catch:{ Throwable -> 0x0054 }
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r11
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Throwable -> 0x0054 }
            boolean r2 = r11.moveToFirst()     // Catch:{ Throwable -> 0x004d, all -> 0x004a }
            if (r2 != 0) goto L_0x002e
            r11.close()     // Catch:{ Throwable -> 0x004d, all -> 0x004a }
            if (r11 == 0) goto L_0x002d
            boolean r12 = r11.isClosed()
            if (r12 != 0) goto L_0x002d
            r11.close()
        L_0x002d:
            return r1
        L_0x002e:
            int r0 = r11.getColumnIndex(r0)     // Catch:{ Throwable -> 0x004d, all -> 0x004a }
            int r0 = r11.getInt(r0)     // Catch:{ Throwable -> 0x004d, all -> 0x004a }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ Throwable -> 0x004d, all -> 0x004a }
            r11.close()     // Catch:{ Throwable -> 0x004d, all -> 0x004a }
            if (r11 == 0) goto L_0x0048
            boolean r12 = r11.isClosed()
            if (r12 != 0) goto L_0x0048
            r11.close()
        L_0x0048:
            r11 = r1
            goto L_0x0077
        L_0x004a:
            r12 = move-exception
            r1 = r11
            goto L_0x0078
        L_0x004d:
            r0 = move-exception
            r10 = r1
            r1 = r11
            r11 = r10
            goto L_0x0056
        L_0x0052:
            r12 = move-exception
            goto L_0x0078
        L_0x0054:
            r0 = move-exception
            r11 = r1
        L_0x0056:
            com.onesignal.Xa$j r2 = com.onesignal.C4306Xa.C4316j.ERROR     // Catch:{ all -> 0x0052 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0052 }
            r3.<init>()     // Catch:{ all -> 0x0052 }
            java.lang.String r4 = "Error getting android notification id for summary notification group: "
            r3.append(r4)     // Catch:{ all -> 0x0052 }
            r3.append(r12)     // Catch:{ all -> 0x0052 }
            java.lang.String r12 = r3.toString()     // Catch:{ all -> 0x0052 }
            com.onesignal.C4306Xa.m17136a((com.onesignal.C4306Xa.C4316j) r2, (java.lang.String) r12, (java.lang.Throwable) r0)     // Catch:{ all -> 0x0052 }
            if (r1 == 0) goto L_0x0077
            boolean r12 = r1.isClosed()
            if (r12 != 0) goto L_0x0077
            r1.close()
        L_0x0077:
            return r11
        L_0x0078:
            if (r1 == 0) goto L_0x0083
            boolean r11 = r1.isClosed()
            if (r11 != 0) goto L_0x0083
            r1.close()
        L_0x0083:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C4322Y.m17227a(android.database.sqlite.SQLiteDatabase, java.lang.String):java.lang.Integer");
    }

    /* renamed from: a */
    static void m17228a(Context context, SQLiteDatabase sQLiteDatabase, int i) {
        Cursor query = sQLiteDatabase.query("notification", new String[]{"group_id"}, "android_notification_id = " + i, (String[]) null, (String) null, (String) null, (String) null);
        if (query.moveToFirst()) {
            String string = query.getString(query.getColumnIndex("group_id"));
            query.close();
            if (string != null) {
                m17229a(context, sQLiteDatabase, string, true);
                return;
            }
            return;
        }
        query.close();
    }

    /* renamed from: a */
    static void m17229a(Context context, SQLiteDatabase sQLiteDatabase, String str, boolean z) {
        try {
            Cursor b = m17231b(context, sQLiteDatabase, str, z);
            if (b != null && !b.isClosed()) {
                b.close();
            }
        } catch (Throwable th) {
            C4306Xa.m17136a(C4306Xa.C4316j.ERROR, "Error running updateSummaryNotificationAfterChildRemoved!", th);
        }
    }

    /* renamed from: a */
    private static void m17230a(Context context, String str) {
        String[] strArr = {str};
        Cursor cursor = null;
        try {
            cursor = C4353cb.m17322a(context).mo12480a().query("notification", C4305X.f12730a, "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", strArr, (String) null, (String) null, (String) null);
            C4305X.m17090a(context, cursor, 0);
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

    /* renamed from: b */
    private static Cursor m17231b(Context context, SQLiteDatabase sQLiteDatabase, String str, boolean z) {
        Cursor query = sQLiteDatabase.query("notification", new String[]{"android_notification_id", "created_time"}, "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", new String[]{str}, (String) null, (String) null, "_id DESC");
        int count = query.getCount();
        if (count == 0) {
            query.close();
            Integer a = m17227a(sQLiteDatabase, str);
            if (a == null) {
                return query;
            }
            ((NotificationManager) context.getSystemService("notification")).cancel(a.intValue());
            ContentValues contentValues = new ContentValues();
            contentValues.put(z ? "dismissed" : "opened", 1);
            sQLiteDatabase.update("notification", contentValues, "android_notification_id = " + a, (String[]) null);
            return query;
        } else if (count == 1) {
            query.close();
            if (m17227a(sQLiteDatabase, str) == null) {
                return query;
            }
            m17230a(context, str);
            return query;
        } else {
            try {
                query.moveToFirst();
                Long valueOf = Long.valueOf(query.getLong(query.getColumnIndex("created_time")));
                query.close();
                if (m17227a(sQLiteDatabase, str) == null) {
                    return query;
                }
                C4290S s = new C4290S(context);
                s.f12710c = true;
                s.f12713f = valueOf;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("grp", str);
                s.f12709b = jSONObject;
                C4430u.m17621b(s);
                return query;
            } catch (JSONException unused) {
            }
        }
    }
}
