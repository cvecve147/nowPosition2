package org.altbeacon.beacon.p292b;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.AsyncTask;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import org.altbeacon.beacon.p293c.C6895d;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.cookie.ClientCookie;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: org.altbeacon.beacon.b.f */
public class C6888f implements C6885c {

    /* renamed from: a */
    Map<C6883a, C6885c> f18977a;

    /* renamed from: b */
    private C6883a f18978b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C6885c f18979c;

    /* renamed from: d */
    private C6883a f18980d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C6883a f18981e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f18982f;

    /* renamed from: g */
    private Context f18983g;

    /* renamed from: h */
    private final ReentrantLock f18984h;

    public C6888f(Context context, String str) {
        this(context, str, C6883a.m25972a());
    }

    public C6888f(Context context, String str, C6883a aVar) {
        this.f18982f = null;
        this.f18984h = new ReentrantLock();
        this.f18981e = aVar;
        this.f18982f = str;
        this.f18983g = context;
        m25990b();
        this.f18979c = mo18734a(aVar);
    }

    /* renamed from: a */
    private void m25987a() {
        try {
            m25991b(m25996d("model-distance-calculations.json"));
        } catch (Exception e) {
            this.f18977a = new HashMap();
            C6895d.m26022a(e, "ModelSpecificDistanceCalculator", "Cannot build model distance calculations", new Object[0]);
        }
    }

    /* renamed from: b */
    private C6885c m25989b(C6883a aVar) {
        C6895d.m26021a("ModelSpecificDistanceCalculator", "Finding best distance calculator for %s, %s, %s, %s", aVar.mo18726e(), aVar.mo18723b(), aVar.mo18725d(), aVar.mo18724c());
        Map<C6883a, C6885c> map = this.f18977a;
        C6883a aVar2 = null;
        if (map == null) {
            C6895d.m26021a("ModelSpecificDistanceCalculator", "Cannot get distance calculator because modelMap was never initialized", new Object[0]);
            return null;
        }
        int i = 0;
        for (C6883a next : map.keySet()) {
            if (next.mo18722a(aVar) > i) {
                i = next.mo18722a(aVar);
                aVar2 = next;
            }
        }
        if (aVar2 != null) {
            C6895d.m26021a("ModelSpecificDistanceCalculator", "found a match with score %s", Integer.valueOf(i));
            C6895d.m26021a("ModelSpecificDistanceCalculator", "Finding best distance calculator for %s, %s, %s, %s", aVar2.mo18726e(), aVar2.mo18723b(), aVar2.mo18725d(), aVar2.mo18724c());
            this.f18980d = aVar2;
        } else {
            this.f18980d = this.f18978b;
            C6895d.m26027d("ModelSpecificDistanceCalculator", "Cannot find match for this device.  Using default", new Object[0]);
        }
        return this.f18977a.get(this.f18980d);
    }

    /* renamed from: b */
    private void m25990b() {
        boolean z;
        if (this.f18982f != null) {
            z = m25994c();
            if (!z) {
                m25997d();
            }
        } else {
            z = false;
        }
        if (!z) {
            m25987a();
        }
        this.f18979c = mo18734a(this.f18981e);
    }

