package com.onesignal;

import com.onesignal.C4236Ea;
import com.onesignal.C4306Xa;
import java.util.ArrayList;
import java.util.Date;

/* renamed from: com.onesignal.ba */
class C4347ba {

    /* renamed from: a */
    static Date f12867a = new Date();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C4348a f12868b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final ArrayList<String> f12869c = new ArrayList<>();

    /* renamed from: com.onesignal.ba$a */
    interface C4348a {
        /* renamed from: a */
        void mo12471a();
    }

    C4347ba(C4348a aVar) {
        this.f12868b = aVar;
    }

    /* renamed from: a */
    private static boolean m17314a(double d, double d2) {
        return Math.abs(d - d2) < 0.3d;
    }

    /* renamed from: a */
    private static boolean m17315a(double d, double d2, C4236Ea.C4238b bVar) {
        switch (C4338aa.f12849b[bVar.ordinal()]) {
            case 1:
                return d2 < d;
            case 2:
                return d2 <= d || m17314a(d, d2);
            case 3:
                return d2 > d;
            case 4:
                return d2 >= d || m17314a(d, d2);
            case 5:
                return m17314a(d, d2);
            case 6:
                return !m17314a(d, d2);
            default:
                C4306Xa.C4316j jVar = C4306Xa.C4316j.ERROR;
                C4306Xa.m17154b(jVar, "Attempted to apply an invalid operator on a time-based in-app-message trigger: " + bVar.toString());
                return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0070 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0072  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo12470a(com.onesignal.C4236Ea r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r15.f12570e
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.util.ArrayList<java.lang.String> r0 = r14.f12869c
            monitor-enter(r0)
            java.lang.Object r2 = r15.f12570e     // Catch:{ all -> 0x0098 }
            boolean r2 = r2 instanceof java.lang.Number     // Catch:{ all -> 0x0098 }
            if (r2 != 0) goto L_0x0011
            monitor-exit(r0)     // Catch:{ all -> 0x0098 }
            return r1
        L_0x0011:
            int[] r2 = com.onesignal.C4338aa.f12848a     // Catch:{ all -> 0x0098 }
            com.onesignal.Ea$a r3 = r15.f12567b     // Catch:{ all -> 0x0098 }
            int r3 = r3.ordinal()     // Catch:{ all -> 0x0098 }
            r2 = r2[r3]     // Catch:{ all -> 0x0098 }
            r3 = 1
            r4 = 0
            if (r2 == r3) goto L_0x0047
            r6 = 2
            if (r2 == r6) goto L_0x0025
            r6 = r4
            goto L_0x0057
        L_0x0025:
            com.onesignal.pa r2 = com.onesignal.C4406pa.m17450b()     // Catch:{ all -> 0x0098 }
            boolean r2 = r2.mo12529d()     // Catch:{ all -> 0x0098 }
            if (r2 == 0) goto L_0x0031
            monitor-exit(r0)     // Catch:{ all -> 0x0098 }
            return r1
        L_0x0031:
            com.onesignal.pa r2 = com.onesignal.C4406pa.m17450b()     // Catch:{ all -> 0x0098 }
            java.util.Date r2 = r2.f12992k     // Catch:{ all -> 0x0098 }
            if (r2 != 0) goto L_0x003d
            r6 = 999999(0xf423f, double:4.94065E-318)
            goto L_0x0057
        L_0x003d:
            java.util.Date r6 = new java.util.Date     // Catch:{ all -> 0x0098 }
            r6.<init>()     // Catch:{ all -> 0x0098 }
            long r6 = r6.getTime()     // Catch:{ all -> 0x0098 }
            goto L_0x0052
        L_0x0047:
            java.util.Date r2 = new java.util.Date     // Catch:{ all -> 0x0098 }
            r2.<init>()     // Catch:{ all -> 0x0098 }
            long r6 = r2.getTime()     // Catch:{ all -> 0x0098 }
            java.util.Date r2 = f12867a     // Catch:{ all -> 0x0098 }
        L_0x0052:
            long r8 = r2.getTime()     // Catch:{ all -> 0x0098 }
            long r6 = r6 - r8
        L_0x0057:
            java.lang.Object r2 = r15.f12570e     // Catch:{ all -> 0x0098 }
            java.lang.Number r2 = (java.lang.Number) r2     // Catch:{ all -> 0x0098 }
            double r8 = r2.doubleValue()     // Catch:{ all -> 0x0098 }
            r10 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r8 = r8 * r10
            long r8 = (long) r8     // Catch:{ all -> 0x0098 }
            double r10 = (double) r8     // Catch:{ all -> 0x0098 }
            double r12 = (double) r6     // Catch:{ all -> 0x0098 }
            com.onesignal.Ea$b r2 = r15.f12569d     // Catch:{ all -> 0x0098 }
            boolean r2 = m17315a(r10, r12, r2)     // Catch:{ all -> 0x0098 }
            if (r2 == 0) goto L_0x0072
            monitor-exit(r0)     // Catch:{ all -> 0x0098 }
            return r3
        L_0x0072:
            long r8 = r8 - r6
            int r2 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r2 > 0) goto L_0x0079
            monitor-exit(r0)     // Catch:{ all -> 0x0098 }
            return r1
        L_0x0079:
            java.util.ArrayList<java.lang.String> r2 = r14.f12869c     // Catch:{ all -> 0x0098 }
            java.lang.String r3 = r15.f12566a     // Catch:{ all -> 0x0098 }
            boolean r2 = r2.contains(r3)     // Catch:{ all -> 0x0098 }
            if (r2 == 0) goto L_0x0085
            monitor-exit(r0)     // Catch:{ all -> 0x0098 }
            return r1
        L_0x0085:
            com.onesignal.Z r2 = new com.onesignal.Z     // Catch:{ all -> 0x0098 }
            r2.<init>(r14, r15)     // Catch:{ all -> 0x0098 }
            java.lang.String r3 = r15.f12566a     // Catch:{ all -> 0x0098 }
            com.onesignal.C4352ca.m17321a(r2, r3, r8)     // Catch:{ all -> 0x0098 }
            java.util.ArrayList<java.lang.String> r2 = r14.f12869c     // Catch:{ all -> 0x0098 }
            java.lang.String r15 = r15.f12566a     // Catch:{ all -> 0x0098 }
            r2.add(r15)     // Catch:{ all -> 0x0098 }
            monitor-exit(r0)     // Catch:{ all -> 0x0098 }
            return r1
        L_0x0098:
            r15 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0098 }
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C4347ba.mo12470a(com.onesignal.Ea):boolean");
    }
}
