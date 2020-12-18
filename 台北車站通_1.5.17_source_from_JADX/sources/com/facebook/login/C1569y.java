package com.facebook.login;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.p007v4.app.C0339l;
import android.support.p007v4.app.C0344n;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C1364U;
import com.facebook.C1365V;
import com.facebook.login.LoginClient;

/* renamed from: com.facebook.login.y */
public class C1569y extends C0339l {

    /* renamed from: W */
    private String f5348W;

    /* renamed from: X */
    private LoginClient f5349X;

    /* renamed from: Y */
    private LoginClient.Request f5350Y;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m7297a(LoginClient.Result result) {
        this.f5350Y = null;
        int i = result.f5290a == LoginClient.Result.C1541a.CANCEL ? 0 : -1;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.facebook.LoginFragment:Result", result);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        if (mo1316C()) {
            mo1337a().setResult(i, intent);
            mo1337a().finish();
        }
    }

    /* renamed from: b */
    private void m7299b(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity != null) {
            this.f5348W = callingActivity.getPackageName();
        }
    }

    /* renamed from: K */
    public void mo1324K() {
        this.f5349X.mo6306a();
        super.mo1324K();
    }

    /* renamed from: O */
    public void mo1326O() {
        super.mo1326O();
        mo1337a().findViewById(C1364U.com_facebook_login_activity_progress_bar).setVisibility(8);
    }

    /* renamed from: P */
    public void mo1327P() {
        super.mo1327P();
        if (this.f5348W == null) {
            Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
            mo1337a().finish();
            return;
        }
        this.f5349X.mo6317c(this.f5350Y);
    }

    /* renamed from: a */
    public View mo1339a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C1365V.com_facebook_login_fragment, viewGroup, false);
        this.f5349X.mo6310a((LoginClient.C1542a) new C1568x(this, inflate));
        return inflate;
    }

    /* renamed from: a */
    public void mo1343a(int i, int i2, Intent intent) {
        super.mo1343a(i, i2, intent);
        this.f5349X.mo6312a(i, i2, intent);
    }

    /* renamed from: c */
    public void mo1301c(Bundle bundle) {
        super.mo1301c(bundle);
        if (bundle != null) {
            this.f5349X = (LoginClient) bundle.getParcelable("loginClient");
            this.f5349X.mo6307a((C0339l) this);
        } else {
            this.f5349X = mo1304ea();
        }
        this.f5349X.mo6311a((LoginClient.C1543b) new C1567w(this));
        C0344n a = mo1337a();
        if (a != null) {
            m7299b(a);
            if (a.getIntent() != null) {
                this.f5350Y = (LoginClient.Request) a.getIntent().getBundleExtra("com.facebook.LoginFragment:Request").getParcelable("request");
            }
        }
    }

    /* renamed from: e */
    public void mo1303e(Bundle bundle) {
        super.mo1303e(bundle);
        bundle.putParcelable("loginClient", this.f5349X);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ea */
    public LoginClient mo1304ea() {
        return new LoginClient((C0339l) this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: fa */
    public LoginClient mo6389fa() {
        return this.f5349X;
    }
}
