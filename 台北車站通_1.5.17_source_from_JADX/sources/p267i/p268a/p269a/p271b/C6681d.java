package p267i.p268a.p269a.p271b;

import android.app.Activity;
import okhttp3.Callback;
import p267i.p268a.p269a.p270a.C6667g;
import p267i.p268a.p269a.p271b.p272a.C6677h;
import p267i.p274b.p277b.p278a.p279a.C6705b;
import p299tw.navin.navinmap.util.C7157a;

/* renamed from: i.a.a.b.d */
public class C6681d {

    /* renamed from: a */
    private static C6681d f18558a;

    /* renamed from: b */
    private final int f18559b = 0;

    /* renamed from: c */
    private final int f18560c = 1;

    /* renamed from: d */
    private final int f18561d = 2;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Activity f18562e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C6682a f18563f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String f18564g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f18565h = 0;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f18566i = 0;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final Object f18567j = new Object();

    /* renamed from: i.a.a.b.d$a */
    public interface C6682a {
        /* renamed from: a */
        void mo17129a(C6705b.C6706a aVar);

        /* renamed from: a */
        void mo17130a(String str);
    }

    /* renamed from: i.a.a.b.d$b */
    private class C6683b implements C6705b {
        private C6683b() {
        }

        /* renamed from: a */
        public void mo17122a(C6705b.C6706a aVar, Object obj) {
            synchronized (C6681d.this.f18567j) {
                C7157a.m26965a("Valid Token - errMsg:" + aVar.f18623b);
                C6681d.m25405e(C6681d.this);
                if (C6681d.this.f18566i >= 3) {
                    int unused = C6681d.this.f18565h = 0;
                    Activity unused2 = C6681d.this.f18562e = null;
                    if (C6681d.this.f18563f != null) {
                        C6681d.this.f18563f.mo17129a(aVar);
                    }
                } else {
                    C7157a.m26966b(String.format("Request Token - Retry: %d", new Object[]{Integer.valueOf(C6681d.this.f18566i)}));
                    C6681d.this.m25403c();
                }
            }
        }

        /* renamed from: a */
        public void mo17123a(Object obj) {
            synchronized (C6681d.this.f18567j) {
                String unused = C6681d.this.f18564g = (String) obj;
                int unused2 = C6681d.this.f18565h = 1;
                C6667g.m25353a(C6681d.this.f18562e, C6681d.this.f18564g);
                Activity unused3 = C6681d.this.f18562e = null;
                if (C6681d.this.f18563f != null) {
                    C6681d.this.f18563f.mo17130a(C6681d.this.f18564g);
                }
            }
        }
    }

    private C6681d() {
    }

    /* renamed from: a */
    public static C6681d m25398a() {
        if (f18558a == null) {
            f18558a = new C6681d();
        }
        return f18558a;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m25403c() {
        C6679b.m25389a((Callback) new C6677h(this.f18562e, new C6683b()), C6667g.m25352a(this.f18562e), C6667g.m25356b(this.f18562e), this.f18562e.getApplicationContext().getPackageName()).mo17157a();
    }

    /* renamed from: e */
    static /* synthetic */ int m25405e(C6681d dVar) {
        int i = dVar.f18566i;
        dVar.f18566i = i + 1;
        return i;
    }

    /* renamed from: a */
    public String mo17125a(Activity activity) {
        synchronized (this.f18567j) {
            if (this.f18564g == null && this.f18565h == 0) {
                this.f18564g = C6667g.m25358c(activity);
            }
        }
        return this.f18564g;
    }

    /* renamed from: a */
    public void mo17126a(C6682a aVar) {
        this.f18563f = aVar;
    }

    /* renamed from: b */
    public void mo17127b() {
        f18558a = null;
    }

    /* renamed from: b */
    public void mo17128b(Activity activity) {
        synchronized (this.f18567j) {
            if (this.f18565h != 2) {
                this.f18562e = activity;
                this.f18564g = null;
                this.f18565h = 2;
                this.f18566i = 0;
                C6667g.m25360d(activity);
                m25403c();
            }
        }
    }
}
