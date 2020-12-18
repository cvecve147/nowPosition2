package com.askey.taipeinavi.sos;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.askey.taipeinavi.sos.SosContactFragment;

/* renamed from: com.askey.taipeinavi.sos.b */
class C1300b implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C1301c f4573a;

    /* renamed from: b */
    final /* synthetic */ SosContactFragment.C1298a f4574b;

    C1300b(SosContactFragment.C1298a aVar, C1301c cVar) {
        this.f4574b = aVar;
        this.f4573a = cVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        SosContactFragment.this.mo1350a(new Intent("android.intent.action.DIAL", Uri.parse("tel:" + this.f4573a.f4576b)));
    }
}
