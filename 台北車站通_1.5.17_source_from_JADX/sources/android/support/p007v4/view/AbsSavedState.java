package android.support.p007v4.view;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.view.AbsSavedState */
public abstract class AbsSavedState implements Parcelable {
    public static final Parcelable.Creator<AbsSavedState> CREATOR = new C0444a();

    /* renamed from: a */
    public static final AbsSavedState f1642a = new AbsSavedState() {
    };

    /* renamed from: b */
    private final Parcelable f1643b;

    private AbsSavedState() {
        this.f1643b = null;
    }

    protected AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f1643b = readParcelable == null ? f1642a : readParcelable;
    }

    protected AbsSavedState(Parcelable parcelable) {
        if (parcelable != null) {
            this.f1643b = parcelable == f1642a ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    /* renamed from: a */
    public final Parcelable mo1736a() {
        return this.f1643b;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1643b, i);
    }
}
