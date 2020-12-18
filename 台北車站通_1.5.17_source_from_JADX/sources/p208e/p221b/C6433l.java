package p208e.p221b;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p208e.p221b.p225b.C6223b;
import p208e.p221b.p226c.C6233b;
import p208e.p221b.p227d.C6239a;
import p208e.p221b.p227d.C6240b;
import p208e.p221b.p227d.C6242d;
import p208e.p221b.p227d.C6243e;
import p208e.p221b.p227d.C6244f;
import p208e.p221b.p228e.p230b.C6253a;
import p208e.p221b.p228e.p230b.C6268b;
import p208e.p221b.p228e.p231c.C6277h;
import p208e.p221b.p228e.p232d.C6283d;
import p208e.p221b.p228e.p233e.p234a.C6299f;
import p208e.p221b.p228e.p233e.p234a.C6312l;
import p208e.p221b.p228e.p233e.p235b.C6320b;
import p208e.p221b.p228e.p233e.p235b.C6323c;
import p208e.p221b.p228e.p233e.p235b.C6328d;
import p208e.p221b.p228e.p233e.p235b.C6330e;
import p208e.p221b.p228e.p233e.p235b.C6332f;
import p208e.p221b.p228e.p233e.p235b.C6334g;
import p208e.p221b.p228e.p233e.p235b.C6335h;
import p208e.p221b.p228e.p233e.p235b.C6336i;
import p208e.p221b.p228e.p233e.p235b.C6339j;
import p208e.p221b.p228e.p233e.p235b.C6341k;
import p208e.p221b.p228e.p233e.p235b.C6343l;
import p208e.p221b.p228e.p233e.p235b.C6344m;
import p208e.p221b.p228e.p233e.p235b.C6345n;
import p208e.p221b.p228e.p233e.p235b.C6347o;
import p208e.p221b.p228e.p233e.p235b.C6348p;
import p208e.p221b.p228e.p233e.p235b.C6350q;
import p208e.p221b.p228e.p233e.p235b.C6353r;
import p208e.p221b.p228e.p233e.p235b.C6354s;
import p208e.p221b.p228e.p233e.p235b.C6355t;
import p208e.p221b.p228e.p233e.p235b.C6358u;
import p208e.p221b.p228e.p233e.p235b.C6360v;
import p208e.p221b.p228e.p240j.C6399b;
import p208e.p221b.p228e.p240j.C6403f;
import p208e.p221b.p242g.C6416a;
import p208e.p221b.p243h.C6418a;

/* renamed from: e.b.l */
public abstract class C6433l<T> implements C6436o<T> {
    /* renamed from: a */
    public static int m24011a() {
        return C6247e.m23533a();
    }

    /* renamed from: a */
    public static C6433l<Long> m24012a(long j, long j2, TimeUnit timeUnit) {
        return m24013a(j, j2, timeUnit, C6418a.m23995a());
    }

    /* renamed from: a */
    public static C6433l<Long> m24013a(long j, long j2, TimeUnit timeUnit, C6439r rVar) {
        C6268b.m23590a(timeUnit, "unit is null");
        C6268b.m23590a(rVar, "scheduler is null");
        return C6416a.m23975a(new C6345n(Math.max(0, j), Math.max(0, j2), timeUnit, rVar));
    }

    /* renamed from: a */
    public static C6433l<Long> m24014a(long j, TimeUnit timeUnit) {
        return m24015a(j, timeUnit, C6418a.m23995a());
    }

    /* renamed from: a */
    public static C6433l<Long> m24015a(long j, TimeUnit timeUnit, C6439r rVar) {
        C6268b.m23590a(timeUnit, "unit is null");
        C6268b.m23590a(rVar, "scheduler is null");
        return C6416a.m23975a(new C6358u(Math.max(j, 0), timeUnit, rVar));
    }

    /* renamed from: a */
    private C6433l<T> m24016a(C6242d<? super T> dVar, C6242d<? super Throwable> dVar2, C6239a aVar, C6239a aVar2) {
        C6268b.m23590a(dVar, "onNext is null");
        C6268b.m23590a(dVar2, "onError is null");
        C6268b.m23590a(aVar, "onComplete is null");
        C6268b.m23590a(aVar2, "onAfterTerminate is null");
        return C6416a.m23975a(new C6332f(this, dVar, dVar2, aVar, aVar2));
    }

    /* renamed from: a */
    public static <T, R> C6433l<R> m24017a(C6244f<? super Object[], ? extends R> fVar, boolean z, int i, C6436o<? extends T>... oVarArr) {
        if (oVarArr.length == 0) {
            return m24026b();
        }
        C6268b.m23590a(fVar, "zipper is null");
        C6268b.m23588a(i, "bufferSize");
        return C6416a.m23975a(new C6360v(oVarArr, (Iterable) null, fVar, i, z));
    }

