package com.sto.stolibrary.customActivities;

import android.view.ViewTreeObserver;
import p101d.p191i.p192a.C6005c;

/* renamed from: com.sto.stolibrary.customActivities.r */
class C5084r implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final /* synthetic */ FunctionSelectionActivity f14419a;

    C5084r(FunctionSelectionActivity functionSelectionActivity) {
        this.f14419a = functionSelectionActivity;
    }

    public boolean onPreDraw() {
        int measuredWidth = this.f14419a.findViewById(C6005c.func1).getMeasuredWidth();
        this.f14419a.findViewById(C6005c.func1).getLayoutParams().height = measuredWidth;
        this.f14419a.findViewById(C6005c.func2).getLayoutParams().height = measuredWidth;
        this.f14419a.findViewById(C6005c.func3).getLayoutParams().height = measuredWidth;
        this.f14419a.findViewById(C6005c.func4).getLayoutParams().height = measuredWidth;
        return true;
    }
}
