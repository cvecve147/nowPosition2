package android.support.p011v7.app;

import android.view.View;

/* renamed from: android.support.v7.app.e */
class C0614e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ View f2320a;

    /* renamed from: b */
    final /* synthetic */ View f2321b;

    /* renamed from: c */
    final /* synthetic */ AlertController f2322c;

    C0614e(AlertController alertController, View view, View view2) {
        this.f2322c = alertController;
        this.f2320a = view;
        this.f2321b = view2;
    }

    public void run() {
        AlertController.m2777a(this.f2322c.f2086A, this.f2320a, this.f2321b);
    }
}
