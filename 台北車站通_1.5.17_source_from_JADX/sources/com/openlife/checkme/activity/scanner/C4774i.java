package com.openlife.checkme.activity.scanner;

import android.content.DialogInterface;

/* renamed from: com.openlife.checkme.activity.scanner.i */
class C4774i implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C4775j f13770a;

    C4774i(C4775j jVar) {
        this.f13770a = jVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f13770a.f13771a.getActivity().finish();
    }
}
