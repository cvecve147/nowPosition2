package p208e.p221b.p222a.p223a;

import java.util.concurrent.Callable;
import p208e.p221b.C6439r;
import p208e.p221b.p226c.C6233b;
import p208e.p221b.p227d.C6244f;

/* renamed from: e.b.a.a.a */
public final class C6214a {

    /* renamed from: a */
    private static volatile C6244f<Callable<C6439r>, C6439r> f17340a;

    /* renamed from: b */
    private static volatile C6244f<C6439r, C6439r> f17341b;

    /* JADX WARNING: type inference failed for: r0v0, types: [e.b.d.f, e.b.d.f<java.util.concurrent.Callable<e.b.r>, e.b.r>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static p208e.p221b.C6439r m23495a(p208e.p221b.p227d.C6244f<java.util.concurrent.Callable<p208e.p221b.C6439r>, p208e.p221b.C6439r> r0, java.util.concurrent.Callable<p208e.p221b.C6439r> r1) {
        /*
            java.lang.Object r0 = m23498a(r0, r1)
            e.b.r r0 = (p208e.p221b.C6439r) r0
            if (r0 == 0) goto L_0x0009
            return r0
        L_0x0009:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Scheduler Callable returned null"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p208e.p221b.p222a.p223a.C6214a.m23495a(e.b.d.f, java.util.concurrent.Callable):e.b.r");
    }

    /* renamed from: a */
    public static C6439r m23496a(C6439r rVar) {
        if (rVar != null) {
            C6244f fVar = f17341b;
            return fVar == null ? rVar : (C6439r) m23498a(fVar, rVar);
        }
        throw new NullPointerException("scheduler == null");
    }

    /* renamed from: a */
    static C6439r m23497a(Callable<C6439r> callable) {
        try {
            C6439r call = callable.call();
            if (call != null) {
                return call;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            C6233b.m23528a(th);
            throw null;
        }
    }

    /* renamed from: a */
    static <T, R> R m23498a(C6244f<T, R> fVar, T t) {
        try {
            return fVar.apply(t);
        } catch (Throwable th) {
            C6233b.m23528a(th);
            throw null;
        }
    }

    /* renamed from: b */
    public static C6439r m23499b(Callable<C6439r> callable) {
        if (callable != null) {
            C6244f<Callable<C6439r>, C6439r> fVar = f17340a;
            return fVar == null ? m23497a(callable) : m23495a(fVar, callable);
        }
        throw new NullPointerException("scheduler == null");
    }
}
