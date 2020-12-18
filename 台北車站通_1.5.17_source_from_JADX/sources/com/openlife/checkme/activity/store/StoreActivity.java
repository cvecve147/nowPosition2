package com.openlife.checkme.activity.store;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.activity.BaseActivity;
import com.openlife.checkme.p094d.C4947j;
import com.openlife.checkme.p095e.p096a.C4949a;

public class StoreActivity extends BaseActivity {

    /* renamed from: f */
    private int f13810f;

    /* renamed from: a */
    private void m18920a() {
        if (getIntent() != null) {
            Uri data = getIntent().getData();
            if (data == null) {
                return;
            }
            if (!data.getHost().equals(getString(C4961l.host_assignment))) {
                finish();
                return;
            } else if (!data.getPath().equals(getString(C4961l.path_corp_list)) && data.getPath().equals(getString(C4961l.path_street_list))) {
                this.f13810f = 1;
                return;
            }
        }
        this.f13810f = 0;
    }

    /* renamed from: a */
    public static void m18921a(Activity activity) {
        activity.startActivityForResult(new Intent(activity, StoreActivity.class), 9999);
    }

    /* renamed from: p */
    private void m18922p() {
        boolean z = C4947j.m19536a().mo13554e().mo13527c() == 3;
        setTitle((CharSequence) null);
        mo12577b(true);
        mo12578c(false);
        getFragmentManager().beginTransaction().replace(C4956g.content_view, z ? C4949a.m19543h(this.f13810f) : StoreFragment.m18930d(this.f13810f)).commit();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public int mo12581n() {
        return C4957h.activity_store_cm;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m18920a();
        m18922p();
    }
}
