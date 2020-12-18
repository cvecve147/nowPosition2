package p267i.p268a.p269a.p271b.p272a;

import android.app.Activity;
import p267i.p274b.p277b.p278a.p279a.C6705b;

/* renamed from: i.a.a.b.a.b */
public class C6671b extends C6670a {

    /* renamed from: q */
    private final String f18506q = "name";

    /* renamed from: r */
    private final String f18507r = SVGParser.XML_STYLESHEET_ATTR_TYPE;

    /* renamed from: s */
    private final String f18508s = "uuid";

    /* renamed from: t */
    private final String f18509t = "major";

    /* renamed from: u */
    private final String f18510u = "minor";

    /* renamed from: v */
    private final String f18511v = "ori_x";

    /* renamed from: w */
    private final String f18512w = "ori_y";

    /* renamed from: x */
    private final String f18513x = "power";

    /* renamed from: y */
    private final String f18514y = "power_update_at";

    /* renamed from: z */
    private final String f18515z = "map_id";

    public C6671b(Activity activity, C6705b bVar) {
        super(activity, bVar, 310301);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0171, code lost:
        if (r24 != null) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0194, code lost:
        if (r24 != null) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0196, code lost:
        r24.body().close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x019d, code lost:
        mo17154a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x01a0, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResponse(okhttp3.Call r23, okhttp3.Response r24) {
        /*
            r22 = this;
            r1 = r22
            java.lang.String r0 = "map_id"
            java.lang.String r2 = "power_update_at"
            java.lang.String r3 = "power"
            java.lang.String r4 = "ori_y"
            java.lang.String r5 = "ori_x"
            java.lang.String r6 = "minor"
            java.lang.String r7 = "major"
            java.lang.String r8 = "uuid"
            java.lang.String r9 = "type"
            java.lang.String r10 = "name"
            java.lang.String r11 = "success"
            java.lang.String r12 = "updated_at"
            int r13 = r24.code()
            boolean r13 = super.mo17124a(r13)
            if (r13 == 0) goto L_0x0025
            return
        L_0x0025:
            java.lang.String r13 = ""
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0176 }
            okhttp3.ResponseBody r15 = r24.body()     // Catch:{ JSONException -> 0x0176 }
            java.lang.String r15 = r15.string()     // Catch:{ JSONException -> 0x0176 }
            r14.<init>(r15)     // Catch:{ JSONException -> 0x0176 }
            boolean r15 = r14.has(r11)     // Catch:{ JSONException -> 0x0176 }
            if (r15 == 0) goto L_0x0153
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0176 }
            r15.<init>()     // Catch:{ JSONException -> 0x0176 }
            org.json.JSONObject r11 = r14.getJSONObject(r11)     // Catch:{ JSONException -> 0x0176 }
            java.lang.String r14 = "results"
            org.json.JSONArray r11 = r11.getJSONArray(r14)     // Catch:{ JSONException -> 0x0176 }
            i.a.a.a.a r14 = new i.a.a.a.a     // Catch:{ JSONException -> 0x0176 }
            r23 = r13
            android.app.Activity r13 = r1.f18614a     // Catch:{ JSONException -> 0x0176 }
            r14.<init>(r13)     // Catch:{ JSONException -> 0x0176 }
            r1.f18504o = r14     // Catch:{ JSONException -> 0x0176 }
            i.a.a.a.a r13 = r1.f18504o     // Catch:{ JSONException -> 0x0176 }
            java.lang.String r14 = "Beacon"
            r13.mo17095b((java.lang.String) r14)     // Catch:{ JSONException -> 0x0176 }
            android.content.ContentValues r13 = new android.content.ContentValues     // Catch:{ JSONException -> 0x0176 }
            r13.<init>()     // Catch:{ JSONException -> 0x0176 }
            r1.f18505p = r13     // Catch:{ JSONException -> 0x0176 }
            r13 = 0
        L_0x0063:
            int r14 = r11.length()     // Catch:{ JSONException -> 0x0176 }
            r16 = r15
            if (r13 >= r14) goto L_0x0136
            org.json.JSONObject r14 = r11.getJSONObject(r13)     // Catch:{ JSONException -> 0x0176 }
            java.lang.String r15 = r14.getString(r12)     // Catch:{ JSONException -> 0x0176 }
            r17 = r11
            java.lang.String r11 = "deleted"
            int r11 = r14.getInt(r11)     // Catch:{ JSONException -> 0x0176 }
            r18 = r13
            java.lang.String r13 = "id"
            r19 = r15
            r15 = 1
            if (r11 == r15) goto L_0x0118
            android.content.ContentValues r11 = r1.f18505p     // Catch:{ JSONException -> 0x0176 }
            int r15 = r14.getInt(r13)     // Catch:{ JSONException -> 0x0176 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ JSONException -> 0x0176 }
            r11.put(r13, r15)     // Catch:{ JSONException -> 0x0176 }
            android.content.ContentValues r11 = r1.f18505p     // Catch:{ JSONException -> 0x0176 }
            java.lang.String r13 = r14.getString(r10)     // Catch:{ JSONException -> 0x0176 }
            r11.put(r10, r13)     // Catch:{ JSONException -> 0x0176 }
            android.content.ContentValues r11 = r1.f18505p     // Catch:{ JSONException -> 0x0176 }
            java.lang.String r13 = r14.getString(r9)     // Catch:{ JSONException -> 0x0176 }
            r11.put(r9, r13)     // Catch:{ JSONException -> 0x0176 }
            android.content.ContentValues r11 = r1.f18505p     // Catch:{ JSONException -> 0x0176 }
            java.lang.String r13 = r14.getString(r8)     // Catch:{ JSONException -> 0x0176 }
            r11.put(r8, r13)     // Catch:{ JSONException -> 0x0176 }
            android.content.ContentValues r11 = r1.f18505p     // Catch:{ JSONException -> 0x0176 }
            int r13 = r14.getInt(r7)     // Catch:{ JSONException -> 0x0176 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ JSONException -> 0x0176 }
            r11.put(r7, r13)     // Catch:{ JSONException -> 0x0176 }
            android.content.ContentValues r11 = r1.f18505p     // Catch:{ JSONException -> 0x0176 }
            int r13 = r14.getInt(r6)     // Catch:{ JSONException -> 0x0176 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ JSONException -> 0x0176 }
            r11.put(r6, r13)     // Catch:{ JSONException -> 0x0176 }
            android.content.ContentValues r11 = r1.f18505p     // Catch:{ JSONException -> 0x0176 }
            double r20 = r14.getDouble(r5)     // Catch:{ JSONException -> 0x0176 }
            java.lang.Double r13 = java.lang.Double.valueOf(r20)     // Catch:{ JSONException -> 0x0176 }
            r11.put(r5, r13)     // Catch:{ JSONException -> 0x0176 }
            android.content.ContentValues r11 = r1.f18505p     // Catch:{ JSONException -> 0x0176 }
            double r20 = r14.getDouble(r4)     // Catch:{ JSONException -> 0x0176 }
            java.lang.Double r13 = java.lang.Double.valueOf(r20)     // Catch:{ JSONException -> 0x0176 }
            r11.put(r4, r13)     // Catch:{ JSONException -> 0x0176 }
            android.content.ContentValues r11 = r1.f18505p     // Catch:{ JSONException -> 0x0176 }
            int r13 = r14.getInt(r3)     // Catch:{ JSONException -> 0x0176 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ JSONException -> 0x0176 }
            r11.put(r3, r13)     // Catch:{ JSONException -> 0x0176 }
            android.content.ContentValues r11 = r1.f18505p     // Catch:{ JSONException -> 0x0176 }
            java.lang.String r13 = r14.getString(r2)     // Catch:{ JSONException -> 0x0176 }
            r11.put(r2, r13)     // Catch:{ JSONException -> 0x0176 }
            android.content.ContentValues r11 = r1.f18505p     // Catch:{ JSONException -> 0x0176 }
            int r13 = r14.getInt(r0)     // Catch:{ JSONException -> 0x0176 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ JSONException -> 0x0176 }
            r11.put(r0, r13)     // Catch:{ JSONException -> 0x0176 }
            android.content.ContentValues r11 = r1.f18505p     // Catch:{ JSONException -> 0x0176 }
            java.lang.String r13 = r14.getString(r12)     // Catch:{ JSONException -> 0x0176 }
            r11.put(r12, r13)     // Catch:{ JSONException -> 0x0176 }
            i.a.a.a.a r11 = r1.f18504o     // Catch:{ JSONException -> 0x0176 }
            android.content.ContentValues r13 = r1.f18505p     // Catch:{ JSONException -> 0x0176 }
            r11.mo17170a((android.content.ContentValues) r13)     // Catch:{ JSONException -> 0x0176 }
            r14 = r23
            r13 = r16
            goto L_0x0123
        L_0x0118:
            java.lang.String r11 = r14.getString(r13)     // Catch:{ JSONException -> 0x0176 }
            r13 = r16
            r13.add(r11)     // Catch:{ JSONException -> 0x0176 }
            r14 = r23
        L_0x0123:
            r11 = r19
            int r15 = r11.compareTo(r14)     // Catch:{ JSONException -> 0x0176 }
            if (r15 <= 0) goto L_0x012c
            r14 = r11
        L_0x012c:
            int r11 = r18 + 1
            r15 = r13
            r23 = r14
            r13 = r11
            r11 = r17
            goto L_0x0063
        L_0x0136:
            r14 = r23
            r13 = r16
            i.a.a.a.a r0 = r1.f18504o     // Catch:{ JSONException -> 0x0176 }
            r0.mo17173b()     // Catch:{ JSONException -> 0x0176 }
            i.a.a.a.a r0 = r1.f18504o     // Catch:{ JSONException -> 0x0176 }
            r0.mo17096b((java.util.ArrayList<java.lang.String>) r13)     // Catch:{ JSONException -> 0x0176 }
            boolean r0 = r14.isEmpty()     // Catch:{ JSONException -> 0x0176 }
            if (r0 != 0) goto L_0x014f
            android.app.Activity r0 = r1.f18614a     // Catch:{ JSONException -> 0x0176 }
            p267i.p268a.p269a.p270a.C6667g.m25361d(r0, r14)     // Catch:{ JSONException -> 0x0176 }
        L_0x014f:
            r0 = 1
            r1.f18616c = r0     // Catch:{ JSONException -> 0x0176 }
            goto L_0x016a
        L_0x0153:
            r0 = 310303(0x4bc1f, float:4.34827E-40)
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ JSONException -> 0x0176 }
            r1.f18617d = r0     // Catch:{ JSONException -> 0x0176 }
            android.app.Activity r0 = r1.f18614a     // Catch:{ JSONException -> 0x0176 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ JSONException -> 0x0176 }
            int r2 = p267i.p268a.p269a.C6689e.dialog_parse_json_failed_msg     // Catch:{ JSONException -> 0x0176 }
            java.lang.String r0 = r0.getString(r2)     // Catch:{ JSONException -> 0x0176 }
            r1.f18618e = r0     // Catch:{ JSONException -> 0x0176 }
        L_0x016a:
            i.a.a.a.a r0 = r1.f18504o
            if (r0 == 0) goto L_0x0171
            r0.mo17175c()
        L_0x0171:
            if (r24 == 0) goto L_0x019d
            goto L_0x0196
        L_0x0174:
            r0 = move-exception
            goto L_0x01a1
        L_0x0176:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x0174 }
            r0 = 310302(0x4bc1e, float:4.34826E-40)
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0174 }
            r1.f18617d = r0     // Catch:{ all -> 0x0174 }
            android.app.Activity r0 = r1.f18614a     // Catch:{ all -> 0x0174 }
            int r2 = p267i.p268a.p269a.C6689e.dialog_parse_json_failed_msg     // Catch:{ all -> 0x0174 }
            java.lang.String r0 = r0.getString(r2)     // Catch:{ all -> 0x0174 }
            r1.f18618e = r0     // Catch:{ all -> 0x0174 }
            i.a.a.a.a r0 = r1.f18504o
            if (r0 == 0) goto L_0x0194
            r0.mo17175c()
        L_0x0194:
            if (r24 == 0) goto L_0x019d
        L_0x0196:
            okhttp3.ResponseBody r0 = r24.body()
            r0.close()
        L_0x019d:
            r22.mo17154a()
            return
        L_0x01a1:
            i.a.a.a.a r2 = r1.f18504o
            if (r2 == 0) goto L_0x01a8
            r2.mo17175c()
        L_0x01a8:
            if (r24 == 0) goto L_0x01b1
            okhttp3.ResponseBody r2 = r24.body()
            r2.close()
        L_0x01b1:
            r22.mo17154a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p267i.p268a.p269a.p271b.p272a.C6671b.onResponse(okhttp3.Call, okhttp3.Response):void");
    }
}
