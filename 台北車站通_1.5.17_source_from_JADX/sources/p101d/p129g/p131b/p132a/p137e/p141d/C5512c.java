package p101d.p129g.p131b.p132a.p137e.p141d;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: d.g.b.a.e.d.c */
public class C5512c {

    /* renamed from: a */
    private static final ClassLoader f15421a = C5512c.class.getClassLoader();

    private C5512c() {
    }

    /* renamed from: a */
    public static void m21018a(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }

    /* renamed from: a */
    public static void m21019a(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: a */
    public static void m21020a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: a */
    public static boolean m21021a(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
