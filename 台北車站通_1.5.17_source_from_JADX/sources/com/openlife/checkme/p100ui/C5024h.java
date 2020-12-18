package com.openlife.checkme.p100ui;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: com.openlife.checkme.ui.h */
class C5024h implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ ListDialog f14288a;

    C5024h(ListDialog listDialog) {
        this.f14288a = listDialog;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (this.f14288a.f14227c != null) {
            this.f14288a.f14227c.mo13416a(i, this.f14288a.f14226b[i]);
        }
        this.f14288a.dismiss();
    }
}
