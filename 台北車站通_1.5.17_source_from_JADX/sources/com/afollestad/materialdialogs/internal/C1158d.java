package com.afollestad.materialdialogs.internal;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;

/* renamed from: com.afollestad.materialdialogs.internal.d */
class C1158d implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a */
    final /* synthetic */ ViewGroup f4251a;

    /* renamed from: b */
    final /* synthetic */ boolean f4252b;

    /* renamed from: c */
    final /* synthetic */ boolean f4253c;

    /* renamed from: d */
    final /* synthetic */ MDRootLayout f4254d;

    C1158d(MDRootLayout mDRootLayout, ViewGroup viewGroup, boolean z, boolean z2) {
        this.f4254d = mDRootLayout;
        this.f4251a = viewGroup;
        this.f4252b = z;
        this.f4253c = z2;
    }

    public void onScrollChanged() {
        MDButton[] a = this.f4254d.f4228f;
        int length = a.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < length) {
                MDButton mDButton = a[i];
                if (mDButton != null && mDButton.getVisibility() != 8) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        ViewGroup viewGroup = this.f4251a;
        if (viewGroup instanceof WebView) {
            this.f4254d.m5862a((WebView) viewGroup, this.f4252b, this.f4253c, z);
        } else {
            this.f4254d.m5861a(viewGroup, this.f4252b, this.f4253c, z);
        }
        this.f4254d.invalidate();
    }
}
