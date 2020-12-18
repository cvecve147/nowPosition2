package p101d.p122f.p123a.p126c;

import android.content.Context;
import android.util.Log;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p101d.p122f.p123a.p126c.p127a.C5377a;
import p101d.p122f.p123a.p126c.p127a.p128a.C5381d;
import p208e.p209a.p210a.p211a.C6199f;
import p208e.p209a.p210a.p211a.C6208m;
import p208e.p209a.p210a.p211a.C6211p;
import p208e.p209a.p210a.p211a.p212a.p214b.C6077i;
import p208e.p209a.p210a.p211a.p212a.p214b.C6080l;
import p208e.p209a.p210a.p211a.p212a.p214b.C6090t;
import p208e.p209a.p210a.p211a.p212a.p214b.C6091u;
import p208e.p209a.p210a.p211a.p212a.p215c.C6120j;
import p208e.p209a.p210a.p211a.p212a.p215c.C6131s;
import p208e.p209a.p210a.p211a.p212a.p215c.C6132t;
import p208e.p209a.p210a.p211a.p212a.p218e.C6146c;
import p208e.p209a.p210a.p211a.p212a.p218e.C6156h;
import p208e.p209a.p210a.p211a.p212a.p219f.C6162b;
import p208e.p209a.p210a.p211a.p212a.p219f.C6164d;
import p208e.p209a.p210a.p211a.p212a.p220g.C6184s;
import p208e.p209a.p210a.p211a.p212a.p220g.C6188v;

@C6120j({C5377a.class})
/* renamed from: d.f.a.c.F */
public class C5351F extends C6208m<Void> {

    /* renamed from: g */
    private final long f15123g;

    /* renamed from: h */
    private final ConcurrentHashMap<String, String> f15124h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C5354G f15125i;

    /* renamed from: j */
    private C5354G f15126j;

    /* renamed from: k */
    private C5355H f15127k;

    /* renamed from: l */
    private C5446y f15128l;

    /* renamed from: m */
    private String f15129m;

    /* renamed from: n */
    private String f15130n;

    /* renamed from: o */
    private String f15131o;

    /* renamed from: p */
    private float f15132p;

    /* renamed from: q */
    private boolean f15133q;

    /* renamed from: r */
    private final C5400ba f15134r;

    /* renamed from: s */
    private C6156h f15135s;

    /* renamed from: t */
    private C5429m f15136t;

    /* renamed from: u */
    private C5377a f15137u;

    /* renamed from: d.f.a.c.F$a */
    private static final class C5352a implements Callable<Boolean> {

        /* renamed from: a */
        private final C5354G f15138a;

        public C5352a(C5354G g) {
            this.f15138a = g;
        }

        public Boolean call() {
            if (!this.f15138a.mo14769b()) {
                return Boolean.FALSE;
            }
            C6199f.m23420f().mo16269d("CrashlyticsCore", "Found previous crash marker.");
            this.f15138a.mo14770c();
            return Boolean.TRUE;
        }
    }

    /* renamed from: d.f.a.c.F$b */
    private static final class C5353b implements C5355H {
        private C5353b() {
        }

        /* synthetic */ C5353b(C5347B b) {
            this();
        }

        /* renamed from: a */
        public void mo14767a() {
        }
    }

    public C5351F() {
        this(1.0f, (C5355H) null, (C5400ba) null, false);
    }

    C5351F(float f, C5355H h, C5400ba baVar, boolean z) {
        this(f, h, baVar, z, C6090t.m23075a("Crashlytics Exception Handler"));
    }

    C5351F(float f, C5355H h, C5400ba baVar, boolean z, ExecutorService executorService) {
        this.f15129m = null;
        this.f15130n = null;
        this.f15131o = null;
        this.f15132p = f;
        this.f15127k = h == null ? new C5353b((C5347B) null) : h;
        this.f15134r = baVar;
        this.f15133q = z;
        this.f15136t = new C5429m(executorService);
        this.f15124h = new ConcurrentHashMap<>();
        this.f15123g = System.currentTimeMillis();
    }

