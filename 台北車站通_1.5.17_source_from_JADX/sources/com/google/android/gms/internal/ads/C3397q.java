package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import p101d.p129g.p131b.p132a.p134b.C5468d;
import p101d.p129g.p131b.p132a.p134b.C5470f;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.q */
public final class C3397q extends C5470f<C3511u> {
    public C3397q() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    /* renamed from: a */
    public final C3425r mo9921a(Activity activity) {
        try {
            IBinder r = ((C3511u) mo14930a((Context) activity)).mo10068r(C5468d.m20961a(activity));
            if (r == null) {
                return null;
            }
            IInterface queryLocalInterface = r.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return queryLocalInterface instanceof C3425r ? (C3425r) queryLocalInterface : new C3482t(r);
        } catch (RemoteException e) {
            C2227Cf.m9535c("Could not create remote AdOverlay.", e);
            return null;
        } catch (C5470f.C5471a e2) {
            C2227Cf.m9535c("Could not create remote AdOverlay.", e2);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo8253a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return queryLocalInterface instanceof C3511u ? (C3511u) queryLocalInterface : new C3541v(iBinder);
    }
}
