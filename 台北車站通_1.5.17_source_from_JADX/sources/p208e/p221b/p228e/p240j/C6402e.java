package p208e.p221b.p228e.p240j;

import java.util.concurrent.atomic.AtomicReference;
import p208e.p221b.p225b.C6223b;
import p208e.p221b.p226c.C6236e;
import p208e.p221b.p228e.p229a.C6249b;
import p208e.p221b.p228e.p230b.C6268b;
import p208e.p221b.p242g.C6416a;

/* renamed from: e.b.e.j.e */
public final class C6402e {
    /* renamed from: a */
    public static String m23942a(String str) {
        return "It is not allowed to subscribe with a(n) " + str + " multiple times. " + "Please create a fresh instance of " + str + " and subscribe that to the target source instead.";
    }

    /* renamed from: a */
    public static void m23943a(Class<?> cls) {
        C6416a.m23988b((Throwable) new C6236e(m23942a(cls.getName())));
    }

    /* renamed from: a */
    public static boolean m23944a(AtomicReference<C6223b> atomicReference, C6223b bVar, Class<?> cls) {
        C6268b.m23590a(bVar, "next is null");
        if (atomicReference.compareAndSet((Object) null, bVar)) {
            return true;
        }
        bVar.mo15709a();
        if (atomicReference.get() == C6249b.DISPOSED) {
            return false;
        }
        m23943a(cls);
        return false;
    }
}
