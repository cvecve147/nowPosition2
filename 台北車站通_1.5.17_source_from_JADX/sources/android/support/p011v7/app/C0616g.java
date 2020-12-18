package android.support.p011v7.app;

import android.view.View;

/* renamed from: android.support.v7.app.g */
class C0616g implements Runnable {

    /* renamed from: a */
    final /* synthetic */ View f2326a;

    /* renamed from: b */
    final /* synthetic */ View f2327b;

    /* renamed from: c */
    final /* synthetic */ AlertController f2328c;

    C0616g(AlertController alertController, View view, View view2) {
        this.f2328c = alertController;
        this.f2326a = view;
        this.f2327b = view2;
    }

    public void run() {
        AlertController.m2777a(this.f2328c.f2111g, this.f2326a, this.f2327b);
    }
}
