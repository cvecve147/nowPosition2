package p101d.p129g.p131b.p132a.p137e.p139b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: d.g.b.a.e.b.a */
public class C5488a implements IInterface {

    /* renamed from: a */
    private final IBinder f15399a;

    /* renamed from: b */
    private final String f15400b;

    protected C5488a(IBinder iBinder, String str) {
        this.f15399a = iBinder;
        this.f15400b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Xa */
    public final Parcel mo14940Xa() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f15400b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14941a(int i, Parcel parcel) {
        try {
            this.f15399a.transact(1, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f15399a;
    }
}
