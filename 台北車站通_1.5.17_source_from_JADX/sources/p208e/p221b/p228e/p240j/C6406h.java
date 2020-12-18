package p208e.p221b.p228e.p240j;

import java.util.concurrent.atomic.AtomicInteger;
import p208e.p221b.p242g.C6416a;
import p250g.p262c.C6584b;

/* renamed from: e.b.e.j.h */
public final class C6406h {
    /* renamed from: a */
    public static <T> void m23948a(C6584b<? super T> bVar, T t, AtomicInteger atomicInteger, C6400c cVar) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            bVar.mo13389a(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable a = cVar.mo16501a();
                if (a != null) {
                    bVar.mo13390a(a);
                } else {
                    bVar.mo13391c();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m23949a(C6584b<?> bVar, Throwable th, AtomicInteger atomicInteger, C6400c cVar) {
        if (!cVar.mo16502a(th)) {
            C6416a.m23988b(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            bVar.mo13390a(cVar.mo16501a());
        }
    }

    /* renamed from: a */
    public static void m23950a(C6584b<?> bVar, AtomicInteger atomicInteger, C6400c cVar) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable a = cVar.mo16501a();
            if (a != null) {
                bVar.mo13390a(a);
            } else {
                bVar.mo13391c();
            }
        }
    }
}
