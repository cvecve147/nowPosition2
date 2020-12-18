package com.openlife.checkme.activity.login.smsbinding;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.activity.BaseActivity;

public class SmsBindingActivity extends BaseActivity {

    /* renamed from: f */
    private String f13585f;

    /* renamed from: a */
    private void m18484a() {
        if (getIntent() == null) {
            finish();
        }
        this.f13585f = getIntent().getStringExtra("PHONE");
    }

    /* renamed from: a */
    public static void m18485a(Activity activity, String str) {
        Intent intent = new Intent(activity, SmsBindingActivity.class);
        intent.putExtra("PHONE", str);
        activity.startActivityForResult(intent, 9999);
    }

    /* renamed from: p */
    private void m18486p() {
        setTitle(C4961l.loginsms_title);
        getFragmentManager().beginTransaction().replace(C4956g.content_view, SmsBindingFragment.m18490g(this.f13585f)).commit();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public int mo12581n() {
        return C4957h.activity_login_smsbinding_cm;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m18484a();
        m18486p();
    }
}
