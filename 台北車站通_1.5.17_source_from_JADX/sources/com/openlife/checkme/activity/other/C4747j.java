package com.openlife.checkme.activity.other;

import android.view.View;
import com.openlife.checkme.activity.login.LoginActivity;
import com.openlife.checkme.p093c.C4883m;

/* renamed from: com.openlife.checkme.activity.other.j */
class C4747j implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ OtherFragment f13703a;

    C4747j(OtherFragment otherFragment) {
        this.f13703a = otherFragment;
    }

    public void onClick(View view) {
        if (C4883m.m19229a(this.f13703a.getActivity())) {
            LoginActivity.m18422a(this.f13703a.getActivity());
        }
    }
}
