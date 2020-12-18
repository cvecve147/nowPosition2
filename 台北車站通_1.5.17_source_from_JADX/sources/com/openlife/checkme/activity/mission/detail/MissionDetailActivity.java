package com.openlife.checkme.activity.mission.detail;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.activity.BaseActivity;
import com.openlife.checkme.p094d.C4947j;

public class MissionDetailActivity extends BaseActivity implements C4713i {

    /* renamed from: f */
    MissionDetailFragment f13601f;

    /* renamed from: g */
    private int f13602g;

    /* renamed from: h */
    private C4711g f13603h;

    /* renamed from: a */
    public static void m18534a(Activity activity, int i) {
        Intent intent = new Intent(activity, MissionDetailActivity.class);
        intent.putExtra("id", i);
        activity.startActivityForResult(intent, 9999);
    }

    /* renamed from: p */
    private void m18535p() {
        int i;
        String queryParameter;
        if (getIntent() == null) {
            finish();
        }
        Uri data = getIntent().getData();
        if (data == null) {
            i = getIntent().getIntExtra("id", 0);
        } else if (!data.getHost().equals(getString(C4961l.host_assignment)) || !data.getPath().equals(getString(C4961l.path_detail)) || (queryParameter = data.getQueryParameter("id")) == null || queryParameter.isEmpty()) {
            finish();
            return;
        } else {
            i = Integer.parseInt(queryParameter);
        }
        this.f13602g = i;
    }

    /* renamed from: a */
    public void mo13040a() {
        m18535p();
        setTitle((CharSequence) null);
        mo12577b(true);
        this.f13601f = MissionDetailFragment.m18545d(this.f13602g);
        getFragmentManager().beginTransaction().replace(C4956g.content_view, this.f13601f).commit();
    }

    /* renamed from: a */
    public void mo13041a(int i) {
        if (i == 1 || i == 2) {
            mo12580m();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public int mo12581n() {
        return C4957h.activity_mission_detail_cm;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        MissionDetailFragment missionDetailFragment = this.f13601f;
        if (missionDetailFragment != null) {
            missionDetailFragment.onActivityResult(i, i2, intent);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13603h = new C4711g(this, new C4710f(C4947j.m19536a()));
        this.f13603h.mo13070a();
    }
}
