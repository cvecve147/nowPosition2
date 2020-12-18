package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.C1994g;
import com.google.android.gms.common.internal.C2044s;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;
import p101d.p129g.p131b.p132a.p134b.C5464b;
import p101d.p129g.p131b.p132a.p134b.C5468d;

public class GoogleCertificatesQuery extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleCertificatesQuery> CREATOR = new C1996h();

    /* renamed from: a */
    private final String f6015a;

    /* renamed from: b */
    private final C1994g.C1995a f6016b;

    /* renamed from: c */
    private final boolean f6017c;

    GoogleCertificatesQuery(String str, IBinder iBinder, boolean z) {
        this.f6015a = str;
        this.f6016b = m8244a(iBinder);
        this.f6017c = z;
    }

    GoogleCertificatesQuery(String str, C1994g.C1995a aVar, boolean z) {
        this.f6015a = str;
        this.f6016b = aVar;
        this.f6017c = z;
    }

    /* renamed from: a */
    private static C1994g.C1995a m8244a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        try {
            C5464b oa = C2044s.C2045a.asInterface(iBinder).mo7551oa();
            byte[] bArr = oa == null ? null : (byte[]) C5468d.m20962z(oa);
            if (bArr != null) {
                return new C2069p(bArr);
            }
            Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
            return null;
        } catch (RemoteException e) {
            Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            return null;
        }
    }

    /* renamed from: b */
    public boolean mo7228b() {
        return this.f6017c;
    }

    /* renamed from: c */
    public IBinder mo7229c() {
        C1994g.C1995a aVar = this.f6016b;
        if (aVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            return null;
        }
        aVar.asBinder();
        return aVar;
    }

    /* renamed from: d */
    public String mo7230d() {
        return this.f6015a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9038a(parcel, 1, mo7230d(), false);
        C2049b.m9033a(parcel, 2, mo7229c(), false);
        C2049b.m9040a(parcel, 3, mo7228b());
        C2049b.m9026a(parcel, a);
    }
}
