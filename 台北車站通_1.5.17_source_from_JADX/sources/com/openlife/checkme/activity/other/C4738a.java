package com.openlife.checkme.activity.other;

import android.view.View;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.activity.browser.BrowserActivity;
import com.openlife.checkme.p094d.C4946i;

/* renamed from: com.openlife.checkme.activity.other.a */
class C4738a implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ OtherFragment f13694a;

    C4738a(OtherFragment otherFragment) {
        this.f13694a = otherFragment;
    }

    public void onClick(View view) {
        BrowserActivity.m17921a(this.f13694a.getActivity(), C4946i.m19501a(this.f13694a.getActivity().getBaseContext()), C4961l.other_question);
    }
}
