package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.formats.C1652d;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.ads.mediation.C1819b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p101d.p129g.p131b.p132a.p134b.C5468d;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Az */
public final class C2191Az implements C2305Ez {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f6713a;

    /* renamed from: b */
    private final C2533Mz f6714b;

    /* renamed from: c */
    private final long f6715c;

    /* renamed from: d */
    private final C3596wz f6716d;

    /* renamed from: e */
    private final C3568vz f6717e;

    /* renamed from: f */
    private zzjj f6718f;

    /* renamed from: g */
    private final zzjn f6719g;

    /* renamed from: h */
    private final Context f6720h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Object f6721i = new Object();

    /* renamed from: j */
    private final zzang f6722j;

    /* renamed from: k */
    private final boolean f6723k;

    /* renamed from: l */
    private final zzpl f6724l;

    /* renamed from: m */
    private final List<String> f6725m;

    /* renamed from: n */
    private final List<String> f6726n;

    /* renamed from: o */
    private final List<String> f6727o;

    /* renamed from: p */
    private final boolean f6728p;

    /* renamed from: q */
    private final boolean f6729q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C2626Pz f6730r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public int f6731s = -2;

    /* renamed from: t */
    private C2797Vz f6732t;

    public C2191Az(Context context, String str, C2533Mz mz, C3596wz wzVar, C3568vz vzVar, zzjj zzjj, zzjn zzjn, zzang zzang, boolean z, boolean z2, zzpl zzpl, List<String> list, List<String> list2, List<String> list3, boolean z3) {
        String str2 = str;
        C3596wz wzVar2 = wzVar;
        C3568vz vzVar2 = vzVar;
        this.f6720h = context;
        this.f6714b = mz;
        this.f6717e = vzVar2;
        this.f6713a = "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str) ? m9423b() : str2;
        this.f6716d = wzVar2;
        long j = vzVar2.f10425u;
        if (j != -1) {
            this.f6715c = j;
        } else {
            long j2 = wzVar2.f10480b;
            this.f6715c = j2 == -1 ? 10000 : j2;
        }
        this.f6718f = zzjj;
        this.f6719g = zzjn;
        this.f6722j = zzang;
        this.f6723k = z;
        this.f6728p = z2;
        this.f6724l = zzpl;
        this.f6725m = list;
        this.f6726n = list2;
        this.f6727o = list3;
        this.f6729q = z3;
    }

    /* renamed from: a */
    private static C2626Pz m9414a(C1819b bVar) {
        return new C3194jA(bVar);
    }

    /* renamed from: a */
    private final String m9417a(String str) {
        if (str != null && m9429e() && !m9424b(2)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                jSONObject.remove("cpm_floor_cents");
                return jSONObject.toString();
            } catch (JSONException unused) {
                C2227Cf.m9536d("Could not remove field. Returning the original value");
            }
        }
        return str;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m9419a(C3681zz zzVar) {
        String a = m9417a(this.f6717e.f10415k);
        try {
            if (this.f6722j.f10857c >= 4100000) {
                if (!this.f6723k) {
                    if (!this.f6717e.mo10155b()) {
                        if (this.f6719g.f10896d) {
                            this.f6730r.mo8715a(C5468d.m20961a(this.f6720h), this.f6718f, a, this.f6717e.f10405a, (C2712Sz) zzVar);
                            return;
                        } else if (!this.f6728p) {
                            this.f6730r.mo8718a(C5468d.m20961a(this.f6720h), this.f6719g, this.f6718f, a, this.f6717e.f10405a, zzVar);
                            return;
                        } else if (this.f6717e.f10419o != null) {
                            this.f6730r.mo8716a(C5468d.m20961a(this.f6720h), this.f6718f, a, this.f6717e.f10405a, zzVar, new zzpl(m9422b(this.f6717e.f10423s)), this.f6717e.f10422r);
                            return;
                        } else {
                            this.f6730r.mo8718a(C5468d.m20961a(this.f6720h), this.f6719g, this.f6718f, a, this.f6717e.f10405a, zzVar);
                            return;
                        }
                    }
                }
                ArrayList arrayList = new ArrayList(this.f6725m);
                if (this.f6726n != null) {
                    for (String next : this.f6726n) {
                        String str = ":false";
                        if (this.f6727o != null && this.f6727o.contains(next)) {
                            str = ":true";
                        }
                        StringBuilder sb = new StringBuilder(String.valueOf(next).length() + 7 + str.length());
                        sb.append("custom:");
                        sb.append(next);
                        sb.append(str);
                        arrayList.add(sb.toString());
                    }
                }
                this.f6730r.mo8716a(C5468d.m20961a(this.f6720h), this.f6718f, a, this.f6717e.f10405a, zzVar, this.f6724l, arrayList);
            } else if (this.f6719g.f10896d) {
                this.f6730r.mo8713a(C5468d.m20961a(this.f6720h), this.f6718f, a, zzVar);
            } else {
                this.f6730r.mo8717a(C5468d.m20961a(this.f6720h), this.f6719g, this.f6718f, a, (C2712Sz) zzVar);
            }
        } catch (RemoteException e) {
            C2227Cf.m9535c("Could not request ad from mediation adapter.", e);
            mo7858a(5);
        }
    }

