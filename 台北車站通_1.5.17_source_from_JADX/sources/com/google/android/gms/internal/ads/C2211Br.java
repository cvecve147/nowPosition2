package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.util.C2092n;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Br */
public final class C2211Br {

    /* renamed from: a */
    private final Object f6752a = new Object();

    /* renamed from: b */
    private C2240Cr f6753b = null;

    /* renamed from: c */
    private boolean f6754c = false;

    /* renamed from: a */
    public final Activity mo7874a() {
        synchronized (this.f6752a) {
            if (!C2092n.m9161b()) {
                return null;
            }
            if (this.f6753b == null) {
                return null;
            }
            Activity a = this.f6753b.mo7942a();
            return a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7875a(android.content.Context r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f6752a
            monitor-enter(r0)
            boolean r1 = r4.f6754c     // Catch:{ all -> 0x0050 }
            if (r1 != 0) goto L_0x004e
            boolean r1 = com.google.android.gms.common.util.C2092n.m9161b()     // Catch:{ all -> 0x0050 }
            if (r1 != 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            return
        L_0x000f:
            com.google.android.gms.internal.ads.Du<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.C2558Nu.f7889fb     // Catch:{ all -> 0x0050 }
            com.google.android.gms.internal.ads.Lu r2 = com.google.android.gms.internal.ads.C3390pt.m13458f()     // Catch:{ all -> 0x0050 }
            java.lang.Object r1 = r2.mo8515a(r1)     // Catch:{ all -> 0x0050 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x0050 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0050 }
            if (r1 != 0) goto L_0x0023
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            return
        L_0x0023:
            r1 = 0
            android.content.Context r2 = r5.getApplicationContext()     // Catch:{ all -> 0x0050 }
            if (r2 != 0) goto L_0x002b
            r2 = r5
        L_0x002b:
            boolean r3 = r2 instanceof android.app.Application     // Catch:{ all -> 0x0050 }
            if (r3 == 0) goto L_0x0032
            r1 = r2
            android.app.Application r1 = (android.app.Application) r1     // Catch:{ all -> 0x0050 }
        L_0x0032:
            if (r1 != 0) goto L_0x003b
            java.lang.String r5 = "Can not cast Context to Application"
            com.google.android.gms.internal.ads.C2227Cf.m9536d(r5)     // Catch:{ all -> 0x0050 }
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            return
        L_0x003b:
            com.google.android.gms.internal.ads.Cr r2 = r4.f6753b     // Catch:{ all -> 0x0050 }
            if (r2 != 0) goto L_0x0046
            com.google.android.gms.internal.ads.Cr r2 = new com.google.android.gms.internal.ads.Cr     // Catch:{ all -> 0x0050 }
            r2.<init>()     // Catch:{ all -> 0x0050 }
            r4.f6753b = r2     // Catch:{ all -> 0x0050 }
        L_0x0046:
            com.google.android.gms.internal.ads.Cr r2 = r4.f6753b     // Catch:{ all -> 0x0050 }
            r2.mo7943a((android.app.Application) r1, (android.content.Context) r5)     // Catch:{ all -> 0x0050 }
            r5 = 1
            r4.f6754c = r5     // Catch:{ all -> 0x0050 }
        L_0x004e:
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            return
        L_0x0050:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2211Br.mo7875a(android.content.Context):void");
    }

    /* renamed from: a */
    public final void mo7876a(C2297Er er) {
        synchronized (this.f6752a) {
            if (C2092n.m9161b()) {
                if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7889fb)).booleanValue()) {
                    if (this.f6753b == null) {
                        this.f6753b = new C2240Cr();
                    }
                    this.f6753b.mo7944a(er);
                }
            }
        }
    }

    /* renamed from: b */
    public final Context mo7877b() {
        synchronized (this.f6752a) {
            if (!C2092n.m9161b()) {
                return null;
            }
            if (this.f6753b == null) {
                return null;
            }
            Context b = this.f6753b.mo7945b();
            return b;
        }
    }
}
