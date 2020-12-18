package com.google.firebase.iid;

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

/* renamed from: com.google.firebase.iid.K */
final class C4062K implements ServiceConnection {

    /* renamed from: a */
    int f12060a;

    /* renamed from: b */
    final Messenger f12061b;

    /* renamed from: c */
    C4067P f12062c;

    /* renamed from: d */
    final Queue<C4071b<?>> f12063d;

    /* renamed from: e */
    final SparseArray<C4071b<?>> f12064e;

    /* renamed from: f */
    final /* synthetic */ C4060I f12065f;

    private C4062K(C4060I i) {
        this.f12065f = i;
        this.f12060a = 0;
        this.f12061b = new Messenger(new Handler(Looper.getMainLooper(), new C4063L(this)));
        this.f12063d = new ArrayDeque();
        this.f12064e = new SparseArray<>();
    }

    /* renamed from: c */
    private final void m16286c() {
        this.f12065f.f12057c.execute(new C4065N(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo11485a() {
        if (this.f12060a == 2 && this.f12063d.isEmpty() && this.f12064e.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.f12060a = 3;
            C1985a.m8731a().mo7511b(this.f12065f.f12056b, this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo11486a(int i) {
        C4071b bVar = this.f12064e.get(i);
        if (bVar != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i);
            Log.w("MessengerIpcClient", sb.toString());
            this.f12064e.remove(i);
            bVar.mo11499a(new C4072c(3, "Timed out waiting for response"));
            mo11485a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo11487a(int i, String str) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            Log.d("MessengerIpcClient", valueOf.length() != 0 ? "Disconnected: ".concat(valueOf) : new String("Disconnected: "));
        }
        int i2 = this.f12060a;
        if (i2 == 0) {
            throw new IllegalStateException();
        } else if (i2 == 1 || i2 == 2) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f12060a = 4;
            C1985a.m8731a().mo7511b(this.f12065f.f12056b, this);
            C4072c cVar = new C4072c(i, str);
            for (C4071b a : this.f12063d) {
                a.mo11499a(cVar);
            }
            this.f12063d.clear();
            for (int i3 = 0; i3 < this.f12064e.size(); i3++) {
                this.f12064e.valueAt(i3).mo11499a(cVar);
            }
            this.f12064e.clear();
        } else if (i2 == 3) {
            this.f12060a = 4;
        } else if (i2 != 4) {
            int i4 = this.f12060a;
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
        r1.mo11499a(new com.google.firebase.iid.C4072c(4, "Not supported by GmsCore"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006b, code lost:
        r1.mo11498a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006e, code lost:
        return true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo11488a(android.os.Message r5) {
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
            android.util.SparseArray<com.google.firebase.iid.b<?>> r1 = r4.f12064e     // Catch:{ all -> 0x006f }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x006f }
            com.google.firebase.iid.b r1 = (com.google.firebase.iid.C4071b) r1     // Catch:{ all -> 0x006f }
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
            android.util.SparseArray<com.google.firebase.iid.b<?>> r3 = r4.f12064e     // Catch:{ all -> 0x006f }
            r3.remove(r0)     // Catch:{ all -> 0x006f }
            r4.mo11485a()     // Catch:{ all -> 0x006f }
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            android.os.Bundle r5 = r5.getData()
            r0 = 0
            java.lang.String r3 = "unsupported"
            boolean r0 = r5.getBoolean(r3, r0)
            if (r0 == 0) goto L_0x006b
            com.google.firebase.iid.c r5 = new com.google.firebase.iid.c
            r0 = 4
            java.lang.String r3 = "Not supported by GmsCore"
            r5.<init>(r0, r3)
            r1.mo11499a((com.google.firebase.iid.C4072c) r5)
            goto L_0x006e
        L_0x006b:
            r1.mo11498a((android.os.Bundle) r5)
        L_0x006e:
            return r2
        L_0x006f:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C4062K.mo11488a(android.os.Message):boolean");
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
    public final synchronized boolean mo11489a(com.google.firebase.iid.C4071b r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f12060a     // Catch:{ all -> 0x0097 }
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
            int r0 = r5.f12060a     // Catch:{ all -> 0x0097 }
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
            java.util.Queue<com.google.firebase.iid.b<?>> r0 = r5.f12063d     // Catch:{ all -> 0x0097 }
            r0.add(r6)     // Catch:{ all -> 0x0097 }
            r5.m16286c()     // Catch:{ all -> 0x0097 }
            monitor-exit(r5)
            return r3
        L_0x003a:
            java.util.Queue<com.google.firebase.iid.b<?>> r0 = r5.f12063d     // Catch:{ all -> 0x0097 }
            r0.add(r6)     // Catch:{ all -> 0x0097 }
            monitor-exit(r5)
            return r3
        L_0x0041:
            java.util.Queue<com.google.firebase.iid.b<?>> r0 = r5.f12063d     // Catch:{ all -> 0x0097 }
            r0.add(r6)     // Catch:{ all -> 0x0097 }
            int r6 = r5.f12060a     // Catch:{ all -> 0x0097 }
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
            r5.f12060a = r3     // Catch:{ all -> 0x0097 }
            android.content.Intent r6 = new android.content.Intent     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = "com.google.android.c2dm.intent.REGISTER"
            r6.<init>(r0)     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = "com.google.android.gms"
            r6.setPackage(r0)     // Catch:{ all -> 0x0097 }
            com.google.android.gms.common.b.a r0 = com.google.android.gms.common.p071b.C1985a.m8731a()     // Catch:{ all -> 0x0097 }
            com.google.firebase.iid.I r1 = r5.f12065f     // Catch:{ all -> 0x0097 }
            android.content.Context r1 = r1.f12056b     // Catch:{ all -> 0x0097 }
            boolean r6 = r0.mo7509a((android.content.Context) r1, (android.content.Intent) r6, (android.content.ServiceConnection) r5, (int) r3)     // Catch:{ all -> 0x0097 }
            if (r6 != 0) goto L_0x0083
            java.lang.String r6 = "Unable to bind to service"
            r5.mo11487a(r2, r6)     // Catch:{ all -> 0x0097 }
            goto L_0x0095
        L_0x0083:
            com.google.firebase.iid.I r6 = r5.f12065f     // Catch:{ all -> 0x0097 }
            java.util.concurrent.ScheduledExecutorService r6 = r6.f12057c     // Catch:{ all -> 0x0097 }
            com.google.firebase.iid.M r0 = new com.google.firebase.iid.M     // Catch:{ all -> 0x0097 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C4062K.mo11489a(com.google.firebase.iid.b):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo11490b() {
        if (this.f12060a == 1) {
            mo11487a(1, "Timed out while binding");
        }
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        if (iBinder == null) {
            mo11487a(0, "Null service connection");
            return;
        }
        try {
            this.f12062c = new C4067P(iBinder);
            this.f12060a = 2;
            m16286c();
        } catch (RemoteException e) {
            mo11487a(0, e.getMessage());
        }
    }

    public final synchronized void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        mo11487a(2, "Service disconnected");
    }
}
