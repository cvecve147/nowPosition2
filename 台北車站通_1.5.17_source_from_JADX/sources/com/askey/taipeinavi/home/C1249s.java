package com.askey.taipeinavi.home;

import android.content.Context;
import android.content.DialogInterface;
import com.askey.taipeinavi.R;
import java.util.ArrayList;
import java.util.List;
import p267i.p274b.p283d.C6775k;

/* renamed from: com.askey.taipeinavi.home.s */
class C1249s implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ArrayList f4478a;

    /* renamed from: b */
    final /* synthetic */ C1254x f4479b;

    C1249s(C1254x xVar, ArrayList arrayList) {
        this.f4479b = xVar;
        this.f4478a = arrayList;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (this.f4479b.f4488ca.mo21003a((List) this.f4478a, z)) {
            this.f4479b.m6202i(false);
        } else {
            C6775k.m25602a((Context) this.f4479b.f4487ba, -1, (int) R.string.dialog_search_nearest_poi_not_found_msg, false, (DialogInterface.OnClickListener) null);
        }
    }
}
