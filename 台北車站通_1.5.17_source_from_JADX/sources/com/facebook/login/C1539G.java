package com.facebook.login;

import android.os.Bundle;
import com.facebook.C1574p;
import com.facebook.internal.C1496ha;
import com.facebook.login.LoginClient;

/* renamed from: com.facebook.login.G */
class C1539G implements C1496ha.C1499c {

    /* renamed from: a */
    final /* synthetic */ LoginClient.Request f5271a;

    /* renamed from: b */
    final /* synthetic */ WebViewLoginMethodHandler f5272b;

    C1539G(WebViewLoginMethodHandler webViewLoginMethodHandler, LoginClient.Request request) {
        this.f5272b = webViewLoginMethodHandler;
        this.f5271a = request;
    }

    /* renamed from: a */
    public void mo6224a(Bundle bundle, C1574p pVar) {
        this.f5272b.mo6356b(this.f5271a, bundle, pVar);
    }
}
