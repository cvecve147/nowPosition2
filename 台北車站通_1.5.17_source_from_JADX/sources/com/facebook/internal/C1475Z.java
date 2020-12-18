package com.facebook.internal;

import com.facebook.C1352H;
import com.facebook.GraphRequest;
import com.facebook.internal.C1480ba;

/* renamed from: com.facebook.internal.Z */
class C1475Z implements GraphRequest.C1347b {

    /* renamed from: a */
    final /* synthetic */ C1480ba.C1481a f5116a;

    /* renamed from: b */
    final /* synthetic */ String f5117b;

    C1475Z(C1480ba.C1481a aVar, String str) {
        this.f5116a = aVar;
        this.f5117b = str;
    }

    /* renamed from: a */
    public void mo5885a(C1352H h) {
        if (h.mo5987a() != null) {
            this.f5116a.mo5992a(h.mo5987a().mo5920e());
            return;
        }
        C1471V.m6904a(this.f5117b, h.mo5988b());
        this.f5116a.mo5993a(h.mo5988b());
    }
}
