package com.onesignal;

import android.os.Handler;
import android.os.HandlerThread;
import com.onesignal.C4264M;
import com.onesignal.C4306Xa;
import com.onesignal.C4416rb;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.Zb */
abstract class C4327Zb {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public boolean f12826a;

    /* renamed from: b */
    protected final Object f12827b = new C4298Ub(this);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public AtomicBoolean f12828c = new AtomicBoolean();

    /* renamed from: d */
    private ArrayList<C4306Xa.C4308b> f12829d = new ArrayList<>();

    /* renamed from: e */
    HashMap<Integer, C4329b> f12830e = new HashMap<>();

    /* renamed from: f */
    private final Object f12831f = new C4301Vb(this);

    /* renamed from: g */
    protected boolean f12832g = false;

    /* renamed from: h */
    protected C4280Ob f12833h;

    /* renamed from: i */
    protected C4280Ob f12834i;

    /* renamed from: com.onesignal.Zb$a */
    static class C4328a {

        /* renamed from: a */
        boolean f12835a;

        /* renamed from: b */
        JSONObject f12836b;

        C4328a(boolean z, JSONObject jSONObject) {
            this.f12835a = z;
            this.f12836b = jSONObject;
        }
    }

    /* renamed from: com.onesignal.Zb$b */
    class C4329b extends HandlerThread {

        /* renamed from: a */
        int f12837a;

        /* renamed from: b */
        Handler f12838b = null;

        /* renamed from: c */
        int f12839c;

        C4329b(int i) {
            super("OSH_NetworkHandlerThread");
            this.f12837a = i;
            start();
            this.f12838b = new Handler(getLooper());
        }

