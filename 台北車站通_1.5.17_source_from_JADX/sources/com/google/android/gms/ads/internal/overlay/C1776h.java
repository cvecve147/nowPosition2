package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.C2478La;
import com.google.android.gms.internal.ads.C3520uh;

@C2478La
/* renamed from: com.google.android.gms.ads.internal.overlay.h */
public final class C1776h {

    /* renamed from: a */
    public final int f5852a;

    /* renamed from: b */
    public final ViewGroup.LayoutParams f5853b;

    /* renamed from: c */
    public final ViewGroup f5854c;

    /* renamed from: d */
    public final Context f5855d;

    public C1776h(C3520uh uhVar) {
        this.f5853b = uhVar.getLayoutParams();
        ViewParent parent = uhVar.getParent();
        this.f5855d = uhVar.mo8161db();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new C1774f("Could not get the parent of the WebView for an overlay.");
        }
        this.f5854c = (ViewGroup) parent;
        this.f5852a = this.f5854c.indexOfChild(uhVar.getView());
        this.f5854c.removeView(uhVar.getView());
        uhVar.mo8186o(true);
    }
}
