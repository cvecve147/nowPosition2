package com.askey.taipeinavi.p058d;

import android.app.AlertDialog;
import android.view.View;

/* renamed from: com.askey.taipeinavi.d.e */
class C1211e implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ AlertDialog f4405a;

    /* renamed from: b */
    final /* synthetic */ View.OnClickListener f4406b;

    C1211e(AlertDialog alertDialog, View.OnClickListener onClickListener) {
        this.f4405a = alertDialog;
        this.f4406b = onClickListener;
    }

    public void onClick(View view) {
        this.f4405a.dismiss();
        this.f4406b.onClick(view);
    }
}
