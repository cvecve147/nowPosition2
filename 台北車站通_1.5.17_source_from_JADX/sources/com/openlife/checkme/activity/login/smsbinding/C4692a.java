package com.openlife.checkme.activity.login.smsbinding;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: com.openlife.checkme.activity.login.smsbinding.a */
class C4692a implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ SmsBindingFragment f13591a;

    C4692a(SmsBindingFragment smsBindingFragment) {
        this.f13591a = smsBindingFragment;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f13591a.mo13023a(i3 != 0);
    }
}
