package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C1697X;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Gz */
public final class C2363Gz implements C3540uz {

    /* renamed from: a */
    private final zzaef f7100a;

    /* renamed from: b */
    private final C2533Mz f7101b;

    /* renamed from: c */
    private final Context f7102c;

    /* renamed from: d */
    private final C3596wz f7103d;

    /* renamed from: e */
    private final boolean f7104e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final long f7105f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final long f7106g;

    /* renamed from: h */
    private final int f7107h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Object f7108i = new Object();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f7109j = false;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final Map<C2804Wf<C2276Dz>, C2191Az> f7110k = new HashMap();

    /* renamed from: l */
    private final boolean f7111l;

    /* renamed from: m */
    private final String f7112m;

    /* renamed from: n */
    private List<C2276Dz> f7113n = new ArrayList();

    /* renamed from: o */
    private final boolean f7114o;

    public C2363Gz(Context context, zzaef zzaef, C2533Mz mz, C3596wz wzVar, boolean z, boolean z2, String str, long j, long j2, int i, boolean z3) {
        this.f7102c = context;
        this.f7100a = zzaef;
        this.f7101b = mz;
        this.f7103d = wzVar;
        this.f7104e = z;
        this.f7111l = z2;
        this.f7112m = str;
        this.f7105f = j;
        this.f7106g = j2;
        this.f7107h = 2;
        this.f7114o = z3;
    }

