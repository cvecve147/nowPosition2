package com.onesignal;

import com.onesignal.C4306Xa;

/* renamed from: com.onesignal.hb */
class C4375hb implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C4379ib f12915a;

    C4375hb(C4379ib ibVar) {
        this.f12915a = ibVar;
    }

    public void run() {
        int a = (C4390kb.f12942a * 10000) + 30000;
        if (a > 90000) {
            a = 90000;
        }
        C4306Xa.m17135a(C4306Xa.C4316j.INFO, "Failed to get Android parameters, trying again in " + (a / 1000) + " seconds.");
        C4252Ia.m16865a(a);
        C4390kb.m17423b();
        C4390kb.m17421a(this.f12915a.f12920a);
    }
}
