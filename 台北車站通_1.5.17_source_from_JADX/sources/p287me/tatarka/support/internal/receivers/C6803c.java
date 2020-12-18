package p287me.tatarka.support.internal.receivers;

import android.content.ComponentName;
import android.os.SystemClock;
import android.text.format.DateUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import p287me.tatarka.support.job.JobInfo;
import p287me.tatarka.support.p288os.PersistableBundle;

/* renamed from: me.tatarka.support.internal.receivers.c */
public class C6803c {

    /* renamed from: a */
    final JobInfo f18885a;

    /* renamed from: b */
    final String f18886b;

    /* renamed from: c */
    final String f18887c;

    /* renamed from: d */
    public final AtomicBoolean f18888d;

    /* renamed from: e */
    public final AtomicBoolean f18889e;

    /* renamed from: f */
    public final AtomicBoolean f18890f;

    /* renamed from: g */
    public final AtomicBoolean f18891g;

    /* renamed from: h */
    public final AtomicBoolean f18892h;

    /* renamed from: i */
    public final AtomicBoolean f18893i;

    /* renamed from: j */
    private long f18894j;

    /* renamed from: k */
    private long f18895k;

    /* renamed from: l */
    private final int f18896l;

    public C6803c(C6803c cVar, long j, long j2, int i) {
        this(cVar.f18885a, i);
        this.f18894j = j;
        this.f18895k = j2;
    }

    public C6803c(JobInfo jobInfo) {
        this(jobInfo, 0);
        long j;
        long f;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (jobInfo.mo17431l()) {
            this.f18894j = elapsedRealtime;
            f = jobInfo.mo17424e();
        } else {
            this.f18894j = jobInfo.mo17429j() ? jobInfo.mo17426g() + elapsedRealtime : 0;
            if (jobInfo.mo17430k()) {
                f = jobInfo.mo17425f();
            } else {
                j = Long.MAX_VALUE;
                this.f18895k = j;
            }
        }
        j = elapsedRealtime + f;
        this.f18895k = j;
    }

    private C6803c(JobInfo jobInfo, int i) {
        this.f18888d = new AtomicBoolean();
        this.f18889e = new AtomicBoolean();
        this.f18890f = new AtomicBoolean();
        this.f18891g = new AtomicBoolean();
        this.f18892h = new AtomicBoolean();
        this.f18893i = new AtomicBoolean();
        this.f18885a = jobInfo;
        this.f18886b = jobInfo.mo17428i().flattenToShortString();
        this.f18887c = "*job*/" + this.f18886b;
        this.f18896l = i;
    }

    public C6803c(JobInfo jobInfo, long j, long j2) {
        this(jobInfo, 0);
        this.f18894j = j;
        this.f18895k = j2;
    }

    /* renamed from: a */
    private String m25842a(long j, long j2) {
        if (j == j2) {
            return "none";
        }
        long elapsedRealtime = j - SystemClock.elapsedRealtime();
        if (elapsedRealtime > 0) {
            return DateUtils.formatElapsedTime(elapsedRealtime / 1000);
        }
        return "-" + DateUtils.formatElapsedTime(elapsedRealtime / -1000);
    }

    /* renamed from: a */
    public long mo17398a() {
        return this.f18894j;
    }

    /* renamed from: a */
    public boolean mo17399a(int i) {
        return this.f18885a.mo17421c() == i;
    }

    /* renamed from: b */
    public PersistableBundle mo17400b() {
        return this.f18885a.mo17420b();
    }

    /* renamed from: c */
    public JobInfo mo17401c() {
        return this.f18885a;
    }

    /* renamed from: d */
    public int mo17402d() {
        return this.f18885a.mo17421c();
    }

    /* renamed from: e */
    public long mo17403e() {
        return this.f18895k;
    }

    /* renamed from: f */
    public int mo17404f() {
        return this.f18896l;
    }

    /* renamed from: g */
    public ComponentName mo17405g() {
        return this.f18885a.mo17428i();
    }

    /* renamed from: h */
    public boolean mo17406h() {
        return this.f18885a.mo17433n();
    }

    /* renamed from: i */
    public boolean mo17407i() {
        return this.f18885a.mo17427h() == 1;
    }

    /* renamed from: j */
    public boolean mo17408j() {
        return this.f18895k != Long.MAX_VALUE;
    }

    /* renamed from: k */
    public boolean mo17409k() {
        return this.f18885a.mo17434o();
    }

    /* renamed from: l */
    public boolean mo17410l() {
        return this.f18894j != 0;
    }

    /* renamed from: m */
    public boolean mo17411m() {
        return this.f18885a.mo17427h() == 2;
    }

    /* renamed from: n */
    public synchronized boolean mo17412n() {
        return (!mo17406h() || this.f18888d.get()) && (!mo17410l() || this.f18889e.get()) && ((!mo17407i() || this.f18893i.get()) && ((!mo17411m() || this.f18892h.get()) && (!mo17409k() || this.f18891g.get())));
    }

    /* renamed from: o */
    public boolean mo17413o() {
        return this.f18885a.mo17432m();
    }

    /* renamed from: p */
    public synchronized boolean mo17414p() {
        return mo17412n() || (mo17408j() && this.f18890f.get());
    }

    /* renamed from: q */
    public String mo17415q() {
        return this.f18885a.mo17428i().flattenToShortString() + " jId=" + this.f18885a.mo17421c();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(hashCode()).substring(0, 3));
        sb.append("..");
        sb.append(":[");
        sb.append(this.f18885a.mo17428i());
        sb.append(",jId=");
        sb.append(this.f18885a.mo17421c());
        sb.append(",R=(");
        sb.append(m25842a(this.f18894j, 0));
        sb.append(",");
        sb.append(m25842a(this.f18895k, Long.MAX_VALUE));
        sb.append(")");
        sb.append(",N=");
        sb.append(this.f18885a.mo17427h());
        sb.append(",C=");
        sb.append(this.f18885a.mo17433n());
        sb.append(",I=");
        sb.append(this.f18885a.mo17434o());
        sb.append(",F=");
        sb.append(this.f18896l);
        sb.append(",P=");
        sb.append(this.f18885a.mo17432m());
        sb.append(mo17414p() ? "(READY)" : "");
        sb.append("]");
        return sb.toString();
    }
}
