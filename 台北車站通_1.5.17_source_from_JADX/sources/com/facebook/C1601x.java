package com.facebook;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import com.facebook.internal.C1458O;
import com.facebook.internal.C1472W;
import com.facebook.internal.C1484ca;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.facebook.x */
public final class C1601x {

    /* renamed from: a */
    private static final HashSet<C1355K> f5394a = new HashSet<>(Arrays.asList(new C1355K[]{C1355K.DEVELOPER_ERRORS}));

    /* renamed from: b */
    private static volatile Executor f5395b;

    /* renamed from: c */
    private static volatile String f5396c;

    /* renamed from: d */
    private static volatile String f5397d;

    /* renamed from: e */
    private static volatile String f5398e;

    /* renamed from: f */
    private static volatile int f5399f;

    /* renamed from: g */
    private static volatile Boolean f5400g;

    /* renamed from: h */
    private static volatile String f5401h = "facebook.com";

    /* renamed from: i */
    private static AtomicLong f5402i = new AtomicLong(65536);

    /* renamed from: j */
    private static volatile boolean f5403j = false;

    /* renamed from: k */
    private static boolean f5404k = false;

    /* renamed from: l */
    private static C1458O<File> f5405l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static Context f5406m;

    /* renamed from: n */
    private static int f5407n = 64206;

    /* renamed from: o */
    private static final Object f5408o = new Object();

    /* renamed from: p */
    private static final int f5409p = C1367X.com_facebook_activity_theme;

    /* renamed from: q */
    private static String f5410q = C1472W.m6905a();

    /* renamed from: r */
    private static final BlockingQueue<Runnable> f5411r = new LinkedBlockingQueue(10);

    /* renamed from: s */
    private static final ThreadFactory f5412s = new C1597t();

    /* renamed from: t */
    private static Boolean f5413t = false;

