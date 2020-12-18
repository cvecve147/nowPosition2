package org.altbeacon.beacon.service.p296a;

import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanSettings;
import java.util.List;
import org.altbeacon.beacon.p293c.C6895d;

/* renamed from: org.altbeacon.beacon.service.a.l */
class C6930l implements Runnable {

    /* renamed from: a */
    final /* synthetic */ BluetoothLeScanner f19128a;

    /* renamed from: b */
    final /* synthetic */ List f19129b;

    /* renamed from: c */
    final /* synthetic */ ScanSettings f19130c;

    /* renamed from: d */
    final /* synthetic */ ScanCallback f19131d;

    /* renamed from: e */
    final /* synthetic */ C6933o f19132e;

    C6930l(C6933o oVar, BluetoothLeScanner bluetoothLeScanner, List list, ScanSettings scanSettings, ScanCallback scanCallback) {
        this.f19132e = oVar;
        this.f19128a = bluetoothLeScanner;
        this.f19129b = list;
        this.f19130c = scanSettings;
        this.f19131d = scanCallback;
    }

    public void run() {
        try {
            this.f19128a.startScan(this.f19129b, this.f19130c, this.f19131d);
        } catch (IllegalStateException unused) {
            C6895d.m26027d("CycledLeScannerForLollipop", "Cannot start scan. Bluetooth may be turned off.", new Object[0]);
        } catch (NullPointerException e) {
            C6895d.m26022a(e, "CycledLeScannerForLollipop", "Cannot start scan. Unexpected NPE.", new Object[0]);
        } catch (SecurityException unused2) {
            C6895d.m26024b("CycledLeScannerForLollipop", "Cannot start scan.  Security Exception", new Object[0]);
        }
    }
}
