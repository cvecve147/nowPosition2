package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p101d.p129g.p131b.p132a.p134b.C5464b;
import p101d.p129g.p131b.p132a.p137e.p142e.C5519a;
import p101d.p129g.p131b.p132a.p137e.p142e.C5520b;
import p101d.p129g.p131b.p132a.p137e.p142e.C5521c;

/* renamed from: com.google.android.gms.dynamite.a */
public interface C2107a extends IInterface {

    /* renamed from: com.google.android.gms.dynamite.a$a */
    public static abstract class C2108a extends C5520b implements C2107a {

        /* renamed from: com.google.android.gms.dynamite.a$a$a */
        public static class C2109a extends C5519a implements C2107a {
            C2109a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
            }

            /* renamed from: a */
            public int mo7734a(C5464b bVar, String str, boolean z) {
                Parcel Xa = mo14964Xa();
                C5521c.m21036a(Xa, (IInterface) bVar);
                Xa.writeString(str);
                C5521c.m21038a(Xa, z);
                Parcel a = mo14965a(3, Xa);
                int readInt = a.readInt();
                a.recycle();
                return readInt;
            }

            /* renamed from: a */
            public C5464b mo7735a(C5464b bVar, String str, int i) {
                Parcel Xa = mo14964Xa();
                C5521c.m21036a(Xa, (IInterface) bVar);
                Xa.writeString(str);
                Xa.writeInt(i);
                Parcel a = mo14965a(2, Xa);
                C5464b asInterface = C5464b.C5465a.asInterface(a.readStrongBinder());
                a.recycle();
                return asInterface;
            }
        }

        public static C2107a asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
            return queryLocalInterface instanceof C2107a ? (C2107a) queryLocalInterface : new C2109a(iBinder);
        }
    }

    /* renamed from: a */
    int mo7734a(C5464b bVar, String str, boolean z);

    /* renamed from: a */
    C5464b mo7735a(C5464b bVar, String str, int i);
}