    /* renamed from: com.facebook.x$a */
    public interface C1602a {
        /* renamed from: a */
        void mo6463a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007e A[Catch:{ JSONException -> 0x00a8, Exception -> 0x00b9 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.facebook.C1352H m7381a(android.content.Context r14, java.lang.String r15) {
        /*
            r0 = 0
            if (r14 == 0) goto L_0x00b1
            if (r15 == 0) goto L_0x00b1
            com.facebook.internal.d r1 = com.facebook.internal.C1485d.m6985a((android.content.Context) r14)     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r2 = "com.facebook.sdk.attributionTracking"
            r3 = 0
            android.content.SharedPreferences r2 = r14.getSharedPreferences(r2, r3)     // Catch:{ Exception -> 0x00b9 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b9 }
            r4.<init>()     // Catch:{ Exception -> 0x00b9 }
            r4.append(r15)     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r5 = "ping"
            r4.append(r5)     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00b9 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b9 }
            r5.<init>()     // Catch:{ Exception -> 0x00b9 }
            r5.append(r15)     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r6 = "json"
            r5.append(r6)     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x00b9 }
            r6 = 0
            long r8 = r2.getLong(r4, r6)     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r10 = r2.getString(r5, r0)     // Catch:{ Exception -> 0x00b9 }
            com.facebook.internal.b$a r11 = com.facebook.internal.C1478b.C1479a.MOBILE_INSTALL_EVENT     // Catch:{ JSONException -> 0x00a8 }
            java.lang.String r12 = com.facebook.p060a.C1406q.m6710a(r14)     // Catch:{ JSONException -> 0x00a8 }
            boolean r13 = m7384a((android.content.Context) r14)     // Catch:{ JSONException -> 0x00a8 }
            org.json.JSONObject r14 = com.facebook.internal.C1478b.m6915a(r11, r1, r12, r13, r14)     // Catch:{ JSONException -> 0x00a8 }
            java.lang.String r1 = "%s/activities"
            r11 = 1
            java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x00b9 }
            r12[r3] = r15     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r15 = java.lang.String.format(r1, r12)     // Catch:{ Exception -> 0x00b9 }
            com.facebook.GraphRequest r14 = com.facebook.GraphRequest.m6510a((com.facebook.AccessToken) r0, (java.lang.String) r15, (org.json.JSONObject) r14, (com.facebook.GraphRequest.C1347b) r0)     // Catch:{ Exception -> 0x00b9 }
            int r15 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r15 == 0) goto L_0x0084
            if (r10 == 0) goto L_0x0065
            org.json.JSONObject r15 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0065 }
            r15.<init>(r10)     // Catch:{ JSONException -> 0x0065 }
            goto L_0x0066
        L_0x0065:
            r15 = r0
        L_0x0066:
            if (r15 != 0) goto L_0x007e
            java.lang.String r15 = "true"
            com.facebook.G r1 = new com.facebook.G     // Catch:{ Exception -> 0x00b9 }
            com.facebook.GraphRequest[] r2 = new com.facebook.GraphRequest[r11]     // Catch:{ Exception -> 0x00b9 }
            r2[r3] = r14     // Catch:{ Exception -> 0x00b9 }
            r1.<init>((com.facebook.GraphRequest[]) r2)     // Catch:{ Exception -> 0x00b9 }
            java.util.List r14 = com.facebook.C1352H.m6587a((java.lang.String) r15, (java.net.HttpURLConnection) r0, (com.facebook.C1343G) r1)     // Catch:{ Exception -> 0x00b9 }
            java.lang.Object r14 = r14.get(r3)     // Catch:{ Exception -> 0x00b9 }
            com.facebook.H r14 = (com.facebook.C1352H) r14     // Catch:{ Exception -> 0x00b9 }
            return r14
        L_0x007e:
            com.facebook.H r14 = new com.facebook.H     // Catch:{ Exception -> 0x00b9 }
            r14.<init>((com.facebook.GraphRequest) r0, (java.net.HttpURLConnection) r0, (java.lang.String) r0, (org.json.JSONObject) r15)     // Catch:{ Exception -> 0x00b9 }
            return r14
        L_0x0084:
            com.facebook.H r14 = r14.mo5950a()     // Catch:{ Exception -> 0x00b9 }
            android.content.SharedPreferences$Editor r15 = r2.edit()     // Catch:{ Exception -> 0x00b9 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00b9 }
            r15.putLong(r4, r1)     // Catch:{ Exception -> 0x00b9 }
            org.json.JSONObject r1 = r14.mo5988b()     // Catch:{ Exception -> 0x00b9 }
            if (r1 == 0) goto L_0x00a4
            org.json.JSONObject r1 = r14.mo5988b()     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00b9 }
            r15.putString(r5, r1)     // Catch:{ Exception -> 0x00b9 }
        L_0x00a4:
            r15.apply()     // Catch:{ Exception -> 0x00b9 }
            return r14
        L_0x00a8:
            r14 = move-exception
            com.facebook.p r15 = new com.facebook.p     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r1 = "An error occurred while publishing install."
            r15.<init>(r1, r14)     // Catch:{ Exception -> 0x00b9 }
            throw r15     // Catch:{ Exception -> 0x00b9 }
        L_0x00b1:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r15 = "Both context and applicationId must be non-null"
            r14.<init>(r15)     // Catch:{ Exception -> 0x00b9 }
            throw r14     // Catch:{ Exception -> 0x00b9 }
        L_0x00b9:
            r14 = move-exception
            java.lang.String r15 = "Facebook-publish"
            com.facebook.internal.C1480ba.m6942a((java.lang.String) r15, (java.lang.Exception) r14)
            com.facebook.H r15 = new com.facebook.H
            com.facebook.FacebookRequestError r1 = new com.facebook.FacebookRequestError
            r1.<init>((java.net.HttpURLConnection) r0, (java.lang.Exception) r14)
            r15.<init>(r0, r0, r1)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.C1601x.m7381a(android.content.Context, java.lang.String):com.facebook.H");
    }

    /* renamed from: a */
    public static void m7382a(int i) {
        if (i == 0) {
            i = f5409p;
        }
        f5399f = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        return;
     */
    @java.lang.Deprecated
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m7383a(android.content.Context r3, com.facebook.C1601x.C1602a r4) {
        /*
            java.lang.Class<com.facebook.x> r0 = com.facebook.C1601x.class
            monitor-enter(r0)
            java.lang.Boolean r1 = f5413t     // Catch:{ all -> 0x006a }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x006a }
            if (r1 == 0) goto L_0x0012
            if (r4 == 0) goto L_0x0010
            r4.mo6463a()     // Catch:{ all -> 0x006a }
        L_0x0010:
            monitor-exit(r0)
            return
        L_0x0012:
            java.lang.String r1 = "applicationContext"
            com.facebook.internal.C1484ca.m6976a((java.lang.Object) r3, (java.lang.String) r1)     // Catch:{ all -> 0x006a }
            r1 = 0
            com.facebook.internal.C1484ca.m6975a((android.content.Context) r3, (boolean) r1)     // Catch:{ all -> 0x006a }
            com.facebook.internal.C1484ca.m6981b((android.content.Context) r3, (boolean) r1)     // Catch:{ all -> 0x006a }
            android.content.Context r1 = r3.getApplicationContext()     // Catch:{ all -> 0x006a }
            f5406m = r1     // Catch:{ all -> 0x006a }
            android.content.Context r1 = f5406m     // Catch:{ all -> 0x006a }
            m7387b(r1)     // Catch:{ all -> 0x006a }
            java.lang.String r1 = f5396c     // Catch:{ all -> 0x006a }
            boolean r1 = com.facebook.internal.C1480ba.m6958b((java.lang.String) r1)     // Catch:{ all -> 0x006a }
            if (r1 != 0) goto L_0x0062
            r1 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x006a }
            f5413t = r1     // Catch:{ all -> 0x006a }
            com.facebook.internal.C1430A.m6780b()     // Catch:{ all -> 0x006a }
            com.facebook.internal.C1461S.m6874d()     // Catch:{ all -> 0x006a }
            android.content.Context r1 = f5406m     // Catch:{ all -> 0x006a }
            com.facebook.internal.C1489e.m6998a(r1)     // Catch:{ all -> 0x006a }
            com.facebook.internal.O r1 = new com.facebook.internal.O     // Catch:{ all -> 0x006a }
            com.facebook.u r2 = new com.facebook.u     // Catch:{ all -> 0x006a }
            r2.<init>()     // Catch:{ all -> 0x006a }
            r1.<init>(r2)     // Catch:{ all -> 0x006a }
            f5405l = r1     // Catch:{ all -> 0x006a }
            java.util.concurrent.FutureTask r1 = new java.util.concurrent.FutureTask     // Catch:{ all -> 0x006a }
            com.facebook.v r2 = new com.facebook.v     // Catch:{ all -> 0x006a }
            r2.<init>(r4, r3)     // Catch:{ all -> 0x006a }
            r1.<init>(r2)     // Catch:{ all -> 0x006a }
            java.util.concurrent.Executor r3 = m7395h()     // Catch:{ all -> 0x006a }
            r3.execute(r1)     // Catch:{ all -> 0x006a }
            monitor-exit(r0)
            return
        L_0x0062:
            com.facebook.p r3 = new com.facebook.p     // Catch:{ all -> 0x006a }
            java.lang.String r4 = "A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk."
            r3.<init>((java.lang.String) r4)     // Catch:{ all -> 0x006a }
            throw r3     // Catch:{ all -> 0x006a }
        L_0x006a:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.C1601x.m7383a(android.content.Context, com.facebook.x$a):void");
    }

    /* renamed from: a */
    public static boolean m7384a(Context context) {
        C1484ca.m6983c();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    /* renamed from: a */
    public static boolean m7385a(C1355K k) {
        boolean z;
        synchronized (f5394a) {
            z = m7401n() && f5394a.contains(k);
        }
        return z;
    }

    /* renamed from: b */
    public static Context m7386b() {
        C1484ca.m6983c();
        return f5406m;
    }

    /* renamed from: b */
    static void m7387b(Context context) {
        if (context != null) {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                if (applicationInfo != null && applicationInfo.metaData != null) {
                    if (f5396c == null) {
                        Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                        if (obj instanceof String) {
                            String str = (String) obj;
                            if (str.toLowerCase(Locale.ROOT).startsWith("fb")) {
                                str = str.substring(2);
                            }
                            f5396c = str;
                        } else if (obj instanceof Integer) {
                            throw new C1574p("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                        }
                    }
                    if (f5397d == null) {
                        f5397d = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
                    }
                    if (f5398e == null) {
                        f5398e = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
                    }
                    if (f5399f == 0) {
                        m7382a(applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme"));
                    }
                    if (f5407n == 64206) {
                        f5407n = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
                    }
                    if (f5400g == null) {
                        f5400g = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.AutoLogAppEventsEnabled", true));
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
    }

    /* renamed from: b */
    public static void m7388b(Context context, String str) {
        m7395h().execute(new C1600w(context.getApplicationContext(), str));
    }

    /* renamed from: c */
    public static String m7389c() {
        C1484ca.m6983c();
        return f5396c;
    }

    @Deprecated
    /* renamed from: c */
    public static synchronized void m7390c(Context context) {
        synchronized (C1601x.class) {
            m7383a(context, (C1602a) null);
        }
    }

    /* renamed from: d */
    public static boolean m7391d() {
        C1484ca.m6983c();
        return f5400g.booleanValue();
    }

    /* renamed from: e */
    public static File m7392e() {
        C1484ca.m6983c();
        return f5405l.mo6153a();
    }

    /* renamed from: f */
    public static int m7393f() {
        C1484ca.m6983c();
        return f5407n;
    }

    /* renamed from: g */
    public static String m7394g() {
        C1484ca.m6983c();
        return f5398e;
    }

    /* renamed from: h */
    public static Executor m7395h() {
        synchronized (f5408o) {
            if (f5395b == null) {
                f5395b = AsyncTask.THREAD_POOL_EXECUTOR;
            }
        }
        return f5395b;
    }

    /* renamed from: i */
    public static String m7396i() {
        return f5401h;
    }

    /* renamed from: j */
    public static String m7397j() {
        return f5410q;
    }

    /* renamed from: k */
    public static long m7398k() {
        C1484ca.m6983c();
        return f5402i.get();
    }

    /* renamed from: l */
    public static String m7399l() {
        return "4.19.0";
    }

    /* renamed from: m */
    public static int m7400m() {
        C1484ca.m6983c();
        return f5399f;
    }

    /* renamed from: n */
    public static boolean m7401n() {
        return f5403j;
    }

    /* renamed from: o */
    public static synchronized boolean m7402o() {
        boolean booleanValue;
        synchronized (C1601x.class) {
            booleanValue = f5413t.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: p */
    public static boolean m7403p() {
        return f5404k;
    }
}
