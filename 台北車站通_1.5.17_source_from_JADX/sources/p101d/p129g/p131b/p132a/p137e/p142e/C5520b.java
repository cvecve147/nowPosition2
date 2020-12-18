package p101d.p129g.p131b.p132a.p137e.p142e;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: d.g.b.a.e.e.b */
public class C5520b extends Binder implements IInterface {
    protected C5520b(String str) {
        attachInterface(this, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo7706a(int i, Parcel parcel, Parcel parcel2, int i2) {
        return false;
    }

    public IBinder asBinder() {
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo14969b(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i > 16777215) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        parcel.enforceInterface(getInterfaceDescriptor());
        return false;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (mo14969b(i, parcel, parcel2, i2)) {
            return true;
        }
        return mo7706a(i, parcel, parcel2, i2);
    }
}
