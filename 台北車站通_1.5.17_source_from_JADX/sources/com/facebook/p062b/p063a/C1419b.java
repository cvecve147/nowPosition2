package com.facebook.p062b.p063a;

import android.annotation.TargetApi;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import com.facebook.C1601x;
import com.facebook.internal.C1430A;
import com.facebook.internal.C1473X;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.b.a.b */
public class C1419b {

    /* renamed from: a */
    private static HashMap<String, NsdManager.RegistrationListener> f4976a = new HashMap<>();

    /* renamed from: a */
    public static String m6748a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device", Build.DEVICE);
            jSONObject.put("model", Build.MODEL);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    public static void m6749a(String str) {
        m6752c(str);
    }

    /* renamed from: b */
    public static boolean m6750b() {
        return Build.VERSION.SDK_INT >= 16 && C1430A.m6778b(C1601x.m7389c()).mo6252g().contains(C1473X.f5108b);
    }

    /* renamed from: b */
    public static boolean m6751b(String str) {
        if (m6750b()) {
            return m6753d(str);
        }
        return false;
    }

    @TargetApi(16)
    /* renamed from: c */
    private static void m6752c(String str) {
        NsdManager.RegistrationListener registrationListener = f4976a.get(str);
        if (registrationListener != null) {
            ((NsdManager) C1601x.m7386b().getSystemService("servicediscovery")).unregisterService(registrationListener);
            f4976a.remove(str);
        }
    }

    @TargetApi(16)
    /* renamed from: d */
    private static boolean m6753d(String str) {
        if (f4976a.containsKey(str)) {
            return true;
        }
        String format = String.format("%s_%s_%s", new Object[]{"fbsdk", String.format("%s-%s", new Object[]{"android", C1601x.m7399l().replace('.', '|')}), str});
        NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
        nsdServiceInfo.setServiceType("_fb._tcp.");
        nsdServiceInfo.setServiceName(format);
        nsdServiceInfo.setPort(80);
        C1418a aVar = new C1418a(format, str);
        f4976a.put(str, aVar);
        ((NsdManager) C1601x.m7386b().getSystemService("servicediscovery")).registerService(nsdServiceInfo, 1, aVar);
        return true;
    }
}
