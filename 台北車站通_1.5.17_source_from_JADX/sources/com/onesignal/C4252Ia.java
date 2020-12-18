package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.p007v4.app.C0312ba;
import android.telephony.TelephonyManager;
import com.onesignal.C4306Xa;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.HttpHost;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.Ia */
class C4252Ia {

    /* renamed from: com.onesignal.Ia$a */
    public enum C4253a {
        DATA("data"),
        HTTPS("https"),
        HTTP(HttpHost.DEFAULT_SCHEME_NAME);
        

        /* renamed from: e */
        private final String f12625e;

        private C4253a(String str) {
            this.f12625e = str;
        }

        /* renamed from: a */
        public static C4253a m16888a(String str) {
            for (C4253a aVar : values()) {
                if (aVar.f12625e.equalsIgnoreCase(str)) {
                    return aVar;
                }
            }
            return null;
        }
    }

    C4252Ia() {
    }

    /* renamed from: a */
    static String m16863a(Context context, String str) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString(str);
        } catch (Throwable th) {
            C4306Xa.m17136a(C4306Xa.C4316j.ERROR, "", th);
            return null;
        }
    }

    /* renamed from: a */
    static String m16864a(Context context, String str, String str2) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(str, "string", context.getPackageName());
        return identifier != 0 ? resources.getString(identifier) : str2;
    }

    /* renamed from: a */
    static void m16865a(int i) {
        try {
            Thread.sleep((long) i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static void m16866a(Uri uri) {
        Intent intent;
        C4253a a = uri.getScheme() != null ? C4253a.m16888a(uri.getScheme()) : null;
        if (a == null) {
            a = C4253a.HTTP;
            if (!uri.toString().contains("://")) {
                uri = Uri.parse("http://" + uri.toString());
            }
        }
        if (C4247Ha.f12597a[a.ordinal()] != 1) {
            intent = new Intent("android.intent.action.VIEW", uri);
        } else {
            intent = Intent.makeMainSelectorActivity("android.intent.action.MAIN", "android.intent.category.APP_BROWSER");
            intent.setData(uri);
        }
        intent.addFlags(1476919296);
        C4306Xa.f12759e.startActivity(intent);
    }

    /* renamed from: a */
    static void m16867a(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    /* renamed from: a */
    static void m16868a(Runnable runnable, int i) {
        new Handler(Looper.getMainLooper()).postDelayed(runnable, (long) i);
    }

    /* renamed from: a */
    static boolean m16869a(Context context) {
        try {
            return C0312ba.m1395a(C4306Xa.f12759e).mo1242a();
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: a */
    static boolean m16870a(String str) {
        return str != null && !str.matches("^[0-9]");
    }

    /* renamed from: a */
    static long[] m16871a(JSONObject jSONObject) {
        try {
            Object opt = jSONObject.opt("vib_pt");
            JSONArray jSONArray = opt instanceof String ? new JSONArray((String) opt) : (JSONArray) opt;
            long[] jArr = new long[jSONArray.length()];
            for (int i = 0; i < jSONArray.length(); i++) {
                jArr[i] = jSONArray.optLong(i);
            }
            return jArr;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: b */
    static int m16872b(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return 15;
        }
    }

    /* renamed from: b */
    static Uri m16873b(Context context, String str) {
        int identifier;
        StringBuilder sb;
        Resources resources = context.getResources();
        String packageName = context.getPackageName();
        if (!m16870a(str) || (identifier = resources.getIdentifier(str, "raw", packageName)) == 0) {
            identifier = resources.getIdentifier("onesignal_default_sound", "raw", packageName);
            if (identifier == 0) {
                return null;
            }
            sb = new StringBuilder();
        } else {
            sb = new StringBuilder();
        }
        sb.append("android.resource://");
        sb.append(packageName);
        sb.append("/");
        sb.append(identifier);
        return Uri.parse(sb.toString());
    }

    /* renamed from: b */
    static void m16874b(String str) {
        m16866a(Uri.parse(str.trim()));
    }

    /* renamed from: c */
    private Integer m16875c(Context context) {
        boolean k = m16882k();
        boolean j = m16881j();
        if (!k && !j) {
            C4306Xa.m17135a(C4306Xa.C4316j.FATAL, "Could not find the Android Support Library. Please make sure it has been correctly added to your project.");
            return -3;
        } else if (!k || !j) {
            C4306Xa.m17135a(C4306Xa.C4316j.FATAL, "The included Android Support Library is to old or incomplete. Please update to the 26.0.0 revision or newer.");
            return -5;
        } else if (Build.VERSION.SDK_INT < 26 || m16872b(context) < 26 || m16880i()) {
            return null;
        } else {
            C4306Xa.m17135a(C4306Xa.C4316j.FATAL, "The included Android Support Library is to old or incomplete. Please update to the 26.0.0 revision or newer.");
            return -5;
        }
    }

    /* renamed from: c */
    static String m16876c() {
        String language = Locale.getDefault().getLanguage();
        if (language.equals("iw")) {
            return "he";
        }
        if (language.equals("in")) {
            return "id";
        }
        if (language.equals("ji")) {
            return "yi";
        }
        if (!language.equals("zh")) {
            return language;
        }
        return language + "-" + Locale.getDefault().getCountry();
    }

    /* renamed from: f */
    static boolean m16877f() {
        return true;
    }

    /* renamed from: g */
    static <T> Set<T> m16878g() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    /* renamed from: h */
    private static boolean m16879h() {
        return true;
    }

    /* renamed from: i */
    private static boolean m16880i() {
        return true;
    }

    /* renamed from: j */
    private static boolean m16881j() {
        return true;
    }

    /* renamed from: k */
    private static boolean m16882k() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo12313a(Context context, int i, String str) {
        Integer a;
        try {
            UUID.fromString(str);
            if ("b2f7f966-d8cc-11e4-bed1-df8f05be55ba".equals(str) || "5eb5a37e-b458-11e3-ac11-000c2940e62c".equals(str)) {
                C4306Xa.m17135a(C4306Xa.C4316j.ERROR, "OneSignal Example AppID detected, please update to your app's id found on OneSignal.com");
            }
            int i2 = 1;
            if (i == 1 && (a = mo12314a()) != null) {
                i2 = a.intValue();
            }
            Integer c = m16875c(context);
            return c != null ? c.intValue() : i2;
        } catch (Throwable th) {
            C4306Xa.m17136a(C4306Xa.C4316j.FATAL, "OneSignal AppId format is invalid.\nExample: 'b2f7f966-d8cc-11e4-bed1-df8f05be55ba'\n", th);
            return -999;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Integer mo12314a() {
        boolean f = m16877f();
        boolean h = m16879h();
        if (f || h) {
            if (h && !f) {
                C4306Xa.m17135a(C4306Xa.C4316j.WARN, "GCM Library detected, please upgrade to Firebase FCM library as GCM is deprecated!");
            }
            if (!h || !f) {
                return null;
            }
            C4306Xa.m17135a(C4306Xa.C4316j.WARN, "Both GCM & FCM Libraries detected! Please remove the deprecated GCM library.");
            return null;
        }
        C4306Xa.m17135a(C4306Xa.C4316j.FATAL, "The Firebase FCM library is missing! Please make sure to include it in your project.");
        return -4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo12315b() {
        try {
            String networkOperatorName = ((TelephonyManager) C4306Xa.f12759e.getSystemService("phone")).getNetworkOperatorName();
            if ("".equals(networkOperatorName)) {
                return null;
            }
            return networkOperatorName;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo12316d() {
        try {
            Class.forName("com.amazon.device.messaging.ADM");
            return 2;
        } catch (ClassNotFoundException unused) {
            return 1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Integer mo12317e() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) C4306Xa.f12759e.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return null;
        }
        int type = activeNetworkInfo.getType();
        return (type == 1 || type == 9) ? 0 : 1;
    }
}