    /* renamed from: D */
    private void m20611D() {
        if (Boolean.TRUE.equals((Boolean) this.f15136t.mo14876b(new C5352a(this.f15126j)))) {
            try {
                this.f15127k.mo14767a();
            } catch (Exception e) {
                C6199f.m23420f().mo16266b("CrashlyticsCore", "Exception thrown by CrashlyticsListener while notifying of previous crash.", e);
            }
        }
    }

    /* renamed from: E */
    private void m20612E() {
        String str;
        C6211p pVar;
        C5347B b = new C5347B(this);
        for (C6131s a : mo16306l()) {
            b.mo16115a(a);
        }
        Future submit = mo16307m().mo16281c().submit(b);
        C6199f.m23420f().mo16269d("CrashlyticsCore", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(4, TimeUnit.SECONDS);
            return;
        } catch (InterruptedException e) {
            e = e;
            pVar = C6199f.m23420f();
            str = "Crashlytics was interrupted during initialization.";
        } catch (ExecutionException e2) {
            e = e2;
            pVar = C6199f.m23420f();
            str = "Problem encountered during Crashlytics initialization.";
        } catch (TimeoutException e3) {
            e = e3;
            pVar = C6199f.m23420f();
            str = "Crashlytics timed out during initialization.";
        }
        pVar.mo16266b("CrashlyticsCore", str, e);
    }

