package com.google.firebase.iid;

import android.content.Intent;
import java.util.ArrayDeque;
import java.util.Queue;
import p013b.p018b.p028h.p039h.C1101r;

/* renamed from: com.google.firebase.iid.n */
public final class C4083n {

    /* renamed from: a */
    private static C4083n f12101a;

    /* renamed from: b */
    private final C1101r<String, String> f12102b = new C1101r<>();

    /* renamed from: c */
    private Boolean f12103c = null;

    /* renamed from: d */
    final Queue<Intent> f12104d = new ArrayDeque();

    /* renamed from: e */
    private final Queue<Intent> f12105e = new ArrayDeque();

    private C4083n() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d9 A[Catch:{ SecurityException -> 0x0136, IllegalStateException -> 0x010e }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f0 A[Catch:{ SecurityException -> 0x0136, IllegalStateException -> 0x010e }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f5 A[Catch:{ SecurityException -> 0x0136, IllegalStateException -> 0x010e }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0102 A[Catch:{ SecurityException -> 0x0136, IllegalStateException -> 0x010e }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x010c A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m16329a(android.content.Context r6, android.content.Intent r7) {
        /*
            r5 = this;
            b.b.h.h.r<java.lang.String, java.lang.String> r0 = r5.f12102b
            monitor-enter(r0)
            b.b.h.h.r<java.lang.String, java.lang.String> r1 = r5.f12102b     // Catch:{ all -> 0x0141 }
            java.lang.String r2 = r7.getAction()     // Catch:{ all -> 0x0141 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x0141 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0141 }
            monitor-exit(r0)     // Catch:{ all -> 0x0141 }
            r0 = 0
            if (r1 != 0) goto L_0x00a9
            android.content.pm.PackageManager r1 = r6.getPackageManager()
            android.content.pm.ResolveInfo r1 = r1.resolveService(r7, r0)
            if (r1 == 0) goto L_0x00a1
            android.content.pm.ServiceInfo r1 = r1.serviceInfo
            if (r1 != 0) goto L_0x0023
            goto L_0x00a1
        L_0x0023:
            java.lang.String r2 = r6.getPackageName()
            java.lang.String r3 = r1.packageName
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x006b
            java.lang.String r2 = r1.name
            if (r2 != 0) goto L_0x0034
            goto L_0x006b
        L_0x0034:
            java.lang.String r1 = r1.name
            java.lang.String r2 = "."
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L_0x005a
            java.lang.String r2 = r6.getPackageName()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r3 = r1.length()
            if (r3 == 0) goto L_0x0055
            java.lang.String r1 = r2.concat(r1)
            goto L_0x005a
        L_0x0055:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
        L_0x005a:
            b.b.h.h.r<java.lang.String, java.lang.String> r2 = r5.f12102b
            monitor-enter(r2)
            b.b.h.h.r<java.lang.String, java.lang.String> r3 = r5.f12102b     // Catch:{ all -> 0x0068 }
            java.lang.String r4 = r7.getAction()     // Catch:{ all -> 0x0068 }
            r3.put(r4, r1)     // Catch:{ all -> 0x0068 }
            monitor-exit(r2)     // Catch:{ all -> 0x0068 }
            goto L_0x00a9
        L_0x0068:
            r6 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0068 }
            throw r6
        L_0x006b:
            java.lang.String r2 = r1.packageName
            java.lang.String r1 = r1.name
            java.lang.String r3 = java.lang.String.valueOf(r2)
            int r3 = r3.length()
            int r3 = r3 + 94
            java.lang.String r4 = java.lang.String.valueOf(r1)
            int r4 = r4.length()
            int r3 = r3 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "Error resolving target intent service, skipping classname enforcement. Resolved service was: "
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = "/"
            r4.append(r2)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            java.lang.String r2 = "FirebaseInstanceId"
            android.util.Log.e(r2, r1)
            goto L_0x00d5
        L_0x00a1:
            java.lang.String r1 = "FirebaseInstanceId"
            java.lang.String r2 = "Failed to resolve target intent service, skipping classname enforcement"
            android.util.Log.e(r1, r2)
            goto L_0x00d5
        L_0x00a9:
            r2 = 3
            java.lang.String r3 = "FirebaseInstanceId"
            boolean r2 = android.util.Log.isLoggable(r3, r2)
            if (r2 == 0) goto L_0x00ce
            java.lang.String r2 = "Restricting intent to a specific service: "
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r4 = r3.length()
            if (r4 == 0) goto L_0x00c3
            java.lang.String r2 = r2.concat(r3)
            goto L_0x00c9
        L_0x00c3:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r2)
            r2 = r3
        L_0x00c9:
            java.lang.String r3 = "FirebaseInstanceId"
            android.util.Log.d(r3, r2)
        L_0x00ce:
            java.lang.String r2 = r6.getPackageName()
            r7.setClassName(r2, r1)
        L_0x00d5:
            java.lang.Boolean r1 = r5.f12103c     // Catch:{ SecurityException -> 0x0136, IllegalStateException -> 0x010e }
            if (r1 != 0) goto L_0x00e8
            java.lang.String r1 = "android.permission.WAKE_LOCK"
            int r1 = r6.checkCallingOrSelfPermission(r1)     // Catch:{ SecurityException -> 0x0136, IllegalStateException -> 0x010e }
            if (r1 != 0) goto L_0x00e2
            r0 = 1
        L_0x00e2:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ SecurityException -> 0x0136, IllegalStateException -> 0x010e }
            r5.f12103c = r0     // Catch:{ SecurityException -> 0x0136, IllegalStateException -> 0x010e }
        L_0x00e8:
            java.lang.Boolean r0 = r5.f12103c     // Catch:{ SecurityException -> 0x0136, IllegalStateException -> 0x010e }
            boolean r0 = r0.booleanValue()     // Catch:{ SecurityException -> 0x0136, IllegalStateException -> 0x010e }
            if (r0 == 0) goto L_0x00f5
            android.content.ComponentName r6 = p013b.p018b.p028h.p029a.C1024f.m5440b(r6, r7)     // Catch:{ SecurityException -> 0x0136, IllegalStateException -> 0x010e }
            goto L_0x0100
        L_0x00f5:
            android.content.ComponentName r6 = r6.startService(r7)     // Catch:{ SecurityException -> 0x0136, IllegalStateException -> 0x010e }
            java.lang.String r7 = "FirebaseInstanceId"
            java.lang.String r0 = "Missing wake lock permission, service start may be delayed"
            android.util.Log.d(r7, r0)     // Catch:{ SecurityException -> 0x0136, IllegalStateException -> 0x010e }
        L_0x0100:
            if (r6 != 0) goto L_0x010c
            java.lang.String r6 = "FirebaseInstanceId"
            java.lang.String r7 = "Error while delivering the message: ServiceIntent not found."
            android.util.Log.e(r6, r7)     // Catch:{ SecurityException -> 0x0136, IllegalStateException -> 0x010e }
            r6 = 404(0x194, float:5.66E-43)
            return r6
        L_0x010c:
            r6 = -1
            return r6
        L_0x010e:
            r6 = move-exception
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = java.lang.String.valueOf(r6)
            int r7 = r7.length()
            int r7 = r7 + 45
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r7)
            java.lang.String r7 = "Failed to start service while in background: "
            r0.append(r7)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r7 = "FirebaseInstanceId"
            android.util.Log.e(r7, r6)
            r6 = 402(0x192, float:5.63E-43)
            return r6
        L_0x0136:
            r6 = move-exception
            java.lang.String r7 = "FirebaseInstanceId"
            java.lang.String r0 = "Error while delivering the message to the serviceIntent"
            android.util.Log.e(r7, r0, r6)
            r6 = 401(0x191, float:5.62E-43)
            return r6
        L_0x0141:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0141 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C4083n.m16329a(android.content.Context, android.content.Intent):int");
    }

    /* renamed from: a */
    public static synchronized C4083n m16330a() {
        C4083n nVar;
        synchronized (C4083n.class) {
            if (f12101a == null) {
                f12101a = new C4083n();
            }
            nVar = f12101a;
        }
        return nVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo11512a(android.content.Context r4, java.lang.String r5, android.content.Intent r6) {
        /*
            r3 = this;
            int r0 = r5.hashCode()
            r1 = -842411455(0xffffffffcdc9d241, float:-4.23249952E8)
            r2 = 1
            if (r0 == r1) goto L_0x001a
            r1 = 41532704(0x279bd20, float:1.8347907E-37)
            if (r0 == r1) goto L_0x0010
            goto L_0x0024
        L_0x0010:
            java.lang.String r0 = "com.google.firebase.MESSAGING_EVENT"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0024
            r0 = r2
            goto L_0x0025
        L_0x001a:
            java.lang.String r0 = "com.google.firebase.INSTANCE_ID_EVENT"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0024
            r0 = 0
            goto L_0x0025
        L_0x0024:
            r0 = -1
        L_0x0025:
            if (r0 == 0) goto L_0x004b
            if (r0 == r2) goto L_0x0048
            java.lang.String r4 = "Unknown service action: "
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r6 = r5.length()
            if (r6 == 0) goto L_0x003a
            java.lang.String r4 = r4.concat(r5)
            goto L_0x0040
        L_0x003a:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r4)
            r4 = r5
        L_0x0040:
            java.lang.String r5 = "FirebaseInstanceId"
            android.util.Log.w(r5, r4)
            r4 = 500(0x1f4, float:7.0E-43)
            return r4
        L_0x0048:
            java.util.Queue<android.content.Intent> r0 = r3.f12105e
            goto L_0x004d
        L_0x004b:
            java.util.Queue<android.content.Intent> r0 = r3.f12104d
        L_0x004d:
            r0.offer(r6)
            android.content.Intent r6 = new android.content.Intent
            r6.<init>(r5)
            java.lang.String r5 = r4.getPackageName()
            r6.setPackage(r5)
            int r4 = r3.m16329a(r4, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C4083n.mo11512a(android.content.Context, java.lang.String, android.content.Intent):int");
    }
}
