package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.common.C1993f;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.common.p072c.C1989c;
import com.google.android.gms.common.util.C2092n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.ed */
public final class C3056ed implements C3345od {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static List<Future<Void>> f9081a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    private static ScheduledExecutorService f9082b = Executors.newSingleThreadScheduledExecutor();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C2522Mo f9083c;

    /* renamed from: d */
    private final LinkedHashMap<String, C2757Uo> f9084d;

    /* renamed from: e */
    private final List<String> f9085e = new ArrayList();

    /* renamed from: f */
    private final List<String> f9086f = new ArrayList();

    /* renamed from: g */
    private final Context f9087g;

    /* renamed from: h */
    private final C3402qd f9088h;

    /* renamed from: i */
    private boolean f9089i;

    /* renamed from: j */
    private final zzaiq f9090j;

    /* renamed from: k */
    private final C3430rd f9091k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final Object f9092l = new Object();

    /* renamed from: m */
    private HashSet<String> f9093m = new HashSet<>();

    /* renamed from: n */
    private boolean f9094n = false;

    /* renamed from: o */
    private boolean f9095o = false;

    /* renamed from: p */
    private boolean f9096p = false;

    public C3056ed(Context context, zzang zzang, zzaiq zzaiq, String str, C3402qd qdVar) {
        C2061y.m9068a(zzaiq, (Object) "SafeBrowsing config is not present.");
        this.f9087g = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f9084d = new LinkedHashMap<>();
        this.f9088h = qdVar;
        this.f9090j = zzaiq;
        for (String lowerCase : this.f9090j.f10851e) {
            this.f9093m.add(lowerCase.toLowerCase(Locale.ENGLISH));
        }
        this.f9093m.remove("cookie".toLowerCase(Locale.ENGLISH));
        C2522Mo mo = new C2522Mo();
        mo.f7590c = 8;
        mo.f7592e = str;
        mo.f7593f = str;
        mo.f7595h = new C2552No();
        mo.f7595h.f7661c = this.f9090j.f10847a;
        C2786Vo vo = new C2786Vo();
        vo.f8458c = zzang.f10855a;
        vo.f8460e = Boolean.valueOf(C1989c.m8748b(this.f9087g).mo7518a());
        long b = (long) C1993f.m8774a().mo7535b(this.f9087g);
        if (b > 0) {
            vo.f8459d = Long.valueOf(b);
        }
        mo.f7605r = vo;
        this.f9083c = mo;
        this.f9091k = new C3430rd(this.f9087g, this.f9090j.f10854h, this);
    }

    /* renamed from: d */
    static final /* synthetic */ Void m12254d(String str) {
        return null;
    }

    /* renamed from: e */
    private final C2757Uo m12255e(String str) {
        C2757Uo uo;
        synchronized (this.f9092l) {
            uo = this.f9084d.get(str);
        }
        return uo;
    }

