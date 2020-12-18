package org.altbeacon.beacon;

import android.bluetooth.BluetoothDevice;

/* renamed from: org.altbeacon.beacon.b */
public class C6882b extends C6910i {
    public C6882b() {
        this.f19046C = new int[]{280};
        mo18786a("m:2-3=beac,i:4-19,i:20-21,i:22-23,p:24-24,d:25-25");
        this.f19045B = "altbeacon";
    }

    /* renamed from: a */
    public Beacon mo18721a(byte[] bArr, int i, BluetoothDevice bluetoothDevice) {
        return mo17220a(bArr, i, bluetoothDevice, (Beacon) new AltBeacon());
    }
}
