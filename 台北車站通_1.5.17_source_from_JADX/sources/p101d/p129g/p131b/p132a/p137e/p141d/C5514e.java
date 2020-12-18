package p101d.p129g.p131b.p132a.p137e.p141d;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: d.g.b.a.e.d.e */
public abstract class C5514e extends C5511b implements C5513d {
    /* renamed from: a */
    public static C5513d m21023a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        return queryLocalInterface instanceof C5513d ? (C5513d) queryLocalInterface : new C5515f(iBinder);
    }
}
