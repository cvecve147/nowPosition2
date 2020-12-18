package org.altbeacon.beacon.service.p296a;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import org.altbeacon.beacon.p293c.C6895d;
import org.altbeacon.bluetooth.C6964c;

/* renamed from: org.altbeacon.beacon.service.a.i */
class C6927i implements BluetoothAdapter.LeScanCallback {

    /* renamed from: a */
    final /* synthetic */ C6928j f19125a;

    C6927i(C6928j jVar) {
        this.f19125a = jVar;
    }

    public void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        C6895d.m26021a("CycledLeScannerForJellyBeanMr2", "got record", new Object[0]);
        this.f19125a.f19113t.onLeScan(bluetoothDevice, i, bArr);
        C6928j jVar = this.f19125a;
        C6964c cVar = jVar.f19112s;
        if (cVar != null) {
            cVar.mo18978a(bluetoothDevice, jVar.m26199n());
        }
    }
}
