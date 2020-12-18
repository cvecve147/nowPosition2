package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Uq */
final class C2759Uq implements C3594wx {

    /* renamed from: a */
    private final Map<String, List<C2216Bw<?>>> f8402a = new HashMap();

    /* renamed from: b */
    private final C2731Tp f8403b;

    C2759Uq(C2731Tp tp) {
        this.f8403b = tp;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        return false;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean m11362b(com.google.android.gms.internal.ads.C2216Bw<?> r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = r6.mo7909c()     // Catch:{ all -> 0x0052 }
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.Bw<?>>> r1 = r5.f8402a     // Catch:{ all -> 0x0052 }
            boolean r1 = r1.containsKey(r0)     // Catch:{ all -> 0x0052 }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x003a
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.Bw<?>>> r1 = r5.f8402a     // Catch:{ all -> 0x0052 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0052 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0052 }
            if (r1 != 0) goto L_0x001e
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0052 }
            r1.<init>()     // Catch:{ all -> 0x0052 }
        L_0x001e:
            java.lang.String r4 = "waiting-for-response"
            r6.mo7906a((java.lang.String) r4)     // Catch:{ all -> 0x0052 }
            r1.add(r6)     // Catch:{ all -> 0x0052 }
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.Bw<?>>> r6 = r5.f8402a     // Catch:{ all -> 0x0052 }
            r6.put(r0, r1)     // Catch:{ all -> 0x0052 }
            boolean r6 = com.google.android.gms.internal.ads.C3656zb.f10640b     // Catch:{ all -> 0x0052 }
            if (r6 == 0) goto L_0x0038
            java.lang.String r6 = "Request for cacheKey=%s is in flight, putting on hold."
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ all -> 0x0052 }
            r1[r3] = r0     // Catch:{ all -> 0x0052 }
            com.google.android.gms.internal.ads.C3656zb.m14679a(r6, r1)     // Catch:{ all -> 0x0052 }
        L_0x0038:
            monitor-exit(r5)
            return r2
        L_0x003a:
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.Bw<?>>> r1 = r5.f8402a     // Catch:{ all -> 0x0052 }
            r4 = 0
            r1.put(r0, r4)     // Catch:{ all -> 0x0052 }
            r6.mo7903a((com.google.android.gms.internal.ads.C3594wx) r5)     // Catch:{ all -> 0x0052 }
            boolean r6 = com.google.android.gms.internal.ads.C3656zb.f10640b     // Catch:{ all -> 0x0052 }
            if (r6 == 0) goto L_0x0050
            java.lang.String r6 = "new request, sending to network %s"
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ all -> 0x0052 }
            r1[r3] = r0     // Catch:{ all -> 0x0052 }
            com.google.android.gms.internal.ads.C3656zb.m14679a(r6, r1)     // Catch:{ all -> 0x0052 }
        L_0x0050:
            monitor-exit(r5)
            return r3
        L_0x0052:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2759Uq.m11362b(com.google.android.gms.internal.ads.Bw):boolean");
    }

    /* renamed from: a */
    public final synchronized void mo8935a(C2216Bw<?> bw) {
        String c = bw.mo7909c();
        List remove = this.f8402a.remove(c);
        if (remove != null && !remove.isEmpty()) {
            if (C3656zb.f10640b) {
                C3656zb.m14682c("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(remove.size()), c);
            }
            C2216Bw bw2 = (C2216Bw) remove.remove(0);
            this.f8402a.put(c, remove);
            bw2.mo7903a((C3594wx) this);
            try {
                this.f8403b.f8353c.put(bw2);
            } catch (InterruptedException e) {
                C3656zb.m14681b("Couldn't add request to queue. %s", e.toString());
                Thread.currentThread().interrupt();
                this.f8403b.mo8908a();
            }
        }
    }

    /* renamed from: a */
    public final void mo8936a(C2216Bw<?> bw, C3652yz<?> yzVar) {
        List<C2216Bw> remove;
        C3471sp spVar = yzVar.f10633b;
        if (spVar == null || spVar.mo10022a()) {
            mo8935a(bw);
            return;
        }
        String c = bw.mo7909c();
        synchronized (this) {
            remove = this.f8402a.remove(c);
        }
        if (remove != null) {
            if (C3656zb.f10640b) {
                C3656zb.m14682c("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(remove.size()), c);
            }
            for (C2216Bw a : remove) {
                this.f8403b.f8355e.mo9204a((C2216Bw<?>) a, yzVar);
            }
        }
    }
}
