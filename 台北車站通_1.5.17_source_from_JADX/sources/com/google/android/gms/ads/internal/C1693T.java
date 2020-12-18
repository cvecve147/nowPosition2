package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.gms.ads.internal.T */
final class C1693T implements View.OnTouchListener {

    /* renamed from: a */
    private final /* synthetic */ C1691Q f5554a;

    C1693T(C1691Q q) {
        this.f5554a = q;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f5554a.f5551h == null) {
            return false;
        }
        this.f5554a.f5551h.mo7870a(motionEvent);
        return false;
    }
}
