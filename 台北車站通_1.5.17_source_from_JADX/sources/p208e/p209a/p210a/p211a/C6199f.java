package p208e.p209a.p210a.p211a;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import p208e.p209a.p210a.p211a.p212a.p214b.C6091u;
import p208e.p209a.p210a.p211a.p212a.p215c.C6120j;
import p208e.p209a.p210a.p211a.p212a.p215c.C6129r;
import p208e.p209a.p210a.p211a.p212a.p215c.C6131s;
import p208e.p209a.p210a.p211a.p212a.p215c.C6132t;

/* renamed from: e.a.a.a.f */
public class C6199f {

    /* renamed from: a */
    static volatile C6199f f17286a;

    /* renamed from: b */
    static final C6211p f17287b = new C6196c();

    /* renamed from: c */
    private final Context f17288c;

    /* renamed from: d */
    private final Map<Class<? extends C6208m>, C6208m> f17289d;

    /* renamed from: e */
    private final ExecutorService f17290e;

    /* renamed from: f */
    private final Handler f17291f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C6204j<C6199f> f17292g;

    /* renamed from: h */
    private final C6204j<?> f17293h;

    /* renamed from: i */
    private final C6091u f17294i;

    /* renamed from: j */
    private C6193b f17295j;

    /* renamed from: k */
    private WeakReference<Activity> f17296k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public AtomicBoolean f17297l = new AtomicBoolean(false);

    /* renamed from: m */
    final C6211p f17298m;

    /* renamed from: n */
    final boolean f17299n;

    /* renamed from: e.a.a.a.f$a */
    public static class C6200a {

        /* renamed from: a */
        private final Context f17300a;

        /* renamed from: b */
        private C6208m[] f17301b;

        /* renamed from: c */
        private C6129r f17302c;

        /* renamed from: d */
        private Handler f17303d;

        /* renamed from: e */
        private C6211p f17304e;

        /* renamed from: f */
        private boolean f17305f;

        /* renamed from: g */
        private String f17306g;

        /* renamed from: h */
        private String f17307h;

        /* renamed from: i */
        private C6204j<C6199f> f17308i;

        public C6200a(Context context) {
            if (context != null) {
                this.f17300a = context;
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }

        /* renamed from: a */
        public C6200a mo16286a(C6208m... mVarArr) {
            if (this.f17301b == null) {
                this.f17301b = mVarArr;
                return this;
            }
            throw new IllegalStateException("Kits already set.");
        }

        /* renamed from: a */
        public C6199f mo16287a() {
            if (this.f17302c == null) {
                this.f17302c = C6129r.m23192a();
            }
            if (this.f17303d == null) {
                this.f17303d = new Handler(Looper.getMainLooper());
            }
            if (this.f17304e == null) {
                this.f17304e = this.f17305f ? new C6196c(3) : new C6196c();
            }
            if (this.f17307h == null) {
                this.f17307h = this.f17300a.getPackageName();
            }
            if (this.f17308i == null) {
                this.f17308i = C6204j.f17312a;
            }
            C6208m[] mVarArr = this.f17301b;
            Map hashMap = mVarArr == null ? new HashMap() : C6199f.m23417b((Collection<? extends C6208m>) Arrays.asList(mVarArr));
            Context applicationContext = this.f17300a.getApplicationContext();
            return new C6199f(applicationContext, hashMap, this.f17302c, this.f17303d, this.f17304e, this.f17305f, this.f17308i, new C6091u(applicationContext, this.f17307h, this.f17306g, hashMap.values()), C6199f.m23419d(this.f17300a));
        }
    }

    C6199f(Context context, Map<Class<? extends C6208m>, C6208m> map, C6129r rVar, Handler handler, C6211p pVar, boolean z, C6204j jVar, C6091u uVar, Activity activity) {
        this.f17288c = context;
        this.f17289d = map;
        this.f17290e = rVar;
        this.f17291f = handler;
        this.f17298m = pVar;
        this.f17299n = z;
        this.f17292g = jVar;
        this.f17293h = mo16277a(map.size());
        this.f17294i = uVar;
        mo16276a(activity);
    }

    /* renamed from: a */
    public static C6199f m23411a(Context context, C6208m... mVarArr) {
        if (f17286a == null) {
            synchronized (C6199f.class) {
                if (f17286a == null) {
                    C6200a aVar = new C6200a(context);
                    aVar.mo16286a(mVarArr);
                    m23418c(aVar.mo16287a());
                }
            }
        }
        return f17286a;
    }

