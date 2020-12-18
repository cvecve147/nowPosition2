package android.support.p011v7.app;

import android.view.View;
import android.widget.AbsListView;

/* renamed from: android.support.v7.app.f */
class C0615f implements AbsListView.OnScrollListener {

    /* renamed from: a */
    final /* synthetic */ View f2323a;

    /* renamed from: b */
    final /* synthetic */ View f2324b;

    /* renamed from: c */
    final /* synthetic */ AlertController f2325c;

    C0615f(AlertController alertController, View view, View view2) {
        this.f2325c = alertController;
        this.f2323a = view;
        this.f2324b = view2;
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        AlertController.m2777a(absListView, this.f2323a, this.f2324b);
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
