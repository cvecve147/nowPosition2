package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import p101d.p129g.p131b.p132a.p134b.C5470f;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.ou */
public final class C3362ou extends C5470f<C2929_t> {
    public C3362ou() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo8253a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return queryLocalInterface instanceof C2929_t ? (C2929_t) queryLocalInterface : new C2958au(iBinder);
    }
}
