package org.altbeacon.bluetooth;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import org.altbeacon.beacon.p293c.C6895d;

/* renamed from: org.altbeacon.bluetooth.b */
class C6963b extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C6964c f19249a;

    C6963b(C6964c cVar) {
        this.f19249a = cVar;
    }

    public void onReceive(Context context, Intent intent) {
        String str;
        Object[] objArr;
        String str2;
        Object[] objArr2;
        String action = intent.getAction();
        if (action.equals("android.bluetooth.adapter.action.DISCOVERY_FINISHED")) {
            if (this.f19249a.f19250a) {
                C6895d.m26021a("BluetoothCrashResolver", "Bluetooth discovery finished", new Object[0]);
                this.f19249a.m26368f();
            } else {
                C6895d.m26021a("BluetoothCrashResolver", "Bluetooth discovery finished (external)", new Object[0]);
            }
        }
        if (action.equals("android.bluetooth.adapter.action.DISCOVERY_STARTED")) {
            if (this.f19249a.f19250a) {
                boolean unused = this.f19249a.f19251b = true;
                objArr2 = new Object[0];
                str2 = "Bluetooth discovery started";
            } else {
                objArr2 = new Object[0];
                str2 = "Bluetooth discovery started (external)";
            }
            C6895d.m26021a("BluetoothCrashResolver", str2, objArr2);
        }
        if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
            if (intExtra != Integer.MIN_VALUE) {
                switch (intExtra) {
                    case 10:
                        C6895d.m26021a("BluetoothCrashResolver", "Bluetooth state is OFF", new Object[0]);
                        long unused2 = this.f19249a.f19252c = SystemClock.elapsedRealtime();
                        return;
                    case 11:
                        long unused3 = this.f19249a.f19253d = SystemClock.elapsedRealtime();
                        objArr = new Object[0];
                        str = "Bluetooth state is TURNING_ON";
                        break;
                    case 12:
                        C6895d.m26021a("BluetoothCrashResolver", "Bluetooth state is ON", new Object[0]);
                        C6895d.m26021a("BluetoothCrashResolver", "Bluetooth was turned off for %s milliseconds", Long.valueOf(this.f19249a.f19253d - this.f19249a.f19252c));
                        if (this.f19249a.f19253d - this.f19249a.f19252c < 600) {
                            this.f19249a.mo18977a();
                            return;
                        }
                        return;
                    default:
                        return;
                }
            } else {
                objArr = new Object[0];
                str = "Bluetooth state is ERROR";
            }
            C6895d.m26021a("BluetoothCrashResolver", str, objArr);
        }
    }
}
