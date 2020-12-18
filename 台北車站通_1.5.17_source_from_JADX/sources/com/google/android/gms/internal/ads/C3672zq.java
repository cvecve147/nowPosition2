package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.zq */
public final class C3672zq extends C2239Cq {

    /* renamed from: i */
    private final View f10691i;

    public C3672zq(C2701Sp sp, String str, String str2, C2921_l _lVar, int i, int i2, View view) {
        super(sp, str, str2, _lVar, i, 57);
        this.f10691i = view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7939a() {
        if (this.f10691i != null) {
            DisplayMetrics displayMetrics = this.f6814b.mo8832a().getResources().getDisplayMetrics();
            C2954aq aqVar = new C2954aq((String) this.f6818f.invoke((Object) null, new Object[]{this.f10691i, displayMetrics}));
            C2922_m _mVar = new C2922_m();
            _mVar.f8852e = aqVar.f8917b;
            _mVar.f8853f = aqVar.f8918c;
            _mVar.f8854g = aqVar.f8919d;
            this.f6817e.f8807aa = _mVar;
        }
    }
}
