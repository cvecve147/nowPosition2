package p287me.tatarka.support.job;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: me.tatarka.support.job.c */
class C6810c implements Parcelable.Creator<JobInfo> {
    C6810c() {
    }

    public JobInfo createFromParcel(Parcel parcel) {
        return new JobInfo(parcel, (C6810c) null);
    }

    public JobInfo[] newArray(int i) {
        return new JobInfo[i];
    }
}
