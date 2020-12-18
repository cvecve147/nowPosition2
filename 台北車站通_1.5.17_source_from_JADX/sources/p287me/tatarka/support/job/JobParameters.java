package p287me.tatarka.support.job;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p287me.tatarka.support.p288os.PersistableBundle;

/* renamed from: me.tatarka.support.job.JobParameters */
public class JobParameters implements Parcelable {
    public static final Parcelable.Creator<JobParameters> CREATOR = new C6811d();

    /* renamed from: a */
    private final int f18928a;

    /* renamed from: b */
    private final PersistableBundle f18929b;

    /* renamed from: c */
    private final IBinder f18930c;

    /* renamed from: d */
    private final boolean f18931d;

    public JobParameters(IBinder iBinder, int i, PersistableBundle persistableBundle, boolean z) {
        this.f18928a = i;
        this.f18929b = persistableBundle;
        this.f18930c = iBinder;
        this.f18931d = z;
    }

    private JobParameters(Parcel parcel) {
        this.f18928a = parcel.readInt();
        this.f18929b = PersistableBundle.m25909a(parcel);
        this.f18930c = parcel.readStrongBinder();
        this.f18931d = parcel.readInt() != 1 ? false : true;
    }

    /* synthetic */ JobParameters(Parcel parcel, C6811d dVar) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f18928a);
        PersistableBundle.m25911a(this.f18929b, parcel);
        parcel.writeStrongBinder(this.f18930c);
        parcel.writeInt(this.f18931d ? 1 : 0);
    }
}
