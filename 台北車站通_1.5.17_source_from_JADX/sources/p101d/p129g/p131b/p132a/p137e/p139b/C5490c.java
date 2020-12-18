package p101d.p129g.p131b.p132a.p137e.p139b;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: d.g.b.a.e.b.c */
public class C5490c {

    /* renamed from: a */
    private static final ClassLoader f15401a = C5490c.class.getClassLoader();

    private C5490c() {
    }

    /* renamed from: a */
    public static void m20993a(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
