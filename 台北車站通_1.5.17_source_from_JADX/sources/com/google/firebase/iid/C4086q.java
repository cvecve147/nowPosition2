package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* renamed from: com.google.firebase.iid.q */
final class C4086q implements Runnable {

    /* renamed from: a */
    private final long f12114a;

    /* renamed from: b */
    private final PowerManager.WakeLock f12115b = ((PowerManager) mo11521a().getSystemService("power")).newWakeLock(1, "fiid-sync");

    /* renamed from: c */
    private final FirebaseInstanceId f12116c;

    /* renamed from: d */
    private final C4074e f12117d;

    C4086q(FirebaseInstanceId firebaseInstanceId, C4074e eVar, long j) {
        this.f12116c = firebaseInstanceId;
        this.f12117d = eVar;
        this.f12114a = j;
        this.f12115b.setReferenceCounted(false);
    }

    /* renamed from: a */
    private final boolean m16345a(String str) {
        String str2;
        String[] split = str.split("!");
        if (split.length == 2) {
            String str3 = split[0];
            String str4 = split[1];
            char c = 65535;
            try {
                int hashCode = str3.hashCode();
                if (hashCode != 83) {
                    if (hashCode == 85) {
                        if (str3.equals("U")) {
                            c = 1;
                        }
                    }
                } else if (str3.equals("S")) {
                    c = 0;
                }
                if (c == 0) {
                    this.f12116c.mo11467a(str4);
                    if (FirebaseInstanceId.m16251h()) {
                        str2 = "subscribe operation succeeded";
                    }
                } else if (c == 1) {
                    this.f12116c.mo11470b(str4);
                    if (FirebaseInstanceId.m16251h()) {
                        str2 = "unsubscribe operation succeeded";
                    }
                }
                Log.d("FirebaseInstanceId", str2);
            } catch (IOException e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.e("FirebaseInstanceId", valueOf.length() != 0 ? "Topic sync failed: ".concat(valueOf) : new String("Topic sync failed: "));
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    private final boolean m16346c() {
        C4085p e = this.f12116c.mo11472e();
        if (e != null && !e.mo11520b(this.f12117d.mo11506c())) {
            return true;
        }
        try {
            String f = this.f12116c.mo11473f();
            if (f == null) {
                Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Token successfully retrieved");
            }
            if (e == null || (e != null && !f.equals(e.f12111b))) {
                Context a = mo11521a();
                Intent intent = new Intent("com.google.firebase.iid.TOKEN_REFRESH");
                Intent intent2 = new Intent("com.google.firebase.INSTANCE_ID_EVENT");
                intent2.setClass(a, FirebaseInstanceIdReceiver.class);
                intent2.putExtra("wrapped_intent", intent);
                a.sendBroadcast(intent2);
            }
            return true;
        } catch (IOException | SecurityException e2) {
            String valueOf = String.valueOf(e2.getMessage());
            Log.e("FirebaseInstanceId", valueOf.length() != 0 ? "Token retrieval failed: ".concat(valueOf) : new String("Token retrieval failed: "));
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (m16345a(r1) != false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        return false;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m16347d() {
        /*
            r3 = this;
        L_0x0000:
            com.google.firebase.iid.FirebaseInstanceId r0 = r3.f12116c
            monitor-enter(r0)
            com.google.firebase.iid.o r1 = com.google.firebase.iid.FirebaseInstanceId.m16250g()     // Catch:{ all -> 0x0028 }
            java.lang.String r1 = r1.mo11514a()     // Catch:{ all -> 0x0028 }
            if (r1 != 0) goto L_0x0017
            java.lang.String r1 = "FirebaseInstanceId"
            java.lang.String r2 = "topic sync succeeded"
            android.util.Log.d(r1, r2)     // Catch:{ all -> 0x0028 }
            r1 = 1
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return r1
        L_0x0017:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            boolean r0 = r3.m16345a(r1)
            if (r0 != 0) goto L_0x0020
            r0 = 0
            return r0
        L_0x0020:
            com.google.firebase.iid.o r0 = com.google.firebase.iid.FirebaseInstanceId.m16250g()
            r0.mo11516a(r1)
            goto L_0x0000
        L_0x0028:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C4086q.m16347d():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Context mo11521a() {
        return this.f12116c.mo11471c().mo15063a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo11522b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) mo11521a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final void run() {
        FirebaseInstanceId firebaseInstanceId;
        this.f12115b.acquire();
        try {
            boolean z = true;
            this.f12116c.mo11468a(true);
            if (this.f12117d.mo11505b() == 0) {
                z = false;
            }
            if (!z) {
                firebaseInstanceId = this.f12116c;
            } else {
                if (!mo11522b()) {
                    new C4087r(this).mo11524a();
                } else if (!m16346c() || !m16347d()) {
                    this.f12116c.mo11466a(this.f12114a);
                } else {
                    firebaseInstanceId = this.f12116c;
                }
            }
            firebaseInstanceId.mo11468a(false);
        } finally {
            this.f12115b.release();
        }
    }
}
