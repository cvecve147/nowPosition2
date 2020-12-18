package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.Fc */
public class C3737Fc implements IInterface {

    /* renamed from: a */
    private final IBinder f11107a;

    /* renamed from: b */
    private final String f11108b;

    protected C3737Fc(IBinder iBinder, String str) {
        this.f11107a = iBinder;
        this.f11108b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Xa */
    public final Parcel mo10462Xa() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f11108b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo10463a(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f11107a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f11107a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo10465b(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f11107a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
