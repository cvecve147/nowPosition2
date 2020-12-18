package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C2011d;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Pi */
final class C2605Pi implements C2011d.C2012a, C2011d.C2013b {

    /* renamed from: a */
    private C2636Qi f8108a;

    /* renamed from: b */
    private final String f8109b;

    /* renamed from: c */
    private final String f8110c;

    /* renamed from: d */
    private final LinkedBlockingQueue<C2921_l> f8111d;

    /* renamed from: e */
    private final HandlerThread f8112e = new HandlerThread("GassClient");

    public C2605Pi(Context context, String str, String str2) {
        this.f8109b = str;
        this.f8110c = str2;
        this.f8112e.start();
        this.f8108a = new C2636Qi(context, this.f8112e.getLooper(), this, this);
        this.f8111d = new LinkedBlockingQueue<>();
        this.f8108a.mo7630m();
    }

    /* renamed from: a */
    private final void m10879a() {
        C2636Qi qi = this.f8108a;
        if (qi == null) {
            return;
        }
        if (qi.isConnected() || this.f8108a.mo7621d()) {
            this.f8108a.mo7608a();
        }
    }

    /* renamed from: b */
    private final C2722Ti m10880b() {
        try {
            return this.f8108a.mo7557D();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static C2921_l m10881c() {
        C2921_l _lVar = new C2921_l();
        _lVar.f8845v = 32768L;
        return _lVar;
    }

    /* renamed from: a */
    public final C2921_l mo8672a(int i) {
        C2921_l _lVar;
        try {
            _lVar = this.f8111d.poll(5000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            _lVar = null;
        }
        return _lVar == null ? m10881c() : _lVar;
    }

    /* renamed from: a */
    public final void mo7572a(ConnectionResult connectionResult) {
        try {
            this.f8111d.put(m10881c());
        } catch (InterruptedException unused) {
        }
    }

    /* renamed from: f */
    public final void mo7570f(int i) {
        try {
            this.f8111d.put(m10881c());
        } catch (InterruptedException unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        m10879a();
        r3.f8112e.quit();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0027 */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025 A[ExcHandler: all (r4v3 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:2:0x0006] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7571j(android.os.Bundle r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.Ti r4 = r3.m10880b()
            if (r4 == 0) goto L_0x003a
            com.google.android.gms.internal.ads.zzatt r0 = new com.google.android.gms.internal.ads.zzatt     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            java.lang.String r1 = r3.f8109b     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            java.lang.String r2 = r3.f8110c     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            r0.<init>(r1, r2)     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            com.google.android.gms.internal.ads.zzatv r4 = r4.mo8895a(r0)     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            com.google.android.gms.internal.ads._l r4 = r4.mo10304b()     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            java.util.concurrent.LinkedBlockingQueue<com.google.android.gms.internal.ads._l> r0 = r3.f8111d     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            r0.put(r4)     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
        L_0x001c:
            r3.m10879a()
            android.os.HandlerThread r4 = r3.f8112e
            r4.quit()
            return
        L_0x0025:
            r4 = move-exception
            goto L_0x0031
        L_0x0027:
            java.util.concurrent.LinkedBlockingQueue<com.google.android.gms.internal.ads._l> r4 = r3.f8111d     // Catch:{ InterruptedException -> 0x001c, all -> 0x0025 }
            com.google.android.gms.internal.ads._l r0 = m10881c()     // Catch:{ InterruptedException -> 0x001c, all -> 0x0025 }
            r4.put(r0)     // Catch:{ InterruptedException -> 0x001c, all -> 0x0025 }
            goto L_0x001c
        L_0x0031:
            r3.m10879a()
            android.os.HandlerThread r0 = r3.f8112e
            r0.quit()
            throw r4
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2605Pi.mo7571j(android.os.Bundle):void");
    }
}
