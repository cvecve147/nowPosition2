package com.openlife.checkme.p093c;

import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;

/* renamed from: com.openlife.checkme.c.n */
class C4884n extends ScanCallback {

    /* renamed from: a */
    final /* synthetic */ C4886p f13970a;

    C4884n(C4886p pVar) {
        this.f13970a = pVar;
    }

    public void onScanResult(int i, ScanResult scanResult) {
        super.onScanResult(i, scanResult);
        if (scanResult != null && scanResult.getScanRecord() != null) {
            this.f13970a.m19247a(scanResult.getDevice(), scanResult.getRssi(), scanResult.getScanRecord().getBytes());
        }
    }
}
