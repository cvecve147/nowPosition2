package com.marshalchen.ultimaterecyclerview.uiUtils;

import android.support.p011v7.widget.C0687Aa;
import android.support.p011v7.widget.RecyclerView;
import android.view.View;

/* renamed from: com.marshalchen.ultimaterecyclerview.uiUtils.a */
public class C4204a {

    /* renamed from: a */
    final RecyclerView f12534a;

    /* renamed from: b */
    final RecyclerView.C0759i f12535b;

    C4204a(RecyclerView recyclerView) {
        this.f12534a = recyclerView;
        this.f12535b = recyclerView.getLayoutManager();
    }

    /* renamed from: a */
    private View m16759a(int i, int i2, boolean z, boolean z2) {
        C0687Aa b = this.f12535b.mo3513b() ? C0687Aa.m3427b(this.f12535b) : C0687Aa.m3425a(this.f12535b);
        int f = b.mo3084f();
        int b2 = b.mo3076b();
        int i3 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View c = this.f12535b.mo3890c(i);
            int d = b.mo3081d(c);
            int a = b.mo3074a(c);
            if (d < b2 && a > f) {
                if (!z) {
                    return c;
                }
                if (d >= f && a <= b2) {
                    return c;
                }
                if (z2 && view == null) {
                    view = c;
                }
            }
            i += i3;
        }
        return view;
    }

    /* renamed from: a */
    public static C4204a m16760a(RecyclerView recyclerView) {
        if (recyclerView != null) {
            return new C4204a(recyclerView);
        }
        throw new NullPointerException("Recycler View is null");
    }

    /* renamed from: a */
    public int mo11930a() {
        View a = m16759a(0, this.f12535b.mo3903e(), false, true);
        if (a == null) {
            return -1;
        }
        return this.f12534a.mo3688f(a);
    }

    /* renamed from: b */
    public int mo11931b() {
        View a = m16759a(this.f12535b.mo3903e() - 1, -1, false, true);
        if (a == null) {
            return -1;
        }
        return this.f12534a.mo3688f(a);
    }
}
