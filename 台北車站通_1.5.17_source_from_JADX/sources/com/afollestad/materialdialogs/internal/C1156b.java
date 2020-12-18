package com.afollestad.materialdialogs.internal;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;

/* renamed from: com.afollestad.materialdialogs.internal.b */
class C1156b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final /* synthetic */ View f4243a;

    /* renamed from: b */
    final /* synthetic */ boolean f4244b;

    /* renamed from: c */
    final /* synthetic */ boolean f4245c;

    /* renamed from: d */
    final /* synthetic */ MDRootLayout f4246d;

    C1156b(MDRootLayout mDRootLayout, View view, boolean z, boolean z2) {
        this.f4246d = mDRootLayout;
        this.f4243a = view;
        this.f4244b = z;
        this.f4245c = z2;
    }

    public boolean onPreDraw() {
        if (this.f4243a.getMeasuredHeight() == 0) {
            return true;
        }
        if (!MDRootLayout.m5875b((WebView) this.f4243a)) {
            if (this.f4244b) {
                boolean unused = this.f4246d.f4226d = false;
            }
            if (this.f4245c) {
                boolean unused2 = this.f4246d.f4227e = false;
            }
        } else {
            this.f4246d.m5860a((ViewGroup) this.f4243a, this.f4244b, this.f4245c);
        }
        this.f4243a.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
