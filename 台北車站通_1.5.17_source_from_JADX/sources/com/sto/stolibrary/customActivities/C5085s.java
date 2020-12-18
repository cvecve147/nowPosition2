package com.sto.stolibrary.customActivities;

import android.view.View;
import com.sto.stolibrary.customActivities.C5061F;

/* renamed from: com.sto.stolibrary.customActivities.s */
class C5085s implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ HelpPopActivity f14420a;

    C5085s(HelpPopActivity helpPopActivity) {
        this.f14420a = helpPopActivity;
    }

    public void onClick(View view) {
        this.f14420a.f14380g.mo14137a();
        this.f14420a.finish();
        C5061F.C5062a a = C5061F.m19898b().mo14132a();
        if (a != null) {
            a.mo5623c(true);
        }
    }
}
