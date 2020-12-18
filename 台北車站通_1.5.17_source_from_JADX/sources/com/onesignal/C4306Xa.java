package com.onesignal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.onesignal.C4264M;
import com.onesignal.C4390kb;
import com.onesignal.C4414ra;
import com.onesignal.C4416rb;
import com.onesignal.C4419sa;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.Xa */
public class C4306Xa {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public static boolean f12732A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public static boolean f12733B;

    /* renamed from: C */
    private static boolean f12734C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public static C4264M.C4270f f12735D;

    /* renamed from: E */
    static boolean f12736E = true;

    /* renamed from: F */
    static C4307a f12737F;

    /* renamed from: G */
    private static Collection<JSONArray> f12738G = new ArrayList();

    /* renamed from: H */
    private static HashSet<String> f12739H = new HashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: I */
    public static ArrayList<C4312f> f12740I = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: J */
    public static boolean f12741J;

    /* renamed from: K */
    private static boolean f12742K;

    /* renamed from: L */
    static boolean f12743L = false;

    /* renamed from: M */
    static C4402o f12744M;

    /* renamed from: N */
    static C4390kb.C4392b f12745N;

    /* renamed from: O */
    private static C4450za f12746O;

    /* renamed from: P */
    static C4450za f12747P;

    /* renamed from: Q */
    private static C4447ya<Object, C4223Aa> f12748Q;

    /* renamed from: R */
    private static OSSubscriptionState f12749R;

    /* renamed from: S */
    static OSSubscriptionState f12750S;

    /* renamed from: T */
    private static C4447ya<C4226Ba, C4229Ca> f12751T;

    /* renamed from: U */
    private static C4360ea f12752U;

    /* renamed from: V */
    private static C4313g f12753V;

    /* renamed from: W */
    private static C4441wb f12754W;

    /* renamed from: a */
    private static C4311e f12755a;

    /* renamed from: b */
    private static C4311e f12756b;

    /* renamed from: c */
    static String f12757c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static String f12758d;

    /* renamed from: e */
    static Context f12759e;

    /* renamed from: f */
    private static C4316j f12760f = C4316j.NONE;

    /* renamed from: g */
    private static C4316j f12761g = C4316j.WARN;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static String f12762h = null;

    /* renamed from: i */
    private static String f12763i = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static int f12764j;

    /* renamed from: k */
    static boolean f12765k;

    /* renamed from: l */
    private static boolean f12766l;

    /* renamed from: m */
    static ExecutorService f12767m;

    /* renamed from: n */
    public static ConcurrentLinkedQueue<Runnable> f12768n = new ConcurrentLinkedQueue<>();

    /* renamed from: o */
    static AtomicLong f12769o = new AtomicLong();

    /* renamed from: p */
    private static C4314h f12770p;

    /* renamed from: q */
    private static long f12771q = 1;

    /* renamed from: r */
    private static long f12772r = -1;

    /* renamed from: s */
    private static C4273Mb f12773s;

    /* renamed from: t */
    private static C4248Hb f12774t;

    /* renamed from: u */
    private static C4254Ib f12775u;

    /* renamed from: v */
    private static C4359e f12776v = new C4355d();

    /* renamed from: w */
    private static int f12777w;

    /* renamed from: x */
    public static String f12778x = "native";

    /* renamed from: y */
    private static C4252Ia f12779y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public static String f12780z;

    /* renamed from: com.onesignal.Xa$a */
    public static class C4307a {

        /* renamed from: a */
        Context f12781a;

        /* renamed from: b */
        C4317k f12782b;

        /* renamed from: c */
        C4318l f12783c;

        /* renamed from: d */
        C4315i f12784d;

        /* renamed from: e */
        boolean f12785e;

        /* renamed from: f */
        boolean f12786f;

        /* renamed from: g */
        boolean f12787g;

        /* renamed from: h */
        boolean f12788h;

        /* renamed from: i */
        boolean f12789i;

        /* renamed from: j */
        C4319m f12790j;

        private C4307a() {
            this.f12790j = C4319m.InAppAlert;
        }

        private C4307a(Context context) {
            this.f12790j = C4319m.InAppAlert;
            this.f12781a = context;
        }

        /* synthetic */ C4307a(Context context, C4282Pa pa) {
            this(context);
        }

        /* synthetic */ C4307a(C4282Pa pa) {
            this();
        }

        /* renamed from: a */
        public C4307a mo12425a(C4317k kVar) {
            this.f12782b = kVar;
            return this;
        }

        /* renamed from: a */
        public C4307a mo12426a(boolean z) {
            this.f12785e = z;
            return this;
        }

        /* renamed from: a */
        public void mo12427a() {
            C4306Xa.m17153b(this);
        }

        /* renamed from: b */
        public C4307a mo12428b(boolean z) {
            this.f12787g = z;
            return this;
        }
    }

    /* renamed from: com.onesignal.Xa$b */
    public interface C4308b {
        /* renamed from: a */
        void mo12429a(C4320n nVar);

        /* renamed from: a */
        void mo12430a(JSONObject jSONObject);
    }

