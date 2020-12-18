package com.openlife.checkme.activity.scanner;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.openlife.checkme.p093c.C4883m;
import java.util.Calendar;

/* renamed from: com.openlife.checkme.activity.scanner.g */
class C4772g implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a */
    final /* synthetic */ ScannerFragment f13768a;

    C4772g(ScannerFragment scannerFragment) {
        this.f13768a = scannerFragment;
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        Calendar instance = Calendar.getInstance();
        instance.set(1, i - 1911);
        instance.set(2, i2);
        instance.set(5, i3);
        this.f13768a.dateInput.setText(C4883m.m19224a(C4883m.m19234b(), instance.getTime()));
    }
}
