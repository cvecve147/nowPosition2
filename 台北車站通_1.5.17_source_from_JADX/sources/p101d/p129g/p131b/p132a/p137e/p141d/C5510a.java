package p101d.p129g.p131b.p132a.p137e.p141d;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: d.g.b.a.e.d.a */
public class C5510a implements IInterface {

    /* renamed from: a */
    private final IBinder f15419a;

    /* renamed from: b */
    private final String f15420b;

    protected C5510a(IBinder iBinder, String str) {
        this.f15419a = iBinder;
        this.f15420b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Xa */
    public final Parcel mo14955Xa() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f15420b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo14956a(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f15419a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f15419a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo14958b(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f15419a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
