package com.openlife.checkme.p100ui;

import android.view.View;

/* renamed from: com.openlife.checkme.ui.q */
class C5033q implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ int f14300a;

    /* renamed from: b */
    final /* synthetic */ C5034r f14301b;

    C5033q(C5034r rVar, int i) {
        this.f14301b = rVar;
        this.f14300a = i;
    }

    public void onClick(View view) {
        if (this.f14301b.f14304e != null) {
            this.f14301b.f14304e.mo14085a(this.f14301b.f14303d.get(this.f14300a).getUrl());
        }
    }
}
