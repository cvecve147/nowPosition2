package com.openlife.checkme.activity.login;

import com.openlife.checkme.activity.C4673l;
import com.openlife.checkme.net.model.FbLoginBody;
import com.openlife.checkme.net.model.LoginResponse;
import com.openlife.checkme.p094d.C4938a;
import p208e.p221b.C6433l;

/* renamed from: com.openlife.checkme.activity.login.h */
public class C4681h extends C4673l implements C4678e {
    /* renamed from: a */
    public C6433l<LoginResponse> mo12995a(FbLoginBody fbLoginBody) {
        return this.f13552a.mo13605b().mo13564a(fbLoginBody.getSignature(), fbLoginBody);
    }

    /* renamed from: a */
    public String mo12996a() {
        return this.f13553b.mo13553d().mo13494j();
    }

    /* renamed from: a */
    public void mo12997a(String str) {
        this.f13553b.mo13553d().mo13477a(str);
    }

    /* renamed from: a */
    public void mo12998a(String str, String str2, String str3, String str4, String str5) {
        C4938a d = this.f13553b.mo13553d();
        d.mo13489g(str);
        d.mo13479b(str2);
        d.mo13483d(str3);
        d.mo13481c(str4);
        d.mo13485e(str5);
    }
}
