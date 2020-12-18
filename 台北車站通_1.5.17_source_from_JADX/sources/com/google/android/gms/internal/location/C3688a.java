package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.location.a */
public class C3688a implements IInterface {

    /* renamed from: a */
    private final IBinder f10935a;

    /* renamed from: b */
    private final String f10936b;

    protected C3688a(IBinder iBinder, String str) {
        this.f10935a = iBinder;
        this.f10936b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Xa */
    public final Parcel mo10333Xa() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f10936b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo10334a(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f10935a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f10935a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo10336b(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f10935a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
