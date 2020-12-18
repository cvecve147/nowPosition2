package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.T */
public final class C2713T extends C2392I {

    /* renamed from: j */
    private C2533Mz f8323j;

    /* renamed from: k */
    private C3540uz f8324k;

    /* renamed from: l */
    private C3596wz f8325l;

    /* renamed from: m */
    protected C2276Dz f8326m;

    /* renamed from: n */
    private final C2930_u f8327n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C3520uh f8328o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f8329p;

    C2713T(Context context, C2282Ed ed, C2533Mz mz, C2534N n, C2930_u _uVar, C3520uh uhVar) {
        super(context, ed, n);
        this.f8323j = mz;
        this.f8325l = ed.f6944c;
        this.f8327n = _uVar;
        this.f8328o = uhVar;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [com.google.android.gms.internal.ads.uz] */
    /* JADX WARNING: type inference failed for: r17v2, types: [com.google.android.gms.internal.ads.Jz] */
    /* JADX WARNING: type inference failed for: r4v5, types: [com.google.android.gms.internal.ads.Gz] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00a3, code lost:
        r2 = r2.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8311a(long r32) {
        /*
            r31 = this;
            r1 = r31
            java.lang.Object r2 = r1.f7226g
            monitor-enter(r2)
            com.google.android.gms.internal.ads.wz r0 = r1.f8325l     // Catch:{ all -> 0x016b }
            int r0 = r0.f10491m     // Catch:{ all -> 0x016b }
            r3 = -1
            if (r0 == r3) goto L_0x0043
            com.google.android.gms.internal.ads.Gz r0 = new com.google.android.gms.internal.ads.Gz     // Catch:{ all -> 0x016b }
            android.content.Context r5 = r1.f7224e     // Catch:{ all -> 0x016b }
            com.google.android.gms.internal.ads.Ed r3 = r1.f7227h     // Catch:{ all -> 0x016b }
            com.google.android.gms.internal.ads.zzaef r6 = r3.f6942a     // Catch:{ all -> 0x016b }
            com.google.android.gms.internal.ads.Mz r7 = r1.f8323j     // Catch:{ all -> 0x016b }
            com.google.android.gms.internal.ads.wz r8 = r1.f8325l     // Catch:{ all -> 0x016b }
            com.google.android.gms.internal.ads.zzaej r3 = r1.f7228i     // Catch:{ all -> 0x016b }
            boolean r9 = r3.f10822u     // Catch:{ all -> 0x016b }
            com.google.android.gms.internal.ads.zzaej r3 = r1.f7228i     // Catch:{ all -> 0x016b }
            boolean r10 = r3.f10780C     // Catch:{ all -> 0x016b }
            com.google.android.gms.internal.ads.zzaej r3 = r1.f7228i     // Catch:{ all -> 0x016b }
            java.lang.String r11 = r3.f10790M     // Catch:{ all -> 0x016b }
            com.google.android.gms.internal.ads.Du<java.lang.Long> r3 = com.google.android.gms.internal.ads.C2558Nu.f7932mc     // Catch:{ all -> 0x016b }
            com.google.android.gms.internal.ads.Lu r4 = com.google.android.gms.internal.ads.C3390pt.m13458f()     // Catch:{ all -> 0x016b }
            java.lang.Object r3 = r4.mo8515a(r3)     // Catch:{ all -> 0x016b }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ all -> 0x016b }
            long r14 = r3.longValue()     // Catch:{ all -> 0x016b }
            r16 = 2
            com.google.android.gms.internal.ads.Ed r3 = r1.f7227h     // Catch:{ all -> 0x016b }
            boolean r3 = r3.f6951j     // Catch:{ all -> 0x016b }
            r4 = r0
            r12 = r32
            r17 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r14, r16, r17)     // Catch:{ all -> 0x016b }
            goto L_0x008a
        L_0x0043:
            com.google.android.gms.internal.ads.Jz r0 = new com.google.android.gms.internal.ads.Jz     // Catch:{ all -> 0x016b }
            android.content.Context r3 = r1.f7224e     // Catch:{ all -> 0x016b }
            com.google.android.gms.internal.ads.Ed r4 = r1.f7227h     // Catch:{ all -> 0x016b }
            com.google.android.gms.internal.ads.zzaef r4 = r4.f6942a     // Catch:{ all -> 0x016b }
            com.google.android.gms.internal.ads.Mz r5 = r1.f8323j     // Catch:{ all -> 0x016b }
            com.google.android.gms.internal.ads.wz r6 = r1.f8325l     // Catch:{ all -> 0x016b }
            com.google.android.gms.internal.ads.zzaej r7 = r1.f7228i     // Catch:{ all -> 0x016b }
            boolean r7 = r7.f10822u     // Catch:{ all -> 0x016b }
            com.google.android.gms.internal.ads.zzaej r8 = r1.f7228i     // Catch:{ all -> 0x016b }
            boolean r8 = r8.f10780C     // Catch:{ all -> 0x016b }
            com.google.android.gms.internal.ads.zzaej r9 = r1.f7228i     // Catch:{ all -> 0x016b }
            java.lang.String r9 = r9.f10790M     // Catch:{ all -> 0x016b }
            com.google.android.gms.internal.ads.Du<java.lang.Long> r10 = com.google.android.gms.internal.ads.C2558Nu.f7932mc     // Catch:{ all -> 0x016b }
            com.google.android.gms.internal.ads.Lu r11 = com.google.android.gms.internal.ads.C3390pt.m13458f()     // Catch:{ all -> 0x016b }
            java.lang.Object r10 = r11.mo8515a(r10)     // Catch:{ all -> 0x016b }
            java.lang.Long r10 = (java.lang.Long) r10     // Catch:{ all -> 0x016b }
            long r27 = r10.longValue()     // Catch:{ all -> 0x016b }
            com.google.android.gms.internal.ads._u r10 = r1.f8327n     // Catch:{ all -> 0x016b }
            com.google.android.gms.internal.ads.Ed r11 = r1.f7227h     // Catch:{ all -> 0x016b }
            boolean r11 = r11.f6951j     // Catch:{ all -> 0x016b }
            r17 = r0
            r18 = r3
            r19 = r4
            r20 = r5
            r21 = r6
            r22 = r7
            r23 = r8
            r24 = r9
            r25 = r32
            r29 = r10
            r30 = r11
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r27, r29, r30)     // Catch:{ all -> 0x016b }
        L_0x008a:
            r1.f8324k = r0     // Catch:{ all -> 0x016b }
            monitor-exit(r2)     // Catch:{ all -> 0x016b }
            java.util.ArrayList r0 = new java.util.ArrayList
            com.google.android.gms.internal.ads.wz r2 = r1.f8325l
            java.util.List<com.google.android.gms.internal.ads.vz> r2 = r2.f10479a
            r0.<init>(r2)
            com.google.android.gms.internal.ads.Ed r2 = r1.f7227h
            com.google.android.gms.internal.ads.zzaef r2 = r2.f6942a
            com.google.android.gms.internal.ads.zzjj r2 = r2.f10753c
            android.os.Bundle r2 = r2.f10887m
            java.lang.String r3 = "com.google.ads.mediation.admob.AdMobAdapter"
            r4 = 0
            if (r2 == 0) goto L_0x00b0
            android.os.Bundle r2 = r2.getBundle(r3)
            if (r2 == 0) goto L_0x00b0
            java.lang.String r5 = "_skipMediation"
            boolean r2 = r2.getBoolean(r5)
            goto L_0x00b1
        L_0x00b0:
            r2 = r4
        L_0x00b1:
            if (r2 == 0) goto L_0x00cf
            java.util.ListIterator r2 = r0.listIterator()
        L_0x00b7:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x00cf
            java.lang.Object r5 = r2.next()
            com.google.android.gms.internal.ads.vz r5 = (com.google.android.gms.internal.ads.C3568vz) r5
            java.util.List<java.lang.String> r5 = r5.f10407c
            boolean r5 = r5.contains(r3)
            if (r5 != 0) goto L_0x00b7
            r2.remove()
            goto L_0x00b7
        L_0x00cf:
            com.google.android.gms.internal.ads.uz r2 = r1.f8324k
            com.google.android.gms.internal.ads.Dz r0 = r2.mo8248a(r0)
            r1.f8326m = r0
            com.google.android.gms.internal.ads.Dz r0 = r1.f8326m
            int r2 = r0.f6934a
            r3 = 1
            if (r2 == 0) goto L_0x0102
            if (r2 == r3) goto L_0x00f9
            com.google.android.gms.internal.ads.L r0 = new com.google.android.gms.internal.ads.L
            r3 = 40
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            java.lang.String r3 = "Unexpected mediation result: "
            r5.append(r3)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r0.<init>(r2, r4)
            throw r0
        L_0x00f9:
            com.google.android.gms.internal.ads.L r0 = new com.google.android.gms.internal.ads.L
            r2 = 3
            java.lang.String r3 = "No fill from any mediation ad networks."
            r0.<init>(r3, r2)
            throw r0
        L_0x0102:
            com.google.android.gms.internal.ads.vz r0 = r0.f6935b
            if (r0 == 0) goto L_0x016a
            java.lang.String r0 = r0.f10419o
            if (r0 == 0) goto L_0x016a
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r0.<init>(r3)
            android.os.Handler r2 = com.google.android.gms.internal.ads.C3114ge.f9351a
            com.google.android.gms.internal.ads.U r3 = new com.google.android.gms.internal.ads.U
            r3.<init>(r1, r0)
            r2.post(r3)
            r2 = 10
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0144 }
            r0.await(r2, r5)     // Catch:{ InterruptedException -> 0x0144 }
            java.lang.Object r2 = r1.f7226g
            monitor-enter(r2)
            boolean r0 = r1.f8329p     // Catch:{ all -> 0x0141 }
            if (r0 == 0) goto L_0x0139
            com.google.android.gms.internal.ads.uh r0 = r1.f8328o     // Catch:{ all -> 0x0141 }
            boolean r0 = r0.isDestroyed()     // Catch:{ all -> 0x0141 }
            if (r0 != 0) goto L_0x0131
            monitor-exit(r2)     // Catch:{ all -> 0x0141 }
            return
        L_0x0131:
            com.google.android.gms.internal.ads.L r0 = new com.google.android.gms.internal.ads.L     // Catch:{ all -> 0x0141 }
            java.lang.String r3 = "Assets not loaded, web view is destroyed"
            r0.<init>(r3, r4)     // Catch:{ all -> 0x0141 }
            throw r0     // Catch:{ all -> 0x0141 }
        L_0x0139:
            com.google.android.gms.internal.ads.L r0 = new com.google.android.gms.internal.ads.L     // Catch:{ all -> 0x0141 }
            java.lang.String r3 = "View could not be prepared"
            r0.<init>(r3, r4)     // Catch:{ all -> 0x0141 }
            throw r0     // Catch:{ all -> 0x0141 }
        L_0x0141:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0141 }
            throw r0
        L_0x0144:
            r0 = move-exception
            com.google.android.gms.internal.ads.L r2 = new com.google.android.gms.internal.ads.L
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            int r3 = r3 + 38
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            java.lang.String r3 = "Interrupted while waiting for latch : "
            r5.append(r3)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r2.<init>(r0, r4)
            throw r2
        L_0x016a:
            return
        L_0x016b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x016b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2713T.mo8311a(long):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C2254Dd mo8312b(int i) {
        String str;
        boolean z;
        List<String> list;
        long j;
        zzael zzael;
        String str2;
        String str3;
        boolean z2;
        List<String> list2;
        long j2;
        Iterator<C2276Dz> it;
        String str4;
        int i2;
        zzaef zzaef = this.f7227h.f6942a;
        zzjj zzjj = zzaef.f10753c;
        C3520uh uhVar = this.f8328o;
        zzaej zzaej = this.f7228i;
        List<String> list3 = zzaej.f10806e;
        List<String> list4 = zzaej.f10808g;
        List<String> list5 = zzaej.f10812k;
        int i3 = zzaej.f10814m;
        long j3 = zzaej.f10813l;
        String str5 = zzaef.f10760i;
        boolean z3 = zzaej.f10810i;
        C2276Dz dz = this.f8326m;
        C3568vz vzVar = dz != null ? dz.f6935b : null;
        C2276Dz dz2 = this.f8326m;
        C2626Pz pz = dz2 != null ? dz2.f6936c : null;
        C2276Dz dz3 = this.f8326m;
        String name = dz3 != null ? dz3.f6937d : AdMobAdapter.class.getName();
        C3596wz wzVar = this.f8325l;
        C2276Dz dz4 = this.f8326m;
        C3681zz zzVar = dz4 != null ? dz4.f6938e : null;
        zzaej zzaej2 = this.f7228i;
        C3568vz vzVar2 = vzVar;
        C2626Pz pz2 = pz;
        long j4 = zzaej2.f10811j;
        C2282Ed ed = this.f7227h;
        C3596wz wzVar2 = wzVar;
        zzjn zzjn = ed.f6945d;
        long j5 = j4;
        long j6 = zzaej2.f10809h;
        long j7 = ed.f6947f;
        long j8 = zzaej2.f10816o;
        zzjn zzjn2 = zzjn;
        String str6 = zzaej2.f10817p;
        JSONObject jSONObject = ed.f6949h;
        String str7 = str6;
        zzaig zzaig = zzaej2.f10781D;
        List<String> list6 = zzaej2.f10782E;
        List<String> list7 = zzaej2.f10783F;
        JSONObject jSONObject2 = jSONObject;
        C3596wz wzVar3 = this.f8325l;
        List<String> list8 = list7;
        boolean z4 = wzVar3 != null ? wzVar3.f10493o : false;
        zzael zzael2 = this.f7228i.f10785H;
        C3540uz uzVar = this.f8324k;
        if (uzVar != null) {
            List<C2276Dz> a = uzVar.mo8249a();
            if (a == null) {
                list = list6;
                zzael = zzael2;
                str = str5;
                z = z3;
                j = j8;
                str2 = "";
            } else {
                Iterator<C2276Dz> it2 = a.iterator();
                String str8 = "";
                while (true) {
                    zzael = zzael2;
                    if (!it2.hasNext()) {
                        break;
                    }
                    C2276Dz next = it2.next();
                    if (next != null) {
                        it = it2;
                        C3568vz vzVar3 = next.f6935b;
                        if (vzVar3 == null || TextUtils.isEmpty(vzVar3.f10408d)) {
                            list2 = list6;
                        } else {
                            String valueOf = String.valueOf(str8);
                            j2 = j8;
                            String str9 = next.f6935b.f10408d;
                            int i4 = next.f6934a;
                            list2 = list6;
                            if (i4 != -1) {
                                if (i4 == 0) {
                                    str4 = str5;
                                    z2 = z3;
                                    i2 = 0;
                                } else if (i4 == 1) {
                                    str4 = str5;
                                    z2 = z3;
                                    i2 = 1;
                                } else if (i4 == 3) {
                                    i2 = 2;
                                } else if (i4 != 4) {
                                    i2 = 5;
                                    if (i4 != 5) {
                                        i2 = 6;
                                    }
                                } else {
                                    str4 = str5;
                                    z2 = z3;
                                    i2 = 3;
                                }
                                long j9 = next.f6940g;
                                str3 = str4;
                                StringBuilder sb = new StringBuilder(String.valueOf(str9).length() + 33);
                                sb.append(str9);
                                sb.append(".");
                                sb.append(i2);
                                sb.append(".");
                                sb.append(j9);
                                String sb2 = sb.toString();
                                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(sb2).length());
                                sb3.append(valueOf);
                                sb3.append(sb2);
                                sb3.append("_");
                                str8 = sb3.toString();
                                it2 = it;
                                zzael2 = zzael;
                                j8 = j2;
                                list6 = list2;
                                z3 = z2;
                                str5 = str3;
                            } else {
                                i2 = 4;
                            }
                            str4 = str5;
                            z2 = z3;
                            long j92 = next.f6940g;
                            str3 = str4;
                            StringBuilder sb4 = new StringBuilder(String.valueOf(str9).length() + 33);
                            sb4.append(str9);
                            sb4.append(".");
                            sb4.append(i2);
                            sb4.append(".");
                            sb4.append(j92);
                            String sb22 = sb4.toString();
                            StringBuilder sb32 = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(sb22).length());
                            sb32.append(valueOf);
                            sb32.append(sb22);
                            sb32.append("_");
                            str8 = sb32.toString();
                            it2 = it;
                            zzael2 = zzael;
                            j8 = j2;
                            list6 = list2;
                            z3 = z2;
                            str5 = str3;
                        }
                    } else {
                        list2 = list6;
                        it = it2;
                    }
                    str3 = str5;
                    z2 = z3;
                    j2 = j8;
                    it2 = it;
                    zzael2 = zzael;
                    j8 = j2;
                    list6 = list2;
                    z3 = z2;
                    str5 = str3;
                }
                list = list6;
                str = str5;
                z = z3;
                j = j8;
                str2 = str8.substring(0, Math.max(0, str8.length() - 1));
            }
        } else {
            list = list6;
            zzael = zzael2;
            str = str5;
            z = z3;
            j = j8;
            str2 = null;
        }
        zzaej zzaej3 = this.f7228i;
        List<String> list9 = zzaej3.f10788K;
        String str10 = zzaej3.f10792O;
        C2282Ed ed2 = this.f7227h;
        return new C2254Dd(zzjj, uhVar, list3, i, list4, list5, i3, j3, str, z, vzVar2, pz2, name, wzVar2, zzVar, j5, zzjn2, j6, j7, j, str7, jSONObject2, (C2329Fv) null, zzaig, list, list8, z4, zzael, str2, list9, str10, ed2.f6950i, zzaej3.f10796S, ed2.f6951j, zzaej3.f10798U, zzaej3.f10799V, zzaej3.f10800W, zzaej3.f10801X);
    }

    /* renamed from: c */
    public final void mo7015c() {
        synchronized (this.f7226g) {
            super.mo7015c();
            if (this.f8324k != null) {
                this.f8324k.cancel();
            }
        }
    }
}
