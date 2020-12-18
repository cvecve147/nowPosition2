package com.openlife.checkme.p093c;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;

/* renamed from: com.openlife.checkme.c.o */
class C4885o implements BluetoothAdapter.LeScanCallback {

    /* renamed from: a */
    final /* synthetic */ C4886p f13971a;

    C4885o(C4886p pVar) {
        this.f13971a = pVar;
    }

    public void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        this.f13971a.m19247a(bluetoothDevice, i, bArr);
    }
}
