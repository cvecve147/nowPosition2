package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.C1845a;
import com.google.android.gms.common.C1993f;
import com.google.android.gms.common.C1997i;
import com.google.android.gms.common.C2064k;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.common.p071b.C1985a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p101d.p129g.p131b.p132a.p137e.p138a.C5485d;
import p101d.p129g.p131b.p132a.p137e.p138a.C5486e;

public class AdvertisingIdClient {
    private final Context mContext;
    private C1845a zze;
    private C5485d zzf;
    private boolean zzg;
    private final Object zzh;
    private C1671a zzi;
    private final boolean zzj;
    private final long zzk;

    public static final class Info {
        private final String zzq;
        private final boolean zzr;

        public Info(String str, boolean z) {
            this.zzq = str;
            this.zzr = z;
        }

        public final String getId() {
            return this.zzq;
        }

        public final boolean isLimitAdTrackingEnabled() {
            return this.zzr;
        }

        public final String toString() {
            String str = this.zzq;
            boolean z = this.zzr;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    /* renamed from: com.google.android.gms.ads.identifier.AdvertisingIdClient$a */
    static class C1671a extends Thread {

        /* renamed from: a */
        private WeakReference<AdvertisingIdClient> f5493a;

        /* renamed from: b */
        private long f5494b;

        /* renamed from: c */
        CountDownLatch f5495c = new CountDownLatch(1);

        /* renamed from: d */
        boolean f5496d = false;

        public C1671a(AdvertisingIdClient advertisingIdClient, long j) {
            this.f5493a = new WeakReference<>(advertisingIdClient);
            this.f5494b = j;
            start();
        }

        /* renamed from: a */
        private final void m7574a() {
            AdvertisingIdClient advertisingIdClient = (AdvertisingIdClient) this.f5493a.get();
            if (advertisingIdClient != null) {
                advertisingIdClient.finish();
                this.f5496d = true;
            }
        }

        public final void run() {
            try {
                if (!this.f5495c.await(this.f5494b, TimeUnit.MILLISECONDS)) {
                    m7574a();
                }
            } catch (InterruptedException unused) {
                m7574a();
            }
        }
    }

    public AdvertisingIdClient(Context context) {
        this(context, 30000, false, false);
    }

    private AdvertisingIdClient(Context context, long j, boolean z, boolean z2) {
        Context applicationContext;
        this.zzh = new Object();
        C2061y.m9067a(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.mContext = context;
        this.zzg = false;
        this.zzk = j;
        this.zzj = z2;
    }

    public static Info getAdvertisingIdInfo(Context context) {
        C1673b bVar = new C1673b(context);
        boolean a = bVar.mo6720a("gads:ad_id_app_context:enabled", false);
        float a2 = bVar.mo6718a("gads:ad_id_app_context:ping_ratio", 0.0f);
        String a3 = bVar.mo6719a("gads:ad_id_use_shared_preference:experiment_id", "");
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1, a, bVar.mo6720a("gads:ad_id_use_persistent_service:enabled", false));
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.zza(false);
            Info info = advertisingIdClient.getInfo();
            advertisingIdClient.zza(info, a, a2, SystemClock.elapsedRealtime() - elapsedRealtime, a3, (Throwable) null);
            advertisingIdClient.finish();
            return info;
        } catch (Throwable th) {
            advertisingIdClient.finish();
            throw th;
        }
    }

    public static boolean getIsAdIdFakeForDebugLogging(Context context) {
        C1673b bVar = new C1673b(context);
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1, bVar.mo6720a("gads:ad_id_app_context:enabled", false), bVar.mo6720a("com.google.android.gms.ads.identifier.service.PERSISTENT_START", false));
        try {
            advertisingIdClient.zza(false);
            return advertisingIdClient.zzb();
        } finally {
            advertisingIdClient.finish();
        }
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z) {
    }

    private static C1845a zza(Context context, boolean z) {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            int a = C1993f.m8774a().mo7526a(context, (int) C2064k.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            if (a == 0 || a == 2) {
                String str = z ? "com.google.android.gms.ads.identifier.service.PERSISTENT_START" : "com.google.android.gms.ads.identifier.service.START";
                C1845a aVar = new C1845a();
                Intent intent = new Intent(str);
                intent.setPackage("com.google.android.gms");
                try {
                    if (C1985a.m8731a().mo7509a(context, intent, (ServiceConnection) aVar, 1)) {
                        return aVar;
                    }
                    throw new IOException("Connection failure");
                } catch (Throwable th) {
                    throw new IOException(th);
                }
            } else {
                throw new IOException("Google Play services not available");
            }
        } catch (PackageManager.NameNotFoundException unused) {
            throw new C1997i(9);
        }
    }

