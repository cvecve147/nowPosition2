package com.onesignal;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1850a;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.C3937d;
import com.google.android.gms.location.C3938e;
import com.google.android.gms.location.LocationRequest;
import com.onesignal.C4306Xa;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.onesignal.M */
class C4264M {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static C4434v f12646a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static Location f12647b;

    /* renamed from: c */
    static String f12648c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static Context f12649d;

    /* renamed from: e */
    private static C4269e f12650e;

    /* renamed from: f */
    protected static final Object f12651f = new C4258K();

    /* renamed from: g */
    private static ConcurrentHashMap<C4265a, C4268d> f12652g = new ConcurrentHashMap<>();

    /* renamed from: h */
    private static Thread f12653h;

    /* renamed from: i */
    private static boolean f12654i;

    /* renamed from: j */
    static C4271g f12655j;

    /* renamed from: com.onesignal.M$a */
    enum C4265a {
        STARTUP,
        PROMPT_LOCATION,
        SYNC_SERVICE
    }

    /* renamed from: com.onesignal.M$b */
    static class C4266b {
        /* renamed from: a */
        static Location m16937a(GoogleApiClient googleApiClient) {
            synchronized (C4264M.f12651f) {
                if (!googleApiClient.mo7252b()) {
                    return null;
                }
                Location a = C3938e.f11826d.mo10330a(googleApiClient);
                return a;
            }
        }

        /* renamed from: a */
        static void m16938a(GoogleApiClient googleApiClient, LocationRequest locationRequest, C3937d dVar) {
            try {
                synchronized (C4264M.f12651f) {
                    if (googleApiClient.mo7252b()) {
                        C3938e.f11826d.mo10331a(googleApiClient, locationRequest, dVar);
                    }
                }
            } catch (Throwable th) {
                C4306Xa.m17136a(C4306Xa.C4316j.WARN, "FusedLocationApi.requestLocationUpdates failed!", th);
            }
        }
    }

    /* renamed from: com.onesignal.M$c */
    private static class C4267c implements GoogleApiClient.C1848b, GoogleApiClient.C1849c {
        private C4267c() {
        }

        /* synthetic */ C4267c(C4258K k) {
            this();
        }

        /* renamed from: a */
        public void mo7263a(ConnectionResult connectionResult) {
            C4264M.m16931e();
        }

        /* renamed from: f */
        public void mo7261f(int i) {
            C4264M.m16931e();
        }

        /* renamed from: j */
        public void mo7262j(Bundle bundle) {
            synchronized (C4264M.f12651f) {
                PermissionsActivity.f12698c = false;
                if (C4264M.f12647b == null) {
                    Location unused = C4264M.f12647b = C4266b.m16937a(C4264M.f12646a.mo12545c());
                    if (C4264M.f12647b != null) {
                        C4264M.m16929c(C4264M.f12647b);
                    }
                }
                C4264M.f12655j = new C4271g(C4264M.f12646a.mo12545c());
            }
        }
    }

    /* renamed from: com.onesignal.M$d */
    interface C4268d {
        /* renamed from: a */
        void mo12356a(C4270f fVar);

        C4265a getType();
    }

    /* renamed from: com.onesignal.M$e */
    private static class C4269e extends HandlerThread {

        /* renamed from: a */
        Handler f12660a = new Handler(getLooper());

        C4269e() {
            super("OSH_LocationHandlerThread");
            start();
        }
    }

    /* renamed from: com.onesignal.M$f */
    static class C4270f {

        /* renamed from: a */
        Double f12661a;

        /* renamed from: b */
        Double f12662b;

        /* renamed from: c */
        Float f12663c;

        /* renamed from: d */
        Integer f12664d;

        /* renamed from: e */
        Boolean f12665e;

        /* renamed from: f */
        Long f12666f;

        C4270f() {
        }
    }

    /* renamed from: com.onesignal.M$g */
    static class C4271g implements C3937d {

        /* renamed from: a */
        private GoogleApiClient f12667a;

