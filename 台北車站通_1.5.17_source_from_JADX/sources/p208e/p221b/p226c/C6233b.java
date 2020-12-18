package p208e.p221b.p226c;

import p208e.p221b.p228e.p240j.C6404g;

/* renamed from: e.b.c.b */
public final class C6233b {
    /* renamed from: a */
    public static RuntimeException m23528a(Throwable th) {
        throw C6404g.m23945a(th);
    }

    /* renamed from: b */
    public static void m23529b(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }
}