    /* renamed from: a */
    private final void m10036a(C2804Wf<C2276Dz> wf) {
        C3114ge.f9351a.post(new C2419Iz(this, wf));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        if (r4.hasNext() == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        r0 = r4.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r1 = (com.google.android.gms.internal.ads.C2276Dz) r0.get();
        r3.f7113n.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        if (r1 == null) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
        if (r1.f6934a != 0) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0031, code lost:
        m10036a((com.google.android.gms.internal.ads.C2804Wf<com.google.android.gms.internal.ads.C2276Dz>) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0035, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0038, code lost:
        com.google.android.gms.internal.ads.C2227Cf.m9535c("Exception while processing an adapter; continuing with other adapters", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003e, code lost:
        m10036a((com.google.android.gms.internal.ads.C2804Wf<com.google.android.gms.internal.ads.C2276Dz>) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
        return new com.google.android.gms.internal.ads.C2276Dz(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        r4 = r4.iterator();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.ads.C2276Dz m10037b(java.util.List<com.google.android.gms.internal.ads.C2804Wf<com.google.android.gms.internal.ads.C2276Dz>> r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f7108i
            monitor-enter(r0)
            boolean r1 = r3.f7109j     // Catch:{ all -> 0x0049 }
            if (r1 == 0) goto L_0x000f
            com.google.android.gms.internal.ads.Dz r4 = new com.google.android.gms.internal.ads.Dz     // Catch:{ all -> 0x0049 }
            r1 = -1
            r4.<init>(r1)     // Catch:{ all -> 0x0049 }
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            return r4
        L_0x000f:
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            java.util.Iterator r4 = r4.iterator()
        L_0x0014:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x003e
            java.lang.Object r0 = r4.next()
            com.google.android.gms.internal.ads.Wf r0 = (com.google.android.gms.internal.ads.C2804Wf) r0
            java.lang.Object r1 = r0.get()     // Catch:{ InterruptedException -> 0x0037, ExecutionException -> 0x0035 }
            com.google.android.gms.internal.ads.Dz r1 = (com.google.android.gms.internal.ads.C2276Dz) r1     // Catch:{ InterruptedException -> 0x0037, ExecutionException -> 0x0035 }
            java.util.List<com.google.android.gms.internal.ads.Dz> r2 = r3.f7113n     // Catch:{ InterruptedException -> 0x0037, ExecutionException -> 0x0035 }
            r2.add(r1)     // Catch:{ InterruptedException -> 0x0037, ExecutionException -> 0x0035 }
            if (r1 == 0) goto L_0x0014
            int r2 = r1.f6934a     // Catch:{ InterruptedException -> 0x0037, ExecutionException -> 0x0035 }
            if (r2 != 0) goto L_0x0014
            r3.m10036a((com.google.android.gms.internal.ads.C2804Wf<com.google.android.gms.internal.ads.C2276Dz>) r0)     // Catch:{ InterruptedException -> 0x0037, ExecutionException -> 0x0035 }
            return r1
        L_0x0035:
            r0 = move-exception
            goto L_0x0038
        L_0x0037:
            r0 = move-exception
        L_0x0038:
            java.lang.String r1 = "Exception while processing an adapter; continuing with other adapters"
            com.google.android.gms.internal.ads.C2227Cf.m9535c(r1, r0)
            goto L_0x0014
        L_0x003e:
            r4 = 0
            r3.m10036a((com.google.android.gms.internal.ads.C2804Wf<com.google.android.gms.internal.ads.C2276Dz>) r4)
            com.google.android.gms.internal.ads.Dz r4 = new com.google.android.gms.internal.ads.Dz
            r0 = 1
            r4.<init>(r0)
            return r4
        L_0x0049:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2363Gz.m10037b(java.util.List):com.google.android.gms.internal.ads.Dz");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        if (r0 == -1) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        r0 = 10000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        r14 = r14.iterator();
        r3 = null;
        r4 = -1;
        r1 = r0;
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
        if (r14.hasNext() == false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        r5 = r14.next();
        r6 = com.google.android.gms.ads.internal.C1697X.m7705l().mo7725a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        if (r1 != 0) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        if (r5.isDone() == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        r10 = r5.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        r10 = (com.google.android.gms.internal.ads.C2276Dz) r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
        r10 = r5.get(r1, java.util.concurrent.TimeUnit.MILLISECONDS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0053, code lost:
        r13.f7113n.add(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0058, code lost:
        if (r10 == null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005c, code lost:
        if (r10.f6934a != 0) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005e, code lost:
        r11 = r10.f6939f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0060, code lost:
        if (r11 == null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0066, code lost:
        if (r11.mo7968Qa() <= r4) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006c, code lost:
        r4 = r11.mo7968Qa();
        r3 = r5;
        r0 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0070, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0072, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        com.google.android.gms.internal.ads.C2227Cf.m9535c("Exception while processing an adapter; continuing with other adapters", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008d, code lost:
        java.lang.Math.max(r1 - (com.google.android.gms.ads.internal.C1697X.m7705l().mo7725a() - r6), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009a, code lost:
        throw r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009b, code lost:
        m10036a((com.google.android.gms.internal.ads.C2804Wf<com.google.android.gms.internal.ads.C2276Dz>) r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009e, code lost:
        if (r0 != null) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a6, code lost:
        return new com.google.android.gms.internal.ads.C2276Dz(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a7, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        r0 = r13.f7103d.f10492n;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.ads.C2276Dz m10040c(java.util.List<com.google.android.gms.internal.ads.C2804Wf<com.google.android.gms.internal.ads.C2276Dz>> r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f7108i
            monitor-enter(r0)
            boolean r1 = r13.f7109j     // Catch:{ all -> 0x00a8 }
            r2 = -1
            if (r1 == 0) goto L_0x000f
            com.google.android.gms.internal.ads.Dz r14 = new com.google.android.gms.internal.ads.Dz     // Catch:{ all -> 0x00a8 }
            r14.<init>(r2)     // Catch:{ all -> 0x00a8 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a8 }
            return r14
        L_0x000f:
            monitor-exit(r0)     // Catch:{ all -> 0x00a8 }
            com.google.android.gms.internal.ads.wz r0 = r13.f7103d
            long r0 = r0.f10492n
            r3 = -1
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            r0 = 10000(0x2710, double:4.9407E-320)
        L_0x001d:
            java.util.Iterator r14 = r14.iterator()
            r3 = 0
            r4 = r2
            r1 = r0
            r0 = r3
        L_0x0025:
            boolean r5 = r14.hasNext()
            if (r5 == 0) goto L_0x009b
            java.lang.Object r5 = r14.next()
            com.google.android.gms.internal.ads.Wf r5 = (com.google.android.gms.internal.ads.C2804Wf) r5
            com.google.android.gms.common.util.e r6 = com.google.android.gms.ads.internal.C1697X.m7705l()
            long r6 = r6.mo7725a()
            r8 = 0
            int r10 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x004c
            boolean r10 = r5.isDone()     // Catch:{ InterruptedException -> 0x0078, ExecutionException -> 0x0076, RemoteException -> 0x0074, TimeoutException -> 0x0072 }
            if (r10 == 0) goto L_0x004c
            java.lang.Object r10 = r5.get()     // Catch:{ InterruptedException -> 0x0078, ExecutionException -> 0x0076, RemoteException -> 0x0074, TimeoutException -> 0x0072 }
        L_0x0049:
            com.google.android.gms.internal.ads.Dz r10 = (com.google.android.gms.internal.ads.C2276Dz) r10     // Catch:{ InterruptedException -> 0x0078, ExecutionException -> 0x0076, RemoteException -> 0x0074, TimeoutException -> 0x0072 }
            goto L_0x0053
        L_0x004c:
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x0078, ExecutionException -> 0x0076, RemoteException -> 0x0074, TimeoutException -> 0x0072 }
            java.lang.Object r10 = r5.get(r1, r10)     // Catch:{ InterruptedException -> 0x0078, ExecutionException -> 0x0076, RemoteException -> 0x0074, TimeoutException -> 0x0072 }
            goto L_0x0049
        L_0x0053:
            java.util.List<com.google.android.gms.internal.ads.Dz> r11 = r13.f7113n     // Catch:{ InterruptedException -> 0x0078, ExecutionException -> 0x0076, RemoteException -> 0x0074, TimeoutException -> 0x0072 }
            r11.add(r10)     // Catch:{ InterruptedException -> 0x0078, ExecutionException -> 0x0076, RemoteException -> 0x0074, TimeoutException -> 0x0072 }
            if (r10 == 0) goto L_0x007e
            int r11 = r10.f6934a     // Catch:{ InterruptedException -> 0x0078, ExecutionException -> 0x0076, RemoteException -> 0x0074, TimeoutException -> 0x0072 }
            if (r11 != 0) goto L_0x007e
            com.google.android.gms.internal.ads.Vz r11 = r10.f6939f     // Catch:{ InterruptedException -> 0x0078, ExecutionException -> 0x0076, RemoteException -> 0x0074, TimeoutException -> 0x0072 }
            if (r11 == 0) goto L_0x007e
            int r12 = r11.mo7968Qa()     // Catch:{ InterruptedException -> 0x0078, ExecutionException -> 0x0076, RemoteException -> 0x0074, TimeoutException -> 0x0072 }
            if (r12 <= r4) goto L_0x007e
            int r0 = r11.mo7968Qa()     // Catch:{ InterruptedException -> 0x0078, ExecutionException -> 0x0076, RemoteException -> 0x0074, TimeoutException -> 0x0072 }
            r4 = r0
            r3 = r5
            r0 = r10
            goto L_0x007e
        L_0x0070:
            r14 = move-exception
            goto L_0x008d
        L_0x0072:
            r5 = move-exception
            goto L_0x0079
        L_0x0074:
            r5 = move-exception
            goto L_0x0079
        L_0x0076:
            r5 = move-exception
            goto L_0x0079
        L_0x0078:
            r5 = move-exception
        L_0x0079:
            java.lang.String r10 = "Exception while processing an adapter; continuing with other adapters"
            com.google.android.gms.internal.ads.C2227Cf.m9535c(r10, r5)     // Catch:{ all -> 0x0070 }
        L_0x007e:
            com.google.android.gms.common.util.e r5 = com.google.android.gms.ads.internal.C1697X.m7705l()
            long r10 = r5.mo7725a()
            long r10 = r10 - r6
            long r1 = r1 - r10
            long r1 = java.lang.Math.max(r1, r8)
            goto L_0x0025
        L_0x008d:
            com.google.android.gms.common.util.e r0 = com.google.android.gms.ads.internal.C1697X.m7705l()
            long r3 = r0.mo7725a()
            long r3 = r3 - r6
            long r1 = r1 - r3
            java.lang.Math.max(r1, r8)
            throw r14
        L_0x009b:
            r13.m10036a((com.google.android.gms.internal.ads.C2804Wf<com.google.android.gms.internal.ads.C2276Dz>) r3)
            if (r0 != 0) goto L_0x00a7
            com.google.android.gms.internal.ads.Dz r14 = new com.google.android.gms.internal.ads.Dz
            r0 = 1
            r14.<init>(r0)
            return r14
        L_0x00a7:
            return r0
        L_0x00a8:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a8 }
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2363Gz.m10040c(java.util.List):com.google.android.gms.internal.ads.Dz");
    }

    /* renamed from: a */
    public final C2276Dz mo8248a(List<C3568vz> list) {
        C2227Cf.m9532b("Starting mediation.");
        ArrayList arrayList = new ArrayList();
        zzjn zzjn = this.f7100a.f10755d;
        int[] iArr = new int[2];
        if (zzjn.f10899g != null) {
            C1697X.m7717x();
            if (C2333Fz.m9844a(this.f7112m, iArr)) {
                int i = 0;
                int i2 = iArr[0];
                int i3 = iArr[1];
                zzjn[] zzjnArr = zzjn.f10899g;
                int length = zzjnArr.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    zzjn zzjn2 = zzjnArr[i];
                    if (i2 == zzjn2.f10897e && i3 == zzjn2.f10894b) {
                        zzjn = zzjn2;
                        break;
                    }
                    i++;
                }
            }
        }
        Iterator<C3568vz> it = list.iterator();
        while (it.hasNext()) {
            C3568vz next = it.next();
            String valueOf = String.valueOf(next.f10406b);
            C2227Cf.m9534c(valueOf.length() != 0 ? "Trying mediation network: ".concat(valueOf) : new String("Trying mediation network: "));
            for (Iterator<String> it2 = next.f10407c.iterator(); it2.hasNext(); it2 = it2) {
                Context context = this.f7102c;
                C2533Mz mz = this.f7101b;
                C3596wz wzVar = this.f7103d;
                zzaef zzaef = this.f7100a;
                zzjj zzjj = zzaef.f10753c;
                ArrayList arrayList2 = arrayList;
                zzang zzang = zzaef.f10762k;
                C2191Az az = new C2191Az(context, it2.next(), mz, wzVar, next, zzjj, zzjn, zzang, this.f7104e, this.f7111l, zzaef.f10776y, zzaef.f10765n, zzaef.f10777z, zzaef.f10746X, this.f7114o);
                C2804Wf a = C3057ee.m12270a(new C2391Hz(this, az));
                this.f7110k.put(a, az);
                ArrayList arrayList3 = arrayList2;
                arrayList3.add(a);
                it = it;
                arrayList = arrayList3;
            }
        }
        ArrayList arrayList4 = arrayList;
        return this.f7107h != 2 ? m10037b((List<C2804Wf<C2276Dz>>) arrayList4) : m10040c((List<C2804Wf<C2276Dz>>) arrayList4);
    }

    /* renamed from: a */
    public final List<C2276Dz> mo8249a() {
        return this.f7113n;
    }

    public final void cancel() {
        synchronized (this.f7108i) {
            this.f7109j = true;
            for (C2191Az a : this.f7110k.values()) {
                a.mo7857a();
            }
        }
    }
}
