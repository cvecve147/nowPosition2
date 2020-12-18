package com.openlife.checkme.activity.other;

import android.view.View;
import com.openlife.checkme.activity.account.AccountActivity;
import com.openlife.checkme.p093c.C4883m;

/* renamed from: com.openlife.checkme.activity.other.i */
class C4746i implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ OtherFragment f13702a;

    C4746i(OtherFragment otherFragment) {
        this.f13702a = otherFragment;
    }

    public void onClick(View view) {
        if (C4883m.m19229a(this.f13702a.getActivity())) {
            AccountActivity.m17702a(this.f13702a.getActivity());
        }
    }
}
