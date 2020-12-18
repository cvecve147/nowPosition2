package p287me.tatarka.support.job;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: me.tatarka.support.job.a */
public interface C6807a extends IInterface {

    /* renamed from: me.tatarka.support.job.a$a */
    public static abstract class C6808a extends Binder implements C6807a {
        public C6808a() {
            attachInterface(this, "me.tatarka.support.job.IJobCallback");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            boolean z = false;
            if (i == 1) {
                parcel.enforceInterface("me.tatarka.support.job.IJobCallback");
                int readInt = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo17373c(readInt, z);
            } else if (i == 2) {
                parcel.enforceInterface("me.tatarka.support.job.IJobCallback");
                int readInt2 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo17371a(readInt2, z);
            } else if (i == 3) {
                parcel.enforceInterface("me.tatarka.support.job.IJobCallback");
                int readInt3 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo17372b(readInt3, z);
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("me.tatarka.support.job.IJobCallback");
                return true;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    /* renamed from: a */
    void mo17371a(int i, boolean z);

    /* renamed from: b */
    void mo17372b(int i, boolean z);

    /* renamed from: c */
    void mo17373c(int i, boolean z);
}
