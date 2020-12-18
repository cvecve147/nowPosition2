package org.altbeacon.beacon.service.p296a;

import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import org.altbeacon.beacon.p293c.C6895d;

/* renamed from: org.altbeacon.beacon.service.a.m */
class C6931m implements Runnable {

    /* renamed from: a */
    final /* synthetic */ BluetoothLeScanner f19133a;

    /* renamed from: b */
    final /* synthetic */ ScanCallback f19134b;

    /* renamed from: c */
    final /* synthetic */ C6933o f19135c;

    C6931m(C6933o oVar, BluetoothLeScanner bluetoothLeScanner, ScanCallback scanCallback) {
        this.f19135c = oVar;
        this.f19133a = bluetoothLeScanner;
        this.f19134b = scanCallback;
    }

    public void run() {
        try {
            C6895d.m26021a("CycledLeScannerForLollipop", "Stopping LE scan on scan handler", new Object[0]);
            this.f19133a.stopScan(this.f19134b);
        } catch (IllegalStateException unused) {
            C6895d.m26027d("CycledLeScannerForLollipop", "Cannot stop scan. Bluetooth may be turned off.", new Object[0]);
        } catch (NullPointerException e) {
            C6895d.m26022a(e, "CycledLeScannerForLollipop", "Cannot stop scan. Unexpected NPE.", new Object[0]);
        } catch (SecurityException unused2) {
            C6895d.m26024b("CycledLeScannerForLollipop", "Cannot stop scan.  Security Exception", new Object[0]);
        }
    }
}
