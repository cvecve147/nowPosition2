package p101d.p122f.p123a.p124a;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import java.util.concurrent.ScheduledExecutorService;
import p101d.p122f.p123a.p124a.C5301B;
import p101d.p122f.p123a.p124a.C5320n;
import p208e.p209a.p210a.p211a.C6193b;
import p208e.p209a.p210a.p211a.C6199f;
import p208e.p209a.p210a.p211a.C6208m;
import p208e.p209a.p210a.p211a.C6211p;
import p208e.p209a.p210a.p211a.p212a.p214b.C6090t;
import p208e.p209a.p210a.p211a.p212a.p214b.C6091u;
import p208e.p209a.p210a.p211a.p212a.p218e.C6146c;
import p208e.p209a.p210a.p211a.p212a.p219f.C6162b;
import p208e.p209a.p210a.p211a.p212a.p220g.C6167b;

/* renamed from: d.f.a.a.y */
class C5332y implements C5320n.C5321a {

    /* renamed from: a */
    private final long f15083a;

    /* renamed from: b */
    final C5314h f15084b;

    /* renamed from: c */
    final C6193b f15085c;

    /* renamed from: d */
    final C5320n f15086d;

    /* renamed from: e */
    final C5317k f15087e;

    C5332y(C5314h hVar, C6193b bVar, C5320n nVar, C5317k kVar, long j) {
        this.f15084b = hVar;
        this.f15085c = bVar;
        this.f15086d = nVar;
        this.f15087e = kVar;
        this.f15083a = j;
    }

    /* renamed from: a */
    public static C5332y m20564a(C6208m mVar, Context context, C6091u uVar, String str, String str2, long j) {
        Context context2 = context;
        C6091u uVar2 = uVar;
        C5306E e = new C5306E(context, uVar, str, str2);
        C5315i iVar = new C5315i(context, new C6162b(mVar));
        C6146c cVar = new C6146c(C6199f.m23420f());
        C6193b bVar = new C6193b(context);
        ScheduledExecutorService b = C6090t.m23078b("Answers Events Handler");
        C5320n nVar = new C5320n(b);
        return new C5332y(new C5314h(mVar, context, iVar, e, cVar, b), bVar, nVar, C5317k.m20525a(context), j);
    }

    /* renamed from: a */
    public void mo14708a() {
        C6199f.m23420f().mo16269d("Answers", "Flush events when app is backgrounded");
        this.f15084b.mo14690c();
    }

    /* renamed from: a */
    public void mo14727a(long j) {
        C6199f.m23420f().mo16269d("Answers", "Logged install");
        this.f15084b.mo14689b(C5301B.m20483a(j));
    }

    /* renamed from: a */
    public void mo14728a(Activity activity, C5301B.C5303b bVar) {
        C6211p f = C6199f.m23420f();
        f.mo16269d("Answers", "Logged lifecycle event: " + bVar.name());
        this.f15084b.mo14684a(C5301B.m20484a(bVar, activity));
    }

    /* renamed from: a */
    public void mo14729a(C6167b bVar, String str) {
        this.f15086d.mo14706a(bVar.f17192h);
        this.f15084b.mo14686a(bVar, str);
    }

    /* renamed from: a */
    public void mo14730a(String str, String str2) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C6199f.m23420f().mo16269d("Answers", "Logged crash");
            this.f15084b.mo14691c(C5301B.m20486a(str, str2));
            return;
        }
        throw new IllegalStateException("onCrash called from main thread!!!");
    }

    /* renamed from: b */
    public void mo14731b() {
        this.f15085c.mo16258a();
        this.f15084b.mo14683a();
    }

    /* renamed from: c */
    public void mo14732c() {
        this.f15084b.mo14688b();
        this.f15085c.mo16259a(new C5316j(this, this.f15086d));
        this.f15086d.mo14705a((C5320n.C5321a) this);
        if (mo14733d()) {
            mo14727a(this.f15083a);
            this.f15087e.mo14701b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo14733d() {
        return !this.f15087e.mo14700a();
    }
}
