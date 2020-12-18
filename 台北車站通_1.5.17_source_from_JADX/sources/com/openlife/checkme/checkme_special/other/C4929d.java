package com.openlife.checkme.checkme_special.other;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.activity.browser.BrowserActivity;
import com.openlife.checkme.p094d.C4946i;

/* renamed from: com.openlife.checkme.checkme_special.other.d */
class C4929d implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Activity f14096a;

    /* renamed from: b */
    final /* synthetic */ Context f14097b;

    /* renamed from: c */
    final /* synthetic */ SpOtherFragment f14098c;

    C4929d(SpOtherFragment spOtherFragment, Activity activity, Context context) {
        this.f14098c = spOtherFragment;
        this.f14096a = activity;
        this.f14097b = context;
    }

    public void onClick(View view) {
        BrowserActivity.m17921a(this.f14096a, C4946i.m19505e(this.f14097b), C4961l.other_privacy);
    }
}
