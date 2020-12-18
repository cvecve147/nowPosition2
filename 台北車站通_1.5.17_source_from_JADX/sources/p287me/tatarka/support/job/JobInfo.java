package p287me.tatarka.support.job;

import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;
import p287me.tatarka.support.p288os.PersistableBundle;

/* renamed from: me.tatarka.support.job.JobInfo */
public class JobInfo implements Parcelable {
    public static final Parcelable.Creator<JobInfo> CREATOR = new C6810c();

    /* renamed from: a */
    private final int f18897a;

    /* renamed from: b */
    private final PersistableBundle f18898b;

    /* renamed from: c */
    private final ComponentName f18899c;

    /* renamed from: d */
    private final boolean f18900d;

    /* renamed from: e */
    private final boolean f18901e;

    /* renamed from: f */
    private final boolean f18902f;

    /* renamed from: g */
    private final boolean f18903g;

    /* renamed from: h */
    private final int f18904h;

    /* renamed from: i */
    private final long f18905i;

    /* renamed from: j */
    private final long f18906j;

    /* renamed from: k */
    private final boolean f18907k;

    /* renamed from: l */
    private final boolean f18908l;

    /* renamed from: m */
    private final long f18909m;

    /* renamed from: n */
    private final long f18910n;

    /* renamed from: o */
    private final int f18911o;

    /* renamed from: me.tatarka.support.job.JobInfo$a */
    public static final class C6806a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public int f18912a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public PersistableBundle f18913b = PersistableBundle.f18932a;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public ComponentName f18914c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public boolean f18915d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public boolean f18916e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f18917f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public boolean f18918g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public long f18919h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public long f18920i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public boolean f18921j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public boolean f18922k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public boolean f18923l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public long f18924m;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public long f18925n = 30000;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public int f18926o = 1;

        /* renamed from: p */
        private boolean f18927p = false;

        public C6806a(int i, ComponentName componentName) {
            this.f18914c = componentName;
            this.f18912a = i;
        }

        /* renamed from: a */
        public C6806a mo17437a(int i) {
            this.f18917f = i;
            return this;
        }

        /* renamed from: a */
        public C6806a mo17438a(long j) {
            this.f18919h = j;
            this.f18922k = true;
            return this;
        }

        /* renamed from: a */
        public C6806a mo17439a(long j, int i) {
            this.f18927p = true;
            this.f18925n = j;
            this.f18926o = i;
            return this;
        }

        /* renamed from: a */
        public C6806a mo17440a(PersistableBundle persistableBundle) {
            this.f18913b = persistableBundle;
            return this;
        }

        /* renamed from: a */
        public C6806a mo17441a(boolean z) {
            this.f18918g = z;
            return this;
        }

        /* renamed from: a */
        public JobInfo mo17442a() {
            if (this.f18922k || this.f18923l || this.f18915d || this.f18916e || this.f18917f != 0) {
                this.f18913b = new PersistableBundle(this.f18913b);
                if (this.f18921j && this.f18920i != 0) {
                    throw new IllegalArgumentException("Can't call setOverrideDeadline() on a periodic job.");
                } else if (this.f18921j && this.f18919h != 0) {
                    throw new IllegalArgumentException("Can't call setMinimumLatency() on a periodic job");
                } else if (!this.f18927p || !this.f18916e) {
                    return new JobInfo(this, (C6810c) null);
                } else {
                    throw new IllegalArgumentException("An idle mode job will not respect any back-off policy, so calling setBackoffCriteria with setRequiresDeviceIdle is an error.");
                }
            } else {
                throw new IllegalArgumentException("You're trying to build a job with no constraints, this is not allowed.");
            }
        }

        /* renamed from: b */
        public C6806a mo17443b(long j) {
            this.f18920i = j;
            this.f18923l = true;
            return this;
        }

        /* renamed from: b */
        public C6806a mo17444b(boolean z) {
            this.f18915d = z;
            return this;
        }

        /* renamed from: c */
        public C6806a mo17445c(long j) {
            this.f18921j = true;
            this.f18924m = j;
            this.f18923l = true;
            this.f18922k = true;
            return this;
        }

