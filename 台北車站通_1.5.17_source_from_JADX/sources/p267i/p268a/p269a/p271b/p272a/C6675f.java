package p267i.p268a.p269a.p271b.p272a;

import android.app.Activity;
import p267i.p274b.p277b.p278a.p279a.C6705b;

/* renamed from: i.a.a.b.a.f */
public class C6675f extends C6670a {

    /* renamed from: q */
    private final String f18540q = SVGParser.XML_STYLESHEET_ATTR_TYPE;

    /* renamed from: r */
    private final String f18541r = "ori_x";

    /* renamed from: s */
    private final String f18542s = "ori_y";

    /* renamed from: t */
    private final String f18543t = "map_id";

    /* renamed from: u */
    private final String f18544u = "area";

    public C6675f(Activity activity, C6705b bVar) {
        super(activity, bVar, 310401);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x010f, code lost:
        if (r18 != null) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0132, code lost:
        if (r18 != null) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0134, code lost:
        r18.body().close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x013b, code lost:
        mo17154a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x013e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResponse(okhttp3.Call r17, okhttp3.Response r18) {
        /*
            r16 = this;
            r1 = r16
            java.lang.String r0 = "area"
            java.lang.String r2 = "map_id"
            java.lang.String r3 = "ori_y"
            java.lang.String r4 = "ori_x"
            java.lang.String r5 = "type"
            java.lang.String r6 = "success"
            java.lang.String r7 = "updated_at"
            int r8 = r18.code()
            boolean r8 = super.mo17124a(r8)
            if (r8 == 0) goto L_0x001b
            return
        L_0x001b:
            java.lang.String r8 = ""
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0114 }
            okhttp3.ResponseBody r10 = r18.body()     // Catch:{ JSONException -> 0x0114 }
            java.lang.String r10 = r10.string()     // Catch:{ JSONException -> 0x0114 }
            r9.<init>(r10)     // Catch:{ JSONException -> 0x0114 }
            boolean r10 = r9.has(r6)     // Catch:{ JSONException -> 0x0114 }
            if (r10 == 0) goto L_0x00f1
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0114 }
            r10.<init>()     // Catch:{ JSONException -> 0x0114 }
            org.json.JSONObject r6 = r9.getJSONObject(r6)     // Catch:{ JSONException -> 0x0114 }
            java.lang.String r9 = "results"
            org.json.JSONArray r6 = r6.getJSONArray(r9)     // Catch:{ JSONException -> 0x0114 }
            i.a.a.a.a r9 = new i.a.a.a.a     // Catch:{ JSONException -> 0x0114 }
            android.app.Activity r11 = r1.f18614a     // Catch:{ JSONException -> 0x0114 }
            r9.<init>(r11)     // Catch:{ JSONException -> 0x0114 }
            r1.f18504o = r9     // Catch:{ JSONException -> 0x0114 }
            i.a.a.a.a r9 = r1.f18504o     // Catch:{ JSONException -> 0x0114 }
            java.lang.String r11 = "Node"
            r9.mo17095b((java.lang.String) r11)     // Catch:{ JSONException -> 0x0114 }
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ JSONException -> 0x0114 }
            r9.<init>()     // Catch:{ JSONException -> 0x0114 }
            r1.f18505p = r9     // Catch:{ JSONException -> 0x0114 }
            r9 = 0
        L_0x0057:
            int r11 = r6.length()     // Catch:{ JSONException -> 0x0114 }
            r12 = 1
            if (r9 >= r11) goto L_0x00d9
            org.json.JSONObject r11 = r6.getJSONObject(r9)     // Catch:{ JSONException -> 0x0114 }
            java.lang.String r13 = r11.getString(r7)     // Catch:{ JSONException -> 0x0114 }
            java.lang.String r14 = "deleted"
            int r14 = r11.getInt(r14)     // Catch:{ JSONException -> 0x0114 }
            java.lang.String r15 = "id"
            if (r14 == r12) goto L_0x00c7
            android.content.ContentValues r12 = r1.f18505p     // Catch:{ JSONException -> 0x0114 }
            int r14 = r11.getInt(r15)     // Catch:{ JSONException -> 0x0114 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ JSONException -> 0x0114 }
            r12.put(r15, r14)     // Catch:{ JSONException -> 0x0114 }
            android.content.ContentValues r12 = r1.f18505p     // Catch:{ JSONException -> 0x0114 }
            java.lang.String r14 = r11.getString(r5)     // Catch:{ JSONException -> 0x0114 }
            r12.put(r5, r14)     // Catch:{ JSONException -> 0x0114 }
            android.content.ContentValues r12 = r1.f18505p     // Catch:{ JSONException -> 0x0114 }
            double r14 = r11.getDouble(r4)     // Catch:{ JSONException -> 0x0114 }
            java.lang.Double r14 = java.lang.Double.valueOf(r14)     // Catch:{ JSONException -> 0x0114 }
            r12.put(r4, r14)     // Catch:{ JSONException -> 0x0114 }
            android.content.ContentValues r12 = r1.f18505p     // Catch:{ JSONException -> 0x0114 }
            double r14 = r11.getDouble(r3)     // Catch:{ JSONException -> 0x0114 }
            java.lang.Double r14 = java.lang.Double.valueOf(r14)     // Catch:{ JSONException -> 0x0114 }
            r12.put(r3, r14)     // Catch:{ JSONException -> 0x0114 }
            android.content.ContentValues r12 = r1.f18505p     // Catch:{ JSONException -> 0x0114 }
            int r14 = r11.getInt(r2)     // Catch:{ JSONException -> 0x0114 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ JSONException -> 0x0114 }
            r12.put(r2, r14)     // Catch:{ JSONException -> 0x0114 }
            android.content.ContentValues r12 = r1.f18505p     // Catch:{ JSONException -> 0x0114 }
            java.lang.String r14 = r11.getString(r7)     // Catch:{ JSONException -> 0x0114 }
            r12.put(r7, r14)     // Catch:{ JSONException -> 0x0114 }
            android.content.ContentValues r12 = r1.f18505p     // Catch:{ JSONException -> 0x0114 }
            java.lang.String r11 = r11.getString(r0)     // Catch:{ JSONException -> 0x0114 }
            r12.put(r0, r11)     // Catch:{ JSONException -> 0x0114 }
            i.a.a.a.a r11 = r1.f18504o     // Catch:{ JSONException -> 0x0114 }
            android.content.ContentValues r12 = r1.f18505p     // Catch:{ JSONException -> 0x0114 }
            r11.mo17170a((android.content.ContentValues) r12)     // Catch:{ JSONException -> 0x0114 }
            goto L_0x00ce
        L_0x00c7:
            java.lang.String r11 = r11.getString(r15)     // Catch:{ JSONException -> 0x0114 }
            r10.add(r11)     // Catch:{ JSONException -> 0x0114 }
        L_0x00ce:
            int r11 = r13.compareTo(r8)     // Catch:{ JSONException -> 0x0114 }
            if (r11 <= 0) goto L_0x00d5
            r8 = r13
        L_0x00d5:
            int r9 = r9 + 1
            goto L_0x0057
        L_0x00d9:
            i.a.a.a.a r0 = r1.f18504o     // Catch:{ JSONException -> 0x0114 }
            r0.mo17173b()     // Catch:{ JSONException -> 0x0114 }
            i.a.a.a.a r0 = r1.f18504o     // Catch:{ JSONException -> 0x0114 }
            r0.mo17098c((java.util.ArrayList<java.lang.String>) r10)     // Catch:{ JSONException -> 0x0114 }
            boolean r0 = r8.isEmpty()     // Catch:{ JSONException -> 0x0114 }
            if (r0 != 0) goto L_0x00ee
            android.app.Activity r0 = r1.f18614a     // Catch:{ JSONException -> 0x0114 }
            p267i.p268a.p269a.p270a.C6667g.m25363e(r0, r8)     // Catch:{ JSONException -> 0x0114 }
        L_0x00ee:
            r1.f18616c = r12     // Catch:{ JSONException -> 0x0114 }
            goto L_0x0108
        L_0x00f1:
            r0 = 310403(0x4bc83, float:4.34967E-40)
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ JSONException -> 0x0114 }
            r1.f18617d = r0     // Catch:{ JSONException -> 0x0114 }
            android.app.Activity r0 = r1.f18614a     // Catch:{ JSONException -> 0x0114 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ JSONException -> 0x0114 }
            int r2 = p267i.p268a.p269a.C6689e.dialog_parse_json_failed_msg     // Catch:{ JSONException -> 0x0114 }
            java.lang.String r0 = r0.getString(r2)     // Catch:{ JSONException -> 0x0114 }
            r1.f18618e = r0     // Catch:{ JSONException -> 0x0114 }
        L_0x0108:
            i.a.a.a.a r0 = r1.f18504o
            if (r0 == 0) goto L_0x010f
            r0.mo17175c()
        L_0x010f:
            if (r18 == 0) goto L_0x013b
            goto L_0x0134
        L_0x0112:
            r0 = move-exception
            goto L_0x013f
        L_0x0114:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x0112 }
            r0 = 310402(0x4bc82, float:4.34966E-40)
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0112 }
            r1.f18617d = r0     // Catch:{ all -> 0x0112 }
            android.app.Activity r0 = r1.f18614a     // Catch:{ all -> 0x0112 }
            int r2 = p267i.p268a.p269a.C6689e.dialog_parse_json_failed_msg     // Catch:{ all -> 0x0112 }
            java.lang.String r0 = r0.getString(r2)     // Catch:{ all -> 0x0112 }
            r1.f18618e = r0     // Catch:{ all -> 0x0112 }
            i.a.a.a.a r0 = r1.f18504o
            if (r0 == 0) goto L_0x0132
            r0.mo17175c()
        L_0x0132:
            if (r18 == 0) goto L_0x013b
        L_0x0134:
            okhttp3.ResponseBody r0 = r18.body()
            r0.close()
        L_0x013b:
            r16.mo17154a()
            return
        L_0x013f:
            i.a.a.a.a r2 = r1.f18504o
            if (r2 == 0) goto L_0x0146
            r2.mo17175c()
        L_0x0146:
            if (r18 == 0) goto L_0x014f
            okhttp3.ResponseBody r2 = r18.body()
            r2.close()
        L_0x014f:
            r16.mo17154a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p267i.p268a.p269a.p271b.p272a.C6675f.onResponse(okhttp3.Call, okhttp3.Response):void");
    }
}