    private static C5485d zza(Context context, C1845a aVar) {
        try {
            return C5486e.m20988a(aVar.mo7232a(10000, TimeUnit.MILLISECONDS));
        } catch (InterruptedException unused) {
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|(3:5|6|7)|8|9|(1:11)|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0013 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zza() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.zzh
            monitor-enter(r0)
            com.google.android.gms.ads.identifier.AdvertisingIdClient$a r1 = r5.zzi     // Catch:{ all -> 0x0026 }
            if (r1 == 0) goto L_0x0013
            com.google.android.gms.ads.identifier.AdvertisingIdClient$a r1 = r5.zzi     // Catch:{ all -> 0x0026 }
            java.util.concurrent.CountDownLatch r1 = r1.f5495c     // Catch:{ all -> 0x0026 }
            r1.countDown()     // Catch:{ all -> 0x0026 }
            com.google.android.gms.ads.identifier.AdvertisingIdClient$a r1 = r5.zzi     // Catch:{ InterruptedException -> 0x0013 }
            r1.join()     // Catch:{ InterruptedException -> 0x0013 }
        L_0x0013:
            long r1 = r5.zzk     // Catch:{ all -> 0x0026 }
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0024
            com.google.android.gms.ads.identifier.AdvertisingIdClient$a r1 = new com.google.android.gms.ads.identifier.AdvertisingIdClient$a     // Catch:{ all -> 0x0026 }
            long r2 = r5.zzk     // Catch:{ all -> 0x0026 }
            r1.<init>(r5, r2)     // Catch:{ all -> 0x0026 }
            r5.zzi = r1     // Catch:{ all -> 0x0026 }
        L_0x0024:
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            return
        L_0x0026:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.zza():void");
    }

    private final void zza(boolean z) {
        C2061y.m9080c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.zzg) {
                finish();
            }
            this.zze = zza(this.mContext, this.zzj);
            this.zzf = zza(this.mContext, this.zze);
            this.zzg = true;
            if (z) {
                zza();
            }
        }
    }

    private final boolean zza(Info info, boolean z, float f, long j, String str, Throwable th) {
        if (Math.random() > ((double) f)) {
            return false;
        }
        HashMap hashMap = new HashMap();
        String str2 = "1";
        hashMap.put("app_context", z ? str2 : "0");
        if (info != null) {
            if (!info.isLimitAdTrackingEnabled()) {
                str2 = "0";
            }
            hashMap.put("limit_ad_tracking", str2);
        }
        if (!(info == null || info.getId() == null)) {
            hashMap.put("ad_id_size", Integer.toString(info.getId().length()));
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        if (str != null && !str.isEmpty()) {
            hashMap.put("experiment_id", str);
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j));
        new C1672a(this, hashMap).start();
        return true;
    }

    private final boolean zzb() {
        boolean K;
        C2061y.m9080c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.zzg) {
                synchronized (this.zzh) {
                    if (this.zzi == null || !this.zzi.f5496d) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    zza(false);
                    if (!this.zzg) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (RemoteException e) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                    throw new IOException("Remote exception");
                } catch (Exception e2) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
            C2061y.m9067a(this.zze);
            C2061y.m9067a(this.zzf);
            K = this.zzf.mo14937K();
        }
        zza();
        return K;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        finish();
        super.finalize();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void finish() {
        /*
            r3 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            com.google.android.gms.common.internal.C2061y.m9080c(r0)
            monitor-enter(r3)
            android.content.Context r0 = r3.mContext     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0031
            com.google.android.gms.common.a r0 = r3.zze     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x000f
            goto L_0x0031
        L_0x000f:
            boolean r0 = r3.zzg     // Catch:{ Throwable -> 0x001f }
            if (r0 == 0) goto L_0x0027
            com.google.android.gms.common.b.a r0 = com.google.android.gms.common.p071b.C1985a.m8731a()     // Catch:{ Throwable -> 0x001f }
            android.content.Context r1 = r3.mContext     // Catch:{ Throwable -> 0x001f }
            com.google.android.gms.common.a r2 = r3.zze     // Catch:{ Throwable -> 0x001f }
            r0.mo7511b(r1, r2)     // Catch:{ Throwable -> 0x001f }
            goto L_0x0027
        L_0x001f:
            r0 = move-exception
            java.lang.String r1 = "AdvertisingIdClient"
            java.lang.String r2 = "AdvertisingIdClient unbindService failed."
            android.util.Log.i(r1, r2, r0)     // Catch:{ all -> 0x0033 }
        L_0x0027:
            r0 = 0
            r3.zzg = r0     // Catch:{ all -> 0x0033 }
            r0 = 0
            r3.zzf = r0     // Catch:{ all -> 0x0033 }
            r3.zze = r0     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0031:
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0033:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.finish():void");
    }

    public Info getInfo() {
        Info info;
        C2061y.m9080c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.zzg) {
                synchronized (this.zzh) {
                    if (this.zzi == null || !this.zzi.f5496d) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    zza(false);
                    if (!this.zzg) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (RemoteException e) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                    throw new IOException("Remote exception");
                } catch (Exception e2) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
            C2061y.m9067a(this.zze);
            C2061y.m9067a(this.zzf);
            info = new Info(this.zzf.getId(), this.zzf.mo14939h(true));
        }
        zza();
        return info;
    }

    public void start() {
        zza(true);
    }
}
