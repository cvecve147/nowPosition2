package com.openlife.checkme.sdk;

import android.content.Intent;
import android.os.Bundle;
import com.openlife.checkme.C4948e;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.activity.BaseActivity;
import com.openlife.checkme.activity.splash.p090a.C4789a;
import com.openlife.checkme.p091b.C4837a;
import com.openlife.checkme.p094d.C4947j;

public class CheckMeLoginActivity extends BaseActivity {

    /* renamed from: f */
    String f14145f;

    /* renamed from: d */
    public String mo13981d(int i) {
        return C4837a.m19034a(C4947j.m19536a(), i, getBaseContext());
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public int mo12581n() {
        return C4957h.activity_check_me_login;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        Intent intent = getIntent();
        if (intent.getExtras().containsKey("INTENT_NAME_LANGUAGE")) {
            this.f14145f = intent.getExtras().getString("INTENT_NAME_LANGUAGE", C4789a.f13785a);
            C4947j.m19536a().mo13554e().mo13541g(this.f14145f);
        }
        if (intent.getExtras().containsKey("INTENT_NAME_COLOR")) {
            C4947j.m19536a().mo13554e().mo13531d(intent.getExtras().getInt("INTENT_NAME_COLOR", C4948e.cyan));
        }
        super.onCreate(bundle);
        getFragmentManager().beginTransaction().replace(C4956g.content_view, C5004m.m19715o()).commit();
    }
}
