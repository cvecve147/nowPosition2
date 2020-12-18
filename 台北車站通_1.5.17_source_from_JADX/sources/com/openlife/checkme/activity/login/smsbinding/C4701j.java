package com.openlife.checkme.activity.login.smsbinding;

import com.openlife.checkme.net.model.MobileUpdateResponse;
import com.openlife.checkme.p097f.C4953c;
import p208e.p221b.p227d.C6242d;

/* renamed from: com.openlife.checkme.activity.login.smsbinding.j */
class C4701j implements C6242d<MobileUpdateResponse> {

    /* renamed from: a */
    final /* synthetic */ C4702k f13598a;

    C4701j(C4702k kVar) {
        this.f13598a = kVar;
    }

    /* renamed from: a */
    public void accept(MobileUpdateResponse mobileUpdateResponse) {
        if (this.f13598a.mo13153a((C4953c) mobileUpdateResponse)) {
            this.f13598a.f13599d.mo13022a(mobileUpdateResponse.getData().getOtp());
        }
    }
}
