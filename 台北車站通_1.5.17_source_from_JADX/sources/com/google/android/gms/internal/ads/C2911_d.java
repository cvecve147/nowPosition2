package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.security.NetworkSecurityPolicy;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.common.util.C2092n;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C2478La
/* renamed from: com.google.android.gms.internal.ads._d */
public final class C2911_d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Object f8758a = new Object();

    /* renamed from: b */
    private C2804Wf<?> f8759b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public CopyOnWriteArraySet<C3027de> f8760c = new CopyOnWriteArraySet<>();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public SharedPreferences f8761d;

    /* renamed from: e */
    SharedPreferences.Editor f8762e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f8763f = false;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f8764g = true;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f8765h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f8766i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f8767j = false;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public String f8768k = "";
    /* access modifiers changed from: private */

    /* renamed from: l */
    public long f8769l = 0;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public long f8770m = 0;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public long f8771n = 0;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f8772o = -1;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public int f8773p = 0;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public Set<String> f8774q = Collections.emptySet();
    /* access modifiers changed from: private */

    /* renamed from: r */
    public JSONObject f8775r = new JSONObject();
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f8776s = true;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public boolean f8777t = true;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m11781a(Bundle bundle) {
        new C2970be(this, bundle).mo8107a();
    }

    /* access modifiers changed from: private */
    @TargetApi(23)
    /* renamed from: n */
    public static boolean m11806n() {
        return C2092n.m9169j() && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    /* renamed from: o */
    private final void m11808o() {
        C2804Wf<?> wf = this.f8759b;
        if (wf != null && !wf.isDone()) {
            try {
                this.f8759b.get(1, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                C2227Cf.m9535c("Interrupted while waiting for preferences loaded.", e);
            } catch (CancellationException | ExecutionException | TimeoutException e2) {
                C2227Cf.m9533b("Fail to initialize AdSharedPreferenceManager.", e2);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final Bundle m11809p() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("listener_registration_bundle", true);
        synchronized (this.f8758a) {
            bundle.putBoolean("use_https", this.f8764g);
            bundle.putBoolean("content_url_opted_out", this.f8776s);
            bundle.putBoolean("content_vertical_opted_out", this.f8777t);
            bundle.putBoolean("auto_collect_location", this.f8767j);
            bundle.putInt("version_code", this.f8773p);
            bundle.putStringArray("never_pool_slots", (String[]) this.f8774q.toArray(new String[this.f8774q.size()]));
            bundle.putString("app_settings_json", this.f8768k);
            bundle.putLong("app_settings_last_update_ms", this.f8769l);
            bundle.putLong("app_last_background_time_ms", this.f8770m);
            bundle.putInt("request_in_session_count", this.f8772o);
            bundle.putLong("first_ad_req_time_ms", this.f8771n);
            bundle.putString("native_advanced_settings", this.f8775r.toString());
            if (this.f8765h != null) {
                bundle.putString("content_url_hashes", this.f8765h);
            }
            if (this.f8766i != null) {
                bundle.putString("content_vertical_hashes", this.f8766i);
            }
        }
        return bundle;
    }

    /* renamed from: a */
    public final void mo9134a(int i) {
        m11808o();
        synchronized (this.f8758a) {
            if (this.f8773p != i) {
                this.f8773p = i;
                if (this.f8762e != null) {
                    this.f8762e.putInt("version_code", i);
                    this.f8762e.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putInt("version_code", i);
                m11781a(bundle);
            }
        }
    }

    /* renamed from: a */
    public final void mo9135a(long j) {
        m11808o();
        synchronized (this.f8758a) {
            if (this.f8770m != j) {
                this.f8770m = j;
                if (this.f8762e != null) {
                    this.f8762e.putLong("app_last_background_time_ms", j);
                    this.f8762e.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putLong("app_last_background_time_ms", j);
                m11781a(bundle);
            }
        }
    }

    /* renamed from: a */
    public final void mo9136a(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.f8759b = (C2804Wf) new C2942ae(this, context).mo8107a();
    }

    /* renamed from: a */
    public final void mo9137a(C3027de deVar) {
        synchronized (this.f8758a) {
            if (this.f8759b != null && this.f8759b.isDone()) {
                deVar.mo8317a(m11809p());
            }
            this.f8760c.add(deVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9138a(java.lang.String r4) {
        /*
            r3 = this;
            r3.m11808o()
            java.lang.Object r0 = r3.f8758a
            monitor-enter(r0)
            if (r4 == 0) goto L_0x0032
            java.lang.String r1 = r3.f8765h     // Catch:{ all -> 0x0034 }
            boolean r1 = r4.equals(r1)     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x0011
            goto L_0x0032
        L_0x0011:
            r3.f8765h = r4     // Catch:{ all -> 0x0034 }
            android.content.SharedPreferences$Editor r1 = r3.f8762e     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x0023
            android.content.SharedPreferences$Editor r1 = r3.f8762e     // Catch:{ all -> 0x0034 }
            java.lang.String r2 = "content_url_hashes"
            r1.putString(r2, r4)     // Catch:{ all -> 0x0034 }
            android.content.SharedPreferences$Editor r1 = r3.f8762e     // Catch:{ all -> 0x0034 }
            r1.apply()     // Catch:{ all -> 0x0034 }
        L_0x0023:
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ all -> 0x0034 }
            r1.<init>()     // Catch:{ all -> 0x0034 }
            java.lang.String r2 = "content_url_hashes"
            r1.putString(r2, r4)     // Catch:{ all -> 0x0034 }
            r3.m11781a((android.os.Bundle) r1)     // Catch:{ all -> 0x0034 }
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x0034:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2911_d.mo9138a(java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo9139a(String str, String str2, boolean z) {
        m11808o();
        synchronized (this.f8758a) {
            JSONArray optJSONArray = this.f8775r.optJSONArray(str);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            int length = optJSONArray.length();
            int i = 0;
            while (true) {
                if (i < optJSONArray.length()) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        if (!str2.equals(optJSONObject.optString("template_id"))) {
                            i++;
                        } else if (!z || optJSONObject.optBoolean("uses_media_view", false) != z) {
                            length = i;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z);
                jSONObject.put("timestamp_ms", C1697X.m7705l().mo7725a());
                optJSONArray.put(length, jSONObject);
                this.f8775r.put(str, optJSONArray);
            } catch (JSONException e) {
                C2227Cf.m9535c("Could not update native advanced settings", e);
            }
            if (this.f8762e != null) {
                this.f8762e.putString("native_advanced_settings", this.f8775r.toString());
                this.f8762e.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putString("native_advanced_settings", this.f8775r.toString());
            m11781a(bundle);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9140a(boolean r4) {
        /*
            r3 = this;
            r3.m11808o()
            java.lang.Object r0 = r3.f8758a
            monitor-enter(r0)
            boolean r1 = r3.f8764g     // Catch:{ all -> 0x0031 }
            if (r1 != r4) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            return
        L_0x000c:
            r3.f8764g = r4     // Catch:{ all -> 0x0031 }
            android.content.SharedPreferences$Editor r1 = r3.f8762e     // Catch:{ all -> 0x0031 }
            if (r1 == 0) goto L_0x001e
            android.content.SharedPreferences$Editor r1 = r3.f8762e     // Catch:{ all -> 0x0031 }
            java.lang.String r2 = "use_https"
            r1.putBoolean(r2, r4)     // Catch:{ all -> 0x0031 }
            android.content.SharedPreferences$Editor r1 = r3.f8762e     // Catch:{ all -> 0x0031 }
            r1.apply()     // Catch:{ all -> 0x0031 }
        L_0x001e:
            boolean r1 = r3.f8763f     // Catch:{ all -> 0x0031 }
            if (r1 != 0) goto L_0x002f
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ all -> 0x0031 }
            r1.<init>()     // Catch:{ all -> 0x0031 }
            java.lang.String r2 = "use_https"
            r1.putBoolean(r2, r4)     // Catch:{ all -> 0x0031 }
            r3.m11781a((android.os.Bundle) r1)     // Catch:{ all -> 0x0031 }
        L_0x002f:
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            return
        L_0x0031:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2911_d.mo9140a(boolean):void");
    }

    /* renamed from: a */
    public final boolean mo9141a() {
        boolean z;
        m11808o();
        synchronized (this.f8758a) {
            if (!this.f8764g) {
                if (!this.f8763f) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    public final void mo9142b(int i) {
        m11808o();
        synchronized (this.f8758a) {
            if (this.f8772o != i) {
                this.f8772o = i;
                if (this.f8762e != null) {
                    this.f8762e.putInt("request_in_session_count", i);
                    this.f8762e.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putInt("request_in_session_count", i);
                m11781a(bundle);
            }
        }
    }

    /* renamed from: b */
    public final void mo9143b(long j) {
        m11808o();
        synchronized (this.f8758a) {
            if (this.f8771n != j) {
                this.f8771n = j;
                if (this.f8762e != null) {
                    this.f8762e.putLong("first_ad_req_time_ms", j);
                    this.f8762e.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putLong("first_ad_req_time_ms", j);
                m11781a(bundle);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9144b(java.lang.String r4) {
        /*
            r3 = this;
            r3.m11808o()
            java.lang.Object r0 = r3.f8758a
            monitor-enter(r0)
            if (r4 == 0) goto L_0x0032
            java.lang.String r1 = r3.f8766i     // Catch:{ all -> 0x0034 }
            boolean r1 = r4.equals(r1)     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x0011
            goto L_0x0032
        L_0x0011:
            r3.f8766i = r4     // Catch:{ all -> 0x0034 }
            android.content.SharedPreferences$Editor r1 = r3.f8762e     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x0023
            android.content.SharedPreferences$Editor r1 = r3.f8762e     // Catch:{ all -> 0x0034 }
            java.lang.String r2 = "content_vertical_hashes"
            r1.putString(r2, r4)     // Catch:{ all -> 0x0034 }
            android.content.SharedPreferences$Editor r1 = r3.f8762e     // Catch:{ all -> 0x0034 }
            r1.apply()     // Catch:{ all -> 0x0034 }
        L_0x0023:
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ all -> 0x0034 }
            r1.<init>()     // Catch:{ all -> 0x0034 }
            java.lang.String r2 = "content_vertical_hashes"
            r1.putString(r2, r4)     // Catch:{ all -> 0x0034 }
            r3.m11781a((android.os.Bundle) r1)     // Catch:{ all -> 0x0034 }
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x0034:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2911_d.mo9144b(java.lang.String):void");
    }

    /* renamed from: b */
    public final void mo9145b(boolean z) {
        m11808o();
        synchronized (this.f8758a) {
            if (this.f8776s != z) {
                this.f8776s = z;
                if (this.f8762e != null) {
                    this.f8762e.putBoolean("content_url_opted_out", z);
                    this.f8762e.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("content_url_opted_out", this.f8776s);
                bundle.putBoolean("content_vertical_opted_out", this.f8777t);
                m11781a(bundle);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo9146b() {
        boolean z;
        m11808o();
        synchronized (this.f8758a) {
            z = this.f8776s;
        }
        return z;
    }

    /* renamed from: c */
    public final String mo9147c() {
        String str;
        m11808o();
        synchronized (this.f8758a) {
            str = this.f8765h;
        }
        return str;
    }

    /* renamed from: c */
    public final void mo9148c(String str) {
        m11808o();
        synchronized (this.f8758a) {
            if (!this.f8774q.contains(str)) {
                this.f8774q.add(str);
                if (this.f8762e != null) {
                    this.f8762e.putStringSet("never_pool_slots", this.f8774q);
                    this.f8762e.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putStringArray("never_pool_slots", (String[]) this.f8774q.toArray(new String[this.f8774q.size()]));
                m11781a(bundle);
            }
        }
    }

    /* renamed from: c */
    public final void mo9149c(boolean z) {
        m11808o();
        synchronized (this.f8758a) {
            if (this.f8777t != z) {
                this.f8777t = z;
                if (this.f8762e != null) {
                    this.f8762e.putBoolean("content_vertical_opted_out", z);
                    this.f8762e.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("content_url_opted_out", this.f8776s);
                bundle.putBoolean("content_vertical_opted_out", this.f8777t);
                m11781a(bundle);
            }
        }
    }

    /* renamed from: d */
    public final void mo9150d(String str) {
        m11808o();
        synchronized (this.f8758a) {
            if (this.f8774q.contains(str)) {
                this.f8774q.remove(str);
                if (this.f8762e != null) {
                    this.f8762e.putStringSet("never_pool_slots", this.f8774q);
                    this.f8762e.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putStringArray("never_pool_slots", (String[]) this.f8774q.toArray(new String[this.f8774q.size()]));
                m11781a(bundle);
            }
        }
    }

    /* renamed from: d */
    public final void mo9151d(boolean z) {
        m11808o();
        synchronized (this.f8758a) {
            if (this.f8767j != z) {
                this.f8767j = z;
                if (this.f8762e != null) {
                    this.f8762e.putBoolean("auto_collect_location", z);
                    this.f8762e.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("auto_collect_location", z);
                m11781a(bundle);
            }
        }
    }

    /* renamed from: d */
    public final boolean mo9152d() {
        boolean z;
        m11808o();
        synchronized (this.f8758a) {
            z = this.f8777t;
        }
        return z;
    }

    /* renamed from: e */
    public final String mo9153e() {
        String str;
        m11808o();
        synchronized (this.f8758a) {
            str = this.f8766i;
        }
        return str;
    }

    /* renamed from: e */
    public final boolean mo9154e(String str) {
        boolean contains;
        m11808o();
        synchronized (this.f8758a) {
            contains = this.f8774q.contains(str);
        }
        return contains;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9155f(java.lang.String r6) {
        /*
            r5 = this;
            r5.m11808o()
            java.lang.Object r0 = r5.f8758a
            monitor-enter(r0)
            com.google.android.gms.common.util.e r1 = com.google.android.gms.ads.internal.C1697X.m7705l()     // Catch:{ all -> 0x004a }
            long r1 = r1.mo7725a()     // Catch:{ all -> 0x004a }
            r5.f8769l = r1     // Catch:{ all -> 0x004a }
            if (r6 == 0) goto L_0x0048
            java.lang.String r3 = r5.f8768k     // Catch:{ all -> 0x004a }
            boolean r3 = r6.equals(r3)     // Catch:{ all -> 0x004a }
            if (r3 == 0) goto L_0x001b
            goto L_0x0048
        L_0x001b:
            r5.f8768k = r6     // Catch:{ all -> 0x004a }
            android.content.SharedPreferences$Editor r3 = r5.f8762e     // Catch:{ all -> 0x004a }
            if (r3 == 0) goto L_0x0034
            android.content.SharedPreferences$Editor r3 = r5.f8762e     // Catch:{ all -> 0x004a }
            java.lang.String r4 = "app_settings_json"
            r3.putString(r4, r6)     // Catch:{ all -> 0x004a }
            android.content.SharedPreferences$Editor r3 = r5.f8762e     // Catch:{ all -> 0x004a }
            java.lang.String r4 = "app_settings_last_update_ms"
            r3.putLong(r4, r1)     // Catch:{ all -> 0x004a }
            android.content.SharedPreferences$Editor r3 = r5.f8762e     // Catch:{ all -> 0x004a }
            r3.apply()     // Catch:{ all -> 0x004a }
        L_0x0034:
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ all -> 0x004a }
            r3.<init>()     // Catch:{ all -> 0x004a }
            java.lang.String r4 = "app_settings_json"
            r3.putString(r4, r6)     // Catch:{ all -> 0x004a }
            java.lang.String r6 = "app_settings_last_update_ms"
            r3.putLong(r6, r1)     // Catch:{ all -> 0x004a }
            r5.m11781a((android.os.Bundle) r3)     // Catch:{ all -> 0x004a }
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return
        L_0x0048:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return
        L_0x004a:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2911_d.mo9155f(java.lang.String):void");
    }

    /* renamed from: f */
    public final boolean mo9156f() {
        boolean z;
        m11808o();
        synchronized (this.f8758a) {
            z = this.f8767j;
        }
        return z;
    }

    /* renamed from: g */
    public final int mo9157g() {
        int i;
        m11808o();
        synchronized (this.f8758a) {
            i = this.f8773p;
        }
        return i;
    }

    /* renamed from: h */
    public final C2369Hd mo9158h() {
        C2369Hd hd;
        m11808o();
        synchronized (this.f8758a) {
            hd = new C2369Hd(this.f8768k, this.f8769l);
        }
        return hd;
    }

    /* renamed from: i */
    public final long mo9159i() {
        long j;
        m11808o();
        synchronized (this.f8758a) {
            j = this.f8770m;
        }
        return j;
    }

    /* renamed from: j */
    public final int mo9160j() {
        int i;
        m11808o();
        synchronized (this.f8758a) {
            i = this.f8772o;
        }
        return i;
    }

    /* renamed from: k */
    public final long mo9161k() {
        long j;
        m11808o();
        synchronized (this.f8758a) {
            j = this.f8771n;
        }
        return j;
    }

    /* renamed from: l */
    public final JSONObject mo9162l() {
        JSONObject jSONObject;
        m11808o();
        synchronized (this.f8758a) {
            jSONObject = this.f8775r;
        }
        return jSONObject;
    }

    /* renamed from: m */
    public final void mo9163m() {
        m11808o();
        synchronized (this.f8758a) {
            this.f8775r = new JSONObject();
            if (this.f8762e != null) {
                this.f8762e.remove("native_advanced_settings");
                this.f8762e.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putString("native_advanced_settings", "{}");
            m11781a(bundle);
        }
    }
}