    /* renamed from: a */
    public static <T extends C6208m> T m23412a(Class<T> cls) {
        return (C6208m) m23422i().f17289d.get(cls);
    }

    /* renamed from: a */
    private static void m23415a(Map<Class<? extends C6208m>, C6208m> map, Collection<? extends C6208m> collection) {
        for (C6208m mVar : collection) {
            map.put(mVar.getClass(), mVar);
            if (mVar instanceof C6209n) {
                m23415a(map, ((C6209n) mVar).mo14661a());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Map<Class<? extends C6208m>, C6208m> m23417b(Collection<? extends C6208m> collection) {
        HashMap hashMap = new HashMap(collection.size());
        m23415a((Map<Class<? extends C6208m>, C6208m>) hashMap, collection);
        return hashMap;
    }

    /* renamed from: c */
    private static void m23418c(C6199f fVar) {
        f17286a = fVar;
        fVar.m23423j();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static Activity m23419d(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    /* renamed from: f */
    public static C6211p m23420f() {
        return f17286a == null ? f17287b : f17286a.f17298m;
    }

    /* renamed from: h */
    public static boolean m23421h() {
        if (f17286a == null) {
            return false;
        }
        return f17286a.f17299n;
    }

    /* renamed from: i */
    static C6199f m23422i() {
        if (f17286a != null) {
            return f17286a;
        }
        throw new IllegalStateException("Must Initialize Fabric before using singleton()");
    }

    /* renamed from: j */
    private void m23423j() {
        this.f17295j = new C6193b(this.f17288c);
        this.f17295j.mo16259a(new C6197d(this));
        mo16282c(this.f17288c);
    }

    /* renamed from: a */
    public C6193b mo16275a() {
        return this.f17295j;
    }

    /* renamed from: a */
    public C6199f mo16276a(Activity activity) {
        this.f17296k = new WeakReference<>(activity);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C6204j<?> mo16277a(int i) {
        return new C6198e(this, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16278a(Map<Class<? extends C6208m>, C6208m> map, C6208m mVar) {
        C6120j jVar = mVar.f17319f;
        if (jVar != null) {
            for (Class cls : jVar.value()) {
                if (cls.isInterface()) {
                    for (C6208m next : map.values()) {
                        if (cls.isAssignableFrom(next.getClass())) {
                            mVar.f17315b.mo16115a((C6131s) next.f17315b);
                        }
                    }
                } else if (map.get(cls) != null) {
                    mVar.f17315b.mo16115a((C6131s) map.get(cls).f17315b);
                } else {
                    throw new C6132t("Referenced Kit was null, does the kit exist?");
                }
            }
        }
    }

    /* renamed from: b */
    public Activity mo16279b() {
        WeakReference<Activity> weakReference = this.f17296k;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Future<Map<String, C6210o>> mo16280b(Context context) {
        return mo16281c().submit(new C6202h(context.getPackageCodePath()));
    }

    /* renamed from: c */
    public ExecutorService mo16281c() {
        return this.f17290e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo16282c(Context context) {
        StringBuilder sb;
        Future<Map<String, C6210o>> b = mo16280b(context);
        Collection<C6208m> e = mo16284e();
        C6212q qVar = new C6212q(b, e);
        ArrayList<C6208m> arrayList = new ArrayList<>(e);
        Collections.sort(arrayList);
        qVar.mo16300a(context, this, C6204j.f17312a, this.f17294i);
        for (C6208m a : arrayList) {
            a.mo16300a(context, this, this.f17293h, this.f17294i);
        }
        qVar.mo16311s();
        if (m23420f().mo16264a("Fabric", 3)) {
            sb = new StringBuilder("Initializing ");
            sb.append(mo16283d());
            sb.append(" [Version: ");
            sb.append(mo16285g());
            sb.append("], with the following kits:\n");
        } else {
            sb = null;
        }
        for (C6208m mVar : arrayList) {
            mVar.f17315b.mo16115a((C6131s) qVar.f17315b);
            mo16278a(this.f17289d, mVar);
            mVar.mo16311s();
            if (sb != null) {
                sb.append(mVar.mo14663o());
                sb.append(" [Version: ");
                sb.append(mVar.mo14664q());
                sb.append("]\n");
            }
        }
        if (sb != null) {
            m23420f().mo16269d("Fabric", sb.toString());
        }
    }

    /* renamed from: d */
    public String mo16283d() {
        return "io.fabric.sdk.android:fabric";
    }

    /* renamed from: e */
    public Collection<C6208m> mo16284e() {
        return this.f17289d.values();
    }

    /* renamed from: g */
    public String mo16285g() {
        return "1.3.17.dev";
    }
}
