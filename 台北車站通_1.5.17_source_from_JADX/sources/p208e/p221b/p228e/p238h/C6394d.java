package p208e.p221b.p228e.p238h;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p208e.p221b.C6417h;
import p208e.p221b.p228e.p239i.C6397c;
import p208e.p221b.p228e.p240j.C6400c;
import p208e.p221b.p228e.p240j.C6406h;
import p250g.p262c.C6584b;
import p250g.p262c.C6585c;

/* renamed from: e.b.e.h.d */
public class C6394d<T> extends AtomicInteger implements C6417h<T>, C6585c {

    /* renamed from: a */
    final C6584b<? super T> f17749a;

    /* renamed from: b */
    final C6400c f17750b = new C6400c();

    /* renamed from: c */
    final AtomicLong f17751c = new AtomicLong();

    /* renamed from: d */
    final AtomicReference<C6585c> f17752d = new AtomicReference<>();

    /* renamed from: e */
    final AtomicBoolean f17753e = new AtomicBoolean();

    /* renamed from: f */
    volatile boolean f17754f;

    public C6394d(C6584b<? super T> bVar) {
        this.f17749a = bVar;
    }

    /* renamed from: a */
    public void mo13388a(C6585c cVar) {
        if (this.f17753e.compareAndSet(false, true)) {
            this.f17749a.mo13388a((C6585c) this);
            C6397c.m23932a(this.f17752d, this.f17751c, cVar);
            return;
        }
        cVar.cancel();
        cancel();
        mo13390a((Throwable) new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
    }

    /* renamed from: a */
    public void mo13389a(T t) {
        C6406h.m23948a(this.f17749a, t, (AtomicInteger) this, this.f17750b);
    }

    /* renamed from: a */
    public void mo13390a(Throwable th) {
        this.f17754f = true;
        C6406h.m23949a((C6584b<?>) this.f17749a, th, (AtomicInteger) this, this.f17750b);
    }

    /* renamed from: c */
    public void mo13391c() {
        this.f17754f = true;
        C6406h.m23950a(this.f17749a, this, this.f17750b);
    }

    public void cancel() {
        if (!this.f17754f) {
            C6397c.m23930a(this.f17752d);
        }
    }

    public void request(long j) {
        if (j <= 0) {
            cancel();
            mo13390a((Throwable) new IllegalArgumentException("§3.9 violated: positive request amount required but it was " + j));
            return;
        }
        C6397c.m23927a(this.f17752d, this.f17751c, j);
    }
}
