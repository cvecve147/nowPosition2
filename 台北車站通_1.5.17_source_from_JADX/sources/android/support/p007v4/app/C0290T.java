package android.support.p007v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: android.support.v4.app.T */
public interface C0290T extends IInterface {

    /* renamed from: android.support.v4.app.T$a */
    public static abstract class C0291a extends Binder implements C0290T {

        /* renamed from: android.support.v4.app.T$a$a */
        private static class C0292a implements C0290T {

            /* renamed from: a */
            private IBinder f1242a;

            C0292a(IBinder iBinder) {
                this.f1242a = iBinder;
            }

            /* renamed from: a */
            public void mo1178a(String str) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    this.f1242a.transact(3, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1179a(String str, int i, String str2) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    this.f1242a.transact(2, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1180a(String str, int i, String str2, Notification notification) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1242a.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f1242a;
            }
        }

        /* renamed from: a */
        public static C0290T m1312a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0290T)) ? new C0292a(iBinder) : (C0290T) queryLocalInterface;
        }
    }

    /* renamed from: a */
    void mo1178a(String str);

    /* renamed from: a */
    void mo1179a(String str, int i, String str2);

    /* renamed from: a */
    void mo1180a(String str, int i, String str2, Notification notification);
}
