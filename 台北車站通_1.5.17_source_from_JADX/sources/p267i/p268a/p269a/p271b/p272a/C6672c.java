package p267i.p268a.p269a.p271b.p272a;

import android.app.Activity;
import p267i.p274b.p277b.p278a.p279a.C6705b;

/* renamed from: i.a.a.b.a.c */
public class C6672c extends C6670a {

    /* renamed from: q */
    private final String f18516q = "name";

    /* renamed from: r */
    private final String f18517r = "name_zh_cht";

    /* renamed from: s */
    private final String f18518s = SVGParser.XML_STYLESHEET_ATTR_TYPE;

    /* renamed from: t */
    private final String f18519t = "ori_x";

    /* renamed from: u */
    private final String f18520u = "ori_y";

    /* renamed from: v */
    private final String f18521v = "lat";

    /* renamed from: w */
    private final String f18522w = "lng";

    /* renamed from: x */
    private final String f18523x = "map_id";

    /* renamed from: y */
    private final String f18524y = "rid";

    public C6672c(Activity activity, C6705b bVar) {
        super(activity, bVar, 310701);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0160, code lost:
        if (r21 != null) goto L_0x0185;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0183, code lost:
        if (r21 != null) goto L_0x0185;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0185, code lost:
        r21.body().close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x018c, code lost:
        mo17154a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x018f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResponse(okhttp3.Call r20, okhttp3.Response r21) {
        /*
            r19 = this;
            r1 = r19
            java.lang.String r0 = "rid"
            java.lang.String r2 = "map_id"
            java.lang.String r3 = "lng"
            java.lang.String r4 = "lat"
            java.lang.String r5 = "ori_y"
            java.lang.String r6 = "ori_x"
            java.lang.String r7 = "type"
            java.lang.String r8 = "name_zh_cht"
            java.lang.String r9 = "name"
            java.lang.String r10 = "success"
            java.lang.String r11 = "updated_at"
            int r12 = r21.code()
            boolean r12 = super.mo17124a(r12)
            if (r12 == 0) goto L_0x0023
            return
        L_0x0023:
            java.lang.String r12 = ""
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0165 }
            okhttp3.ResponseBody r14 = r21.body()     // Catch:{ JSONException -> 0x0165 }
            java.lang.String r14 = r14.string()     // Catch:{ JSONException -> 0x0165 }
            r13.<init>(r14)     // Catch:{ JSONException -> 0x0165 }
            boolean r14 = r13.has(r10)     // Catch:{ JSONException -> 0x0165 }
            if (r14 == 0) goto L_0x0142
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0165 }
            r14.<init>()     // Catch:{ JSONException -> 0x0165 }
            org.json.JSONObject r10 = r13.getJSONObject(r10)     // Catch:{ JSONException -> 0x0165 }
            java.lang.String r13 = "results"
            org.json.JSONArray r10 = r10.getJSONArray(r13)     // Catch:{ JSONException -> 0x0165 }
            i.a.a.a.a r13 = new i.a.a.a.a     // Catch:{ JSONException -> 0x0165 }
            android.app.Activity r15 = r1.f18614a     // Catch:{ JSONException -> 0x0165 }
            r13.<init>(r15)     // Catch:{ JSONException -> 0x0165 }
            r1.f18504o = r13     // Catch:{ JSONException -> 0x0165 }
            i.a.a.a.a r13 = r1.f18504o     // Catch:{ JSONException -> 0x0165 }
            java.lang.String r15 = "Facility"
            r13.mo17095b((java.lang.String) r15)     // Catch:{ JSONException -> 0x0165 }
            android.content.ContentValues r13 = new android.content.ContentValues     // Catch:{ JSONException -> 0x0165 }
            r13.<init>()     // Catch:{ JSONException -> 0x0165 }
            r1.f18505p = r13     // Catch:{ JSONException -> 0x0165 }
            r13 = 0
        L_0x005f:
            int r15 = r10.length()     // Catch:{ JSONException -> 0x0165 }
            r20 = r12
            if (r13 >= r15) goto L_0x0127
            org.json.JSONObject r15 = r10.getJSONObject(r13)     // Catch:{ JSONException -> 0x0165 }
            java.lang.String r12 = r15.getString(r11)     // Catch:{ JSONException -> 0x0165 }
            r16 = r10
            java.lang.String r10 = "deleted"
            int r10 = r15.getInt(r10)     // Catch:{ JSONException -> 0x0165 }
            r17 = r13
            java.lang.String r13 = "id"
            r18 = r12
            r12 = 1
            if (r10 == r12) goto L_0x010f
            android.content.ContentValues r10 = r1.f18505p     // Catch:{ JSONException -> 0x0165 }
            int r12 = r15.getInt(r13)     // Catch:{ JSONException -> 0x0165 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ JSONException -> 0x0165 }
            r10.put(r13, r12)     // Catch:{ JSONException -> 0x0165 }
            java.lang.String r10 = r15.getString(r9)     // Catch:{ JSONException -> 0x0165 }
            android.content.ContentValues r12 = r1.f18505p     // Catch:{ JSONException -> 0x0165 }
            i.a.a.a.a r13 = r1.f18504o     // Catch:{ JSONException -> 0x0165 }
            java.lang.String r10 = r13.mo17097c((java.lang.String) r10)     // Catch:{ JSONException -> 0x0165 }
            r12.put(r9, r10)     // Catch:{ JSONException -> 0x0165 }
            java.lang.String r10 = r15.getString(r8)     // Catch:{ JSONException -> 0x0165 }
            android.content.ContentValues r12 = r1.f18505p     // Catch:{ JSONException -> 0x0165 }
            i.a.a.a.a r13 = r1.f18504o     // Catch:{ JSONException -> 0x0165 }
            java.lang.String r10 = r13.mo17097c((java.lang.String) r10)     // Catch:{ JSONException -> 0x0165 }
            r12.put(r8, r10)     // Catch:{ JSONException -> 0x0165 }
            android.content.ContentValues r10 = r1.f18505p     // Catch:{ JSONException -> 0x0165 }
            java.lang.String r12 = r15.getString(r7)     // Catch:{ JSONException -> 0x0165 }
            r10.put(r7, r12)     // Catch:{ JSONException -> 0x0165 }
            android.content.ContentValues r10 = r1.f18505p     // Catch:{ JSONException -> 0x0165 }
            double r12 = r15.getDouble(r6)     // Catch:{ JSONException -> 0x0165 }
            java.lang.Double r12 = java.lang.Double.valueOf(r12)     // Catch:{ JSONException -> 0x0165 }
            r10.put(r6, r12)     // Catch:{ JSONException -> 0x0165 }
            android.content.ContentValues r10 = r1.f18505p     // Catch:{ JSONException -> 0x0165 }
            double r12 = r15.getDouble(r5)     // Catch:{ JSONException -> 0x0165 }
            java.lang.Double r12 = java.lang.Double.valueOf(r12)     // Catch:{ JSONException -> 0x0165 }
            r10.put(r5, r12)     // Catch:{ JSONException -> 0x0165 }
            android.content.ContentValues r10 = r1.f18505p     // Catch:{ JSONException -> 0x0165 }
            double r12 = r15.getDouble(r4)     // Catch:{ JSONException -> 0x0165 }
            java.lang.Double r12 = java.lang.Double.valueOf(r12)     // Catch:{ JSONException -> 0x0165 }
            r10.put(r4, r12)     // Catch:{ JSONException -> 0x0165 }
            android.content.ContentValues r10 = r1.f18505p     // Catch:{ JSONException -> 0x0165 }
            double r12 = r15.getDouble(r3)     // Catch:{ JSONException -> 0x0165 }
            java.lang.Double r12 = java.lang.Double.valueOf(r12)     // Catch:{ JSONException -> 0x0165 }
            r10.put(r3, r12)     // Catch:{ JSONException -> 0x0165 }
            android.content.ContentValues r10 = r1.f18505p     // Catch:{ JSONException -> 0x0165 }
            int r12 = r15.getInt(r2)     // Catch:{ JSONException -> 0x0165 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ JSONException -> 0x0165 }
            r10.put(r2, r12)     // Catch:{ JSONException -> 0x0165 }
            android.content.ContentValues r10 = r1.f18505p     // Catch:{ JSONException -> 0x0165 }
            java.lang.String r12 = r15.getString(r11)     // Catch:{ JSONException -> 0x0165 }
            r10.put(r11, r12)     // Catch:{ JSONException -> 0x0165 }
            android.content.ContentValues r10 = r1.f18505p     // Catch:{ JSONException -> 0x0165 }
            java.lang.String r12 = r15.getString(r0)     // Catch:{ JSONException -> 0x0165 }
            r10.put(r0, r12)     // Catch:{ JSONException -> 0x0165 }
            i.a.a.a.a r10 = r1.f18504o     // Catch:{ JSONException -> 0x0165 }
            android.content.ContentValues r12 = r1.f18505p     // Catch:{ JSONException -> 0x0165 }
            r10.mo17170a((android.content.ContentValues) r12)     // Catch:{ JSONException -> 0x0165 }
            goto L_0x0116
        L_0x010f:
            java.lang.String r10 = r15.getString(r13)     // Catch:{ JSONException -> 0x0165 }
            r14.add(r10)     // Catch:{ JSONException -> 0x0165 }
        L_0x0116:
            r12 = r20
            r10 = r18
            int r13 = r10.compareTo(r12)     // Catch:{ JSONException -> 0x0165 }
            if (r13 <= 0) goto L_0x0121
            r12 = r10
        L_0x0121:
            int r13 = r17 + 1
            r10 = r16
            goto L_0x005f
        L_0x0127:
            r12 = r20
            i.a.a.a.a r0 = r1.f18504o     // Catch:{ JSONException -> 0x0165 }
            r0.mo17173b()     // Catch:{ JSONException -> 0x0165 }
            i.a.a.a.a r0 = r1.f18504o     // Catch:{ JSONException -> 0x0165 }
            r0.mo17104f(r14)     // Catch:{ JSONException -> 0x0165 }
            boolean r0 = r12.isEmpty()     // Catch:{ JSONException -> 0x0165 }
            if (r0 != 0) goto L_0x013e
            android.app.Activity r0 = r1.f18614a     // Catch:{ JSONException -> 0x0165 }
            p267i.p268a.p269a.p270a.C6667g.m25369h(r0, r12)     // Catch:{ JSONException -> 0x0165 }
        L_0x013e:
            r0 = 1
            r1.f18616c = r0     // Catch:{ JSONException -> 0x0165 }
            goto L_0x0159
        L_0x0142:
            r0 = 310703(0x4bdaf, float:4.35388E-40)
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ JSONException -> 0x0165 }
            r1.f18617d = r0     // Catch:{ JSONException -> 0x0165 }
            android.app.Activity r0 = r1.f18614a     // Catch:{ JSONException -> 0x0165 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ JSONException -> 0x0165 }
            int r2 = p267i.p268a.p269a.C6689e.dialog_parse_json_failed_msg     // Catch:{ JSONException -> 0x0165 }
            java.lang.String r0 = r0.getString(r2)     // Catch:{ JSONException -> 0x0165 }
            r1.f18618e = r0     // Catch:{ JSONException -> 0x0165 }
        L_0x0159:
            i.a.a.a.a r0 = r1.f18504o
            if (r0 == 0) goto L_0x0160
            r0.mo17175c()
        L_0x0160:
            if (r21 == 0) goto L_0x018c
            goto L_0x0185
        L_0x0163:
            r0 = move-exception
            goto L_0x0190
        L_0x0165:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x0163 }
            r0 = 310702(0x4bdae, float:4.35386E-40)
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0163 }
            r1.f18617d = r0     // Catch:{ all -> 0x0163 }
            android.app.Activity r0 = r1.f18614a     // Catch:{ all -> 0x0163 }
            int r2 = p267i.p268a.p269a.C6689e.dialog_parse_json_failed_msg     // Catch:{ all -> 0x0163 }
            java.lang.String r0 = r0.getString(r2)     // Catch:{ all -> 0x0163 }
            r1.f18618e = r0     // Catch:{ all -> 0x0163 }
            i.a.a.a.a r0 = r1.f18504o
            if (r0 == 0) goto L_0x0183
            r0.mo17175c()
        L_0x0183:
            if (r21 == 0) goto L_0x018c
        L_0x0185:
            okhttp3.ResponseBody r0 = r21.body()
            r0.close()
        L_0x018c:
            r19.mo17154a()
            return
        L_0x0190:
            i.a.a.a.a r2 = r1.f18504o
            if (r2 == 0) goto L_0x0197
            r2.mo17175c()
        L_0x0197:
            if (r21 == 0) goto L_0x01a0
            okhttp3.ResponseBody r2 = r21.body()
            r2.close()
        L_0x01a0:
            r19.mo17154a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p267i.p268a.p269a.p271b.p272a.C6672c.onResponse(okhttp3.Call, okhttp3.Response):void");
    }
}
