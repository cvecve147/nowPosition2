package com.onesignal;

import android.R;
import android.app.Activity;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.support.p007v4.app.C0297Y;
import android.support.p007v4.app.C0312ba;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.widget.RemoteViews;
import com.nostra13.universalimageloader.core.download.BaseImageDownloader;
import com.onesignal.C4284Q;
import com.onesignal.C4306Xa;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.net.URL;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.u */
class C4430u {

    /* renamed from: a */
    private static Context f13054a;

    /* renamed from: b */
    private static String f13055b;

    /* renamed from: c */
    private static Resources f13056c;

    /* renamed from: d */
    private static Class<?> f13057d;

    /* renamed from: e */
    private static boolean f13058e;

    /* renamed from: com.onesignal.u$a */
    private static class C4431a {

        /* renamed from: a */
        C0297Y.C0301d f13059a;

        /* renamed from: b */
        boolean f13060b;

        private C4431a() {
        }

        /* synthetic */ C4431a(C4424t tVar) {
            this();
        }
    }

    /* renamed from: a */
    private static PendingIntent m17595a(int i, Intent intent) {
        return f13058e ? PendingIntent.getBroadcast(f13054a, i, intent, 134217728) : PendingIntent.getActivity(f13054a, i, intent, 134217728);
    }

    /* renamed from: a */
    private static Intent m17597a(int i, JSONObject jSONObject, String str) {
        return m17630d(i).putExtra("onesignal_data", jSONObject.toString()).putExtra("summary", str);
    }

    /* renamed from: a */
    private static Bitmap m17598a() {
        return m17599a(m17618b("ic_onesignal_large_icon_default"));
    }

