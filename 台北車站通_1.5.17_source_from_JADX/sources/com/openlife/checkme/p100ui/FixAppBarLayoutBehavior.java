package com.openlife.checkme.p100ui;

import android.content.Context;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: com.openlife.checkme.ui.FixAppBarLayoutBehavior */
public class FixAppBarLayoutBehavior extends FlingBehavior {
    public FixAppBarLayoutBehavior() {
    }

    public FixAppBarLayoutBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public boolean mo589a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, float f, float f2, boolean z) {
        return super.mo589a(coordinatorLayout, appBarLayout, view, f, f2, z);
    }
}
