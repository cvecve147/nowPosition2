package com.marshalchen.ultimaterecyclerview.p083ui;

import android.content.Context;
import android.support.p007v4.widget.SwipeRefreshLayout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* renamed from: com.marshalchen.ultimaterecyclerview.ui.VerticalSwipeRefreshLayout */
public class VerticalSwipeRefreshLayout extends SwipeRefreshLayout {

    /* renamed from: P */
    private int f12504P;

    /* renamed from: Q */
    private float f12505Q;

    public VerticalSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12504P = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f12505Q = MotionEvent.obtain(motionEvent).getX();
        } else if (action == 2 && Math.abs(motionEvent.getX() - this.f12505Q) > ((float) this.f12504P)) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }
}