    /* renamed from: f */
    private final C2804Wf<Void> m12257f() {
        C2804Wf<Void> a;
        if (!((this.f9089i && this.f9090j.f10853g) || (this.f9096p && this.f9090j.f10852f) || (!this.f9089i && this.f9090j.f10850d))) {
            return C2483Lf.m10495a(null);
        }
        synchronized (this.f9092l) {
            this.f9083c.f7596i = new C2757Uo[this.f9084d.size()];
            this.f9084d.values().toArray(this.f9083c.f7596i);
            this.f9083c.f7606s = (String[]) this.f9085e.toArray(new String[0]);
            this.f9083c.f7607t = (String[]) this.f9086f.toArray(new String[0]);
            if (C3316nd.m13146a()) {
                String str = this.f9083c.f7592e;
                String str2 = this.f9083c.f7597j;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 53 + String.valueOf(str2).length());
                sb.append("Sending SB report\n  url: ");
                sb.append(str);
                sb.append("\n  clickUrl: ");
                sb.append(str2);
                sb.append("\n  resources: \n");
                StringBuilder sb2 = new StringBuilder(sb.toString());
                for (C2757Uo uo : this.f9083c.f7596i) {
                    sb2.append("    [");
                    sb2.append(uo.f8400l.length);
                    sb2.append("] ");
                    sb2.append(uo.f8393e);
                }
                C3316nd.m13145a(sb2.toString());
            }
            C2804Wf<String> a2 = new C2632Qe(this.f9087g).mo8740a(1, this.f9090j.f10848b, (Map<String, String>) null, C2408Io.m10310a((C2408Io) this.f9083c));
            if (C3316nd.m13146a()) {
                a2.mo8923a(new C3198jd(this), C3057ee.f9097a);
            }
            a = C2483Lf.m10498a(a2, C3113gd.f9350a, C2972bg.f8939b);
        }
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ C2804Wf mo9369a(Map map) {
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.f9092l) {
                            int length = optJSONArray.length();
                            C2757Uo e = m12255e(str);
                            if (e == null) {
                                String valueOf = String.valueOf(str);
                                C3316nd.m13145a(valueOf.length() != 0 ? "Cannot find the corresponding resource object for ".concat(valueOf) : new String("Cannot find the corresponding resource object for "));
                            } else {
                                e.f8400l = new String[length];
                                boolean z = false;
                                for (int i = 0; i < length; i++) {
                                    e.f8400l[i] = optJSONArray.getJSONObject(i).getString("threat_type");
                                }
                                boolean z2 = this.f9089i;
                                if (length > 0) {
                                    z = true;
                                }
                                this.f9089i = z | z2;
                            }
                        }
                    }
                }
            } catch (JSONException e2) {
                if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7738Fd)).booleanValue()) {
                    C2227Cf.m9530a("Failed to get SafeBrowsing metadata", e2);
                }
                return C2483Lf.m10494a((Throwable) new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.f9089i) {
            synchronized (this.f9092l) {
                this.f9083c.f7590c = 9;
            }
        }
        return m12257f();
    }

    /* renamed from: a */
    public final void mo9370a() {
        synchronized (this.f9092l) {
            C2804Wf<B> a = C2483Lf.m10497a(this.f9088h.mo9678a(this.f9087g, this.f9084d.keySet()), new C3084fd(this), C2972bg.f8939b);
            C2804Wf<V> a2 = C2483Lf.m10496a(a, 10, TimeUnit.SECONDS, f9082b);
            C2483Lf.m10502a(a, new C3169id(this, a2), C2972bg.f8939b);
            f9081a.add(a2);
        }
    }

    /* renamed from: a */
    public final void mo9371a(View view) {
        if (this.f9090j.f10849c && !this.f9095o) {
            C1697X.m7698e();
            Bitmap b = C3114ge.m12423b(view);
            if (b == null) {
                C3316nd.m13145a("Failed to capture the webview bitmap.");
                return;
            }
            this.f9095o = true;
            C3114ge.m12412a((Runnable) new C3141hd(this, b));
        }
    }

    /* renamed from: a */
    public final void mo9372a(String str) {
        synchronized (this.f9092l) {
            this.f9083c.f7597j = str;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9373a(java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8, int r9) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f9092l
            monitor-enter(r0)
            r1 = 3
            if (r9 != r1) goto L_0x0009
            r2 = 1
            r6.f9096p = r2     // Catch:{ all -> 0x00c6 }
        L_0x0009:
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.Uo> r2 = r6.f9084d     // Catch:{ all -> 0x00c6 }
            boolean r2 = r2.containsKey(r7)     // Catch:{ all -> 0x00c6 }
            if (r2 == 0) goto L_0x0023
            if (r9 != r1) goto L_0x0021
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.Uo> r8 = r6.f9084d     // Catch:{ all -> 0x00c6 }
            java.lang.Object r7 = r8.get(r7)     // Catch:{ all -> 0x00c6 }
            com.google.android.gms.internal.ads.Uo r7 = (com.google.android.gms.internal.ads.C2757Uo) r7     // Catch:{ all -> 0x00c6 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x00c6 }
            r7.f8399k = r8     // Catch:{ all -> 0x00c6 }
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x00c6 }
            return
        L_0x0023:
            com.google.android.gms.internal.ads.Uo r1 = new com.google.android.gms.internal.ads.Uo     // Catch:{ all -> 0x00c6 }
            r1.<init>()     // Catch:{ all -> 0x00c6 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x00c6 }
            r1.f8399k = r9     // Catch:{ all -> 0x00c6 }
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.Uo> r9 = r6.f9084d     // Catch:{ all -> 0x00c6 }
            int r9 = r9.size()     // Catch:{ all -> 0x00c6 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x00c6 }
            r1.f8392d = r9     // Catch:{ all -> 0x00c6 }
            r1.f8393e = r7     // Catch:{ all -> 0x00c6 }
            com.google.android.gms.internal.ads.Po r9 = new com.google.android.gms.internal.ads.Po     // Catch:{ all -> 0x00c6 }
            r9.<init>()     // Catch:{ all -> 0x00c6 }
            r1.f8394f = r9     // Catch:{ all -> 0x00c6 }
            java.util.HashSet<java.lang.String> r9 = r6.f9093m     // Catch:{ all -> 0x00c6 }
            int r9 = r9.size()     // Catch:{ all -> 0x00c6 }
            if (r9 <= 0) goto L_0x00bf
            if (r8 == 0) goto L_0x00bf
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x00c6 }
            r9.<init>()     // Catch:{ all -> 0x00c6 }
            java.util.Set r8 = r8.entrySet()     // Catch:{ all -> 0x00c6 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x00c6 }
        L_0x005a:
            boolean r2 = r8.hasNext()     // Catch:{ all -> 0x00c6 }
            if (r2 == 0) goto L_0x00b2
            java.lang.Object r2 = r8.next()     // Catch:{ all -> 0x00c6 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x00c6 }
            java.lang.Object r3 = r2.getKey()     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            if (r3 == 0) goto L_0x0073
            java.lang.Object r3 = r2.getKey()     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            goto L_0x0075
        L_0x0073:
            java.lang.String r3 = ""
        L_0x0075:
            java.lang.Object r4 = r2.getValue()     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            if (r4 == 0) goto L_0x0082
            java.lang.Object r2 = r2.getValue()     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            goto L_0x0084
        L_0x0082:
            java.lang.String r2 = ""
        L_0x0084:
            java.util.Locale r4 = java.util.Locale.ENGLISH     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            java.lang.String r4 = r3.toLowerCase(r4)     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            java.util.HashSet<java.lang.String> r5 = r6.f9093m     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            boolean r4 = r5.contains(r4)     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            if (r4 != 0) goto L_0x0093
            goto L_0x005a
        L_0x0093:
            com.google.android.gms.internal.ads.Oo r4 = new com.google.android.gms.internal.ads.Oo     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            r4.<init>()     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            java.lang.String r5 = "UTF-8"
            byte[] r3 = r3.getBytes(r5)     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            r4.f8069d = r3     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            java.lang.String r3 = "UTF-8"
            byte[] r2 = r2.getBytes(r3)     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            r4.f8070e = r2     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            r9.add(r4)     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            goto L_0x005a
        L_0x00ac:
            java.lang.String r2 = "Cannot convert string to bytes, skip header."
            com.google.android.gms.internal.ads.C3316nd.m13145a(r2)     // Catch:{ all -> 0x00c6 }
            goto L_0x005a
        L_0x00b2:
            int r8 = r9.size()     // Catch:{ all -> 0x00c6 }
            com.google.android.gms.internal.ads.Oo[] r8 = new com.google.android.gms.internal.ads.C2584Oo[r8]     // Catch:{ all -> 0x00c6 }
            r9.toArray(r8)     // Catch:{ all -> 0x00c6 }
            com.google.android.gms.internal.ads.Po r9 = r1.f8394f     // Catch:{ all -> 0x00c6 }
            r9.f8119d = r8     // Catch:{ all -> 0x00c6 }
        L_0x00bf:
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.Uo> r8 = r6.f9084d     // Catch:{ all -> 0x00c6 }
            r8.put(r7, r1)     // Catch:{ all -> 0x00c6 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c6 }
            return
        L_0x00c6:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c6 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3056ed.mo9373a(java.lang.String, java.util.Map, int):void");
    }

    /* renamed from: a */
    public final String[] mo9374a(String[] strArr) {
        return (String[]) this.f9091k.mo9964a(strArr).toArray(new String[0]);
    }

    /* renamed from: b */
    public final void mo9375b() {
        this.f9094n = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo9376b(String str) {
        synchronized (this.f9092l) {
            this.f9085e.add(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo9377c(String str) {
        synchronized (this.f9092l) {
            this.f9086f.add(str);
        }
    }

    /* renamed from: c */
    public final boolean mo9378c() {
        return C2092n.m9166g() && this.f9090j.f10849c && !this.f9095o;
    }

    /* renamed from: d */
    public final zzaiq mo9379d() {
        return this.f9090j;
    }
}
