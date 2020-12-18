package com.openlife.checkme.activity.other;

import android.view.View;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.activity.browser.BrowserActivity;
import com.openlife.checkme.p094d.C4946i;

/* renamed from: com.openlife.checkme.activity.other.e */
class C4742e implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ OtherFragment f13698a;

    C4742e(OtherFragment otherFragment) {
        this.f13698a = otherFragment;
    }

    public void onClick(View view) {
        BrowserActivity.m17921a(this.f13698a.getActivity(), C4946i.m19503c(this.f13698a.getActivity().getBaseContext()), C4961l.other_about);
    }
}
