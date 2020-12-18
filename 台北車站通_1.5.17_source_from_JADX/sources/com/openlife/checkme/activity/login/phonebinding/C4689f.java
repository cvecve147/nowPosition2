package com.openlife.checkme.activity.login.phonebinding;

import com.openlife.checkme.activity.C4673l;
import com.openlife.checkme.net.model.MobileUpdateBody;
import com.openlife.checkme.net.model.MobileUpdateResponse;
import p208e.p221b.C6433l;

/* renamed from: com.openlife.checkme.activity.login.phonebinding.f */
public class C4689f extends C4673l implements C4686c {
    /* renamed from: a */
    public MobileUpdateBody mo13015a(String str) {
        return new MobileUpdateBody(str);
    }

    /* renamed from: a */
    public C6433l<MobileUpdateResponse> mo13016a(MobileUpdateBody mobileUpdateBody) {
        return this.f13552a.mo13605b().mo13577a(mobileUpdateBody.getSignature(), mobileUpdateBody);
    }
}
