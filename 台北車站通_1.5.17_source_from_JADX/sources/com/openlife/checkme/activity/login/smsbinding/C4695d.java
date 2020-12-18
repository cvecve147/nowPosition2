package com.openlife.checkme.activity.login.smsbinding;

import android.view.View;
import butterknife.p051a.C1152b;

/* renamed from: com.openlife.checkme.activity.login.smsbinding.d */
class C4695d extends C1152b {

    /* renamed from: c */
    final /* synthetic */ SmsBindingFragment f13595c;

    /* renamed from: d */
    final /* synthetic */ SmsBindingFragment_ViewBinding f13596d;

    C4695d(SmsBindingFragment_ViewBinding smsBindingFragment_ViewBinding, SmsBindingFragment smsBindingFragment) {
        this.f13596d = smsBindingFragment_ViewBinding;
        this.f13595c = smsBindingFragment;
    }

    /* renamed from: a */
    public void mo5377a(View view) {
        this.f13595c.onSmsProblem();
    }
}
