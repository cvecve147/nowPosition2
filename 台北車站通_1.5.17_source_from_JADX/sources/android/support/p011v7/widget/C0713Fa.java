package android.support.p011v7.widget;

import android.support.p011v7.widget.C0789T;
import android.support.p011v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v7.widget.Fa */
class C0713Fa implements C0789T.C0791b {

    /* renamed from: a */
    final /* synthetic */ RecyclerView f2775a;

    C0713Fa(RecyclerView recyclerView) {
        this.f2775a = recyclerView;
    }

    /* renamed from: a */
    public int mo3326a() {
        return this.f2775a.getChildCount();
    }

    /* renamed from: a */
    public View mo3327a(int i) {
        return this.f2775a.getChildAt(i);
    }

    /* renamed from: a */
    public void mo3328a(View view) {
        RecyclerView.C0778w i = RecyclerView.m3934i(view);
        if (i != null) {
            i.m4334a(this.f2775a);
        }
    }

    /* renamed from: a */
    public void mo3329a(View view, int i) {
        this.f2775a.addView(view, i);
        this.f2775a.mo3640a(view);
    }

    /* renamed from: a */
    public void mo3330a(View view, int i, ViewGroup.LayoutParams layoutParams) {
        RecyclerView.C0778w i2 = RecyclerView.m3934i(view);
        if (i2 != null) {
            if (i2.mo4050q() || i2.mo4056v()) {
                i2.mo4037d();
            } else {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + i2 + this.f2775a.mo3724j());
            }
        }
        this.f2775a.attachViewToParent(view, i, layoutParams);
    }

    /* renamed from: b */
    public int mo3331b(View view) {
        return this.f2775a.indexOfChild(view);
    }

    /* renamed from: b */
    public void mo3332b() {
        int a = mo3326a();
        for (int i = 0; i < a; i++) {
            View a2 = mo3327a(i);
            this.f2775a.mo3657b(a2);
            a2.clearAnimation();
        }
        this.f2775a.removeAllViews();
    }

    /* renamed from: b */
    public void mo3333b(int i) {
        RecyclerView.C0778w i2;
        View a = mo3327a(i);
        if (!(a == null || (i2 = RecyclerView.m3934i(a)) == null)) {
            if (!i2.mo4050q() || i2.mo4056v()) {
                i2.mo4027a(256);
            } else {
                throw new IllegalArgumentException("called detach on an already detached child " + i2 + this.f2775a.mo3724j());
            }
        }
        this.f2775a.detachViewFromParent(i);
    }

    /* renamed from: c */
    public RecyclerView.C0778w mo3334c(View view) {
        return RecyclerView.m3934i(view);
    }

    /* renamed from: c */
    public void mo3335c(int i) {
        View childAt = this.f2775a.getChildAt(i);
        if (childAt != null) {
            this.f2775a.mo3657b(childAt);
            childAt.clearAnimation();
        }
        this.f2775a.removeViewAt(i);
    }

    /* renamed from: d */
    public void mo3336d(View view) {
        RecyclerView.C0778w i = RecyclerView.m3934i(view);
        if (i != null) {
            i.m4338b(this.f2775a);
        }
    }
}
