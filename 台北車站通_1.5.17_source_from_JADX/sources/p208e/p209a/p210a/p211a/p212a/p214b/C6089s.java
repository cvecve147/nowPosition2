package p208e.p209a.p210a.p211a.p212a.p214b;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import p208e.p209a.p210a.p211a.C6199f;
import p208e.p209a.p210a.p211a.C6211p;

/* renamed from: e.a.a.a.a.b.s */
class C6089s extends C6078j {

    /* renamed from: a */
    final /* synthetic */ String f17025a;

    /* renamed from: b */
    final /* synthetic */ ExecutorService f17026b;

    /* renamed from: c */
    final /* synthetic */ long f17027c;

    /* renamed from: d */
    final /* synthetic */ TimeUnit f17028d;

    C6089s(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
        this.f17025a = str;
        this.f17026b = executorService;
        this.f17027c = j;
        this.f17028d = timeUnit;
    }

    /* renamed from: a */
    public void mo14863a() {
        try {
            C6211p f = C6199f.m23420f();
            f.mo16269d("Fabric", "Executing shutdown hook for " + this.f17025a);
            this.f17026b.shutdown();
            if (!this.f17026b.awaitTermination(this.f17027c, this.f17028d)) {
                C6211p f2 = C6199f.m23420f();
                f2.mo16269d("Fabric", this.f17025a + " did not shut down in the allocated time. Requesting immediate shutdown.");
                this.f17026b.shutdownNow();
            }
        } catch (InterruptedException unused) {
            C6199f.m23420f().mo16269d("Fabric", String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[]{this.f17025a}));
            this.f17026b.shutdownNow();
        }
    }
}
