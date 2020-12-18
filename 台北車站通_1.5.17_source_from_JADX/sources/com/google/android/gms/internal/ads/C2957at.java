package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.C2064k;
import p101d.p129g.p131b.p132a.p134b.C5468d;
import p101d.p129g.p131b.p132a.p134b.C5470f;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.at */
public final class C2957at extends C5470f<C2441Jt> {
    public C2957at() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    /* renamed from: a */
    public final C2357Gt mo9195a(Context context, zzjn zzjn, String str, C2533Mz mz, int i) {
        try {
            IBinder a = ((C2441Jt) mo14930a(context)).mo8380a(C5468d.m20961a(context), zzjn, str, mz, C2064k.GOOGLE_PLAY_SERVICES_VERSION_CODE, i);
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return queryLocalInterface instanceof C2357Gt ? (C2357Gt) queryLocalInterface : new C2413It(a);
        } catch (RemoteException | C5470f.C5471a e) {
            C2227Cf.m9530a("Could not create remote AdManager.", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo8253a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return queryLocalInterface instanceof C2441Jt ? (C2441Jt) queryLocalInterface : new C2469Kt(iBinder);
    }
}
