package com.google.android.gms.internal.vision;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.vision.b */
public class C3925b {

    /* renamed from: a */
    private static final ClassLoader f11795a = C3925b.class.getClassLoader();

    private C3925b() {
    }

    /* renamed from: a */
    public static void m15956a(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }

    /* renamed from: a */
    public static void m15957a(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
