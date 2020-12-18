package p013b.p018b.p021c;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* renamed from: b.b.c.o */
public interface C0951o extends IInterface {

    /* renamed from: b.b.c.o$a */
    public static abstract class C0952a extends Binder implements C0951o {

        /* renamed from: b.b.c.o$a$a */
        private static class C0953a implements C0951o {

            /* renamed from: a */
            private IBinder f3777a;

            C0953a(IBinder iBinder) {
                this.f3777a = iBinder;
            }

            /* renamed from: a */
            public boolean mo4847a(long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeLong(j);
                    boolean z = false;
                    this.f3777a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public boolean mo4848a(C0949n nVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongBinder(nVar != null ? nVar.asBinder() : null);
                    boolean z = false;
                    this.f3777a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public boolean mo4849a(C0949n nVar, Uri uri, Bundle bundle, List<Bundle> list) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongBinder(nVar != null ? nVar.asBinder() : null);
                    boolean z = true;
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeTypedList(list);
                    this.f3777a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f3777a;
            }
        }

        /* renamed from: a */
        public static C0951o m5256a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0951o)) ? new C0953a(iBinder) : (C0951o) queryLocalInterface;
        }
    }

    /* renamed from: a */
    boolean mo4847a(long j);

    /* renamed from: a */
    boolean mo4848a(C0949n nVar);

    /* renamed from: a */
    boolean mo4849a(C0949n nVar, Uri uri, Bundle bundle, List<Bundle> list);
}
