package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.GoogleCertificatesQuery;
import p101d.p129g.p131b.p132a.p134b.C5464b;
import p101d.p129g.p131b.p132a.p137e.p142e.C5519a;
import p101d.p129g.p131b.p132a.p137e.p142e.C5520b;
import p101d.p129g.p131b.p132a.p137e.p142e.C5521c;

/* renamed from: com.google.android.gms.common.internal.v */
public interface C2055v extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.v$a */
    public static abstract class C2056a extends C5520b implements C2055v {

        /* renamed from: com.google.android.gms.common.internal.v$a$a */
        public static class C2057a extends C5519a implements C2055v {
            C2057a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
            }

            /* renamed from: a */
            public boolean mo7710a(GoogleCertificatesQuery googleCertificatesQuery, C5464b bVar) {
                Parcel Xa = mo14964Xa();
                C5521c.m21037a(Xa, (Parcelable) googleCertificatesQuery);
                C5521c.m21036a(Xa, (IInterface) bVar);
                Parcel a = mo14965a(5, Xa);
                boolean a2 = C5521c.m21039a(a);
                a.recycle();
                return a2;
            }
        }

        public static C2055v asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
            return queryLocalInterface instanceof C2055v ? (C2055v) queryLocalInterface : new C2057a(iBinder);
        }
    }

    /* renamed from: a */
    boolean mo7710a(GoogleCertificatesQuery googleCertificatesQuery, C5464b bVar);
}
