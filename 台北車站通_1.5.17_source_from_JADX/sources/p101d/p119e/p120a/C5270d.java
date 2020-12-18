package p101d.p119e.p120a;

import android.os.Process;
import java.util.concurrent.BlockingQueue;
import p101d.p119e.p120a.C5267b;

/* renamed from: d.e.a.d */
public class C5270d extends Thread {

    /* renamed from: a */
    private static final boolean f14907a = C5296y.f14977b;

    /* renamed from: b */
    private final BlockingQueue<C5284q<?>> f14908b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final BlockingQueue<C5284q<?>> f14909c;

    /* renamed from: d */
    private final C5267b f14910d;

    /* renamed from: e */
    private final C5291t f14911e;

    /* renamed from: f */
    private volatile boolean f14912f = false;

    public C5270d(BlockingQueue<C5284q<?>> blockingQueue, BlockingQueue<C5284q<?>> blockingQueue2, C5267b bVar, C5291t tVar) {
        this.f14908b = blockingQueue;
        this.f14909c = blockingQueue2;
        this.f14910d = bVar;
        this.f14911e = tVar;
    }

    /* renamed from: a */
    public void mo14605a() {
        this.f14912f = true;
        interrupt();
    }

    public void run() {
        BlockingQueue<C5284q<?>> blockingQueue;
        if (f14907a) {
            C5296y.m20472c("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f14910d.mo14577a();
        while (true) {
            try {
                C5284q take = this.f14908b.take();
                try {
                    take.mo14626a("cache-queue-take");
                    if (take.mo14649z()) {
                        take.mo14630b("cache-discard-canceled");
                    } else {
                        C5267b.C5268a aVar = this.f14910d.get(take.mo14635k());
                        if (aVar == null) {
                            take.mo14626a("cache-miss");
                            blockingQueue = this.f14909c;
                        } else if (aVar.mo14602a()) {
                            take.mo14626a("cache-hit-expired");
                            take.mo14622a(aVar);
                            blockingQueue = this.f14909c;
                        } else {
                            take.mo14626a("cache-hit");
                            C5288s a = take.mo14590a(new C5279l(aVar.f14898a, aVar.f14904g));
                            take.mo14626a("cache-hit-parsed");
                            if (!aVar.mo14603b()) {
                                this.f14911e.mo14612a((C5284q<?>) take, (C5288s<?>) a);
                            } else {
                                take.mo14626a("cache-hit-refresh-needed");
                                take.mo14622a(aVar);
                                a.f14973d = true;
                                this.f14911e.mo14613a(take, a, new C5269c(this, take));
                            }
                        }
                        blockingQueue.put(take);
                    }
                } catch (Exception e) {
                    C5296y.m20470a(e, "Unhandled exception %s", e.toString());
                }
            } catch (InterruptedException unused) {
                if (this.f14912f) {
                    return;
                }
            }
        }
    }
}