    /* renamed from: b */
    private static C1652d m9422b(String str) {
        C1652d.C1653a aVar = new C1652d.C1653a();
        if (str == null) {
            return aVar.mo6624a();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i = 0;
            aVar.mo6623a(jSONObject.optBoolean("multiple_images", false));
            aVar.mo6626b(jSONObject.optBoolean("only_urls", false));
            String optString = jSONObject.optString("native_image_orientation", "any");
            if ("landscape".equals(optString)) {
                i = 2;
            } else if ("portrait".equals(optString)) {
                i = 1;
            } else if (!"any".equals(optString)) {
                i = -1;
            }
            aVar.mo6625b(i);
        } catch (JSONException e) {
            C2227Cf.m9535c("Exception occurred when creating native ad options", e);
        }
        return aVar.mo6624a();
    }

    /* renamed from: b */
    private final String m9423b() {
        try {
            return (TextUtils.isEmpty(this.f6717e.f10409e) || !this.f6714b.mo8521i(this.f6717e.f10409e)) ? "com.google.ads.mediation.customevent.CustomEventAdapter" : "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter";
        } catch (RemoteException unused) {
            C2227Cf.m9536d("Fail to determine the custom event's version, assuming the old one.");
        }
        return "com.google.ads.mediation.customevent.CustomEventAdapter";
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final boolean m9424b(int i) {
        try {
            Bundle ua = this.f6723k ? this.f6730r.mo8730ua() : this.f6719g.f10896d ? this.f6730r.getInterstitialAdapterInfo() : this.f6730r.zzmq();
            return ua != null && (ua.getInt("capabilities", 0) & i) == i;
        } catch (RemoteException unused) {
            C2227Cf.m9536d("Could not get adapter info. Returning false");
            return false;
        }
    }

    /* renamed from: c */
    private final C2797Vz m9426c() {
        if (this.f6731s != 0 || !m9429e()) {
            return null;
        }
        try {
            if (!(!m9424b(4) || this.f6732t == null || this.f6732t.mo7968Qa() == 0)) {
                return this.f6732t;
            }
        } catch (RemoteException unused) {
            C2227Cf.m9536d("Could not get cpm value from MediationResponseMetadata");
        }
        return new C2248Cz(m9431f());
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final C2626Pz m9427d() {
        String valueOf = String.valueOf(this.f6713a);
        C2227Cf.m9534c(valueOf.length() != 0 ? "Instantiating mediation adapter: ".concat(valueOf) : new String("Instantiating mediation adapter: "));
        if (!this.f6723k && !this.f6717e.mo10155b()) {
            if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7896gc)).booleanValue() && "com.google.ads.mediation.admob.AdMobAdapter".equals(this.f6713a)) {
                return m9414a((C1819b) new AdMobAdapter());
            }
            if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7902hc)).booleanValue() && "com.google.ads.mediation.AdUrlAdapter".equals(this.f6713a)) {
                return m9414a((C1819b) new AdUrlAdapter());
            }
            if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(this.f6713a)) {
                return new C3194jA(new zzzv());
            }
        }
        try {
            return this.f6714b.mo8520g(this.f6713a);
        } catch (RemoteException e) {
            String valueOf2 = String.valueOf(this.f6713a);
            C2227Cf.m9530a(valueOf2.length() != 0 ? "Could not instantiate mediation adapter: ".concat(valueOf2) : new String("Could not instantiate mediation adapter: "), e);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final boolean m9429e() {
        return this.f6716d.f10491m != -1;
    }

    /* renamed from: f */
    private final int m9431f() {
        String str = this.f6717e.f10415k;
        if (str == null) {
            return 0;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.f6713a)) {
                return jSONObject.optInt("cpm_cents", 0);
            }
            int optInt = m9424b(2) ? jSONObject.optInt("cpm_floor_cents", 0) : 0;
            return optInt == 0 ? jSONObject.optInt("penalized_average_cpm_cents", 0) : optInt;
        } catch (JSONException unused) {
            C2227Cf.m9536d("Could not convert to json. Returning 0");
            return 0;
        }
    }

    /* renamed from: a */
    public final C2276Dz mo7856a(long j, long j2) {
        C2276Dz dz;
        synchronized (this.f6721i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C3681zz zzVar = new C3681zz();
            C3114ge.f9351a.post(new C2219Bz(this, zzVar));
            long j3 = this.f6715c;
            while (this.f6731s == -2) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                long j4 = j3 - (elapsedRealtime2 - elapsedRealtime);
                long j5 = j2 - (elapsedRealtime2 - j);
                if (j4 <= 0 || j5 <= 0) {
                    C2227Cf.m9534c("Timed out waiting for adapter.");
                    this.f6731s = 3;
                } else {
                    try {
                        this.f6721i.wait(Math.min(j4, j5));
                    } catch (InterruptedException unused) {
                        this.f6731s = 5;
                    }
                }
            }
            dz = new C2276Dz(this.f6717e, this.f6730r, this.f6713a, zzVar, this.f6731s, m9426c(), C1697X.m7705l().mo7726b() - elapsedRealtime);
        }
        return dz;
    }

    /* renamed from: a */
    public final void mo7857a() {
        synchronized (this.f6721i) {
            try {
                if (this.f6730r != null) {
                    this.f6730r.destroy();
                }
            } catch (RemoteException e) {
                C2227Cf.m9535c("Could not destroy mediation adapter.", e);
            }
            this.f6731s = -1;
            this.f6721i.notify();
        }
    }

    /* renamed from: a */
    public final void mo7858a(int i) {
        synchronized (this.f6721i) {
            this.f6731s = i;
            this.f6721i.notify();
        }
    }

    /* renamed from: a */
    public final void mo7859a(int i, C2797Vz vz) {
        synchronized (this.f6721i) {
            this.f6731s = 0;
            this.f6732t = vz;
            this.f6721i.notify();
        }
    }
}
