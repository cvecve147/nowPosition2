package p208e.p209a.p210a.p211a.p212a.p215c;

import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p208e.p209a.p210a.p211a.p212a.p215c.C6110e;

/* renamed from: e.a.a.a.a.c.m */
public abstract class C6123m<Params, Progress, Result> extends C6110e<Params, Progress, Result> implements C6118h<C6131s>, C6127p, C6131s, C6117g {

    /* renamed from: o */
    private final C6128q f17113o = new C6128q();

    /* renamed from: e.a.a.a.a.c.m$a */
    private static class C6124a<Result> implements Executor {

        /* renamed from: a */
        private final Executor f17114a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C6123m f17115b;

        public C6124a(Executor executor, C6123m mVar) {
            this.f17114a = executor;
            this.f17115b = mVar;
        }

        public void execute(Runnable runnable) {
            this.f17114a.execute(new C6122l(this, runnable, (Object) null));
        }
    }

    /* renamed from: a */
    public void mo16115a(C6131s sVar) {
        if (mo16108d() == C6110e.C6114d.PENDING) {
            ((C6118h) ((C6127p) mo16145h())).mo16115a(sVar);
            return;
        }
        throw new IllegalStateException("Must not add Dependency after task is running");
    }

    /* renamed from: a */
    public void mo16140a(Throwable th) {
        ((C6131s) ((C6127p) mo16145h())).mo16140a(th);
    }

    /* renamed from: a */
    public final void mo16141a(ExecutorService executorService, Params... paramsArr) {
        super.mo16102a((Executor) new C6124a(executorService, this), paramsArr);
    }

    /* renamed from: a */
    public void mo16142a(boolean z) {
        ((C6131s) ((C6127p) mo16145h())).mo16142a(z);
    }

    /* renamed from: a */
    public boolean mo16143a() {
        return ((C6131s) ((C6127p) mo16145h())).mo16143a();
    }

    /* renamed from: b */
    public boolean mo16116b() {
        return ((C6118h) ((C6127p) mo16145h())).mo16116b();
    }

    /* renamed from: c */
    public Collection<C6131s> mo16117c() {
        return ((C6118h) ((C6127p) mo16145h())).mo16117c();
    }

    public int compareTo(Object obj) {
        return C6121k.m23160a(this, obj);
    }

    /* renamed from: h */
    public <T extends C6118h<C6131s> & C6127p & C6131s> T mo16145h() {
        return this.f17113o;
    }
}
