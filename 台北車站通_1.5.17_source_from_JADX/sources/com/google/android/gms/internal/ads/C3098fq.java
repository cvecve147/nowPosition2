package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.fq */
public final class C3098fq extends C2239Cq {
    public C3098fq(C2701Sp sp, String str, String str2, C2921_l _lVar, int i, int i2) {
        super(sp, str, str2, _lVar, i, 49);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7939a() {
        this.f6817e.f8798R = 2;
        try {
            int i = 1;
            boolean booleanValue = ((Boolean) this.f6818f.invoke((Object) null, new Object[]{this.f6814b.mo8832a()})).booleanValue();
            C2921_l _lVar = this.f6817e;
            if (!booleanValue) {
                i = 0;
            }
            _lVar.f8798R = Integer.valueOf(i);
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
