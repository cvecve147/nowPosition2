package com.openlife.checkme.activity.login.smsbinding;

import com.openlife.checkme.activity.C4703m;
import com.openlife.checkme.net.model.MobileUpdateBody;
import com.openlife.checkme.net.model.MobileUpdateResponse;
import com.openlife.checkme.net.model.VerifyOtpBody;
import com.openlife.checkme.net.model.VerifyOtpResponse;
import p208e.p221b.C6433l;

/* renamed from: com.openlife.checkme.activity.login.smsbinding.e */
public interface C4696e extends C4703m {
    /* renamed from: a */
    MobileUpdateBody mo13032a(String str);

    /* renamed from: a */
    C6433l<MobileUpdateResponse> mo13033a(MobileUpdateBody mobileUpdateBody);

    /* renamed from: a */
    C6433l<VerifyOtpResponse> mo13034a(VerifyOtpBody verifyOtpBody);

    /* renamed from: b */
    VerifyOtpBody mo13035b(String str, String str2);
}
