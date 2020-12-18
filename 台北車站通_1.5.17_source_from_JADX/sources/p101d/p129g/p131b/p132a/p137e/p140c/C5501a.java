package p101d.p129g.p131b.p132a.p137e.p140c;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: d.g.b.a.e.c.a */
public class C5501a implements IInterface {

    /* renamed from: a */
    private final IBinder f15409a;

    /* renamed from: b */
    private final String f15410b;

    protected C5501a(IBinder iBinder, String str) {
        this.f15409a = iBinder;
        this.f15410b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Xa */
    public final Parcel mo14948Xa() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f15410b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14949a(int i, Parcel parcel) {
        try {
            this.f15409a.transact(1, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f15409a;
    }
}
