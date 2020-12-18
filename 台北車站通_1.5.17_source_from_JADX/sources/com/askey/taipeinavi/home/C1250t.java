package com.askey.taipeinavi.home;

import android.content.Context;
import android.content.DialogInterface;
import com.askey.taipeinavi.R;
import p267i.p274b.p283d.C6775k;

/* renamed from: com.askey.taipeinavi.home.t */
class C1250t implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ String f4480a;

    /* renamed from: b */
    final /* synthetic */ C1254x f4481b;

    C1250t(C1254x xVar, String str) {
        this.f4481b = xVar;
        this.f4480a = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (this.f4481b.f4488ca.mo21001a(this.f4480a, z)) {
            this.f4481b.m6202i(false);
        } else {
            C6775k.m25602a((Context) this.f4481b.f4487ba, -1, (int) R.string.dialog_search_nearest_poi_not_found_msg, false, (DialogInterface.OnClickListener) null);
        }
    }
}