    /* renamed from: com.onesignal.Xa$c */
    public enum C4309c {
        VALIDATION,
        REQUIRES_EMAIL_AUTH,
        INVALID_OPERATION,
        NETWORK
    }

    /* renamed from: com.onesignal.Xa$d */
    public static class C4310d {

        /* renamed from: a */
        private C4309c f12796a;

        /* renamed from: b */
        private String f12797b;

        C4310d(C4309c cVar, String str) {
            this.f12796a = cVar;
            this.f12797b = str;
        }
    }

    /* renamed from: com.onesignal.Xa$e */
    public interface C4311e {
        /* renamed from: a */
        void mo12431a(C4310d dVar);

        void onSuccess();
    }

    /* renamed from: com.onesignal.Xa$f */
    public interface C4312f {
        /* renamed from: a */
        void mo12433a(JSONObject jSONObject);
    }

    /* renamed from: com.onesignal.Xa$g */
    private static class C4313g {

        /* renamed from: a */
        JSONArray f12798a;

        /* renamed from: b */
        boolean f12799b;

        /* renamed from: c */
        C4416rb.C4417a f12800c;

        C4313g(JSONArray jSONArray) {
            this.f12798a = jSONArray;
        }
    }

    /* renamed from: com.onesignal.Xa$h */
    public interface C4314h {
        /* renamed from: a */
        void mo12434a(String str, String str2);
    }

    /* renamed from: com.onesignal.Xa$i */
    public interface C4315i {
        /* renamed from: a */
        void mo12435a(C4368ga gaVar);
    }

    /* renamed from: com.onesignal.Xa$j */
    public enum C4316j {
        NONE,
        FATAL,
        ERROR,
        WARN,
        INFO,
        DEBUG,
        VERBOSE
    }

    /* renamed from: com.onesignal.Xa$k */
    public interface C4317k {
        /* renamed from: a */
        void mo5610a(C4432ua uaVar);
    }

    /* renamed from: com.onesignal.Xa$l */
    public interface C4318l {
        /* renamed from: a */
        void mo12436a(C4414ra raVar);
    }

    /* renamed from: com.onesignal.Xa$m */
    public enum C4319m {
        None,
        InAppAlert,
        Notification
    }

    /* renamed from: com.onesignal.Xa$n */
    public static class C4320n {

        /* renamed from: a */
        private String f12813a;

        /* renamed from: b */
        private int f12814b;

        C4320n(int i, String str) {
            this.f12813a = str;
            this.f12814b = i;
        }
    }

    /* renamed from: A */
    static void m17096A() {
        f12766l = true;
        C4264M.m16932f();
        f12771q = SystemClock.elapsedRealtime();
        m17101F();
        C4273Mb mb = f12773s;
        if (mb != null) {
            mb.mo12359b();
        }
        C4305X.m17089a(f12759e);
        m17187j(f12759e).mo12557f();
        if (f12775u != null && m17165c(f12759e)) {
            f12775u.mo12319b();
        }
        C4426tb.m17579a(f12759e);
    }

    /* renamed from: B */
    static boolean m17097B() {
        f12766l = false;
        m17152b(System.currentTimeMillis());
        C4264M.m16932f();
        if (!f12765k) {
            return false;
        }
        C4248Hb hb = f12774t;
        if (hb != null) {
            hb.mo12301a();
        }
        if (f12771q == -1) {
            return false;
        }
        long elapsedRealtime = (long) ((((double) (SystemClock.elapsedRealtime() - f12771q)) / 1000.0d) + 0.5d);
        f12771q = SystemClock.elapsedRealtime();
        if (elapsedRealtime < 0 || elapsedRealtime > 86400) {
            return false;
        }
        if (f12759e == null) {
            m17135a(C4316j.ERROR, "Android Context not found, please call OneSignal.init when your app starts.");
            return false;
        }
        boolean D = m17099D();
        long a = m17122a() + elapsedRealtime;
        m17162c(a);
        int i = (a > 60 ? 1 : (a == 60 ? 0 : -1));
        if (i < 0 || m17208v() == null) {
            return i >= 0;
        }
        if (!D) {
            C4426tb.m17582b(f12759e);
        }
        C4426tb.m17585c();
        return false;
    }

    /* renamed from: C */
    public static boolean m17098C() {
        return f12743L && !m17100E();
    }

    /* renamed from: D */
    static boolean m17099D() {
        boolean h = C4421sb.m17527h();
        if (h) {
            C4426tb.m17582b(f12759e);
        }
        return C4264M.m16924a(f12759e) || h;
    }

    /* renamed from: E */
    public static boolean m17100E() {
        return m17206t();
    }

    /* renamed from: F */
    private static void m17101F() {
        if (m17111P()) {
            C4421sb.m17530k();
        } else {
            C4406pa.m17450b().mo12528c();
        }
        m17152b(System.currentTimeMillis());
        m17120Y();
    }

    /* renamed from: G */
    private static void m17102G() {
        for (JSONArray c : f12738G) {
            m17164c(c, true, false);
        }
        f12738G.clear();
    }

    /* renamed from: H */
    private static C4441wb m17103H() {
        C4441wb wbVar = f12754W;
        if (wbVar != null) {
            return wbVar;
        }
        f12754W = f12777w == 2 ? new C4448yb() : C4252Ia.m16877f() ? new C4227Bb() : new C4230Cb();
        return f12754W;
    }

