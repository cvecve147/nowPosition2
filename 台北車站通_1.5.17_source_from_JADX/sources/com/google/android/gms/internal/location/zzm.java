package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C2059x;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;
import com.google.android.gms.location.zzj;
import java.util.Collections;
import java.util.List;

public final class zzm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzm> CREATOR = new C3683B();

    /* renamed from: a */
    static final List<ClientIdentity> f10971a = Collections.emptyList();

    /* renamed from: b */
    static final zzj f10972b = new zzj();

    /* renamed from: c */
    private zzj f10973c;

    /* renamed from: d */
    private List<ClientIdentity> f10974d;

    /* renamed from: e */
    private String f10975e;

    zzm(zzj zzj, List<ClientIdentity> list, String str) {
        this.f10973c = zzj;
        this.f10974d = list;
        this.f10975e = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzm)) {
            return false;
        }
        zzm zzm = (zzm) obj;
        return C2059x.m9064a(this.f10973c, zzm.f10973c) && C2059x.m9064a(this.f10974d, zzm.f10974d) && C2059x.m9064a(this.f10975e, zzm.f10975e);
    }

    public final int hashCode() {
        return this.f10973c.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9034a(parcel, 1, (Parcelable) this.f10973c, i, false);
        C2049b.m9049c(parcel, 2, this.f10974d, false);
        C2049b.m9038a(parcel, 3, this.f10975e, false);
        C2049b.m9026a(parcel, a);
    }
}
