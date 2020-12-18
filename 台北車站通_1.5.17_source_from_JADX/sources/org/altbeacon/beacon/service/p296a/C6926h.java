package org.altbeacon.beacon.service.p296a;

import android.bluetooth.BluetoothAdapter;
import org.altbeacon.beacon.p293c.C6895d;

/* renamed from: org.altbeacon.beacon.service.a.h */
class C6926h implements Runnable {

    /* renamed from: a */
    final /* synthetic */ BluetoothAdapter f19122a;

    /* renamed from: b */
    final /* synthetic */ BluetoothAdapter.LeScanCallback f19123b;

    /* renamed from: c */
    final /* synthetic */ C6928j f19124c;

    C6926h(C6928j jVar, BluetoothAdapter bluetoothAdapter, BluetoothAdapter.LeScanCallback leScanCallback) {
        this.f19124c = jVar;
        this.f19122a = bluetoothAdapter;
        this.f19123b = leScanCallback;
    }

    public void run() {
        try {
            this.f19122a.stopLeScan(this.f19123b);
        } catch (Exception e) {
            C6895d.m26022a(e, "CycledLeScannerForJellyBeanMr2", "Internal Android exception in stopLeScan()", new Object[0]);
        }
    }
}
