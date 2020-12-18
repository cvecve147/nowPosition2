package com.google.android.gms.iid;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p013b.p018b.p028h.p039h.C1080b;

@Deprecated
/* renamed from: com.google.android.gms.iid.a */
public class C2137a {

    /* renamed from: a */
    private static Map<String, C2137a> f6614a = new C1080b();

    /* renamed from: b */
    private static long f6615b = TimeUnit.DAYS.toSeconds(7);

    /* renamed from: c */
    private static C2149m f6616c;

    /* renamed from: d */
    private static C2144h f6617d;

    /* renamed from: e */
    private static String f6618e;

    /* renamed from: f */
    private Context f6619f;

    /* renamed from: g */
    private String f6620g = "";

    private C2137a(Context context, String str) {
        this.f6619f = context.getApplicationContext();
        this.f6620g = str;
    }

    @Deprecated
    /* renamed from: a */
    public static C2137a m9230a(Context context) {
        return m9231a(context, (Bundle) null);
    }

    /* renamed from: a */
    public static synchronized C2137a m9231a(Context context, Bundle bundle) {
        C2137a aVar;
        synchronized (C2137a.class) {
            String string = bundle == null ? "" : bundle.getString("subtype");
            if (string == null) {
                string = "";
            }
            Context applicationContext = context.getApplicationContext();
            if (f6616c == null) {
                String packageName = applicationContext.getPackageName();
                StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 73);
                sb.append("Instance ID SDK is deprecated, ");
                sb.append(packageName);
                sb.append(" should update to use Firebase Instance ID");
                Log.w("InstanceID", sb.toString());
                f6616c = new C2149m(applicationContext);
                f6617d = new C2144h(applicationContext);
            }
            f6618e = Integer.toString(m9234b(applicationContext));
            aVar = f6614a.get(string);
            if (aVar == null) {
                aVar = new C2137a(applicationContext, string);
                f6614a.put(string, aVar);
            }
        }
        return aVar;
    }

    /* renamed from: a */
    static String m9232a(KeyPair keyPair) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(keyPair.getPublic().getEncoded());
            digest[0] = (byte) ((digest[0] & 15) + 112);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("InstanceID", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    /* renamed from: a */
    private final KeyPair m9233a() {
        return f6616c.mo7773b(this.f6620g).mo7778a();
    }

    /* renamed from: b */
    static int m9234b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
            sb.append("Never happens: can't find own package ");
            sb.append(valueOf);
            Log.w("InstanceID", sb.toString());
            return 0;
        }
    }

    /* renamed from: c */
    static String m9235c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
            sb.append("Never happens: can't find own package ");
            sb.append(valueOf);
            Log.w("InstanceID", sb.toString());
            return null;
        }
    }

    @Deprecated
    /* renamed from: a */
    public String mo7759a(String str, String str2, Bundle bundle) {
        String a;
        if (Looper.getMainLooper() != Looper.myLooper()) {
            String str3 = null;
            String a2 = f6616c.mo7769a("appVersion");
            boolean z = true;
            if (!(a2 == null || !a2.equals(f6618e) || (a = f6616c.mo7769a("lastToken")) == null)) {
                if ((System.currentTimeMillis() / 1000) - Long.valueOf(Long.parseLong(a)).longValue() <= f6615b) {
                    z = false;
                }
            }
            if (!z) {
                str3 = f6616c.mo7770a(this.f6620g, str, str2);
            }
            if (str3 != null) {
                return str3;
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            String b = mo7760b(str, str2, bundle);
            if (b == null) {
                return b;
            }
            f6616c.mo7771a(this.f6620g, str, str2, b, f6618e);
            return b;
        }
        throw new IOException("MAIN_THREAD");
    }

    /* renamed from: b */
    public final String mo7760b(String str, String str2, Bundle bundle) {
        if (str2 != null) {
            bundle.putString("scope", str2);
        }
        bundle.putString("sender", str);
        String str3 = "".equals(this.f6620g) ? str : this.f6620g;
        if (!bundle.containsKey("legacy.register")) {
            bundle.putString("subscription", str);
            bundle.putString("subtype", str3);
            bundle.putString("X-subscription", str);
            bundle.putString("X-subtype", str3);
        }
        String a = C2144h.m9244a(f6617d.mo7764a(bundle, m9233a()));
        if (!"RST".equals(a) && !a.startsWith("RST|")) {
            return a;
        }
        C2138b.m9238a(this.f6619f, f6616c);
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }
}
