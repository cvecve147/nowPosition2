package com.openlife.checkme.activity.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.activity.BaseActivity;
import com.openlife.checkme.p093c.C4883m;
import com.openlife.checkme.p094d.C4947j;

public class LoginActivity extends BaseActivity {

    /* renamed from: f */
    private int f13554f;

    /* renamed from: g */
    LoginFragment f13555g;

    /* renamed from: h */
    private String f13556h;

    /* renamed from: a */
    private void m18421a() {
        if (getIntent() == null) {
            finish();
        }
        this.f13554f = getIntent().getIntExtra("LAUNCH_TYPE", 50);
        this.f13556h = getIntent().getStringExtra("MEMBER_VENDOR_ID");
        if (this.f13554f == 50) {
            C4947j.m19536a().mo13553d().mo13498m();
        }
    }

    /* renamed from: a */
    public static void m18422a(Activity activity) {
        Intent intent = new Intent(activity, LoginActivity.class);
        intent.putExtra("LAUNCH_TYPE", 51);
        activity.startActivityForResult(intent, 9999);
    }

    /* renamed from: b */
    public static void m18423b(Activity activity) {
        Intent intent = new Intent(activity, LoginActivity.class);
        intent.setFlags(335544320);
        activity.startActivity(intent);
    }

    /* renamed from: p */
    private void m18424p() {
        this.f13555g = LoginFragment.m18426a(this.f13556h);
        getFragmentManager().beginTransaction().replace(C4956g.content_view, this.f13555g).commit();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public int mo12581n() {
        return C4957h.activity_login_cm;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LoginFragment loginFragment = this.f13555g;
        if (loginFragment != null) {
            loginFragment.onActivityResult(i, i2, intent);
        }
    }

    public void onBackPressed() {
        if (this.f13554f == 50) {
            C4883m.m19235b((Activity) this);
        } else {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m18421a();
        m18424p();
    }
}
