package p267i.p268a.p269a.p271b.p272a;

import android.app.Activity;
import p267i.p274b.p277b.p278a.p279a.C6705b;

/* renamed from: i.a.a.b.a.e */
public class C6674e extends C6670a {

    /* renamed from: q */
    private final String f18535q = "node_a";

    /* renamed from: r */
    private final String f18536r = "node_b";

    /* renamed from: s */
    private final String f18537s = "width";

    /* renamed from: t */
    private final String f18538t = "map_id";

    /* renamed from: u */
    private final String f18539u = "crossnode_type";

    public C6674e(Activity activity, C6705b bVar) {
        super(activity, bVar, 310501);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0121, code lost:
        if (r15 != null) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0144, code lost:
        if (r15 != null) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0146, code lost:
        r15.body().close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x014d, code lost:
        mo17154a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0150, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResponse(okhttp3.Call r14, okhttp3.Response r15) {
        /*
            r13 = this;
            java.lang.String r14 = "map_id"
            java.lang.String r0 = "width"
            java.lang.String r1 = "node_b"
            java.lang.String r2 = "node_a"
            java.lang.String r3 = "success"
            java.lang.String r4 = "updated_at"
            int r5 = r15.code()
            boolean r5 = super.mo17124a(r5)
            if (r5 == 0) goto L_0x0017
            return
        L_0x0017:
            java.lang.String r5 = ""
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0126 }
            okhttp3.ResponseBody r7 = r15.body()     // Catch:{ JSONException -> 0x0126 }
            java.lang.String r7 = r7.string()     // Catch:{ JSONException -> 0x0126 }
            r6.<init>(r7)     // Catch:{ JSONException -> 0x0126 }
            boolean r7 = r6.has(r3)     // Catch:{ JSONException -> 0x0126 }
            if (r7 == 0) goto L_0x0103
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0126 }
            r7.<init>()     // Catch:{ JSONException -> 0x0126 }
            org.json.JSONObject r3 = r6.getJSONObject(r3)     // Catch:{ JSONException -> 0x0126 }
            java.lang.String r6 = "results"
            org.json.JSONArray r3 = r3.getJSONArray(r6)     // Catch:{ JSONException -> 0x0126 }
            i.a.a.a.a r6 = new i.a.a.a.a     // Catch:{ JSONException -> 0x0126 }
            android.app.Activity r8 = r13.f18614a     // Catch:{ JSONException -> 0x0126 }
            r6.<init>(r8)     // Catch:{ JSONException -> 0x0126 }
            r13.f18504o = r6     // Catch:{ JSONException -> 0x0126 }
            i.a.a.a.a r6 = r13.f18504o     // Catch:{ JSONException -> 0x0126 }
            java.lang.String r8 = "NodeList"
            r6.mo17095b((java.lang.String) r8)     // Catch:{ JSONException -> 0x0126 }
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ JSONException -> 0x0126 }
            r6.<init>()     // Catch:{ JSONException -> 0x0126 }
            r13.f18505p = r6     // Catch:{ JSONException -> 0x0126 }
            r6 = 0
        L_0x0053:
            int r8 = r3.length()     // Catch:{ JSONException -> 0x0126 }
            r9 = 1
            if (r6 >= r8) goto L_0x00eb
            org.json.JSONObject r8 = r3.getJSONObject(r6)     // Catch:{ JSONException -> 0x0126 }
            java.lang.String r10 = r8.getString(r4)     // Catch:{ JSONException -> 0x0126 }
            java.lang.String r11 = "deleted"
            int r11 = r8.getInt(r11)     // Catch:{ JSONException -> 0x0126 }
            java.lang.String r12 = "id"
            if (r11 == r9) goto L_0x00d9
            android.content.ContentValues r9 = r13.f18505p     // Catch:{ JSONException -> 0x0126 }
            int r11 = r8.getInt(r12)     // Catch:{ JSONException -> 0x0126 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ JSONException -> 0x0126 }
            r9.put(r12, r11)     // Catch:{ JSONException -> 0x0126 }
            android.content.ContentValues r9 = r13.f18505p     // Catch:{ JSONException -> 0x0126 }
            int r11 = r8.getInt(r2)     // Catch:{ JSONException -> 0x0126 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ JSONException -> 0x0126 }
            r9.put(r2, r11)     // Catch:{ JSONException -> 0x0126 }
            android.content.ContentValues r9 = r13.f18505p     // Catch:{ JSONException -> 0x0126 }
            int r11 = r8.getInt(r1)     // Catch:{ JSONException -> 0x0126 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ JSONException -> 0x0126 }
            r9.put(r1, r11)     // Catch:{ JSONException -> 0x0126 }
            android.content.ContentValues r9 = r13.f18505p     // Catch:{ JSONException -> 0x0126 }
            double r11 = r8.getDouble(r0)     // Catch:{ JSONException -> 0x0126 }
            java.lang.Double r11 = java.lang.Double.valueOf(r11)     // Catch:{ JSONException -> 0x0126 }
            r9.put(r0, r11)     // Catch:{ JSONException -> 0x0126 }
            int r9 = r8.getInt(r14)     // Catch:{ JSONException -> 0x0126 }
            android.content.ContentValues r11 = r13.f18505p     // Catch:{ JSONException -> 0x0126 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)     // Catch:{ JSONException -> 0x0126 }
            r11.put(r14, r12)     // Catch:{ JSONException -> 0x0126 }
            java.lang.String r11 = "crossnode_type"
            java.lang.String r11 = r8.getString(r11)     // Catch:{ JSONException -> 0x0126 }
            boolean r12 = r11.isEmpty()     // Catch:{ JSONException -> 0x0126 }
            if (r12 == 0) goto L_0x00c1
            r11 = -1
            if (r9 == r11) goto L_0x00bf
            java.lang.String r11 = "N"
            goto L_0x00c1
        L_0x00bf:
            java.lang.String r11 = "G"
        L_0x00c1:
            android.content.ContentValues r9 = r13.f18505p     // Catch:{ JSONException -> 0x0126 }
            java.lang.String r12 = "type"
            r9.put(r12, r11)     // Catch:{ JSONException -> 0x0126 }
            android.content.ContentValues r9 = r13.f18505p     // Catch:{ JSONException -> 0x0126 }
            java.lang.String r8 = r8.getString(r4)     // Catch:{ JSONException -> 0x0126 }
            r9.put(r4, r8)     // Catch:{ JSONException -> 0x0126 }
            i.a.a.a.a r8 = r13.f18504o     // Catch:{ JSONException -> 0x0126 }
            android.content.ContentValues r9 = r13.f18505p     // Catch:{ JSONException -> 0x0126 }
            r8.mo17170a((android.content.ContentValues) r9)     // Catch:{ JSONException -> 0x0126 }
            goto L_0x00e0
        L_0x00d9:
            java.lang.String r8 = r8.getString(r12)     // Catch:{ JSONException -> 0x0126 }
            r7.add(r8)     // Catch:{ JSONException -> 0x0126 }
        L_0x00e0:
            int r8 = r10.compareTo(r5)     // Catch:{ JSONException -> 0x0126 }
            if (r8 <= 0) goto L_0x00e7
            r5 = r10
        L_0x00e7:
            int r6 = r6 + 1
            goto L_0x0053
        L_0x00eb:
            i.a.a.a.a r14 = r13.f18504o     // Catch:{ JSONException -> 0x0126 }
            r14.mo17173b()     // Catch:{ JSONException -> 0x0126 }
            i.a.a.a.a r14 = r13.f18504o     // Catch:{ JSONException -> 0x0126 }
            r14.mo17100d(r7)     // Catch:{ JSONException -> 0x0126 }
            boolean r14 = r5.isEmpty()     // Catch:{ JSONException -> 0x0126 }
            if (r14 != 0) goto L_0x0100
            android.app.Activity r14 = r13.f18614a     // Catch:{ JSONException -> 0x0126 }
            p267i.p268a.p269a.p270a.C6667g.m25365f(r14, r5)     // Catch:{ JSONException -> 0x0126 }
        L_0x0100:
            r13.f18616c = r9     // Catch:{ JSONException -> 0x0126 }
            goto L_0x011a
        L_0x0103:
            r14 = 310503(0x4bce7, float:4.35107E-40)
            java.lang.String r14 = java.lang.String.valueOf(r14)     // Catch:{ JSONException -> 0x0126 }
            r13.f18617d = r14     // Catch:{ JSONException -> 0x0126 }
            android.app.Activity r14 = r13.f18614a     // Catch:{ JSONException -> 0x0126 }
            android.content.res.Resources r14 = r14.getResources()     // Catch:{ JSONException -> 0x0126 }
            int r0 = p267i.p268a.p269a.C6689e.dialog_parse_json_failed_msg     // Catch:{ JSONException -> 0x0126 }
            java.lang.String r14 = r14.getString(r0)     // Catch:{ JSONException -> 0x0126 }
            r13.f18618e = r14     // Catch:{ JSONException -> 0x0126 }
        L_0x011a:
            i.a.a.a.a r14 = r13.f18504o
            if (r14 == 0) goto L_0x0121
            r14.mo17175c()
        L_0x0121:
            if (r15 == 0) goto L_0x014d
            goto L_0x0146
        L_0x0124:
            r14 = move-exception
            goto L_0x0151
        L_0x0126:
            r14 = move-exception
            r14.printStackTrace()     // Catch:{ all -> 0x0124 }
            r14 = 310502(0x4bce6, float:4.35106E-40)
            java.lang.String r14 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x0124 }
            r13.f18617d = r14     // Catch:{ all -> 0x0124 }
            android.app.Activity r14 = r13.f18614a     // Catch:{ all -> 0x0124 }
            int r0 = p267i.p268a.p269a.C6689e.dialog_parse_json_failed_msg     // Catch:{ all -> 0x0124 }
            java.lang.String r14 = r14.getString(r0)     // Catch:{ all -> 0x0124 }
            r13.f18618e = r14     // Catch:{ all -> 0x0124 }
            i.a.a.a.a r14 = r13.f18504o
            if (r14 == 0) goto L_0x0144
            r14.mo17175c()
        L_0x0144:
            if (r15 == 0) goto L_0x014d
        L_0x0146:
            okhttp3.ResponseBody r14 = r15.body()
            r14.close()
        L_0x014d:
            r13.mo17154a()
            return
        L_0x0151:
            i.a.a.a.a r0 = r13.f18504o
            if (r0 == 0) goto L_0x0158
            r0.mo17175c()
        L_0x0158:
            if (r15 == 0) goto L_0x0161
            okhttp3.ResponseBody r15 = r15.body()
            r15.close()
        L_0x0161:
            r13.mo17154a()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p267i.p268a.p269a.p271b.p272a.C6674e.onResponse(okhttp3.Call, okhttp3.Response):void");
    }
}
