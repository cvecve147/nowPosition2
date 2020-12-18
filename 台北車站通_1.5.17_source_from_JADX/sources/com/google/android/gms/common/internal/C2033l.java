package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.common.internal.l */
public final class C2033l implements Handler.Callback {

    /* renamed from: a */
    private final C2034a f6493a;

    /* renamed from: b */
    private final ArrayList<GoogleApiClient.C1848b> f6494b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<GoogleApiClient.C1848b> f6495c = new ArrayList<>();

    /* renamed from: d */
    private final ArrayList<GoogleApiClient.C1849c> f6496d = new ArrayList<>();

    /* renamed from: e */
    private volatile boolean f6497e = false;

    /* renamed from: f */
    private final AtomicInteger f6498f = new AtomicInteger(0);

    /* renamed from: g */
    private boolean f6499g = false;

    /* renamed from: h */
    private final Handler f6500h;

    /* renamed from: i */
    private final Object f6501i = new Object();

    /* renamed from: com.google.android.gms.common.internal.l$a */
    public interface C2034a {
        boolean isConnected();

        /* renamed from: l */
        Bundle mo7372l();
    }

    public C2033l(Looper looper, C2034a aVar) {
        this.f6493a = aVar;
        this.f6500h = new Handler(looper, this);
    }

    /* renamed from: a */
    public final void mo7680a() {
        this.f6497e = false;
        this.f6498f.incrementAndGet();
    }

