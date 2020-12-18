package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.C1813j;
import com.google.android.gms.ads.formats.C1649c;
import com.google.android.gms.ads.formats.C1663j;
import java.util.ArrayList;
import java.util.List;
import p101d.p129g.p131b.p132a.p134b.C5464b;
import p101d.p129g.p131b.p132a.p134b.C5468d;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Vw */
public final class C2794Vw extends C1663j {

    /* renamed from: a */
    private final C2709Sw f8469a;

    /* renamed from: b */
    private final List<C1649c.C1651b> f8470b = new ArrayList();

    /* renamed from: c */
    private final C2989bw f8471c;

    /* renamed from: d */
    private final C1813j f8472d = new C1813j();

    /* renamed from: e */
    private final C1649c.C1650a f8473e;

    /* JADX WARNING: type inference failed for: r3v3, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0078 A[Catch:{ RemoteException -> 0x0085 }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2794Vw(com.google.android.gms.internal.ads.C2709Sw r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r5.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f8470b = r1
            com.google.android.gms.ads.j r1 = new com.google.android.gms.ads.j
            r1.<init>()
            r5.f8472d = r1
            r5.f8469a = r6
            r6 = 0
            com.google.android.gms.internal.ads.Sw r1 = r5.f8469a     // Catch:{ RemoteException -> 0x0057 }
            java.util.List r1 = r1.mo8859a()     // Catch:{ RemoteException -> 0x0057 }
            if (r1 == 0) goto L_0x005b
            java.util.Iterator r1 = r1.iterator()     // Catch:{ RemoteException -> 0x0057 }
        L_0x0022:
            boolean r2 = r1.hasNext()     // Catch:{ RemoteException -> 0x0057 }
            if (r2 == 0) goto L_0x005b
            java.lang.Object r2 = r1.next()     // Catch:{ RemoteException -> 0x0057 }
            boolean r3 = r2 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x0057 }
            if (r3 == 0) goto L_0x0049
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ RemoteException -> 0x0057 }
            if (r2 == 0) goto L_0x0049
            java.lang.String r3 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)     // Catch:{ RemoteException -> 0x0057 }
            boolean r4 = r3 instanceof com.google.android.gms.internal.ads.C2903Zv     // Catch:{ RemoteException -> 0x0057 }
            if (r4 == 0) goto L_0x0042
            r2 = r3
            com.google.android.gms.internal.ads.Zv r2 = (com.google.android.gms.internal.ads.C2903Zv) r2     // Catch:{ RemoteException -> 0x0057 }
            goto L_0x004a
        L_0x0042:
            com.google.android.gms.internal.ads.aw r3 = new com.google.android.gms.internal.ads.aw     // Catch:{ RemoteException -> 0x0057 }
            r3.<init>(r2)     // Catch:{ RemoteException -> 0x0057 }
            r2 = r3
            goto L_0x004a
        L_0x0049:
            r2 = r6
        L_0x004a:
            if (r2 == 0) goto L_0x0022
            java.util.List<com.google.android.gms.ads.formats.c$b> r3 = r5.f8470b     // Catch:{ RemoteException -> 0x0057 }
            com.google.android.gms.internal.ads.bw r4 = new com.google.android.gms.internal.ads.bw     // Catch:{ RemoteException -> 0x0057 }
            r4.<init>(r2)     // Catch:{ RemoteException -> 0x0057 }
            r3.add(r4)     // Catch:{ RemoteException -> 0x0057 }
            goto L_0x0022
        L_0x0057:
            r1 = move-exception
            com.google.android.gms.internal.ads.C2227Cf.m9533b(r0, r1)
        L_0x005b:
            com.google.android.gms.internal.ads.Sw r1 = r5.f8469a     // Catch:{ RemoteException -> 0x0069 }
            com.google.android.gms.internal.ads.Zv r1 = r1.mo8874t()     // Catch:{ RemoteException -> 0x0069 }
            if (r1 == 0) goto L_0x006d
            com.google.android.gms.internal.ads.bw r2 = new com.google.android.gms.internal.ads.bw     // Catch:{ RemoteException -> 0x0069 }
            r2.<init>(r1)     // Catch:{ RemoteException -> 0x0069 }
            goto L_0x006e
        L_0x0069:
            r1 = move-exception
            com.google.android.gms.internal.ads.C2227Cf.m9533b(r0, r1)
        L_0x006d:
            r2 = r6
        L_0x006e:
            r5.f8471c = r2
            com.google.android.gms.internal.ads.Sw r1 = r5.f8469a     // Catch:{ RemoteException -> 0x0085 }
            com.google.android.gms.internal.ads.Vv r1 = r1.mo8872j()     // Catch:{ RemoteException -> 0x0085 }
            if (r1 == 0) goto L_0x0089
            com.google.android.gms.internal.ads.Yv r1 = new com.google.android.gms.internal.ads.Yv     // Catch:{ RemoteException -> 0x0085 }
            com.google.android.gms.internal.ads.Sw r2 = r5.f8469a     // Catch:{ RemoteException -> 0x0085 }
            com.google.android.gms.internal.ads.Vv r2 = r2.mo8872j()     // Catch:{ RemoteException -> 0x0085 }
            r1.<init>(r2)     // Catch:{ RemoteException -> 0x0085 }
            r6 = r1
            goto L_0x0089
        L_0x0085:
            r1 = move-exception
            com.google.android.gms.internal.ads.C2227Cf.m9533b(r0, r1)
        L_0x0089:
            r5.f8473e = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2794Vw.<init>(com.google.android.gms.internal.ads.Sw):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public final C5464b mo6666k() {
        try {
            return this.f8469a.mo8876x();
        } catch (RemoteException e) {
            C2227Cf.m9533b("", e);
            return null;
        }
    }

    /* renamed from: a */
    public final String mo6656a() {
        try {
            return this.f8469a.mo8877y();
        } catch (RemoteException e) {
            C2227Cf.m9533b("", e);
            return null;
        }
    }

