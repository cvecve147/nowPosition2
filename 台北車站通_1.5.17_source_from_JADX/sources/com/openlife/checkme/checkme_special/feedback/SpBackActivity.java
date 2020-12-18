package com.openlife.checkme.checkme_special.feedback;

import android.os.Bundle;
import android.support.p011v7.widget.Toolbar;
import android.widget.TextView;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.C4957h;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.activity.BaseActivity;

public class SpBackActivity extends BaseActivity {
    protected TextView point;
    protected Toolbar toolbar;

    /* renamed from: a */
    private void m19260a() {
        setTitle(C4961l.checkme_s_home);
        mo12577b(true);
        mo12578c(false);
        this.point.setVisibility(0);
        this.point.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        this.point.setText(C4961l.checkme_s_problem_feedback);
        this.point.setTextSize(20.0f);
        getFragmentManager().beginTransaction().replace(C4956g.content_view, SpFeedBackFragment.m19264a()).commit();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public int mo12581n() {
        return C4957h.activity_main_cm_s;
    }

    /* renamed from: o */
    public void mo12582o() {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m19260a();
    }
}
