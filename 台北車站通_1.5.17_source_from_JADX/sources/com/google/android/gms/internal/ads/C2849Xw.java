package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import p101d.p129g.p131b.p132a.p134b.C5470f;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Xw */
public final class C2849Xw extends C5470f<C3222jw> {
    public C2849Xw() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo8253a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return queryLocalInterface instanceof C3222jw ? (C3222jw) queryLocalInterface : new C3250kw(iBinder);
    }
}
