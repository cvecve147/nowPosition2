package p208e.p221b.p242g;

import java.util.concurrent.Callable;
import p208e.p221b.C6221b;
import p208e.p221b.C6247e;
import p208e.p221b.C6427i;
import p208e.p221b.C6433l;
import p208e.p221b.C6438q;
import p208e.p221b.C6439r;
import p208e.p221b.C6444s;
import p208e.p221b.p226c.C6228a;
import p208e.p221b.p226c.C6234c;
import p208e.p221b.p226c.C6235d;
import p208e.p221b.p226c.C6237f;
import p208e.p221b.p227d.C6240b;
import p208e.p221b.p227d.C6242d;
import p208e.p221b.p227d.C6244f;
import p208e.p221b.p228e.p230b.C6268b;
import p208e.p221b.p228e.p240j.C6404g;
import p250g.p262c.C6584b;

/* renamed from: e.b.g.a */
public final class C6416a {

    /* renamed from: a */
    static volatile C6242d<? super Throwable> f17786a;

    /* renamed from: b */
    static volatile C6244f<? super Runnable, ? extends Runnable> f17787b;

    /* renamed from: c */
    static volatile C6244f<? super Callable<C6439r>, ? extends C6439r> f17788c;

    /* renamed from: d */
    static volatile C6244f<? super Callable<C6439r>, ? extends C6439r> f17789d;

    /* renamed from: e */
    static volatile C6244f<? super Callable<C6439r>, ? extends C6439r> f17790e;

    /* renamed from: f */
    static volatile C6244f<? super Callable<C6439r>, ? extends C6439r> f17791f;

    /* renamed from: g */
    static volatile C6244f<? super C6439r, ? extends C6439r> f17792g;

    /* renamed from: h */
    static volatile C6244f<? super C6439r, ? extends C6439r> f17793h;

    /* renamed from: i */
    static volatile C6244f<? super C6439r, ? extends C6439r> f17794i;

    /* renamed from: j */
    static volatile C6244f<? super C6247e, ? extends C6247e> f17795j;

    /* renamed from: k */
    static volatile C6244f<? super C6433l, ? extends C6433l> f17796k;

    /* renamed from: l */
    static volatile C6244f<? super C6427i, ? extends C6427i> f17797l;

    /* renamed from: m */
    static volatile C6244f<? super C6444s, ? extends C6444s> f17798m;

    /* renamed from: n */
    static volatile C6244f<? super C6221b, ? extends C6221b> f17799n;

    /* renamed from: o */
    static volatile C6240b<? super C6247e, ? super C6584b, ? extends C6584b> f17800o;

    /* renamed from: p */
    static volatile C6240b<? super C6433l, ? super C6438q, ? extends C6438q> f17801p;

    /* renamed from: a */
    public static C6221b m23972a(C6221b bVar) {
        C6244f<? super C6221b, ? extends C6221b> fVar = f17799n;
        return fVar != null ? (C6221b) m23983a(fVar, bVar) : bVar;
    }

    /* renamed from: a */
    public static <T> C6247e<T> m23973a(C6247e<T> eVar) {
        C6244f<? super C6247e, ? extends C6247e> fVar = f17795j;
        return fVar != null ? (C6247e) m23983a(fVar, eVar) : eVar;
    }

    /* renamed from: a */
    public static <T> C6427i<T> m23974a(C6427i<T> iVar) {
        C6244f<? super C6427i, ? extends C6427i> fVar = f17797l;
        return fVar != null ? (C6427i) m23983a(fVar, iVar) : iVar;
    }

    /* renamed from: a */
    public static <T> C6433l<T> m23975a(C6433l<T> lVar) {
        C6244f<? super C6433l, ? extends C6433l> fVar = f17796k;
        return fVar != null ? (C6433l) m23983a(fVar, lVar) : lVar;
    }

    /* renamed from: a */
    public static <T> C6438q<? super T> m23976a(C6433l<T> lVar, C6438q<? super T> qVar) {
        C6240b<? super C6433l, ? super C6438q, ? extends C6438q> bVar = f17801p;
        return bVar != null ? (C6438q) m23982a(bVar, lVar, qVar) : qVar;
    }

    /* renamed from: a */
    static C6439r m23977a(C6244f<? super Callable<C6439r>, ? extends C6439r> fVar, Callable<C6439r> callable) {
        Object a = m23983a(fVar, callable);
        C6268b.m23590a(a, "Scheduler Callable result can't be null");
        return (C6439r) a;
    }

