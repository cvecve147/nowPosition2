package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;
import com.google.android.gms.location.C3950p;
import com.google.android.gms.location.C3951q;
import com.google.android.gms.location.C3953s;
import com.google.android.gms.location.C3954t;

public final class zzbf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbf> CREATOR = new C3708u();

    /* renamed from: a */
    private int f10965a;

    /* renamed from: b */
    private zzbd f10966b;

    /* renamed from: c */
    private C3953s f10967c;

    /* renamed from: d */
    private PendingIntent f10968d;

    /* renamed from: e */
    private C3950p f10969e;

    /* renamed from: f */
    private C3693f f10970f;

    zzbf(int i, zzbd zzbd, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        this.f10965a = i;
        this.f10966b = zzbd;
        C3693f fVar = null;
        this.f10967c = iBinder == null ? null : C3954t.m15998a(iBinder);
        this.f10968d = pendingIntent;
        this.f10969e = iBinder2 == null ? null : C3951q.m15996a(iBinder2);
        if (!(iBinder3 == null || iBinder3 == null)) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            fVar = queryLocalInterface instanceof C3693f ? (C3693f) queryLocalInterface : new C3695h(iBinder3);
        }
        this.f10970f = fVar;
    }

    /* renamed from: a */
    public static zzbf m14842a(C3950p pVar, C3693f fVar) {
        return new zzbf(2, (zzbd) null, (IBinder) null, (PendingIntent) null, pVar.asBinder(), fVar != null ? fVar.asBinder() : null);
    }

    /* renamed from: a */
    public static zzbf m14843a(C3953s sVar, C3693f fVar) {
        return new zzbf(2, (zzbd) null, sVar.asBinder(), (PendingIntent) null, (IBinder) null, fVar != null ? fVar.asBinder() : null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9030a(parcel, 1, this.f10965a);
        C2049b.m9034a(parcel, 2, (Parcelable) this.f10966b, i, false);
        C3953s sVar = this.f10967c;
        IBinder iBinder = null;
        C2049b.m9033a(parcel, 3, sVar == null ? null : sVar.asBinder(), false);
        C2049b.m9034a(parcel, 4, (Parcelable) this.f10968d, i, false);
        C3950p pVar = this.f10969e;
        C2049b.m9033a(parcel, 5, pVar == null ? null : pVar.asBinder(), false);
        C3693f fVar = this.f10970f;
        if (fVar != null) {
            iBinder = fVar.asBinder();
        }
        C2049b.m9033a(parcel, 6, iBinder, false);
        C2049b.m9026a(parcel, a);
    }
}
