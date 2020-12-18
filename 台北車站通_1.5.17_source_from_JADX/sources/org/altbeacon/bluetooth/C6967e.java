package org.altbeacon.bluetooth;

import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import android.content.Context;
import android.content.Intent;
import java.util.List;
import org.altbeacon.beacon.p293c.C6895d;

/* renamed from: org.altbeacon.bluetooth.e */
class C6967e extends ScanCallback {

    /* renamed from: a */
    final /* synthetic */ BluetoothLeScanner f19264a;

    /* renamed from: b */
    final /* synthetic */ Context f19265b;

    /* renamed from: c */
    final /* synthetic */ C6970h f19266c;

    C6967e(C6970h hVar, BluetoothLeScanner bluetoothLeScanner, Context context) {
        this.f19266c = hVar;
        this.f19264a = bluetoothLeScanner;
        this.f19265b = context;
    }

    public void onBatchScanResults(List<ScanResult> list) {
        super.onBatchScanResults(list);
    }

    public void onScanFailed(int i) {
        C6970h hVar;
        boolean z;
        super.onScanFailed(i);
        String a = C6970h.f19271a;
        C6895d.m26021a(a, "Sending onScanFailed broadcast with " + this.f19266c.f19274d, new Object[0]);
        Intent intent = new Intent("onScanFailed");
        intent.putExtra("errorCode", i);
        if (this.f19266c.f19274d != null) {
            this.f19266c.f19274d.mo5020a(intent);
        }
        String a2 = C6970h.f19271a;
        C6895d.m26021a(a2, "broadcast: " + intent + " should be received by " + this.f19266c.f19282l, new Object[0]);
        if (i == 2) {
            C6895d.m26027d(C6970h.f19271a, "Scan test failed in a way we consider a failure", new Object[0]);
            this.f19266c.m26383a(this.f19265b, "scan failed", "bluetooth not ok");
            hVar = this.f19266c;
            z = false;
        } else {
            C6895d.m26026c(C6970h.f19271a, "Scan test failed in a way we do not consider a failure", new Object[0]);
            hVar = this.f19266c;
            z = true;
        }
        Boolean unused = hVar.f19278h = z;
    }

    public void onScanResult(int i, ScanResult scanResult) {
        super.onScanResult(i, scanResult);
        Boolean unused = this.f19266c.f19278h = true;
        C6895d.m26026c(C6970h.f19271a, "Scan test succeeded", new Object[0]);
        try {
            this.f19264a.stopScan(this);
        } catch (IllegalStateException unused2) {
        }
    }
}
