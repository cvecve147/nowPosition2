package p101d.p119e.p120a;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: d.e.a.g */
public class C5273g implements C5291t {

    /* renamed from: a */
    private final Executor f14919a;

    /* renamed from: d.e.a.g$a */
    private class C5274a implements Runnable {

        /* renamed from: a */
        private final C5284q f14920a;

        /* renamed from: b */
        private final C5288s f14921b;

        /* renamed from: c */
        private final Runnable f14922c;

        public C5274a(C5284q qVar, C5288s sVar, Runnable runnable) {
            this.f14920a = qVar;
            this.f14921b = sVar;
            this.f14922c = runnable;
        }

        public void run() {
            if (this.f14920a.mo14649z()) {
                this.f14920a.mo14630b("canceled-at-delivery");
                return;
            }
            if (this.f14921b.mo14656a()) {
                this.f14920a.mo14592a(this.f14921b.f14970a);
            } else {
                this.f14920a.mo14625a(this.f14921b.f14972c);
            }
            if (this.f14921b.f14973d) {
                this.f14920a.mo14626a("intermediate-response");
            } else {
                this.f14920a.mo14630b("done");
            }
            Runnable runnable = this.f14922c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public C5273g(Handler handler) {
        this.f14919a = new C5272f(this, handler);
    }

    /* renamed from: a */
    public void mo14612a(C5284q<?> qVar, C5288s<?> sVar) {
        mo14613a(qVar, sVar, (Runnable) null);
    }

    /* renamed from: a */
    public void mo14613a(C5284q<?> qVar, C5288s<?> sVar, Runnable runnable) {
        qVar.mo14619A();
        qVar.mo14626a("post-response");
        this.f14919a.execute(new C5274a(qVar, sVar, runnable));
    }

    /* renamed from: a */
    public void mo14614a(C5284q<?> qVar, C5295x xVar) {
        qVar.mo14626a("post-error");
        this.f14919a.execute(new C5274a(qVar, C5288s.m20457a(xVar), (Runnable) null));
    }
}