    /* renamed from: I */
    private static int m17104I() {
        TimeZone timeZone = Calendar.getInstance().getTimeZone();
        int rawOffset = timeZone.getRawOffset();
        if (timeZone.inDaylightTime(new Date())) {
            rawOffset += timeZone.getDSTSavings();
        }
        return rawOffset / 1000;
    }

    /* renamed from: J */
    private static void m17105J() {
        try {
            Class.forName("com.amazon.device.iap.PurchasingListener");
            f12774t = new C4248Hb(f12759e);
        } catch (ClassNotFoundException unused) {
        }
    }

    /* renamed from: K */
    private static void m17106K() {
        String s = m17205s();
        if (s == null) {
            C4381j.m17374a(0, f12759e);
            m17184h(f12757c);
        } else if (!s.equals(f12757c)) {
            m17135a(C4316j.DEBUG, "APP ID changed, clearing user id as it is no longer valid.");
            m17184h(f12757c);
            C4421sb.m17529j();
        }
    }

    /* renamed from: L */
    private static void m17107L() {
        if (f12766l || m17208v() == null) {
            m17101F();
        }
    }

    /* renamed from: M */
    private static void m17108M() {
        synchronized (f12740I) {
            if (f12740I.size() != 0) {
                new Thread(new C4262La(), "OS_GETTAGS_CALLBACK").start();
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0027, code lost:
        return;
     */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m17109N() {
        /*
            java.lang.Class<com.onesignal.Xa> r0 = com.onesignal.C4306Xa.class
            monitor-enter(r0)
            com.onesignal.Xa$h r1 = f12770p     // Catch:{ all -> 0x0028 }
            if (r1 != 0) goto L_0x0009
            monitor-exit(r0)
            return
        L_0x0009:
            java.lang.String r1 = com.onesignal.C4421sb.m17520c()     // Catch:{ all -> 0x0028 }
            boolean r2 = com.onesignal.C4421sb.m17523d()     // Catch:{ all -> 0x0028 }
            r3 = 0
            if (r2 != 0) goto L_0x0015
            r1 = r3
        L_0x0015:
            java.lang.String r2 = m17208v()     // Catch:{ all -> 0x0028 }
            if (r2 != 0) goto L_0x001d
            monitor-exit(r0)
            return
        L_0x001d:
            com.onesignal.Xa$h r4 = f12770p     // Catch:{ all -> 0x0028 }
            r4.mo12434a(r2, r1)     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x0026
            f12770p = r3     // Catch:{ all -> 0x0028 }
        L_0x0026:
            monitor-exit(r0)
            return
        L_0x0028:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C4306Xa.m17109N():void");
    }

    /* renamed from: O */
    private static boolean m17110O() {
        C4390kb.C4392b bVar = f12745N;
        return (bVar == null || bVar.f12943a == null) ? false : true;
    }

    /* renamed from: P */
    private static boolean m17111P() {
        return (System.currentTimeMillis() - m17191l(f12759e)) / 1000 >= 30;
    }

    /* renamed from: Q */
    private static boolean m17112Q() {
        return f12764j == -999;
    }

    /* renamed from: R */
    private static void m17113R() {
        if (f12745N != null) {
            m17114S();
        } else {
            C4390kb.m17421a(new C4294Ta());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public static void m17114S() {
        m17103H().mo12277a(f12759e, f12758d, new C4291Sa());
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public static void m17115T() {
        C4316j jVar = C4316j.DEBUG;
        m17135a(jVar, "registerUser: registerForPushFired:" + f12732A + ", locationFired: " + f12733B + ", remoteParams: " + f12745N);
        if (f12732A && f12733B && f12745N != null) {
            new Thread(new C4303Wa(), "OS_REG_USER").start();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public static void m17116U() {
        C4264M.C4270f fVar;
        String packageName = f12759e.getPackageName();
        PackageManager packageManager = f12759e.getPackageManager();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("app_id", f12757c);
        String a = f12776v.mo12486a(f12759e);
        if (a != null) {
            jSONObject.put("ad_id", a);
        }
        jSONObject.put("device_os", Build.VERSION.RELEASE);
        jSONObject.put("timezone", m17104I());
        jSONObject.put("language", C4252Ia.m16876c());
        jSONObject.put("sdk", "031100");
        jSONObject.put("sdk_type", f12778x);
        jSONObject.put("android_package", packageName);
        jSONObject.put("device_model", Build.MODEL);
        try {
            jSONObject.put("game_version", packageManager.getPackageInfo(packageName, 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("net_type", f12779y.mo12317e());
        jSONObject.put("carrier", f12779y.mo12315b());
        jSONObject.put("rooted", C4242Fb.m16795a());
        C4421sb.m17516a(jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("identifier", f12780z);
        jSONObject2.put("subscribableStatus", f12764j);
        jSONObject2.put("androidPermission", m17188j());
        jSONObject2.put("device_type", f12777w);
        C4421sb.m17518b(jSONObject2);
        if (f12736E && (fVar = f12735D) != null) {
            C4421sb.m17515a(fVar);
        }
        C4421sb.m17519b(true);
        f12742K = false;
    }

    /* renamed from: V */
    private static boolean m17117V() {
        if (f12765k && f12767m == null) {
            return false;
        }
        if (!f12765k && f12767m == null) {
            return true;
        }
        ExecutorService executorService = f12767m;
        return executorService != null && !executorService.isShutdown();
    }

    /* renamed from: W */
    private static void m17118W() {
        C4288Ra ra = new C4288Ra();
        boolean z = true;
        boolean z2 = f12737F.f12785e && !f12734C;
        if (!f12734C && !f12737F.f12785e) {
            z = false;
        }
        f12734C = z;
        C4264M.m16922a(f12759e, z2, ra);
    }

    /* renamed from: X */
    private static void m17119X() {
        if (!f12768n.isEmpty()) {
            f12767m = Executors.newSingleThreadExecutor(new C4282Pa());
            while (!f12768n.isEmpty()) {
                f12767m.submit(f12768n.poll());
            }
        }
    }

    /* renamed from: Y */
    private static void m17120Y() {
        if (!f12742K) {
            f12742K = true;
            if (C4421sb.m17524e()) {
                f12733B = false;
            }
            m17118W();
            f12732A = false;
            m17113R();
        }
    }

    /* renamed from: a */
    static long m17122a() {
        if (f12772r == -1 && f12759e != null) {
            f12772r = C4370gb.m17348a(C4370gb.f12909a, "GT_UNSENT_ACTIVE_TIME", 0);
        }
        C4316j jVar = C4316j.INFO;
        m17135a(jVar, "GetUnsentActiveTime: " + f12772r);
        return f12772r;
    }

    /* renamed from: a */
    private static C4307a m17125a(C4317k kVar, C4318l lVar) {
        C4307a n = m17195n();
        n.f12789i = false;
        n.f12782b = kVar;
        n.f12783c = lVar;
        return n;
    }

    /* renamed from: a */
    static String m17126a(Bundle bundle) {
        C4316j jVar;
        String str;
        if (bundle.isEmpty()) {
            return null;
        }
        try {
            if (bundle.containsKey("custom")) {
                JSONObject jSONObject = new JSONObject(bundle.getString("custom"));
                if (jSONObject.has("i")) {
                    return jSONObject.optString("i", (String) null);
                }
                jVar = C4316j.DEBUG;
                str = "Not a OneSignal formatted GCM message. No 'i' field in custom.";
            } else {
                jVar = C4316j.DEBUG;
                str = "Not a OneSignal formatted GCM message. No 'custom' field in the bundle.";
            }
            m17135a(jVar, str);
        } catch (Throwable th) {
            m17136a(C4316j.DEBUG, "Could not parse bundle, probably not a OneSignal notification.", th);
        }
        return null;
    }

    /* renamed from: a */
    static void m17129a(long j, boolean z) {
        try {
            JSONObject put = new JSONObject().put("app_id", f12757c).put(SVGParser.XML_STYLESHEET_ATTR_TYPE, 1).put("state", "ping").put("active_time", j);
            m17143a(put);
            m17140a(m17208v(), put, z);
            String o = m17197o();
            if (o != null) {
                m17140a(o, put, z);
            }
        } catch (Throwable th) {
            m17136a(C4316j.ERROR, "Generating on_focus:JSON Failed.", th);
        }
    }

    /* renamed from: a */
    public static void m17130a(Context context, String str, String str2, C4317k kVar, C4318l lVar) {
        m17176f(context);
        m17204r(context);
        if (m17098C()) {
            m17135a(C4316j.VERBOSE, "OneSignal SDK initialization delayed, user privacy consent is set to required for this application.");
            f12744M = new C4402o(context, str, str2, kVar, lVar);
            return;
        }
        f12737F = m17125a(kVar, lVar);
        if (!m17110O()) {
            f12758d = str;
        }
        f12779y = new C4252Ia();
        f12777w = f12779y.mo12316d();
        f12764j = f12779y.mo12313a(context, f12777w, str2);
        if (!m17112Q()) {
            if (!f12765k) {
                f12757c = str2;
                m17169d(f12737F.f12788h);
                m17199p(context);
                f12771q = SystemClock.elapsedRealtime();
                C4421sb.m17526g();
                m17105J();
                m17106K();
                OSPermissionChangedInternalObserver.m16989b(m17187j(f12759e));
                m17107L();
                if (f12737F.f12782b != null) {
                    m17102G();
                }
                if (C4273Mb.m16951a(f12759e)) {
                    f12773s = new C4273Mb(f12759e);
                }
                if (C4254Ib.m16892a()) {
                    f12775u = new C4254Ib(f12759e);
                }
                C4227Bb.m16780a(f12759e);
                f12765k = true;
                m17119X();
            } else if (f12737F.f12782b != null) {
                m17102G();
            }
        }
    }

    /* renamed from: a */
    private static void m17131a(Context context, JSONArray jSONArray) {
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                String optString = new JSONObject(jSONArray.getJSONObject(i).optString("custom", (String) null)).optString("i", (String) null);
                if (!f12739H.contains(optString)) {
                    f12739H.add(optString);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("app_id", m17196n(context));
                    jSONObject.put("player_id", m17198o(context));
                    jSONObject.put("opened", true);
                    C4416rb.m17508c("notifications/" + optString, jSONObject, new C4279Oa());
                }
            } catch (Throwable th) {
                m17136a(C4316j.ERROR, "Failed to generate JSON to send notification opened.", th);
            }
        }
    }

    /* renamed from: a */
    public static void m17132a(Context context, JSONArray jSONArray, boolean z) {
        if (!m17175e((String) null)) {
            m17131a(context, jSONArray);
            if (f12775u != null && m17165c(f12759e)) {
                f12775u.mo12318a(m17148b(jSONArray, true, z));
            }
            boolean z2 = false;
            boolean equals = "DISABLE".equals(C4252Ia.m16863a(context, "com.onesignal.NotificationOpened.DEFAULT"));
            if (!equals) {
                z2 = m17158b(context, jSONArray);
            }
            m17164c(jSONArray, true, z);
            if (!z && !z2 && !equals) {
                m17183h(context);
            }
        }
    }

    /* renamed from: a */
    public static void m17133a(C4226Ba ba) {
        if (f12759e == null) {
            m17135a(C4316j.ERROR, "OneSignal.init has not been called. Could not add subscription observer");
            return;
        }
        m17207u().mo12551a(ba);
        if (m17189k(f12759e).mo12368a(m17193m(f12759e))) {
            OSSubscriptionChangedInternalObserver.m16990a(m17189k(f12759e));
        }
    }

    /* renamed from: a */
    static void m17135a(C4316j jVar, String str) {
        m17136a(jVar, str, (Throwable) null);
    }

    /* renamed from: a */
    static void m17136a(C4316j jVar, String str, Throwable th) {
        if (jVar.compareTo(f12761g) < 1) {
            if (jVar == C4316j.VERBOSE) {
                Log.v("OneSignal", str, th);
            } else if (jVar == C4316j.DEBUG) {
                Log.d("OneSignal", str, th);
            } else if (jVar == C4316j.INFO) {
                Log.i("OneSignal", str, th);
            } else if (jVar == C4316j.WARN) {
                Log.w("OneSignal", str, th);
            } else if (jVar == C4316j.ERROR || jVar == C4316j.FATAL) {
                Log.e("OneSignal", str, th);
            }
        }
        if (jVar.compareTo(f12760f) < 1 && C4342b.f12860f != null) {
            try {
                String str2 = str + "\n";
                if (th != null) {
                    StringWriter stringWriter = new StringWriter();
                    th.printStackTrace(new PrintWriter(stringWriter));
                    str2 = (str2 + th.getMessage()) + stringWriter.toString();
                }
                C4252Ia.m16867a((Runnable) new C4297Ua(jVar, str2));
            } catch (Throwable th2) {
                Log.e("OneSignal", "Error showing logging message.", th2);
            }
        }
    }

    /* renamed from: a */
    public static void m17137a(C4319m mVar) {
        m17195n().f12789i = true;
        m17195n().f12790j = mVar;
    }

    /* renamed from: a */
    private static void m17138a(C4432ua uaVar) {
        C4252Ia.m16867a((Runnable) new C4275Na(uaVar));
    }

    /* renamed from: a */
    private static void m17140a(String str, JSONObject jSONObject, boolean z) {
        String str2 = "players/" + str + "/on_focus";
        C4300Va va = new C4300Va();
        if (z) {
            C4416rb.m17506b(str2, jSONObject, (C4416rb.C4417a) va);
        } else {
            C4416rb.m17503a(str2, jSONObject, (C4416rb.C4417a) va);
        }
    }

    /* renamed from: a */
    static void m17141a(JSONArray jSONArray, boolean z, C4416rb.C4417a aVar) {
        if (!m17175e("sendPurchases()")) {
            if (m17208v() == null) {
                f12753V = new C4313g(jSONArray);
                C4313g gVar = f12753V;
                gVar.f12799b = z;
                gVar.f12800c = aVar;
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("app_id", f12757c);
                if (z) {
                    jSONObject.put("existing", true);
                }
                jSONObject.put("purchases", jSONArray);
                C4416rb.m17503a("players/" + m17208v() + "/on_purchase", jSONObject, aVar);
                if (m17197o() != null) {
                    C4416rb.m17503a("players/" + m17197o() + "/on_purchase", jSONObject, (C4416rb.C4417a) null);
                }
            } catch (Throwable th) {
                m17136a(C4316j.ERROR, "Failed to generate JSON for sendPurchases.", th);
            }
        }
    }

    /* renamed from: a */
    static void m17142a(JSONArray jSONArray, boolean z, boolean z2) {
        C4318l lVar;
        C4432ua b = m17148b(jSONArray, z, z2);
        if (f12775u != null && m17165c(f12759e)) {
            f12775u.mo12320b(b);
        }
        C4307a aVar = f12737F;
        if (aVar != null && (lVar = aVar.f12783c) != null) {
            lVar.mo12436a(b.f13061a);
        }
    }

    /* renamed from: a */
    private static void m17143a(JSONObject jSONObject) {
        try {
            jSONObject.put("net_type", f12779y.mo12317e());
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    static boolean m17144a(Context context, JSONObject jSONObject) {
        String b = m17150b(jSONObject);
        return b == null || m17146a(b, context);
    }

    /* renamed from: a */
    static boolean m17145a(C4316j jVar) {
        return jVar.compareTo(f12760f) < 1 || jVar.compareTo(f12761g) < 1;
    }

    /* renamed from: a */
    private static boolean m17146a(String str, Context context) {
        boolean z;
        if (str == null || "".equals(str)) {
            return false;
        }
        Cursor cursor = null;
        try {
            Cursor query = C4353cb.m17322a(context).mo12480a().query("notification", new String[]{"notification_id"}, "notification_id = ?", new String[]{str}, (String) null, (String) null, (String) null);
            z = query.moveToFirst();
            if (query != null) {
                query.close();
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (!z) {
            return false;
        }
        m17135a(C4316j.DEBUG, "Duplicate GCM message received, skip processing of " + str);
        return true;
    }

    /* renamed from: b */
    private static C4432ua m17148b(JSONArray jSONArray, boolean z, boolean z2) {
        C4414ra.C4415a aVar;
        C4414ra raVar;
        int length = jSONArray.length();
        C4432ua uaVar = new C4432ua();
        C4414ra raVar2 = new C4414ra();
        raVar2.f13017a = m17211y();
        raVar2.f13018b = z;
        raVar2.f13019c = jSONArray.optJSONObject(0).optInt("notificationId");
        String str = null;
        boolean z3 = true;
        for (int i = 0; i < length; i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                raVar2.f13020d = C4277O.m16966a(jSONObject);
                if (str == null && jSONObject.has("actionSelected")) {
                    str = jSONObject.optString("actionSelected", (String) null);
                }
                if (z3) {
                    z3 = false;
                } else {
                    if (raVar2.f13022f == null) {
                        raVar2.f13022f = new ArrayList();
                    }
                    raVar2.f13022f.add(raVar2.f13020d);
                }
            } catch (Throwable th) {
                m17136a(C4316j.ERROR, "Error parsing JSON item " + i + "/" + length + " for callback.", th);
            }
        }
        uaVar.f13061a = raVar2;
        uaVar.f13062b = new C4419sa();
        C4419sa saVar = uaVar.f13062b;
        saVar.f13030b = str;
        saVar.f13029a = str != null ? C4419sa.C4420a.ActionTaken : C4419sa.C4420a.Opened;
        if (z2) {
            raVar = uaVar.f13061a;
            aVar = C4414ra.C4415a.InAppAlert;
        } else {
            raVar = uaVar.f13061a;
            aVar = C4414ra.C4415a.Notification;
        }
        raVar.f13021e = aVar;
        return uaVar;
    }

    /* renamed from: b */
    private static String m17150b(JSONObject jSONObject) {
        try {
            return new JSONObject(jSONObject.optString("custom")).optString("i", (String) null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    static void m17152b(long j) {
        C4370gb.m17358b(C4370gb.f12909a, "OS_LAST_SESSION_TIME", j);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m17153b(C4307a aVar) {
        if (m17195n().f12789i) {
            aVar.f12790j = m17195n().f12790j;
        }
        f12737F = aVar;
        C4307a aVar2 = f12737F;
        Context context = aVar2.f12781a;
        aVar2.f12781a = null;
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            String string = bundle.getString("onesignal_google_project_number");
            if (string != null && string.length() > 4) {
                string = string.substring(4);
            }
            m17130a(context, string, bundle.getString("onesignal_app_id"), f12737F.f12782b, f12737F.f12783c);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: b */
    public static void m17154b(C4316j jVar, String str) {
        m17135a(jVar, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m17155b(String str, int i, Throwable th, String str2) {
        String str3;
        if (str2 == null || !m17145a(C4316j.INFO)) {
            str3 = "";
        } else {
            str3 = "\n" + str2 + "\n";
        }
        m17136a(C4316j.WARN, "HTTP code: " + i + " " + str + str3, th);
    }

    /* renamed from: b */
    static boolean m17157b(Context context) {
        return C4370gb.m17355a(C4370gb.f12909a, "OS_FILTER_OTHER_GCM_RECEIVERS", false);
    }

    /* renamed from: b */
    private static boolean m17158b(Context context, JSONArray jSONArray) {
        String optString;
        if (m17175e((String) null)) {
            return false;
        }
        int length = jSONArray.length();
        boolean z = false;
        for (int i = 0; i < length; i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject.has("custom")) {
                    JSONObject jSONObject2 = new JSONObject(jSONObject.optString("custom"));
                    if (jSONObject2.has("u") && (optString = jSONObject2.optString("u", (String) null)) != null) {
                        C4252Ia.m16874b(optString);
                        z = true;
                    }
                }
            } catch (Throwable th) {
                m17136a(C4316j.ERROR, "Error parsing JSON item " + i + "/" + length + " for launching a web URL.", th);
            }
        }
        return z;
    }

    /* renamed from: c */
    public static void m17161c(int i) {
        C4286Qa qa = new C4286Qa(i);
        if (f12759e == null || m17117V()) {
            C4316j jVar = C4316j.ERROR;
            m17135a(jVar, "OneSignal.init has not been called. Could not clear notification id: " + i + " at this time - movingthis operation to a waiting task queue. The notification will still be canceledfrom NotificationManager at this time.");
            f12768n.add(qa);
            return;
        }
        qa.run();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m17162c(long j) {
        f12772r = j;
        if (f12759e != null) {
            C4316j jVar = C4316j.INFO;
            m17135a(jVar, "SaveUnsentActiveTime: " + f12772r);
            C4370gb.m17358b(C4370gb.f12909a, "GT_UNSENT_ACTIVE_TIME", j);
        }
    }

    /* renamed from: c */
    static void m17163c(String str) {
        f12763i = str;
        if (f12759e != null) {
            C4370gb.m17359b(C4370gb.f12909a, "OS_EMAIL_ID", "".equals(f12763i) ? null : f12763i);
        }
    }

    /* renamed from: c */
    private static void m17164c(JSONArray jSONArray, boolean z, boolean z2) {
        C4307a aVar = f12737F;
        if (aVar == null || aVar.f12782b == null) {
            f12738G.add(jSONArray);
        } else {
            m17138a(m17148b(jSONArray, z, z2));
        }
    }

    /* renamed from: c */
    static boolean m17165c(Context context) {
        return C4370gb.m17355a(C4370gb.f12909a, "GT_FIREBASE_TRACKING_ENABLED", false);
    }

    /* renamed from: d */
    static void m17168d(String str) {
        f12762h = str;
        if (f12759e != null) {
            C4370gb.m17359b(C4370gb.f12909a, "GT_PLAYER_ID", f12762h);
        }
    }

    /* renamed from: d */
    static void m17169d(boolean z) {
        if (f12759e != null) {
            C4370gb.m17361b(C4370gb.f12909a, "OS_FILTER_OTHER_GCM_RECEIVERS", z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static boolean m17170d(int i) {
        return i < -6;
    }

    /* renamed from: d */
    static boolean m17171d(Context context) {
        return C4370gb.m17355a(C4370gb.f12909a, "GT_SOUND_ENABLED", true);
    }

    /* renamed from: e */
    public static void m17173e(boolean z) {
        if (!f12743L || z) {
            f12743L = z;
        } else {
            m17135a(C4316j.ERROR, "Cannot change requiresUserPrivacyConsent() from TRUE to FALSE");
        }
    }

    /* renamed from: e */
    static boolean m17174e(Context context) {
        return C4370gb.m17355a(C4370gb.f12909a, "GT_VIBRATE_ENABLED", true);
    }

    /* renamed from: e */
    static boolean m17175e(String str) {
        if (!m17098C()) {
            return false;
        }
        if (str == null) {
            return true;
        }
        C4316j jVar = C4316j.WARN;
        m17135a(jVar, "Method " + str + " was called before the user provided privacy consent. Your application is set to require the user's privacy consent before the OneSignal SDK can be initialized. Please ensure the user has provided consent before calling this method. You can check the latest OneSignal consent status by calling OneSignal.userProvidedPrivacyConsent()");
        return true;
    }

    /* renamed from: f */
    public static void m17176f(Context context) {
        if (context == null) {
            m17135a(C4316j.WARN, "setAppContext(null) is not valid, ignoring!");
            return;
        }
        boolean z = f12759e == null;
        f12759e = context.getApplicationContext();
        C4351c.m17320a((Application) f12759e);
        if (z) {
            C4370gb.m17357b();
        }
    }

    /* renamed from: f */
    static void m17177f(String str) {
        m17163c(str);
        m17186i(f12759e).mo12490a(str);
        try {
            C4421sb.m17518b(new JSONObject().put("parent_player_id", str));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: g */
    public static C4307a m17179g(Context context) {
        return new C4307a(context, (C4282Pa) null);
    }

    /* renamed from: g */
    static void m17181g(String str) {
        m17168d(str);
        m17194m();
        m17108M();
        m17189k(f12759e).mo12369b(str);
        C4313g gVar = f12753V;
        if (gVar != null) {
            m17141a(gVar.f12798a, gVar.f12799b, gVar.f12800c);
            f12753V = null;
        }
        C4421sb.m17528i();
        C4349bb.m17319a(f12757c, str, C4355d.m17331a());
    }

    /* renamed from: h */
    static void m17183h(Context context) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.setFlags(268566528);
            context.startActivity(launchIntentForPackage);
        }
    }

    /* renamed from: h */
    private static void m17184h(String str) {
        if (f12759e != null) {
            C4370gb.m17359b(C4370gb.f12909a, "GT_APP_ID", str);
        }
    }

    /* renamed from: i */
    private static C4360ea m17186i(Context context) {
        if (context == null) {
            return null;
        }
        if (f12752U == null) {
            f12752U = new C4360ea(false);
            f12752U.f12884a.mo12552b(new C4356da());
        }
        return f12752U;
    }

    /* renamed from: j */
    private static C4450za m17187j(Context context) {
        if (context == null) {
            return null;
        }
        if (f12746O == null) {
            f12746O = new C4450za(false);
            f12746O.f13112a.mo12552b(new OSPermissionChangedInternalObserver());
        }
        return f12746O;
    }

    /* renamed from: j */
    static boolean m17188j() {
        if (f12737F.f12787g) {
            return C4252Ia.m16869a(f12759e);
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static OSSubscriptionState m17189k(Context context) {
        if (context == null) {
            return null;
        }
        if (f12749R == null) {
            f12749R = new OSSubscriptionState(false, m17187j(context).mo12555d());
            m17187j(context).f13112a.mo12551a(f12749R);
            f12749R.f12684a.mo12552b(new OSSubscriptionChangedInternalObserver());
        }
        return f12749R;
    }

    /* renamed from: k */
    static void m17190k() {
        C4311e eVar = f12755a;
        if (eVar != null) {
            eVar.mo12431a(new C4310d(C4309c.NETWORK, "Failed due to network failure. Will retry on next sync."));
            f12755a = null;
        }
    }

    /* renamed from: l */
    private static long m17191l(Context context) {
        return C4370gb.m17348a(C4370gb.f12909a, "OS_LAST_SESSION_TIME", -31000);
    }

    /* renamed from: l */
    static void m17192l() {
        C4311e eVar = f12755a;
        if (eVar != null) {
            eVar.onSuccess();
            f12755a = null;
        }
    }

    /* renamed from: m */
    private static OSSubscriptionState m17193m(Context context) {
        if (context == null) {
            return null;
        }
        if (f12750S == null) {
            f12750S = new OSSubscriptionState(true, false);
        }
        return f12750S;
    }

    /* renamed from: m */
    static void m17194m() {
        if (f12770p != null) {
            C4252Ia.m16867a((Runnable) new C4272Ma());
        }
    }

    /* renamed from: n */
    public static C4307a m17195n() {
        if (f12737F == null) {
            f12737F = new C4307a((C4282Pa) null);
        }
        return f12737F;
    }

    /* renamed from: n */
    private static String m17196n(Context context) {
        return context == null ? "" : C4370gb.m17351a(C4370gb.f12909a, "GT_APP_ID", (String) null);
    }

    /* renamed from: o */
    static String m17197o() {
        if ("".equals(f12763i)) {
            return null;
        }
        if (f12763i == null && f12759e != null) {
            f12763i = C4370gb.m17351a(C4370gb.f12909a, "OS_EMAIL_ID", (String) null);
        }
        return f12763i;
    }

    /* renamed from: o */
    private static String m17198o(Context context) {
        return context == null ? "" : C4370gb.m17351a(C4370gb.f12909a, "GT_PLAYER_ID", (String) null);
    }

    /* renamed from: p */
    private static void m17199p(Context context) {
        f12766l = m17202q(context);
        if (f12766l) {
            C4342b.f12860f = (Activity) context;
            C4305X.m17089a(f12759e);
            return;
        }
        C4342b.f12855a = true;
    }

    /* renamed from: p */
    static boolean m17200p() {
        C4307a aVar = f12737F;
        return aVar != null && aVar.f12790j == C4319m.InAppAlert;
    }

    /* renamed from: q */
    static boolean m17201q() {
        C4307a aVar = f12737F;
        return aVar == null || aVar.f12790j == C4319m.Notification;
    }

    /* renamed from: q */
    private static boolean m17202q(Context context) {
        return context instanceof Activity;
    }

    /* renamed from: r */
    static C4447ya<Object, C4223Aa> m17203r() {
        if (f12748Q == null) {
            f12748Q = new C4447ya<>("onOSPermissionChanged", true);
        }
        return f12748Q;
    }

    /* renamed from: r */
    private static void m17204r(Context context) {
        try {
            m17173e("ENABLE".equalsIgnoreCase(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString("com.onesignal.PrivacyConsent")));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: s */
    static String m17205s() {
        return m17196n(f12759e);
    }

    /* renamed from: t */
    static boolean m17206t() {
        return C4370gb.m17355a(C4370gb.f12909a, "ONESIGNAL_USER_PROVIDED_CONSENT", false);
    }

    /* renamed from: u */
    static C4447ya<C4226Ba, C4229Ca> m17207u() {
        if (f12751T == null) {
            f12751T = new C4447ya<>("onOSSubscriptionChanged", true);
        }
        return f12751T;
    }

    /* renamed from: v */
    static String m17208v() {
        if (f12762h == null && f12759e != null) {
            f12762h = C4370gb.m17351a(C4370gb.f12909a, "GT_PLAYER_ID", (String) null);
        }
        return f12762h;
    }

    /* renamed from: w */
    static void m17209w() {
        C4311e eVar = f12756b;
        if (eVar != null) {
            eVar.mo12431a(new C4310d(C4309c.NETWORK, "Failed due to network failure. Will retry on next sync."));
            f12756b = null;
        }
    }

    /* renamed from: x */
    static void m17210x() {
        C4311e eVar = f12756b;
        if (eVar != null) {
            eVar.onSuccess();
            f12756b = null;
        }
    }

    /* renamed from: y */
    static boolean m17211y() {
        return f12765k && m17212z();
    }

    /* renamed from: z */
    static boolean m17212z() {
        return f12766l;
    }
}
