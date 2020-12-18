package android.support.p007v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: android.support.v4.media.session.b */
public interface C0387b extends IInterface {

    /* renamed from: android.support.v4.media.session.b$a */
    public static abstract class C0388a extends Binder implements C0387b {

        /* renamed from: android.support.v4.media.session.b$a$a */
        private static class C0389a implements C0387b {

            /* renamed from: a */
            private IBinder f1622a;

            C0389a(IBinder iBinder) {
                this.f1622a = iBinder;
            }

            /* renamed from: a */
            public void mo1685a(C0385a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    this.f1622a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f1622a;
            }
        }

        /* renamed from: a */
        public static C0387b m1905a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0387b)) ? new C0389a(iBinder) : (C0387b) queryLocalInterface;
        }
    }

    /* renamed from: a */
    void mo1685a(C0385a aVar);
}
