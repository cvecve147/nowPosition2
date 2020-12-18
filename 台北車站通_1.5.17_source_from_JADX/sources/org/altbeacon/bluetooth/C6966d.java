package org.altbeacon.bluetooth;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.altbeacon.beacon.p293c.C6895d;

/* renamed from: org.altbeacon.bluetooth.d */
class C6966d extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C6970h f19263a;

    C6966d(C6970h hVar) {
        this.f19263a = hVar;
    }

    public void onReceive(Context context, Intent intent) {
        String str;
        C6895d.m26021a(C6970h.f19271a, "Broadcast notification received.", new Object[0]);
        String action = intent.getAction();
        if (action != null) {
            if (action.equalsIgnoreCase("onScanFailed")) {
                if (intent.getIntExtra("errorCode", -1) == 2) {
                    str = "scan failed";
                    this.f19263a.m26383a(context, str, "Power cycling bluetooth");
                    C6895d.m26021a(C6970h.f19271a, "Detected a SCAN_FAILED_APPLICATION_REGISTRATION_FAILED.  We need to cycle bluetooth to recover", new Object[0]);
                    if (this.f19263a.m26393d()) {
                        return;
                    }
                } else {
                    return;
                }
            } else if (!action.equalsIgnoreCase("onStartFailed")) {
                C6895d.m26021a(C6970h.f19271a, "Unknown event.", new Object[0]);
                return;
            } else if (intent.getIntExtra("errorCode", -1) == 4) {
                str = "advertising failed";
                this.f19263a.m26383a(context, str, "Expected failure.  Power cycling.");
                if (this.f19263a.m26393d()) {
                    return;
                }
            } else {
                return;
            }
            this.f19263a.m26383a(context, str, "Cannot power cycle bluetooth again");
        }
    }
}