        /* renamed from: c */
        public C6806a mo17446c(boolean z) {
            this.f18916e = z;
            return this;
        }
    }

    private JobInfo(Parcel parcel) {
        this.f18897a = parcel.readInt();
        this.f18898b = PersistableBundle.m25909a(parcel);
        this.f18899c = (ComponentName) parcel.readParcelable((ClassLoader) null);
        boolean z = false;
        this.f18900d = parcel.readInt() == 1;
        this.f18901e = parcel.readInt() == 1;
        this.f18904h = parcel.readInt();
        this.f18905i = parcel.readLong();
        this.f18906j = parcel.readLong();
        this.f18907k = parcel.readInt() == 1;
        this.f18908l = parcel.readInt() == 1;
        this.f18909m = parcel.readLong();
        this.f18910n = parcel.readLong();
        this.f18911o = parcel.readInt();
        this.f18902f = parcel.readInt() == 1;
        this.f18903g = parcel.readInt() == 1 ? true : z;
    }

    /* synthetic */ JobInfo(Parcel parcel, C6810c cVar) {
        this(parcel);
    }

    private JobInfo(C6806a aVar) {
        this.f18897a = aVar.f18912a;
        this.f18898b = aVar.f18913b;
        this.f18899c = aVar.f18914c;
        this.f18900d = aVar.f18915d;
        this.f18901e = aVar.f18916e;
        this.f18904h = aVar.f18917f;
        this.f18905i = aVar.f18919h;
        this.f18906j = aVar.f18920i;
        this.f18907k = aVar.f18921j;
        this.f18908l = aVar.f18918g;
        this.f18909m = aVar.f18924m;
        this.f18910n = aVar.f18925n;
        this.f18911o = aVar.f18926o;
        this.f18902f = aVar.f18922k;
        this.f18903g = aVar.f18923l;
    }

    /* synthetic */ JobInfo(C6806a aVar, C6810c cVar) {
        this(aVar);
    }

    /* renamed from: a */
    public int mo17419a() {
        return this.f18911o;
    }

    /* renamed from: b */
    public PersistableBundle mo17420b() {
        return this.f18898b;
    }

    /* renamed from: c */
    public int mo17421c() {
        return this.f18897a;
    }

    /* renamed from: d */
    public long mo17422d() {
        return this.f18910n;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public long mo17424e() {
        return this.f18909m;
    }

    /* renamed from: f */
    public long mo17425f() {
        return this.f18906j;
    }

    /* renamed from: g */
    public long mo17426g() {
        return this.f18905i;
    }

    /* renamed from: h */
    public int mo17427h() {
        return this.f18904h;
    }

    /* renamed from: i */
    public ComponentName mo17428i() {
        return this.f18899c;
    }

    /* renamed from: j */
    public boolean mo17429j() {
        return this.f18902f;
    }

    /* renamed from: k */
    public boolean mo17430k() {
        return this.f18903g;
    }

    /* renamed from: l */
    public boolean mo17431l() {
        return this.f18907k;
    }

    /* renamed from: m */
    public boolean mo17432m() {
        return this.f18908l;
    }

    /* renamed from: n */
    public boolean mo17433n() {
        return this.f18900d;
    }

    /* renamed from: o */
    public boolean mo17434o() {
        return this.f18901e;
    }

    public String toString() {
        return "(job:" + this.f18897a + "/" + this.f18899c.flattenToShortString() + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f18897a);
        PersistableBundle.m25911a(this.f18898b, parcel);
        parcel.writeParcelable(this.f18899c, i);
        parcel.writeInt(this.f18900d ? 1 : 0);
        parcel.writeInt(this.f18901e ? 1 : 0);
        parcel.writeInt(this.f18904h);
        parcel.writeLong(this.f18905i);
        parcel.writeLong(this.f18906j);
        parcel.writeInt(this.f18907k ? 1 : 0);
        parcel.writeInt(this.f18908l ? 1 : 0);
        parcel.writeLong(this.f18909m);
        parcel.writeLong(this.f18910n);
        parcel.writeInt(this.f18911o);
        parcel.writeInt(this.f18902f ? 1 : 0);
        parcel.writeInt(this.f18903g ? 1 : 0);
    }
}
