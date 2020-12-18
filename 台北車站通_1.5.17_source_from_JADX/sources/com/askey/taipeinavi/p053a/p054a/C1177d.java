package com.askey.taipeinavi.p053a.p054a;

import android.app.Activity;
import p267i.p274b.p275a.p276a.C6695b;

/* renamed from: com.askey.taipeinavi.a.a.d */
public class C1177d extends C1174a {

    /* renamed from: l */
    private final String f4350l = "ZNDK";

    public C1177d(Activity activity, C6695b bVar, int i) {
        super(activity, bVar, 210301, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0062, code lost:
        if (r5 == null) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0064, code lost:
        r5.body().close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006b, code lost:
        mo17144a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0048, code lost:
        if (r5 != null) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResponse(okhttp3.Call r4, okhttp3.Response r5) {
        /*
            r3 = this;
            java.lang.String r4 = "success"
            int r0 = r5.code()
            boolean r0 = super.mo5465a(r0)
            if (r0 == 0) goto L_0x000d
            return
        L_0x000d:
            r0 = 2131689678(0x7f0f00ce, float:1.9008378E38)
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x004d }
            okhttp3.ResponseBody r2 = r5.body()     // Catch:{ JSONException -> 0x004d }
            java.lang.String r2 = r2.string()     // Catch:{ JSONException -> 0x004d }
            r1.<init>(r2)     // Catch:{ JSONException -> 0x004d }
            boolean r2 = r1.has(r4)     // Catch:{ JSONException -> 0x004d }
            if (r2 == 0) goto L_0x0033
            org.json.JSONObject r4 = r1.getJSONObject(r4)     // Catch:{ JSONException -> 0x004d }
            java.lang.String r1 = "ZNDK"
            java.lang.String r4 = r4.getString(r1)     // Catch:{ JSONException -> 0x004d }
            r3.f18586f = r4     // Catch:{ JSONException -> 0x004d }
            r4 = 1
            r3.f18583c = r4     // Catch:{ JSONException -> 0x004d }
            goto L_0x0048
        L_0x0033:
            r4 = 210303(0x3357f, float:2.94697E-40)
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ JSONException -> 0x004d }
            r3.f18584d = r4     // Catch:{ JSONException -> 0x004d }
            android.content.Context r4 = r3.f18581a     // Catch:{ JSONException -> 0x004d }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ JSONException -> 0x004d }
            java.lang.String r4 = r4.getString(r0)     // Catch:{ JSONException -> 0x004d }
            r3.f18585e = r4     // Catch:{ JSONException -> 0x004d }
        L_0x0048:
            if (r5 == 0) goto L_0x006b
            goto L_0x0064
        L_0x004b:
            r4 = move-exception
            goto L_0x006f
        L_0x004d:
            r4 = move-exception
            r4.printStackTrace()     // Catch:{ all -> 0x004b }
            r4 = 210302(0x3357e, float:2.94696E-40)
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x004b }
            r3.f18584d = r4     // Catch:{ all -> 0x004b }
            android.content.Context r4 = r3.f18581a     // Catch:{ all -> 0x004b }
            java.lang.String r4 = r4.getString(r0)     // Catch:{ all -> 0x004b }
            r3.f18585e = r4     // Catch:{ all -> 0x004b }
            if (r5 == 0) goto L_0x006b
        L_0x0064:
            okhttp3.ResponseBody r4 = r5.body()
            r4.close()
        L_0x006b:
            r3.mo17144a()
            return
        L_0x006f:
            if (r5 == 0) goto L_0x0078
            okhttp3.ResponseBody r5 = r5.body()
            r5.close()
        L_0x0078:
            r3.mo17144a()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.askey.taipeinavi.p053a.p054a.C1177d.onResponse(okhttp3.Call, okhttp3.Response):void");
    }
}
