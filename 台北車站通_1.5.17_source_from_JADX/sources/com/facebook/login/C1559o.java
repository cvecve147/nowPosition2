package com.facebook.login;

import android.os.Bundle;
import com.facebook.internal.C1469U;
import com.facebook.login.LoginClient;

/* renamed from: com.facebook.login.o */
class C1559o implements C1469U.C1470a {

    /* renamed from: a */
    final /* synthetic */ LoginClient.Request f5327a;

    /* renamed from: b */
    final /* synthetic */ GetTokenLoginMethodHandler f5328b;

    C1559o(GetTokenLoginMethodHandler getTokenLoginMethodHandler, LoginClient.Request request) {
        this.f5328b = getTokenLoginMethodHandler;
        this.f5327a = request;
    }

    /* renamed from: a */
    public void mo6173a(Bundle bundle) {
        this.f5328b.mo6299b(this.f5327a, bundle);
    }
}
