package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p101d.p129g.p131b.p132a.p134b.C5464b;
import p101d.p129g.p131b.p132a.p137e.p142e.C5519a;
import p101d.p129g.p131b.p132a.p137e.p142e.C5520b;
import p101d.p129g.p131b.p132a.p137e.p142e.C5521c;

/* renamed from: com.google.android.gms.common.internal.s */
public interface C2044s extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.s$a */
    public static abstract class C2045a extends C5520b implements C2044s {

        /* renamed from: com.google.android.gms.common.internal.s$a$a */
        public static class C2046a extends C5519a implements C2044s {
            C2046a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.ICertData");
            }

            /* renamed from: Y */
            public int mo7548Y() {
                Parcel a = mo14965a(2, mo14964Xa());
                int readInt = a.readInt();
                a.recycle();
                return readInt;
            }

            /* renamed from: oa */
            public C5464b mo7551oa() {
                Parcel a = mo14965a(1, mo14964Xa());
                C5464b asInterface = C5464b.C5465a.asInterface(a.readStrongBinder());
                a.recycle();
                return asInterface;
            }
        }

        public C2045a() {
            super("com.google.android.gms.common.internal.ICertData");
        }

        public static C2044s asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
            return queryLocalInterface instanceof C2044s ? (C2044s) queryLocalInterface : new C2046a(iBinder);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo7706a(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                C5464b oa = mo7551oa();
                parcel2.writeNoException();
                C5521c.m21036a(parcel2, (IInterface) oa);
            } else if (i != 2) {
                return false;
            } else {
                int Y = mo7548Y();
                parcel2.writeNoException();
                parcel2.writeInt(Y);
            }
            return true;
        }
    }

    /* renamed from: Y */
    int mo7548Y();

    /* renamed from: oa */
    C5464b mo7551oa();
}
