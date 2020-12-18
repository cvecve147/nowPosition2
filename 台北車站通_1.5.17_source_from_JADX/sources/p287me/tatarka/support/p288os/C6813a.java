package p287me.tatarka.support.p288os;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: me.tatarka.support.os.a */
class C6813a implements Parcelable.Creator<PersistableBundle> {
    C6813a() {
    }

    public PersistableBundle createFromParcel(Parcel parcel) {
        return new PersistableBundle(parcel, (C6813a) null);
    }

    public PersistableBundle[] newArray(int i) {
        return new PersistableBundle[i];
    }
}
