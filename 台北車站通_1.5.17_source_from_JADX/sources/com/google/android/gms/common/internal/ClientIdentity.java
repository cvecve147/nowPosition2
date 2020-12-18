package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;

public class ClientIdentity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new C2024e();

    /* renamed from: a */
    public final int f6381a;

    /* renamed from: b */
    public final String f6382b;

    public ClientIdentity(int i, String str) {
        this.f6381a = i;
        this.f6382b = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ClientIdentity)) {
            ClientIdentity clientIdentity = (ClientIdentity) obj;
            return clientIdentity.f6381a == this.f6381a && C2059x.m9064a(clientIdentity.f6382b, this.f6382b);
        }
    }

    public int hashCode() {
        return this.f6381a;
    }

    public String toString() {
        int i = this.f6381a;
        String str = this.f6382b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(i);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9030a(parcel, 1, this.f6381a);
        C2049b.m9038a(parcel, 2, this.f6382b, false);
        C2049b.m9026a(parcel, a);
    }
}
