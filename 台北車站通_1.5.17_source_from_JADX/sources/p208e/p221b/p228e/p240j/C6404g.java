package p208e.p221b.p228e.p240j;

import java.util.concurrent.atomic.AtomicReference;
import p208e.p221b.p226c.C6228a;

/* renamed from: e.b.e.j.g */
public final class C6404g {

    /* renamed from: a */
    public static final Throwable f17769a = new C6405a();

    /* renamed from: e.b.e.j.g$a */
    static final class C6405a extends Throwable {
        C6405a() {
            super("No further exceptions");
        }

        public Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: a */
    public static RuntimeException m23945a(Throwable th) {
        if (!(th instanceof Error)) {
            return th instanceof RuntimeException ? (RuntimeException) th : new RuntimeException(th);
        }
        throw ((Error) th);
    }

    /* renamed from: a */
    public static <T> Throwable m23946a(AtomicReference<Throwable> atomicReference) {
        Throwable th = atomicReference.get();
        Throwable th2 = f17769a;
        return th != th2 ? atomicReference.getAndSet(th2) : th;
    }

    /* renamed from: a */
    public static <T> boolean m23947a(AtomicReference<Throwable> atomicReference, Throwable th) {
        Throwable th2;
        Throwable th3;
        do {
            th2 = atomicReference.get();
            if (th2 == f17769a) {
                return false;
            }
            if (th2 == null) {
                th3 = th;
            } else {
                th3 = new C6228a(th2, th);
            }
        } while (!atomicReference.compareAndSet(th2, th3));
        return true;
    }
}
