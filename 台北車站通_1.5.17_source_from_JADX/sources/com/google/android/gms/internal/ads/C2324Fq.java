package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.Fq */
public class C2324Fq {

    /* renamed from: a */
    private static final ClassLoader f7009a = C2324Fq.class.getClassLoader();

    private C2324Fq() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m9801a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: a */
    public static void m9802a(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }

    /* renamed from: a */
    public static void m9803a(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: a */
    public static void m9804a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: a */
    public static boolean m9805a(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    /* renamed from: b */
    public static ArrayList m9806b(Parcel parcel) {
        return parcel.readArrayList(f7009a);
    }

    /* renamed from: b */
    public static void m9807b(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 1);
    }
}