    /* renamed from: b */
    public final String mo6657b() {
        try {
            return this.f8469a.mo8870h();
        } catch (RemoteException e) {
            C2227Cf.m9533b("", e);
            return null;
        }
    }

    /* renamed from: c */
    public final String mo6658c() {
        try {
            return this.f8469a.mo8865d();
        } catch (RemoteException e) {
            C2227Cf.m9533b("", e);
            return null;
        }
    }

    /* renamed from: d */
    public final String mo6659d() {
        try {
            return this.f8469a.mo8862b();
        } catch (RemoteException e) {
            C2227Cf.m9533b("", e);
            return null;
        }
    }

    /* renamed from: e */
    public final C1649c.C1651b mo6660e() {
        return this.f8471c;
    }

    /* renamed from: f */
    public final List<C1649c.C1651b> mo6661f() {
        return this.f8470b;
    }

    /* renamed from: g */
    public final String mo6662g() {
        try {
            return this.f8469a.mo8873s();
        } catch (RemoteException e) {
            C2227Cf.m9533b("", e);
            return null;
        }
    }

    /* renamed from: h */
    public final Double mo6663h() {
        try {
            double u = this.f8469a.mo8875u();
            if (u == -1.0d) {
                return null;
            }
            return Double.valueOf(u);
        } catch (RemoteException e) {
            C2227Cf.m9533b("", e);
            return null;
        }
    }

    /* renamed from: i */
    public final String mo6664i() {
        try {
            return this.f8469a.mo8878z();
        } catch (RemoteException e) {
            C2227Cf.m9533b("", e);
            return null;
        }
    }

    /* renamed from: j */
    public final C1813j mo6665j() {
        try {
            if (this.f8469a.getVideoController() != null) {
                this.f8472d.mo7051a(this.f8469a.getVideoController());
            }
        } catch (RemoteException e) {
            C2227Cf.m9533b("Exception occurred while getting video controller", e);
        }
        return this.f8472d;
    }

    /* renamed from: l */
    public final Object mo6667l() {
        try {
            C5464b c = this.f8469a.mo8863c();
            if (c != null) {
                return C5468d.m20962z(c);
            }
            return null;
        } catch (RemoteException e) {
            C2227Cf.m9533b("", e);
            return null;
        }
    }
}
