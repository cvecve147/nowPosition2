package com.openlife.checkme.activity.splash;

import com.openlife.checkme.activity.C4673l;
import com.openlife.checkme.activity.splash.p090a.C4789a;
import com.openlife.checkme.beaconservice.BeaconService;
import com.openlife.checkme.beaconservice.C4865u;
import com.openlife.checkme.net.model.AuthLoginBody;
import com.openlife.checkme.net.model.BeaconListBody;
import com.openlife.checkme.net.model.BeaconListResponse;
import com.openlife.checkme.net.model.CheckUpdateBody;
import com.openlife.checkme.net.model.CheckUpdateResponse;
import com.openlife.checkme.net.model.LoginResponse;
import com.openlife.checkme.net.model.SystemConfigBody;
import com.openlife.checkme.net.model.SystemConfigData;
import com.openlife.checkme.net.model.SystemConfigResponse;
import com.openlife.checkme.p094d.C4938a;
import com.openlife.checkme.p094d.C4939b;
import com.openlife.checkme.p094d.C4946i;
import java.util.List;
import p208e.p221b.C6433l;

/* renamed from: com.openlife.checkme.activity.splash.e */
public class C4793e extends C4673l implements C4788a {

    /* renamed from: c */
    private C4865u f13795c = new C4865u(this.f13552a, this.f13553b);

    /* renamed from: a */
    public AuthLoginBody mo13224a(C4789a aVar) {
        return new AuthLoginBody(aVar.mo13241f(), aVar.mo13236a(), aVar.mo13240e(), aVar.mo13238c(), aVar.mo13237b(), aVar.mo13239d(), aVar.mo13242g());
    }

    /* renamed from: a */
    public C6433l<LoginResponse> mo13225a(AuthLoginBody authLoginBody) {
        return this.f13552a.mo13605b().mo13558a(authLoginBody.getSignature(), authLoginBody);
    }

    /* renamed from: a */
    public C6433l<BeaconListResponse> mo12887a(BeaconListBody beaconListBody, Long l) {
        return this.f13795c.mo12887a(beaconListBody, l);
    }

    /* renamed from: a */
    public C6433l<CheckUpdateResponse> mo13226a(CheckUpdateBody checkUpdateBody) {
        return this.f13552a.mo13605b().mo13563a(checkUpdateBody.getSignature(), checkUpdateBody);
    }

    /* renamed from: a */
    public C6433l<SystemConfigResponse> mo13227a(SystemConfigBody systemConfigBody) {
        return this.f13552a.mo13605b().mo13585a(systemConfigBody.getSignature(), systemConfigBody);
    }

    /* renamed from: a */
    public void mo13228a(int i, String str, String str2) {
        C4939b c = this.f13553b.mo13552c();
        c.mo13500a(i);
        c.mo13505b(str);
        c.mo13501a(str2);
    }

    /* renamed from: a */
    public void mo12890a(BeaconService.C4838a aVar) {
        this.f13795c.mo12890a(aVar);
    }

    /* renamed from: a */
    public void mo13229a(SystemConfigData systemConfigData) {
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
    public void mo13230a(String str) {
        this.f13553b.mo13553d().mo13495j(str);
    }

    /* renamed from: a */
    public void mo13231a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
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

    /* renamed from: a */
    public void mo12891a(List<String> list) {
        this.f13795c.mo12891a(list);
    }

    /* renamed from: b */
    public SystemConfigBody mo13232b() {
        return new SystemConfigBody();
    }

    /* renamed from: c */
    public void mo13233c(int i) {
        this.f13553b.mo13554e().mo13528c(i);
    }

    /* renamed from: g */
    public CheckUpdateBody mo13234g() {
        return new CheckUpdateBody();
    }

    /* renamed from: m */
    public BeaconListBody mo12896m() {
        return this.f13795c.mo12896m();
    }
}
