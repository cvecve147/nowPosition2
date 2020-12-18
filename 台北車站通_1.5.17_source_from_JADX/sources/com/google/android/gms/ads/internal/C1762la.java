package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.C3345od;

/* renamed from: com.google.android.gms.ads.internal.la */
final class C1762la implements View.OnTouchListener {

    /* renamed from: a */
    private final /* synthetic */ C1806va f5792a;

    /* renamed from: b */
    private final /* synthetic */ C1758ja f5793b;

    C1762la(C1758ja jaVar, C1806va vaVar) {
        this.f5793b = jaVar;
        this.f5792a = vaVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.f5792a.mo7031a();
        C3345od odVar = this.f5793b.f5769b;
        if (odVar == null) {
            return false;
        }
        odVar.mo9375b();
        return false;
    }
}
