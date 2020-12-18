package p101d.p129g.p131b.p132a.p137e.p142e;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: d.g.b.a.e.e.c */
public class C5521c {

    /* renamed from: a */
    private static final ClassLoader f15424a = C5521c.class.getClassLoader();

    private C5521c() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m21035a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: a */
    public static void m21036a(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }

    /* renamed from: a */
    public static void m21037a(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: a */
    public static void m21038a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: a */
    public static boolean m21039a(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
