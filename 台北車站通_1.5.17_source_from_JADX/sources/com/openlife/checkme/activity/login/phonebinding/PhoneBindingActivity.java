package com.openlife.checkme.activity.login.phonebinding;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.activity.BaseActivity;

public class PhoneBindingActivity extends BaseActivity {

    /* renamed from: f */
    private int f13574f;

    /* renamed from: a */
    private void m18457a() {
        if (getIntent() == null) {
            finish();
        }
        this.f13574f = getIntent().getIntExtra("POINT", 0);
    }

    /* renamed from: a */
    public static void m18458a(Activity activity, int i) {
        Intent intent = new Intent(activity, PhoneBindingActivity.class);
        intent.putExtra("POINT", i);
        activity.startActivityForResult(intent, 9999);
    }

    /* renamed from: p */
    private void m18459p() {
        setTitle(C4961l.loginphone_title);
        getFragmentManager().beginTransaction().replace(C4956g.content_view, PhoneBindingFragment.m18461a(this.f13574f)).commit();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public int mo12581n() {
        return C4957h.activity_login_phonebinding_cm;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m18457a();
        m18459p();
    }
}
