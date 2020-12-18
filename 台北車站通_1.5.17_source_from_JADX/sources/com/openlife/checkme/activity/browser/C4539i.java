package com.openlife.checkme.activity.browser;

import com.openlife.checkme.net.model.PointResponse;
import com.openlife.checkme.p097f.C4953c;
import p208e.p221b.p227d.C6242d;

/* renamed from: com.openlife.checkme.activity.browser.i */
class C4539i implements C6242d<PointResponse> {

    /* renamed from: a */
    final /* synthetic */ C4543m f13265a;

    C4539i(C4543m mVar) {
        this.f13265a = mVar;
    }

    /* renamed from: a */
    public void accept(PointResponse pointResponse) {
        if (this.f13265a.mo13153a((C4953c) pointResponse)) {
            this.f13265a.f13270e.mo12981d(pointResponse.getData().getCurrentPointStr());
            this.f13265a.f13269d.mo12707a();
        }
    }
}