        C4271g(GoogleApiClient googleApiClient) {
            this.f12667a = googleApiClient;
            long j = C4306Xa.m17212z() ? 270000 : 570000;
            LocationRequest b = LocationRequest.m15977b();
            b.mo11140a(j);
            b.mo11141b(j);
            b.mo11144c((long) (((double) j) * 1.5d));
            b.mo11143c(102);
            C4266b.m16938a(this.f12667a, b, this);
        }

        public void onLocationChanged(Location location) {
            Location unused = C4264M.f12647b = location;
            C4306Xa.m17135a(C4306Xa.C4316j.INFO, "Location Change Detected");
        }
    }

    C4264M() {
    }

    /* renamed from: a */
    private static void m16921a(long j) {
        C4370gb.m17358b(C4370gb.f12909a, "OS_LAST_LOCATION_TIME", j);
    }

    /* renamed from: a */
    static void m16922a(Context context, boolean z, C4268d dVar) {
        f12649d = context;
        f12652g.put(dVar.getType(), dVar);
        if (!C4306Xa.f12736E) {
            m16931e();
            return;
        }
        int a = C4373h.m17369a(context, "android.permission.ACCESS_FINE_LOCATION");
        int i = -1;
        if (a == -1) {
            i = C4373h.m17369a(context, "android.permission.ACCESS_COARSE_LOCATION");
            f12654i = true;
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (!(a == 0 || i == 0)) {
                dVar.mo12356a((C4270f) null);
                return;
            }
        } else if (a != 0) {
            try {
                List asList = Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), SVGParser.ENTITY_WATCH_BUFFER_SIZE).requestedPermissions);
                if (asList.contains("android.permission.ACCESS_FINE_LOCATION")) {
                    f12648c = "android.permission.ACCESS_FINE_LOCATION";
                } else if (asList.contains("android.permission.ACCESS_COARSE_LOCATION") && i != 0) {
                    f12648c = "android.permission.ACCESS_COARSE_LOCATION";
                }
                if (f12648c != null && z) {
                    PermissionsActivity.m17021a();
                    return;
                } else if (i == 0) {
                    m16933g();
                    return;
                } else {
                    m16931e();
                    return;
                }
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        m16933g();
    }

    /* renamed from: a */
    private static void m16923a(C4270f fVar) {
        Thread thread;
        HashMap hashMap = new HashMap();
        synchronized (C4264M.class) {
            hashMap.putAll(f12652g);
            f12652g.clear();
            thread = f12653h;
        }
        for (C4265a aVar : hashMap.keySet()) {
            ((C4268d) hashMap.get(aVar)).mo12356a(fVar);
        }
        if (thread != null && !Thread.currentThread().equals(thread)) {
            thread.interrupt();
        }
        if (thread == f12653h) {
            synchronized (C4264M.class) {
                if (thread == f12653h) {
                    f12653h = null;
                }
            }
        }
        m16921a(System.currentTimeMillis());
    }

    /* renamed from: a */
    static boolean m16924a(Context context) {
        if (!m16927b(context) || !C4306Xa.f12736E) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() - m16935i();
        long j = C4306Xa.m17212z() ? 300 : 600;
        Long.signum(j);
        C4426tb.m17580a(context, (j * 1000) - currentTimeMillis);
        return true;
    }

    /* renamed from: b */
    private static boolean m16927b(Context context) {
        return C4373h.m17369a(context, "android.permission.ACCESS_FINE_LOCATION") == 0 || C4373h.m17369a(context, "android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m16929c(Location location) {
        double d;
        C4270f fVar = new C4270f();
        fVar.f12663c = Float.valueOf(location.getAccuracy());
        fVar.f12665e = Boolean.valueOf(!C4306Xa.m17212z());
        fVar.f12664d = Integer.valueOf(f12654i ^ true ? 1 : 0);
        fVar.f12666f = Long.valueOf(location.getTime());
        if (f12654i) {
            fVar.f12661a = Double.valueOf(new BigDecimal(location.getLatitude()).setScale(7, RoundingMode.HALF_UP).doubleValue());
            d = new BigDecimal(location.getLongitude()).setScale(7, RoundingMode.HALF_UP).doubleValue();
        } else {
            fVar.f12661a = Double.valueOf(location.getLatitude());
            d = location.getLongitude();
        }
        fVar.f12662b = Double.valueOf(d);
        m16923a(fVar);
        m16924a(f12649d);
    }

    /* renamed from: e */
    static void m16931e() {
        PermissionsActivity.f12698c = false;
        synchronized (f12651f) {
            if (f12646a != null) {
                f12646a.mo12544b();
            }
            f12646a = null;
        }
        m16923a((C4270f) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m16932f() {
        /*
            java.lang.Object r0 = f12651f
            monitor-enter(r0)
            com.onesignal.v r1 = f12646a     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x002e
            com.onesignal.v r1 = f12646a     // Catch:{ all -> 0x0030 }
            com.google.android.gms.common.api.GoogleApiClient r1 = r1.mo12545c()     // Catch:{ all -> 0x0030 }
            boolean r1 = r1.mo7252b()     // Catch:{ all -> 0x0030 }
            if (r1 != 0) goto L_0x0014
            goto L_0x002e
        L_0x0014:
            com.onesignal.v r1 = f12646a     // Catch:{ all -> 0x0030 }
            com.google.android.gms.common.api.GoogleApiClient r1 = r1.mo12545c()     // Catch:{ all -> 0x0030 }
            com.onesignal.M$g r2 = f12655j     // Catch:{ all -> 0x0030 }
            if (r2 == 0) goto L_0x0025
            com.google.android.gms.location.a r2 = com.google.android.gms.location.C3938e.f11826d     // Catch:{ all -> 0x0030 }
            com.onesignal.M$g r3 = f12655j     // Catch:{ all -> 0x0030 }
            r2.mo10332a(r1, r3)     // Catch:{ all -> 0x0030 }
        L_0x0025:
            com.onesignal.M$g r2 = new com.onesignal.M$g     // Catch:{ all -> 0x0030 }
            r2.<init>(r1)     // Catch:{ all -> 0x0030 }
            f12655j = r2     // Catch:{ all -> 0x0030 }
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x002e:
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x0030:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C4264M.m16932f():void");
    }

    /* renamed from: g */
    static void m16933g() {
        if (f12653h == null) {
            try {
                synchronized (f12651f) {
                    m16936j();
                    if (f12650e == null) {
                        f12650e = new C4269e();
                    }
                    if (f12646a != null) {
                        if (f12647b != null) {
                            if (f12647b != null) {
                                m16929c(f12647b);
                            }
                        }
                    }
                    C4267c cVar = new C4267c((C4258K) null);
                    GoogleApiClient.C1847a aVar = new GoogleApiClient.C1847a(f12649d);
                    aVar.mo7258a((C1850a<? extends C1850a.C1854d.C1858d>) C3938e.f11825c);
                    aVar.mo7256a((GoogleApiClient.C1848b) cVar);
                    aVar.mo7257a((GoogleApiClient.C1849c) cVar);
                    aVar.mo7255a(f12650e.f12660a);
                    f12646a = new C4434v(aVar.mo7259a());
                    f12646a.mo12543a();
                }
            } catch (Throwable th) {
                C4306Xa.m17136a(C4306Xa.C4316j.WARN, "Location permission exists but there was an error initializing: ", th);
                m16931e();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static int m16934h() {
        return 30000;
    }

    /* renamed from: i */
    private static long m16935i() {
        return C4370gb.m17348a(C4370gb.f12909a, "OS_LAST_LOCATION_TIME", -600000);
    }

    /* renamed from: j */
    private static void m16936j() {
        f12653h = new Thread(new C4261L(), "OS_GMS_LOCATION_FALLBACK");
        f12653h.start();
    }
}