        /* renamed from: c */
        private Runnable m17276c() {
            if (this.f12837a != 0) {
                return null;
            }
            return new C4331_b(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo12454a() {
            boolean hasMessages;
            synchronized (this.f12838b) {
                boolean z = this.f12839c < 3;
                boolean hasMessages2 = this.f12838b.hasMessages(0);
                if (z && !hasMessages2) {
                    this.f12839c++;
                    this.f12838b.postDelayed(m17276c(), (long) (this.f12839c * 15000));
                }
                hasMessages = this.f12838b.hasMessages(0);
            }
            return hasMessages;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo12455b() {
            if (C4327Zb.this.f12826a) {
                synchronized (this.f12838b) {
                    this.f12839c = 0;
                    this.f12838b.removeCallbacksAndMessages((Object) null);
                    this.f12838b.postDelayed(m17276c(), 5000);
                }
            }
        }
    }

    C4327Zb() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17237a(int i) {
        if (i == 403) {
            C4306Xa.m17135a(C4306Xa.C4316j.FATAL, "403 error updating player, omitting further retries!");
            mo12402l();
        } else if (!mo12440a((Integer) 0).mo12454a()) {
            mo12402l();
        }
    }

    /* renamed from: a */
    private void m17239a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        String str2;
        if (str == null) {
            str2 = "players";
        } else {
            str2 = "players/" + str + "/on_session";
        }
        this.f12832g = true;
        mo12397a(jSONObject);
        C4416rb.m17506b(str2, jSONObject, (C4416rb.C4417a) new C4324Yb(this, jSONObject2, jSONObject, str));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m17240a(int i, String str, String str2) {
        if (i == 400 && str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                return jSONObject.has("errors") && jSONObject.optString("errors").contains(str2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m17244b(String str) {
        String str2 = "players/" + str + "/email_logout";
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = this.f12833h.f12693e;
            if (jSONObject2.has("email_auth_hash")) {
                jSONObject.put("email_auth_hash", jSONObject2.optString("email_auth_hash"));
            }
            JSONObject jSONObject3 = this.f12833h.f12694f;
            if (jSONObject3.has("parent_player_id")) {
                jSONObject.put("parent_player_id", jSONObject3.optString("parent_player_id"));
            }
            jSONObject.put("app_id", jSONObject3.optString("app_id"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C4416rb.m17506b(str2, jSONObject, (C4416rb.C4417a) new C4304Wb(this));
    }

    /* renamed from: b */
    private void m17245b(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        if (str == null) {
            Iterator<C4306Xa.C4308b> it = this.f12829d.iterator();
            while (it.hasNext()) {
                C4306Xa.C4308b next = it.next();
                if (next != null) {
                    next.mo12429a(new C4306Xa.C4320n(-1, "Unable to update tags: the current user is not registered with OneSignal"));
                }
            }
            this.f12829d.clear();
            return;
        }
        this.f12829d.clear();
        C4416rb.m17510d("players/" + str, jSONObject, new C4321Xb(this, jSONObject, (ArrayList) this.f12829d.clone(), jSONObject2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0073, code lost:
        if (r8 != false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0075, code lost:
        m17245b(r0, r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0079, code lost:
        m17239a(r0, r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m17247c(boolean r8) {
        /*
            r7 = this;
            java.lang.String r0 = r7.mo12398b()
            boolean r1 = r7.m17253p()
            if (r1 == 0) goto L_0x0010
            if (r0 == 0) goto L_0x0010
            r7.m17244b((java.lang.String) r0)
            return
        L_0x0010:
            com.onesignal.Ob r1 = r7.f12833h
            if (r1 != 0) goto L_0x0017
            r7.mo12450g()
        L_0x0017:
            r1 = 0
            if (r8 != 0) goto L_0x0022
            boolean r8 = r7.m17251n()
            if (r8 == 0) goto L_0x0022
            r8 = 1
            goto L_0x0023
        L_0x0022:
            r8 = r1
        L_0x0023:
            java.lang.Object r2 = r7.f12827b
            monitor-enter(r2)
            com.onesignal.Ob r3 = r7.f12833h     // Catch:{ all -> 0x007d }
            com.onesignal.Ob r4 = r7.mo12448e()     // Catch:{ all -> 0x007d }
            org.json.JSONObject r3 = r3.mo12379a((com.onesignal.C4280Ob) r4, (boolean) r8)     // Catch:{ all -> 0x007d }
            com.onesignal.Ob r4 = r7.f12833h     // Catch:{ all -> 0x007d }
            org.json.JSONObject r4 = r4.f12693e     // Catch:{ all -> 0x007d }
            com.onesignal.Ob r5 = r7.mo12448e()     // Catch:{ all -> 0x007d }
            org.json.JSONObject r5 = r5.f12693e     // Catch:{ all -> 0x007d }
            r6 = 0
            org.json.JSONObject r4 = r7.mo12441a((org.json.JSONObject) r4, (org.json.JSONObject) r5, (org.json.JSONObject) r6, (java.util.Set<java.lang.String>) r6)     // Catch:{ all -> 0x007d }
            if (r3 != 0) goto L_0x006b
            com.onesignal.Ob r8 = r7.f12833h     // Catch:{ all -> 0x007d }
            r8.mo12384b(r4, r6)     // Catch:{ all -> 0x007d }
            java.util.ArrayList<com.onesignal.Xa$b> r8 = r7.f12829d     // Catch:{ all -> 0x007d }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x007d }
        L_0x004c:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x0064
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x007d }
            com.onesignal.Xa$b r0 = (com.onesignal.C4306Xa.C4308b) r0     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x004c
            com.onesignal.Zb$a r3 = com.onesignal.C4421sb.m17514a((boolean) r1)     // Catch:{ all -> 0x007d }
            org.json.JSONObject r3 = r3.f12836b     // Catch:{ all -> 0x007d }
            r0.mo12430a((org.json.JSONObject) r3)     // Catch:{ all -> 0x007d }
            goto L_0x004c
        L_0x0064:
            java.util.ArrayList<com.onesignal.Xa$b> r8 = r7.f12829d     // Catch:{ all -> 0x007d }
            r8.clear()     // Catch:{ all -> 0x007d }
            monitor-exit(r2)     // Catch:{ all -> 0x007d }
            return
        L_0x006b:
            com.onesignal.Ob r1 = r7.mo12448e()     // Catch:{ all -> 0x007d }
            r1.mo12386c()     // Catch:{ all -> 0x007d }
            monitor-exit(r2)     // Catch:{ all -> 0x007d }
            if (r8 != 0) goto L_0x0079
            r7.m17245b(r0, r3, r4)
            goto L_0x007c
        L_0x0079:
            r7.m17239a((java.lang.String) r0, (org.json.JSONObject) r3, (org.json.JSONObject) r4)
        L_0x007c:
            return
        L_0x007d:
            r8 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x007d }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C4327Zb.m17247c(boolean):void");
    }

    /* renamed from: l */
    private void mo12402l() {
        JSONObject a = this.f12833h.mo12379a(this.f12834i, false);
        if (a != null) {
            mo12399b(a);
        }
        if (mo12448e().f12693e.optBoolean("logoutEmail", false)) {
            C4306Xa.m17209w();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void mo12418m() {
        C4306Xa.m17210x();
        mo12452i();
        mo12401j();
    }

    /* renamed from: n */
    private boolean m17251n() {
        return (mo12448e().f12693e.optBoolean("session") || mo12398b() == null) && !this.f12832g;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public void m17252o() {
        mo12448e().f12693e.remove("logoutEmail");
        this.f12834i.f12693e.remove("email_auth_hash");
        this.f12834i.f12694f.remove("parent_player_id");
        this.f12834i.mo12386c();
        this.f12833h.f12693e.remove("email_auth_hash");
        this.f12833h.f12694f.remove("parent_player_id");
        String optString = this.f12833h.f12694f.optString("email");
        this.f12833h.f12694f.remove("email");
        C4421sb.m17531l();
        C4306Xa.C4316j jVar = C4306Xa.C4316j.INFO;
        C4306Xa.m17135a(jVar, "Device successfully logged out of email: " + optString);
        C4306Xa.m17210x();
    }

    /* renamed from: p */
    private boolean m17253p() {
        return mo12448e().f12693e.optBoolean("logoutEmail", false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C4280Ob mo12439a() {
        synchronized (this.f12827b) {
            if (this.f12833h == null) {
                this.f12833h = mo12395a("CURRENT_STATE", true);
            }
        }
        return this.f12833h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C4280Ob mo12395a(String str, boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C4329b mo12440a(Integer num) {
        C4329b bVar;
        synchronized (this.f12831f) {
            if (!this.f12830e.containsKey(num)) {
                this.f12830e.put(num, new C4329b(num.intValue()));
            }
            bVar = this.f12830e.get(num);
        }
        return bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public JSONObject mo12441a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, Set<String> set) {
        JSONObject a;
        synchronized (this.f12827b) {
            a = C4255J.m16899a(jSONObject, jSONObject2, jSONObject3, set);
        }
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12442a(C4264M.C4270f fVar) {
        mo12449f().mo12381a(fVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo12396a(String str);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo12397a(JSONObject jSONObject);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12443a(boolean z) {
        boolean z2 = this.f12826a != z;
        this.f12826a = z;
        if (z2 && z) {
            mo12401j();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String mo12398b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo12399b(JSONObject jSONObject);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo12444b(boolean z) {
        this.f12828c.set(true);
        m17247c(z);
        this.f12828c.set(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo12445c() {
        return mo12448e().f12694f.optString("identifier", (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo12400c(JSONObject jSONObject);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo12446d(JSONObject jSONObject) {
        JSONObject jSONObject2 = mo12449f().f12694f;
        mo12441a(jSONObject2, jSONObject, jSONObject2, (Set<String>) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo12447d() {
        return mo12449f().f12693e.optBoolean("session");
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C4280Ob mo12448e() {
        synchronized (this.f12827b) {
            if (this.f12834i == null) {
                this.f12834i = mo12395a("TOSYNC_STATE", true);
            }
        }
        return this.f12834i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C4280Ob mo12449f() {
        if (this.f12834i == null) {
            this.f12834i = mo12439a().mo12378a("TOSYNC_STATE");
        }
        mo12401j();
        return this.f12834i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo12450g() {
        synchronized (this.f12827b) {
            if (this.f12833h == null) {
                this.f12833h = mo12395a("CURRENT_STATE", true);
            }
        }
        mo12448e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo12451h() {
        boolean z = false;
        if (this.f12834i == null) {
            return false;
        }
        synchronized (this.f12827b) {
            if (this.f12833h.mo12379a(this.f12834i, m17251n()) != null) {
                z = true;
            }
            this.f12834i.mo12386c();
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo12452i() {
        this.f12833h.f12694f = new JSONObject();
        this.f12833h.mo12386c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract void mo12401j();

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo12453k() {
        try {
            synchronized (this.f12827b) {
                mo12449f().f12693e.put("session", true);
                mo12449f().mo12386c();
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
