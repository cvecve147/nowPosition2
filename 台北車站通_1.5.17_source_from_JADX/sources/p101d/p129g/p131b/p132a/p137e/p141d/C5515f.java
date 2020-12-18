package p101d.p129g.p131b.p132a.p137e.p141d;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p101d.p129g.p131b.p132a.p134b.C5464b;

/* renamed from: d.g.b.a.e.d.f */
public final class C5515f extends C5510a implements C5513d {
    C5515f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    /* renamed from: a */
    public final C5464b mo14961a(Bitmap bitmap) {
        Parcel Xa = mo14955Xa();
        C5512c.m21019a(Xa, (Parcelable) bitmap);
        Parcel a = mo14956a(6, Xa);
        C5464b asInterface = C5464b.C5465a.asInterface(a.readStrongBinder());
        a.recycle();
        return asInterface;
    }
}
