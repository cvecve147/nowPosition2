package com.google.android.gms.iid;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.p071b.C1985a;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: com.google.android.gms.iid.x */
final class C2160x implements ServiceConnection {

    /* renamed from: a */
    int f6649a;

    /* renamed from: b */
    final Messenger f6650b;

    /* renamed from: c */
    C2135C f6651c;

    /* renamed from: d */
    final Queue<C2136D<?>> f6652d;

    /* renamed from: e */
    final SparseArray<C2136D<?>> f6653e;

    /* renamed from: f */
    final /* synthetic */ C2158v f6654f;

    private C2160x(C2158v vVar) {
        this.f6654f = vVar;
        this.f6649a = 0;
        this.f6650b = new Messenger(new Handler(Looper.getMainLooper(), new C2161y(this)));
        this.f6652d = new ArrayDeque();
        this.f6653e = new SparseArray<>();
    }

    /* renamed from: c */
    private final void m9297c() {
        this.f6654f.f6646b.execute(new C2133A(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo7784a() {
        if (this.f6649a == 2 && this.f6652d.isEmpty() && this.f6653e.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.f6649a = 3;
            C1985a.m8731a().mo7511b(this.f6654f.f6645a, this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo7785a(int i) {
        C2136D d = this.f6653e.get(i);
        if (d != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i);
            Log.w("MessengerIpcClient", sb.toString());
            this.f6653e.remove(i);
            d.mo7751a(new C2139c(3, "Timed out waiting for response"));
            mo7784a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo7786a(int i, String str) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            Log.d("MessengerIpcClient", valueOf.length() != 0 ? "Disconnected: ".concat(valueOf) : new String("Disconnected: "));
        }
        int i2 = this.f6649a;
        if (i2 == 0) {
            throw new IllegalStateException();
        } else if (i2 == 1 || i2 == 2) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f6649a = 4;
            C1985a.m8731a().mo7511b(this.f6654f.f6645a, this);
            C2139c cVar = new C2139c(i, str);
            for (C2136D a : this.f6652d) {
                a.mo7751a(cVar);
            }
            this.f6652d.clear();
            for (int i3 = 0; i3 < this.f6653e.size(); i3++) {
                this.f6653e.valueAt(i3).mo7751a(cVar);
            }
            this.f6653e.clear();
        } else if (i2 == 3) {
            this.f6649a = 4;
        } else if (i2 != 4) {
            int i4 = this.f6649a;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Unknown state: ");
            sb.append(i4);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0052, code lost:
        r5 = r5.getData();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005d, code lost:
        if (r5.getBoolean("unsupported", false) == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005f, code lost:
        r1.mo7751a(new com.google.android.gms.iid.C2139c(4, "Not supported by GmsCore"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006b, code lost:
        r1.mo7750a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006e, code lost:
        return true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo7787a(android.os.Message r5) {
        /*
            r4 = this;
            int r0 = r5.arg1
            java.lang.String r1 = "MessengerIpcClient"
            r2 = 3
            boolean r1 = android.util.Log.isLoggable(r1, r2)
            if (r1 == 0) goto L_0x0023
            r1 = 41
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Received response to request: "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "MessengerIpcClient"
            android.util.Log.d(r2, r1)
        L_0x0023:
            monitor-enter(r4)
            android.util.SparseArray<com.google.android.gms.iid.D<?>> r1 = r4.f6653e     // Catch:{ all -> 0x006f }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x006f }
            com.google.android.gms.iid.D r1 = (com.google.android.gms.iid.C2136D) r1     // Catch:{ all -> 0x006f }
            r2 = 1
            if (r1 != 0) goto L_0x0049
            java.lang.String r5 = "MessengerIpcClient"
            r1 = 50
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x006f }
            r3.<init>(r1)     // Catch:{ all -> 0x006f }
            java.lang.String r1 = "Received response for unknown request: "
            r3.append(r1)     // Catch:{ all -> 0x006f }
            r3.append(r0)     // Catch:{ all -> 0x006f }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x006f }
            android.util.Log.w(r5, r0)     // Catch:{ all -> 0x006f }
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            return r2
        L_0x0049:
            android.util.SparseArray<com.google.android.gms.iid.D<?>> r3 = r4.f6653e     // Catch:{ all -> 0x006f }
            r3.remove(r0)     // Catch:{ all -> 0x006f }
            r4.mo7784a()     // Catch:{ all -> 0x006f }
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            android.os.Bundle r5 = r5.getData()
            r0 = 0
            java.lang.String r3 = "unsupported"
            boolean r0 = r5.getBoolean(r3, r0)
            if (r0 == 0) goto L_0x006b
            com.google.android.gms.iid.c r5 = new com.google.android.gms.iid.c
            r0 = 4
            java.lang.String r3 = "Not supported by GmsCore"
            r5.<init>(r0, r3)
            r1.mo7751a((com.google.android.gms.iid.C2139c) r5)
            goto L_0x006e
        L_0x006b:
            r1.mo7750a((android.os.Bundle) r5)
        L_0x006e:
            return r2
        L_0x006f:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.iid.C2160x.mo7787a(android.os.Message):boolean");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0096, code lost:
        return true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo7788a(com.google.android.gms.iid.C2136D r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f6649a     // Catch:{ all -> 0x0097 }
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0041
            if (r0 == r3) goto L_0x003a
            if (r0 == r1) goto L_0x0030
            r6 = 3
            if (r0 == r6) goto L_0x002e
            r6 = 4
            if (r0 != r6) goto L_0x0013
            goto L_0x002e
        L_0x0013:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0097 }
            int r0 = r5.f6649a     // Catch:{ all -> 0x0097 }
            r1 = 26
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0097 }
            r2.<init>(r1)     // Catch:{ all -> 0x0097 }
            java.lang.String r1 = "Unknown state: "
            r2.append(r1)     // Catch:{ all -> 0x0097 }
            r2.append(r0)     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0097 }
            r6.<init>(r0)     // Catch:{ all -> 0x0097 }
            throw r6     // Catch:{ all -> 0x0097 }
        L_0x002e:
            monitor-exit(r5)
            return r2
        L_0x0030:
            java.util.Queue<com.google.android.gms.iid.D<?>> r0 = r5.f6652d     // Catch:{ all -> 0x0097 }
            r0.add(r6)     // Catch:{ all -> 0x0097 }
            r5.m9297c()     // Catch:{ all -> 0x0097 }
            monitor-exit(r5)
            return r3
        L_0x003a:
            java.util.Queue<com.google.android.gms.iid.D<?>> r0 = r5.f6652d     // Catch:{ all -> 0x0097 }
            r0.add(r6)     // Catch:{ all -> 0x0097 }
            monitor-exit(r5)
            return r3
        L_0x0041:
            java.util.Queue<com.google.android.gms.iid.D<?>> r0 = r5.f6652d     // Catch:{ all -> 0x0097 }
            r0.add(r6)     // Catch:{ all -> 0x0097 }
            int r6 = r5.f6649a     // Catch:{ all -> 0x0097 }
            if (r6 != 0) goto L_0x004c
            r6 = r3
            goto L_0x004d
        L_0x004c:
            r6 = r2
        L_0x004d:
            com.google.android.gms.common.internal.C2061y.m9077b((boolean) r6)     // Catch:{ all -> 0x0097 }
            java.lang.String r6 = "MessengerIpcClient"
            boolean r6 = android.util.Log.isLoggable(r6, r1)     // Catch:{ all -> 0x0097 }
            if (r6 == 0) goto L_0x005f
            java.lang.String r6 = "MessengerIpcClient"
            java.lang.String r0 = "Starting bind to GmsCore"
            android.util.Log.v(r6, r0)     // Catch:{ all -> 0x0097 }
        L_0x005f:
            r5.f6649a = r3     // Catch:{ all -> 0x0097 }
            android.content.Intent r6 = new android.content.Intent     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = "com.google.android.c2dm.intent.REGISTER"
            r6.<init>(r0)     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = "com.google.android.gms"
            r6.setPackage(r0)     // Catch:{ all -> 0x0097 }
            com.google.android.gms.common.b.a r0 = com.google.android.gms.common.p071b.C1985a.m8731a()     // Catch:{ all -> 0x0097 }
            com.google.android.gms.iid.v r1 = r5.f6654f     // Catch:{ all -> 0x0097 }
            android.content.Context r1 = r1.f6645a     // Catch:{ all -> 0x0097 }
            boolean r6 = r0.mo7509a((android.content.Context) r1, (android.content.Intent) r6, (android.content.ServiceConnection) r5, (int) r3)     // Catch:{ all -> 0x0097 }
            if (r6 != 0) goto L_0x0083
            java.lang.String r6 = "Unable to bind to service"
            r5.mo7786a(r2, r6)     // Catch:{ all -> 0x0097 }
            goto L_0x0095
        L_0x0083:
            com.google.android.gms.iid.v r6 = r5.f6654f     // Catch:{ all -> 0x0097 }
            java.util.concurrent.ScheduledExecutorService r6 = r6.f6646b     // Catch:{ all -> 0x0097 }
            com.google.android.gms.iid.z r0 = new com.google.android.gms.iid.z     // Catch:{ all -> 0x0097 }
            r0.<init>(r5)     // Catch:{ all -> 0x0097 }
            r1 = 30
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0097 }
            r6.schedule(r0, r1, r4)     // Catch:{ all -> 0x0097 }
        L_0x0095:
            monitor-exit(r5)
            return r3
        L_0x0097:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.iid.C2160x.mo7788a(com.google.android.gms.iid.D):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo7789b() {
        if (this.f6649a == 1) {
            mo7786a(1, "Timed out while binding");
        }
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        if (iBinder == null) {
            mo7786a(0, "Null service connection");
            return;
        }
        try {
            this.f6651c = new C2135C(iBinder);
            this.f6649a = 2;
            m9297c();
        } catch (RemoteException e) {
            mo7786a(0, e.getMessage());
        }
    }

    public final synchronized void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        mo7786a(2, "Service disconnected");
    }
}
