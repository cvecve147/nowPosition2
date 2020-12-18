package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.internal.ads.C2188Aw;
import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C2302Ew;
import com.google.android.gms.internal.ads.C2388Hw;
import com.google.android.gms.internal.ads.C2472Kw;
import com.google.android.gms.internal.ads.C2478La;
import com.google.android.gms.internal.ads.C2533Mz;
import com.google.android.gms.internal.ads.C2558Nu;
import com.google.android.gms.internal.ads.C2560Nw;
import com.google.android.gms.internal.ads.C2791Vt;
import com.google.android.gms.internal.ads.C3114ge;
import com.google.android.gms.internal.ads.C3390pt;
import com.google.android.gms.internal.ads.C3562vt;
import com.google.android.gms.internal.ads.C3621xw;
import com.google.android.gms.internal.ads.C3675zt;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.internal.ads.zzpl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p013b.p018b.p028h.p039h.C1101r;

@C2478La
/* renamed from: com.google.android.gms.ads.internal.i */
public final class C1755i extends C3675zt {

    /* renamed from: a */
    private final Context f5745a;

    /* renamed from: b */
    private final C3562vt f5746b;

    /* renamed from: c */
    private final C2533Mz f5747c;

    /* renamed from: d */
    private final C3621xw f5748d;

    /* renamed from: e */
    private final C2560Nw f5749e;

    /* renamed from: f */
    private final C2188Aw f5750f;

    /* renamed from: g */
    private final C2472Kw f5751g;

    /* renamed from: h */
    private final zzjn f5752h;

    /* renamed from: i */
    private final PublisherAdViewOptions f5753i;

    /* renamed from: j */
    private final C1101r<String, C2388Hw> f5754j;

    /* renamed from: k */
    private final C1101r<String, C2302Ew> f5755k;

    /* renamed from: l */
    private final zzpl f5756l;

    /* renamed from: m */
    private final List<String> f5757m;

    /* renamed from: n */
    private final C2791Vt f5758n;

    /* renamed from: o */
    private final String f5759o;

    /* renamed from: p */
    private final zzang f5760p;

    /* renamed from: q */
    private WeakReference<C1703ba> f5761q;

    /* renamed from: r */
    private final C1804ua f5762r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final Object f5763s = new Object();

    C1755i(Context context, String str, C2533Mz mz, zzang zzang, C3562vt vtVar, C3621xw xwVar, C2560Nw nw, C2188Aw aw, C1101r<String, C2388Hw> rVar, C1101r<String, C2302Ew> rVar2, zzpl zzpl, C2791Vt vt, C1804ua uaVar, C2472Kw kw, zzjn zzjn, PublisherAdViewOptions publisherAdViewOptions) {
        this.f5745a = context;
        this.f5759o = str;
        this.f5747c = mz;
        this.f5760p = zzang;
        this.f5746b = vtVar;
        this.f5750f = aw;
        this.f5748d = xwVar;
        this.f5749e = nw;
        this.f5754j = rVar;
        this.f5755k = rVar2;
        this.f5756l = zzpl;
        this.f5757m = m7907dc();
        this.f5758n = vt;
        this.f5762r = uaVar;
        this.f5751g = kw;
        this.f5752h = zzjn;
        this.f5753i = publisherAdViewOptions;
        C2558Nu.m10773a(this.f5745a);
    }

