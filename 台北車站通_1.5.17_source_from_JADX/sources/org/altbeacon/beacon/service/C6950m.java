package org.altbeacon.beacon.service;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.bluetooth.BluetoothDevice;
import android.content.pm.ApplicationInfo;
import org.altbeacon.beacon.Beacon;
import org.altbeacon.beacon.C6906h;
import org.altbeacon.beacon.p293c.C6895d;
import org.altbeacon.beacon.service.p296a.C6919a;

/* renamed from: org.altbeacon.beacon.service.m */
class C6950m implements C6919a {

    /* renamed from: a */
    final /* synthetic */ C6951n f19181a;

    C6950m(C6951n nVar) {
        this.f19181a = nVar;
    }

    @SuppressLint({"WrongThread"})
    /* renamed from: a */
    public void mo18833a() {
        String str;
        Object[] objArr;
        String str2;
        if (C6906h.m26074g() != null) {
            C6895d.m26021a(C6951n.f19182a, "Beacon simulator enabled", new Object[0]);
            if (C6906h.m26074g().mo18747a() != null) {
                ApplicationInfo applicationInfo = this.f19181a.f19192k.getApplicationInfo();
                int i = applicationInfo.flags & 2;
                applicationInfo.flags = i;
                if (i != 0) {
                    String a = C6951n.f19182a;
                    C6895d.m26021a(a, "Beacon simulator returns " + C6906h.m26074g().mo18747a().size() + " beacons.", new Object[0]);
                    for (Beacon a2 : C6906h.m26074g().mo18747a()) {
                        this.f19181a.m26293a(a2);
                    }
                } else {
                    str2 = C6951n.f19182a;
                    objArr = new Object[0];
                    str = "Beacon simulations provided, but ignored because we are not running in debug mode.  Please remove beacon simulations for production.";
                }
            } else {
                str2 = C6951n.f19182a;
                objArr = new Object[0];
                str = "getBeacons is returning null. No simulated beacons to report.";
            }
            C6895d.m26027d(str2, str, objArr);
        } else if (C6895d.m26023a()) {
            C6895d.m26021a(C6951n.f19182a, "Beacon simulator not enabled", new Object[0]);
        }
        this.f19181a.f19188g.mo18864a();
        this.f19181a.f19186e.mo18892i();
        this.f19181a.m26301j();
    }

    @TargetApi(11)
    public void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        this.f19181a.mo18919a(bluetoothDevice, i, bArr);
    }
}
