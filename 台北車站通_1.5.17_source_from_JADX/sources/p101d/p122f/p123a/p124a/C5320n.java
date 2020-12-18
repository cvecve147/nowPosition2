package p101d.p122f.p123a.p124a;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p208e.p209a.p210a.p211a.C6199f;

/* renamed from: d.f.a.a.n */
class C5320n {

    /* renamed from: a */
    private final ScheduledExecutorService f15056a;

    /* renamed from: b */
    private final List<C5321a> f15057b = new ArrayList();

    /* renamed from: c */
    private volatile boolean f15058c = true;

    /* renamed from: d */
    final AtomicReference<ScheduledFuture<?>> f15059d = new AtomicReference<>();

    /* renamed from: e */
    boolean f15060e = true;

    /* renamed from: d.f.a.a.n$a */
    public interface C5321a {
        /* renamed from: a */
        void mo14708a();
    }

    public C5320n(ScheduledExecutorService scheduledExecutorService) {
        this.f15056a = scheduledExecutorService;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m20531c() {
        for (C5321a a : this.f15057b) {
            a.mo14708a();
        }
    }

    /* renamed from: a */
    public void mo14704a() {
        if (this.f15058c && !this.f15060e) {
            this.f15060e = true;
            try {
                this.f15059d.compareAndSet((Object) null, this.f15056a.schedule(new C5319m(this), 5000, TimeUnit.MILLISECONDS));
            } catch (RejectedExecutionException e) {
                C6199f.m23420f().mo16268c("Answers", "Failed to schedule background detector", e);
            }
        }
    }

    /* renamed from: a */
    public void mo14705a(C5321a aVar) {
        this.f15057b.add(aVar);
    }

    /* renamed from: a */
    public void mo14706a(boolean z) {
        this.f15058c = z;
    }

    /* renamed from: b */
    public void mo14707b() {
        this.f15060e = false;
        ScheduledFuture andSet = this.f15059d.getAndSet((Object) null);
        if (andSet != null) {
            andSet.cancel(false);
        }
    }
}
