package p267i.p268a.p269a.p271b.p272a;

import android.app.Activity;
import p267i.p274b.p277b.p278a.p279a.C6705b;

/* renamed from: i.a.a.b.a.i */
public class C6678i extends C6670a {
    public C6678i(Activity activity, C6705b bVar) {
        super(activity, bVar, 310801);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0042, code lost:
        if (r3 != null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0065, code lost:
        if (r3 != null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0067, code lost:
        r3.body().close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006e, code lost:
        mo17154a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0071, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResponse(okhttp3.Call r2, okhttp3.Response r3) {
        /*
            r1 = this;
            int r2 = r3.code()
            boolean r2 = super.mo17124a(r2)
            if (r2 == 0) goto L_0x000b
            return
        L_0x000b:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0047 }
            okhttp3.ResponseBody r0 = r3.body()     // Catch:{ JSONException -> 0x0047 }
            java.lang.String r0 = r0.string()     // Catch:{ JSONException -> 0x0047 }
            r2.<init>(r0)     // Catch:{ JSONException -> 0x0047 }
            java.lang.String r0 = "success"
            boolean r2 = r2.has(r0)     // Catch:{ JSONException -> 0x0047 }
            if (r2 == 0) goto L_0x0024
            r2 = 1
            r1.f18616c = r2     // Catch:{ JSONException -> 0x0047 }
            goto L_0x003b
        L_0x0024:
            r2 = 310803(0x4be13, float:4.35528E-40)
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ JSONException -> 0x0047 }
            r1.f18617d = r2     // Catch:{ JSONException -> 0x0047 }
            android.app.Activity r2 = r1.f18614a     // Catch:{ JSONException -> 0x0047 }
            android.content.res.Resources r2 = r2.getResources()     // Catch:{ JSONException -> 0x0047 }
            int r0 = p267i.p268a.p269a.C6689e.dialog_parse_json_failed_msg     // Catch:{ JSONException -> 0x0047 }
            java.lang.String r2 = r2.getString(r0)     // Catch:{ JSONException -> 0x0047 }
            r1.f18618e = r2     // Catch:{ JSONException -> 0x0047 }
        L_0x003b:
            i.a.a.a.a r2 = r1.f18504o
            if (r2 == 0) goto L_0x0042
            r2.mo17175c()
        L_0x0042:
            if (r3 == 0) goto L_0x006e
            goto L_0x0067
        L_0x0045:
            r2 = move-exception
            goto L_0x0072
        L_0x0047:
            r2 = move-exception
            r2.printStackTrace()     // Catch:{ all -> 0x0045 }
            r2 = 310802(0x4be12, float:4.35526E-40)
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0045 }
            r1.f18617d = r2     // Catch:{ all -> 0x0045 }
            android.app.Activity r2 = r1.f18614a     // Catch:{ all -> 0x0045 }
            int r0 = p267i.p268a.p269a.C6689e.dialog_parse_json_failed_msg     // Catch:{ all -> 0x0045 }
            java.lang.String r2 = r2.getString(r0)     // Catch:{ all -> 0x0045 }
            r1.f18618e = r2     // Catch:{ all -> 0x0045 }
            i.a.a.a.a r2 = r1.f18504o
            if (r2 == 0) goto L_0x0065
            r2.mo17175c()
        L_0x0065:
            if (r3 == 0) goto L_0x006e
        L_0x0067:
            okhttp3.ResponseBody r2 = r3.body()
            r2.close()
        L_0x006e:
            r1.mo17154a()
            return
        L_0x0072:
            i.a.a.a.a r0 = r1.f18504o
            if (r0 == 0) goto L_0x0079
            r0.mo17175c()
        L_0x0079:
            if (r3 == 0) goto L_0x0082
            okhttp3.ResponseBody r3 = r3.body()
            r3.close()
        L_0x0082:
            r1.mo17154a()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p267i.p268a.p269a.p271b.p272a.C6678i.onResponse(okhttp3.Call, okhttp3.Response):void");
    }
}
