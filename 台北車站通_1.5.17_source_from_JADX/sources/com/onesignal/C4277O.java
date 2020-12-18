package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import com.onesignal.C4284Q;
import com.onesignal.C4306Xa;
import com.onesignal.C4435va;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.O */
class C4277O {

    /* renamed from: com.onesignal.O$a */
    static class C4278a {

        /* renamed from: a */
        boolean f12680a;

        /* renamed from: b */
        boolean f12681b;

        /* renamed from: c */
        boolean f12682c;

        /* renamed from: d */
        boolean f12683d;

        C4278a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo12364a() {
            return !this.f12680a || this.f12681b || this.f12682c || this.f12683d;
        }
    }

    /* renamed from: a */
    static int m16964a(C4290S s) {
        s.f12712e = C4306Xa.m17200p() && C4306Xa.m17211y();
        m16981c(s);
        if (m16985d(s)) {
            C4430u.m17607a(s);
        }
        if (!s.f12710c && !s.f12711d) {
            m16971a(s, false);
            try {
                JSONObject jSONObject = new JSONObject(s.f12709b.toString());
                jSONObject.put("notificationId", s.mo12403a());
                C4306Xa.m17142a(m16984d(jSONObject), true, s.f12712e);
            } catch (Throwable unused) {
            }
        }
        return s.mo12403a().intValue();
    }

    /* renamed from: a */
    static C4278a m16965a(Context context, Bundle bundle) {
        C4278a aVar = new C4278a();
        if (C4306Xa.m17126a(bundle) == null) {
            return aVar;
        }
        aVar.f12680a = true;
        m16986e(bundle);
        JSONObject b = m16977b(bundle);
        String c = m16980c(b);
        if (c != null) {
            if (C4306Xa.m17211y()) {
                aVar.f12683d = true;
                C4406pa.m17450b().mo12524a(c);
            }
            return aVar;
        } else if (m16974a(context, bundle, aVar)) {
            return aVar;
        } else {
            aVar.f12682c = C4306Xa.m17144a(context, b);
            if (!aVar.f12682c && !m16976a(bundle.getString("alert"))) {
                m16968a(context, bundle, true, -1);
                new Thread(new C4274N(bundle), "OS_PROC_BUNDLE").start();
            }
            return aVar;
        }
    }

    /* renamed from: a */
    static C4435va m16966a(JSONObject jSONObject) {
        C4435va vaVar = new C4435va();
        try {
            JSONObject b = m16978b(jSONObject);
            vaVar.f13066a = b.optString("i");
            vaVar.f13068c = b.optString("ti");
            vaVar.f13067b = b.optString("tn");
            vaVar.f13087v = jSONObject.toString();
            vaVar.f13071f = b.optJSONObject("a");
            vaVar.f13076k = b.optString("u", (String) null);
            vaVar.f13070e = jSONObject.optString("alert", (String) null);
            vaVar.f13069d = jSONObject.optString("title", (String) null);
            vaVar.f13072g = jSONObject.optString("sicon", (String) null);
            vaVar.f13074i = jSONObject.optString("bicon", (String) null);
            vaVar.f13073h = jSONObject.optString("licon", (String) null);
            vaVar.f13077l = jSONObject.optString("sound", (String) null);
            vaVar.f13080o = jSONObject.optString("grp", (String) null);
            vaVar.f13081p = jSONObject.optString("grp_msg", (String) null);
            vaVar.f13075j = jSONObject.optString("bgac", (String) null);
            vaVar.f13078m = jSONObject.optString("ledc", (String) null);
            String optString = jSONObject.optString("vis", (String) null);
            if (optString != null) {
                vaVar.f13079n = Integer.parseInt(optString);
            }
            vaVar.f13083r = jSONObject.optString("from", (String) null);
            vaVar.f13086u = jSONObject.optInt("pri", 0);
            String optString2 = jSONObject.optString("collapse_key", (String) null);
            if (!"do_not_collapse".equals(optString2)) {
                vaVar.f13085t = optString2;
            }
            m16972a(vaVar);
        } catch (Throwable th) {
            C4306Xa.m17136a(C4306Xa.C4316j.ERROR, "Error assigning OSNotificationPayload values!", th);
        }
        try {
            m16973a(vaVar, jSONObject);
        } catch (Throwable th2) {
            C4306Xa.m17136a(C4306Xa.C4316j.ERROR, "Error assigning OSNotificationPayload.backgroundImageLayout values!", th2);
        }
        return vaVar;
    }

