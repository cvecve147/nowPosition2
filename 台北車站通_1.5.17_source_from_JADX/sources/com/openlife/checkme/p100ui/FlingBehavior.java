package com.openlife.checkme.p100ui;

import android.content.Context;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.p011v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: com.openlife.checkme.ui.FlingBehavior */
public class FlingBehavior extends AppBarLayout.Behavior {

    /* renamed from: r */
    private boolean f14215r;

    public FlingBehavior() {
    }

    public FlingBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo437a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr) {
        super.mo437a(coordinatorLayout, appBarLayout, view, i, i2, iArr);
        this.f14215r = i2 > 0;
    }

    /* renamed from: a */
    public boolean mo589a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, float f, float f2, boolean z) {
        if ((f2 > 0.0f && !this.f14215r) || (f2 < 0.0f && this.f14215r)) {
            f2 *= -1.0f;
        }
        float f3 = f2;
        if ((view instanceof RecyclerView) && f3 < 0.0f) {
            RecyclerView recyclerView = (RecyclerView) view;
            z = false;
            if (recyclerView.mo3688f(recyclerView.getChildAt(0)) > 3) {
                z = true;
            }
        }
        return super.mo589a(coordinatorLayout, appBarLayout, view, f, f3, z);
    }
}
