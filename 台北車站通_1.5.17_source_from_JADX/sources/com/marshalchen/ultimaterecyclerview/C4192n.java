package com.marshalchen.ultimaterecyclerview;

import android.view.MotionEvent;
import android.view.ViewGroup;

/* renamed from: com.marshalchen.ultimaterecyclerview.n */
class C4192n implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ViewGroup f12474a;

    /* renamed from: b */
    final /* synthetic */ MotionEvent f12475b;

    /* renamed from: c */
    final /* synthetic */ UltimateRecyclerView f12476c;

    C4192n(UltimateRecyclerView ultimateRecyclerView, ViewGroup viewGroup, MotionEvent motionEvent) {
        this.f12476c = ultimateRecyclerView;
        this.f12474a = viewGroup;
        this.f12475b = motionEvent;
    }

    public void run() {
        this.f12474a.dispatchTouchEvent(this.f12475b);
    }
}
