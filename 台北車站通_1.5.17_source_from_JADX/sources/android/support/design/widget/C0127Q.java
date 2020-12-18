package android.support.design.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.design.widget.TextInputLayout;

/* renamed from: android.support.design.widget.Q */
class C0127Q implements Parcelable.ClassLoaderCreator<TextInputLayout.SavedState> {
    C0127Q() {
    }

    public TextInputLayout.SavedState createFromParcel(Parcel parcel) {
        return new TextInputLayout.SavedState(parcel, (ClassLoader) null);
    }

    public TextInputLayout.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new TextInputLayout.SavedState(parcel, classLoader);
    }

    public TextInputLayout.SavedState[] newArray(int i) {
        return new TextInputLayout.SavedState[i];
    }
}
