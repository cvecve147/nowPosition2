package p101d.p129g.p131b.p132a.p144g;

import com.google.android.gms.common.internal.C2061y;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: d.g.b.a.g.j */
public final class C5540j {

    /* renamed from: d.g.b.a.g.j$a */
    private static final class C5541a implements C5542b {

        /* renamed from: a */
        private final CountDownLatch f15455a;

        private C5541a() {
            this.f15455a = new CountDownLatch(1);
        }

        /* synthetic */ C5541a(C5557y yVar) {
            this();
        }

        /* renamed from: a */
        public final void mo14981a() {
            this.f15455a.countDown();
        }

        /* renamed from: a */
        public final void mo14982a(Exception exc) {
            this.f15455a.countDown();
        }

        /* renamed from: a */
        public final void mo14983a(Object obj) {
            this.f15455a.countDown();
        }

        /* renamed from: a */
        public final boolean mo15002a(long j, TimeUnit timeUnit) {
            return this.f15455a.await(j, timeUnit);
        }

        /* renamed from: b */
        public final void mo15003b() {
            this.f15455a.await();
        }
    }

    /* renamed from: d.g.b.a.g.j$b */
    interface C5542b extends C5531b, C5533d, C5534e<Object> {
    }

    /* renamed from: a */
    public static <TResult> C5536g<TResult> m21077a(Exception exc) {
        C5556x xVar = new C5556x();
        xVar.mo15013a(exc);
        return xVar;
    }

    /* renamed from: a */
    public static <TResult> C5536g<TResult> m21078a(TResult tresult) {
        C5556x xVar = new C5556x();
        xVar.mo15014a(tresult);
        return xVar;
    }

    /* renamed from: a */
    public static <TResult> C5536g<TResult> m21079a(Executor executor, Callable<TResult> callable) {
        C2061y.m9068a(executor, (Object) "Executor must not be null");
        C2061y.m9068a(callable, (Object) "Callback must not be null");
        C5556x xVar = new C5556x();
        executor.execute(new C5557y(xVar, callable));
        return xVar;
    }

    /* renamed from: a */
    public static <TResult> TResult m21080a(C5536g<TResult> gVar) {
        C2061y.m9070a();
        C2061y.m9068a(gVar, (Object) "Task must not be null");
        if (gVar.mo14994d()) {
            return m21083b(gVar);
        }
        C5541a aVar = new C5541a((C5557y) null);
        m21082a((C5536g<?>) gVar, (C5542b) aVar);
        aVar.mo15003b();
        return m21083b(gVar);
    }

    /* renamed from: a */
    public static <TResult> TResult m21081a(C5536g<TResult> gVar, long j, TimeUnit timeUnit) {
        C2061y.m9070a();
        C2061y.m9068a(gVar, (Object) "Task must not be null");
        C2061y.m9068a(timeUnit, (Object) "TimeUnit must not be null");
        if (gVar.mo14994d()) {
            return m21083b(gVar);
        }
        C5541a aVar = new C5541a((C5557y) null);
        m21082a((C5536g<?>) gVar, (C5542b) aVar);
        if (aVar.mo15002a(j, timeUnit)) {
            return m21083b(gVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    /* renamed from: a */
    private static void m21082a(C5536g<?> gVar, C5542b bVar) {
        gVar.mo14989a(C5538i.f15453b, (C5534e<? super Object>) bVar);
        gVar.mo14988a(C5538i.f15453b, (C5533d) bVar);
        gVar.mo14986a(C5538i.f15453b, (C5531b) bVar);
    }

    /* renamed from: b */
    private static <TResult> TResult m21083b(C5536g<TResult> gVar) {
        if (gVar.mo14995e()) {
            return gVar.mo14992b();
        }
        if (gVar.mo14993c()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(gVar.mo14990a());
    }
}
