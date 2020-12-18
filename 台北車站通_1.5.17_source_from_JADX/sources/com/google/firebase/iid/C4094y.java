package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: com.google.firebase.iid.y */
public final class C4094y implements ServiceConnection {

    /* renamed from: a */
    private final Context f12136a;

    /* renamed from: b */
    private final Intent f12137b;

    /* renamed from: c */
    private final ScheduledExecutorService f12138c;

    /* renamed from: d */
    private final Queue<C4090u> f12139d;

    /* renamed from: e */
    private C4092w f12140e;

    /* renamed from: f */
    private boolean f12141f;

    public C4094y(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0));
    }

    private C4094y(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f12139d = new ArrayDeque();
        this.f12141f = false;
        this.f12136a = context.getApplicationContext();
        this.f12137b = new Intent(str).setPackage(this.f12136a.getPackageName());
        this.f12138c = scheduledExecutorService;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b6, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m16359a() {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "EnhancedIntentService"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00b9 }
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = "EnhancedIntentService"
            java.lang.String r2 = "flush queue called"
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x00b9 }
        L_0x0011:
            java.util.Queue<com.google.firebase.iid.u> r0 = r5.f12139d     // Catch:{ all -> 0x00b9 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00b9 }
            if (r0 != 0) goto L_0x00b7
            java.lang.String r0 = "EnhancedIntentService"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00b9 }
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = "EnhancedIntentService"
            java.lang.String r2 = "found intent to be delivered"
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x00b9 }
        L_0x0028:
            com.google.firebase.iid.w r0 = r5.f12140e     // Catch:{ all -> 0x00b9 }
            if (r0 == 0) goto L_0x0051
            com.google.firebase.iid.w r0 = r5.f12140e     // Catch:{ all -> 0x00b9 }
            boolean r0 = r0.isBinderAlive()     // Catch:{ all -> 0x00b9 }
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = "EnhancedIntentService"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00b9 }
            if (r0 == 0) goto L_0x0043
            java.lang.String r0 = "EnhancedIntentService"
            java.lang.String r2 = "binder is alive, sending the intent."
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x00b9 }
        L_0x0043:
            java.util.Queue<com.google.firebase.iid.u> r0 = r5.f12139d     // Catch:{ all -> 0x00b9 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x00b9 }
            com.google.firebase.iid.u r0 = (com.google.firebase.iid.C4090u) r0     // Catch:{ all -> 0x00b9 }
            com.google.firebase.iid.w r2 = r5.f12140e     // Catch:{ all -> 0x00b9 }
            r2.mo11532a((com.google.firebase.iid.C4090u) r0)     // Catch:{ all -> 0x00b9 }
            goto L_0x0011
        L_0x0051:
            java.lang.String r0 = "EnhancedIntentService"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00b9 }
            r1 = 1
            if (r0 == 0) goto L_0x0079
            java.lang.String r0 = "EnhancedIntentService"
            boolean r2 = r5.f12141f     // Catch:{ all -> 0x00b9 }
            if (r2 != 0) goto L_0x0062
            r2 = r1
            goto L_0x0063
        L_0x0062:
            r2 = 0
        L_0x0063:
            r3 = 39
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b9 }
            r4.<init>(r3)     // Catch:{ all -> 0x00b9 }
            java.lang.String r3 = "binder is dead. start connection? "
            r4.append(r3)     // Catch:{ all -> 0x00b9 }
            r4.append(r2)     // Catch:{ all -> 0x00b9 }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x00b9 }
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x00b9 }
        L_0x0079:
            boolean r0 = r5.f12141f     // Catch:{ all -> 0x00b9 }
            if (r0 != 0) goto L_0x00b5
            r5.f12141f = r1     // Catch:{ all -> 0x00b9 }
            com.google.android.gms.common.b.a r0 = com.google.android.gms.common.p071b.C1985a.m8731a()     // Catch:{ SecurityException -> 0x0099 }
            android.content.Context r1 = r5.f12136a     // Catch:{ SecurityException -> 0x0099 }
            android.content.Intent r2 = r5.f12137b     // Catch:{ SecurityException -> 0x0099 }
            r3 = 65
            boolean r0 = r0.mo7509a((android.content.Context) r1, (android.content.Intent) r2, (android.content.ServiceConnection) r5, (int) r3)     // Catch:{ SecurityException -> 0x0099 }
            if (r0 == 0) goto L_0x0091
            monitor-exit(r5)
            return
        L_0x0091:
            java.lang.String r0 = "EnhancedIntentService"
            java.lang.String r1 = "binding to the service failed"
            android.util.Log.e(r0, r1)     // Catch:{ SecurityException -> 0x0099 }
            goto L_0x00a1
        L_0x0099:
            r0 = move-exception
            java.lang.String r1 = "EnhancedIntentService"
            java.lang.String r2 = "Exception while binding the service"
            android.util.Log.e(r1, r2, r0)     // Catch:{ all -> 0x00b9 }
        L_0x00a1:
            java.util.Queue<com.google.firebase.iid.u> r0 = r5.f12139d     // Catch:{ all -> 0x00b9 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00b9 }
            if (r0 != 0) goto L_0x00b5
            java.util.Queue<com.google.firebase.iid.u> r0 = r5.f12139d     // Catch:{ all -> 0x00b9 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x00b9 }
            com.google.firebase.iid.u r0 = (com.google.firebase.iid.C4090u) r0     // Catch:{ all -> 0x00b9 }
            r0.mo11530a()     // Catch:{ all -> 0x00b9 }
            goto L_0x00a1
        L_0x00b5:
            monitor-exit(r5)
            return
        L_0x00b7:
            monitor-exit(r5)
            return
        L_0x00b9:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C4094y.m16359a():void");
    }

    /* renamed from: a */
    public final synchronized void mo11534a(Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "new intent queued in the bind-strategy delivery");
        }
        this.f12139d.add(new C4090u(intent, pendingResult, this.f12138c));
        m16359a();
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this) {
            this.f12141f = false;
            this.f12140e = (C4092w) iBinder;
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                String valueOf = String.valueOf(componentName);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb.append("onServiceConnected: ");
                sb.append(valueOf);
                Log.d("EnhancedIntentService", sb.toString());
            }
            m16359a();
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("onServiceDisconnected: ");
            sb.append(valueOf);
            Log.d("EnhancedIntentService", sb.toString());
        }
        m16359a();
    }
}
