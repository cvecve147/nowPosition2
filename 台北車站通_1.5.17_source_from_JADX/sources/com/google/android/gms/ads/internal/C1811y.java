package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.internal.ads.C2169Ae;
import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C2478La;
import com.google.android.gms.internal.ads.C2558Nu;
import com.google.android.gms.internal.ads.C2626Pz;
import com.google.android.gms.internal.ads.C2884Zc;
import com.google.android.gms.internal.ads.C2901Zt;
import com.google.android.gms.internal.ads.C2910_c;
import com.google.android.gms.internal.ads.C3390pt;
import com.google.android.gms.internal.ads.C3401qc;
import com.google.android.gms.internal.ads.C3568vz;
import com.google.android.gms.internal.ads.C3596wz;
import com.google.android.gms.internal.ads.zzang;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p101d.p129g.p131b.p132a.p134b.C5464b;
import p101d.p129g.p131b.p132a.p134b.C5468d;

@C2478La
/* renamed from: com.google.android.gms.ads.internal.y */
public final class C1811y extends C2901Zt {

    /* renamed from: a */
    private static final Object f5915a = new Object();

    /* renamed from: b */
    private static C1811y f5916b;

    /* renamed from: c */
    private final Context f5917c;

    /* renamed from: d */
    private final Object f5918d = new Object();

    /* renamed from: e */
    private boolean f5919e;

    /* renamed from: f */
    private zzang f5920f;

    private C1811y(Context context, zzang zzang) {
        this.f5917c = context;
        this.f5920f = zzang;
        this.f5919e = false;
    }

    /* renamed from: a */
    public static C1811y m8067a(Context context, zzang zzang) {
        C1811y yVar;
        synchronized (f5915a) {
            if (f5916b == null) {
                f5916b = new C1811y(context.getApplicationContext(), zzang);
            }
            yVar = f5916b;
        }
        return yVar;
    }

    /* renamed from: G */
    public final void mo7038G() {
        synchronized (f5915a) {
            if (this.f5919e) {
                C2227Cf.m9536d("Mobile ads is initialized already.");
                return;
            }
            this.f5919e = true;
            C2558Nu.m10773a(this.f5917c);
            C1697X.m7702i().mo8316a(this.f5917c, this.f5920f);
            C1697X.m7704k().mo9125a(this.f5917c);
        }
    }

    /* renamed from: a */
    public final void mo7039a(float f) {
        C1697X.m7691D().mo10230a(f);
    }

    /* renamed from: a */
    public final void mo7040a(C5464b bVar, String str) {
        if (bVar == null) {
            C2227Cf.m9529a("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) C5468d.m20962z(bVar);
        if (context == null) {
            C2227Cf.m9529a("Context is null. Failed to open debug menu.");
            return;
        }
        C2169Ae ae = new C2169Ae(context);
        ae.mo7809a(str);
        ae.mo7812b(this.f5920f.f10855a);
        ae.mo7806a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo7041a(Runnable runnable) {
        Context context = this.f5917c;
        C2061y.m9072a("Adapters must be initialized on the main thread.");
        Map<String, C3596wz> e = C1697X.m7702i().mo8333m().mo9158h().mo8258e();
        if (e != null && !e.isEmpty()) {
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    C2227Cf.m9535c("Could not initialize rewarded ads.", th);
                    return;
                }
            }
            C3401qc kc = C3401qc.m13500kc();
            if (kc != null) {
                Collection<C3596wz> values = e.values();
                HashMap hashMap = new HashMap();
                C5464b a = C5468d.m20961a(context);
                for (C3596wz wzVar : values) {
                    for (C3568vz next : wzVar.f10479a) {
                        String str = next.f10415k;
                        for (String next2 : next.f10407c) {
                            if (!hashMap.containsKey(next2)) {
                                hashMap.put(next2, new ArrayList());
                            }
                            if (str != null) {
                                ((Collection) hashMap.get(next2)).add(str);
                            }
                        }
                    }
                }
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str2 = (String) entry.getKey();
                    try {
                        C2884Zc q = kc.mo9926q(str2);
                        if (q != null) {
                            C2626Pz a2 = q.mo9113a();
                            if (!a2.isInitialized()) {
                                if (a2.mo8709Z()) {
                                    a2.mo8712a(a, (C2910_c) q.mo9114b(), (List<String>) (List) entry.getValue());
                                    String valueOf = String.valueOf(str2);
                                    C2227Cf.m9532b(valueOf.length() != 0 ? "Initialized rewarded video mediation adapter ".concat(valueOf) : new String("Initialized rewarded video mediation adapter "));
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 56);
                        sb.append("Failed to initialize rewarded video mediation adapter \"");
                        sb.append(str2);
                        sb.append("\"");
                        C2227Cf.m9535c(sb.toString(), th2);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo7042b(String str, C5464b bVar) {
        if (!TextUtils.isEmpty(str)) {
            C2558Nu.m10773a(this.f5917c);
            boolean booleanValue = ((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7951pd)).booleanValue() | ((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7871cb)).booleanValue();
            C1812z zVar = null;
            if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7871cb)).booleanValue()) {
                booleanValue = true;
                zVar = new C1812z(this, (Runnable) C5468d.m20962z(bVar));
            }
            if (booleanValue) {
                C1697X.m7706m().mo6901a(this.f5917c, this.f5920f, str, zVar);
            }
        }
    }

    /* renamed from: e */
    public final void mo7043e(String str) {
        C2558Nu.m10773a(this.f5917c);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7951pd)).booleanValue()) {
                C1697X.m7706m().mo6901a(this.f5917c, this.f5920f, str, (Runnable) null);
            }
        }
    }

    /* renamed from: f */
    public final void mo7044f(boolean z) {
        C1697X.m7691D().mo10231a(z);
    }

    /* renamed from: ma */
    public final float mo7045ma() {
        return C1697X.m7691D().mo10229a();
    }

    /* renamed from: ta */
    public final boolean mo7046ta() {
        return C1697X.m7691D().mo10232b();
    }
}