    /* renamed from: a */
    public static C6439r m23978a(C6439r rVar) {
        C6244f<? super C6439r, ? extends C6439r> fVar = f17792g;
        return fVar == null ? rVar : (C6439r) m23983a(fVar, rVar);
    }

    /* renamed from: a */
    static C6439r m23979a(Callable<C6439r> callable) {
        try {
            C6439r call = callable.call();
            C6268b.m23590a(call, "Scheduler Callable result can't be null");
            return call;
        } catch (Throwable th) {
            throw C6404g.m23945a(th);
        }
    }

    /* renamed from: a */
    public static <T> C6444s<T> m23980a(C6444s<T> sVar) {
        C6244f<? super C6444s, ? extends C6444s> fVar = f17798m;
        return fVar != null ? (C6444s) m23983a(fVar, sVar) : sVar;
    }

    /* renamed from: a */
    public static <T> C6584b<? super T> m23981a(C6247e<T> eVar, C6584b<? super T> bVar) {
        C6240b<? super C6247e, ? super C6584b, ? extends C6584b> bVar2 = f17800o;
        return bVar2 != null ? (C6584b) m23982a(bVar2, eVar, bVar) : bVar;
    }

    /* renamed from: a */
    static <T, U, R> R m23982a(C6240b<T, U, R> bVar, T t, U u) {
        try {
            return bVar.apply(t, u);
        } catch (Throwable th) {
            throw C6404g.m23945a(th);
        }
    }

    /* renamed from: a */
    static <T, R> R m23983a(C6244f<T, R> fVar, T t) {
        try {
            return fVar.apply(t);
        } catch (Throwable th) {
            throw C6404g.m23945a(th);
        }
    }

    /* renamed from: a */
    public static Runnable m23984a(Runnable runnable) {
        C6244f<? super Runnable, ? extends Runnable> fVar = f17787b;
        return fVar == null ? runnable : (Runnable) m23983a(fVar, runnable);
    }

    /* renamed from: a */
    static boolean m23985a(Throwable th) {
        return (th instanceof C6235d) || (th instanceof C6234c) || (th instanceof IllegalStateException) || (th instanceof NullPointerException) || (th instanceof IllegalArgumentException) || (th instanceof C6228a);
    }

    /* renamed from: b */
    public static C6439r m23986b(C6439r rVar) {
        C6244f<? super C6439r, ? extends C6439r> fVar = f17794i;
        return fVar == null ? rVar : (C6439r) m23983a(fVar, rVar);
    }

    /* renamed from: b */
    public static C6439r m23987b(Callable<C6439r> callable) {
        C6268b.m23590a(callable, "Scheduler Callable can't be null");
        C6244f<? super Callable<C6439r>, ? extends C6439r> fVar = f17788c;
        return fVar == null ? m23979a(callable) : m23977a(fVar, callable);
    }

    /* renamed from: b */
    public static void m23988b(Throwable th) {
        C6242d<? super Throwable> dVar = f17786a;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!m23985a(th)) {
            th = new C6237f(th);
        }
        if (dVar != null) {
            try {
                dVar.accept(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                m23991c(th2);
            }
        }
        th.printStackTrace();
        m23991c(th);
    }

    /* renamed from: c */
    public static C6439r m23989c(C6439r rVar) {
        C6244f<? super C6439r, ? extends C6439r> fVar = f17793h;
        return fVar == null ? rVar : (C6439r) m23983a(fVar, rVar);
    }

    /* renamed from: c */
    public static C6439r m23990c(Callable<C6439r> callable) {
        C6268b.m23590a(callable, "Scheduler Callable can't be null");
        C6244f<? super Callable<C6439r>, ? extends C6439r> fVar = f17790e;
        return fVar == null ? m23979a(callable) : m23977a(fVar, callable);
    }

    /* renamed from: c */
    static void m23991c(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    /* renamed from: d */
    public static C6439r m23992d(Callable<C6439r> callable) {
        C6268b.m23590a(callable, "Scheduler Callable can't be null");
        C6244f<? super Callable<C6439r>, ? extends C6439r> fVar = f17791f;
        return fVar == null ? m23979a(callable) : m23977a(fVar, callable);
    }

    /* renamed from: e */
    public static C6439r m23993e(Callable<C6439r> callable) {
        C6268b.m23590a(callable, "Scheduler Callable can't be null");
        C6244f<? super Callable<C6439r>, ? extends C6439r> fVar = f17789d;
        return fVar == null ? m23979a(callable) : m23977a(fVar, callable);
    }
}
