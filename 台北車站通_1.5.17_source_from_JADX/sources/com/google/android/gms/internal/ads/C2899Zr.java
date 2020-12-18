package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.C1697X;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Zr */
public final class C2899Zr {

    /* renamed from: a */
    private final Runnable f8713a = new C2927_r(this);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f8714b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C3071es f8715c;

    /* renamed from: d */
    private Context f8716d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C3156hs f8717e;

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m11710b() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f8714b
            monitor-enter(r0)
            android.content.Context r1 = r6.f8716d     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x002e
            com.google.android.gms.internal.ads.es r1 = r6.f8715c     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x000c
            goto L_0x002e
        L_0x000c:
            com.google.android.gms.internal.ads.bs r1 = new com.google.android.gms.internal.ads.bs     // Catch:{ all -> 0x0030 }
            r1.<init>(r6)     // Catch:{ all -> 0x0030 }
            com.google.android.gms.internal.ads.cs r2 = new com.google.android.gms.internal.ads.cs     // Catch:{ all -> 0x0030 }
            r2.<init>(r6)     // Catch:{ all -> 0x0030 }
            com.google.android.gms.internal.ads.es r3 = new com.google.android.gms.internal.ads.es     // Catch:{ all -> 0x0030 }
            android.content.Context r4 = r6.f8716d     // Catch:{ all -> 0x0030 }
            com.google.android.gms.internal.ads.df r5 = com.google.android.gms.ads.internal.C1697X.m7713t()     // Catch:{ all -> 0x0030 }
            android.os.Looper r5 = r5.mo9309b()     // Catch:{ all -> 0x0030 }
            r3.<init>(r4, r5, r1, r2)     // Catch:{ all -> 0x0030 }
            r6.f8715c = r3     // Catch:{ all -> 0x0030 }
            com.google.android.gms.internal.ads.es r1 = r6.f8715c     // Catch:{ all -> 0x0030 }
            r1.mo7630m()     // Catch:{ all -> 0x0030 }
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x002e:
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x0030:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2899Zr.m11710b():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m11713c() {
        synchronized (this.f8714b) {
            if (this.f8715c != null) {
                if (this.f8715c.isConnected() || this.f8715c.mo7621d()) {
                    this.f8715c.mo7608a();
                }
                this.f8715c = null;
                this.f8717e = null;
                Binder.flushPendingCommands();
            }
        }
    }

    /* renamed from: a */
    public final zzhi mo9123a(zzhl zzhl) {
        synchronized (this.f8714b) {
            if (this.f8717e == null) {
                zzhi zzhi = new zzhi();
                return zzhi;
            }
            try {
                zzhi a = this.f8717e.mo9526a(zzhl);
                return a;
            } catch (RemoteException e) {
                C2227Cf.m9533b("Unable to call into cache service.", e);
                return new zzhi();
            }
        }
    }

    /* renamed from: a */
    public final void mo9124a() {
        if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7780Md)).booleanValue()) {
            synchronized (this.f8714b) {
                m11710b();
                C1697X.m7698e();
                C3114ge.f9351a.removeCallbacks(this.f8713a);
                C1697X.m7698e();
                C3114ge.f9351a.postDelayed(this.f8713a, ((Long) C3390pt.m13458f().mo8515a(C2558Nu.f7786Nd)).longValue());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9125a(android.content.Context r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.Object r0 = r2.f8714b
            monitor-enter(r0)
            android.content.Context r1 = r2.f8716d     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x000c:
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x0048 }
            r2.f8716d = r3     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.Du<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.C2558Nu.f7774Ld     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.Lu r1 = com.google.android.gms.internal.ads.C3390pt.m13458f()     // Catch:{ all -> 0x0048 }
            java.lang.Object r3 = r1.mo8515a(r3)     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0028
            r2.m11710b()     // Catch:{ all -> 0x0048 }
            goto L_0x0046
        L_0x0028:
            com.google.android.gms.internal.ads.Du<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.C2558Nu.f7768Kd     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.Lu r1 = com.google.android.gms.internal.ads.C3390pt.m13458f()     // Catch:{ all -> 0x0048 }
            java.lang.Object r3 = r1.mo8515a(r3)     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0046
            com.google.android.gms.internal.ads.as r3 = new com.google.android.gms.internal.ads.as     // Catch:{ all -> 0x0048 }
            r3.<init>(r2)     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.Br r1 = com.google.android.gms.ads.internal.C1697X.m7701h()     // Catch:{ all -> 0x0048 }
            r1.mo7876a((com.google.android.gms.internal.ads.C2297Er) r3)     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x0048:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2899Zr.mo9125a(android.content.Context):void");
    }
}
