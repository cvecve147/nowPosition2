package com.openlife.checkme.checkme_special.other;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.activity.browser.BrowserActivity;
import com.openlife.checkme.p094d.C4946i;

/* renamed from: com.openlife.checkme.checkme_special.other.c */
class C4928c implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Activity f14093a;

    /* renamed from: b */
    final /* synthetic */ Context f14094b;

    /* renamed from: c */
    final /* synthetic */ SpOtherFragment f14095c;

    C4928c(SpOtherFragment spOtherFragment, Activity activity, Context context) {
        this.f14095c = spOtherFragment;
        this.f14093a = activity;
        this.f14094b = context;
    }

    public void onClick(View view) {
        BrowserActivity.m17921a(this.f14093a, C4946i.m19504d(this.f14094b), C4961l.other_term);
    }
}
