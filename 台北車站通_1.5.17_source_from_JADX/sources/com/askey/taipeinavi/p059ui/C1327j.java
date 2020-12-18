package com.askey.taipeinavi.p059ui;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.askey.taipeinavi.ui.j */
class C1327j implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ SearchView f4643a;

    /* renamed from: b */
    final /* synthetic */ SearchView_ViewBinding f4644b;

    C1327j(SearchView_ViewBinding searchView_ViewBinding, SearchView searchView) {
        this.f4644b = searchView_ViewBinding;
        this.f4643a = searchView;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f4643a.onTouchView(view, motionEvent);
    }
}