    /* renamed from: a */
    private static Bitmap m17599a(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            int dimension = (int) f13056c.getDimension(17104902);
            int dimension2 = (int) f13056c.getDimension(17104901);
            int height = bitmap.getHeight();
            int width = bitmap.getWidth();
            if (width <= dimension2 && height <= dimension) {
                return bitmap;
            }
            if (height > width) {
                dimension2 = (int) (((float) dimension) * (((float) width) / ((float) height)));
            } else if (width > height) {
                dimension = (int) (((float) dimension2) * (((float) height) / ((float) width)));
            }
            return Bitmap.createScaledBitmap(bitmap, dimension2, dimension, true);
        } catch (Throwable unused) {
            return bitmap;
        }
    }

    /* renamed from: a */
    private static Bitmap m17600a(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        return (trim.startsWith("http://") || trim.startsWith("https://")) ? m17624c(trim) : m17618b(str);
    }

    /* renamed from: a */
    private static Integer m17602a(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        try {
            if (jSONObject.has(str)) {
                return Integer.valueOf(new BigInteger(jSONObject.optString(str), 16).intValue());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static void m17603a(Context context) {
        Class cls;
        f13054a = context;
        f13055b = f13054a.getPackageName();
        f13056c = f13054a.getResources();
        PackageManager packageManager = f13054a.getPackageManager();
        Intent intent = new Intent(f13054a, NotificationOpenedReceiver.class);
        intent.setPackage(f13054a.getPackageName());
        if (packageManager.queryBroadcastReceivers(intent, 0).size() > 0) {
            f13058e = true;
            cls = NotificationOpenedReceiver.class;
        } else {
            cls = C4296U.class;
        }
        f13057d = cls;
    }

    /* renamed from: a */
    private static void m17605a(C0297Y.C0301d dVar) {
        dVar.mo1219d(true);
        dVar.mo1208b(0);
        dVar.mo1201a((Uri) null);
        dVar.mo1207a((long[]) null);
        dVar.mo1218d((CharSequence) null);
    }

    /* renamed from: a */
    private static void m17606a(RemoteViews remoteViews, JSONObject jSONObject, int i, String str, String str2) {
        int a;
        Integer a2 = m17602a(jSONObject, str);
        if (a2 != null) {
            a = a2.intValue();
        } else {
            int identifier = f13056c.getIdentifier(str2, "color", f13055b);
            if (identifier != 0) {
                a = C4373h.m17368a(f13054a, identifier);
            } else {
                return;
            }
        }
        remoteViews.setTextColor(i, a);
    }

    /* renamed from: a */
    static void m17607a(C4290S s) {
        Activity activity;
        m17603a(s.f12708a);
        if (s.f12710c || !s.f12712e || (activity = C4342b.f12860f) == null) {
            m17631d(s);
        } else {
            m17612a(s.f12709b, activity, s.mo12403a().intValue());
        }
    }

    /* renamed from: a */
    private static void m17608a(C4290S s, C0297Y.C0301d dVar) {
        C4284Q.C4285a aVar = s.f12720m;
        if (aVar != null && aVar.f12705a != null) {
            try {
                Field declaredField = C0297Y.C0301d.class.getDeclaredField("M");
                declaredField.setAccessible(true);
                Notification notification = (Notification) declaredField.get(dVar);
                s.f12718k = Integer.valueOf(notification.flags);
                s.f12719l = notification.sound;
                dVar.mo1202a(s.f12720m.f12705a);
                Notification notification2 = (Notification) declaredField.get(dVar);
                Field declaredField2 = C0297Y.C0301d.class.getDeclaredField("d");
                declaredField2.setAccessible(true);
                CharSequence charSequence = (CharSequence) declaredField2.get(dVar);
                Field declaredField3 = C0297Y.C0301d.class.getDeclaredField("c");
                declaredField3.setAccessible(true);
                s.f12714g = charSequence;
                s.f12715h = (CharSequence) declaredField3.get(dVar);
                if (!s.f12710c) {
                    s.f12717j = Integer.valueOf(notification2.flags);
                    s.f12716i = notification2.sound;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private static void m17609a(C4290S s, C4431a aVar) {
        String str;
        PendingIntent pendingIntent;
        Integer num;
        ArrayList<SpannableString> arrayList;
        JSONObject jSONObject;
        Notification notification;
        String str2;
        String str3;
        String str4;
        String str5;
        C4290S s2 = s;
        C4431a aVar2 = aVar;
        String str6 = "message";
        String str7 = "title";
        String str8 = "is_summary";
        boolean z = s2.f12710c;
        JSONObject jSONObject2 = s2.f12709b;
        Cursor cursor = null;
        String optString = jSONObject2.optString("grp", (String) null);
        SecureRandom secureRandom = new SecureRandom();
        PendingIntent a = m17595a(secureRandom.nextInt(), m17623c(0).putExtra("summary", optString));
        C4353cb a2 = C4353cb.m17322a(f13054a);
        try {
            SQLiteDatabase a3 = a2.mo12480a();
            String[] strArr = {"android_notification_id", "full_data", str8, str7, str6};
            JSONObject jSONObject3 = jSONObject2;
            try {
                String[] strArr2 = {optString};
                if (z || s.mo12403a().intValue() == -1) {
                    str = "group_id = ? AND dismissed = 0 AND opened = 0";
                } else {
                    str = "group_id = ? AND dismissed = 0 AND opened = 0" + " AND android_notification_id <> " + s.mo12403a();
                }
                cursor = a3.query("notification", strArr, str, strArr2, (String) null, (String) null, "_id DESC");
                String str9 = "";
                if (cursor.moveToFirst()) {
                    arrayList = new ArrayList<>();
                    String str10 = null;
                    num = null;
                    while (true) {
                        pendingIntent = a;
                        String str11 = str8;
                        if (cursor.getInt(cursor.getColumnIndex(str8)) == 1) {
                            str4 = str6;
                            str3 = str7;
                            num = Integer.valueOf(cursor.getInt(cursor.getColumnIndex("android_notification_id")));
                        } else {
                            String string = cursor.getString(cursor.getColumnIndex(str7));
                            if (string == null) {
                                str5 = str9;
                            } else {
                                str5 = string + " ";
                            }
                            str4 = str6;
                            str3 = str7;
                            SpannableString spannableString = new SpannableString(str5 + cursor.getString(cursor.getColumnIndex(str6)));
                            if (str5.length() > 0) {
                                spannableString.setSpan(new StyleSpan(1), 0, str5.length(), 0);
                            }
                            arrayList.add(spannableString);
                            if (str10 == null) {
                                str10 = cursor.getString(cursor.getColumnIndex("full_data"));
                            }
                        }
                        if (!cursor.moveToNext()) {
                            break;
                        }
                        a = pendingIntent;
                        str8 = str11;
                        str6 = str4;
                        str7 = str3;
                    }
                    if (z && str10 != null) {
                        jSONObject = new JSONObject(str10);
                    }
                    jSONObject = jSONObject3;
                } else {
                    pendingIntent = a;
                    jSONObject = jSONObject3;
                    arrayList = null;
                    num = null;
                }
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
                if (num == null) {
                    num = Integer.valueOf(secureRandom.nextInt());
                    m17610a(a2, optString, num.intValue());
                }
                PendingIntent a4 = m17595a(secureRandom.nextInt(), m17597a(num.intValue(), jSONObject, optString));
                if (arrayList == null || ((!z || arrayList.size() <= 1) && (z || arrayList.size() <= 0))) {
                    C4431a aVar3 = aVar;
                    C0297Y.C0301d dVar = aVar3.f13059a;
                    dVar.f1269b.clear();
                    m17614a(jSONObject, dVar, num.intValue(), optString);
                    dVar.mo1199a(a4);
                    dVar.mo1209b(pendingIntent);
                    dVar.mo1219d(z);
                    dVar.mo1215c(optString);
                    dVar.mo1212b(true);
                    try {
                        dVar.mo1213c(1);
                    } catch (Throwable unused) {
                    }
                    notification = dVar.mo1194a();
                    m17611a(aVar3, notification);
                } else {
                    int size = arrayList.size() + (z ^ true ? 1 : 0);
                    String str12 = null;
                    String optString2 = jSONObject.optString("grp_msg", (String) null);
                    if (optString2 == null) {
                        str2 = size + " new messages";
                    } else {
                        str2 = optString2.replace("$[notif_count]", str9 + size);
                    }
                    C0297Y.C0301d dVar2 = m17626c(s).f13059a;
                    if (z) {
                        m17605a(dVar2);
                    } else {
                        Uri uri = s2.f12716i;
                        if (uri != null) {
                            dVar2.mo1201a(uri);
                        }
                        Integer num2 = s2.f12717j;
                        if (num2 != null) {
                            dVar2.mo1208b(num2.intValue());
                        }
                    }
                    dVar2.mo1199a(a4);
                    dVar2.mo1209b(pendingIntent);
                    dVar2.mo1214c(f13054a.getPackageManager().getApplicationLabel(f13054a.getApplicationInfo()));
                    dVar2.mo1210b((CharSequence) str2);
                    dVar2.mo1217d(size);
                    dVar2.mo1221f(m17615b());
                    dVar2.mo1200a(m17598a());
                    dVar2.mo1219d(z);
                    dVar2.mo1215c(optString);
                    dVar2.mo1212b(true);
                    try {
                        dVar2.mo1213c(1);
                    } catch (Throwable unused2) {
                    }
                    if (!z) {
                        dVar2.mo1218d((CharSequence) str2);
                    }
                    C0297Y.C0303f fVar = new C0297Y.C0303f();
                    if (!z) {
                        if (s.mo12407d() != null) {
                            str12 = s.mo12407d().toString();
                        }
                        if (str12 != null) {
                            str9 = str12 + " ";
                        }
                        SpannableString spannableString2 = new SpannableString(str9 + s.mo12406c().toString());
                        if (str9.length() > 0) {
                            spannableString2.setSpan(new StyleSpan(1), 0, str9.length(), 0);
                        }
                        fVar.mo1224a((CharSequence) spannableString2);
                    }
                    for (SpannableString a5 : arrayList) {
                        fVar.mo1224a((CharSequence) a5);
                    }
                    fVar.mo1225b(str2);
                    dVar2.mo1203a((C0297Y.C0304g) fVar);
                    notification = dVar2.mo1194a();
                }
                C0312ba.m1395a(f13054a).mo1239a(num.intValue(), notification);
            } catch (Throwable th) {
                th = th;
                cursor = null;
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
                throw th;
            }
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (Throwable th2) {
            th = th2;
            cursor.close();
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047 A[SYNTHETIC, Splitter:B:17:0x0047] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0054 A[SYNTHETIC, Splitter:B:22:0x0054] */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m17610a(com.onesignal.C4353cb r4, java.lang.String r5, int r6) {
        /*
            java.lang.String r0 = "Error closing transaction! "
            r1 = 0
            android.database.sqlite.SQLiteDatabase r4 = r4.mo12481b()     // Catch:{ Throwable -> 0x003d }
            r4.beginTransaction()     // Catch:{ Throwable -> 0x0037, all -> 0x0035 }
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ Throwable -> 0x0037, all -> 0x0035 }
            r2.<init>()     // Catch:{ Throwable -> 0x0037, all -> 0x0035 }
            java.lang.String r3 = "android_notification_id"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Throwable -> 0x0037, all -> 0x0035 }
            r2.put(r3, r6)     // Catch:{ Throwable -> 0x0037, all -> 0x0035 }
            java.lang.String r6 = "group_id"
            r2.put(r6, r5)     // Catch:{ Throwable -> 0x0037, all -> 0x0035 }
            java.lang.String r5 = "is_summary"
            r6 = 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Throwable -> 0x0037, all -> 0x0035 }
            r2.put(r5, r6)     // Catch:{ Throwable -> 0x0037, all -> 0x0035 }
            java.lang.String r5 = "notification"
            r4.insertOrThrow(r5, r1, r2)     // Catch:{ Throwable -> 0x0037, all -> 0x0035 }
            r4.setTransactionSuccessful()     // Catch:{ Throwable -> 0x0037, all -> 0x0035 }
            if (r4 == 0) goto L_0x0051
            r4.endTransaction()     // Catch:{ Throwable -> 0x004b }
            goto L_0x0051
        L_0x0035:
            r5 = move-exception
            goto L_0x0052
        L_0x0037:
            r5 = move-exception
            r1 = r4
            goto L_0x003e
        L_0x003a:
            r5 = move-exception
            r4 = r1
            goto L_0x0052
        L_0x003d:
            r5 = move-exception
        L_0x003e:
            com.onesignal.Xa$j r4 = com.onesignal.C4306Xa.C4316j.ERROR     // Catch:{ all -> 0x003a }
            java.lang.String r6 = "Error adding summary notification record! "
            com.onesignal.C4306Xa.m17136a((com.onesignal.C4306Xa.C4316j) r4, (java.lang.String) r6, (java.lang.Throwable) r5)     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x0051
            r1.endTransaction()     // Catch:{ Throwable -> 0x004b }
            goto L_0x0051
        L_0x004b:
            r4 = move-exception
            com.onesignal.Xa$j r5 = com.onesignal.C4306Xa.C4316j.ERROR
            com.onesignal.C4306Xa.m17136a((com.onesignal.C4306Xa.C4316j) r5, (java.lang.String) r0, (java.lang.Throwable) r4)
        L_0x0051:
            return
        L_0x0052:
            if (r4 == 0) goto L_0x005e
            r4.endTransaction()     // Catch:{ Throwable -> 0x0058 }
            goto L_0x005e
        L_0x0058:
            r4 = move-exception
            com.onesignal.Xa$j r6 = com.onesignal.C4306Xa.C4316j.ERROR
            com.onesignal.C4306Xa.m17136a((com.onesignal.C4306Xa.C4316j) r6, (java.lang.String) r0, (java.lang.Throwable) r4)
        L_0x005e:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C4430u.m17610a(com.onesignal.cb, java.lang.String, int):void");
    }

    /* renamed from: a */
    private static void m17611a(C4431a aVar, Notification notification) {
        if (aVar.f13060b) {
            try {
                Object newInstance = Class.forName("android.app.MiuiNotification").newInstance();
                Field declaredField = newInstance.getClass().getDeclaredField("customizedIcon");
                declaredField.setAccessible(true);
                declaredField.set(newInstance, true);
                Field field = notification.getClass().getField("extraNotification");
                field.setAccessible(true);
                field.set(notification, newInstance);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private static void m17612a(JSONObject jSONObject, Activity activity, int i) {
        activity.runOnUiThread(new C4424t(activity, jSONObject, i));
    }

    /* renamed from: a */
    private static void m17613a(JSONObject jSONObject, C0297Y.C0301d dVar) {
        JSONObject jSONObject2;
        Bitmap bitmap;
        String str;
        if (Build.VERSION.SDK_INT >= 16) {
            String optString = jSONObject.optString("bg_img", (String) null);
            if (optString != null) {
                jSONObject2 = new JSONObject(optString);
                bitmap = m17600a(jSONObject2.optString("img", (String) null));
            } else {
                bitmap = null;
                jSONObject2 = null;
            }
            if (bitmap == null) {
                bitmap = m17618b("onesignal_bgimage_default_image");
            }
            if (bitmap != null) {
                RemoteViews remoteViews = new RemoteViews(f13054a.getPackageName(), C4239Eb.onesignal_bgimage_notif_layout);
                remoteViews.setTextViewText(C4234Db.os_bgimage_notif_title, m17633e(jSONObject));
                remoteViews.setTextViewText(C4234Db.os_bgimage_notif_body, jSONObject.optString("alert"));
                m17606a(remoteViews, jSONObject2, C4234Db.os_bgimage_notif_title, "tc", "onesignal_bgimage_notif_title_color");
                m17606a(remoteViews, jSONObject2, C4234Db.os_bgimage_notif_body, "bc", "onesignal_bgimage_notif_body_color");
                if (jSONObject2 == null || !jSONObject2.has("img_align")) {
                    int identifier = f13056c.getIdentifier("onesignal_bgimage_notif_image_align", "string", f13055b);
                    str = identifier != 0 ? f13056c.getString(identifier) : null;
                } else {
                    str = jSONObject2.getString("img_align");
                }
                if ("right".equals(str)) {
                    remoteViews.setViewPadding(C4234Db.os_bgimage_notif_bgimage_align_layout, -5000, 0, 0, 0);
                    remoteViews.setImageViewBitmap(C4234Db.os_bgimage_notif_bgimage_right_aligned, bitmap);
                    remoteViews.setViewVisibility(C4234Db.os_bgimage_notif_bgimage_right_aligned, 0);
                    remoteViews.setViewVisibility(C4234Db.os_bgimage_notif_bgimage, 2);
                } else {
                    remoteViews.setImageViewBitmap(C4234Db.os_bgimage_notif_bgimage, bitmap);
                }
                dVar.mo1204a(remoteViews);
                dVar.mo1203a((C0297Y.C0304g) null);
            }
        }
    }

    /* renamed from: a */
    private static void m17614a(JSONObject jSONObject, C0297Y.C0301d dVar, int i, String str) {
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.optString("custom"));
            if (jSONObject2.has("a")) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("a");
                if (jSONObject3.has("actionButtons")) {
                    JSONArray jSONArray = jSONObject3.getJSONArray("actionButtons");
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                        JSONObject jSONObject4 = new JSONObject(jSONObject.toString());
                        Intent d = m17630d(i);
                        d.setAction("" + i2);
                        d.putExtra("action_button", true);
                        jSONObject4.put("actionSelected", optJSONObject.optString("id"));
                        d.putExtra("onesignal_data", jSONObject4.toString());
                        if (str != null) {
                            d.putExtra("summary", str);
                        } else if (jSONObject.has("grp")) {
                            d.putExtra("grp", jSONObject.optString("grp"));
                        }
                        dVar.mo1197a(optJSONObject.has("icon") ? m17632e(optJSONObject.optString("icon")) : 0, (CharSequence) optJSONObject.optString("text"), m17595a(i, d));
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: b */
    private static int m17615b() {
        int d = m17628d("ic_stat_onesignal_default");
        if (d != 0) {
            return d;
        }
        int d2 = m17628d("corona_statusbar_icon_default");
        if (d2 != 0) {
            return d2;
        }
        int d3 = m17628d("ic_os_notification_fallback_white_24dp");
        if (d3 != 0) {
            return d3;
        }
        return 17301598;
    }

    /* renamed from: b */
    private static int m17616b(int i) {
        if (i > 9) {
            return 2;
        }
        if (i > 7) {
            return 1;
        }
        if (i > 4) {
            return 0;
        }
        return i > 2 ? -1 : -2;
    }

    /* renamed from: b */
    private static Notification m17617b(C4290S s, C0297Y.C0301d dVar) {
        Uri uri;
        int i = Build.VERSION.SDK_INT;
        boolean z = i > 17 && i < 24 && !s.f12710c;
        if (z && (uri = s.f12716i) != null && !uri.equals(s.f12719l)) {
            dVar.mo1201a((Uri) null);
        }
        Notification a = dVar.mo1194a();
        if (z) {
            dVar.mo1201a(s.f12716i);
        }
        return a;
    }

    /* renamed from: b */
    private static Bitmap m17618b(String str) {
        Bitmap bitmap;
        try {
            bitmap = BitmapFactory.decodeStream(f13054a.getAssets().open(str));
        } catch (Throwable unused) {
            bitmap = null;
        }
        if (bitmap != null) {
            return bitmap;
        }
        try {
            for (String str2 : Arrays.asList(new String[]{".png", ".webp", ".jpg", ".gif", ".bmp"})) {
                try {
                    bitmap = BitmapFactory.decodeStream(f13054a.getAssets().open(str + str2));
                    continue;
                } catch (Throwable unused2) {
                }
                if (bitmap != null) {
                    return bitmap;
                }
            }
            int e = m17632e(str);
            if (e != 0) {
                return BitmapFactory.decodeResource(f13056c, e);
            }
        } catch (Throwable unused3) {
        }
        return null;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0015 */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f A[Catch:{ Throwable -> 0x0025 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.math.BigInteger m17619b(org.json.JSONObject r4) {
        /*
            java.lang.String r0 = "bgac"
            r1 = 16
            r2 = 0
            boolean r3 = r4.has(r0)     // Catch:{ Throwable -> 0x0015 }
            if (r3 == 0) goto L_0x0015
            java.math.BigInteger r3 = new java.math.BigInteger     // Catch:{ Throwable -> 0x0015 }
            java.lang.String r4 = r4.optString(r0, r2)     // Catch:{ Throwable -> 0x0015 }
            r3.<init>(r4, r1)     // Catch:{ Throwable -> 0x0015 }
            return r3
        L_0x0015:
            android.content.Context r4 = f13054a     // Catch:{ Throwable -> 0x0025 }
            java.lang.String r0 = "com.onesignal.NotificationAccentColor.DEFAULT"
            java.lang.String r4 = com.onesignal.C4252Ia.m16863a((android.content.Context) r4, (java.lang.String) r0)     // Catch:{ Throwable -> 0x0025 }
            if (r4 == 0) goto L_0x0025
            java.math.BigInteger r0 = new java.math.BigInteger     // Catch:{ Throwable -> 0x0025 }
            r0.<init>(r4, r1)     // Catch:{ Throwable -> 0x0025 }
            return r0
        L_0x0025:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C4430u.m17619b(org.json.JSONObject):java.math.BigInteger");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m17620b(Context context, JSONObject jSONObject, List<String> list, List<String> list2) {
        try {
            m17627c(context, jSONObject, list, list2);
        } catch (Throwable th) {
            C4306Xa.m17136a(C4306Xa.C4316j.ERROR, "Failed to parse JSON for custom buttons for alert dialog.", th);
        }
        if (list.size() == 0 || list.size() < 3) {
            list.add(C4252Ia.m16864a(context, "onesignal_in_app_alert_ok_button_text", "Ok"));
            list2.add("__DEFAULT__");
        }
    }

    /* renamed from: b */
    static void m17621b(C4290S s) {
        m17603a(s.f12708a);
        m17609a(s, (C4431a) null);
    }

    /* renamed from: b */
    private static void m17622b(JSONObject jSONObject, C0297Y.C0301d dVar) {
        int b = m17616b(jSONObject.optInt("pri", 6));
        dVar.mo1220e(b);
        if (!(b < 0)) {
            int i = 4;
            if (jSONObject.has("ledc") && jSONObject.optInt("led", 1) == 1) {
                try {
                    dVar.mo1196a(new BigInteger(jSONObject.optString("ledc"), 16).intValue(), 2000, (int) BaseImageDownloader.DEFAULT_HTTP_CONNECT_TIMEOUT);
                    i = 0;
                } catch (Throwable unused) {
                }
            }
            if (C4306Xa.m17174e(f13054a) && jSONObject.optInt("vib", 1) == 1) {
                if (jSONObject.has("vib_pt")) {
                    long[] a = C4252Ia.m16871a(jSONObject);
                    if (a != null) {
                        dVar.mo1207a(a);
                    }
                } else {
                    i |= 2;
                }
            }
            if (m17634f(jSONObject)) {
                Uri b2 = C4252Ia.m16873b(f13054a, jSONObject.optString("sound", (String) null));
                if (b2 != null) {
                    dVar.mo1201a(b2);
                } else {
                    i |= 1;
                }
            }
            dVar.mo1208b(i);
        }
    }

    /* renamed from: c */
    private static Intent m17623c(int i) {
        Intent putExtra = new Intent(f13054a, f13057d).putExtra("notificationId", i).putExtra("dismissed", true);
        return f13058e ? putExtra : putExtra.addFlags(402718720);
    }

    /* renamed from: c */
    private static Bitmap m17624c(String str) {
        try {
            return BitmapFactory.decodeStream(new URL(str).openConnection().getInputStream());
        } catch (Throwable th) {
            C4306Xa.m17136a(C4306Xa.C4316j.WARN, "Could not download image!", th);
            return null;
        }
    }

    /* renamed from: c */
    private static Bitmap m17625c(JSONObject jSONObject) {
        Bitmap a = m17600a(jSONObject.optString("licon"));
        if (a == null) {
            a = m17618b("ic_onesignal_large_icon_default");
        }
        if (a == null) {
            return null;
        }
        return m17599a(a);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0067 */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006d A[Catch:{ Throwable -> 0x007a }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0076 A[Catch:{ Throwable -> 0x007a }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a3 A[SYNTHETIC, Splitter:B:29:0x00a3] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.onesignal.C4430u.C4431a m17626c(com.onesignal.C4290S r9) {
        /*
            java.lang.String r0 = "vis"
            org.json.JSONObject r1 = r9.f12709b
            com.onesignal.u$a r2 = new com.onesignal.u$a
            r3 = 0
            r2.<init>(r3)
            java.lang.String r4 = com.onesignal.C4281P.m17015a((com.onesignal.C4290S) r9)     // Catch:{ Throwable -> 0x0016 }
            android.support.v4.app.Y$d r5 = new android.support.v4.app.Y$d     // Catch:{ Throwable -> 0x0016 }
            android.content.Context r6 = f13054a     // Catch:{ Throwable -> 0x0016 }
            r5.<init>(r6, r4)     // Catch:{ Throwable -> 0x0016 }
            goto L_0x001d
        L_0x0016:
            android.support.v4.app.Y$d r5 = new android.support.v4.app.Y$d
            android.content.Context r4 = f13054a
            r5.<init>(r4)
        L_0x001d:
            java.lang.String r4 = "alert"
            java.lang.String r4 = r1.optString(r4, r3)
            r6 = 1
            r5.mo1206a((boolean) r6)
            int r7 = m17629d((org.json.JSONObject) r1)
            r5.mo1221f(r7)
            android.support.v4.app.Y$c r7 = new android.support.v4.app.Y$c
            r7.<init>()
            r7.mo1193a((java.lang.CharSequence) r4)
            r5.mo1203a((android.support.p007v4.app.C0297Y.C0304g) r7)
            r5.mo1210b((java.lang.CharSequence) r4)
            r5.mo1218d((java.lang.CharSequence) r4)
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 24
            if (r7 < r8) goto L_0x0053
            java.lang.String r7 = "title"
            java.lang.String r7 = r1.optString(r7)
            java.lang.String r8 = ""
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x005a
        L_0x0053:
            java.lang.CharSequence r7 = m17633e((org.json.JSONObject) r1)
            r5.mo1214c((java.lang.CharSequence) r7)
        L_0x005a:
            java.math.BigInteger r7 = m17619b((org.json.JSONObject) r1)     // Catch:{ Throwable -> 0x0067 }
            if (r7 == 0) goto L_0x0067
            int r7 = r7.intValue()     // Catch:{ Throwable -> 0x0067 }
            r5.mo1195a((int) r7)     // Catch:{ Throwable -> 0x0067 }
        L_0x0067:
            boolean r7 = r1.has(r0)     // Catch:{ Throwable -> 0x007a }
            if (r7 == 0) goto L_0x0076
            java.lang.String r0 = r1.optString(r0)     // Catch:{ Throwable -> 0x007a }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Throwable -> 0x007a }
            goto L_0x0077
        L_0x0076:
            r0 = r6
        L_0x0077:
            r5.mo1222g(r0)     // Catch:{ Throwable -> 0x007a }
        L_0x007a:
            android.graphics.Bitmap r0 = m17625c((org.json.JSONObject) r1)
            if (r0 == 0) goto L_0x0085
            r2.f13060b = r6
            r5.mo1200a((android.graphics.Bitmap) r0)
        L_0x0085:
            java.lang.String r0 = "bicon"
            java.lang.String r0 = r1.optString(r0, r3)
            android.graphics.Bitmap r0 = m17600a((java.lang.String) r0)
            if (r0 == 0) goto L_0x009f
            android.support.v4.app.Y$b r3 = new android.support.v4.app.Y$b
            r3.<init>()
            r3.mo1190a((android.graphics.Bitmap) r0)
            r3.mo1191a((java.lang.CharSequence) r4)
            r5.mo1203a((android.support.p007v4.app.C0297Y.C0304g) r3)
        L_0x009f:
            java.lang.Long r9 = r9.f12713f
            if (r9 == 0) goto L_0x00ad
            long r3 = r9.longValue()     // Catch:{ Throwable -> 0x00ad }
            r6 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r6
            r5.mo1198a((long) r3)     // Catch:{ Throwable -> 0x00ad }
        L_0x00ad:
            m17622b((org.json.JSONObject) r1, (android.support.p007v4.app.C0297Y.C0301d) r5)
            r2.f13059a = r5
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C4430u.m17626c(com.onesignal.S):com.onesignal.u$a");
    }

    /* renamed from: c */
    private static void m17627c(Context context, JSONObject jSONObject, List<String> list, List<String> list2) {
        JSONObject jSONObject2 = new JSONObject(jSONObject.optString("custom"));
        if (jSONObject2.has("a")) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("a");
            if (jSONObject3.has("actionButtons")) {
                JSONArray optJSONArray = jSONObject3.optJSONArray("actionButtons");
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject jSONObject4 = optJSONArray.getJSONObject(i);
                    list.add(jSONObject4.optString("text"));
                    list2.add(jSONObject4.optString("id"));
                }
            }
        }
    }

    /* renamed from: d */
    private static int m17628d(String str) {
        return f13056c.getIdentifier(str, "drawable", f13055b);
    }

    /* renamed from: d */
    private static int m17629d(JSONObject jSONObject) {
        int e = m17632e(jSONObject.optString("sicon", (String) null));
        return e != 0 ? e : m17615b();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static Intent m17630d(int i) {
        Intent putExtra = new Intent(f13054a, f13057d).putExtra("notificationId", i);
        return f13058e ? putExtra : putExtra.addFlags(603979776);
    }

    /* renamed from: d */
    private static void m17631d(C4290S s) {
        Notification notification;
        SecureRandom secureRandom = new SecureRandom();
        int intValue = s.mo12403a().intValue();
        JSONObject jSONObject = s.f12709b;
        String optString = jSONObject.optString("grp", (String) null);
        C4431a c = m17626c(s);
        C0297Y.C0301d dVar = c.f13059a;
        m17614a(jSONObject, dVar, intValue, (String) null);
        try {
            m17613a(jSONObject, dVar);
        } catch (Throwable th) {
            C4306Xa.m17136a(C4306Xa.C4316j.ERROR, "Could not set background notification image!", th);
        }
        m17608a(s, dVar);
        if (s.f12710c) {
            m17605a(dVar);
        }
        C4293T.m17057a(f13054a, optString != null ? 2 : 1);
        if (optString != null) {
            dVar.mo1199a(m17595a(secureRandom.nextInt(), m17630d(intValue).putExtra("onesignal_data", jSONObject.toString()).putExtra("grp", optString)));
            dVar.mo1209b(m17595a(secureRandom.nextInt(), m17623c(intValue).putExtra("grp", optString)));
            dVar.mo1215c(optString);
            try {
                dVar.mo1213c(1);
            } catch (Throwable unused) {
            }
            notification = m17617b(s, dVar);
            m17609a(s, c);
        } else {
            dVar.mo1199a(m17595a(secureRandom.nextInt(), m17630d(intValue).putExtra("onesignal_data", jSONObject.toString())));
            dVar.mo1209b(m17595a(secureRandom.nextInt(), m17623c(intValue)));
            notification = dVar.mo1194a();
        }
        if (optString == null || Build.VERSION.SDK_INT > 17) {
            m17611a(c, notification);
            C0312ba.m1395a(f13054a).mo1239a(intValue, notification);
        }
    }

    /* renamed from: e */
    private static int m17632e(String str) {
        if (str == null) {
            return 0;
        }
        String trim = str.trim();
        if (!C4252Ia.m16870a(trim)) {
            return 0;
        }
        int d = m17628d(trim);
        if (d != 0) {
            return d;
        }
        try {
            return R.drawable.class.getField(str).getInt((Object) null);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static CharSequence m17633e(JSONObject jSONObject) {
        String optString = jSONObject.optString("title", (String) null);
        return optString != null ? optString : f13054a.getPackageManager().getApplicationLabel(f13054a.getApplicationInfo());
    }

    /* renamed from: f */
    private static boolean m17634f(JSONObject jSONObject) {
        String optString = jSONObject.optString("sound", (String) null);
        if ("null".equals(optString) || "nil".equals(optString)) {
            return false;
        }
        return C4306Xa.m17171d(f13054a);
    }
}
