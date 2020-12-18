package com.openlife.checkme.checkme_special.other;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.activity.browser.BrowserActivity;
import com.openlife.checkme.p094d.C4946i;

/* renamed from: com.openlife.checkme.checkme_special.other.a */
class C4926a implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Activity f14088a;

    /* renamed from: b */
    final /* synthetic */ Context f14089b;

    /* renamed from: c */
    final /* synthetic */ SpOtherFragment f14090c;

    C4926a(SpOtherFragment spOtherFragment, Activity activity, Context context) {
        this.f14090c = spOtherFragment;
        this.f14088a = activity;
        this.f14089b = context;
    }

    public void onClick(View view) {
        BrowserActivity.m17921a(this.f14088a, C4946i.m19501a(this.f14089b), C4961l.other_question);
    }
}
