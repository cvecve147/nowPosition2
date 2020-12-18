package com.google.android.gms.internal.vision;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.vision.a */
public class C3924a implements IInterface {

    /* renamed from: a */
    private final IBinder f11793a;

    /* renamed from: b */
    private final String f11794b;

    protected C3924a(IBinder iBinder, String str) {
        this.f11793a = iBinder;
        this.f11794b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Xa */
    public final Parcel mo11114Xa() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f11794b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo11115a(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f11793a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f11793a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo11117b(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f11793a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
