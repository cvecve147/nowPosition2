package android.support.design.widget;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: android.support.design.widget.L */
class C0121L implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ TextInputLayout f671a;

    C0121L(TextInputLayout textInputLayout) {
        this.f671a = textInputLayout;
    }

    public void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f671a;
        textInputLayout.mo795a(!textInputLayout.f779O);
        TextInputLayout textInputLayout2 = this.f671a;
        if (textInputLayout2.f795p) {
            textInputLayout2.mo794a(editable.length());
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
