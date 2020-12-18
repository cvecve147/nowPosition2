package com.sto.stolibrary.customActivities;

import android.view.View;
import p101d.p191i.p192a.C6005c;

/* renamed from: com.sto.stolibrary.customActivities.C */
class C5055C implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ SearchingActivity f14345a;

    C5055C(SearchingActivity searchingActivity) {
        this.f14345a = searchingActivity;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int measuredWidth = this.f14345a.findViewById(C6005c.serarching_container_lot).getMeasuredWidth();
        this.f14345a.findViewById(C6005c.serarching_container_lot).getLayoutParams().height = measuredWidth;
        this.f14345a.findViewById(C6005c.serarching_container_licence).getLayoutParams().height = measuredWidth;
        this.f14345a.findViewById(C6005c.serarching_container_licence).setVisibility(8);
        this.f14345a.findViewById(C6005c.serarching_container_lot).setVisibility(8);
        this.f14345a.findViewById(C6005c.serarching_container_licence).setVisibility(0);
        this.f14345a.findViewById(C6005c.serarching_container_lot).setVisibility(0);
        this.f14345a.findViewById(C6005c.activity_container).removeOnLayoutChangeListener(this);
    }
}
