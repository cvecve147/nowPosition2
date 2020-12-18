package com.afollestad.materialdialogs.internal;

import android.support.p011v7.widget.RecyclerView;
import android.view.ViewGroup;

/* renamed from: com.afollestad.materialdialogs.internal.c */
class C1157c extends RecyclerView.C0766n {

    /* renamed from: a */
    final /* synthetic */ ViewGroup f4247a;

    /* renamed from: b */
    final /* synthetic */ boolean f4248b;

    /* renamed from: c */
    final /* synthetic */ boolean f4249c;

    /* renamed from: d */
    final /* synthetic */ MDRootLayout f4250d;

    C1157c(MDRootLayout mDRootLayout, ViewGroup viewGroup, boolean z, boolean z2) {
        this.f4250d = mDRootLayout;
        this.f4247a = viewGroup;
        this.f4248b = z;
        this.f4249c = z2;
    }

    /* renamed from: a */
    public void mo3951a(RecyclerView recyclerView, int i, int i2) {
        super.mo3951a(recyclerView, i, i2);
        MDButton[] a = this.f4250d.f4228f;
        int length = a.length;
        boolean z = false;
        int i3 = 0;
        while (true) {
            if (i3 < length) {
                MDButton mDButton = a[i3];
                if (mDButton != null && mDButton.getVisibility() != 8) {
                    z = true;
                    break;
                }
                i3++;
            } else {
                break;
            }
        }
        this.f4250d.m5861a(this.f4247a, this.f4248b, this.f4249c, z);
        this.f4250d.invalidate();
    }
}
