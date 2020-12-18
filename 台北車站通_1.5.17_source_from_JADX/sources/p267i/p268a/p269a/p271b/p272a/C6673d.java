package p267i.p268a.p269a.p271b.p272a;

import android.app.Activity;
import p267i.p274b.p277b.p278a.p279a.C6705b;

/* renamed from: i.a.a.b.a.d */
public class C6673d extends C6670a {

    /* renamed from: q */
    private final String f18525q = "is_default";

    /* renamed from: r */
    private final String f18526r = "info";

    /* renamed from: s */
    private final String f18527s = "info_zh_cht";

    /* renamed from: t */
    private final String f18528t = "img_url";

    /* renamed from: u */
    private final String f18529u = "img_url_zh_cht";

    /* renamed from: v */
    private final String f18530v = "img_type";

    /* renamed from: w */
    private final String f18531w = "azimuth";

    /* renamed from: x */
    private final String f18532x = "scale";

    /* renamed from: y */
    private final String f18533y = "env_android";

    /* renamed from: z */
    private final String f18534z = "rid";

    public C6673d(Activity activity, C6705b bVar) {
        super(activity, bVar, 310201);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0175, code lost:
        if (r22 != null) goto L_0x019a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0198, code lost:
        if (r22 != null) goto L_0x019a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x019a, code lost:
        r22.body().close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x01a1, code lost:
        mo17154a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x01a4, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResponse(okhttp3.Call r21, okhttp3.Response r22) {
        /*
            r20 = this;
            r1 = r20
            java.lang.String r0 = "rid"
            java.lang.String r2 = "env_android"
            java.lang.String r3 = "scale"
            java.lang.String r4 = "azimuth"
            java.lang.String r5 = "img_type"
            java.lang.String r6 = "img_url_zh_cht"
            java.lang.String r7 = "img_url"
            java.lang.String r8 = "info_zh_cht"
            java.lang.String r9 = "info"
            java.lang.String r10 = "is_default"
            java.lang.String r11 = "updated_at"
            java.lang.String r12 = "success"
            int r13 = r22.code()
            boolean r13 = super.mo17124a(r13)
            if (r13 == 0) goto L_0x0025
            return
        L_0x0025:
            java.lang.String r13 = ""
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ JSONException -> 0x017a }
            okhttp3.ResponseBody r15 = r22.body()     // Catch:{ JSONException -> 0x017a }
            java.lang.String r15 = r15.string()     // Catch:{ JSONException -> 0x017a }
            r14.<init>(r15)     // Catch:{ JSONException -> 0x017a }
            boolean r15 = r14.has(r12)     // Catch:{ JSONException -> 0x017a }
            if (r15 == 0) goto L_0x0157
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ JSONException -> 0x017a }
            r15.<init>()     // Catch:{ JSONException -> 0x017a }
            org.json.JSONObject r12 = r14.getJSONObject(r12)     // Catch:{ JSONException -> 0x017a }
            java.lang.String r14 = "results"
            org.json.JSONArray r12 = r12.getJSONArray(r14)     // Catch:{ JSONException -> 0x017a }
            i.a.a.a.a r14 = new i.a.a.a.a     // Catch:{ JSONException -> 0x017a }
            r21 = r13
            android.app.Activity r13 = r1.f18614a     // Catch:{ JSONException -> 0x017a }
            r14.<init>(r13)     // Catch:{ JSONException -> 0x017a }
            r1.f18504o = r14     // Catch:{ JSONException -> 0x017a }
            i.a.a.a.a r13 = r1.f18504o     // Catch:{ JSONException -> 0x017a }
            java.lang.String r14 = "Map"
            r13.mo17095b((java.lang.String) r14)     // Catch:{ JSONException -> 0x017a }
            android.content.ContentValues r13 = new android.content.ContentValues     // Catch:{ JSONException -> 0x017a }
            r13.<init>()     // Catch:{ JSONException -> 0x017a }
            r1.f18505p = r13     // Catch:{ JSONException -> 0x017a }
            r13 = 0
        L_0x0063:
            int r14 = r12.length()     // Catch:{ JSONException -> 0x017a }
            r16 = r15
            if (r13 >= r14) goto L_0x013a
            org.json.JSONObject r14 = r12.getJSONObject(r13)     // Catch:{ JSONException -> 0x017a }
            java.lang.String r15 = r14.getString(r11)     // Catch:{ JSONException -> 0x017a }
            r17 = r12
            java.lang.String r12 = "deleted"
            int r12 = r14.getInt(r12)     // Catch:{ JSONException -> 0x017a }
            r18 = r13
            java.lang.String r13 = "id"
            r19 = r0
            r0 = 1
            if (r12 == r0) goto L_0x011a
            android.content.ContentValues r0 = r1.f18505p     // Catch:{ JSONException -> 0x017a }
            int r12 = r14.getInt(r13)     // Catch:{ JSONException -> 0x017a }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ JSONException -> 0x017a }
            r0.put(r13, r12)     // Catch:{ JSONException -> 0x017a }
            android.content.ContentValues r0 = r1.f18505p     // Catch:{ JSONException -> 0x017a }
            int r12 = r14.getInt(r10)     // Catch:{ JSONException -> 0x017a }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ JSONException -> 0x017a }
            r0.put(r10, r12)     // Catch:{ JSONException -> 0x017a }
            java.lang.String r0 = r14.getString(r9)     // Catch:{ JSONException -> 0x017a }
            android.content.ContentValues r12 = r1.f18505p     // Catch:{ JSONException -> 0x017a }
            i.a.a.a.a r13 = r1.f18504o     // Catch:{ JSONException -> 0x017a }
            java.lang.String r0 = r13.mo17097c((java.lang.String) r0)     // Catch:{ JSONException -> 0x017a }
            r12.put(r9, r0)     // Catch:{ JSONException -> 0x017a }
            java.lang.String r0 = r14.getString(r8)     // Catch:{ JSONException -> 0x017a }
            android.content.ContentValues r12 = r1.f18505p     // Catch:{ JSONException -> 0x017a }
            i.a.a.a.a r13 = r1.f18504o     // Catch:{ JSONException -> 0x017a }
            java.lang.String r0 = r13.mo17097c((java.lang.String) r0)     // Catch:{ JSONException -> 0x017a }
            r12.put(r8, r0)     // Catch:{ JSONException -> 0x017a }
            android.content.ContentValues r0 = r1.f18505p     // Catch:{ JSONException -> 0x017a }
            java.lang.String r12 = r14.getString(r7)     // Catch:{ JSONException -> 0x017a }
            r0.put(r7, r12)     // Catch:{ JSONException -> 0x017a }
            android.content.ContentValues r0 = r1.f18505p     // Catch:{ JSONException -> 0x017a }
            java.lang.String r12 = r14.getString(r6)     // Catch:{ JSONException -> 0x017a }
            r0.put(r6, r12)     // Catch:{ JSONException -> 0x017a }
            android.content.ContentValues r0 = r1.f18505p     // Catch:{ JSONException -> 0x017a }
            java.lang.String r12 = r14.getString(r5)     // Catch:{ JSONException -> 0x017a }
            r0.put(r5, r12)     // Catch:{ JSONException -> 0x017a }
            android.content.ContentValues r0 = r1.f18505p     // Catch:{ JSONException -> 0x017a }
            double r12 = r14.getDouble(r4)     // Catch:{ JSONException -> 0x017a }
            java.lang.Double r12 = java.lang.Double.valueOf(r12)     // Catch:{ JSONException -> 0x017a }
            r0.put(r4, r12)     // Catch:{ JSONException -> 0x017a }
            android.content.ContentValues r0 = r1.f18505p     // Catch:{ JSONException -> 0x017a }
            double r12 = r14.getDouble(r3)     // Catch:{ JSONException -> 0x017a }
            java.lang.Double r12 = java.lang.Double.valueOf(r12)     // Catch:{ JSONException -> 0x017a }
            r0.put(r3, r12)     // Catch:{ JSONException -> 0x017a }
            android.content.ContentValues r0 = r1.f18505p     // Catch:{ JSONException -> 0x017a }
            int r12 = r14.getInt(r2)     // Catch:{ JSONException -> 0x017a }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ JSONException -> 0x017a }
            r0.put(r2, r12)     // Catch:{ JSONException -> 0x017a }
            android.content.ContentValues r0 = r1.f18505p     // Catch:{ JSONException -> 0x017a }
            r0.put(r11, r15)     // Catch:{ JSONException -> 0x017a }
            android.content.ContentValues r0 = r1.f18505p     // Catch:{ JSONException -> 0x017a }
            r12 = r19
            java.lang.String r13 = r14.getString(r12)     // Catch:{ JSONException -> 0x017a }
            r0.put(r12, r13)     // Catch:{ JSONException -> 0x017a }
            i.a.a.a.a r0 = r1.f18504o     // Catch:{ JSONException -> 0x017a }
            android.content.ContentValues r13 = r1.f18505p     // Catch:{ JSONException -> 0x017a }
            r0.mo17170a((android.content.ContentValues) r13)     // Catch:{ JSONException -> 0x017a }
            r0 = r21
            r13 = r16
            goto L_0x0127
        L_0x011a:
            r12 = r19
            java.lang.String r0 = r14.getString(r13)     // Catch:{ JSONException -> 0x017a }
            r13 = r16
            r13.add(r0)     // Catch:{ JSONException -> 0x017a }
            r0 = r21
        L_0x0127:
            int r14 = r15.compareTo(r0)     // Catch:{ JSONException -> 0x017a }
            if (r14 <= 0) goto L_0x012e
            goto L_0x012f
        L_0x012e:
            r15 = r0
        L_0x012f:
            int r0 = r18 + 1
            r21 = r15
            r15 = r13
            r13 = r0
            r0 = r12
            r12 = r17
            goto L_0x0063
        L_0x013a:
            r0 = r21
            r13 = r16
            i.a.a.a.a r2 = r1.f18504o     // Catch:{ JSONException -> 0x017a }
            r2.mo17173b()     // Catch:{ JSONException -> 0x017a }
            i.a.a.a.a r2 = r1.f18504o     // Catch:{ JSONException -> 0x017a }
            r2.mo17094a(r13)     // Catch:{ JSONException -> 0x017a }
            boolean r2 = r0.isEmpty()     // Catch:{ JSONException -> 0x017a }
            if (r2 != 0) goto L_0x0153
            android.app.Activity r2 = r1.f18614a     // Catch:{ JSONException -> 0x017a }
            p267i.p268a.p269a.p270a.C6667g.m25359c(r2, r0)     // Catch:{ JSONException -> 0x017a }
        L_0x0153:
            r0 = 1
            r1.f18616c = r0     // Catch:{ JSONException -> 0x017a }
            goto L_0x016e
        L_0x0157:
            r0 = 310203(0x4bbbb, float:4.34687E-40)
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ JSONException -> 0x017a }
            r1.f18617d = r0     // Catch:{ JSONException -> 0x017a }
            android.app.Activity r0 = r1.f18614a     // Catch:{ JSONException -> 0x017a }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ JSONException -> 0x017a }
            int r2 = p267i.p268a.p269a.C6689e.dialog_parse_json_failed_msg     // Catch:{ JSONException -> 0x017a }
            java.lang.String r0 = r0.getString(r2)     // Catch:{ JSONException -> 0x017a }
            r1.f18618e = r0     // Catch:{ JSONException -> 0x017a }
        L_0x016e:
            i.a.a.a.a r0 = r1.f18504o
            if (r0 == 0) goto L_0x0175
            r0.mo17175c()
        L_0x0175:
            if (r22 == 0) goto L_0x01a1
            goto L_0x019a
        L_0x0178:
            r0 = move-exception
            goto L_0x01a5
        L_0x017a:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x0178 }
            r0 = 310202(0x4bbba, float:4.34686E-40)
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0178 }
            r1.f18617d = r0     // Catch:{ all -> 0x0178 }
            android.app.Activity r0 = r1.f18614a     // Catch:{ all -> 0x0178 }
            int r2 = p267i.p268a.p269a.C6689e.dialog_parse_json_failed_msg     // Catch:{ all -> 0x0178 }
            java.lang.String r0 = r0.getString(r2)     // Catch:{ all -> 0x0178 }
            r1.f18618e = r0     // Catch:{ all -> 0x0178 }
            i.a.a.a.a r0 = r1.f18504o
            if (r0 == 0) goto L_0x0198
            r0.mo17175c()
        L_0x0198:
            if (r22 == 0) goto L_0x01a1
        L_0x019a:
            okhttp3.ResponseBody r0 = r22.body()
            r0.close()
        L_0x01a1:
            r20.mo17154a()
            return
        L_0x01a5:
            i.a.a.a.a r2 = r1.f18504o
            if (r2 == 0) goto L_0x01ac
            r2.mo17175c()
        L_0x01ac:
            if (r22 == 0) goto L_0x01b5
            okhttp3.ResponseBody r2 = r22.body()
            r2.close()
        L_0x01b5:
            r20.mo17154a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p267i.p268a.p269a.p271b.p272a.C6673d.onResponse(okhttp3.Call, okhttp3.Response):void");
    }
}
