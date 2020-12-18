package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.C2011d;

/* renamed from: com.google.android.gms.internal.ads.Qi */
public final class C2636Qi extends C2011d<C2722Ti> {
    public C2636Qi(Context context, Looper looper, C2011d.C2012a aVar, C2011d.C2013b bVar) {
        super(context, looper, 116, aVar, bVar, (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final String mo7556A() {
        return "com.google.android.gms.gass.START";
    }

    /* renamed from: D */
    public final C2722Ti mo7557D() {
        return (C2722Ti) super.mo7641x();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ IInterface mo7558a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return queryLocalInterface instanceof C2722Ti ? (C2722Ti) queryLocalInterface : new C2751Ui(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final String mo7560z() {
        return "com.google.android.gms.gass.internal.IGassService";
    }
}
