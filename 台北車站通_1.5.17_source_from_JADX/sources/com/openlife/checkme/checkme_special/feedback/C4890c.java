package com.openlife.checkme.checkme_special.feedback;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import android.widget.EditText;

/* renamed from: com.openlife.checkme.checkme_special.feedback.c */
class C4890c implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a */
    final /* synthetic */ EditText f13989a;

    /* renamed from: b */
    final /* synthetic */ SpFeedBackFragment f13990b;

    C4890c(SpFeedBackFragment spFeedBackFragment, EditText editText) {
        this.f13990b = spFeedBackFragment;
        this.f13989a = editText;
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        this.f13989a.setText(String.format("%d/%02d/%02d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2 + 1), Integer.valueOf(i3)}));
    }
}
