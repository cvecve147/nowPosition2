package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.C2011d;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.dx */
public final class C3048dx extends C2011d<C3133gx> {
    C3048dx(Context context, Looper looper, C2011d.C2012a aVar, C2011d.C2013b bVar) {
        super(context, looper, 166, aVar, bVar, (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final String mo7556A() {
        return "com.google.android.gms.ads.service.HTTP";
    }

    /* renamed from: D */
    public final C3133gx mo7557D() {
        return (C3133gx) super.mo7641x();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ IInterface mo7558a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        return queryLocalInterface instanceof C3133gx ? (C3133gx) queryLocalInterface : new C3161hx(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final String mo7560z() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }
}
