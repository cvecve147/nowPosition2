package com.askey.taipeinavi.home;

import com.askey.taipeinavi.home.HomeFragment;
import p101d.p204k.p205a.C6053f;

/* renamed from: com.askey.taipeinavi.home.E */
class C1218E extends Thread {

    /* renamed from: a */
    final /* synthetic */ HomeFragment.C1227b f4411a;

    C1218E(HomeFragment.C1227b bVar) {
        this.f4411a = bVar;
    }

    public void run() {
        new C6053f(HomeFragment.this.f4380a).mo16004c("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION").mo16543b(new C1217D(this));
    }
}
