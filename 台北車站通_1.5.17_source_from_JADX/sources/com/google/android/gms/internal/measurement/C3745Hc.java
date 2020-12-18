package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.measurement.Hc */
public class C3745Hc {

    /* renamed from: a */
    private static final ClassLoader f11141a = C3745Hc.class.getClassLoader();

    private C3745Hc() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m14946a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: a */
    public static void m14947a(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: a */
    public static void m14948a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: a */
    public static boolean m14949a(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