    /* renamed from: a */
    public static <T> C6433l<T> m24018a(C6435n<T> nVar) {
        C6268b.m23590a(nVar, "source is null");
        return C6416a.m23975a(new C6328d(nVar));
    }

    /* renamed from: a */
    public static <T> C6433l<T> m24019a(C6436o<? extends C6436o<? extends T>> oVar) {
        return m24020a(oVar, m24011a());
    }

    /* renamed from: a */
    public static <T> C6433l<T> m24020a(C6436o<? extends C6436o<? extends T>> oVar, int i) {
        C6268b.m23590a(oVar, "sources is null");
        C6268b.m23588a(i, "prefetch");
        return C6416a.m23975a(new C6323c(oVar, C6253a.m23581b(), i, C6403f.IMMEDIATE));
    }

    /* renamed from: a */
    public static <T> C6433l<T> m24021a(C6436o<? extends T> oVar, C6436o<? extends T> oVar2) {
        C6268b.m23590a(oVar, "source1 is null");
        C6268b.m23590a(oVar2, "source2 is null");
        return m24025a((T[]) new C6436o[]{oVar, oVar2}).mo16537a(C6253a.m23581b(), false, 2);
    }

    /* renamed from: a */
    public static <T1, T2, R> C6433l<R> m24022a(C6436o<? extends T1> oVar, C6436o<? extends T2> oVar2, C6240b<? super T1, ? super T2, ? extends R> bVar) {
        C6268b.m23590a(oVar, "source1 is null");
        C6268b.m23590a(oVar2, "source2 is null");
        return m24017a(C6253a.m23579a(bVar), false, m24011a(), (C6436o<? extends T>[]) new C6436o[]{oVar, oVar2});
    }

    /* renamed from: a */
    public static <T1, T2, T3, R> C6433l<R> m24023a(C6436o<? extends T1> oVar, C6436o<? extends T2> oVar2, C6436o<? extends T3> oVar3, C6243e<? super T1, ? super T2, ? super T3, ? extends R> eVar) {
        C6268b.m23590a(oVar, "source1 is null");
        C6268b.m23590a(oVar2, "source2 is null");
        C6268b.m23590a(oVar3, "source3 is null");
        return m24017a(C6253a.m23580a(eVar), false, m24011a(), (C6436o<? extends T>[]) new C6436o[]{oVar, oVar2, oVar3});
    }

    /* renamed from: a */
    public static <T> C6433l<T> m24024a(Iterable<? extends T> iterable) {
        C6268b.m23590a(iterable, "source is null");
        return C6416a.m23975a(new C6341k(iterable));
    }

    /* renamed from: a */
    public static <T> C6433l<T> m24025a(T... tArr) {
        C6268b.m23590a(tArr, "items is null");
        return tArr.length == 0 ? m24026b() : tArr.length == 1 ? m24028b(tArr[0]) : C6416a.m23975a(new C6339j(tArr));
    }

    /* renamed from: b */
    public static <T> C6433l<T> m24026b() {
        return C6416a.m23975a(C6335h.f17552a);
    }

    /* renamed from: b */
    public static <T> C6433l<T> m24027b(C6436o<T> oVar) {
        C6268b.m23590a(oVar, "source is null");
        return oVar instanceof C6433l ? C6416a.m23975a((C6433l) oVar) : C6416a.m23975a(new C6343l(oVar));
    }

    /* renamed from: b */
    public static <T> C6433l<T> m24028b(T t) {
        C6268b.m23590a(t, "The item is null");
        return C6416a.m23975a(new C6347o(t));
    }

    /* renamed from: a */
    public final C6223b mo16526a(C6242d<? super T> dVar, C6242d<? super Throwable> dVar2) {
        return mo16527a(dVar, dVar2, C6253a.f17367c, (C6242d<? super C6223b>) C6253a.m23578a());
    }

    /* renamed from: a */
    public final C6223b mo16527a(C6242d<? super T> dVar, C6242d<? super Throwable> dVar2, C6239a aVar, C6242d<? super C6223b> dVar3) {
        C6268b.m23590a(dVar, "onNext is null");
        C6268b.m23590a(dVar2, "onError is null");
        C6268b.m23590a(aVar, "onComplete is null");
        C6268b.m23590a(dVar3, "onSubscribe is null");
        C6283d dVar4 = new C6283d(dVar, dVar2, aVar, dVar3);
        mo16542a(dVar4);
        return dVar4;
    }

