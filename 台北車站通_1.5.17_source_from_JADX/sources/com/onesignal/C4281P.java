package com.onesignal;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import com.onesignal.C4306Xa;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.P */
class C4281P {

    /* renamed from: a */
    private static final Pattern f12695a = Pattern.compile("^([A-Fa-f0-9]{8})$");

    /* renamed from: a */
    private static int m17012a(int i) {
        if (i > 9) {
            return 5;
        }
        if (i > 7) {
            return 4;
        }
        if (i > 5) {
            return 3;
        }
        if (i > 3) {
            return 2;
        }
        return i > 1 ? 1 : 0;
    }

    /* renamed from: a */
    private static String m17013a(NotificationManager notificationManager) {
        NotificationChannel notificationChannel = new NotificationChannel("fcm_fallback_notification_channel", "Miscellaneous", 3);
        notificationChannel.enableLights(true);
        notificationChannel.enableVibration(true);
        notificationManager.createNotificationChannel(notificationChannel);
        return "fcm_fallback_notification_channel";
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0132  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m17014a(android.content.Context r7, android.app.NotificationManager r8, org.json.JSONObject r9) {
        /*
            java.lang.String r0 = "chnl"
            java.lang.Object r0 = r9.opt(r0)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L_0x0012
            org.json.JSONObject r1 = new org.json.JSONObject
            java.lang.String r0 = (java.lang.String) r0
            r1.<init>(r0)
            goto L_0x0015
        L_0x0012:
            r1 = r0
            org.json.JSONObject r1 = (org.json.JSONObject) r1
        L_0x0015:
            java.lang.String r0 = "fcm_fallback_notification_channel"
            java.lang.String r2 = "id"
            java.lang.String r2 = r1.optString(r2, r0)
            java.lang.String r3 = "miscellaneous"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            r0 = r2
        L_0x0027:
            java.lang.String r2 = "langs"
            boolean r3 = r1.has(r2)
            if (r3 == 0) goto L_0x0042
            org.json.JSONObject r2 = r1.getJSONObject(r2)
            java.lang.String r3 = com.onesignal.C4252Ia.m16876c()
            boolean r4 = r2.has(r3)
            if (r4 == 0) goto L_0x0042
            org.json.JSONObject r2 = r2.optJSONObject(r3)
            goto L_0x0043
        L_0x0042:
            r2 = r1
        L_0x0043:
            java.lang.String r3 = "nm"
            java.lang.String r4 = "Miscellaneous"
            java.lang.String r3 = r2.optString(r3, r4)
            r4 = 6
            java.lang.String r5 = "pri"
            int r4 = r9.optInt(r5, r4)
            int r4 = m17012a((int) r4)
            android.app.NotificationChannel r5 = new android.app.NotificationChannel
            r5.<init>(r0, r3, r4)
            r3 = 0
            java.lang.String r4 = "dscr"
            java.lang.String r4 = r2.optString(r4, r3)
            r5.setDescription(r4)
            java.lang.String r4 = "grp_id"
            boolean r6 = r1.has(r4)
            if (r6 == 0) goto L_0x0082
            java.lang.String r1 = r1.optString(r4)
            java.lang.String r4 = "grp_nm"
            java.lang.String r2 = r2.optString(r4)
            android.app.NotificationChannelGroup r4 = new android.app.NotificationChannelGroup
            r4.<init>(r1, r2)
            r8.createNotificationChannelGroup(r4)
            r5.setGroup(r1)
        L_0x0082:
            java.lang.String r1 = "ledc"
            boolean r2 = r9.has(r1)
            if (r2 == 0) goto L_0x00ba
            java.lang.String r1 = r9.optString(r1)
            java.util.regex.Pattern r2 = f12695a
            java.util.regex.Matcher r2 = r2.matcher(r1)
            boolean r2 = r2.matches()
            if (r2 != 0) goto L_0x00a3
            com.onesignal.Xa$j r1 = com.onesignal.C4306Xa.C4316j.WARN
            java.lang.String r2 = "OneSignal LED Color Settings: ARGB Hex value incorrect format (E.g: FF9900FF)"
            com.onesignal.C4306Xa.m17135a((com.onesignal.C4306Xa.C4316j) r1, (java.lang.String) r2)
            java.lang.String r1 = "FFFFFFFF"
        L_0x00a3:
            java.math.BigInteger r2 = new java.math.BigInteger     // Catch:{ Throwable -> 0x00b2 }
            r4 = 16
            r2.<init>(r1, r4)     // Catch:{ Throwable -> 0x00b2 }
            int r1 = r2.intValue()     // Catch:{ Throwable -> 0x00b2 }
            r5.setLightColor(r1)     // Catch:{ Throwable -> 0x00b2 }
            goto L_0x00ba
        L_0x00b2:
            r1 = move-exception
            com.onesignal.Xa$j r2 = com.onesignal.C4306Xa.C4316j.ERROR
            java.lang.String r4 = "Couldn't convert ARGB Hex value to BigInteger:"
            com.onesignal.C4306Xa.m17136a((com.onesignal.C4306Xa.C4316j) r2, (java.lang.String) r4, (java.lang.Throwable) r1)
        L_0x00ba:
            r1 = 1
            java.lang.String r2 = "led"
            int r2 = r9.optInt(r2, r1)
            r4 = 0
            if (r2 != r1) goto L_0x00c6
            r2 = r1
            goto L_0x00c7
        L_0x00c6:
            r2 = r4
        L_0x00c7:
            r5.enableLights(r2)
            java.lang.String r2 = "vib_pt"
            boolean r2 = r9.has(r2)
            if (r2 == 0) goto L_0x00db
            long[] r2 = com.onesignal.C4252Ia.m16871a((org.json.JSONObject) r9)
            if (r2 == 0) goto L_0x00db
            r5.setVibrationPattern(r2)
        L_0x00db:
            java.lang.String r2 = "vib"
            int r2 = r9.optInt(r2, r1)
            if (r2 != r1) goto L_0x00e5
            r2 = r1
            goto L_0x00e6
        L_0x00e5:
            r2 = r4
        L_0x00e6:
            r5.enableVibration(r2)
            java.lang.String r2 = "sound"
            boolean r6 = r9.has(r2)
            if (r6 == 0) goto L_0x0112
            java.lang.String r2 = r9.optString(r2, r3)
            android.net.Uri r7 = com.onesignal.C4252Ia.m16873b(r7, r2)
            if (r7 == 0) goto L_0x00ff
            r5.setSound(r7, r3)
            goto L_0x0112
        L_0x00ff:
            java.lang.String r7 = "null"
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L_0x010f
            java.lang.String r7 = "nil"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L_0x0112
        L_0x010f:
            r5.setSound(r3, r3)
        L_0x0112:
            java.lang.String r7 = "vis"
            int r7 = r9.optInt(r7, r4)
            r5.setLockscreenVisibility(r7)
            java.lang.String r7 = "bdg"
            int r7 = r9.optInt(r7, r1)
            if (r7 != r1) goto L_0x0125
            r7 = r1
            goto L_0x0126
        L_0x0125:
            r7 = r4
        L_0x0126:
            r5.setShowBadge(r7)
            java.lang.String r7 = "bdnd"
            int r7 = r9.optInt(r7, r4)
            if (r7 != r1) goto L_0x0132
            goto L_0x0133
        L_0x0132:
            r1 = r4
        L_0x0133:
            r5.setBypassDnd(r1)
            r8.createNotificationChannel(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C4281P.m17014a(android.content.Context, android.app.NotificationManager, org.json.JSONObject):java.lang.String");
    }

    /* renamed from: a */
    static String m17015a(C4290S s) {
        if (Build.VERSION.SDK_INT < 26) {
            return "fcm_fallback_notification_channel";
        }
        Context context = s.f12708a;
        JSONObject jSONObject = s.f12709b;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (s.f12710c) {
            return m17017b(notificationManager);
        }
        if (jSONObject.has("oth_chnl")) {
            String optString = jSONObject.optString("oth_chnl");
            if (notificationManager.getNotificationChannel(optString) != null) {
                return optString;
            }
        }
        if (!jSONObject.has("chnl")) {
            return m17013a(notificationManager);
        }
        try {
            return m17014a(context, notificationManager, jSONObject);
        } catch (JSONException e) {
            C4306Xa.m17136a(C4306Xa.C4316j.ERROR, "Could not create notification channel due to JSON payload error!", (Throwable) e);
            return "fcm_fallback_notification_channel";
        }
    }

    /* renamed from: a */
    static void m17016a(Context context, JSONArray jSONArray) {
        if (Build.VERSION.SDK_INT >= 26 && jSONArray != null) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            HashSet hashSet = new HashSet();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    hashSet.add(m17014a(context, notificationManager, jSONArray.getJSONObject(i)));
                } catch (JSONException e) {
                    C4306Xa.m17136a(C4306Xa.C4316j.ERROR, "Could not create notification channel due to JSON payload error!", (Throwable) e);
                }
            }
            for (NotificationChannel id : notificationManager.getNotificationChannels()) {
                String id2 = id.getId();
                if (id2.startsWith("OS_") && !hashSet.contains(id2)) {
                    notificationManager.deleteNotificationChannel(id2);
                }
            }
        }
    }

    /* renamed from: b */
    private static String m17017b(NotificationManager notificationManager) {
        notificationManager.createNotificationChannel(new NotificationChannel("restored_OS_notifications", "Restored", 2));
        return "restored_OS_notifications";
    }
}
