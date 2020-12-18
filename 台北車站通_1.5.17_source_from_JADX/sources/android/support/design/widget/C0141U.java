package android.support.design.widget;

import android.support.p007v4.view.C0487v;
import android.view.View;

/* renamed from: android.support.design.widget.U */
class C0141U {

    /* renamed from: a */
    private final View f809a;

    /* renamed from: b */
    private int f810b;

    /* renamed from: c */
    private int f811c;

    /* renamed from: d */
    private int f812d;

    /* renamed from: e */
    private int f813e;

    public C0141U(View view) {
        this.f809a = view;
    }

    /* renamed from: d */
    private void m770d() {
        View view = this.f809a;
        C0487v.m2283b(view, this.f812d - (view.getTop() - this.f810b));
        View view2 = this.f809a;
        C0487v.m2267a(view2, this.f813e - (view2.getLeft() - this.f811c));
    }

    /* renamed from: a */
    public int mo834a() {
        return this.f810b;
    }

    /* renamed from: a */
    public boolean mo835a(int i) {
        if (this.f813e == i) {
            return false;
        }
        this.f813e = i;
        m770d();
        return true;
    }

    /* renamed from: b */
    public int mo836b() {
        return this.f812d;
    }

    /* renamed from: b */
    public boolean mo837b(int i) {
        if (this.f812d == i) {
            return false;
        }
        this.f812d = i;
        m770d();
        return true;
    }

    /* renamed from: c */
    public void mo838c() {
        this.f810b = this.f809a.getTop();
        this.f811c = this.f809a.getLeft();
        m770d();
    }
}
