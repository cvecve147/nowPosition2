package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.C2064k;
import p101d.p129g.p131b.p132a.p134b.C5468d;
import p101d.p129g.p131b.p132a.p134b.C5470f;

@C2478La
/* renamed from: com.google.android.gms.internal.ads._s */
public final class C2928_s extends C5470f<C2299Et> {
    public C2928_s() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    /* renamed from: a */
    public final C2213Bt mo9173a(Context context, String str, C2533Mz mz) {
        try {
            IBinder a = ((C2299Et) mo14930a(context)).mo8054a(C5468d.m20961a(context), str, mz, C2064k.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof C2213Bt ? (C2213Bt) queryLocalInterface : new C2270Dt(a);
        } catch (RemoteException | C5470f.C5471a e) {
            C2227Cf.m9535c("Could not create remote builder for AdLoader.", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo8253a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return queryLocalInterface instanceof C2299Et ? (C2299Et) queryLocalInterface : new C2327Ft(iBinder);
    }
}
