package com.marshalchen.ultimaterecyclerview.uiUtils;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p011v7.widget.RecyclerView;
import android.util.SparseIntArray;

public class SavedStateScrolling implements Parcelable {
    public static final Parcelable.Creator<SavedStateScrolling> CREATOR = new C4205b();

    /* renamed from: a */
    public static final SavedStateScrolling f12526a = new SavedStateScrolling() {
    };

    /* renamed from: b */
    public int f12527b;

    /* renamed from: c */
    public int f12528c;

    /* renamed from: d */
    public int f12529d;

    /* renamed from: e */
    public int f12530e;

    /* renamed from: f */
    public int f12531f;

    /* renamed from: g */
    public SparseIntArray f12532g;

    /* renamed from: h */
    public Parcelable f12533h;

    public SavedStateScrolling() {
        this.f12528c = -1;
        this.f12533h = null;
    }

    public SavedStateScrolling(Parcel parcel) {
        this.f12528c = -1;
        Parcelable readParcelable = parcel.readParcelable(RecyclerView.class.getClassLoader());
        this.f12533h = readParcelable == null ? f12526a : readParcelable;
        this.f12527b = parcel.readInt();
        this.f12528c = parcel.readInt();
        this.f12529d = parcel.readInt();
        this.f12530e = parcel.readInt();
        this.f12531f = parcel.readInt();
        this.f12532g = new SparseIntArray();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            for (int i = 0; i < readInt; i++) {
                this.f12532g.put(parcel.readInt(), parcel.readInt());
            }
        }
    }

    public SavedStateScrolling(Parcelable parcelable) {
        this.f12528c = -1;
        this.f12533h = parcelable == f12526a ? null : parcelable;
    }

    /* renamed from: a */
    public Parcelable mo11927a() {
        return this.f12533h;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f12533h, i);
        parcel.writeInt(this.f12527b);
        parcel.writeInt(this.f12528c);
        parcel.writeInt(this.f12529d);
        parcel.writeInt(this.f12530e);
        parcel.writeInt(this.f12531f);
        SparseIntArray sparseIntArray = this.f12532g;
        int size = sparseIntArray == null ? 0 : sparseIntArray.size();
        parcel.writeInt(size);
        if (size > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(this.f12532g.keyAt(i2));
                parcel.writeInt(this.f12532g.valueAt(i2));
            }
        }
    }
}
