package com.google.android.gms.signin.internal;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;

public class SignInResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInResponse> CREATOR = new C4010g();

    /* renamed from: a */
    private final int f11918a;

    /* renamed from: b */
    private final ConnectionResult f11919b;

    /* renamed from: c */
    private final ResolveAccountResponse f11920c;

    public SignInResponse(int i) {
        this(new ConnectionResult(i, (PendingIntent) null), (ResolveAccountResponse) null);
    }

    SignInResponse(int i, ConnectionResult connectionResult, ResolveAccountResponse resolveAccountResponse) {
        this.f11918a = i;
        this.f11919b = connectionResult;
        this.f11920c = resolveAccountResponse;
    }

    public SignInResponse(ConnectionResult connectionResult, ResolveAccountResponse resolveAccountResponse) {
        this(1, connectionResult, resolveAccountResponse);
    }

    /* renamed from: b */
    public ConnectionResult mo11351b() {
        return this.f11919b;
    }

    /* renamed from: c */
    public ResolveAccountResponse mo11352c() {
        return this.f11920c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9030a(parcel, 1, this.f11918a);
        C2049b.m9034a(parcel, 2, (Parcelable) mo11351b(), i, false);
        C2049b.m9034a(parcel, 3, (Parcelable) mo11352c(), i, false);
        C2049b.m9026a(parcel, a);
    }
}
