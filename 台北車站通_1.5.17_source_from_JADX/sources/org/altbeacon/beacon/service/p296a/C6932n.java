package org.altbeacon.beacon.service.p296a;

import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import android.content.Intent;
import android.os.ParcelUuid;
import java.util.List;
import org.altbeacon.beacon.p293c.C6895d;
import p013b.p018b.p028h.p029a.C1020d;

/* renamed from: org.altbeacon.beacon.service.a.n */
class C6932n extends ScanCallback {

    /* renamed from: a */
    final /* synthetic */ C6933o f19136a;

    C6932n(C6933o oVar) {
        this.f19136a = oVar;
    }

    public void onBatchScanResults(List<ScanResult> list) {
        C6895d.m26021a("CycledLeScannerForLollipop", "got batch records", new Object[0]);
        for (ScanResult next : list) {
            this.f19136a.f19113t.onLeScan(next.getDevice(), next.getRssi(), next.getScanRecord().getBytes());
        }
        if (this.f19136a.f19137A > 0) {
            C6895d.m26021a("CycledLeScannerForLollipop", "got a filtered batch scan result in the background.", new Object[0]);
        }
    }

    public void onScanFailed(int i) {
        Object[] objArr;
        String str;
        Intent intent = new Intent("onScanFailed");
        intent.putExtra("errorCode", i);
        C1020d.m5430a(this.f19136a.f19105l).mo5020a(intent);
        if (i == 1) {
            objArr = new Object[0];
            str = "Scan failed: a BLE scan with the same settings is already started by the app";
        } else if (i == 2) {
            objArr = new Object[0];
            str = "Scan failed: app cannot be registered";
        } else if (i == 3) {
            objArr = new Object[0];
            str = "Scan failed: internal error";
        } else if (i != 4) {
            C6895d.m26024b("CycledLeScannerForLollipop", "Scan failed with unknown error (errorCode=" + i + ")", new Object[0]);
            return;
        } else {
            objArr = new Object[0];
            str = "Scan failed: power optimized scan feature is not supported";
        }
        C6895d.m26024b("CycledLeScannerForLollipop", str, objArr);
    }

    public void onScanResult(int i, ScanResult scanResult) {
        if (C6895d.m26023a()) {
            C6895d.m26021a("CycledLeScannerForLollipop", "got record", new Object[0]);
            List<ParcelUuid> serviceUuids = scanResult.getScanRecord().getServiceUuids();
            if (serviceUuids != null) {
                for (ParcelUuid parcelUuid : serviceUuids) {
                    C6895d.m26021a("CycledLeScannerForLollipop", "with service uuid: " + parcelUuid, new Object[0]);
                }
            }
        }
        this.f19136a.f19113t.onLeScan(scanResult.getDevice(), scanResult.getRssi(), scanResult.getScanRecord().getBytes());
        if (this.f19136a.f19137A > 0) {
            C6895d.m26021a("CycledLeScannerForLollipop", "got a filtered scan result in the background.", new Object[0]);
        }
    }
}
