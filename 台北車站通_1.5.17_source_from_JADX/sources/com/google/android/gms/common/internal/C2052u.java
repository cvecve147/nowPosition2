package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.common.internal.u */
public interface C2052u extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.u$a */
    public static abstract class C2053a extends Binder implements C2052u {

        /* renamed from: com.google.android.gms.common.internal.u$a$a */
        private static class C2054a implements C2052u {

            /* renamed from: a */
            private final IBinder f6516a;

            C2054a(IBinder iBinder) {
                this.f6516a = iBinder;
            }

            /* renamed from: a */
            public final void mo7708a(C2050t tVar, GetServiceRequest getServiceRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(tVar != null ? tVar.asBinder() : null);
                    if (getServiceRequest != null) {
                        obtain.writeInt(1);
                        getServiceRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f6516a.transact(46, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.f6516a;
            }
        }

        /* renamed from: a */
        public static C2052u m9055a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C2052u)) ? new C2054a(iBinder) : (C2052u) queryLocalInterface;
        }
    }

    /* renamed from: a */
    void mo7708a(C2050t tVar, GetServiceRequest getServiceRequest);
}
