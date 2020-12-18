package p101d.p129g.p131b.p132a.p137e.p138a;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: d.g.b.a.e.a.f */
public final class C5487f extends C5482a implements C5485d {
    C5487f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    /* renamed from: K */
    public final boolean mo14937K() {
        Parcel a = mo14935a(6, mo14934Xa());
        boolean a2 = C5484c.m20985a(a);
        a.recycle();
        return a2;
    }

    public final String getId() {
        Parcel a = mo14935a(1, mo14934Xa());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: h */
    public final boolean mo14939h(boolean z) {
        Parcel Xa = mo14934Xa();
        C5484c.m20984a(Xa, true);
        Parcel a = mo14935a(2, Xa);
        boolean a2 = C5484c.m20985a(a);
        a.recycle();
        return a2;
    }
}
