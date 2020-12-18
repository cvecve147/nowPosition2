package com.sto.stolibrary.customActivities;

import android.view.View;

/* renamed from: com.sto.stolibrary.customActivities.t */
class C5086t implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ HelpPopActivity f14421a;

    C5086t(HelpPopActivity helpPopActivity) {
        this.f14421a = helpPopActivity;
    }

    public void onClick(View view) {
        HelpPopActivity helpPopActivity = this.f14421a;
        helpPopActivity.m19915a(helpPopActivity.f14375b, this.f14421a.f14378e[0], this.f14421a.f14378e[1], this.f14421a.f14376c);
        this.f14421a.f14380g.mo14137a();
        this.f14421a.finish();
    }
}
