package com.openlife.checkme.activity.login.smsbinding;

import com.openlife.checkme.net.model.VerifyOtpResponse;
import com.openlife.checkme.p097f.C4953c;
import p208e.p221b.p227d.C6242d;

/* renamed from: com.openlife.checkme.activity.login.smsbinding.i */
class C4700i implements C6242d<VerifyOtpResponse> {

    /* renamed from: a */
    final /* synthetic */ C4702k f13597a;

    C4700i(C4702k kVar) {
        this.f13597a = kVar;
    }

    /* renamed from: a */
    public void accept(VerifyOtpResponse verifyOtpResponse) {
        if (this.f13597a.mo13153a((C4953c) verifyOtpResponse)) {
            this.f13597a.f13600e.mo12980d();
            this.f13597a.f13600e.mo12975a(verifyOtpResponse.getData().getNickname(), verifyOtpResponse.getData().getAccount(), verifyOtpResponse.getData().getInviteCode(), verifyOtpResponse.getData().getEmail(), verifyOtpResponse.getData().getFbUid(), verifyOtpResponse.getData().getGender());
            this.f13597a.f13599d.mo12968i();
        }
    }
}
