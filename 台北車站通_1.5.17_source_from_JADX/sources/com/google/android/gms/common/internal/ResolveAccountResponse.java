package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C2040q;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;

public class ResolveAccountResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ResolveAccountResponse> CREATOR = new C1998A();

    /* renamed from: a */
    private final int f6421a;

    /* renamed from: b */
    private IBinder f6422b;

    /* renamed from: c */
    private ConnectionResult f6423c;

    /* renamed from: d */
    private boolean f6424d;

    /* renamed from: e */
    private boolean f6425e;

    ResolveAccountResponse(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.f6421a = i;
        this.f6422b = iBinder;
        this.f6423c = connectionResult;
        this.f6424d = z;
        this.f6425e = z2;
    }

    /* renamed from: b */
    public C2040q mo7600b() {
        return C2040q.C2041a.asInterface(this.f6422b);
    }

    /* renamed from: c */
    public ConnectionResult mo7601c() {
        return this.f6423c;
    }

    /* renamed from: d */
    public boolean mo7602d() {
        return this.f6424d;
    }

    /* renamed from: e */
    public boolean mo7603e() {
        return this.f6425e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolveAccountResponse)) {
            return false;
        }
        ResolveAccountResponse resolveAccountResponse = (ResolveAccountResponse) obj;
        return this.f6423c.equals(resolveAccountResponse.f6423c) && mo7600b().equals(resolveAccountResponse.mo7600b());
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9030a(parcel, 1, this.f6421a);
        C2049b.m9033a(parcel, 2, this.f6422b, false);
        C2049b.m9034a(parcel, 3, (Parcelable) mo7601c(), i, false);
        C2049b.m9040a(parcel, 4, mo7602d());
        C2049b.m9040a(parcel, 5, mo7603e());
        C2049b.m9026a(parcel, a);
    }
}
