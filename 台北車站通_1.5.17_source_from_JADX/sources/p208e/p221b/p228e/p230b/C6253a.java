package p208e.p221b.p228e.p230b;

import java.util.Comparator;
import java.util.concurrent.Callable;
import p208e.p221b.p226c.C6235d;
import p208e.p221b.p227d.C6239a;
import p208e.p221b.p227d.C6240b;
import p208e.p221b.p227d.C6242d;
import p208e.p221b.p227d.C6243e;
import p208e.p221b.p227d.C6244f;
import p208e.p221b.p227d.C6245g;
import p208e.p221b.p227d.C6246h;
import p208e.p221b.p242g.C6416a;
import p250g.p262c.C6585c;

/* renamed from: e.b.e.b.a */
public final class C6253a {

    /* renamed from: a */
    static final C6244f<Object, Object> f17365a = new C6262i();

    /* renamed from: b */
    public static final Runnable f17366b = new C6259f();

    /* renamed from: c */
    public static final C6239a f17367c = new C6256c();

    /* renamed from: d */
    static final C6242d<Object> f17368d = new C6257d();

    /* renamed from: e */
    public static final C6242d<Throwable> f17369e = new C6260g();

    /* renamed from: f */
    public static final C6242d<Throwable> f17370f = new C6266m();

    /* renamed from: g */
    public static final C6245g f17371g = new C6258e();

    /* renamed from: h */
    static final C6246h<Object> f17372h = new C6267n();

    /* renamed from: i */
    static final C6246h<Object> f17373i = new C6261h();

    /* renamed from: j */
    static final Callable<Object> f17374j = new C6265l();

    /* renamed from: k */
    static final Comparator<Object> f17375k = new C6264k();

    /* renamed from: l */
    public static final C6242d<C6585c> f17376l = new C6263j();

    /* renamed from: e.b.e.b.a$a */
    static final class C6254a<T1, T2, R> implements C6244f<Object[], R> {

        /* renamed from: a */
        final C6240b<? super T1, ? super T2, ? extends R> f17377a;

        C6254a(C6240b<? super T1, ? super T2, ? extends R> bVar) {
            this.f17377a = bVar;
        }

        /* renamed from: a */
        public R apply(Object[] objArr) {
            if (objArr.length == 2) {
                return this.f17377a.apply(objArr[0], objArr[1]);
            }
            throw new IllegalArgumentException("Array of size 2 expected but got " + objArr.length);
        }
    }

    /* renamed from: e.b.e.b.a$b */
    static final class C6255b<T1, T2, T3, R> implements C6244f<Object[], R> {

        /* renamed from: a */
        final C6243e<T1, T2, T3, R> f17378a;

        C6255b(C6243e<T1, T2, T3, R> eVar) {
            this.f17378a = eVar;
        }

        /* renamed from: a */
        public R apply(Object[] objArr) {
            if (objArr.length == 3) {
                return this.f17378a.mo13251a(objArr[0], objArr[1], objArr[2]);
            }
            throw new IllegalArgumentException("Array of size 3 expected but got " + objArr.length);
        }
    }

    /* renamed from: e.b.e.b.a$c */
    static final class C6256c implements C6239a {
        C6256c() {
        }

        public void run() {
        }

        public String toString() {
            return "EmptyAction";
        }
    }

    /* renamed from: e.b.e.b.a$d */
    static final class C6257d implements C6242d<Object> {
        C6257d() {
        }

        public void accept(Object obj) {
        }

        public String toString() {
            return "EmptyConsumer";
        }
    }

    /* renamed from: e.b.e.b.a$e */
    static final class C6258e implements C6245g {
        C6258e() {
        }

        public void accept(long j) {
        }
    }

    /* renamed from: e.b.e.b.a$f */
    static final class C6259f implements Runnable {
        C6259f() {
        }

        public void run() {
        }

        public String toString() {
            return "EmptyRunnable";
        }
    }

    /* renamed from: e.b.e.b.a$g */
    static final class C6260g implements C6242d<Throwable> {
        C6260g() {
        }

        /* renamed from: a */
        public void accept(Throwable th) {
            C6416a.m23988b(th);
        }
    }

    /* renamed from: e.b.e.b.a$h */
    static final class C6261h implements C6246h<Object> {
        C6261h() {
        }

        public boolean test(Object obj) {
            return false;
        }
    }

    /* renamed from: e.b.e.b.a$i */
    static final class C6262i implements C6244f<Object, Object> {
        C6262i() {
        }

        public Object apply(Object obj) {
            return obj;
        }

        public String toString() {
            return "IdentityFunction";
        }
    }

    /* renamed from: e.b.e.b.a$j */
    static final class C6263j implements C6242d<C6585c> {
        C6263j() {
        }

        /* renamed from: a */
        public void accept(C6585c cVar) {
            cVar.request(Long.MAX_VALUE);
        }
    }

    /* renamed from: e.b.e.b.a$k */
    static final class C6264k implements Comparator<Object> {
        C6264k() {
        }

        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    /* renamed from: e.b.e.b.a$l */
    static final class C6265l implements Callable<Object> {
        C6265l() {
        }

        public Object call() {
            return null;
        }
    }

    /* renamed from: e.b.e.b.a$m */
    static final class C6266m implements C6242d<Throwable> {
        C6266m() {
        }

        /* renamed from: a */
        public void accept(Throwable th) {
            C6416a.m23988b((Throwable) new C6235d(th));
        }
    }

    /* renamed from: e.b.e.b.a$n */
    static final class C6267n implements C6246h<Object> {
        C6267n() {
        }

        public boolean test(Object obj) {
            return true;
        }
    }

    /* renamed from: a */
    public static <T> C6242d<T> m23578a() {
        return f17368d;
    }

    /* renamed from: a */
    public static <T1, T2, R> C6244f<Object[], R> m23579a(C6240b<? super T1, ? super T2, ? extends R> bVar) {
        C6268b.m23590a(bVar, "f is null");
        return new C6254a(bVar);
    }

    /* renamed from: a */
    public static <T1, T2, T3, R> C6244f<Object[], R> m23580a(C6243e<T1, T2, T3, R> eVar) {
        C6268b.m23590a(eVar, "f is null");
        return new C6255b(eVar);
    }

    /* renamed from: b */
    public static <T> C6244f<T, T> m23581b() {
        return f17365a;
    }
}
