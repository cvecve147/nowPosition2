package com.openlife.checkme.activity.login.phonebinding;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: com.openlife.checkme.activity.login.phonebinding.a */
class C4684a implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ PhoneBindingFragment f13578a;

    C4684a(PhoneBindingFragment phoneBindingFragment) {
        this.f13578a = phoneBindingFragment;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f13578a.mo13005a(i3 != 0);
    }
}
