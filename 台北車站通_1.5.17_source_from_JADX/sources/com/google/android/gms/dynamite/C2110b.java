package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p101d.p129g.p131b.p132a.p134b.C5464b;
import p101d.p129g.p131b.p132a.p137e.p142e.C5519a;
import p101d.p129g.p131b.p132a.p137e.p142e.C5520b;
import p101d.p129g.p131b.p132a.p137e.p142e.C5521c;

/* renamed from: com.google.android.gms.dynamite.b */
public interface C2110b extends IInterface {

    /* renamed from: com.google.android.gms.dynamite.b$a */
    public static abstract class C2111a extends C5520b implements C2110b {

        /* renamed from: com.google.android.gms.dynamite.b$a$a */
        public static class C2112a extends C5519a implements C2110b {
            C2112a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
            }

            /* renamed from: a */
            public C5464b mo7736a(C5464b bVar, String str, int i, C5464b bVar2) {
                Parcel Xa = mo14964Xa();
                C5521c.m21036a(Xa, (IInterface) bVar);
                Xa.writeString(str);
                Xa.writeInt(i);
                C5521c.m21036a(Xa, (IInterface) bVar2);
                Parcel a = mo14965a(2, Xa);
                C5464b asInterface = C5464b.C5465a.asInterface(a.readStrongBinder());
                a.recycle();
                return asInterface;
            }
        }

        public static C2110b asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
            return queryLocalInterface instanceof C2110b ? (C2110b) queryLocalInterface : new C2112a(iBinder);
        }
    }

    /* renamed from: a */
    C5464b mo7736a(C5464b bVar, String str, int i, C5464b bVar2);
}
