package p287me.relex.circleindicator;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar$SnackbarLayout;
import android.support.p007v4.view.C0487v;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;

/* renamed from: me.relex.circleindicator.SnackbarBehavior */
public class SnackbarBehavior extends CoordinatorLayout.C0104b<CircleIndicator> {
    public SnackbarBehavior() {
    }

    public SnackbarBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private float m25732a(CoordinatorLayout coordinatorLayout, CircleIndicator circleIndicator) {
        List<View> b = coordinatorLayout.mo533b((View) circleIndicator);
        int size = b.size();
        float f = 0.0f;
        for (int i = 0; i < size; i++) {
            View view = b.get(i);
            if ((view instanceof Snackbar$SnackbarLayout) && coordinatorLayout.mo531a((View) circleIndicator, view)) {
                f = Math.min(f, C0487v.m2300p(view) - ((float) view.getHeight()));
            }
        }
        return f;
    }

    /* renamed from: a */
    public boolean mo424a(CoordinatorLayout coordinatorLayout, CircleIndicator circleIndicator, View view) {
        return view instanceof Snackbar$SnackbarLayout;
    }

    /* renamed from: b */
    public boolean mo426b(CoordinatorLayout coordinatorLayout, CircleIndicator circleIndicator, View view) {
        circleIndicator.setTranslationY(m25732a(coordinatorLayout, circleIndicator));
        return true;
    }
}
