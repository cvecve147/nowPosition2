package p101d.p129g.p131b.p132a.p137e.p142e;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: d.g.b.a.e.e.a */
public class C5519a implements IInterface {

    /* renamed from: a */
    private final IBinder f15422a;

    /* renamed from: b */
    private final String f15423b;

    protected C5519a(IBinder iBinder, String str) {
        this.f15422a = iBinder;
        this.f15423b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Xa */
    public Parcel mo14964Xa() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f15423b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Parcel mo14965a(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f15422a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f15422a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo14967b(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f15422a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
