package android.support.p007v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.session.ParcelableVolumeInfo */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C0404k();

    /* renamed from: a */
    public int f1600a;

    /* renamed from: b */
    public int f1601b;

    /* renamed from: c */
    public int f1602c;

    /* renamed from: d */
    public int f1603d;

    /* renamed from: e */
    public int f1604e;

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f1600a = parcel.readInt();
        this.f1602c = parcel.readInt();
        this.f1603d = parcel.readInt();
        this.f1604e = parcel.readInt();
        this.f1601b = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1600a);
        parcel.writeInt(this.f1602c);
        parcel.writeInt(this.f1603d);
        parcel.writeInt(this.f1604e);
        parcel.writeInt(this.f1601b);
    }
}
