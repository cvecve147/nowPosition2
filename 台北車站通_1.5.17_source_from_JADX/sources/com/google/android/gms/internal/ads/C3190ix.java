package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.C1697X;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.ix */
public final class C3190ix implements C3305mu {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C3048dx f9531a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f9532b;

    /* renamed from: c */
    private final Context f9533c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Object f9534d = new Object();

    public C3190ix(Context context) {
        this.f9533c = context;
    }

    /* renamed from: a */
    private final Future<ParcelFileDescriptor> m12678a(zzsg zzsg) {
        C3223jx jxVar = new C3223jx(this);
        C3251kx kxVar = new C3251kx(this, jxVar, zzsg);
        C3337nx nxVar = new C3337nx(this, jxVar);
        synchronized (this.f9534d) {
            this.f9531a = new C3048dx(this.f9533c, C1697X.m7713t().mo9309b(), kxVar, nxVar);
            this.f9531a.mo7630m();
        }
        return jxVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m12679a() {
        synchronized (this.f9534d) {
            if (this.f9531a != null) {
                this.f9531a.mo7608a();
                this.f9531a = null;
                Binder.flushPendingCommands();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final C2272Dv mo8398a(C2216Bw<?> bw) {
        C2272Dv dv;
        zzsg a = zzsg.m14781a(bw);
        long intValue = (long) ((Integer) C3390pt.m13458f().mo8515a(C2558Nu.f7827Ud)).intValue();
        long b = C1697X.m7705l().mo7726b();
        try {
            zzsi zzsi = (zzsi) new zzaev(m12678a(a).get(intValue, TimeUnit.MILLISECONDS)).mo10292a(zzsi.CREATOR);
            if (!zzsi.f10917a) {
                if (zzsi.f10921e.length != zzsi.f10922f.length) {
                    dv = null;
                } else {
                    HashMap hashMap = new HashMap();
                    for (int i = 0; i < zzsi.f10921e.length; i++) {
                        hashMap.put(zzsi.f10921e[i], zzsi.f10922f[i]);
                    }
                    dv = new C2272Dv(zzsi.f10919c, zzsi.f10920d, (Map<String, String>) hashMap, zzsi.f10923g, zzsi.f10924h);
                }
                StringBuilder sb = new StringBuilder(52);
                sb.append("Http assets remote cache took ");
                sb.append(C1697X.m7705l().mo7726b() - b);
                sb.append("ms");
                C2857Yd.m11615f(sb.toString());
                return dv;
            }
            throw new C3024db(zzsi.f10918b);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            StringBuilder sb2 = new StringBuilder(52);
            sb2.append("Http assets remote cache took ");
            sb2.append(C1697X.m7705l().mo7726b() - b);
            sb2.append("ms");
            C2857Yd.m11615f(sb2.toString());
            return null;
        } catch (Throwable th) {
            StringBuilder sb3 = new StringBuilder(52);
            sb3.append("Http assets remote cache took ");
            sb3.append(C1697X.m7705l().mo7726b() - b);
            sb3.append("ms");
            C2857Yd.m11615f(sb3.toString());
            throw th;
        }
    }
}
