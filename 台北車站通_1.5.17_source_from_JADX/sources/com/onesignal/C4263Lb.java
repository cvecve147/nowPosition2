package com.onesignal;

import com.onesignal.C4416rb;
import java.util.ArrayList;

/* renamed from: com.onesignal.Lb */
class C4263Lb extends C4416rb.C4417a {

    /* renamed from: a */
    final /* synthetic */ ArrayList f12644a;

    /* renamed from: b */
    final /* synthetic */ C4273Mb f12645b;

    C4263Lb(C4273Mb mb, ArrayList arrayList) {
        this.f12645b = mb;
        this.f12644a = arrayList;
    }

    /* renamed from: a */
    public void mo12355a(String str) {
        this.f12645b.f12675h.addAll(this.f12644a);
        C4370gb.m17359b("GTPlayerPurchases", "purchaseTokens", this.f12645b.f12675h.toString());
        C4370gb.m17361b("GTPlayerPurchases", "ExistingPurchases", true);
        boolean unused = this.f12645b.f12676i = false;
        boolean unused2 = this.f12645b.f12677j = false;
    }
}
