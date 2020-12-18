package p101d.p129g.p131b.p132a.p137e.p138a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: d.g.b.a.e.a.a */
public class C5482a implements IInterface {

    /* renamed from: a */
    private final IBinder f15396a;

    /* renamed from: b */
    private final String f15397b;

    protected C5482a(IBinder iBinder, String str) {
        this.f15396a = iBinder;
        this.f15397b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Xa */
    public final Parcel mo14934Xa() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f15397b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo14935a(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f15396a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f15396a;
    }
}
