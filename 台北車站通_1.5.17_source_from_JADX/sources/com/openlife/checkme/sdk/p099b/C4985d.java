package com.openlife.checkme.sdk.p099b;

import com.openlife.checkme.activity.C4673l;
import com.openlife.checkme.activity.C4703m;
import com.openlife.checkme.activity.mission.list.C4728e;
import com.openlife.checkme.activity.mission.list.C4731h;
import com.openlife.checkme.activity.splash.C4793e;
import com.openlife.checkme.activity.splash.p090a.C4789a;
import com.openlife.checkme.activity.store.list.C4828f;
import com.openlife.checkme.beaconservice.BeaconService;
import com.openlife.checkme.net.model.AuthLoginBody;
import com.openlife.checkme.net.model.BeaconListBody;
import com.openlife.checkme.net.model.BeaconListResponse;
import com.openlife.checkme.net.model.ChainStoreListBody;
import com.openlife.checkme.net.model.ChainStoreListResponse;
import com.openlife.checkme.net.model.CheckUpdateBody;
import com.openlife.checkme.net.model.CheckUpdateResponse;
import com.openlife.checkme.net.model.LoginResponse;
import com.openlife.checkme.net.model.MissionExecuteBody;
import com.openlife.checkme.net.model.MissionExecuteResponse;
import com.openlife.checkme.net.model.MissionListBody;
import com.openlife.checkme.net.model.MissionListResponse;
import com.openlife.checkme.net.model.StreetStoreListBody;
import com.openlife.checkme.net.model.StreetStoreListResponse;
import com.openlife.checkme.net.model.SystemConfigBody;
import com.openlife.checkme.net.model.SystemConfigData;
import com.openlife.checkme.net.model.SystemConfigResponse;
import com.openlife.checkme.net.model.ThreeResponse;
import java.util.List;
import p208e.p221b.C6433l;

/* renamed from: com.openlife.checkme.sdk.b.d */
public class C4985d extends C4673l implements C4703m, C4728e, C4982a {

    /* renamed from: c */
    private C4828f f14171c = new C4828f();

    /* renamed from: d */
    private C4793e f14172d = new C4793e();

    /* renamed from: e */
    private C4731h f14173e = new C4731h();

    /* renamed from: a */
    public AuthLoginBody mo13224a(C4789a aVar) {
        return this.f14172d.mo13224a(aVar);
    }

    /* renamed from: a */
    public MissionExecuteBody mo13114a(int i) {
        return this.f14173e.mo13114a(i);
    }

    /* renamed from: a */
    public MissionListBody mo13115a() {
        return this.f14173e.mo13115a();
    }

    /* renamed from: a */
    public C6433l<LoginResponse> mo13225a(AuthLoginBody authLoginBody) {
        return this.f14172d.mo13225a(authLoginBody);
    }

    /* renamed from: a */
    public C6433l<BeaconListResponse> mo12887a(BeaconListBody beaconListBody, Long l) {
        return this.f14172d.mo12887a(beaconListBody, l);
    }

    /* renamed from: a */
    public C6433l<ChainStoreListResponse> mo13306a(ChainStoreListBody chainStoreListBody) {
        return this.f14171c.mo13306a(chainStoreListBody);
    }

    /* renamed from: a */
    public C6433l<CheckUpdateResponse> mo13226a(CheckUpdateBody checkUpdateBody) {
        return this.f14172d.mo13226a(checkUpdateBody);
    }

    /* renamed from: a */
    public C6433l<MissionExecuteResponse> mo13116a(MissionExecuteBody missionExecuteBody) {
        return this.f14173e.mo13116a(missionExecuteBody);
    }

    /* renamed from: a */
    public C6433l<MissionListResponse> mo13117a(MissionListBody missionListBody, int i) {
        return this.f14173e.mo13117a(missionListBody, i);
    }

    /* renamed from: a */
    public C6433l<StreetStoreListResponse> mo13307a(StreetStoreListBody streetStoreListBody) {
        return this.f14171c.mo13307a(streetStoreListBody);
    }

    /* renamed from: a */
    public C6433l<SystemConfigResponse> mo13227a(SystemConfigBody systemConfigBody) {
        return this.f14172d.mo13227a(systemConfigBody);
    }

    /* renamed from: a */
    public C6433l<ThreeResponse> mo14000a(C6433l<SystemConfigResponse> lVar, C6433l<CheckUpdateResponse> lVar2, C6433l<LoginResponse> lVar3) {
        return C6433l.m24023a(lVar, lVar2, lVar3, new C4984c(this));
    }

    /* renamed from: a */
    public void mo13228a(int i, String str, String str2) {
        this.f14172d.mo13228a(i, str, str2);
    }

    /* renamed from: a */
    public void mo12890a(BeaconService.C4838a aVar) {
        this.f14172d.mo12890a(aVar);
    }

    /* renamed from: a */
    public void mo13229a(SystemConfigData systemConfigData) {
        this.f14172d.mo13229a(systemConfigData);
    }

    /* renamed from: a */
    public void mo13230a(String str) {
        this.f14172d.mo13230a(str);
    }

    /* renamed from: a */
    public void mo13231a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f14172d.mo13231a(str, str2, str3, str4, str5, str6, str7, str8);
    }

    /* renamed from: a */
    public void mo12891a(List<String> list) {
        this.f14172d.mo12891a(list);
    }

    /* renamed from: b */
    public SystemConfigBody mo13232b() {
        return this.f14172d.mo13232b();
    }

    /* renamed from: c */
    public void mo13233c(int i) {
        this.f14172d.mo13233c(i);
    }

    /* renamed from: g */
    public CheckUpdateBody mo13234g() {
        return this.f14172d.mo13234g();
    }

    /* renamed from: k */
    public ChainStoreListBody mo13308k() {
        return this.f14171c.mo13308k();
    }

    /* renamed from: l */
    public StreetStoreListBody mo13309l() {
        return this.f14171c.mo13309l();
    }

    /* renamed from: m */
    public BeaconListBody mo12896m() {
        return this.f14172d.mo12896m();
    }
}
