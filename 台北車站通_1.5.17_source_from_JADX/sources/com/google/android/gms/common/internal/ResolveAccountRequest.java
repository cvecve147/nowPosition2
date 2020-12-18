package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;

public class ResolveAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ResolveAccountRequest> CREATOR = new C2062z();

    /* renamed from: a */
    private final int f6417a;

    /* renamed from: b */
    private final Account f6418b;

    /* renamed from: c */
    private final int f6419c;

    /* renamed from: d */
    private final GoogleSignInAccount f6420d;

    ResolveAccountRequest(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f6417a = i;
        this.f6418b = account;
        this.f6419c = i2;
        this.f6420d = googleSignInAccount;
    }

    public ResolveAccountRequest(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }

    /* renamed from: b */
    public Account mo7596b() {
        return this.f6418b;
    }

    /* renamed from: c */
    public int mo7597c() {
        return this.f6419c;
    }

    /* renamed from: d */
    public GoogleSignInAccount mo7598d() {
        return this.f6420d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9030a(parcel, 1, this.f6417a);
        C2049b.m9034a(parcel, 2, (Parcelable) mo7596b(), i, false);
        C2049b.m9030a(parcel, 3, mo7597c());
        C2049b.m9034a(parcel, 4, (Parcelable) mo7598d(), i, false);
        C2049b.m9026a(parcel, a);
    }
}
