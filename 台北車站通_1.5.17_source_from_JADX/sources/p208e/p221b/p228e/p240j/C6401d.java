package p208e.p221b.p228e.p240j;

import java.util.concurrent.atomic.AtomicLong;
import p208e.p221b.p242g.C6416a;

/* renamed from: e.b.e.j.d */
public final class C6401d {
    /* renamed from: a */
    public static long m23939a(long j, long j2) {
        long j3 = j + j2;
        if (j3 < 0) {
            return Long.MAX_VALUE;
        }
        return j3;
    }

    /* renamed from: a */
    public static long m23940a(AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j2, m23939a(j2, j)));
        return j2;
    }

    /* renamed from: b */
    public static long m23941b(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j3 = j2 - j;
            if (j3 < 0) {
                C6416a.m23988b((Throwable) new IllegalStateException("More produced than requested: " + j3));
                j3 = 0;
            }
        } while (!atomicLong.compareAndSet(j2, j3));
        return j3;
    }
}
