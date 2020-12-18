package p287me.tatarka.support.job;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: me.tatarka.support.job.d */
class C6811d implements Parcelable.Creator<JobParameters> {
    C6811d() {
    }

    public JobParameters createFromParcel(Parcel parcel) {
        return new JobParameters(parcel, (C6811d) null);
    }

    public JobParameters[] newArray(int i) {
        return new JobParameters[i];
    }
}
