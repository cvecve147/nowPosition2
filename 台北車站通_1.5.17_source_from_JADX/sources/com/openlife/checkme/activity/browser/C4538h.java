package com.openlife.checkme.activity.browser;

import com.openlife.checkme.activity.C4673l;
import com.openlife.checkme.net.model.PointBody;
import com.openlife.checkme.net.model.PointResponse;
import p208e.p221b.C6433l;

/* renamed from: com.openlife.checkme.activity.browser.h */
public class C4538h extends C4673l implements C4535e {
    /* renamed from: a */
    public PointBody mo12725a() {
        return new PointBody();
    }

    /* renamed from: a */
    public C6433l<PointResponse> mo12726a(PointBody pointBody) {
        return this.f13552a.mo13605b().mo13578a(pointBody.getSignature(), pointBody);
    }

    /* renamed from: b */
    public String mo12727b() {
        return this.f13553b.mo13554e().mo13530d();
    }
}
