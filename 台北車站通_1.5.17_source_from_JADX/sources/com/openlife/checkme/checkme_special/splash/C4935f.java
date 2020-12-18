package com.openlife.checkme.checkme_special.splash;

import com.openlife.checkme.activity.C4673l;
import com.openlife.checkme.activity.splash.C4793e;
import com.openlife.checkme.activity.splash.p090a.C4789a;
import com.openlife.checkme.beaconservice.BeaconService;
import com.openlife.checkme.net.model.AuthLoginBody;
import com.openlife.checkme.net.model.BeaconListBody;
import com.openlife.checkme.net.model.BeaconListResponse;
import com.openlife.checkme.net.model.CheckUpdateBody;
import com.openlife.checkme.net.model.CheckUpdateResponse;
import com.openlife.checkme.net.model.LoginResponse;
import com.openlife.checkme.net.model.SystemConfigBody;
import com.openlife.checkme.net.model.SystemConfigData;
import com.openlife.checkme.net.model.SystemConfigResponse;
import java.util.List;
import p208e.p221b.C6433l;

/* renamed from: com.openlife.checkme.checkme_special.splash.f */
public class C4935f extends C4673l implements C4932c {

    /* renamed from: c */
    C4793e f14104c = new C4793e();

    /* renamed from: a */
    public AuthLoginBody mo13224a(C4789a aVar) {
        return this.f14104c.mo13224a(aVar);
    }

    /* renamed from: a */
    public C6433l<LoginResponse> mo13225a(AuthLoginBody authLoginBody) {
        return this.f14104c.mo13225a(authLoginBody);
    }

    /* renamed from: a */
    public C6433l<BeaconListResponse> mo12887a(BeaconListBody beaconListBody, Long l) {
        return this.f14104c.mo12887a(beaconListBody, l);
    }

    /* renamed from: a */
    public C6433l<CheckUpdateResponse> mo13226a(CheckUpdateBody checkUpdateBody) {
        return this.f14104c.mo13226a(checkUpdateBody);
    }

    /* renamed from: a */
    public C6433l<SystemConfigResponse> mo13227a(SystemConfigBody systemConfigBody) {
        return this.f14104c.mo13227a(systemConfigBody);
    }

    /* renamed from: a */
    public void mo13228a(int i, String str, String str2) {
        this.f14104c.mo13228a(i, str, str2);
    }

    /* renamed from: a */
    public void mo12890a(BeaconService.C4838a aVar) {
        this.f14104c.mo12890a(aVar);
    }

    /* renamed from: a */
    public void mo13229a(SystemConfigData systemConfigData) {
        this.f14104c.mo13229a(systemConfigData);
    }

    /* renamed from: a */
    public void mo13230a(String str) {
        this.f14104c.mo13230a(str);
    }

    /* renamed from: a */
    public void mo13231a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f14104c.mo13231a(str, str2, str3, str4, str5, str6, str7, str8);
    }

    /* renamed from: a */
    public void mo12891a(List<String> list) {
        this.f14104c.mo12891a(list);
    }

    /* renamed from: b */
    public SystemConfigBody mo13232b() {
        return this.f14104c.mo13232b();
    }

    /* renamed from: c */
    public void mo13233c(int i) {
        this.f14104c.mo13233c(i);
    }

    /* renamed from: g */
    public CheckUpdateBody mo13234g() {
        return this.f14104c.mo13234g();
    }

    /* renamed from: m */
    public BeaconListBody mo12896m() {
        return this.f14104c.mo12896m();
    }
}
