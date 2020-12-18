package com.openlife.checkme.activity.other;

import android.view.View;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.activity.browser.BrowserActivity;
import com.openlife.checkme.p094d.C4946i;

/* renamed from: com.openlife.checkme.activity.other.f */
class C4743f implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ OtherFragment f13699a;

    C4743f(OtherFragment otherFragment) {
        this.f13699a = otherFragment;
    }

    public void onClick(View view) {
        BrowserActivity.m17921a(this.f13699a.getActivity(), C4946i.m19504d(this.f13699a.getActivity().getBaseContext()), C4961l.other_term);
    }
}
