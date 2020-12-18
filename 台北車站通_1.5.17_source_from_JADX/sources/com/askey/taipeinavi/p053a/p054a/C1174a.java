package com.askey.taipeinavi.p053a.p054a;

import android.app.Activity;
import com.askey.taipeinavi.R;
import p267i.p274b.p275a.p276a.C6694a;
import p267i.p274b.p275a.p276a.C6695b;

/* renamed from: com.askey.taipeinavi.a.a.a */
class C1174a extends C6694a {

    /* renamed from: j */
    final String f4346j = "success";

    /* renamed from: k */
    final String f4347k = "error";

    public C1174a(Activity activity, C6695b bVar, int i, int i2) {
        super(activity, bVar, i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo5465a(int i) {
        if (i != 401) {
            return false;
        }
        this.f18586f = mo17146b();
        this.f18584d = String.valueOf(210105);
        this.f18585e = this.f18581a.getResources().getString(R.string.dialog_token_expired_msg);
        mo17144a();
        return true;
    }
}