    /* renamed from: a */
    public final C6247e<T> mo16528a(C6213a aVar) {
        C6299f fVar = new C6299f(this);
        int i = C6432k.f17817a[aVar.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? fVar.mo16352b() : C6416a.m23973a(new C6312l(fVar)) : fVar : fVar.mo16356d() : fVar.mo16355c();
    }

    /* renamed from: a */
    public final C6433l<List<T>> mo16529a(int i) {
        return mo16530a(i, i);
    }

    /* renamed from: a */
    public final C6433l<List<T>> mo16530a(int i, int i2) {
        return mo16531a(i, i2, C6399b.m23936a());
    }

    /* renamed from: a */
    public final <U extends Collection<? super T>> C6433l<U> mo16531a(int i, int i2, Callable<U> callable) {
        C6268b.m23588a(i, "count");
        C6268b.m23588a(i2, "skip");
        C6268b.m23590a(callable, "bufferSupplier is null");
        return C6416a.m23975a(new C6320b(this, i, i2, callable));
    }

    /* renamed from: a */
    public final C6433l<T> mo16532a(C6239a aVar) {
        C6268b.m23590a(aVar, "onFinally is null");
        return C6416a.m23975a(new C6330e(this, aVar));
    }

    /* renamed from: a */
    public final C6433l<T> mo16533a(C6242d<? super C6223b> dVar) {
        return mo16534a(dVar, C6253a.f17367c);
    }

    /* renamed from: a */
    public final C6433l<T> mo16534a(C6242d<? super C6223b> dVar, C6239a aVar) {
        C6268b.m23590a(dVar, "onSubscribe is null");
        C6268b.m23590a(aVar, "onDispose is null");
        return C6416a.m23975a(new C6334g(this, dVar, aVar));
    }

    /* renamed from: a */
    public final <R> C6433l<R> mo16535a(C6244f<? super T, ? extends C6436o<? extends R>> fVar) {
        return mo16536a(fVar, false);
    }

    /* renamed from: a */
    public final <R> C6433l<R> mo16536a(C6244f<? super T, ? extends C6436o<? extends R>> fVar, boolean z) {
        return mo16537a(fVar, z, Integer.MAX_VALUE);
    }

    /* renamed from: a */
    public final <R> C6433l<R> mo16537a(C6244f<? super T, ? extends C6436o<? extends R>> fVar, boolean z, int i) {
        return mo16538a(fVar, z, i, m24011a());
    }

    /* renamed from: a */
    public final <R> C6433l<R> mo16538a(C6244f<? super T, ? extends C6436o<? extends R>> fVar, boolean z, int i, int i2) {
        C6268b.m23590a(fVar, "mapper is null");
        C6268b.m23588a(i, "maxConcurrency");
        C6268b.m23588a(i2, "bufferSize");
        if (!(this instanceof C6277h)) {
            return C6416a.m23975a(new C6336i(this, fVar, z, i, i2));
        }
        Object call = ((C6277h) this).call();
        return call == null ? m24026b() : C6350q.m23799a(call, fVar);
    }

    /* renamed from: a */
    public final <R> C6433l<R> mo16539a(C6437p<? super T, ? extends R> pVar) {
        C6268b.m23590a(pVar, "composer is null");
        return m24027b(pVar.mo15998a(this));
    }

    /* renamed from: a */
    public final C6433l<T> mo16540a(C6439r rVar) {
        return mo16541a(rVar, false, m24011a());
    }

    /* renamed from: a */
    public final C6433l<T> mo16541a(C6439r rVar, boolean z, int i) {
        C6268b.m23590a(rVar, "scheduler is null");
        C6268b.m23588a(i, "bufferSize");
        return C6416a.m23975a(new C6348p(this, rVar, z, i));
    }

    /* renamed from: a */
    public final void mo16542a(C6438q<? super T> qVar) {
        C6268b.m23590a(qVar, "observer is null");
        try {
            C6438q<? super Object> a = C6416a.m23976a(this, qVar);
            C6268b.m23590a(a, "Plugin returned null Observer");
            mo15707b(a);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C6233b.m23529b(th);
            C6416a.m23988b(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: b */
    public final C6223b mo16543b(C6242d<? super T> dVar) {
        return mo16527a(dVar, (C6242d<? super Throwable>) C6253a.f17370f, C6253a.f17367c, (C6242d<? super C6223b>) C6253a.m23578a());
    }

    /* renamed from: b */
    public final C6433l<T> mo16544b(C6239a aVar) {
        return m24016a(C6253a.m23578a(), (C6242d<? super Throwable>) C6253a.m23578a(), aVar, C6253a.f17367c);
    }

    /* renamed from: b */
    public final C6433l<T> mo16545b(C6439r rVar) {
        C6268b.m23590a(rVar, "scheduler is null");
        return C6416a.m23975a(new C6355t(this, rVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo15707b(C6438q<? super T> qVar);

    /* renamed from: d */
    public final C6221b mo16546d() {
        return C6416a.m23972a((C6221b) new C6344m(this));
    }

    /* renamed from: e */
    public final C6427i<T> mo16547e() {
        return C6416a.m23974a(new C6353r(this));
    }

    /* renamed from: f */
    public final C6444s<T> mo16548f() {
        return C6416a.m23980a(new C6354s(this, null));
    }
}
