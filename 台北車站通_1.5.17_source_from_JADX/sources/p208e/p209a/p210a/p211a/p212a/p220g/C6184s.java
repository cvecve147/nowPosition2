package p208e.p209a.p210a.p211a.p212a.p220g;

import android.content.Context;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import p208e.p209a.p210a.p211a.C6199f;
import p208e.p209a.p210a.p211a.C6208m;
import p208e.p209a.p210a.p211a.p212a.p214b.C6065A;
import p208e.p209a.p210a.p211a.p212a.p214b.C6077i;
import p208e.p209a.p210a.p211a.p212a.p214b.C6080l;
import p208e.p209a.p210a.p211a.p212a.p214b.C6085o;
import p208e.p209a.p210a.p211a.p212a.p214b.C6091u;
import p208e.p209a.p210a.p211a.p212a.p218e.C6156h;

/* renamed from: e.a.a.a.a.g.s */
public class C6184s {

    /* renamed from: a */
    private final AtomicReference<C6188v> f17246a;

    /* renamed from: b */
    private final CountDownLatch f17247b;

    /* renamed from: c */
    private C6187u f17248c;

    /* renamed from: d */
    private boolean f17249d;

    /* renamed from: e.a.a.a.a.g.s$a */
    static class C6185a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C6184s f17250a = new C6184s();
    }

    private C6184s() {
        this.f17246a = new AtomicReference<>();
        this.f17247b = new CountDownLatch(1);
        this.f17249d = false;
    }

    /* renamed from: a */
    private void m23367a(C6188v vVar) {
        this.f17246a.set(vVar);
        this.f17247b.countDown();
    }

    /* renamed from: b */
    public static C6184s m23368b() {
        return C6185a.f17250a;
    }

    /* renamed from: a */
    public synchronized C6184s mo16253a(C6208m mVar, C6091u uVar, C6156h hVar, String str, String str2, String str3) {
        C6208m mVar2 = mVar;
        synchronized (this) {
            if (this.f17249d) {
                return this;
            }
            if (this.f17248c == null) {
                Context k = mVar.mo16305k();
                String e = uVar.mo16074e();
                String c = new C6077i().mo16060c(k);
                String i = uVar.mo16078i();
                C6065A a = new C6065A();
                C6177l lVar = new C6177l();
                C6175j jVar = new C6175j(mVar2);
                String c2 = C6080l.m23052c(k);
                String str4 = str3;
                C6178m mVar3 = new C6178m(mVar2, str4, String.format(Locale.US, "https://settings.crashlytics.com/spi/v2/platforms/android/apps/%s/settings", new Object[]{e}), hVar);
                String j = uVar.mo16079j();
                String k2 = uVar.mo16080k();
                String str5 = k2;
                String str6 = str2;
                String str7 = str;
                C6208m mVar4 = mVar;
                this.f17248c = new C6176k(mVar4, new C6191y(c, j, str5, uVar.mo16081l(), uVar.mo16071b(), uVar.mo16075f(), uVar.mo16073d(), C6080l.m23038a(C6080l.m23066n(k)), str6, str7, C6085o.m23071a(i).getId(), c2), a, lVar, jVar, mVar3);
            }
            this.f17249d = true;
            return this;
        }
    }

    /* renamed from: a */
    public C6188v mo16254a() {
        try {
            this.f17247b.await();
            return this.f17246a.get();
        } catch (InterruptedException unused) {
            C6199f.m23420f().mo16265b("Fabric", "Interrupted while waiting for settings data.");
            return null;
        }
    }

    /* renamed from: c */
    public synchronized boolean mo16255c() {
        C6188v a;
        a = this.f17248c.mo16243a();
        m23367a(a);
        return a != null;
    }

    /* renamed from: d */
    public synchronized boolean mo16256d() {
        C6188v a;
        a = this.f17248c.mo16244a(C6186t.SKIP_CACHE_LOOKUP);
        m23367a(a);
        if (a == null) {
            C6199f.m23420f().mo16266b("Fabric", "Failed to force reload of settings from Crashlytics.", (Throwable) null);
        }
        return a != null;
    }
}
