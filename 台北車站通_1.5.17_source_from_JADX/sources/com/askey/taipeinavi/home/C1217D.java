package com.askey.taipeinavi.home;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;
import com.askey.taipeinavi.R;
import com.askey.taipeinavi.home.HomeFragment;
import p101d.p206l.p207a.C6058d;
import p208e.p221b.p227d.C6242d;
import p267i.p274b.p283d.C6775k;

/* renamed from: com.askey.taipeinavi.home.D */
class C1217D implements C6242d<Boolean> {

    /* renamed from: a */
    final /* synthetic */ C1218E f4410a;

    C1217D(C1218E e) {
        this.f4410a = e;
    }

    /* renamed from: a */
    public void accept(Boolean bool) {
        if (bool.booleanValue()) {
            C6058d.m22968a((Activity) HomeFragment.this.f4380a).mo16019a((C6058d.C6059a) new HomeFragment.C1228c(HomeFragment.this, (C1214A) null));
            C6775k.m25604a(HomeFragment.this.mo1396i(), (View) null, (int) R.string.txt_gift_prepare, (int) R.string.btxt_gift_tutorial, (int) R.string.txt_ok, (DialogInterface.OnClickListener) new C1215B(this), (DialogInterface.OnClickListener) new C1216C(this));
        }
    }
}
