package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C1697X;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Lf */
public final class C2483Lf {
    /* renamed from: a */
    public static <T> C2748Uf<T> m10494a(Throwable th) {
        return new C2748Uf<>(th);
    }

    /* renamed from: a */
    public static <T> C2775Vf<T> m10495a(T t) {
        return new C2775Vf<>(t);
    }

    /* renamed from: a */
    public static <V> C2804Wf<V> m10496a(C2804Wf<V> wf, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        C3116gg ggVar = new C3116gg();
        m10504a(ggVar, wf);
        ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new C2602Pf(ggVar), j, timeUnit);
        m10503a(wf, ggVar);
        ggVar.mo8923a(new C2633Qf(schedule), C2972bg.f8939b);
        return ggVar;
    }

    /* renamed from: a */
    public static <A, B> C2804Wf<B> m10497a(C2804Wf<A> wf, C2341Gf<? super A, ? extends B> gf, Executor executor) {
        C3116gg ggVar = new C3116gg();
        wf.mo8923a(new C2570Of(ggVar, gf, wf), executor);
        m10504a(ggVar, wf);
        return ggVar;
    }

    /* renamed from: a */
    public static <A, B> C2804Wf<B> m10498a(C2804Wf<A> wf, C2371Hf<A, B> hf, Executor executor) {
        C3116gg ggVar = new C3116gg();
        wf.mo8923a(new C2541Nf(ggVar, hf, wf), executor);
        m10504a(ggVar, wf);
        return ggVar;
    }

    /* renamed from: a */
    public static <V, X extends Throwable> C2804Wf<V> m10499a(C2804Wf<? extends V> wf, Class<X> cls, C2341Gf<? super X, ? extends V> gf, Executor executor) {
        C3116gg ggVar = new C3116gg();
        m10504a(ggVar, wf);
        wf.mo8923a(new C2660Rf(ggVar, wf, cls, gf, executor), C2972bg.f8939b);
        return ggVar;
    }

    /* renamed from: a */
    public static <T> T m10500a(Future<T> future, T t) {
        try {
            return future.get(((Long) C3390pt.m13458f().mo8515a(C2558Nu.f7920kc)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e = e;
            future.cancel(true);
            C2227Cf.m9535c("InterruptedException caught while resolving future.", e);
            Thread.currentThread().interrupt();
            C1697X.m7702i().mo8322b(e, "Futures.resolveFuture");
            return t;
        } catch (Exception e2) {
            e = e2;
            future.cancel(true);
            C2227Cf.m9533b("Error waiting for future.", e);
            C1697X.m7702i().mo8322b(e, "Futures.resolveFuture");
            return t;
        }
    }

    /* renamed from: a */
    public static <T> T m10501a(Future<T> future, T t, long j, TimeUnit timeUnit) {
        try {
            return future.get(j, timeUnit);
        } catch (InterruptedException e) {
            e = e;
            future.cancel(true);
            C2227Cf.m9535c("InterruptedException caught while resolving future.", e);
            Thread.currentThread().interrupt();
            C1697X.m7702i().mo8319a(e, "Futures.resolveFuture");
            return t;
        } catch (Exception e2) {
            e = e2;
            future.cancel(true);
            C2227Cf.m9533b("Error waiting for future.", e);
            C1697X.m7702i().mo8319a(e, "Futures.resolveFuture");
            return t;
        }
    }

    /* renamed from: a */
    public static <V> void m10502a(C2804Wf<V> wf, C2399If<V> ifR, Executor executor) {
        wf.mo8923a(new C2513Mf(ifR, wf), executor);
    }

    /* renamed from: a */
    private static <V> void m10503a(C2804Wf<? extends V> wf, C3116gg<V> ggVar) {
        m10504a(ggVar, wf);
        wf.mo8923a(new C2691Sf(ggVar, wf), C2972bg.f8939b);
    }

    /* renamed from: a */
    private static <A, B> void m10504a(C2804Wf<A> wf, Future<B> future) {
        wf.mo8923a(new C2719Tf(wf, future), C2972bg.f8939b);
    }

    /* renamed from: a */
    static final /* synthetic */ void m10505a(C3116gg ggVar, C2341Gf gf, C2804Wf wf) {
        if (!ggVar.isCancelled()) {
            try {
                m10503a(gf.mo6904b(wf.get()), ggVar);
            } catch (CancellationException unused) {
                ggVar.cancel(true);
            } catch (ExecutionException e) {
                ggVar.mo9463a(e.getCause());
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                ggVar.mo9463a(e2);
            } catch (Exception e3) {
                ggVar.mo9463a(e3);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final /* synthetic */ void m10506a(com.google.android.gms.internal.ads.C3116gg r1, com.google.android.gms.internal.ads.C2804Wf r2, java.lang.Class r3, com.google.android.gms.internal.ads.C2341Gf r4, java.util.concurrent.Executor r5) {
        /*
            java.lang.Object r2 = r2.get()     // Catch:{ ExecutionException -> 0x0013, InterruptedException -> 0x000a, Exception -> 0x0008 }
            r1.mo9464b(r2)     // Catch:{ ExecutionException -> 0x0013, InterruptedException -> 0x000a, Exception -> 0x0008 }
            return
        L_0x0008:
            r2 = move-exception
            goto L_0x0018
        L_0x000a:
            r2 = move-exception
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L_0x0018
        L_0x0013:
            r2 = move-exception
            java.lang.Throwable r2 = r2.getCause()
        L_0x0018:
            boolean r3 = r3.isInstance(r2)
            if (r3 == 0) goto L_0x002a
            com.google.android.gms.internal.ads.Vf r2 = m10495a(r2)
            com.google.android.gms.internal.ads.Wf r2 = m10497a(r2, r4, (java.util.concurrent.Executor) r5)
            m10503a(r2, r1)
            return
        L_0x002a:
            r1.mo9463a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2483Lf.m10506a(com.google.android.gms.internal.ads.gg, com.google.android.gms.internal.ads.Wf, java.lang.Class, com.google.android.gms.internal.ads.Gf, java.util.concurrent.Executor):void");
    }
}