    /* renamed from: a */
    static boolean m20614a(String str, boolean z) {
        if (!z) {
            C6199f.m23420f().mo16269d("CrashlyticsCore", "Configured not to require a build ID.");
            return true;
        } else if (!C6080l.m23051b(str)) {
            return true;
        } else {
            Log.e("CrashlyticsCore", ".");
            Log.e("CrashlyticsCore", ".     |  | ");
            Log.e("CrashlyticsCore", ".     |  |");
            Log.e("CrashlyticsCore", ".     |  |");
            Log.e("CrashlyticsCore", ".   \\ |  | /");
            Log.e("CrashlyticsCore", ".    \\    /");
            Log.e("CrashlyticsCore", ".     \\  /");
            Log.e("CrashlyticsCore", ".      \\/");
            Log.e("CrashlyticsCore", ".");
            Log.e("CrashlyticsCore", "This app relies on Crashlytics. Please sign up for access at https://fabric.io/sign_up,\ninstall an Android build tool and ask a team member to invite you to this app's organization.");
            Log.e("CrashlyticsCore", ".");
            Log.e("CrashlyticsCore", ".      /\\");
            Log.e("CrashlyticsCore", ".     /  \\");
            Log.e("CrashlyticsCore", ".    /    \\");
            Log.e("CrashlyticsCore", ".   / |  | \\");
            Log.e("CrashlyticsCore", ".     |  |");
            Log.e("CrashlyticsCore", ".     |  |");
            Log.e("CrashlyticsCore", ".     |  |");
            Log.e("CrashlyticsCore", ".");
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public String mo14756A() {
        if (mo16308n().mo16070a()) {
            return this.f15131o;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo14757B() {
        this.f15136t.mo14875a(new C5349D(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo14758C() {
        this.f15136t.mo14876b(new C5348C(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo14759a(Context context) {
        String c;
        Context context2 = context;
        if (this.f15133q || (c = new C6077i().mo16060c(context2)) == null) {
            return false;
        }
        String n = C6080l.m23066n(context);
        if (m20614a(n, C6080l.m23046a(context2, "com.crashlytics.RequireBuildId", true))) {
            try {
                C6211p f = C6199f.m23420f();
                f.mo16271e("CrashlyticsCore", "Initializing Crashlytics " + mo14664q());
                C6162b bVar = new C6162b(this);
                this.f15126j = new C5354G("crash_marker", bVar);
                this.f15125i = new C5354G("initialization_marker", bVar);
                C5402ca a = C5402ca.m20735a(new C6164d(mo16305k(), "com.crashlytics.android.core.CrashlyticsCore"), this);
                C5356I i = this.f15134r != null ? new C5356I(this.f15134r) : null;
                this.f15135s = new C6146c(C6199f.m23420f());
                this.f15135s.mo16180a(i);
                C6091u n2 = mo16308n();
                C5376a a2 = C5376a.m20685a(context2, n2, c, n);
                C5372W w = new C5372W(context2, a2.f15177d);
                C6211p f2 = C6199f.m23420f();
                f2.mo16269d("CrashlyticsCore", "Installer package name is: " + a2.f15176c);
                this.f15128l = new C5446y(this, this.f15136t, this.f15135s, n2, a, bVar, a2, w);
                boolean v = mo14761v();
                m20611D();
                this.f15128l.mo14895a(Thread.getDefaultUncaughtExceptionHandler());
                if (!v || !C6080l.m23050b(context)) {
                    C6199f.m23420f().mo16269d("CrashlyticsCore", "Exception handling initialization successful");
                    return true;
                }
                C6199f.m23420f().mo16269d("CrashlyticsCore", "Crashlytics did not finish previous background initialization. Initializing synchronously.");
                m20612E();
                return false;
            } catch (Exception e) {
                C6199f.m23420f().mo16266b("CrashlyticsCore", "Crashlytics was not started due to an exception during initialization", e);
                this.f15128l = null;
                return false;
            }
        } else {
            throw new C6132t("This app relies on Crashlytics. Please sign up for access at https://fabric.io/sign_up,\ninstall an Android build tool and ask a team member to invite you to this app's organization.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Void m20620c() {
        mo14758C();
        C5381d x = mo14763x();
        if (x != null) {
            this.f15128l.mo14893a(x);
        }
        this.f15128l.mo14898b();
        try {
            C6188v a = C6184s.m23368b().mo16254a();
            if (a == null) {
                C6199f.m23420f().mo16262a("CrashlyticsCore", "Received null settings, skipping report submission!");
                mo14757B();
                return null;
            } else if (!a.f17258d.f17226c) {
                C6199f.m23420f().mo16269d("CrashlyticsCore", "Collection of crash reports disabled in Crashlytics settings.");
                mo14757B();
                return null;
            } else {
                if (!this.f15128l.mo14899b(a.f17256b)) {
                    C6199f.m23420f().mo16269d("CrashlyticsCore", "Could not finalize previous sessions.");
                }
                this.f15128l.mo14891a(this.f15132p, a);
                mo14757B();
                return null;
            }
        } catch (Exception e) {
            C6199f.m23420f().mo16266b("CrashlyticsCore", "Crashlytics encountered a problem during asynchronous initialization.", e);
        } catch (Throwable th) {
            mo14757B();
            throw th;
        }
    }

    /* renamed from: o */
    public String mo14663o() {
        return "com.crashlytics.sdk.android.crashlytics-core";
    }

    /* renamed from: q */
    public String mo14664q() {
        return "2.3.17.dev";
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public boolean mo14675t() {
        return mo14759a(super.mo16305k());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo14760u() {
        this.f15126j.mo14768a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public boolean mo14761v() {
        return ((Boolean) this.f15136t.mo14876b(new C5350E(this))).booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public Map<String, String> mo14762w() {
        return Collections.unmodifiableMap(this.f15124h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public C5381d mo14763x() {
        C5377a aVar = this.f15137u;
        if (aVar != null) {
            return aVar.mo14807a();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public String mo14764y() {
        if (mo16308n().mo16070a()) {
            return this.f15130n;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public String mo14765z() {
        if (mo16308n().mo16070a()) {
            return this.f15129m;
        }
        return null;
    }
}
