package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C2059x;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

public final class zzbd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbd> CREATOR = new C3707t();

    /* renamed from: a */
    static final List<ClientIdentity> f10956a = Collections.emptyList();

    /* renamed from: b */
    private LocationRequest f10957b;

    /* renamed from: c */
    private List<ClientIdentity> f10958c;

    /* renamed from: d */
    private String f10959d;

    /* renamed from: e */
    private boolean f10960e;

    /* renamed from: f */
    private boolean f10961f;

    /* renamed from: g */
    private boolean f10962g;

    /* renamed from: h */
    private String f10963h;

    /* renamed from: i */
    private boolean f10964i = true;

    zzbd(LocationRequest locationRequest, List<ClientIdentity> list, String str, boolean z, boolean z2, boolean z3, String str2) {
        this.f10957b = locationRequest;
        this.f10958c = list;
        this.f10959d = str;
        this.f10960e = z;
        this.f10961f = z2;
        this.f10962g = z3;
        this.f10963h = str2;
    }

    @Deprecated
    /* renamed from: a */
    public static zzbd m14841a(LocationRequest locationRequest) {
        return new zzbd(locationRequest, f10956a, (String) null, false, false, false, (String) null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbd)) {
            return false;
        }
        zzbd zzbd = (zzbd) obj;
        return C2059x.m9064a(this.f10957b, zzbd.f10957b) && C2059x.m9064a(this.f10958c, zzbd.f10958c) && C2059x.m9064a(this.f10959d, zzbd.f10959d) && this.f10960e == zzbd.f10960e && this.f10961f == zzbd.f10961f && this.f10962g == zzbd.f10962g && C2059x.m9064a(this.f10963h, zzbd.f10963h);
    }

    public final int hashCode() {
        return this.f10957b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f10957b);
        if (this.f10959d != null) {
            sb.append(" tag=");
            sb.append(this.f10959d);
        }
        if (this.f10963h != null) {
            sb.append(" moduleId=");
            sb.append(this.f10963h);
        }
        sb.append(" hideAppOps=");
        sb.append(this.f10960e);
        sb.append(" clients=");
        sb.append(this.f10958c);
        sb.append(" forceCoarseLocation=");
        sb.append(this.f10961f);
        if (this.f10962g) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9034a(parcel, 1, (Parcelable) this.f10957b, i, false);
        C2049b.m9049c(parcel, 5, this.f10958c, false);
        C2049b.m9038a(parcel, 6, this.f10959d, false);
        C2049b.m9040a(parcel, 7, this.f10960e);
        C2049b.m9040a(parcel, 8, this.f10961f);
        C2049b.m9040a(parcel, 9, this.f10962g);
        C2049b.m9038a(parcel, 10, this.f10963h, false);
        C2049b.m9026a(parcel, a);
    }
}
