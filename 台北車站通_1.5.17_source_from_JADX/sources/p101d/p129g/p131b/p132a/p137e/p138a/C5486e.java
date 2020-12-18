package p101d.p129g.p131b.p132a.p137e.p138a;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: d.g.b.a.e.a.e */
public abstract class C5486e extends C5483b implements C5485d {
    /* renamed from: a */
    public static C5485d m20988a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return queryLocalInterface instanceof C5485d ? (C5485d) queryLocalInterface : new C5487f(iBinder);
    }
}
