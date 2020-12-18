package org.altbeacon.bluetooth;

import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseSettings;
import android.bluetooth.le.BluetoothLeAdvertiser;
import android.content.Context;
import android.content.Intent;
import org.altbeacon.beacon.p293c.C6895d;

/* renamed from: org.altbeacon.bluetooth.f */
class C6968f extends AdvertiseCallback {

    /* renamed from: a */
    final /* synthetic */ BluetoothLeAdvertiser f19267a;

    /* renamed from: b */
    final /* synthetic */ Context f19268b;

    /* renamed from: c */
    final /* synthetic */ C6970h f19269c;

    C6968f(C6970h hVar, BluetoothLeAdvertiser bluetoothLeAdvertiser, Context context) {
        this.f19269c = hVar;
        this.f19267a = bluetoothLeAdvertiser;
        this.f19268b = context;
    }

    public void onStartFailure(int i) {
        super.onStartFailure(i);
        Intent intent = new Intent("onStartFailed");
        intent.putExtra("errorCode", i);
        String a = C6970h.f19271a;
        C6895d.m26021a(a, "Sending onStartFailure broadcast with " + this.f19269c.f19274d, new Object[0]);
        if (this.f19269c.f19274d != null) {
            this.f19269c.f19274d.mo5020a(intent);
        }
        if (i == 4) {
            Boolean unused = this.f19269c.f19277g = false;
            C6895d.m26027d(C6970h.f19271a, "Transmitter test failed in a way we consider a test failure", new Object[0]);
            this.f19269c.m26383a(this.f19268b, "transmitter failed", "bluetooth not ok");
            return;
        }
        Boolean unused2 = this.f19269c.f19277g = true;
        C6895d.m26026c(C6970h.f19271a, "Transmitter test failed, but not in a way we consider a test failure", new Object[0]);
    }

    public void onStartSuccess(AdvertiseSettings advertiseSettings) {
        super.onStartSuccess(advertiseSettings);
        C6895d.m26026c(C6970h.f19271a, "Transmitter test succeeded", new Object[0]);
        this.f19267a.stopAdvertising(this);
        Boolean unused = this.f19269c.f19277g = true;
    }
}
