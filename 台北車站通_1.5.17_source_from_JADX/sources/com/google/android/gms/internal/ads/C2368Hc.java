package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import p101d.p129g.p131b.p132a.p134b.C5470f;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Hc */
public final class C2368Hc extends C5470f<C2196Bc> {
    public C2368Hc() {
        super("com.google.android.gms.ads.reward.RewardedVideoAdCreatorImpl");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo8253a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
        return queryLocalInterface instanceof C2196Bc ? (C2196Bc) queryLocalInterface : new C2224Cc(iBinder);
    }
}
