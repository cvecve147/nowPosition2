package org.altbeacon.bluetooth;

import android.app.NotificationManager;
import android.app.TaskStackBuilder;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertiseSettings;
import android.bluetooth.le.BluetoothLeAdvertiser;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.p007v4.app.C0297Y;
import org.altbeacon.beacon.p293c.C6895d;
import p013b.p018b.p028h.p029a.C1020d;

/* renamed from: org.altbeacon.bluetooth.h */
public class C6970h {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f19271a = "h";

    /* renamed from: b */
    private static C6970h f19272b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public BluetoothAdapter f19273c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C1020d f19274d;

    /* renamed from: e */
    private Handler f19275e = new Handler();

    /* renamed from: f */
    private int f19276f = 0;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Boolean f19277g = null;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Boolean f19278h = null;

    /* renamed from: i */
    private boolean f19279i = false;

    /* renamed from: j */
    private int f19280j = 0;

    /* renamed from: k */
    private long f19281k = 0;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public BroadcastReceiver f19282l = new C6966d(this);

    private C6970h() {
    }

    /* renamed from: a */
    private BluetoothLeAdvertiser m26380a(BluetoothAdapter bluetoothAdapter) {
        try {
            return bluetoothAdapter.getBluetoothLeAdvertiser();
        } catch (Exception e) {
            C6895d.m26027d(f19271a, "Cannot get bluetoothLeAdvertiser", e);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m26383a(Context context, String str, String str2) {
        m26391c(context);
        if (this.f19279i) {
            C0297Y.C0301d dVar = new C0297Y.C0301d(context, "err");
            dVar.mo1214c((CharSequence) "BluetoothMedic: " + str);
            dVar.mo1221f(this.f19280j);
            dVar.mo1207a(new long[]{200, 100, 200});
            dVar.mo1210b((CharSequence) str2);
            TaskStackBuilder create = TaskStackBuilder.create(context);
            create.addNextIntent(new Intent("NoOperation"));
            dVar.mo1199a(create.getPendingIntent(0, 134217728));
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.notify(1, dVar.mo1194a());
            }
        }
    }

    /* renamed from: b */
    public static C6970h m26388b() {
        if (f19272b == null) {
            f19272b = new C6970h();
        }
        return f19272b;
    }

    /* renamed from: c */
    private void m26390c() {
        C6895d.m26021a(f19271a, "Power cycling bluetooth", new Object[0]);
        C6895d.m26021a(f19271a, "Turning Bluetooth off.", new Object[0]);
        BluetoothAdapter bluetoothAdapter = this.f19273c;
        if (bluetoothAdapter != null) {
            bluetoothAdapter.disable();
            this.f19275e.postDelayed(new C6969g(this), 1000);
            return;
        }
        C6895d.m26027d(f19271a, "Cannot cycle bluetooth.  Manager is null.", new Object[0]);
    }

    /* renamed from: c */
    private void m26391c(Context context) {
        if (this.f19273c == null || this.f19274d == null) {
            BluetoothManager bluetoothManager = (BluetoothManager) context.getSystemService("bluetooth");
            if (bluetoothManager != null) {
                this.f19273c = bluetoothManager.getAdapter();
                this.f19274d = C1020d.m5430a(context);
                return;
            }
            throw new NullPointerException("Cannot get BluetoothManager");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public boolean m26393d() {
        long currentTimeMillis = System.currentTimeMillis() - this.f19281k;
        if (currentTimeMillis < 60000) {
            String str = f19271a;
            C6895d.m26021a(str, "Not cycling bluetooth because we just did so " + currentTimeMillis + " milliseconds ago.", new Object[0]);
            return false;
        }
        this.f19281k = System.currentTimeMillis();
        C6895d.m26021a(f19271a, "Power cycling bluetooth", new Object[0]);
        m26390c();
        return true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:8|9|10|11|12|13|(2:26|15)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0038 */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0043 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo18990a(android.content.Context r10) {
        /*
            r9 = this;
            r9.m26391c((android.content.Context) r10)
            r0 = 0
            r9.f19278h = r0
            java.lang.String r0 = f19271a
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "Starting scan test"
            org.altbeacon.beacon.p293c.C6895d.m26026c(r0, r3, r2)
            long r2 = java.lang.System.currentTimeMillis()
            android.bluetooth.BluetoothAdapter r0 = r9.f19273c
            if (r0 == 0) goto L_0x0060
            android.bluetooth.le.BluetoothLeScanner r0 = r0.getBluetoothLeScanner()
            org.altbeacon.bluetooth.e r4 = new org.altbeacon.bluetooth.e
            r4.<init>(r9, r0, r10)
            if (r0 == 0) goto L_0x0057
            r0.startScan(r4)     // Catch:{ IllegalStateException -> 0x0050 }
        L_0x0026:
            java.lang.Boolean r10 = r9.f19278h     // Catch:{ IllegalStateException -> 0x0050 }
            if (r10 != 0) goto L_0x004c
            java.lang.String r10 = f19271a     // Catch:{ IllegalStateException -> 0x0050 }
            java.lang.String r5 = "Waiting for scan test to complete..."
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ IllegalStateException -> 0x0050 }
            org.altbeacon.beacon.p293c.C6895d.m26021a(r10, r5, r6)     // Catch:{ IllegalStateException -> 0x0050 }
            r5 = 1000(0x3e8, double:4.94E-321)
            java.lang.Thread.sleep(r5)     // Catch:{ InterruptedException -> 0x0038 }
        L_0x0038:
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ IllegalStateException -> 0x0050 }
            long r5 = r5 - r2
            r7 = 5000(0x1388, double:2.4703E-320)
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 <= 0) goto L_0x0026
            java.lang.String r10 = f19271a     // Catch:{ IllegalStateException -> 0x0050 }
            java.lang.String r2 = "Timeout running scan test"
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ IllegalStateException -> 0x0050 }
            org.altbeacon.beacon.p293c.C6895d.m26021a(r10, r2, r3)     // Catch:{ IllegalStateException -> 0x0050 }
        L_0x004c:
            r0.stopScan(r4)     // Catch:{ IllegalStateException -> 0x0050 }
            goto L_0x0060
        L_0x0050:
            java.lang.String r10 = f19271a
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r2 = "Bluetooth is off.  Cannot run scan test."
            goto L_0x005d
        L_0x0057:
            java.lang.String r10 = f19271a
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r2 = "Cannot get scanner"
        L_0x005d:
            org.altbeacon.beacon.p293c.C6895d.m26021a(r10, r2, r0)
        L_0x0060:
            java.lang.String r10 = f19271a
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r2 = "scan test complete"
            org.altbeacon.beacon.p293c.C6895d.m26021a(r10, r2, r0)
            java.lang.Boolean r10 = r9.f19278h
            if (r10 == 0) goto L_0x0073
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x0074
        L_0x0073:
            r1 = 1
        L_0x0074:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.altbeacon.bluetooth.C6970h.mo18990a(android.content.Context):boolean");
    }

    /* renamed from: b */
    public boolean mo18991b(Context context) {
        m26391c(context);
        this.f19277g = null;
        long currentTimeMillis = System.currentTimeMillis();
        BluetoothAdapter bluetoothAdapter = this.f19273c;
        if (bluetoothAdapter != null) {
            BluetoothLeAdvertiser a = m26380a(bluetoothAdapter);
            if (a != null) {
                AdvertiseSettings build = new AdvertiseSettings.Builder().setAdvertiseMode(0).build();
                AdvertiseData build2 = new AdvertiseData.Builder().addManufacturerData(0, new byte[]{0}).build();
                C6895d.m26026c(f19271a, "Starting transmitter test", new Object[0]);
                a.startAdvertising(build, build2, new C6968f(this, a, context));
            } else {
                C6895d.m26021a(f19271a, "Cannot get advertiser", new Object[0]);
            }
            while (true) {
                if (this.f19277g != null) {
                    break;
                }
                C6895d.m26021a(f19271a, "Waiting for transmitter test to complete...", new Object[0]);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException unused) {
                }
                if (System.currentTimeMillis() - currentTimeMillis > 5000) {
                    C6895d.m26021a(f19271a, "Timeout running transmitter test", new Object[0]);
                    break;
                }
            }
        }
        C6895d.m26021a(f19271a, "transmitter test complete", new Object[0]);
        Boolean bool = this.f19277g;
        return bool != null && bool.booleanValue();
    }
}
