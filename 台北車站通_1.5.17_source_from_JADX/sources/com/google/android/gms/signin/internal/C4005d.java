package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C2040q;
import p101d.p129g.p131b.p132a.p137e.p142e.C5519a;
import p101d.p129g.p131b.p132a.p137e.p142e.C5520b;
import p101d.p129g.p131b.p132a.p137e.p142e.C5521c;

/* renamed from: com.google.android.gms.signin.internal.d */
public interface C4005d extends IInterface {

    /* renamed from: com.google.android.gms.signin.internal.d$a */
    public static abstract class C4006a extends C5520b implements C4005d {

        /* renamed from: com.google.android.gms.signin.internal.d$a$a */
        public static class C4007a extends C5519a implements C4005d {
            C4007a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
            }

            /* renamed from: a */
            public void mo11360a(C2040q qVar, int i, boolean z) {
                Parcel Xa = mo14964Xa();
                C5521c.m21036a(Xa, (IInterface) qVar);
                Xa.writeInt(i);
                C5521c.m21038a(Xa, z);
                mo14967b(9, Xa);
            }

            /* renamed from: a */
            public void mo11361a(SignInRequest signInRequest, C4003c cVar) {
                Parcel Xa = mo14964Xa();
                C5521c.m21037a(Xa, (Parcelable) signInRequest);
                C5521c.m21036a(Xa, (IInterface) cVar);
                mo14967b(12, Xa);
            }

            /* renamed from: e */
            public void mo11362e(int i) {
                Parcel Xa = mo14964Xa();
                Xa.writeInt(i);
                mo14967b(7, Xa);
            }
        }

        public static C4005d asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
            return queryLocalInterface instanceof C4005d ? (C4005d) queryLocalInterface : new C4007a(iBinder);
        }
    }

    /* renamed from: a */
    void mo11360a(C2040q qVar, int i, boolean z);

    /* renamed from: a */
    void mo11361a(SignInRequest signInRequest, C4003c cVar);

    /* renamed from: e */
    void mo11362e(int i);
}
