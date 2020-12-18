package org.altbeacon.bluetooth;

import org.altbeacon.beacon.p293c.C6895d;

/* renamed from: org.altbeacon.bluetooth.g */
class C6969g implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C6970h f19270a;

    C6969g(C6970h hVar) {
        this.f19270a = hVar;
    }

    public void run() {
        C6895d.m26021a(C6970h.f19271a, "Turning Bluetooth back on.", new Object[0]);
        if (this.f19270a.f19273c != null) {
            this.f19270a.f19273c.enable();
        }
    }
}
