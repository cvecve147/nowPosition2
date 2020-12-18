package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C2047a;

/* renamed from: com.google.android.gms.ads.formats.m */
public final class C1667m implements Parcelable.Creator<PublisherAdViewOptions> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C2047a.m9004b(parcel);
        boolean z = false;
        IBinder iBinder = null;
        while (parcel.dataPosition() < b) {
            int a = C2047a.m8999a(parcel);
            int a2 = C2047a.m8998a(a);
            if (a2 == 1) {
                z = C2047a.m9013h(parcel, a);
            } else if (a2 != 2) {
                C2047a.m9024s(parcel, a);
            } else {
                iBinder = C2047a.m9019n(parcel, a);
            }
        }
        C2047a.m9012g(parcel, b);
        return new PublisherAdViewOptions(z, iBinder);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PublisherAdViewOptions[i];
    }
}
