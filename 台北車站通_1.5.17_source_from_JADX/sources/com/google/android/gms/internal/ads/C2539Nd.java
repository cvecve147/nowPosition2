package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Nd */
public final class C2539Nd {

    /* renamed from: a */
    private long f7636a = -1;

    /* renamed from: b */
    private long f7637b = -1;

    /* renamed from: c */
    private int f7638c = -1;

    /* renamed from: d */
    int f7639d = -1;

    /* renamed from: e */
    private long f7640e = 0;

    /* renamed from: f */
    private final Object f7641f = new Object();

    /* renamed from: g */
    private final String f7642g;

    /* renamed from: h */
    private int f7643h = 0;

    /* renamed from: i */
    private int f7644i = 0;

    public C2539Nd(String str) {
        this.f7642g = str;
    }

    /* renamed from: a */
    private static boolean m10638a(Context context) {
        int identifier = context.getResources().getIdentifier("Theme.Translucent", "style", "android");
        if (identifier == 0) {
            C2227Cf.m9534c("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        try {
            if (identifier == context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                return true;
            }
            C2227Cf.m9534c("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            C2227Cf.m9536d("Fail to fetch AdActivity theme");
            C2227Cf.m9534c("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
    }

    /* renamed from: a */
    public final Bundle mo8560a(Context context, String str) {
        Bundle bundle;
        synchronized (this.f7641f) {
            bundle = new Bundle();
            bundle.putString("session_id", this.f7642g);
            bundle.putLong("basets", this.f7637b);
            bundle.putLong("currts", this.f7636a);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.f7638c);
            bundle.putInt("preqs_in_session", this.f7639d);
            bundle.putLong("time_in_session", this.f7640e);
            bundle.putInt("pclick", this.f7643h);
            bundle.putInt("pimp", this.f7644i);
            bundle.putBoolean("support_transparent_background", m10638a(context));
        }
        return bundle;
    }

    /* renamed from: a */
    public final void mo8561a() {
        synchronized (this.f7641f) {
            this.f7644i++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8562a(com.google.android.gms.internal.ads.zzjj r10, long r11) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f7641f
            monitor-enter(r0)
            com.google.android.gms.internal.ads.Id r1 = com.google.android.gms.ads.internal.C1697X.m7702i()     // Catch:{ all -> 0x0090 }
            com.google.android.gms.internal.ads._d r1 = r1.mo8333m()     // Catch:{ all -> 0x0090 }
            long r1 = r1.mo9159i()     // Catch:{ all -> 0x0090 }
            com.google.android.gms.common.util.e r3 = com.google.android.gms.ads.internal.C1697X.m7705l()     // Catch:{ all -> 0x0090 }
            long r3 = r3.mo7725a()     // Catch:{ all -> 0x0090 }
            long r5 = r9.f7637b     // Catch:{ all -> 0x0090 }
            r7 = -1
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x004b
            long r1 = r3 - r1
            com.google.android.gms.internal.ads.Du<java.lang.Long> r5 = com.google.android.gms.internal.ads.C2558Nu.f7901hb     // Catch:{ all -> 0x0090 }
            com.google.android.gms.internal.ads.Lu r6 = com.google.android.gms.internal.ads.C3390pt.m13458f()     // Catch:{ all -> 0x0090 }
            java.lang.Object r5 = r6.mo8515a(r5)     // Catch:{ all -> 0x0090 }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ all -> 0x0090 }
            long r5 = r5.longValue()     // Catch:{ all -> 0x0090 }
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x0039
            r1 = -1
            r9.f7639d = r1     // Catch:{ all -> 0x0090 }
            goto L_0x0047
        L_0x0039:
            com.google.android.gms.internal.ads.Id r1 = com.google.android.gms.ads.internal.C1697X.m7702i()     // Catch:{ all -> 0x0090 }
            com.google.android.gms.internal.ads._d r1 = r1.mo8333m()     // Catch:{ all -> 0x0090 }
            int r1 = r1.mo9160j()     // Catch:{ all -> 0x0090 }
            r9.f7639d = r1     // Catch:{ all -> 0x0090 }
        L_0x0047:
            r9.f7637b = r11     // Catch:{ all -> 0x0090 }
            long r11 = r9.f7637b     // Catch:{ all -> 0x0090 }
        L_0x004b:
            r9.f7636a = r11     // Catch:{ all -> 0x0090 }
            r11 = 1
            if (r10 == 0) goto L_0x0061
            android.os.Bundle r12 = r10.f10877c     // Catch:{ all -> 0x0090 }
            if (r12 == 0) goto L_0x0061
            android.os.Bundle r10 = r10.f10877c     // Catch:{ all -> 0x0090 }
            java.lang.String r12 = "gw"
            r1 = 2
            int r10 = r10.getInt(r12, r1)     // Catch:{ all -> 0x0090 }
            if (r10 != r11) goto L_0x0061
            monitor-exit(r0)     // Catch:{ all -> 0x0090 }
            return
        L_0x0061:
            int r10 = r9.f7638c     // Catch:{ all -> 0x0090 }
            int r10 = r10 + r11
            r9.f7638c = r10     // Catch:{ all -> 0x0090 }
            int r10 = r9.f7639d     // Catch:{ all -> 0x0090 }
            int r10 = r10 + r11
            r9.f7639d = r10     // Catch:{ all -> 0x0090 }
            int r10 = r9.f7639d     // Catch:{ all -> 0x0090 }
            if (r10 != 0) goto L_0x007f
            r10 = 0
            r9.f7640e = r10     // Catch:{ all -> 0x0090 }
            com.google.android.gms.internal.ads.Id r10 = com.google.android.gms.ads.internal.C1697X.m7702i()     // Catch:{ all -> 0x0090 }
            com.google.android.gms.internal.ads._d r10 = r10.mo8333m()     // Catch:{ all -> 0x0090 }
            r10.mo9143b((long) r3)     // Catch:{ all -> 0x0090 }
            goto L_0x008e
        L_0x007f:
            com.google.android.gms.internal.ads.Id r10 = com.google.android.gms.ads.internal.C1697X.m7702i()     // Catch:{ all -> 0x0090 }
            com.google.android.gms.internal.ads._d r10 = r10.mo8333m()     // Catch:{ all -> 0x0090 }
            long r10 = r10.mo9161k()     // Catch:{ all -> 0x0090 }
            long r3 = r3 - r10
            r9.f7640e = r3     // Catch:{ all -> 0x0090 }
        L_0x008e:
            monitor-exit(r0)     // Catch:{ all -> 0x0090 }
            return
        L_0x0090:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0090 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2539Nd.mo8562a(com.google.android.gms.internal.ads.zzjj, long):void");
    }

    /* renamed from: b */
    public final void mo8563b() {
        synchronized (this.f7641f) {
            this.f7643h++;
        }
    }
}
