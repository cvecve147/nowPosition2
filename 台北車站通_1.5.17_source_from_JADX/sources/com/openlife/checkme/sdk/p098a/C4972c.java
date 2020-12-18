package com.openlife.checkme.sdk.p098a;

import com.openlife.checkme.activity.C4673l;
import com.openlife.checkme.activity.C4703m;
import com.openlife.checkme.activity.splash.p090a.C4789a;
import com.openlife.checkme.net.model.AuthLoginBody;
import com.openlife.checkme.net.model.LoginResponse;
import com.openlife.checkme.net.model.SystemConfigBody;
import com.openlife.checkme.net.model.SystemConfigData;
import com.openlife.checkme.net.model.SystemConfigResponse;
import com.openlife.checkme.p094d.C4938a;
import com.openlife.checkme.p094d.C4946i;
import p208e.p221b.C6433l;

/* renamed from: com.openlife.checkme.sdk.a.c */
public class C4972c extends C4673l implements C4703m, C4970a {
    /* renamed from: a */
    public AuthLoginBody mo13075a(C4789a aVar) {
        return new AuthLoginBody(aVar.mo13241f(), aVar.mo13236a(), aVar.mo13240e(), aVar.mo13238c(), aVar.mo13237b(), aVar.mo13239d(), aVar.mo13242g());
    }

    /* renamed from: a */
    public C6433l<LoginResponse> mo13076a(AuthLoginBody authLoginBody) {
        return this.f13552a.mo13605b().mo13558a(authLoginBody.getSignature(), authLoginBody);
    }

    /* renamed from: a */
    public C6433l<SystemConfigResponse> mo13077a(SystemConfigBody systemConfigBody) {
        return this.f13552a.mo13605b().mo13585a(systemConfigBody.getSignature(), systemConfigBody);
    }

    /* renamed from: a */
    public void mo13078a(int i) {
        this.f13553b.mo13554e().mo13528c(i);
    }

    /* renamed from: a */
    public void mo13079a(SystemConfigData systemConfigData) {
        C4946i e = this.f13553b.mo13554e();
        e.mo13529c(systemConfigData.getAboutUs());
        e.mo13525b(systemConfigData.getChangeAccountTime());
        e.mo13526b(systemConfigData.getCustomerServiceEmail());
        e.mo13523a(systemConfigData.getFrequentlyAskedQuestions());
        e.mo13522a(systemConfigData.getMigrateTime());
        e.mo13535e(systemConfigData.getPrivacyPolicy());
        e.mo13532d(systemConfigData.getTermsOfService());
    }

    /* renamed from: a */
    public void mo13080a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        C4938a d = this.f13553b.mo13553d();
        d.mo13489g(str);
        d.mo13477a(str2);
        d.mo13487f(str3);
        d.mo13479b(str4);
        d.mo13493i(str5);
        d.mo13483d(str6);
        d.mo13481c(str7);
        d.mo13485e(str8);
    }

    /* renamed from: b */
    public SystemConfigBody mo13081b() {
        return new SystemConfigBody();
    }
}
