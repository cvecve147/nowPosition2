package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.WebSettings;

@TargetApi(16)
/* renamed from: com.google.android.gms.internal.ads.ue */
public class C3517ue extends C3431re {
    /* renamed from: a */
    public final void mo9719a(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    /* renamed from: a */
    public final void mo9720a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    /* renamed from: a */
    public boolean mo9722a(Context context, WebSettings webSettings) {
        super.mo9722a(context, webSettings);
        webSettings.setAllowFileAccessFromFileURLs(false);
        webSettings.setAllowUniversalAccessFromFileURLs(false);
        return true;
    }
}
