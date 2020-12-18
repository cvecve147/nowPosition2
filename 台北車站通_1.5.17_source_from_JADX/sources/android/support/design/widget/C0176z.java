package android.support.design.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.design.widget.CoordinatorLayout;
import android.support.p007v4.view.C0434L;
import android.support.p007v4.view.C0466f;
import android.support.p007v4.view.C0487v;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;
import p013b.p018b.p028h.p035d.C1052a;

/* renamed from: android.support.design.widget.z */
abstract class C0176z extends C0131T<View> {

    /* renamed from: d */
    final Rect f927d = new Rect();

    /* renamed from: e */
    final Rect f928e = new Rect();

    /* renamed from: f */
    private int f929f = 0;

    /* renamed from: g */
    private int f930g;

    public C0176z() {
    }

    public C0176z(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: c */
    private static int m897c(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo927a(View view) {
        if (this.f930g == 0) {
            return 0;
        }
        float b = mo425b(view);
        int i = this.f930g;
        return C1052a.m5544a((int) (b * ((float) i)), 0, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract View mo422a(List<View> list);

    /* renamed from: a */
    public boolean mo407a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View a;
        int i5 = view.getLayoutParams().height;
        if ((i5 != -1 && i5 != -2) || (a = mo422a(coordinatorLayout.mo533b(view))) == null) {
            return false;
        }
        if (!C0487v.m2291g(a) || C0487v.m2291g(view)) {
            View view2 = view;
        } else {
            View view3 = view;
            C0487v.m2280a(view, true);
            if (C0487v.m2291g(view)) {
                view.requestLayout();
                return true;
            }
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size == 0) {
            size = coordinatorLayout.getHeight();
        }
        coordinatorLayout.mo524a(view, i, i2, View.MeasureSpec.makeMeasureSpec((size - a.getMeasuredHeight()) + mo427c(a), i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract float mo425b(View view);

    /* renamed from: b */
    public final void mo928b(int i) {
        this.f930g = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo704b(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2;
        View a = mo422a(coordinatorLayout.mo533b(view));
        if (a != null) {
            CoordinatorLayout.C0107e eVar = (CoordinatorLayout.C0107e) view.getLayoutParams();
            Rect rect = this.f927d;
            rect.set(coordinatorLayout.getPaddingLeft() + eVar.leftMargin, a.getBottom() + eVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - eVar.rightMargin, ((coordinatorLayout.getHeight() + a.getBottom()) - coordinatorLayout.getPaddingBottom()) - eVar.bottomMargin);
            C0434L lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && C0487v.m2291g(coordinatorLayout) && !C0487v.m2291g(view)) {
                rect.left += lastWindowInsets.mo1770c();
                rect.right -= lastWindowInsets.mo1771d();
            }
            Rect rect2 = this.f928e;
            C0466f.m2171a(m897c(eVar.f617c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int a2 = mo927a(a);
            view.layout(rect2.left, rect2.top - a2, rect2.right, rect2.bottom - a2);
            i2 = rect2.top - a.getBottom();
        } else {
            super.mo704b(coordinatorLayout, view, i);
            i2 = 0;
        }
        this.f929f = i2;
    }

    /* renamed from: c */
    public final int mo929c() {
        return this.f930g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo427c(View view) {
        return view.getMeasuredHeight();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo930d() {
        return this.f929f;
    }
}
