package com.openlife.checkme.checkme_special.mission;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.p011v7.widget.Toolbar;
import android.widget.TextView;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.activity.BaseActivity;

public class SpMissionListActivity extends BaseActivity {
    protected TextView point;
    protected Toolbar toolbar;

    /* renamed from: a */
    private void m19387a() {
        setTitle(C4961l.checkme_s_home);
        mo12577b(true);
        mo12578c(false);
        this.point.setVisibility(0);
        this.point.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        this.point.setText(C4961l.checkme_s_mission_his_list);
        this.point.setTextSize(20.0f);
        getFragmentManager().beginTransaction().replace(C4956g.content_view, SpMissionListFragment.m19403g()).commit();
    }

    /* renamed from: a */
    public static void m19388a(Activity activity) {
        activity.startActivityForResult(new Intent(activity, SpMissionListActivity.class), 9999);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public int mo12581n() {
        return C4957h.activity_mission_list_s_cm;
    }

    /* renamed from: o */
    public void mo12582o() {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m19387a();
    }
}
