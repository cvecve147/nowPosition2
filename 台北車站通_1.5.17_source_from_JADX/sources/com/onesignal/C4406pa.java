package com.onesignal;

import android.os.Build;
import com.onesignal.C4232Da;
import com.onesignal.C4306Xa;
import com.onesignal.C4347ba;
import com.onesignal.C4368ga;
import com.onesignal.C4416rb;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.apache.http.client.config.CookieSpecs;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.pa */
class C4406pa implements C4347ba.C4348a, C4232Da.C4233a {

    /* renamed from: a */
    private static ArrayList<String> f12982a = new C4374ha();

    /* renamed from: b */
    private static C4406pa f12983b;

    /* renamed from: c */
    C4244Ga f12984c = new C4244Ga(this);

    /* renamed from: d */
    private C4232Da f12985d = new C4232Da(this);

    /* renamed from: e */
    private ArrayList<C4364fa> f12986e = new ArrayList<>();

    /* renamed from: f */
    private final Set<String> f12987f = C4252Ia.m16878g();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Set<String> f12988g = C4252Ia.m16878g();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final Set<String> f12989h = C4252Ia.m16878g();

    /* renamed from: i */
    final ArrayList<C4364fa> f12990i = new ArrayList<>();

    /* renamed from: j */
    private boolean f12991j = true;

    /* renamed from: k */
    Date f12992k;

    protected C4406pa() {
        Set<String> a = C4370gb.m17352a(C4370gb.f12909a, "PREFS_OS_DISPLAYED_IAMS", (Set<String>) null);
        if (a != null) {
            this.f12987f.addAll(a);
        }
        Set<String> a2 = C4370gb.m17352a(C4370gb.f12909a, "PREFS_OS_IMPRESSIONED_IAMS", (Set<String>) null);
        if (a2 != null) {
            this.f12988g.addAll(a2);
        }
        Set<String> a3 = C4370gb.m17352a(C4370gb.f12909a, "PREFS_OS_CLICKED_CLICK_IDS_IAMS", (Set<String>) null);
        if (a3 != null) {
            this.f12989h.addAll(a3);
        }
    }

    /* renamed from: a */
    private void m17446a(C4364fa faVar, C4368ga gaVar) {
        String g = m17462g(faVar);
        if (g != null && !this.f12989h.contains(gaVar.f12898a)) {
            this.f12989h.add(gaVar.f12898a);
            try {
                C4394la laVar = new C4394la(this, gaVar, g);
                C4416rb.m17503a("in_app_messages/" + faVar.f12888a + "/click", (JSONObject) laVar, (C4416rb.C4417a) new C4397ma(this, gaVar));
            } catch (JSONException e) {
                e.printStackTrace();
                C4306Xa.m17154b(C4306Xa.C4316j.ERROR, "Unable to execute in-app message action HTTP request due to invalid JSON");
            }
        }
    }

    /* renamed from: a */
    private void m17447a(C4368ga gaVar) {
        String str = gaVar.f12901d;
        if (str != null && !str.isEmpty()) {
            C4368ga.C4369a aVar = gaVar.f12900c;
            if (aVar == C4368ga.C4369a.BROWSER) {
                C4252Ia.m16874b(gaVar.f12901d);
            } else if (aVar == C4368ga.C4369a.IN_APP_WEBVIEW) {
                C4339ab.m17287a(gaVar.f12901d, true);
            }
        }
    }

    /* renamed from: b */
    public static C4406pa m17450b() {
        if (Build.VERSION.SDK_INT <= 18) {
            f12983b = new C4411qa();
        }
        if (f12983b == null) {
            f12983b = new C4406pa();
        }
        return f12983b;
    }

