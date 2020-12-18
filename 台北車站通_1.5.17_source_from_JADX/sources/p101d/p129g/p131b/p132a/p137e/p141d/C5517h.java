package p101d.p129g.p131b.p132a.p137e.p141d;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: d.g.b.a.e.d.h */
public abstract class C5517h extends C5511b implements C5516g {
    /* renamed from: a */
    public static C5516g m21027a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        return queryLocalInterface instanceof C5516g ? (C5516g) queryLocalInterface : new C5518i(iBinder);
    }
}
