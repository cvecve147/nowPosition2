package com.openlife.checkme.activity.splash;

import com.openlife.checkme.activity.C4703m;
import com.openlife.checkme.activity.splash.p090a.C4789a;
import com.openlife.checkme.beaconservice.C4863s;
import com.openlife.checkme.net.model.AuthLoginBody;
import com.openlife.checkme.net.model.CheckUpdateBody;
import com.openlife.checkme.net.model.CheckUpdateResponse;
import com.openlife.checkme.net.model.LoginResponse;
import com.openlife.checkme.net.model.SystemConfigBody;
import com.openlife.checkme.net.model.SystemConfigData;
import com.openlife.checkme.net.model.SystemConfigResponse;
import p208e.p221b.C6433l;

/* renamed from: com.openlife.checkme.activity.splash.a */
public interface C4788a extends C4703m, C4863s {
    /* renamed from: a */
    AuthLoginBody mo13224a(C4789a aVar);

    /* renamed from: a */
    C6433l<LoginResponse> mo13225a(AuthLoginBody authLoginBody);

    /* renamed from: a */
    C6433l<CheckUpdateResponse> mo13226a(CheckUpdateBody checkUpdateBody);

    /* renamed from: a */
    C6433l<SystemConfigResponse> mo13227a(SystemConfigBody systemConfigBody);

    /* renamed from: a */
    void mo13228a(int i, String str, String str2);

    /* renamed from: a */
    void mo13229a(SystemConfigData systemConfigData);

    /* renamed from: a */
    void mo13230a(String str);

    /* renamed from: a */
    void mo13231a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8);

    /* renamed from: b */
    SystemConfigBody mo13232b();

    /* renamed from: c */
    void mo13233c(int i);

    /* renamed from: g */
    CheckUpdateBody mo13234g();
}
