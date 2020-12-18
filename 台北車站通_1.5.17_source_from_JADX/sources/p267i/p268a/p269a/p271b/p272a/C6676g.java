package p267i.p268a.p269a.p271b.p272a;

import android.app.Activity;
import p267i.p274b.p277b.p278a.p279a.C6705b;

/* renamed from: i.a.a.b.a.g */
public class C6676g extends C6670a {

    /* renamed from: A */
    private final String f18545A = "map_id";

    /* renamed from: B */
    private final String f18546B = "rid";

    /* renamed from: q */
    private final String f18547q = "name";

    /* renamed from: r */
    private final String f18548r = "name_zh_cht";

    /* renamed from: s */
    private final String f18549s = SVGParser.XML_STYLESHEET_ATTR_TYPE;

    /* renamed from: t */
    private final String f18550t = "subtype";

    /* renamed from: u */
    private final String f18551u = "mark_img_url";

    /* renamed from: v */
    private final String f18552v = "store_img_url";

    /* renamed from: w */
    private final String f18553w = "description";

    /* renamed from: x */
    private final String f18554x = "description_zh_cht";

    /* renamed from: y */
    private final String f18555y = "ori_x";

    /* renamed from: z */
    private final String f18556z = "ori_y";

    public C6676g(Activity activity, C6705b bVar) {
        super(activity, bVar, 310601);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x01a3, code lost:
        if (r25 != null) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x01c6, code lost:
        if (r25 != null) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x01c8, code lost:
        r25.body().close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x01cf, code lost:
        mo17154a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x01d2, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResponse(okhttp3.Call r24, okhttp3.Response r25) {
        /*
            r23 = this;
            r1 = r23
            java.lang.String r0 = "map_id"
            java.lang.String r2 = "ori_y"
            java.lang.String r3 = "ori_x"
            java.lang.String r4 = "description_zh_cht"
            java.lang.String r5 = "description"
            java.lang.String r6 = "store_img_url"
            java.lang.String r7 = "mark_img_url"
            java.lang.String r8 = "subtype"
            java.lang.String r9 = "type"
            java.lang.String r10 = "name_zh_cht"
            java.lang.String r11 = "name"
            java.lang.String r12 = "success"
            java.lang.String r13 = "updated_at"
            int r14 = r25.code()
            boolean r14 = super.mo17124a(r14)
            if (r14 == 0) goto L_0x0027
            return
        L_0x0027:
            java.lang.String r14 = ""
            org.json.JSONObject r15 = new org.json.JSONObject     // Catch:{ JSONException -> 0x01a8 }
            okhttp3.ResponseBody r16 = r25.body()     // Catch:{ JSONException -> 0x01a8 }
            r24 = r14
            java.lang.String r14 = r16.string()     // Catch:{ JSONException -> 0x01a8 }
            r15.<init>(r14)     // Catch:{ JSONException -> 0x01a8 }
            boolean r14 = r15.has(r12)     // Catch:{ JSONException -> 0x01a8 }
            if (r14 == 0) goto L_0x0185
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ JSONException -> 0x01a8 }
            r14.<init>()     // Catch:{ JSONException -> 0x01a8 }
            org.json.JSONObject r12 = r15.getJSONObject(r12)     // Catch:{ JSONException -> 0x01a8 }
            java.lang.String r15 = "results"
            org.json.JSONArray r12 = r12.getJSONArray(r15)     // Catch:{ JSONException -> 0x01a8 }
            i.a.a.a.a r15 = new i.a.a.a.a     // Catch:{ JSONException -> 0x01a8 }
            r16 = r14
            android.app.Activity r14 = r1.f18614a     // Catch:{ JSONException -> 0x01a8 }
            r15.<init>(r14)     // Catch:{ JSONException -> 0x01a8 }
            r1.f18504o = r15     // Catch:{ JSONException -> 0x01a8 }
            i.a.a.a.a r14 = r1.f18504o     // Catch:{ JSONException -> 0x01a8 }
            java.lang.String r15 = "Store"
            r14.mo17095b((java.lang.String) r15)     // Catch:{ JSONException -> 0x01a8 }
            android.content.ContentValues r14 = new android.content.ContentValues     // Catch:{ JSONException -> 0x01a8 }
            r14.<init>()     // Catch:{ JSONException -> 0x01a8 }
            r1.f18505p = r14     // Catch:{ JSONException -> 0x01a8 }
            r14 = 0
        L_0x0067:
            int r15 = r12.length()     // Catch:{ JSONException -> 0x01a8 }
            r17 = r0
            if (r14 >= r15) goto L_0x0168
            org.json.JSONObject r15 = r12.getJSONObject(r14)     // Catch:{ JSONException -> 0x01a8 }
            java.lang.String r0 = r15.getString(r13)     // Catch:{ JSONException -> 0x01a8 }
            r18 = r12
            java.lang.String r12 = "deleted"
            int r12 = r15.getInt(r12)     // Catch:{ JSONException -> 0x01a8 }
            r19 = r14
            java.lang.String r14 = "id"
            r20 = r0
            r0 = 1
            if (r12 == r0) goto L_0x0142
            android.content.ContentValues r0 = r1.f18505p     // Catch:{ JSONException -> 0x01a8 }
            int r12 = r15.getInt(r14)     // Catch:{ JSONException -> 0x01a8 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ JSONException -> 0x01a8 }
            r0.put(r14, r12)     // Catch:{ JSONException -> 0x01a8 }
            java.lang.String r0 = r15.getString(r11)     // Catch:{ JSONException -> 0x01a8 }
            android.content.ContentValues r12 = r1.f18505p     // Catch:{ JSONException -> 0x01a8 }
            i.a.a.a.a r14 = r1.f18504o     // Catch:{ JSONException -> 0x01a8 }
            java.lang.String r0 = r14.mo17097c((java.lang.String) r0)     // Catch:{ JSONException -> 0x01a8 }
            r12.put(r11, r0)     // Catch:{ JSONException -> 0x01a8 }
            java.lang.String r0 = r15.getString(r10)     // Catch:{ JSONException -> 0x01a8 }
            android.content.ContentValues r12 = r1.f18505p     // Catch:{ JSONException -> 0x01a8 }
            i.a.a.a.a r14 = r1.f18504o     // Catch:{ JSONException -> 0x01a8 }
            java.lang.String r0 = r14.mo17097c((java.lang.String) r0)     // Catch:{ JSONException -> 0x01a8 }
            r12.put(r10, r0)     // Catch:{ JSONException -> 0x01a8 }
            android.content.ContentValues r0 = r1.f18505p     // Catch:{ JSONException -> 0x01a8 }
            java.lang.String r12 = r15.getString(r9)     // Catch:{ JSONException -> 0x01a8 }
            r0.put(r9, r12)     // Catch:{ JSONException -> 0x01a8 }
            android.content.ContentValues r0 = r1.f18505p     // Catch:{ JSONException -> 0x01a8 }
            java.lang.String r12 = r15.getString(r8)     // Catch:{ JSONException -> 0x01a8 }
            r0.put(r8, r12)     // Catch:{ JSONException -> 0x01a8 }
            android.content.ContentValues r0 = r1.f18505p     // Catch:{ JSONException -> 0x01a8 }
            java.lang.String r12 = r15.getString(r7)     // Catch:{ JSONException -> 0x01a8 }
            r0.put(r7, r12)     // Catch:{ JSONException -> 0x01a8 }
            android.content.ContentValues r0 = r1.f18505p     // Catch:{ JSONException -> 0x01a8 }
            java.lang.String r12 = r15.getString(r6)     // Catch:{ JSONException -> 0x01a8 }
            r0.put(r6, r12)     // Catch:{ JSONException -> 0x01a8 }
            java.lang.String r0 = r15.getString(r5)     // Catch:{ JSONException -> 0x01a8 }
            android.content.ContentValues r12 = r1.f18505p     // Catch:{ JSONException -> 0x01a8 }
            i.a.a.a.a r14 = r1.f18504o     // Catch:{ JSONException -> 0x01a8 }
            java.lang.String r0 = r14.mo17097c((java.lang.String) r0)     // Catch:{ JSONException -> 0x01a8 }
            r12.put(r5, r0)     // Catch:{ JSONException -> 0x01a8 }
            java.lang.String r0 = r15.getString(r4)     // Catch:{ JSONException -> 0x01a8 }
            android.content.ContentValues r12 = r1.f18505p     // Catch:{ JSONException -> 0x01a8 }
            i.a.a.a.a r14 = r1.f18504o     // Catch:{ JSONException -> 0x01a8 }
            java.lang.String r0 = r14.mo17097c((java.lang.String) r0)     // Catch:{ JSONException -> 0x01a8 }
            r12.put(r4, r0)     // Catch:{ JSONException -> 0x01a8 }
            android.content.ContentValues r0 = r1.f18505p     // Catch:{ JSONException -> 0x01a8 }
            double r21 = r15.getDouble(r3)     // Catch:{ JSONException -> 0x01a8 }
            java.lang.Double r12 = java.lang.Double.valueOf(r21)     // Catch:{ JSONException -> 0x01a8 }
            r0.put(r3, r12)     // Catch:{ JSONException -> 0x01a8 }
            android.content.ContentValues r0 = r1.f18505p     // Catch:{ JSONException -> 0x01a8 }
            double r21 = r15.getDouble(r2)     // Catch:{ JSONException -> 0x01a8 }
            java.lang.Double r12 = java.lang.Double.valueOf(r21)     // Catch:{ JSONException -> 0x01a8 }
            r0.put(r2, r12)     // Catch:{ JSONException -> 0x01a8 }
            android.content.ContentValues r0 = r1.f18505p     // Catch:{ JSONException -> 0x01a8 }
            r12 = r17
            int r14 = r15.getInt(r12)     // Catch:{ JSONException -> 0x01a8 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ JSONException -> 0x01a8 }
            r0.put(r12, r14)     // Catch:{ JSONException -> 0x01a8 }
            android.content.ContentValues r0 = r1.f18505p     // Catch:{ JSONException -> 0x01a8 }
            java.lang.String r14 = r15.getString(r13)     // Catch:{ JSONException -> 0x01a8 }
            r0.put(r13, r14)     // Catch:{ JSONException -> 0x01a8 }
            android.content.ContentValues r0 = r1.f18505p     // Catch:{ JSONException -> 0x01a8 }
            java.lang.String r14 = "rid"
            r17 = r2
            java.lang.String r2 = "rid"
            java.lang.String r2 = r15.getString(r2)     // Catch:{ JSONException -> 0x01a8 }
            r0.put(r14, r2)     // Catch:{ JSONException -> 0x01a8 }
            i.a.a.a.a r0 = r1.f18504o     // Catch:{ JSONException -> 0x01a8 }
            android.content.ContentValues r2 = r1.f18505p     // Catch:{ JSONException -> 0x01a8 }
            r0.mo17170a((android.content.ContentValues) r2)     // Catch:{ JSONException -> 0x01a8 }
            r14 = r24
            r2 = r16
            goto L_0x0151
        L_0x0142:
            r12 = r17
            r17 = r2
            java.lang.String r0 = r15.getString(r14)     // Catch:{ JSONException -> 0x01a8 }
            r2 = r16
            r2.add(r0)     // Catch:{ JSONException -> 0x01a8 }
            r14 = r24
        L_0x0151:
            r0 = r20
            int r15 = r0.compareTo(r14)     // Catch:{ JSONException -> 0x01a8 }
            if (r15 <= 0) goto L_0x015a
            r14 = r0
        L_0x015a:
            int r0 = r19 + 1
            r16 = r2
            r24 = r14
            r2 = r17
            r14 = r0
            r0 = r12
            r12 = r18
            goto L_0x0067
        L_0x0168:
            r14 = r24
            r2 = r16
            i.a.a.a.a r0 = r1.f18504o     // Catch:{ JSONException -> 0x01a8 }
            r0.mo17173b()     // Catch:{ JSONException -> 0x01a8 }
            i.a.a.a.a r0 = r1.f18504o     // Catch:{ JSONException -> 0x01a8 }
            r0.mo17102e(r2)     // Catch:{ JSONException -> 0x01a8 }
            boolean r0 = r14.isEmpty()     // Catch:{ JSONException -> 0x01a8 }
            if (r0 != 0) goto L_0x0181
            android.app.Activity r0 = r1.f18614a     // Catch:{ JSONException -> 0x01a8 }
            p267i.p268a.p269a.p270a.C6667g.m25366g(r0, r14)     // Catch:{ JSONException -> 0x01a8 }
        L_0x0181:
            r0 = 1
            r1.f18616c = r0     // Catch:{ JSONException -> 0x01a8 }
            goto L_0x019c
        L_0x0185:
            r0 = 310603(0x4bd4b, float:4.35248E-40)
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ JSONException -> 0x01a8 }
            r1.f18617d = r0     // Catch:{ JSONException -> 0x01a8 }
            android.app.Activity r0 = r1.f18614a     // Catch:{ JSONException -> 0x01a8 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ JSONException -> 0x01a8 }
            int r2 = p267i.p268a.p269a.C6689e.dialog_parse_json_failed_msg     // Catch:{ JSONException -> 0x01a8 }
            java.lang.String r0 = r0.getString(r2)     // Catch:{ JSONException -> 0x01a8 }
            r1.f18618e = r0     // Catch:{ JSONException -> 0x01a8 }
        L_0x019c:
            i.a.a.a.a r0 = r1.f18504o
            if (r0 == 0) goto L_0x01a3
            r0.mo17175c()
        L_0x01a3:
            if (r25 == 0) goto L_0x01cf
            goto L_0x01c8
        L_0x01a6:
            r0 = move-exception
            goto L_0x01d3
        L_0x01a8:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x01a6 }
            r0 = 310602(0x4bd4a, float:4.35246E-40)
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x01a6 }
            r1.f18617d = r0     // Catch:{ all -> 0x01a6 }
            android.app.Activity r0 = r1.f18614a     // Catch:{ all -> 0x01a6 }
            int r2 = p267i.p268a.p269a.C6689e.dialog_parse_json_failed_msg     // Catch:{ all -> 0x01a6 }
            java.lang.String r0 = r0.getString(r2)     // Catch:{ all -> 0x01a6 }
            r1.f18618e = r0     // Catch:{ all -> 0x01a6 }
            i.a.a.a.a r0 = r1.f18504o
            if (r0 == 0) goto L_0x01c6
            r0.mo17175c()
        L_0x01c6:
            if (r25 == 0) goto L_0x01cf
        L_0x01c8:
            okhttp3.ResponseBody r0 = r25.body()
            r0.close()
        L_0x01cf:
            r23.mo17154a()
            return
        L_0x01d3:
            i.a.a.a.a r2 = r1.f18504o
            if (r2 == 0) goto L_0x01da
            r2.mo17175c()
        L_0x01da:
            if (r25 == 0) goto L_0x01e3
            okhttp3.ResponseBody r2 = r25.body()
            r2.close()
        L_0x01e3:
            r23.mo17154a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p267i.p268a.p269a.p271b.p272a.C6676g.onResponse(okhttp3.Call, okhttp3.Response):void");
    }
}
