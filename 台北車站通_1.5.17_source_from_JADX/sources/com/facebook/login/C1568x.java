package com.facebook.login;

import android.view.View;
import com.facebook.C1364U;
import com.facebook.login.LoginClient;

/* renamed from: com.facebook.login.x */
class C1568x implements LoginClient.C1542a {

    /* renamed from: a */
    final /* synthetic */ View f5346a;

    /* renamed from: b */
    final /* synthetic */ C1569y f5347b;

    C1568x(C1569y yVar, View view) {
        this.f5347b = yVar;
        this.f5346a = view;
    }

    /* renamed from: a */
    public void mo6344a() {
        this.f5346a.findViewById(C1364U.com_facebook_login_activity_progress_bar).setVisibility(0);
    }

    /* renamed from: b */
    public void mo6345b() {
        this.f5346a.findViewById(C1364U.com_facebook_login_activity_progress_bar).setVisibility(8);
    }
}
