package p208e.p221b.p228e.p229a;

import java.util.concurrent.atomic.AtomicReference;
import p208e.p221b.p225b.C6223b;
import p208e.p221b.p226c.C6236e;
import p208e.p221b.p228e.p230b.C6268b;
import p208e.p221b.p242g.C6416a;

/* renamed from: e.b.e.a.b */
public enum C6249b implements C6223b {
    DISPOSED;

    /* renamed from: a */
    public static boolean m23556a(C6223b bVar) {
        return bVar == DISPOSED;
    }

    /* renamed from: a */
    public static boolean m23557a(C6223b bVar, C6223b bVar2) {
        if (bVar2 == null) {
            C6416a.m23988b((Throwable) new NullPointerException("next is null"));
            return false;
        } else if (bVar == null) {
            return true;
        } else {
            bVar2.mo15709a();
            m23560b();
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m23558a(AtomicReference<C6223b> atomicReference) {
        C6223b andSet;
        C6223b bVar = atomicReference.get();
        C6249b bVar2 = DISPOSED;
        if (bVar == bVar2 || (andSet = atomicReference.getAndSet(bVar2)) == bVar2) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.mo15709a();
        return true;
    }

    /* renamed from: a */
    public static boolean m23559a(AtomicReference<C6223b> atomicReference, C6223b bVar) {
        C6223b bVar2;
        do {
            bVar2 = atomicReference.get();
            if (bVar2 == DISPOSED) {
                if (bVar == null) {
                    return false;
                }
                bVar.mo15709a();
                return false;
            }
        } while (!atomicReference.compareAndSet(bVar2, bVar));
        return true;
    }

    /* renamed from: b */
    public static void m23560b() {
        C6416a.m23988b((Throwable) new C6236e("Disposable already set!"));
    }

    /* renamed from: b */
    public static boolean m23561b(AtomicReference<C6223b> atomicReference, C6223b bVar) {
        C6223b bVar2;
        do {
            bVar2 = atomicReference.get();
            if (bVar2 == DISPOSED) {
                if (bVar == null) {
                    return false;
                }
                bVar.mo15709a();
                return false;
            }
        } while (!atomicReference.compareAndSet(bVar2, bVar));
        if (bVar2 == null) {
            return true;
        }
        bVar2.mo15709a();
        return true;
    }

    /* renamed from: c */
    public static boolean m23562c(AtomicReference<C6223b> atomicReference, C6223b bVar) {
        C6268b.m23590a(bVar, "d is null");
        if (atomicReference.compareAndSet((Object) null, bVar)) {
            return true;
        }
        bVar.mo15709a();
        if (atomicReference.get() == DISPOSED) {
            return false;
        }
        m23560b();
        return false;
    }

    /* renamed from: d */
    public static boolean m23563d(AtomicReference<C6223b> atomicReference, C6223b bVar) {
        if (atomicReference.compareAndSet((Object) null, bVar)) {
            return true;
        }
        if (atomicReference.get() != DISPOSED) {
            return false;
        }
        bVar.mo15709a();
        return false;
    }

    /* renamed from: a */
    public void mo15709a() {
    }
}
