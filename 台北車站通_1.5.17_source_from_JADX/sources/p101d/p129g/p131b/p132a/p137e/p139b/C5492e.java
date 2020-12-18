package p101d.p129g.p131b.p132a.p137e.p139b;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: d.g.b.a.e.b.e */
public abstract class C5492e extends C5489b implements C5491d {
    /* renamed from: a */
    public static C5491d m20995a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.iid.IMessengerCompat");
        return queryLocalInterface instanceof C5491d ? (C5491d) queryLocalInterface : new C5493f(iBinder);
    }
}
