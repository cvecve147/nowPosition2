package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;
import com.google.android.gms.internal.ads.C2478La;
import com.google.android.gms.internal.ads.C2620Pt;
import com.google.android.gms.internal.ads.C2648Qt;

@C2478La
public final class PublisherAdViewOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublisherAdViewOptions> CREATOR = new C1667m();

    /* renamed from: a */
    private final boolean f5473a;

    /* renamed from: b */
    private final C2620Pt f5474b;

    PublisherAdViewOptions(boolean z, IBinder iBinder) {
        this.f5473a = z;
        this.f5474b = iBinder != null ? C2648Qt.m11004a(iBinder) : null;
    }

    /* renamed from: b */
    public final boolean mo6609b() {
        return this.f5473a;
    }

    /* renamed from: c */
    public final C2620Pt mo6610c() {
        return this.f5474b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9040a(parcel, 1, mo6609b());
        C2620Pt pt = this.f5474b;
        C2049b.m9033a(parcel, 2, pt == null ? null : pt.asBinder(), false);
        C2049b.m9026a(parcel, a);
    }
}
