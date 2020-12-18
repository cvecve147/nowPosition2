package p208e.p209a.p210a.p211a;

import p208e.p209a.p210a.p211a.p212a.p214b.C6066B;
import p208e.p209a.p210a.p211a.p212a.p215c.C6121k;
import p208e.p209a.p210a.p211a.p212a.p215c.C6123m;
import p208e.p209a.p210a.p211a.p212a.p215c.C6132t;

/* renamed from: e.a.a.a.l */
class C6207l<Result> extends C6123m<Void, Void, Result> {

    /* renamed from: p */
    final C6208m<Result> f17313p;

    public C6207l(C6208m<Result> mVar) {
        this.f17313p = mVar;
    }

    /* renamed from: a */
    private C6066B m23445a(String str) {
        C6066B b = new C6066B(this.f17313p.mo14663o() + "." + str, "KitInitialization");
        b.mo16038a();
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Result mo16103a(Void... voidArr) {
        C6066B a = m23445a("doInBackground");
        Result c = !mo16109e() ? this.f17313p.mo14662c() : null;
        a.mo16039b();
        return c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo16104b(Result result) {
        this.f17313p.mo16301a(result);
        this.f17313p.f17317d.mo16273a((Exception) new C6206k(this.f17313p.mo14663o() + " Initialization was cancelled"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo16107c(Result result) {
        this.f17313p.mo16302b(result);
        this.f17313p.f17317d.mo16274a(result);
    }

    /* renamed from: f */
    public C6121k mo14752f() {
        return C6121k.HIGH;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo16110g() {
        super.mo16110g();
        C6066B a = m23445a("onPreExecute");
        try {
            boolean t = this.f17313p.mo14675t();
            a.mo16039b();
            if (t) {
                return;
            }
        } catch (C6132t e) {
            throw e;
        } catch (Exception e2) {
            C6199f.m23420f().mo16266b("Fabric", "Failure onPreExecute()", e2);
            a.mo16039b();
        } catch (Throwable th) {
            a.mo16039b();
            mo16106b(true);
            throw th;
        }
        mo16106b(true);
    }
}
