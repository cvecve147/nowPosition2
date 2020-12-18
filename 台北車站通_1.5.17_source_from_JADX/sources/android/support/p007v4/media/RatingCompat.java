package android.support.p007v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.RatingCompat */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new C0383g();

    /* renamed from: a */
    private final int f1588a;

    /* renamed from: b */
    private final float f1589b;

    RatingCompat(int i, float f) {
        this.f1588a = i;
        this.f1589b = f;
    }

    public int describeContents() {
        return this.f1588a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.f1588a);
        sb.append(" rating=");
        float f = this.f1589b;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1588a);
        parcel.writeFloat(this.f1589b);
    }
}
