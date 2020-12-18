package org.altbeacon.beacon.service.p296a;

import org.altbeacon.beacon.p293c.C6895d;

/* renamed from: org.altbeacon.beacon.service.a.b */
class C6920b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C6922d f19092a;

    C6920b(C6922d dVar) {
        this.f19092a = dVar;
    }

    public void run() {
        C6895d.m26021a("CycledLeScanner", "Quitting scan thread", new Object[0]);
        this.f19092a.f19111r.quit();
    }
}
