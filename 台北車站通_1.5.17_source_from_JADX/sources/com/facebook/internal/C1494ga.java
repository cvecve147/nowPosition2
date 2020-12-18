package com.facebook.internal;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.internal.ga */
class C1494ga implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ C1496ha f5147a;

    C1494ga(C1496ha haVar) {
        this.f5147a = haVar;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (view.hasFocus()) {
            return false;
        }
        view.requestFocus();
        return false;
    }
}
