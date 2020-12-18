package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.location.y */
public class C3712y {

    /* renamed from: a */
    private static final ClassLoader f10951a = C3712y.class.getClassLoader();

    private C3712y() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m14831a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: a */
    public static void m14832a(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: a */
    public static void m14833a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }
}