    /* renamed from: b */
    private void m25991b(String str) {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONObject(str).getJSONArray("models");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            boolean z = jSONObject.has(CookieSpecs.DEFAULT) ? jSONObject.getBoolean(CookieSpecs.DEFAULT) : false;
            Double valueOf = Double.valueOf(jSONObject.getDouble("coefficient1"));
            Double valueOf2 = Double.valueOf(jSONObject.getDouble("coefficient2"));
            Double valueOf3 = Double.valueOf(jSONObject.getDouble("coefficient3"));
            String string = jSONObject.getString(ClientCookie.VERSION_ATTR);
            String string2 = jSONObject.getString("build_number");
            String string3 = jSONObject.getString("model");
            String string4 = jSONObject.getString("manufacturer");
            double doubleValue = valueOf.doubleValue();
            double doubleValue2 = valueOf2.doubleValue();
            double doubleValue3 = valueOf3.doubleValue();
            C6884b bVar = r13;
            C6884b bVar2 = new C6884b(doubleValue, doubleValue2, doubleValue3);
            C6883a aVar = new C6883a(string, string2, string3, string4);
            hashMap.put(aVar, bVar);
            if (z) {
                this.f18978b = aVar;
            }
        }
        this.f18977a = hashMap;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:9|10|11|12|13|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0043, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        org.altbeacon.beacon.p293c.C6895d.m26022a(r1, "ModelSpecificDistanceCalculator", "Cannot update distance models from online database at %s with JSON: %s", r9.f18982f, r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        return false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0038 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003b */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0073 A[SYNTHETIC, Splitter:B:35:0x0073] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0078 A[SYNTHETIC, Splitter:B:39:0x0078] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x007e A[SYNTHETIC, Splitter:B:44:0x007e] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0083 A[SYNTHETIC, Splitter:B:48:0x0083] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x008a A[SYNTHETIC, Splitter:B:56:0x008a] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x008f A[SYNTHETIC, Splitter:B:60:0x008f] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m25994c() {
        /*
            r9 = this;
            java.lang.String r0 = "ModelSpecificDistanceCalculator"
            java.io.File r1 = new java.io.File
            android.content.Context r2 = r9.f18983g
            java.io.File r2 = r2.getFilesDir()
            java.lang.String r3 = "model-distance-calculations.json"
            r1.<init>(r2, r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 0
            r4 = 1
            r5 = 0
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0087, IOException -> 0x0066, all -> 0x0063 }
            r6.<init>(r1)     // Catch:{ FileNotFoundException -> 0x0087, IOException -> 0x0066, all -> 0x0063 }
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ FileNotFoundException -> 0x0088, IOException -> 0x0061 }
            java.io.InputStreamReader r8 = new java.io.InputStreamReader     // Catch:{ FileNotFoundException -> 0x0088, IOException -> 0x0061 }
            r8.<init>(r6)     // Catch:{ FileNotFoundException -> 0x0088, IOException -> 0x0061 }
            r7.<init>(r8)     // Catch:{ FileNotFoundException -> 0x0088, IOException -> 0x0061 }
        L_0x0026:
            java.lang.String r3 = r7.readLine()     // Catch:{ FileNotFoundException -> 0x005d, IOException -> 0x005a, all -> 0x0057 }
            if (r3 == 0) goto L_0x0035
            r2.append(r3)     // Catch:{ FileNotFoundException -> 0x005d, IOException -> 0x005a, all -> 0x0057 }
            java.lang.String r3 = "\n"
            r2.append(r3)     // Catch:{ FileNotFoundException -> 0x005d, IOException -> 0x005a, all -> 0x0057 }
            goto L_0x0026
        L_0x0035:
            r7.close()     // Catch:{ Exception -> 0x0038 }
        L_0x0038:
            r6.close()     // Catch:{ Exception -> 0x003b }
        L_0x003b:
            java.lang.String r1 = r2.toString()     // Catch:{ JSONException -> 0x0043 }
            r9.mo18735a((java.lang.String) r1)     // Catch:{ JSONException -> 0x0043 }
            return r4
        L_0x0043:
            r1 = move-exception
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r6 = r9.f18982f
            r3[r5] = r6
            java.lang.String r2 = r2.toString()
            r3[r4] = r2
            java.lang.String r2 = "Cannot update distance models from online database at %s with JSON: %s"
            org.altbeacon.beacon.p293c.C6895d.m26022a(r1, r0, r2, r3)
            return r5
        L_0x0057:
            r0 = move-exception
            r3 = r7
            goto L_0x007c
        L_0x005a:
            r2 = move-exception
            r3 = r7
            goto L_0x0068
        L_0x005d:
            r3 = r7
            goto L_0x0088
        L_0x005f:
            r0 = move-exception
            goto L_0x007c
        L_0x0061:
            r2 = move-exception
            goto L_0x0068
        L_0x0063:
            r0 = move-exception
            r6 = r3
            goto L_0x007c
        L_0x0066:
            r2 = move-exception
            r6 = r3
        L_0x0068:
            java.lang.String r7 = "Cannot open distance model file %s"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x005f }
            r4[r5] = r1     // Catch:{ all -> 0x005f }
            org.altbeacon.beacon.p293c.C6895d.m26022a(r2, r0, r7, r4)     // Catch:{ all -> 0x005f }
            if (r3 == 0) goto L_0x0076
            r3.close()     // Catch:{ Exception -> 0x0076 }
        L_0x0076:
            if (r6 == 0) goto L_0x007b
            r6.close()     // Catch:{ Exception -> 0x007b }
        L_0x007b:
            return r5
        L_0x007c:
            if (r3 == 0) goto L_0x0081
            r3.close()     // Catch:{ Exception -> 0x0081 }
        L_0x0081:
            if (r6 == 0) goto L_0x0086
            r6.close()     // Catch:{ Exception -> 0x0086 }
        L_0x0086:
            throw r0
        L_0x0087:
            r6 = r3
        L_0x0088:
            if (r3 == 0) goto L_0x008d
            r3.close()     // Catch:{ Exception -> 0x008d }
        L_0x008d:
            if (r6 == 0) goto L_0x0092
            r6.close()     // Catch:{ Exception -> 0x0092 }
        L_0x0092:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.altbeacon.beacon.p292b.C6888f.m25994c():boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public boolean m25995c(String str) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = this.f18983g.openFileOutput("model-distance-calculations.json", 0);
            fileOutputStream.write(str.getBytes());
            fileOutputStream.close();
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (Exception unused) {
                }
            }
            C6895d.m26026c("ModelSpecificDistanceCalculator", "Successfully saved new distance model file", new Object[0]);
            return true;
        } catch (Exception e) {
            C6895d.m26025b(e, "ModelSpecificDistanceCalculator", "Cannot write updated distance model to local storage", new Object[0]);
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (Exception unused2) {
                }
            }
            return false;
        } catch (Throwable th) {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (Exception unused3) {
                }
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008f  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m25996d(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = "/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
            java.lang.Class<org.altbeacon.beacon.b.f> r3 = org.altbeacon.beacon.p292b.C6888f.class
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0086 }
            r4.<init>()     // Catch:{ all -> 0x0086 }
            r4.append(r0)     // Catch:{ all -> 0x0086 }
            r4.append(r7)     // Catch:{ all -> 0x0086 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0086 }
            java.io.InputStream r3 = r3.getResourceAsStream(r4)     // Catch:{ all -> 0x0086 }
            if (r3 != 0) goto L_0x003e
            java.lang.Class r4 = r6.getClass()     // Catch:{ all -> 0x003b }
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ all -> 0x003b }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x003b }
            r5.<init>()     // Catch:{ all -> 0x003b }
            r5.append(r0)     // Catch:{ all -> 0x003b }
            r5.append(r7)     // Catch:{ all -> 0x003b }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x003b }
            java.io.InputStream r0 = r4.getResourceAsStream(r0)     // Catch:{ all -> 0x003b }
            goto L_0x003f
        L_0x003b:
            r7 = move-exception
            r0 = r3
            goto L_0x0088
        L_0x003e:
            r0 = r3
        L_0x003f:
            if (r0 == 0) goto L_0x006f
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ all -> 0x006d }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x006d }
            java.lang.String r4 = "UTF-8"
            r3.<init>(r0, r4)     // Catch:{ all -> 0x006d }
            r7.<init>(r3)     // Catch:{ all -> 0x006d }
        L_0x004d:
            java.lang.String r2 = r7.readLine()     // Catch:{ all -> 0x0069 }
            if (r2 == 0) goto L_0x005c
            r1.append(r2)     // Catch:{ all -> 0x0069 }
            r2 = 10
            r1.append(r2)     // Catch:{ all -> 0x0069 }
            goto L_0x004d
        L_0x005c:
            r7.close()
            if (r0 == 0) goto L_0x0064
            r0.close()
        L_0x0064:
            java.lang.String r7 = r1.toString()
            return r7
        L_0x0069:
            r1 = move-exception
            r2 = r7
            r7 = r1
            goto L_0x0088
        L_0x006d:
            r7 = move-exception
            goto L_0x0088
        L_0x006f:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x006d }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x006d }
            r3.<init>()     // Catch:{ all -> 0x006d }
            java.lang.String r4 = "Cannot load resource at "
            r3.append(r4)     // Catch:{ all -> 0x006d }
            r3.append(r7)     // Catch:{ all -> 0x006d }
            java.lang.String r7 = r3.toString()     // Catch:{ all -> 0x006d }
            r1.<init>(r7)     // Catch:{ all -> 0x006d }
            throw r1     // Catch:{ all -> 0x006d }
        L_0x0086:
            r7 = move-exception
            r0 = r2
        L_0x0088:
            if (r2 == 0) goto L_0x008d
            r2.close()
        L_0x008d:
            if (r0 == 0) goto L_0x0092
            r0.close()
        L_0x0092:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.altbeacon.beacon.p292b.C6888f.m25996d(java.lang.String):java.lang.String");
    }

    @TargetApi(11)
    /* renamed from: d */
    private void m25997d() {
        if (this.f18983g.checkCallingOrSelfPermission("android.permission.INTERNET") != 0) {
            C6895d.m26027d("ModelSpecificDistanceCalculator", "App has no android.permission.INTERNET permission.  Cannot check for distance model updates", new Object[0]);
        } else {
            new C6889g(this.f18983g, this.f18982f, new C6887e(this)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* renamed from: a */
    public double mo18728a(int i, double d) {
        C6885c cVar = this.f18979c;
        if (cVar != null) {
            return cVar.mo18728a(i, d);
        }
        C6895d.m26027d("ModelSpecificDistanceCalculator", "distance calculator has not been set", new Object[0]);
        return -1.0d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C6885c mo18734a(C6883a aVar) {
        this.f18984h.lock();
        try {
            return m25989b(aVar);
        } finally {
            this.f18984h.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo18735a(String str) {
        this.f18984h.lock();
        try {
            m25991b(str);
        } finally {
            this.f18984h.unlock();
        }
    }
}
