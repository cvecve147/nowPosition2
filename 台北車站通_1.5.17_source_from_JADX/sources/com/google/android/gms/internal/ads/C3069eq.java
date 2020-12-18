package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.eq */
public final class C3069eq extends C2239Cq {

    /* renamed from: i */
    private final Activity f9116i;

    /* renamed from: j */
    private final View f9117j;

    public C3069eq(C2701Sp sp, String str, String str2, C2921_l _lVar, int i, int i2, View view, Activity activity) {
        super(sp, str, str2, _lVar, i, 62);
        this.f9117j = view;
        this.f9116i = activity;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7939a() {
        if (this.f9117j != null) {
            boolean booleanValue = ((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7956qc)).booleanValue();
            Object[] objArr = (Object[]) this.f6818f.invoke((Object) null, new Object[]{this.f9117j, this.f9116i, Boolean.valueOf(booleanValue)});
            synchronized (this.f6817e) {
                this.f6817e.f8816fa = Long.valueOf(((Long) objArr[0]).longValue());
                this.f6817e.f8818ga = Long.valueOf(((Long) objArr[1]).longValue());
                if (booleanValue) {
                    this.f6817e.f8820ha = (String) objArr[2];
                }
            }
        }
    }
}
