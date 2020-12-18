package android.support.p007v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;

/* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper */
final class MediaSessionCompat$ResultReceiverWrapper implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$ResultReceiverWrapper> CREATOR = new C0401h();

    /* renamed from: a */
    private ResultReceiver f1597a;

    MediaSessionCompat$ResultReceiverWrapper(Parcel parcel) {
        this.f1597a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        this.f1597a.writeToParcel(parcel, i);
    }
}
