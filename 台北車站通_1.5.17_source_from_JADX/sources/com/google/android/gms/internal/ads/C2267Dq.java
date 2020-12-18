package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Dq */
public class C2267Dq implements IInterface {

    /* renamed from: a */
    private final IBinder f6911a;

    /* renamed from: b */
    private final String f6912b;

    protected C2267Dq(IBinder iBinder, String str) {
        this.f6911a = iBinder;
        this.f6912b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Xa */
    public final Parcel mo8007Xa() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f6912b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo8008a(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f6911a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f6911a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo8010b(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f6911a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
