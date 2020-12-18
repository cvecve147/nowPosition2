package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.C2011d;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.ib */
public final class C3167ib extends C2011d<C3343ob> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3167ib(Context context, Looper looper, C2011d.C2012a aVar, C2011d.C2013b bVar) {
        super(context.getApplicationContext() != null ? context.getApplicationContext() : context, looper, 8, aVar, bVar, (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final String mo7556A() {
        return "com.google.android.gms.ads.service.START";
    }

    /* renamed from: D */
    public final C3343ob mo7557D() {
        return (C3343ob) super.mo7641x();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ IInterface mo7558a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return queryLocalInterface instanceof C3343ob ? (C3343ob) queryLocalInterface : new C3400qb(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final String mo7560z() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }
}
