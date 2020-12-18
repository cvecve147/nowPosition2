package com.openlife.checkme.checkme_special.other;

import android.app.Activity;
import android.view.View;
import com.openlife.checkme.activity.guide.GuideActivity;

/* renamed from: com.openlife.checkme.checkme_special.other.b */
class C4927b implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Activity f14091a;

    /* renamed from: b */
    final /* synthetic */ SpOtherFragment f14092b;

    C4927b(SpOtherFragment spOtherFragment, Activity activity) {
        this.f14092b = spOtherFragment;
        this.f14091a = activity;
    }

    public void onClick(View view) {
        GuideActivity.m18193a(this.f14091a);
    }
}
