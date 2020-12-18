package com.facebook.login;

import android.os.Bundle;
import com.facebook.C1574p;
import com.facebook.internal.C1480ba;
import com.facebook.login.LoginClient;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.login.p */
class C1560p implements C1480ba.C1481a {

    /* renamed from: a */
    final /* synthetic */ Bundle f5329a;

    /* renamed from: b */
    final /* synthetic */ LoginClient.Request f5330b;

    /* renamed from: c */
    final /* synthetic */ GetTokenLoginMethodHandler f5331c;

    C1560p(GetTokenLoginMethodHandler getTokenLoginMethodHandler, Bundle bundle, LoginClient.Request request) {
        this.f5331c = getTokenLoginMethodHandler;
        this.f5329a = bundle;
        this.f5330b = request;
    }

    /* renamed from: a */
    public void mo5992a(C1574p pVar) {
        LoginClient loginClient = this.f5331c.f5302b;
        loginClient.mo6309a(LoginClient.Result.m7237a(loginClient.mo6323i(), "Caught exception", pVar.getMessage()));
    }

    /* renamed from: a */
    public void mo5993a(JSONObject jSONObject) {
        try {
            this.f5329a.putString("com.facebook.platform.extra.USER_ID", jSONObject.getString("id"));
            this.f5331c.mo6300c(this.f5330b, this.f5329a);
        } catch (JSONException e) {
            LoginClient loginClient = this.f5331c.f5302b;
            loginClient.mo6309a(LoginClient.Result.m7237a(loginClient.mo6323i(), "Caught exception", e.getMessage()));
        }
    }
}
