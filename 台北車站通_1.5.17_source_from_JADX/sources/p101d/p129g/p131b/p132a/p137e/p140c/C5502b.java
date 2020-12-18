package p101d.p129g.p131b.p132a.p137e.p140c;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: d.g.b.a.e.c.b */
public class C5502b {

    /* renamed from: a */
    private static final ClassLoader f15411a = C5502b.class.getClassLoader();

    private C5502b() {
    }

    /* renamed from: a */
    public static void m21006a(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
