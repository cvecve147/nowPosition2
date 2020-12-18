package com.onesignal;

import com.onesignal.C4264M;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.Ob */
abstract class C4280Ob {

    /* renamed from: a */
    private static final String[] f12689a = {"lat", "long", "loc_acc", "loc_type", "loc_bg", "loc_time_stamp", "ad_id"};

    /* renamed from: b */
    private static final Set<String> f12690b = new HashSet(Arrays.asList(f12689a));

    /* renamed from: c */
    private static final Object f12691c = new C4276Nb();

    /* renamed from: d */
    private String f12692d;

    /* renamed from: e */
    JSONObject f12693e;

    /* renamed from: f */
    JSONObject f12694f;

    C4280Ob(String str, boolean z) {
        this.f12692d = str;
        if (z) {
            m17002d();
            return;
        }
        this.f12693e = new JSONObject();
        this.f12694f = new JSONObject();
    }

    /* renamed from: a */
    private Set<String> m17000a(C4280Ob ob) {
        try {
            if (this.f12693e.optLong("loc_time_stamp") == ob.f12693e.getLong("loc_time_stamp")) {
                return null;
            }
            ob.f12694f.put("loc_bg", ob.f12693e.opt("loc_bg"));
            ob.f12694f.put("loc_time_stamp", ob.f12693e.opt("loc_time_stamp"));
            return f12690b;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static JSONObject m17001a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, Set<String> set) {
        JSONObject a;
        synchronized (f12691c) {
            a = C4255J.m16899a(jSONObject, jSONObject2, jSONObject3, set);
        }
        return a;
    }

    /* renamed from: d */
    private void m17002d() {
        String str;
        String str2;
        String a = C4370gb.m17351a(C4370gb.f12909a, "ONESIGNAL_USERSTATE_DEPENDVALYES_" + this.f12692d, (String) null);
        if (a == null) {
            this.f12693e = new JSONObject();
            try {
                boolean z = true;
                if (this.f12692d.equals("CURRENT_STATE")) {
                    str = C4370gb.f12909a;
                    str2 = "ONESIGNAL_SUBSCRIPTION";
                } else {
                    str = C4370gb.f12909a;
                    str2 = "ONESIGNAL_SYNCED_SUBSCRIPTION";
                }
                int a2 = C4370gb.m17347a(str, str2, 1);
                if (a2 == -2) {
                    z = false;
                    a2 = 1;
                }
                this.f12693e.put("subscribableStatus", a2);
                this.f12693e.put("userSubscribePref", z);
            } catch (JSONException unused) {
            }
        } else {
            try {
                this.f12693e = new JSONObject(a);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        String a3 = C4370gb.m17351a(C4370gb.f12909a, "ONESIGNAL_USERSTATE_SYNCVALYES_" + this.f12692d, (String) null);
        if (a3 == null) {
            try {
                this.f12694f = new JSONObject();
                this.f12694f.put("identifier", C4370gb.m17351a(C4370gb.f12909a, "GT_REGISTRATION_ID", (String) null));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        } else {
            this.f12694f = new JSONObject(a3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C4280Ob mo12378a(String str) {
        C4280Ob b = mo12383b(str);
        try {
            b.f12693e = new JSONObject(this.f12693e.toString());
            b.f12694f = new JSONObject(this.f12694f.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public JSONObject mo12379a(C4280Ob ob, boolean z) {
        mo12380a();
        ob.mo12380a();
        JSONObject a = m17001a(this.f12694f, ob.f12694f, (JSONObject) null, m17000a(ob));
        if (!z && a.toString().equals("{}")) {
            return null;
        }
        try {
            if (!a.has("app_id")) {
                a.put("app_id", this.f12694f.optString("app_id"));
            }
            if (this.f12694f.has("email_auth_hash")) {
                a.put("email_auth_hash", this.f12694f.optString("email_auth_hash"));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo12380a();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12381a(C4264M.C4270f fVar) {
        try {
            this.f12694f.put("lat", fVar.f12661a);
            this.f12694f.put("long", fVar.f12662b);
            this.f12694f.put("loc_acc", fVar.f12663c);
            this.f12694f.put("loc_type", fVar.f12664d);
            this.f12693e.put("loc_bg", fVar.f12665e);
            this.f12693e.put("loc_time_stamp", fVar.f12666f);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0023 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x007f */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12382a(org.json.JSONObject r7, org.json.JSONObject r8) {
        /*
            r6 = this;
            java.lang.Object r0 = f12691c
            monitor-enter(r0)
            java.lang.String r1 = "tags"
            boolean r1 = r7.has(r1)     // Catch:{ all -> 0x0081 }
            if (r1 == 0) goto L_0x007f
            org.json.JSONObject r1 = r6.f12694f     // Catch:{ all -> 0x0081 }
            java.lang.String r2 = "tags"
            boolean r1 = r1.has(r2)     // Catch:{ all -> 0x0081 }
            if (r1 == 0) goto L_0x0029
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0023 }
            org.json.JSONObject r2 = r6.f12694f     // Catch:{ JSONException -> 0x0023 }
            java.lang.String r3 = "tags"
            java.lang.String r2 = r2.optString(r3)     // Catch:{ JSONException -> 0x0023 }
            r1.<init>(r2)     // Catch:{ JSONException -> 0x0023 }
            goto L_0x002e
        L_0x0023:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x0081 }
            r1.<init>()     // Catch:{ all -> 0x0081 }
            goto L_0x002e
        L_0x0029:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x0081 }
            r1.<init>()     // Catch:{ all -> 0x0081 }
        L_0x002e:
            java.lang.String r2 = "tags"
            org.json.JSONObject r7 = r7.optJSONObject(r2)     // Catch:{ all -> 0x0081 }
            java.util.Iterator r2 = r7.keys()     // Catch:{ all -> 0x0081 }
        L_0x0038:
            boolean r3 = r2.hasNext()     // Catch:{ Throwable -> 0x007f }
            if (r3 == 0) goto L_0x0064
            java.lang.Object r3 = r2.next()     // Catch:{ Throwable -> 0x007f }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Throwable -> 0x007f }
            java.lang.String r4 = ""
            java.lang.String r5 = r7.optString(r3)     // Catch:{ Throwable -> 0x007f }
            boolean r4 = r4.equals(r5)     // Catch:{ Throwable -> 0x007f }
            if (r4 == 0) goto L_0x0054
            r1.remove(r3)     // Catch:{ Throwable -> 0x007f }
            goto L_0x0038
        L_0x0054:
            if (r8 == 0) goto L_0x005c
            boolean r4 = r8.has(r3)     // Catch:{ Throwable -> 0x007f }
            if (r4 != 0) goto L_0x0038
        L_0x005c:
            java.lang.String r4 = r7.optString(r3)     // Catch:{ Throwable -> 0x007f }
            r1.put(r3, r4)     // Catch:{ Throwable -> 0x007f }
            goto L_0x0038
        L_0x0064:
            java.lang.String r7 = r1.toString()     // Catch:{ Throwable -> 0x007f }
            java.lang.String r8 = "{}"
            boolean r7 = r7.equals(r8)     // Catch:{ Throwable -> 0x007f }
            if (r7 == 0) goto L_0x0078
            org.json.JSONObject r7 = r6.f12694f     // Catch:{ Throwable -> 0x007f }
            java.lang.String r8 = "tags"
            r7.remove(r8)     // Catch:{ Throwable -> 0x007f }
            goto L_0x007f
        L_0x0078:
            org.json.JSONObject r7 = r6.f12694f     // Catch:{ Throwable -> 0x007f }
            java.lang.String r8 = "tags"
            r7.put(r8, r1)     // Catch:{ Throwable -> 0x007f }
        L_0x007f:
            monitor-exit(r0)     // Catch:{ all -> 0x0081 }
            return
        L_0x0081:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0081 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C4280Ob.mo12382a(org.json.JSONObject, org.json.JSONObject):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract C4280Ob mo12383b(String str);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo12384b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null) {
            JSONObject jSONObject3 = this.f12693e;
            m17001a(jSONObject3, jSONObject, jSONObject3, (Set<String>) null);
        }
        if (jSONObject2 != null) {
            JSONObject jSONObject4 = this.f12694f;
            m17001a(jSONObject4, jSONObject2, jSONObject4, (Set<String>) null);
            mo12382a(jSONObject2, (JSONObject) null);
        }
        if (jSONObject != null || jSONObject2 != null) {
            mo12386c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract boolean mo12385b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo12386c() {
        synchronized (f12691c) {
            String str = C4370gb.f12909a;
            C4370gb.m17359b(str, "ONESIGNAL_USERSTATE_SYNCVALYES_" + this.f12692d, this.f12694f.toString());
            String str2 = C4370gb.f12909a;
            C4370gb.m17359b(str2, "ONESIGNAL_USERSTATE_DEPENDVALYES_" + this.f12692d, this.f12693e.toString());
        }
    }
}
