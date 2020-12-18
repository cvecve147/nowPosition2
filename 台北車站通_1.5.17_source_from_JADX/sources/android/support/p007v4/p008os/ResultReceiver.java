package android.support.p007v4.p008os;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p007v4.p008os.C0413b;

/* renamed from: android.support.v4.os.ResultReceiver */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new C0416c();

    /* renamed from: a */
    final boolean f1634a = false;

    /* renamed from: b */
    final Handler f1635b = null;

    /* renamed from: c */
    C0413b f1636c;

    /* renamed from: android.support.v4.os.ResultReceiver$a */
    class C0410a extends C0413b.C0414a {
        C0410a() {
        }

        /* renamed from: a */
        public void mo1728a(int i, Bundle bundle) {
            ResultReceiver resultReceiver = ResultReceiver.this;
            Handler handler = resultReceiver.f1635b;
            if (handler != null) {
                handler.post(new C0411b(i, bundle));
            } else {
                resultReceiver.mo1615a(i, bundle);
            }
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$b */
    class C0411b implements Runnable {

        /* renamed from: a */
        final int f1638a;

        /* renamed from: b */
        final Bundle f1639b;

        C0411b(int i, Bundle bundle) {
            this.f1638a = i;
            this.f1639b = bundle;
        }

        public void run() {
            ResultReceiver.this.mo1615a(this.f1638a, this.f1639b);
        }
    }

    ResultReceiver(Parcel parcel) {
        this.f1636c = C0413b.C0414a.m1970a(parcel.readStrongBinder());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1615a(int i, Bundle bundle) {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f1636c == null) {
                this.f1636c = new C0410a();
            }
            parcel.writeStrongBinder(this.f1636c.asBinder());
        }
    }
}
