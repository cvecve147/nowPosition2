package android.support.p007v4.p008os;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.os.c */
class C0416c implements Parcelable.Creator<ResultReceiver> {
    C0416c() {
    }

    public ResultReceiver createFromParcel(Parcel parcel) {
        return new ResultReceiver(parcel);
    }

    public ResultReceiver[] newArray(int i) {
        return new ResultReceiver[i];
    }
}