    /* renamed from: a */
    private static void m7901a(Runnable runnable) {
        C3114ge.f9351a.post(runnable);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m7902b(zzjj zzjj, int i) {
        if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7879dd)).booleanValue() || this.f5749e == null) {
            Context context = this.f5745a;
            C1678D d = new C1678D(context, this.f5762r, zzjn.m14776a(context), this.f5759o, this.f5747c, this.f5760p);
            this.f5761q = new WeakReference<>(d);
            C3621xw xwVar = this.f5748d;
            C2061y.m9072a("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
            d.f5648f.f5631r = xwVar;
            C2560Nw nw = this.f5749e;
            C2061y.m9072a("setOnUnifiedNativeAdLoadedListener must be called on the main UI thread.");
            d.f5648f.f5633t = nw;
            C2188Aw aw = this.f5750f;
            C2061y.m9072a("setOnContentAdLoadedListener must be called on the main UI thread.");
            d.f5648f.f5632s = aw;
            C1101r<String, C2388Hw> rVar = this.f5754j;
            C2061y.m9072a("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
            d.f5648f.f5635v = rVar;
            d.mo6811b(this.f5746b);
            C1101r<String, C2302Ew> rVar2 = this.f5755k;
            C2061y.m9072a("setOnCustomClickListener must be called on the main UI thread.");
            d.f5648f.f5634u = rVar2;
            d.mo6755d(m7907dc());
            zzpl zzpl = this.f5756l;
            C2061y.m9072a("setNativeAdOptions must be called on the main UI thread.");
            d.f5648f.f5636w = zzpl;
            d.mo6810b(this.f5758n);
            d.mo6759j(i);
            d.mo6812b(zzjj);
            return;
        }
        m7908i(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: bc */
    public final boolean m7904bc() {
        return ((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7925lb)).booleanValue() && this.f5751g != null;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m7905c(zzjj zzjj) {
        if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7879dd)).booleanValue() || this.f5749e == null) {
            C1768oa oaVar = new C1768oa(this.f5745a, this.f5762r, this.f5752h, this.f5759o, this.f5747c, this.f5760p);
            this.f5761q = new WeakReference<>(oaVar);
            C2472Kw kw = this.f5751g;
            C2061y.m9072a("setOnPublisherAdViewLoadedListener must be called on the main UI thread.");
            oaVar.f5648f.f5639z = kw;
            PublisherAdViewOptions publisherAdViewOptions = this.f5753i;
            if (publisherAdViewOptions != null) {
                if (publisherAdViewOptions.mo6610c() != null) {
                    oaVar.mo6804a(this.f5753i.mo6610c());
                }
                oaVar.mo6817e(this.f5753i.mo6609b());
            }
            C3621xw xwVar = this.f5748d;
            C2061y.m9072a("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
            oaVar.f5648f.f5631r = xwVar;
            C2560Nw nw = this.f5749e;
            C2061y.m9072a("setOnUnifiedNativeAdLoadedListener must be called on the main UI thread.");
            oaVar.f5648f.f5633t = nw;
            C2188Aw aw = this.f5750f;
            C2061y.m9072a("setOnContentAdLoadedListener must be called on the main UI thread.");
            oaVar.f5648f.f5632s = aw;
            C1101r<String, C2388Hw> rVar = this.f5754j;
            C2061y.m9072a("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
            oaVar.f5648f.f5635v = rVar;
            C1101r<String, C2302Ew> rVar2 = this.f5755k;
            C2061y.m9072a("setOnCustomClickListener must be called on the main UI thread.");
            oaVar.f5648f.f5634u = rVar2;
            zzpl zzpl = this.f5756l;
            C2061y.m9072a("setNativeAdOptions must be called on the main UI thread.");
            oaVar.f5648f.f5636w = zzpl;
            oaVar.mo6982d(m7907dc());
            oaVar.mo6811b(this.f5746b);
            oaVar.mo6810b(this.f5758n);
            ArrayList arrayList = new ArrayList();
            if (m7906cc()) {
                arrayList.add(1);
            }
            if (this.f5751g != null) {
                arrayList.add(2);
            }
            oaVar.mo6983e((List<Integer>) arrayList);
            if (m7906cc()) {
                zzjj.f10877c.putBoolean("ina", true);
            }
            if (this.f5751g != null) {
                zzjj.f10877c.putBoolean("iba", true);
            }
            oaVar.mo6812b(zzjj);
            return;
        }
        m7908i(0);
    }

    /* renamed from: cc */
    private final boolean m7906cc() {
        if (this.f5748d != null || this.f5750f != null || this.f5749e != null) {
            return true;
        }
        C1101r<String, C2388Hw> rVar = this.f5754j;
        return rVar != null && rVar.size() > 0;
    }

    /* renamed from: dc */
    private final List<String> m7907dc() {
        ArrayList arrayList = new ArrayList();
        if (this.f5750f != null) {
            arrayList.add("1");
        }
        if (this.f5748d != null) {
            arrayList.add("2");
        }
        if (this.f5749e != null) {
            arrayList.add("6");
        }
        if (this.f5754j.size() > 0) {
            arrayList.add("3");
        }
        return arrayList;
    }

    /* renamed from: i */
    private final void m7908i(int i) {
        C3562vt vtVar = this.f5746b;
        if (vtVar != null) {
            try {
                vtVar.mo8803c(0);
            } catch (RemoteException e) {
                C2227Cf.m9535c("Failed calling onAdFailedToLoad.", e);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        return r2;
     */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo6950O() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f5763s
            monitor-enter(r0)
            java.lang.ref.WeakReference<com.google.android.gms.ads.internal.ba> r1 = r3.f5761q     // Catch:{ all -> 0x001a }
            r2 = 0
            if (r1 == 0) goto L_0x0018
            java.lang.ref.WeakReference<com.google.android.gms.ads.internal.ba> r1 = r3.f5761q     // Catch:{ all -> 0x001a }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x001a }
            com.google.android.gms.ads.internal.ba r1 = (com.google.android.gms.ads.internal.C1703ba) r1     // Catch:{ all -> 0x001a }
            if (r1 == 0) goto L_0x0016
            java.lang.String r2 = r1.mo6796O()     // Catch:{ all -> 0x001a }
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r2
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r2
        L_0x001a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.C1755i.mo6950O():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        return r2;
     */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo6951T() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f5763s
            monitor-enter(r0)
            java.lang.ref.WeakReference<com.google.android.gms.ads.internal.ba> r1 = r3.f5761q     // Catch:{ all -> 0x001a }
            r2 = 0
            if (r1 == 0) goto L_0x0018
            java.lang.ref.WeakReference<com.google.android.gms.ads.internal.ba> r1 = r3.f5761q     // Catch:{ all -> 0x001a }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x001a }
            com.google.android.gms.ads.internal.ba r1 = (com.google.android.gms.ads.internal.C1703ba) r1     // Catch:{ all -> 0x001a }
            if (r1 == 0) goto L_0x0016
            boolean r2 = r1.mo6799T()     // Catch:{ all -> 0x001a }
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r2
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r2
        L_0x001a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.C1755i.mo6951T():boolean");
    }

    /* renamed from: a */
    public final void mo6952a(zzjj zzjj) {
        m7901a((Runnable) new C1757j(this, zzjj));
    }

    /* renamed from: a */
    public final void mo6953a(zzjj zzjj, int i) {
        if (i > 0) {
            m7901a((Runnable) new C1759k(this, zzjj, i));
            return;
        }
        throw new IllegalArgumentException("Number of ads has to be more than 0");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        return r2;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo6954i() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f5763s
            monitor-enter(r0)
            java.lang.ref.WeakReference<com.google.android.gms.ads.internal.ba> r1 = r3.f5761q     // Catch:{ all -> 0x001a }
            r2 = 0
            if (r1 == 0) goto L_0x0018
            java.lang.ref.WeakReference<com.google.android.gms.ads.internal.ba> r1 = r3.f5761q     // Catch:{ all -> 0x001a }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x001a }
            com.google.android.gms.ads.internal.ba r1 = (com.google.android.gms.ads.internal.C1703ba) r1     // Catch:{ all -> 0x001a }
            if (r1 == 0) goto L_0x0016
            java.lang.String r2 = r1.mo6820i()     // Catch:{ all -> 0x001a }
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r2
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r2
        L_0x001a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.C1755i.mo6954i():java.lang.String");
    }
}
