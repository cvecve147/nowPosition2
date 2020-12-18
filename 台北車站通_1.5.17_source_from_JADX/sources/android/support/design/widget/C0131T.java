package android.support.design.widget;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: android.support.design.widget.T */
class C0131T<V extends View> extends CoordinatorLayout.C0104b<V> {

    /* renamed from: a */
    private C0141U f699a;

    /* renamed from: b */
    private int f700b = 0;

    /* renamed from: c */
    private int f701c = 0;

    public C0131T() {
    }

    public C0131T(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public boolean mo401a(int i) {
        C0141U u = this.f699a;
        if (u != null) {
            return u.mo837b(i);
        }
        this.f700b = i;
        return false;
    }

    /* renamed from: a */
    public boolean mo406a(CoordinatorLayout coordinatorLayout, V v, int i) {
        mo704b(coordinatorLayout, v, i);
        if (this.f699a == null) {
            this.f699a = new C0141U(v);
        }
        this.f699a.mo838c();
        int i2 = this.f700b;
        if (i2 != 0) {
            this.f699a.mo837b(i2);
            this.f700b = 0;
        }
        int i3 = this.f701c;
        if (i3 == 0) {
            return true;
        }
        this.f699a.mo835a(i3);
        this.f701c = 0;
        return true;
    }

    /* renamed from: b */
    public int mo409b() {
        C0141U u = this.f699a;
        if (u != null) {
            return u.mo836b();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo704b(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.mo540c((View) v, i);
    }
}
