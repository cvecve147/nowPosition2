package com.openlife.checkme.activity.other;

import android.view.View;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.activity.browser.BrowserActivity;
import com.openlife.checkme.p094d.C4946i;

/* renamed from: com.openlife.checkme.activity.other.g */
class C4744g implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ OtherFragment f13700a;

    C4744g(OtherFragment otherFragment) {
        this.f13700a = otherFragment;
    }

    public void onClick(View view) {
        BrowserActivity.m17921a(this.f13700a.getActivity(), C4946i.m19505e(this.f13700a.getActivity().getBaseContext()), C4961l.other_privacy);
    }
}