    /* renamed from: a */
    private static void m16968a(Context context, Bundle bundle, boolean z, int i) {
        C4290S s = new C4290S(context);
        s.f12709b = m16977b(bundle);
        s.f12720m = new C4284Q.C4285a();
        s.f12720m.f12706b = Integer.valueOf(i);
        m16971a(s, z);
    }

    /* renamed from: a */
    static void m16969a(Context context, C4388k kVar, C4284Q.C4285a aVar) {
        C4306Xa.m17176f(context);
        try {
            String string = kVar.getString("json_payload");
            if (string == null) {
                C4306Xa.C4316j jVar = C4306Xa.C4316j.ERROR;
                C4306Xa.m17135a(jVar, "json_payload key is nonexistent from mBundle passed to ProcessFromGCMIntentService: " + kVar);
                return;
            }
            C4290S s = new C4290S(context);
            boolean z = false;
            s.f12710c = kVar.getBoolean("restoring", false);
            s.f12713f = kVar.getLong("timestamp");
            s.f12709b = new JSONObject(string);
            if (m16980c(s.f12709b) != null) {
                z = true;
            }
            s.f12711d = z;
            if (s.f12710c || s.f12711d || !C4306Xa.m17144a(context, s.f12709b)) {
                if (kVar.mo12511a("android_notif_id")) {
                    if (aVar == null) {
                        aVar = new C4284Q.C4285a();
                    }
                    aVar.f12706b = kVar.getInt("android_notif_id");
                }
                s.f12720m = aVar;
                m16964a(s);
                if (s.f12710c) {
                    C4252Ia.m16865a(100);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    static void m16970a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete("notification", "created_time < " + ((System.currentTimeMillis() / 1000) - 604800), (String[]) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x0122 A[SYNTHETIC, Splitter:B:53:0x0122] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x012c A[SYNTHETIC, Splitter:B:59:0x012c] */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m16971a(com.onesignal.C4290S r14, boolean r15) {
        /*
            java.lang.String r0 = "grp"
            java.lang.String r1 = "collapse_key"
            java.lang.String r2 = "Error closing transaction! "
            android.content.Context r3 = r14.f12708a
            org.json.JSONObject r4 = r14.f12709b
            org.json.JSONObject r5 = m16978b((org.json.JSONObject) r4)     // Catch:{ JSONException -> 0x0137 }
            android.content.Context r6 = r14.f12708a     // Catch:{ JSONException -> 0x0137 }
            com.onesignal.cb r6 = com.onesignal.C4353cb.m17322a((android.content.Context) r6)     // Catch:{ JSONException -> 0x0137 }
            r7 = 0
            android.database.sqlite.SQLiteDatabase r6 = r6.mo12481b()     // Catch:{ Exception -> 0x0118 }
            r6.beginTransaction()     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
            m16970a((android.database.sqlite.SQLiteDatabase) r6)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
            int r8 = r14.mo12405b()     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
            r9 = -1
            java.lang.String r10 = "notification"
            r11 = 1
            if (r8 == r9) goto L_0x0052
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
            r8.<init>()     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
            java.lang.String r9 = "android_notification_id = "
            r8.append(r9)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
            int r9 = r14.mo12405b()     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
            r8.append(r9)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
            r9.<init>()     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
            java.lang.String r12 = "dismissed"
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
            r9.put(r12, r13)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
            r6.update(r10, r9, r8, r7)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
            com.onesignal.C4381j.m17375a((android.database.sqlite.SQLiteDatabase) r6, (android.content.Context) r3)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
        L_0x0052:
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
            r8.<init>()     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
            java.lang.String r9 = "notification_id"
            java.lang.String r12 = "i"
            java.lang.String r5 = r5.optString(r12)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
            r8.put(r9, r5)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
            boolean r5 = r4.has(r0)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
            if (r5 == 0) goto L_0x0071
            java.lang.String r5 = "group_id"
            java.lang.String r0 = r4.optString(r0)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
            r8.put(r5, r0)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
        L_0x0071:
            boolean r0 = r4.has(r1)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
            if (r0 == 0) goto L_0x008c
            java.lang.String r0 = "do_not_collapse"
            java.lang.String r5 = r4.optString(r1)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
            boolean r0 = r0.equals(r5)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
            if (r0 != 0) goto L_0x008c
            java.lang.String r0 = "collapse_id"
            java.lang.String r1 = r4.optString(r1)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
            r8.put(r0, r1)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
        L_0x008c:
            java.lang.String r0 = "opened"
            if (r15 == 0) goto L_0x0091
            goto L_0x0092
        L_0x0091:
            r11 = 0
        L_0x0092:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
            r8.put(r0, r1)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
            if (r15 != 0) goto L_0x00a8
            java.lang.String r0 = "android_notification_id"
            int r1 = r14.mo12405b()     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
            r8.put(r0, r1)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
        L_0x00a8:
            java.lang.CharSequence r0 = r14.mo12407d()     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
            if (r0 == 0) goto L_0x00bb
            java.lang.String r0 = "title"
            java.lang.CharSequence r1 = r14.mo12407d()     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
            r8.put(r0, r1)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
        L_0x00bb:
            java.lang.CharSequence r0 = r14.mo12406c()     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
            if (r0 == 0) goto L_0x00ce
            java.lang.String r0 = "message"
            java.lang.CharSequence r14 = r14.mo12406c()     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
            java.lang.String r14 = r14.toString()     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
            r8.put(r0, r14)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
        L_0x00ce:
            java.lang.String r14 = "google.sent_time"
            long r0 = android.os.SystemClock.currentThreadTimeMillis()     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
            long r0 = r4.optLong(r14, r0)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
            r11 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r11
            java.lang.String r14 = "google.ttl"
            r5 = 259200(0x3f480, float:3.63217E-40)
            int r14 = r4.optInt(r14, r5)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
            long r11 = (long) r14     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
            long r0 = r0 + r11
            java.lang.String r14 = "expire_time"
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
            r8.put(r14, r0)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
            java.lang.String r14 = "full_data"
            java.lang.String r0 = r4.toString()     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
            r8.put(r14, r0)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
            r6.insertOrThrow(r10, r7, r8)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
            if (r15 != 0) goto L_0x0100
            com.onesignal.C4381j.m17375a((android.database.sqlite.SQLiteDatabase) r6, (android.content.Context) r3)     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
        L_0x0100:
            r6.setTransactionSuccessful()     // Catch:{ Exception -> 0x0112, all -> 0x0110 }
            if (r6 == 0) goto L_0x013b
            r6.endTransaction()     // Catch:{ Throwable -> 0x0109 }
            goto L_0x013b
        L_0x0109:
            r14 = move-exception
            com.onesignal.Xa$j r15 = com.onesignal.C4306Xa.C4316j.ERROR     // Catch:{ JSONException -> 0x0137 }
        L_0x010c:
            com.onesignal.C4306Xa.m17136a((com.onesignal.C4306Xa.C4316j) r15, (java.lang.String) r2, (java.lang.Throwable) r14)     // Catch:{ JSONException -> 0x0137 }
            goto L_0x013b
        L_0x0110:
            r14 = move-exception
            goto L_0x012a
        L_0x0112:
            r14 = move-exception
            r7 = r6
            goto L_0x0119
        L_0x0115:
            r14 = move-exception
            r6 = r7
            goto L_0x012a
        L_0x0118:
            r14 = move-exception
        L_0x0119:
            com.onesignal.Xa$j r15 = com.onesignal.C4306Xa.C4316j.ERROR     // Catch:{ all -> 0x0115 }
            java.lang.String r0 = "Error saving notification record! "
            com.onesignal.C4306Xa.m17136a((com.onesignal.C4306Xa.C4316j) r15, (java.lang.String) r0, (java.lang.Throwable) r14)     // Catch:{ all -> 0x0115 }
            if (r7 == 0) goto L_0x013b
            r7.endTransaction()     // Catch:{ Throwable -> 0x0126 }
            goto L_0x013b
        L_0x0126:
            r14 = move-exception
            com.onesignal.Xa$j r15 = com.onesignal.C4306Xa.C4316j.ERROR     // Catch:{ JSONException -> 0x0137 }
            goto L_0x010c
        L_0x012a:
            if (r6 == 0) goto L_0x0136
            r6.endTransaction()     // Catch:{ Throwable -> 0x0130 }
            goto L_0x0136
        L_0x0130:
            r15 = move-exception
            com.onesignal.Xa$j r0 = com.onesignal.C4306Xa.C4316j.ERROR     // Catch:{ JSONException -> 0x0137 }
            com.onesignal.C4306Xa.m17136a((com.onesignal.C4306Xa.C4316j) r0, (java.lang.String) r2, (java.lang.Throwable) r15)     // Catch:{ JSONException -> 0x0137 }
        L_0x0136:
            throw r14     // Catch:{ JSONException -> 0x0137 }
        L_0x0137:
            r14 = move-exception
            r14.printStackTrace()
        L_0x013b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C4277O.m16971a(com.onesignal.S, boolean):void");
    }

    /* renamed from: a */
    private static void m16972a(C4435va vaVar) {
        JSONObject jSONObject = vaVar.f13071f;
        if (jSONObject != null && jSONObject.has("actionButtons")) {
            JSONArray jSONArray = vaVar.f13071f.getJSONArray("actionButtons");
            vaVar.f13082q = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                C4435va.C4436a aVar = new C4435va.C4436a();
                aVar.f13088a = jSONObject2.optString("id", (String) null);
                aVar.f13089b = jSONObject2.optString("text", (String) null);
                aVar.f13090c = jSONObject2.optString("icon", (String) null);
                vaVar.f13082q.add(aVar);
            }
            vaVar.f13071f.remove("actionSelected");
            vaVar.f13071f.remove("actionButtons");
        }
    }

    /* renamed from: a */
    private static void m16973a(C4435va vaVar, JSONObject jSONObject) {
        String optString = jSONObject.optString("bg_img", (String) null);
        if (optString != null) {
            JSONObject jSONObject2 = new JSONObject(optString);
            vaVar.f13084s = new C4435va.C4437b();
            vaVar.f13084s.f13091a = jSONObject2.optString("img");
            vaVar.f13084s.f13092b = jSONObject2.optString("tc");
            vaVar.f13084s.f13093c = jSONObject2.optString("bc");
        }
    }

    /* renamed from: a */
    private static boolean m16974a(Context context, Bundle bundle, C4278a aVar) {
        Intent a = C4284Q.m17023a(context);
        boolean z = false;
        if (a == null) {
            return false;
        }
        a.putExtra("json_payload", m16977b(bundle).toString());
        a.putExtra("timestamp", System.currentTimeMillis() / 1000);
        if (Integer.parseInt(bundle.getString("pri", "0")) > 9) {
            z = true;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            JobIntentService.m16911a(context, a.getComponent(), 2071862121, a, z);
        } else {
            context.startService(a);
        }
        aVar.f12681b = true;
        return true;
    }

    /* renamed from: a */
    private static boolean m16975a(Bundle bundle, String str) {
        String trim = bundle.getString(str, "").trim();
        return trim.startsWith("http://") || trim.startsWith("https://");
    }

    /* renamed from: a */
    static boolean m16976a(String str) {
        return (str != null && !"".equals(str)) && (C4306Xa.m17201q() || C4306Xa.m17200p() || !C4306Xa.m17211y());
    }

    /* renamed from: b */
    static JSONObject m16977b(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            try {
                jSONObject.put(str, bundle.get(str));
            } catch (JSONException e) {
                C4306Xa.C4316j jVar = C4306Xa.C4316j.ERROR;
                C4306Xa.m17136a(jVar, "bundleAsJSONObject error for key: " + str, (Throwable) e);
            }
        }
        return jSONObject;
    }

    /* renamed from: b */
    static JSONObject m16978b(JSONObject jSONObject) {
        return new JSONObject(jSONObject.optString("custom"));
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0061 A[SYNTHETIC, Splitter:B:20:0x0061] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006e A[SYNTHETIC, Splitter:B:25:0x006e] */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m16979b(com.onesignal.C4290S r7) {
        /*
            java.lang.String r0 = "Error closing transaction! "
            int r1 = r7.mo12405b()
            r2 = -1
            if (r1 != r2) goto L_0x000a
            return
        L_0x000a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "android_notification_id = "
            r1.append(r2)
            int r2 = r7.mo12405b()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.content.Context r2 = r7.f12708a
            com.onesignal.cb r2 = com.onesignal.C4353cb.m17322a((android.content.Context) r2)
            r3 = 0
            android.database.sqlite.SQLiteDatabase r2 = r2.mo12481b()     // Catch:{ Exception -> 0x0057 }
            r2.beginTransaction()     // Catch:{ Exception -> 0x0051, all -> 0x004f }
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ Exception -> 0x0051, all -> 0x004f }
            r4.<init>()     // Catch:{ Exception -> 0x0051, all -> 0x004f }
            java.lang.String r5 = "dismissed"
            r6 = 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0051, all -> 0x004f }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x0051, all -> 0x004f }
            java.lang.String r5 = "notification"
            r2.update(r5, r4, r1, r3)     // Catch:{ Exception -> 0x0051, all -> 0x004f }
            android.content.Context r7 = r7.f12708a     // Catch:{ Exception -> 0x0051, all -> 0x004f }
            com.onesignal.C4381j.m17375a((android.database.sqlite.SQLiteDatabase) r2, (android.content.Context) r7)     // Catch:{ Exception -> 0x0051, all -> 0x004f }
            r2.setTransactionSuccessful()     // Catch:{ Exception -> 0x0051, all -> 0x004f }
            if (r2 == 0) goto L_0x006b
            r2.endTransaction()     // Catch:{ Throwable -> 0x0065 }
            goto L_0x006b
        L_0x004f:
            r7 = move-exception
            goto L_0x006c
        L_0x0051:
            r7 = move-exception
            r3 = r2
            goto L_0x0058
        L_0x0054:
            r7 = move-exception
            r2 = r3
            goto L_0x006c
        L_0x0057:
            r7 = move-exception
        L_0x0058:
            com.onesignal.Xa$j r1 = com.onesignal.C4306Xa.C4316j.ERROR     // Catch:{ all -> 0x0054 }
            java.lang.String r2 = "Error saving notification record! "
            com.onesignal.C4306Xa.m17136a((com.onesignal.C4306Xa.C4316j) r1, (java.lang.String) r2, (java.lang.Throwable) r7)     // Catch:{ all -> 0x0054 }
            if (r3 == 0) goto L_0x006b
            r3.endTransaction()     // Catch:{ Throwable -> 0x0065 }
            goto L_0x006b
        L_0x0065:
            r7 = move-exception
            com.onesignal.Xa$j r1 = com.onesignal.C4306Xa.C4316j.ERROR
            com.onesignal.C4306Xa.m17136a((com.onesignal.C4306Xa.C4316j) r1, (java.lang.String) r0, (java.lang.Throwable) r7)
        L_0x006b:
            return
        L_0x006c:
            if (r2 == 0) goto L_0x0078
            r2.endTransaction()     // Catch:{ Throwable -> 0x0072 }
            goto L_0x0078
        L_0x0072:
            r1 = move-exception
            com.onesignal.Xa$j r2 = com.onesignal.C4306Xa.C4316j.ERROR
            com.onesignal.C4306Xa.m17136a((com.onesignal.C4306Xa.C4316j) r2, (java.lang.String) r0, (java.lang.Throwable) r1)
        L_0x0078:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C4277O.m16979b(com.onesignal.S):void");
    }

    /* renamed from: c */
    static String m16980c(JSONObject jSONObject) {
        try {
            JSONObject b = m16978b(jSONObject);
            if (!b.has("a")) {
                return null;
            }
            JSONObject optJSONObject = b.optJSONObject("a");
            if (optJSONObject.has("os_in_app_message_preview_id")) {
                return optJSONObject.optString("os_in_app_message_preview_id");
            }
            return null;
        } catch (JSONException unused) {
        }
    }

    /* renamed from: c */
    private static void m16981c(C4290S s) {
        if (!s.f12710c && s.f12709b.has("collapse_key") && !"do_not_collapse".equals(s.f12709b.optString("collapse_key"))) {
            Cursor cursor = null;
            try {
                cursor = C4353cb.m17322a(s.f12708a).mo12480a().query("notification", new String[]{"android_notification_id"}, "collapse_id = ? AND dismissed = 0 AND opened = 0 ", new String[]{s.f12709b.optString("collapse_key")}, (String) null, (String) null, (String) null);
                if (cursor.moveToFirst()) {
                    s.mo12404a(Integer.valueOf(cursor.getInt(cursor.getColumnIndex("android_notification_id"))));
                }
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
    }

    /* renamed from: c */
    static boolean m16982c(Bundle bundle) {
        return m16975a(bundle, "licon") || m16975a(bundle, "bicon") || bundle.getString("bg_img", (String) null) != null;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static JSONArray m16983d(Bundle bundle) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(m16977b(bundle));
        return jSONArray;
    }

    /* renamed from: d */
    static JSONArray m16984d(JSONObject jSONObject) {
        return new JSONArray().put(jSONObject);
    }

    /* renamed from: d */
    private static boolean m16985d(C4290S s) {
        if (!s.f12711d || Build.VERSION.SDK_INT > 18) {
            return s.mo12408e() || m16976a(s.f12709b.optString("alert"));
        }
        return false;
    }

    /* renamed from: e */
    private static void m16986e(Bundle bundle) {
        String str;
        if (bundle.containsKey("o")) {
            try {
                JSONObject jSONObject = new JSONObject(bundle.getString("custom"));
                JSONObject jSONObject2 = jSONObject.has("a") ? jSONObject.getJSONObject("a") : new JSONObject();
                JSONArray jSONArray = new JSONArray(bundle.getString("o"));
                bundle.remove("o");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    String string = jSONObject3.getString("n");
                    jSONObject3.remove("n");
                    if (jSONObject3.has("i")) {
                        str = jSONObject3.getString("i");
                        jSONObject3.remove("i");
                    } else {
                        str = string;
                    }
                    jSONObject3.put("id", str);
                    jSONObject3.put("text", string);
                    if (jSONObject3.has("p")) {
                        jSONObject3.put("icon", jSONObject3.getString("p"));
                        jSONObject3.remove("p");
                    }
                }
                jSONObject2.put("actionButtons", jSONArray);
                jSONObject2.put("actionSelected", "__DEFAULT__");
                if (!jSONObject.has("a")) {
                    jSONObject.put("a", jSONObject2);
                }
                bundle.putString("custom", jSONObject.toString());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