    /* renamed from: b */
    private void m17452b(C4368ga gaVar) {
        if (C4306Xa.f12737F.f12784d != null) {
            C4252Ia.m16867a((Runnable) new C4389ka(this, gaVar));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m17453b(String str, int i, String str2) {
        C4306Xa.C4316j jVar = C4306Xa.C4316j.ERROR;
        C4306Xa.m17154b(jVar, "Encountered a " + i + " error while attempting in-app message " + str + " request: " + str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m17454b(String str, String str2) {
        C4306Xa.C4316j jVar = C4306Xa.C4316j.DEBUG;
        C4306Xa.m17154b(jVar, "Successful post for in-app message " + str + " request: " + str2);
    }

    /* renamed from: b */
    private void m17455b(JSONArray jSONArray) {
        ArrayList<C4364fa> arrayList = new ArrayList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(new C4364fa(jSONArray.getJSONObject(i)));
        }
        this.f12986e = arrayList;
        m17458e();
    }

    /* renamed from: c */
    private void m17456c(C4364fa faVar) {
        C4416rb.m17505b(m17457d(faVar), (C4416rb.C4417a) new C4400na(this, faVar), (String) null);
    }

    /* renamed from: d */
    private static String m17457d(C4364fa faVar) {
        String g = m17462g(faVar);
        if (g == null) {
            C4306Xa.C4316j jVar = C4306Xa.C4316j.ERROR;
            C4306Xa.m17154b(jVar, "Unable to find a variant for in-app message " + faVar.f12888a);
            return null;
        }
        return "in_app_messages/" + faVar.f12888a + "/variants/" + g + "/html?app_id=" + C4306Xa.f12757c;
    }

    /* renamed from: e */
    private void m17458e() {
        if (this.f12985d.mo12287a()) {
            Iterator<C4364fa> it = this.f12986e.iterator();
            while (it.hasNext()) {
                C4364fa next = it.next();
                if (this.f12984c.mo12295a(next)) {
                    m17459e(next);
                }
            }
        }
    }

    /* renamed from: e */
    private void m17459e(C4364fa faVar) {
        if (this.f12991j) {
            if (!this.f12987f.contains(faVar.f12888a) || faVar.f12893f) {
                m17461f(faVar);
                return;
            }
            C4306Xa.C4316j jVar = C4306Xa.C4316j.ERROR;
            C4306Xa.m17135a(jVar, "In-App message with id '" + faVar.f12888a + "' already displayed or is already preparing to be display!");
        }
    }

    /* renamed from: f */
    private Set<String> m17460f() {
        HashSet hashSet = new HashSet(this.f12987f);
        synchronized (this.f12990i) {
            Iterator<C4364fa> it = this.f12990i.iterator();
            while (it.hasNext()) {
                hashSet.remove(it.next().f12888a);
            }
        }
        return hashSet;
    }

    /* renamed from: f */
    private void m17461f(C4364fa faVar) {
        synchronized (this.f12990i) {
            this.f12990i.add(faVar);
            if (!faVar.f12893f) {
                this.f12987f.add(faVar.f12888a);
            }
            C4306Xa.C4316j jVar = C4306Xa.C4316j.DEBUG;
            C4306Xa.m17154b(jVar, "queueMessageForDisplay: " + this.f12990i);
            if (this.f12990i.size() <= 1) {
                m17456c(faVar);
            }
        }
    }

    /* renamed from: g */
    private static String m17462g(C4364fa faVar) {
        String c = C4252Ia.m16876c();
        Iterator<String> it = f12982a.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (faVar.f12889b.containsKey(next)) {
                HashMap hashMap = faVar.f12889b.get(next);
                if (!hashMap.containsKey(c)) {
                    c = CookieSpecs.DEFAULT;
                }
                return (String) hashMap.get(c);
            }
        }
        return null;
    }

    /* renamed from: g */
    private void m17463g() {
        C4370gb.m17360b(C4370gb.f12909a, "PREFS_OS_DISPLAYED_IAMS", m17460f());
    }

    /* renamed from: a */
    public void mo12471a() {
        m17458e();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12522a(com.onesignal.C4364fa r3) {
        /*
            r2 = this;
            java.util.ArrayList<com.onesignal.fa> r0 = r2.f12990i
            monitor-enter(r0)
            java.util.ArrayList<com.onesignal.fa> r1 = r2.f12990i     // Catch:{ all -> 0x0040 }
            boolean r1 = r1.remove(r3)     // Catch:{ all -> 0x0040 }
            if (r1 != 0) goto L_0x0018
            boolean r3 = r3.f12893f     // Catch:{ all -> 0x0040 }
            if (r3 != 0) goto L_0x0016
            com.onesignal.Xa$j r3 = com.onesignal.C4306Xa.C4316j.ERROR     // Catch:{ all -> 0x0040 }
            java.lang.String r1 = "An in-app message was removed from the display queue before it was finished displaying."
            com.onesignal.C4306Xa.m17135a((com.onesignal.C4306Xa.C4316j) r3, (java.lang.String) r1)     // Catch:{ all -> 0x0040 }
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            return
        L_0x0018:
            boolean r3 = r3.f12893f     // Catch:{ all -> 0x0040 }
            if (r3 != 0) goto L_0x001f
            r2.m17463g()     // Catch:{ all -> 0x0040 }
        L_0x001f:
            java.util.ArrayList<com.onesignal.fa> r3 = r2.f12990i     // Catch:{ all -> 0x0040 }
            int r3 = r3.size()     // Catch:{ all -> 0x0040 }
            if (r3 <= 0) goto L_0x0034
            java.util.ArrayList<com.onesignal.fa> r3 = r2.f12990i     // Catch:{ all -> 0x0040 }
            r1 = 0
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x0040 }
            com.onesignal.fa r3 = (com.onesignal.C4364fa) r3     // Catch:{ all -> 0x0040 }
            r2.m17456c(r3)     // Catch:{ all -> 0x0040 }
            goto L_0x003e
        L_0x0034:
            java.util.Date r3 = new java.util.Date     // Catch:{ all -> 0x0040 }
            r3.<init>()     // Catch:{ all -> 0x0040 }
            r2.f12992k = r3     // Catch:{ all -> 0x0040 }
            r2.m17458e()     // Catch:{ all -> 0x0040 }
        L_0x003e:
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            return
        L_0x0040:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C4406pa.mo12522a(com.onesignal.fa):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12523a(C4364fa faVar, JSONObject jSONObject) {
        C4368ga gaVar = new C4368ga(jSONObject);
        gaVar.f12902e = faVar.mo12499b();
        m17452b(gaVar);
        m17447a(gaVar);
        m17446a(faVar, gaVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12524a(String str) {
        C4416rb.m17501a("in_app_messages/device_preview?preview_id=" + str + "&app_id=" + C4306Xa.f12757c, (C4416rb.C4417a) new C4403oa(this), (String) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12525a(JSONArray jSONArray) {
        C4370gb.m17359b(C4370gb.f12909a, "PREFS_OS_CACHED_IAMS", jSONArray.toString());
        m17455b(jSONArray);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo12526b(C4364fa faVar) {
        if (!faVar.f12893f && !this.f12988g.contains(faVar.f12888a)) {
            this.f12988g.add(faVar.f12888a);
            String g = m17462g(faVar);
            if (g != null) {
                try {
                    C4378ia iaVar = new C4378ia(this, g);
                    C4416rb.m17503a("in_app_messages/" + faVar.f12888a + "/impression", (JSONObject) iaVar, (C4416rb.C4417a) new C4382ja(this, faVar));
                } catch (JSONException e) {
                    e.printStackTrace();
                    C4306Xa.m17154b(C4306Xa.C4316j.ERROR, "Unable to execute in-app message impression HTTP request due to invalid JSON");
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo12527b(C4364fa faVar, JSONObject jSONObject) {
        C4368ga gaVar = new C4368ga(jSONObject);
        gaVar.f12902e = faVar.mo12499b();
        m17452b(gaVar);
        m17447a(gaVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo12528c() {
        if (this.f12986e.isEmpty()) {
            String a = C4370gb.m17351a(C4370gb.f12909a, "PREFS_OS_CACHED_IAMS", (String) null);
            C4306Xa.C4316j jVar = C4306Xa.C4316j.DEBUG;
            C4306Xa.m17135a(jVar, "initWithCachedInAppMessages: " + a);
            if (a != null) {
                try {
                    m17455b(new JSONArray(a));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo12529d() {
        return this.f12990i.size() > 0;
    }
}
