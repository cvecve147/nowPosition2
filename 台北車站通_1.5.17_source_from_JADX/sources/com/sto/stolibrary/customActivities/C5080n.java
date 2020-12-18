package com.sto.stolibrary.customActivities;

import android.view.View;
import com.sto.stolibrary.customActivities.C5061F;

/* renamed from: com.sto.stolibrary.customActivities.n */
class C5080n implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ FunctionSelectionActivity f14415a;

    C5080n(FunctionSelectionActivity functionSelectionActivity) {
        this.f14415a = functionSelectionActivity;
    }

    public void onClick(View view) {
        C5061F.C5062a a = C5061F.m19898b().mo14132a();
        if (a != null) {
            a.mo5621a(this.f14415a.f14369f, "parking", (String) null);
        }
    }
}
