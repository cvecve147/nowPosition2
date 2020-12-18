package com.google.android.gms.ads.internal;

import android.view.View;
import com.google.android.gms.internal.ads.C3345od;

/* renamed from: com.google.android.gms.ads.internal.ma */
final class C1764ma implements View.OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ C1806va f5803a;

    /* renamed from: b */
    private final /* synthetic */ C1758ja f5804b;

    C1764ma(C1758ja jaVar, C1806va vaVar) {
        this.f5804b = jaVar;
        this.f5803a = vaVar;
    }

    public final void onClick(View view) {
        this.f5803a.mo7031a();
        C3345od odVar = this.f5804b.f5769b;
        if (odVar != null) {
            odVar.mo9375b();
        }
    }
}
