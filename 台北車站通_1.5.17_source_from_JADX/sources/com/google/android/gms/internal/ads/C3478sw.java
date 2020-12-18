package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.C1813j;
import com.google.android.gms.ads.formats.C1649c;
import com.google.android.gms.ads.formats.C1658h;
import java.util.ArrayList;
import java.util.List;
import p101d.p129g.p131b.p132a.p134b.C5464b;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.sw */
public final class C3478sw extends C1658h {

    /* renamed from: a */
    private final C3393pw f10231a;

    /* renamed from: b */
    private final List<C1649c.C1651b> f10232b = new ArrayList();

    /* renamed from: c */
    private final C2989bw f10233c;

    /* renamed from: d */
    private final C1813j f10234d = new C1813j();

    /* renamed from: e */
    private final C1649c.C1650a f10235e;

    /* JADX WARNING: type inference failed for: r3v3, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0078 A[Catch:{ RemoteException -> 0x0085 }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3478sw(com.google.android.gms.internal.ads.C3393pw r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r5.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f10232b = r1
            com.google.android.gms.ads.j r1 = new com.google.android.gms.ads.j
            r1.<init>()
            r5.f10234d = r1
            r5.f10231a = r6
            r6 = 0
            com.google.android.gms.internal.ads.pw r1 = r5.f10231a     // Catch:{ RemoteException -> 0x0057 }
            java.util.List r1 = r1.mo9901a()     // Catch:{ RemoteException -> 0x0057 }
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
            java.util.List<com.google.android.gms.ads.formats.c$b> r3 = r5.f10232b     // Catch:{ RemoteException -> 0x0057 }
            com.google.android.gms.internal.ads.bw r4 = new com.google.android.gms.internal.ads.bw     // Catch:{ RemoteException -> 0x0057 }
            r4.<init>(r2)     // Catch:{ RemoteException -> 0x0057 }
            r3.add(r4)     // Catch:{ RemoteException -> 0x0057 }
            goto L_0x0022
        L_0x0057:
            r1 = move-exception
            com.google.android.gms.internal.ads.C2227Cf.m9533b(r0, r1)
        L_0x005b:
            com.google.android.gms.internal.ads.pw r1 = r5.f10231a     // Catch:{ RemoteException -> 0x0069 }
            com.google.android.gms.internal.ads.Zv r1 = r1.mo9900W()     // Catch:{ RemoteException -> 0x0069 }
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
            r5.f10233c = r2
            com.google.android.gms.internal.ads.pw r1 = r5.f10231a     // Catch:{ RemoteException -> 0x0085 }
            com.google.android.gms.internal.ads.Vv r1 = r1.mo9913j()     // Catch:{ RemoteException -> 0x0085 }
            if (r1 == 0) goto L_0x0089
            com.google.android.gms.internal.ads.Yv r1 = new com.google.android.gms.internal.ads.Yv     // Catch:{ RemoteException -> 0x0085 }
            com.google.android.gms.internal.ads.pw r2 = r5.f10231a     // Catch:{ RemoteException -> 0x0085 }
            com.google.android.gms.internal.ads.Vv r2 = r2.mo9913j()     // Catch:{ RemoteException -> 0x0085 }
            r1.<init>(r2)     // Catch:{ RemoteException -> 0x0085 }
            r6 = r1
            goto L_0x0089
        L_0x0085:
            r1 = move-exception
            com.google.android.gms.internal.ads.C2227Cf.m9533b(r0, r1)
        L_0x0089:
            r5.f10235e = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3478sw.<init>(com.google.android.gms.internal.ads.pw):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final C5464b mo6612a() {
        try {
            return this.f10231a.mo9914x();
        } catch (RemoteException e) {
            C2227Cf.m9533b("", e);
            return null;
        }
    }

    /* renamed from: b */
    public final CharSequence mo6648b() {
        try {
            return this.f10231a.mo9915y();
        } catch (RemoteException e) {
            C2227Cf.m9533b("", e);
            return null;
        }
    }

    /* renamed from: c */
    public final CharSequence mo6649c() {
        try {
            return this.f10231a.mo9911h();
        } catch (RemoteException e) {
            C2227Cf.m9533b("", e);
            return null;
        }
    }

    /* renamed from: d */
    public final CharSequence mo6650d() {
        try {
            return this.f10231a.mo9906d();
        } catch (RemoteException e) {
            C2227Cf.m9533b("", e);
            return null;
        }
    }

    /* renamed from: e */
    public final CharSequence mo6651e() {
        try {
            return this.f10231a.mo9903b();
        } catch (RemoteException e) {
            C2227Cf.m9533b("", e);
            return null;
        }
    }

    /* renamed from: f */
    public final List<C1649c.C1651b> mo6652f() {
        return this.f10232b;
    }

    /* renamed from: g */
    public final C1649c.C1651b mo6653g() {
        return this.f10233c;
    }

    /* renamed from: h */
    public final C1813j mo6654h() {
        try {
            if (this.f10231a.getVideoController() != null) {
                this.f10234d.mo7051a(this.f10231a.getVideoController());
            }
        } catch (RemoteException e) {
            C2227Cf.m9533b("Exception occurred while getting video controller", e);
        }
        return this.f10234d;
    }
}
