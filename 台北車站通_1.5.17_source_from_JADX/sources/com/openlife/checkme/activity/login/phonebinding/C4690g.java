package com.openlife.checkme.activity.login.phonebinding;

import com.openlife.checkme.net.model.MobileUpdateResponse;
import com.openlife.checkme.p097f.C4953c;
import p208e.p221b.p227d.C6242d;

/* renamed from: com.openlife.checkme.activity.login.phonebinding.g */
class C4690g implements C6242d<MobileUpdateResponse> {

    /* renamed from: a */
    final /* synthetic */ String f13581a;

    /* renamed from: b */
    final /* synthetic */ C4691h f13582b;

    C4690g(C4691h hVar, String str) {
        this.f13582b = hVar;
        this.f13581a = str;
    }

    /* renamed from: a */
    public void accept(MobileUpdateResponse mobileUpdateResponse) {
        if (this.f13582b.mo13153a((C4953c) mobileUpdateResponse)) {
            this.f13582b.f13583d.mo13004a(mobileUpdateResponse.getData().getOtp());
            this.f13582b.f13583d.mo13007g(this.f13581a);
        }
    }
}
