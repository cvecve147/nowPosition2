package android.support.p007v4.p008os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: android.support.v4.os.b */
public interface C0413b extends IInterface {

    /* renamed from: android.support.v4.os.b$a */
    public static abstract class C0414a extends Binder implements C0413b {

        /* renamed from: android.support.v4.os.b$a$a */
        private static class C0415a implements C0413b {

            /* renamed from: a */
            private IBinder f1641a;

            C0415a(IBinder iBinder) {
                this.f1641a = iBinder;
            }

            public IBinder asBinder() {
                return this.f1641a;
            }
        }

        public C0414a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        /* renamed from: a */
        public static C0413b m1970a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0413b)) ? new C0415a(iBinder) : (C0413b) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
                mo1728a(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo1728a(int i, Bundle bundle);
}
