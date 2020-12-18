package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;

public final class zzatv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzatv> CREATOR = new C2694Si();

    /* renamed from: a */
    private final int f10863a;

    /* renamed from: b */
    private C2921_l f10864b = null;

    /* renamed from: c */
    private byte[] f10865c;

    zzatv(int i, byte[] bArr) {
        this.f10863a = i;
        this.f10865c = bArr;
        m14767c();
    }

    /* renamed from: c */
    private final void m14767c() {
        if (this.f10864b == null && this.f10865c != null) {
            return;
        }
        if (this.f10864b != null && this.f10865c == null) {
            return;
        }
        if (this.f10864b != null && this.f10865c != null) {
            throw new IllegalStateException("Invalid internal representation - full");
        } else if (this.f10864b == null && this.f10865c == null) {
            throw new IllegalStateException("Invalid internal representation - empty");
        } else {
            throw new IllegalStateException("Impossible");
        }
    }

    /* renamed from: b */
    public final C2921_l mo10304b() {
        if (!(this.f10864b != null)) {
            try {
                byte[] bArr = this.f10865c;
                C2921_l _lVar = new C2921_l();
                C2408Io.m10308a(_lVar, bArr);
                this.f10864b = _lVar;
                this.f10865c = null;
            } catch (C2380Ho e) {
                throw new IllegalStateException(e);
            }
        }
        m14767c();
        return this.f10864b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9030a(parcel, 1, this.f10863a);
        byte[] bArr = this.f10865c;
        if (bArr == null) {
            bArr = C2408Io.m10310a((C2408Io) this.f10864b);
        }
        C2049b.m9041a(parcel, 2, bArr, false);
        C2049b.m9026a(parcel, a);
    }
}
