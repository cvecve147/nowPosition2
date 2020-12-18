package com.facebook.p060a;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.C1355K;
import com.facebook.C1574p;
import com.facebook.C1601x;
import com.facebook.internal.C1459P;
import com.facebook.internal.C1480ba;
import com.facebook.internal.C1484ca;
import com.facebook.p060a.p061a.C1377f;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* renamed from: com.facebook.a.q */
public class C1406q {

    /* renamed from: a */
    private static ScheduledThreadPoolExecutor f4932a;

    /* renamed from: b */
    private static C1407a f4933b = C1407a.AUTO;

    /* renamed from: c */
    private static Object f4934c = new Object();

    /* renamed from: d */
    private static String f4935d;

    /* renamed from: e */
    private static boolean f4936e;

    /* renamed from: f */
    private static String f4937f;

    /* renamed from: g */
    private final String f4938g;

    /* renamed from: h */
    private final C1387b f4939h;

    /* renamed from: com.facebook.a.q$a */
    public enum C1407a {
        AUTO,
        EXPLICIT_ONLY
    }

    private C1406q(Context context, String str, AccessToken accessToken) {
        this(C1480ba.m6953b(context), str, accessToken);
    }

    protected C1406q(String str, String str2, AccessToken accessToken) {
        C1387b bVar;
        C1484ca.m6983c();
        this.f4938g = str;
        accessToken = accessToken == null ? AccessToken.m6460b() : accessToken;
        if (accessToken == null || (str2 != null && !str2.equals(accessToken.mo5886a()))) {
            bVar = new C1387b((String) null, str2 == null ? C1480ba.m6960c(C1601x.m7386b()) : str2);
        } else {
            bVar = new C1387b(accessToken);
        }
        this.f4939h = bVar;
        m6720g();
    }

    /* renamed from: a */
    public static C1406q m6709a(Context context, String str) {
        return new C1406q(context, str, (AccessToken) null);
    }

    /* renamed from: a */
    public static String m6710a(Context context) {
        if (f4935d == null) {
            synchronized (f4934c) {
                if (f4935d == null) {
                    f4935d = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", (String) null);
                    if (f4935d == null) {
                        f4935d = "XZ" + UUID.randomUUID().toString();
                        context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", f4935d).apply();
                    }
                }
            }
        }
        return f4935d;
    }

    /* renamed from: a */
    public static void m6711a(Application application, String str) {
        if (C1601x.m7402o()) {
            C1390d.m6672c();
            if (str == null) {
                str = C1601x.m7389c();
            }
            C1601x.m7388b(application, str);
            C1377f.m6631a(application, str);
            return;
        }
        throw new C1574p("The Facebook sdk must be initialized before calling activateApp");
    }

    /* renamed from: a */
    private static void m6712a(Context context, C1392f fVar, C1387b bVar) {
        C1402n.m6696a(bVar, fVar);
        if (!fVar.mo6050a() && !f4936e) {
            if (fVar.mo6052c() == "fb_mobile_activate_app") {
                f4936e = true;
            } else {
                C1459P.m6841a(C1355K.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
            }
        }
    }

    /* renamed from: a */
    private void m6713a(String str, Double d, Bundle bundle, boolean z, UUID uuid) {
        C1355K k;
        Object[] objArr;
        String str2;
        try {
            m6712a(C1601x.m7386b(), new C1392f(this.f4938g, str, d, bundle, z, uuid), this.f4939h);
            return;
        } catch (JSONException e) {
            k = C1355K.APP_EVENTS;
            objArr = new Object[]{e.toString()};
            str2 = "JSON encoding for app event failed: '%s'";
        } catch (C1574p e2) {
            k = C1355K.APP_EVENTS;
            objArr = new Object[]{e2.toString()};
            str2 = "Invalid app event: %s";
        }
        C1459P.m6842a(k, "AppEvents", str2, objArr);
    }

    /* renamed from: b */
    public static C1406q m6714b(Context context) {
        return new C1406q(context, (String) null, (AccessToken) null);
    }

    /* renamed from: b */
    static Executor m6715b() {
        if (f4932a == null) {
            m6720g();
        }
        return f4932a;
    }

    /* renamed from: c */
    public static C1407a m6716c() {
        C1407a aVar;
        synchronized (f4934c) {
            aVar = f4933b;
        }
        return aVar;
    }

    /* renamed from: d */
    static String m6717d() {
        String str;
        synchronized (f4934c) {
            str = f4937f;
        }
        return str;
    }

    /* renamed from: e */
    public static String m6718e() {
        return C1390d.m6671b();
    }

    /* renamed from: f */
    public static void m6719f() {
        C1402n.m6704f();
    }

    /* renamed from: g */
    private static void m6720g() {
        synchronized (f4934c) {
            if (f4932a == null) {
                f4932a = new ScheduledThreadPoolExecutor(1);
                f4932a.scheduleAtFixedRate(new C1405p(), 0, 86400, TimeUnit.SECONDS);
            }
        }
    }

    /* renamed from: a */
    public void mo6067a() {
        C1402n.m6697a(C1408r.EXPLICIT);
    }

    /* renamed from: a */
    public void mo6068a(String str, double d, Bundle bundle) {
        m6713a(str, Double.valueOf(d), bundle, false, C1377f.m6640g());
    }

    /* renamed from: a */
    public void mo6069a(String str, Bundle bundle) {
        m6713a(str, (Double) null, bundle, false, C1377f.m6640g());
    }

    /* renamed from: a */
    public void mo6070a(String str, Double d, Bundle bundle) {
        m6713a(str, d, bundle, true, C1377f.m6640g());
    }
}
