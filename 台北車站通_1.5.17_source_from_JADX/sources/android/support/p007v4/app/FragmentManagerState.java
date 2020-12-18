package android.support.p007v4.app;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.app.FragmentManagerState */
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new C0267A();

    /* renamed from: a */
    FragmentState[] f1150a;

    /* renamed from: b */
    int[] f1151b;

    /* renamed from: c */
    BackStackState[] f1152c;

    /* renamed from: d */
    int f1153d = -1;

    /* renamed from: e */
    int f1154e;

    public FragmentManagerState() {
    }

    public FragmentManagerState(Parcel parcel) {
        this.f1150a = (FragmentState[]) parcel.createTypedArray(FragmentState.CREATOR);
        this.f1151b = parcel.createIntArray();
        this.f1152c = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.f1153d = parcel.readInt();
        this.f1154e = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f1150a, i);
        parcel.writeIntArray(this.f1151b);
        parcel.writeTypedArray(this.f1152c, i);
        parcel.writeInt(this.f1153d);
        parcel.writeInt(this.f1154e);
    }
}
