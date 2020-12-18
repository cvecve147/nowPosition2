package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.C1427h;
import com.facebook.C1574p;
import com.facebook.C1576r;
import com.facebook.C1601x;
import com.facebook.C1604z;
import com.facebook.FacebookRequestError;
import com.facebook.internal.C1480ba;
import com.facebook.login.LoginClient;
import java.util.Locale;

abstract class WebLoginMethodHandler extends LoginMethodHandler {

    /* renamed from: a */
    private String f5303a;

    WebLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    WebLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* renamed from: d */
    private void m7262d(String str) {
        this.f5302b.mo6316c().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", str).apply();
    }

    /* renamed from: f */
    private static final String m7263f() {
        return "fb" + C1601x.m7389c() + "://authorize";
    }

    /* renamed from: g */
    private String m7264g() {
        return this.f5302b.mo6316c().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", "");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bundle mo6353a(Bundle bundle, LoginClient.Request request) {
        bundle.putString("redirect_uri", m7263f());
        bundle.putString("client_id", request.mo6329a());
        LoginClient loginClient = this.f5302b;
        bundle.putString("e2e", LoginClient.m7199e());
        bundle.putString("response_type", "token,signed_request");
        bundle.putString("return_scopes", "true");
        bundle.putString("auth_type", "rerequest");
        if (mo6266d() != null) {
            bundle.putString("sso", mo6266d());
        }
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6354a(LoginClient.Request request, Bundle bundle, C1574p pVar) {
        LoginClient.Result result;
        String str;
        this.f5303a = null;
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.f5303a = bundle.getString("e2e");
            }
            try {
                AccessToken a = LoginMethodHandler.m7244a(request.mo6337f(), bundle, mo6268e(), request.mo6329a());
                result = LoginClient.Result.m7235a(this.f5302b.mo6323i(), a);
                CookieSyncManager.createInstance(this.f5302b.mo6316c()).sync();
                m7262d(a.mo5894h());
            } catch (C1574p e) {
                result = LoginClient.Result.m7237a(this.f5302b.mo6323i(), (String) null, e.getMessage());
            }
        } else if (pVar instanceof C1576r) {
            result = LoginClient.Result.m7236a(this.f5302b.mo6323i(), "User canceled log in.");
        } else {
            this.f5303a = null;
            String message = pVar.getMessage();
            if (pVar instanceof C1604z) {
                FacebookRequestError a2 = ((C1604z) pVar).mo6464a();
                str = String.format(Locale.ROOT, "%d", new Object[]{Integer.valueOf(a2.mo5916b())});
                message = a2.toString();
            } else {
                str = null;
            }
            result = LoginClient.Result.m7238a(this.f5302b.mo6323i(), (String) null, message, str);
        }
        if (!C1480ba.m6958b(this.f5303a)) {
            mo6350b(this.f5303a);
        }
        this.f5302b.mo6313b(result);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Bundle mo6355b(LoginClient.Request request) {
        String str;
        Bundle bundle = new Bundle();
        if (!C1480ba.m6952a(request.mo6337f())) {
            String join = TextUtils.join(",", request.mo6337f());
            bundle.putString("scope", join);
            mo6349a("scope", join);
        }
        bundle.putString("default_audience", request.mo6333c().mo6362a());
        bundle.putString("state", mo6347a(request.mo6332b()));
        AccessToken b = AccessToken.m6460b();
        String h = b != null ? b.mo5894h() : null;
        if (h == null || !h.equals(m7264g())) {
            C1480ba.m6935a((Context) this.f5302b.mo6316c());
            str = "0";
        } else {
            bundle.putString("access_token", h);
            str = "1";
        }
        mo6349a("access_token", str);
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo6266d() {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract C1427h mo6268e();
}