    /* renamed from: a */
    public final void mo7681a(int i) {
        C2061y.m9078b(Looper.myLooper() == this.f6500h.getLooper(), "onUnintentionalDisconnection must only be called on the Handler thread");
        this.f6500h.removeMessages(1);
        synchronized (this.f6501i) {
            this.f6499g = true;
            ArrayList arrayList = new ArrayList(this.f6494b);
            int i2 = this.f6498f.get();
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                GoogleApiClient.C1848b bVar = (GoogleApiClient.C1848b) obj;
                if (!this.f6497e || this.f6498f.get() != i2) {
                    break;
                } else if (this.f6494b.contains(bVar)) {
                    bVar.mo7261f(i);
                }
            }
            this.f6495c.clear();
            this.f6499g = false;
        }
    }

    /* renamed from: a */
    public final void mo7682a(Bundle bundle) {
        boolean z = true;
        C2061y.m9078b(Looper.myLooper() == this.f6500h.getLooper(), "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.f6501i) {
            C2061y.m9077b(!this.f6499g);
            this.f6500h.removeMessages(1);
            this.f6499g = true;
            if (this.f6495c.size() != 0) {
                z = false;
            }
            C2061y.m9077b(z);
            ArrayList arrayList = new ArrayList(this.f6494b);
            int i = this.f6498f.get();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                GoogleApiClient.C1848b bVar = (GoogleApiClient.C1848b) obj;
                if (!this.f6497e || !this.f6493a.isConnected() || this.f6498f.get() != i) {
                    break;
                } else if (!this.f6495c.contains(bVar)) {
                    bVar.mo7262j(bundle);
                }
            }
            this.f6495c.clear();
            this.f6499g = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0053, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7683a(com.google.android.gms.common.ConnectionResult r8) {
        /*
            r7 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Handler r1 = r7.f6500h
            android.os.Looper r1 = r1.getLooper()
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L_0x0010
            r0 = r3
            goto L_0x0011
        L_0x0010:
            r0 = r2
        L_0x0011:
            java.lang.String r1 = "onConnectionFailure must only be called on the Handler thread"
            com.google.android.gms.common.internal.C2061y.m9078b(r0, r1)
            android.os.Handler r0 = r7.f6500h
            r0.removeMessages(r3)
            java.lang.Object r0 = r7.f6501i
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0056 }
            java.util.ArrayList<com.google.android.gms.common.api.GoogleApiClient$c> r3 = r7.f6496d     // Catch:{ all -> 0x0056 }
            r1.<init>(r3)     // Catch:{ all -> 0x0056 }
            java.util.concurrent.atomic.AtomicInteger r3 = r7.f6498f     // Catch:{ all -> 0x0056 }
            int r3 = r3.get()     // Catch:{ all -> 0x0056 }
            int r4 = r1.size()     // Catch:{ all -> 0x0056 }
        L_0x002f:
            if (r2 >= r4) goto L_0x0054
            java.lang.Object r5 = r1.get(r2)     // Catch:{ all -> 0x0056 }
            int r2 = r2 + 1
            com.google.android.gms.common.api.GoogleApiClient$c r5 = (com.google.android.gms.common.api.GoogleApiClient.C1849c) r5     // Catch:{ all -> 0x0056 }
            boolean r6 = r7.f6497e     // Catch:{ all -> 0x0056 }
            if (r6 == 0) goto L_0x0052
            java.util.concurrent.atomic.AtomicInteger r6 = r7.f6498f     // Catch:{ all -> 0x0056 }
            int r6 = r6.get()     // Catch:{ all -> 0x0056 }
            if (r6 == r3) goto L_0x0046
            goto L_0x0052
        L_0x0046:
            java.util.ArrayList<com.google.android.gms.common.api.GoogleApiClient$c> r6 = r7.f6496d     // Catch:{ all -> 0x0056 }
            boolean r6 = r6.contains(r5)     // Catch:{ all -> 0x0056 }
            if (r6 == 0) goto L_0x002f
            r5.mo7263a(r8)     // Catch:{ all -> 0x0056 }
            goto L_0x002f
        L_0x0052:
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            return
        L_0x0054:
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            return
        L_0x0056:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C2033l.mo7683a(com.google.android.gms.common.ConnectionResult):void");
    }

    /* renamed from: a */
    public final void mo7684a(GoogleApiClient.C1848b bVar) {
        C2061y.m9067a(bVar);
        synchronized (this.f6501i) {
            if (this.f6494b.contains(bVar)) {
                String valueOf = String.valueOf(bVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62);
                sb.append("registerConnectionCallbacks(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
                Log.w("GmsClientEvents", sb.toString());
            } else {
                this.f6494b.add(bVar);
            }
        }
        if (this.f6493a.isConnected()) {
            Handler handler = this.f6500h;
            handler.sendMessage(handler.obtainMessage(1, bVar));
        }
    }

    /* renamed from: a */
    public final void mo7685a(GoogleApiClient.C1849c cVar) {
        C2061y.m9067a(cVar);
        synchronized (this.f6501i) {
            if (this.f6496d.contains(cVar)) {
                String valueOf = String.valueOf(cVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 67);
                sb.append("registerConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
                Log.w("GmsClientEvents", sb.toString());
            } else {
                this.f6496d.add(cVar);
            }
        }
    }

    /* renamed from: b */
    public final void mo7686b() {
        this.f6497e = true;
    }

    /* renamed from: b */
    public final void mo7687b(GoogleApiClient.C1848b bVar) {
        C2061y.m9067a(bVar);
        synchronized (this.f6501i) {
            if (!this.f6494b.remove(bVar)) {
                String valueOf = String.valueOf(bVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
                sb.append("unregisterConnectionCallbacks(): listener ");
                sb.append(valueOf);
                sb.append(" not found");
                Log.w("GmsClientEvents", sb.toString());
            } else if (this.f6499g) {
                this.f6495c.add(bVar);
            }
        }
    }

    /* renamed from: b */
    public final void mo7688b(GoogleApiClient.C1849c cVar) {
        C2061y.m9067a(cVar);
        synchronized (this.f6501i) {
            if (!this.f6496d.remove(cVar)) {
                String valueOf = String.valueOf(cVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57);
                sb.append("unregisterConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" not found");
                Log.w("GmsClientEvents", sb.toString());
            }
        }
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            GoogleApiClient.C1848b bVar = (GoogleApiClient.C1848b) message.obj;
            synchronized (this.f6501i) {
                if (this.f6497e && this.f6493a.isConnected() && this.f6494b.contains(bVar)) {
                    bVar.mo7262j(this.f6493a.mo7372l());
                }
            }
            return true;
        }
        StringBuilder sb = new StringBuilder(45);
        sb.append("Don't know how to handle message: ");
        sb.append(i);
        Log.wtf("GmsClientEvents", sb.toString(), new Exception());
        return false;
    }
}
