package p208e.p221b;

import java.util.concurrent.TimeUnit;
import p208e.p221b.p225b.C6223b;
import p208e.p221b.p226c.C6233b;
import p208e.p221b.p227d.C6239a;
import p208e.p221b.p227d.C6242d;
import p208e.p221b.p227d.C6245g;
import p208e.p221b.p227d.C6246h;
import p208e.p221b.p228e.p230b.C6253a;
import p208e.p221b.p228e.p230b.C6268b;
import p208e.p221b.p228e.p233e.p234a.C6286c;
import p208e.p221b.p228e.p233e.p234a.C6294d;
import p208e.p221b.p228e.p233e.p234a.C6296e;
import p208e.p221b.p228e.p233e.p234a.C6301g;
import p208e.p221b.p228e.p233e.p234a.C6302h;
import p208e.p221b.p228e.p233e.p234a.C6304i;
import p208e.p221b.p228e.p233e.p234a.C6308j;
import p208e.p221b.p228e.p233e.p234a.C6310k;
import p208e.p221b.p228e.p233e.p234a.C6314m;
import p208e.p221b.p228e.p233e.p234a.C6316n;
import p208e.p221b.p228e.p238h.C6393c;
import p208e.p221b.p228e.p238h.C6394d;
import p208e.p221b.p242g.C6416a;
import p208e.p221b.p243h.C6418a;
import p250g.p262c.C6583a;
import p250g.p262c.C6584b;
import p250g.p262c.C6585c;

/* renamed from: e.b.e */
public abstract class C6247e<T> implements C6583a<T> {

    /* renamed from: a */
    static final int f17357a = Math.max(16, Integer.getInteger("rx2.buffer-size", 128).intValue());

    /* renamed from: a */
    public static int m23533a() {
        return f17357a;
    }

    /* renamed from: a */
    public static C6247e<Long> m23534a(long j, long j2, TimeUnit timeUnit, C6439r rVar) {
        C6268b.m23590a(timeUnit, "unit is null");
        C6268b.m23590a(rVar, "scheduler is null");
        return C6416a.m23973a(new C6302h(Math.max(0, j), Math.max(0, j2), timeUnit, rVar));
    }

    /* renamed from: a */
    public static C6247e<Long> m23535a(long j, TimeUnit timeUnit) {
        return m23534a(j, j, timeUnit, C6418a.m23995a());
    }

    /* renamed from: a */
    public static C6247e<Long> m23536a(long j, TimeUnit timeUnit, C6439r rVar) {
        return m23534a(j, j, timeUnit, rVar);
    }

    /* renamed from: a */
    public static <T> C6247e<T> m23537a(C6415g<T> gVar, C6213a aVar) {
        C6268b.m23590a(gVar, "source is null");
        C6268b.m23590a(aVar, "mode is null");
        return C6416a.m23973a(new C6286c(gVar, aVar));
    }

    /* renamed from: a */
    public final C6223b mo16342a(C6242d<? super T> dVar, C6242d<? super Throwable> dVar2, C6239a aVar, C6242d<? super C6585c> dVar3) {
        C6268b.m23590a(dVar, "onNext is null");
        C6268b.m23590a(dVar2, "onError is null");
        C6268b.m23590a(aVar, "onComplete is null");
        C6268b.m23590a(dVar3, "onSubscribe is null");
        C6393c cVar = new C6393c(dVar, dVar2, aVar, dVar3);
        mo16349a(cVar);
        return cVar;
    }

    /* renamed from: a */
    public final C6247e<T> mo16343a(int i, boolean z, boolean z2) {
        C6268b.m23588a(i, "bufferSize");
        return C6416a.m23973a(new C6308j(this, i, z2, z, C6253a.f17367c));
    }

    /* renamed from: a */
    public final C6247e<T> mo16344a(C6242d<? super C6585c> dVar) {
        return mo16345a(dVar, C6253a.f17371g, C6253a.f17367c);
    }

    /* renamed from: a */
    public final C6247e<T> mo16345a(C6242d<? super C6585c> dVar, C6245g gVar, C6239a aVar) {
        C6268b.m23590a(dVar, "onSubscribe is null");
        C6268b.m23590a(gVar, "onRequest is null");
        C6268b.m23590a(aVar, "onCancel is null");
        return C6416a.m23973a(new C6294d(this, dVar, gVar, aVar));
    }

    /* renamed from: a */
    public final C6247e<T> mo16346a(C6246h<? super T> hVar) {
        C6268b.m23590a(hVar, "predicate is null");
        return C6416a.m23973a(new C6296e(this, hVar));
    }

    /* renamed from: a */
    public final C6247e<T> mo16347a(C6439r rVar) {
        return mo16348a(rVar, false, m23533a());
    }

    /* renamed from: a */
    public final C6247e<T> mo16348a(C6439r rVar, boolean z, int i) {
        C6268b.m23590a(rVar, "scheduler is null");
        C6268b.m23588a(i, "bufferSize");
        return C6416a.m23973a(new C6304i(this, rVar, z, i));
    }

    /* renamed from: a */
    public final void mo16349a(C6417h<? super T> hVar) {
        C6268b.m23590a(hVar, "s is null");
        try {
            C6584b<? super Object> a = C6416a.m23981a(this, hVar);
            C6268b.m23590a(a, "Plugin returned null Subscriber");
            mo16354b(a);
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

    /* renamed from: a */
    public final void mo16350a(C6584b<? super T> bVar) {
        if (bVar instanceof C6417h) {
            mo16349a((C6417h) bVar);
            return;
        }
        C6268b.m23590a(bVar, "s is null");
        mo16349a(new C6394d(bVar));
    }

    /* renamed from: b */
    public final C6223b mo16351b(C6242d<? super T> dVar) {
        return mo16342a(dVar, (C6242d<? super Throwable>) C6253a.f17370f, C6253a.f17367c, (C6242d<? super C6585c>) C6301g.INSTANCE);
    }

    /* renamed from: b */
    public final C6247e<T> mo16352b() {
        return mo16343a(m23533a(), false, true);
    }

    /* renamed from: b */
    public final C6247e<T> mo16353b(C6439r rVar) {
        C6268b.m23590a(rVar, "scheduler is null");
        return C6416a.m23973a(new C6316n(this, rVar, this instanceof C6286c));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo16354b(C6584b<? super T> bVar);

    /* renamed from: c */
    public final C6247e<T> mo16355c() {
        return C6416a.m23973a(new C6310k(this));
    }

    /* renamed from: d */
    public final C6247e<T> mo16356d() {
        return C6416a.m23973a(new C6314m(this));
    }
}
