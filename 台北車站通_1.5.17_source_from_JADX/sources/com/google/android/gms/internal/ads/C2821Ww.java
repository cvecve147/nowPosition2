package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import p101d.p129g.p131b.p132a.p134b.C5470f;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Ww */
public final class C2821Ww extends C5470f<C3104fw> {
    public C2821Ww() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo8253a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return queryLocalInterface instanceof C3104fw ? (C3104fw) queryLocalInterface : new C3132gw(iBinder);
    }
}
