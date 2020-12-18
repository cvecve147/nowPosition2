package com.google.android.gms.signin.internal;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import p101d.p129g.p131b.p132a.p137e.p142e.C5520b;
import p101d.p129g.p131b.p132a.p137e.p142e.C5521c;

/* renamed from: com.google.android.gms.signin.internal.c */
public interface C4003c extends IInterface {

    /* renamed from: com.google.android.gms.signin.internal.c$a */
    public static abstract class C4004a extends C5520b implements C4003c {
        public C4004a() {
            super("com.google.android.gms.signin.internal.ISignInCallbacks");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo7706a(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 3) {
                mo11356a((ConnectionResult) C5521c.m21035a(parcel, ConnectionResult.CREATOR), (AuthAccountResult) C5521c.m21035a(parcel, AuthAccountResult.CREATOR));
            } else if (i == 4) {
                mo11357a((Status) C5521c.m21035a(parcel, Status.CREATOR));
            } else if (i == 6) {
                mo11359b((Status) C5521c.m21035a(parcel, Status.CREATOR));
            } else if (i == 7) {
                mo11358a((Status) C5521c.m21035a(parcel, Status.CREATOR), (GoogleSignInAccount) C5521c.m21035a(parcel, GoogleSignInAccount.CREATOR));
            } else if (i != 8) {
                return false;
            } else {
                mo7352a((SignInResponse) C5521c.m21035a(parcel, SignInResponse.CREATOR));
            }
            parcel2.writeNoException();
            return true;
        }
    }

    /* renamed from: a */
    void mo11356a(ConnectionResult connectionResult, AuthAccountResult authAccountResult);

    /* renamed from: a */
    void mo11357a(Status status);

    /* renamed from: a */
    void mo11358a(Status status, GoogleSignInAccount googleSignInAccount);

    /* renamed from: a */
    void mo7352a(SignInResponse signInResponse);

    /* renamed from: b */
    void mo11359b(Status status);
}
