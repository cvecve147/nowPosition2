package p101d.p129g.p131b.p132a.p134b;

import android.os.IBinder;
import android.os.IInterface;
import p101d.p129g.p131b.p132a.p137e.p142e.C5519a;
import p101d.p129g.p131b.p132a.p137e.p142e.C5520b;

/* renamed from: d.g.b.a.b.b */
public interface C5464b extends IInterface {

    /* renamed from: d.g.b.a.b.b$a */
    public static abstract class C5465a extends C5520b implements C5464b {

        /* renamed from: d.g.b.a.b.b$a$a */
        public static class C5466a extends C5519a implements C5464b {
            C5466a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
            }
        }

        public C5465a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static C5464b asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof C5464b ? (C5464b) queryLocalInterface : new C5466a(iBinder);
        }
    }
}
