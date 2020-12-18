package org.altbeacon.beacon.service.p296a;

import android.bluetooth.BluetoothAdapter;
import org.altbeacon.beacon.p293c.C6895d;

/* renamed from: org.altbeacon.beacon.service.a.g */
class C6925g implements Runnable {

    /* renamed from: a */
    final /* synthetic */ BluetoothAdapter f19119a;

    /* renamed from: b */
    final /* synthetic */ BluetoothAdapter.LeScanCallback f19120b;

    /* renamed from: c */
    final /* synthetic */ C6928j f19121c;

    C6925g(C6928j jVar, BluetoothAdapter bluetoothAdapter, BluetoothAdapter.LeScanCallback leScanCallback) {
        this.f19121c = jVar;
        this.f19119a = bluetoothAdapter;
        this.f19120b = leScanCallback;
    }

    public void run() {
        try {
            this.f19119a.startLeScan(this.f19120b);
        } catch (Exception e) {
            C6895d.m26022a(e, "CycledLeScannerForJellyBeanMr2", "Internal Android exception in startLeScan()", new Object[0]);
        }
    }
}
