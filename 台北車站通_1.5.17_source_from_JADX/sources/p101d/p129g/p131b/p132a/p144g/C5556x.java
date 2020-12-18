package p101d.p129g.p131b.p132a.p144g;

import com.google.android.gms.common.internal.C2061y;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: d.g.b.a.g.x */
final class C5556x<TResult> extends C5536g<TResult> {

    /* renamed from: a */
    private final Object f15483a = new Object();

    /* renamed from: b */
    private final C5554v<TResult> f15484b = new C5554v<>();

    /* renamed from: c */
    private boolean f15485c;

    /* renamed from: d */
    private volatile boolean f15486d;

    /* renamed from: e */
    private TResult f15487e;

    /* renamed from: f */
    private Exception f15488f;

    C5556x() {
    }

    /* renamed from: g */
    private final void m21107g() {
        C2061y.m9078b(this.f15485c, "Task is not yet complete");
    }

    /* renamed from: h */
    private final void m21108h() {
        C2061y.m9078b(!this.f15485c, "Task is already complete");
    }

    /* renamed from: i */
    private final void m21109i() {
        if (this.f15486d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    /* renamed from: j */
    private final void m21110j() {
        synchronized (this.f15483a) {
            if (this.f15485c) {
                this.f15484b.mo15010a(this);
            }
        }
    }

    /* renamed from: a */
    public final C5536g<TResult> mo14984a(C5532c<TResult> cVar) {
        mo14987a(C5538i.f15452a, cVar);
        return this;
    }

    /* renamed from: a */
    public final <TContinuationResult> C5536g<TContinuationResult> mo14985a(Executor executor, C5530a<TResult, TContinuationResult> aVar) {
        C5556x xVar = new C5556x();
        this.f15484b.mo15011a(new C5543k(executor, aVar, xVar));
        m21110j();
        return xVar;
    }

    /* renamed from: a */
    public final C5536g<TResult> mo14986a(Executor executor, C5531b bVar) {
        this.f15484b.mo15011a(new C5545m(executor, bVar));
        m21110j();
        return this;
    }

    /* renamed from: a */
    public final C5536g<TResult> mo14987a(Executor executor, C5532c<TResult> cVar) {
        this.f15484b.mo15011a(new C5547o(executor, cVar));
        m21110j();
        return this;
    }

    /* renamed from: a */
    public final C5536g<TResult> mo14988a(Executor executor, C5533d dVar) {
        this.f15484b.mo15011a(new C5549q(executor, dVar));
        m21110j();
        return this;
    }

    /* renamed from: a */
    public final C5536g<TResult> mo14989a(Executor executor, C5534e<? super TResult> eVar) {
        this.f15484b.mo15011a(new C5551s(executor, eVar));
        m21110j();
        return this;
    }

    /* renamed from: a */
    public final Exception mo14990a() {
        Exception exc;
        synchronized (this.f15483a) {
            exc = this.f15488f;
        }
        return exc;
    }

    /* renamed from: a */
    public final <X extends Throwable> TResult mo14991a(Class<X> cls) {
        TResult tresult;
        synchronized (this.f15483a) {
            m21107g();
            m21109i();
            if (cls.isInstance(this.f15488f)) {
                throw ((Throwable) cls.cast(this.f15488f));
            } else if (this.f15488f == null) {
                tresult = this.f15487e;
            } else {
                throw new C5535f(this.f15488f);
            }
        }
        return tresult;
    }

    /* renamed from: a */
    public final void mo15013a(Exception exc) {
        C2061y.m9068a(exc, (Object) "Exception must not be null");
        synchronized (this.f15483a) {
            m21108h();
            this.f15485c = true;
            this.f15488f = exc;
        }
        this.f15484b.mo15010a(this);
    }

    /* renamed from: a */
    public final void mo15014a(TResult tresult) {
        synchronized (this.f15483a) {
            m21108h();
            this.f15485c = true;
            this.f15487e = tresult;
        }
        this.f15484b.mo15010a(this);
    }

    /* renamed from: b */
    public final TResult mo14992b() {
        TResult tresult;
        synchronized (this.f15483a) {
            m21107g();
            m21109i();
            if (this.f15488f == null) {
                tresult = this.f15487e;
            } else {
                throw new C5535f(this.f15488f);
            }
        }
        return tresult;
    }

    /* renamed from: b */
    public final boolean mo15015b(Exception exc) {
        C2061y.m9068a(exc, (Object) "Exception must not be null");
        synchronized (this.f15483a) {
            if (this.f15485c) {
                return false;
            }
            this.f15485c = true;
            this.f15488f = exc;
            this.f15484b.mo15010a(this);
            return true;
        }
    }

    /* renamed from: b */
    public final boolean mo15016b(TResult tresult) {
        synchronized (this.f15483a) {
            if (this.f15485c) {
                return false;
            }
            this.f15485c = true;
            this.f15487e = tresult;
            this.f15484b.mo15010a(this);
            return true;
        }
    }

    /* renamed from: c */
    public final boolean mo14993c() {
        return this.f15486d;
    }

    /* renamed from: d */
    public final boolean mo14994d() {
        boolean z;
        synchronized (this.f15483a) {
            z = this.f15485c;
        }
        return z;
    }

    /* renamed from: e */
    public final boolean mo14995e() {
        boolean z;
        synchronized (this.f15483a) {
            z = this.f15485c && !this.f15486d && this.f15488f == null;
        }
        return z;
    }

    /* renamed from: f */
    public final boolean mo15017f() {
        synchronized (this.f15483a) {
            if (this.f15485c) {
                return false;
            }
            this.f15485c = true;
            this.f15486d = true;
            this.f15484b.mo15010a(this);
            return true;
        }
    }
}
