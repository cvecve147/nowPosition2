package com.openlife.checkme.activity.login.smsbinding;

import com.openlife.checkme.activity.C4673l;
import com.openlife.checkme.net.model.MobileUpdateBody;
import com.openlife.checkme.net.model.MobileUpdateResponse;
import com.openlife.checkme.net.model.VerifyOtpBody;
import com.openlife.checkme.net.model.VerifyOtpResponse;
import p208e.p221b.C6433l;

/* renamed from: com.openlife.checkme.activity.login.smsbinding.h */
public class C4699h extends C4673l implements C4696e {
    /* renamed from: a */
    public MobileUpdateBody mo13032a(String str) {
        return new MobileUpdateBody(str);
    }

    /* renamed from: a */
    public C6433l<MobileUpdateResponse> mo13033a(MobileUpdateBody mobileUpdateBody) {
        return this.f13552a.mo13605b().mo13577a(mobileUpdateBody.getSignature(), mobileUpdateBody);
    }

    /* renamed from: a */
    public C6433l<VerifyOtpResponse> mo13034a(VerifyOtpBody verifyOtpBody) {
        return this.f13552a.mo13605b().mo13589a(verifyOtpBody.getSignature(), verifyOtpBody);
    }

    /* renamed from: b */
    public VerifyOtpBody mo13035b(String str, String str2) {
        return new VerifyOtpBody(str, str2);
    }
}
