package com.askey.taipeinavi.home;

import p101d.p204k.p205a.C6053f;

/* renamed from: com.askey.taipeinavi.home.m */
class C1243m extends Thread {

    /* renamed from: a */
    final /* synthetic */ C1244n f4471a;

    C1243m(C1244n nVar) {
        this.f4471a = nVar;
    }

    public void run() {
        new C6053f(this.f4471a.f4472c.f4487ba).mo16004c("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION").mo16543b(new C1242l(this));
    }
}
