package com.google.firebase.iid;

import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import p101d.p129g.p131b.p132a.p137e.p139b.C5491d;
import p101d.p129g.p131b.p132a.p137e.p139b.C5492e;

public class zzi implements Parcelable {
    public static final Parcelable.Creator<zzi> CREATOR = new C4095z();

    /* renamed from: a */
    private Messenger f12142a;

    /* renamed from: b */
    private C5491d f12143b;

    /* renamed from: com.google.firebase.iid.zzi$a */
    public static final class C4096a extends ClassLoader {
        /* access modifiers changed from: protected */
        public final Class<?> loadClass(String str, boolean z) {
            if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
                return super.loadClass(str, z);
            }
            if (!FirebaseInstanceId.m16251h()) {
                return zzi.class;
            }
            Log.d("FirebaseInstanceId", "Using renamed FirebaseIidMessengerCompat class");
            return zzi.class;
        }
    }

    public zzi(IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f12142a = new Messenger(iBinder);
        } else {
            this.f12143b = C5492e.m20995a(iBinder);
        }
    }

    /* renamed from: a */
    private final IBinder m16361a() {
        Messenger messenger = this.f12142a;
        return messenger != null ? messenger.getBinder() : this.f12143b.asBinder();
    }

    /* renamed from: a */
    public final void mo11539a(Message message) {
        Messenger messenger = this.f12142a;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.f12143b.mo14943a(message);
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return m16361a().equals(((zzi) obj).m16361a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return m16361a().hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.f12142a;
        parcel.writeStrongBinder(messenger != null ? messenger.getBinder() : this.f12143b.asBinder());
    }
}
