package com.openlife.checkme.sdk.p098a;

import com.openlife.checkme.activity.C4703m;
import com.openlife.checkme.activity.splash.p090a.C4789a;
import com.openlife.checkme.net.model.AuthLoginBody;
import com.openlife.checkme.net.model.LoginResponse;
import com.openlife.checkme.net.model.SystemConfigBody;
import com.openlife.checkme.net.model.SystemConfigData;
import com.openlife.checkme.net.model.SystemConfigResponse;
import p208e.p221b.C6433l;

/* renamed from: com.openlife.checkme.sdk.a.a */
public interface C4970a extends C4703m {
    /* renamed from: a */
    AuthLoginBody mo13075a(C4789a aVar);

    /* renamed from: a */
    C6433l<LoginResponse> mo13076a(AuthLoginBody authLoginBody);

    /* renamed from: a */
    C6433l<SystemConfigResponse> mo13077a(SystemConfigBody systemConfigBody);

    /* renamed from: a */
    void mo13078a(int i);

    /* renamed from: a */
    void mo13079a(SystemConfigData systemConfigData);

    /* renamed from: a */
    void mo13080a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8);

    /* renamed from: b */
    SystemConfigBody mo13081b();
}
