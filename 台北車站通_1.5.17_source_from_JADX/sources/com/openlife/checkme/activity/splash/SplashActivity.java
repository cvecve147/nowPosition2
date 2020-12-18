package com.openlife.checkme.activity.splash;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.openlife.checkme.C4948e;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.C4962m;
import com.openlife.checkme.activity.BaseActivity;
import p013b.p018b.p028h.p029a.C1006a;

public class SplashActivity extends BaseActivity {
    /* renamed from: a */
    private void m18854a() {
        getFragmentManager().beginTransaction().replace(C4956g.content_view, C4792d.m18878b()).commit();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public int mo12581n() {
        return C4957h.activity_splash_cm;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        setTheme(C4962m.AppTheme_NoActionBar);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent.getExtras() != null && intent.getExtras().containsKey("INTENT_NAME_COLOR")) {
            int i = intent.getExtras().getInt("INTENT_NAME_COLOR", C4948e.cyan);
            if (Build.VERSION.SDK_INT >= 21) {
                getWindow().setStatusBarColor(C1006a.m5386a(getBaseContext(), i));
            }
        }
        m18854a();
    }
}
