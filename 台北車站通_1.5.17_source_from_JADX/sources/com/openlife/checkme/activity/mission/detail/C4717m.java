package com.openlife.checkme.activity.mission.detail;

import com.openlife.checkme.activity.C4673l;
import com.openlife.checkme.activity.C4703m;
import com.openlife.checkme.activity.splash.p090a.C4789a;
import com.openlife.checkme.net.model.AuthLoginBody;
import com.openlife.checkme.net.model.Execution;
import com.openlife.checkme.net.model.LoginResponse;
import com.openlife.checkme.net.model.MissionCommitBody;
import com.openlife.checkme.net.model.MissionCommitResponse;
import com.openlife.checkme.net.model.MissionDetailBody;
import com.openlife.checkme.net.model.MissionDetailResponse;
import com.openlife.checkme.net.model.SystemConfigBody;
import com.openlife.checkme.net.model.SystemConfigData;
import com.openlife.checkme.net.model.SystemConfigResponse;
import com.openlife.checkme.sdk.p098a.C4972c;
import p208e.p221b.C6433l;

/* renamed from: com.openlife.checkme.activity.mission.detail.m */
public class C4717m extends C4673l implements C4703m, C4714j {

    /* renamed from: c */
    private C4972c f13634c = new C4972c();

    /* renamed from: a */
    public AuthLoginBody mo13075a(C4789a aVar) {
        return this.f13634c.mo13075a(aVar);
    }

    /* renamed from: a */
    public MissionCommitBody mo13071a(int i, Execution execution) {
        return new MissionCommitBody(i, execution);
    }

    /* renamed from: a */
    public MissionDetailBody mo13072a() {
        return new MissionDetailBody();
    }

    /* renamed from: a */
    public C6433l<LoginResponse> mo13076a(AuthLoginBody authLoginBody) {
        return this.f13634c.mo13076a(authLoginBody);
    }

    /* renamed from: a */
    public C6433l<MissionCommitResponse> mo13073a(MissionCommitBody missionCommitBody) {
        return this.f13552a.mo13605b().mo13572a(missionCommitBody.getSignature(), missionCommitBody);
    }

    /* renamed from: a */
    public C6433l<MissionDetailResponse> mo13074a(MissionDetailBody missionDetailBody, int i) {
        return this.f13552a.mo13605b().mo13573a(missionDetailBody.getSignature(), missionDetailBody, i);
    }

    /* renamed from: a */
    public C6433l<SystemConfigResponse> mo13077a(SystemConfigBody systemConfigBody) {
        return this.f13634c.mo13077a(systemConfigBody);
    }

    /* renamed from: a */
    public void mo13078a(int i) {
        this.f13634c.mo13078a(i);
    }

    /* renamed from: a */
    public void mo13079a(SystemConfigData systemConfigData) {
        this.f13634c.mo13079a(systemConfigData);
    }

    /* renamed from: a */
    public void mo13080a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f13634c.mo13080a(str, str2, str3, str4, str5, str6, str7, str8);
    }

    /* renamed from: b */
    public SystemConfigBody mo13081b() {
        return this.f13634c.mo13081b();
    }
}
