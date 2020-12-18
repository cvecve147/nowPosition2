package p208e.p221b.p228e.p239i;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p208e.p221b.p226c.C6236e;
import p208e.p221b.p228e.p230b.C6268b;
import p208e.p221b.p228e.p240j.C6401d;
import p208e.p221b.p242g.C6416a;
import p250g.p262c.C6585c;

/* renamed from: e.b.e.i.c */
public enum C6397c implements C6585c {
    CANCELLED;

    /* renamed from: a */
    public static void m23926a() {
        C6416a.m23988b((Throwable) new C6236e("Subscription already set!"));
    }

    /* renamed from: a */
    public static void m23927a(AtomicReference<C6585c> atomicReference, AtomicLong atomicLong, long j) {
        C6585c cVar = atomicReference.get();
        if (cVar != null) {
            cVar.request(j);
        } else if (m23928a(j)) {
            C6401d.m23940a(atomicLong, j);
            C6585c cVar2 = atomicReference.get();
            if (cVar2 != null) {
                long andSet = atomicLong.getAndSet(0);
                if (andSet != 0) {
                    cVar2.request(andSet);
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m23928a(long j) {
        if (j > 0) {
            return true;
        }
        C6416a.m23988b((Throwable) new IllegalArgumentException("n > 0 required but it was " + j));
        return false;
    }

    /* renamed from: a */
    public static boolean m23929a(C6585c cVar, C6585c cVar2) {
        if (cVar2 == null) {
            C6416a.m23988b((Throwable) new NullPointerException("next is null"));
            return false;
        } else if (cVar == null) {
            return true;
        } else {
            cVar2.cancel();
            m23926a();
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m23930a(AtomicReference<C6585c> atomicReference) {
        C6585c andSet;
        C6585c cVar = atomicReference.get();
        C6397c cVar2 = CANCELLED;
        if (cVar == cVar2 || (andSet = atomicReference.getAndSet(cVar2)) == CANCELLED) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.cancel();
        return true;
    }

    /* renamed from: a */
    public static boolean m23931a(AtomicReference<C6585c> atomicReference, C6585c cVar) {
        C6268b.m23590a(cVar, "d is null");
        if (atomicReference.compareAndSet((Object) null, cVar)) {
            return true;
        }
        cVar.cancel();
        if (atomicReference.get() == CANCELLED) {
            return false;
        }
        m23926a();
        return false;
    }

    /* renamed from: a */
    public static boolean m23932a(AtomicReference<C6585c> atomicReference, AtomicLong atomicLong, C6585c cVar) {
        if (!m23931a(atomicReference, cVar)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0);
        if (andSet == 0) {
            return true;
        }
        cVar.request(andSet);
        return true;
    }

    public void cancel() {
    }

    public void request(long j) {
    }
}
