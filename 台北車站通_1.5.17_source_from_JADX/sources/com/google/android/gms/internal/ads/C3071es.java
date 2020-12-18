package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.C2011d;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.es */
public final class C3071es extends C2011d<C3156hs> {
    C3071es(Context context, Looper looper, C2011d.C2012a aVar, C2011d.C2013b bVar) {
        super(context, looper, 123, aVar, bVar, (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final String mo7556A() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    /* renamed from: D */
    public final C3156hs mo7557D() {
        return (C3156hs) super.mo7641x();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ IInterface mo7558a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return queryLocalInterface instanceof C3156hs ? (C3156hs) queryLocalInterface : new C3184is(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final String mo7560z() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }
}
