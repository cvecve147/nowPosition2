package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C1993f;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C2040q;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;
import java.util.Collection;

public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new C2031j();

    /* renamed from: a */
    private final int f6393a;

    /* renamed from: b */
    private final int f6394b;

    /* renamed from: c */
    private int f6395c;

    /* renamed from: d */
    private String f6396d;

    /* renamed from: e */
    private IBinder f6397e;

    /* renamed from: f */
    private Scope[] f6398f;

    /* renamed from: g */
    private Bundle f6399g;

    /* renamed from: h */
    private Account f6400h;

    /* renamed from: i */
    private Feature[] f6401i;

    /* renamed from: j */
    private Feature[] f6402j;

    /* renamed from: k */
    private boolean f6403k;

    public GetServiceRequest(int i) {
        this.f6393a = 4;
        this.f6395c = C1993f.f6371a;
        this.f6394b = i;
        this.f6403k = true;
    }

    GetServiceRequest(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z) {
        this.f6393a = i;
        this.f6394b = i2;
        this.f6395c = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f6396d = "com.google.android.gms";
        } else {
            this.f6396d = str;
        }
        if (i < 2) {
            this.f6400h = m8809a(iBinder);
        } else {
            this.f6397e = iBinder;
            this.f6400h = account;
        }
        this.f6398f = scopeArr;
        this.f6399g = bundle;
        this.f6401i = featureArr;
        this.f6402j = featureArr2;
        this.f6403k = z;
    }

    /* renamed from: a */
    private static Account m8809a(IBinder iBinder) {
        if (iBinder != null) {
            return C2008a.m8841a(C2040q.C2041a.asInterface(iBinder));
        }
        return null;
    }

    /* renamed from: a */
    public GetServiceRequest mo7573a(Account account) {
        this.f6400h = account;
        return this;
    }

    /* renamed from: a */
    public GetServiceRequest mo7574a(Bundle bundle) {
        this.f6399g = bundle;
        return this;
    }

    /* renamed from: a */
    public GetServiceRequest mo7575a(C2040q qVar) {
        if (qVar != null) {
            this.f6397e = qVar.asBinder();
        }
        return this;
    }

    /* renamed from: a */
    public GetServiceRequest mo7576a(String str) {
        this.f6396d = str;
        return this;
    }

    /* renamed from: a */
    public GetServiceRequest mo7577a(Collection<Scope> collection) {
        this.f6398f = (Scope[]) collection.toArray(new Scope[collection.size()]);
        return this;
    }

    /* renamed from: a */
    public GetServiceRequest mo7578a(Feature[] featureArr) {
        this.f6402j = featureArr;
        return this;
    }

    /* renamed from: b */
    public GetServiceRequest mo7579b(Feature[] featureArr) {
        this.f6401i = featureArr;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9030a(parcel, 1, this.f6393a);
        C2049b.m9030a(parcel, 2, this.f6394b);
        C2049b.m9030a(parcel, 3, this.f6395c);
        C2049b.m9038a(parcel, 4, this.f6396d, false);
        C2049b.m9033a(parcel, 5, this.f6397e, false);
        C2049b.m9042a(parcel, 6, (T[]) this.f6398f, i, false);
        C2049b.m9032a(parcel, 7, this.f6399g, false);
        C2049b.m9034a(parcel, 8, (Parcelable) this.f6400h, i, false);
        C2049b.m9042a(parcel, 10, (T[]) this.f6401i, i, false);
        C2049b.m9042a(parcel, 11, (T[]) this.f6402j, i, false);
        C2049b.m9040a(parcel, 12, this.f6403k);
        C2049b.m9026a(parcel, a);
    }
}
