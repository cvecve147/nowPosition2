package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.C2011d;

/* renamed from: com.google.android.gms.internal.measurement.V */
public final class C3797V extends C2011d<C3766N> {
    public C3797V(Context context, Looper looper, C2011d.C2012a aVar, C2011d.C2013b bVar) {
        super(context, looper, 93, aVar, bVar, (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final String mo7556A() {
        return "com.google.android.gms.measurement.START";
    }

    /* renamed from: a */
    public final /* synthetic */ IInterface mo7558a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof C3766N ? (C3766N) queryLocalInterface : new C3774P(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final String mo7560z() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }
}
