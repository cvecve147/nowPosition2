package com.askey.taipeinavi.p059ui;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: com.askey.taipeinavi.ui.i */
class C1326i implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ SearchView f4641a;

    /* renamed from: b */
    final /* synthetic */ SearchView_ViewBinding f4642b;

    C1326i(SearchView_ViewBinding searchView_ViewBinding, SearchView searchView) {
        this.f4642b = searchView_ViewBinding;
        this.f4641a = searchView;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f4641a.onSearchTyping(charSequence);
    }
}
