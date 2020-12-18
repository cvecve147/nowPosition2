package p101d.p129g.p131b.p132a.p137e.p141d;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: d.g.b.a.e.d.i */
public final class C5518i extends C5510a implements C5516g {
    C5518i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }

    /* renamed from: b */
    public final boolean mo14962b(C5516g gVar) {
        Parcel Xa = mo14955Xa();
        C5512c.m21018a(Xa, (IInterface) gVar);
        Parcel a = mo14956a(16, Xa);
        boolean a2 = C5512c.m21021a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: la */
    public final int mo14963la() {
        Parcel a = mo14956a(17, mo14955Xa());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
