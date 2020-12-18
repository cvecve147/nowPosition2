package com.facebook.p060a;

import android.os.Bundle;
import com.facebook.C1355K;
import com.facebook.C1574p;
import com.facebook.internal.C1459P;
import com.facebook.internal.C1480ba;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Locale;
import java.util.UUID;
import org.apache.http.protocol.HTTP;
import org.json.JSONObject;

/* renamed from: com.facebook.a.f */
class C1392f implements Serializable {

    /* renamed from: a */
    private static final HashSet<String> f4906a = new HashSet<>();

    /* renamed from: b */
    private final JSONObject f4907b;

    /* renamed from: c */
    private final boolean f4908c;

    /* renamed from: d */
    private final String f4909d;

    /* renamed from: e */
    private final String f4910e;

    /* renamed from: com.facebook.a.f$a */
    static class C1393a implements Serializable {

        /* renamed from: a */
        private final String f4911a;

        /* renamed from: b */
        private final boolean f4912b;

        private Object readResolve() {
            return new C1392f(this.f4911a, this.f4912b, (String) null);
        }
    }

    /* renamed from: com.facebook.a.f$b */
    static class C1394b implements Serializable {

        /* renamed from: a */
        private final String f4913a;

        /* renamed from: b */
        private final boolean f4914b;

        /* renamed from: c */
        private final String f4915c;

        private C1394b(String str, boolean z, String str2) {
            this.f4913a = str;
            this.f4914b = z;
            this.f4915c = str2;
        }

        private Object readResolve() {
            return new C1392f(this.f4913a, this.f4914b, this.f4915c);
        }
    }

    public C1392f(String str, String str2, Double d, Bundle bundle, boolean z, UUID uuid) {
        this.f4907b = m6676a(str, str2, d, bundle, z, uuid);
        this.f4908c = z;
        this.f4909d = str2;
        this.f4910e = m6678e();
    }

    private C1392f(String str, boolean z, String str2) {
        this.f4907b = new JSONObject(str);
        this.f4908c = z;
        this.f4909d = this.f4907b.optString("_eventName");
        this.f4910e = str2;
    }

    /* renamed from: a */
    private static String m6674a(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            byte[] bytes = str.getBytes(HTTP.UTF_8);
            instance.update(bytes, 0, bytes.length);
            return m6675a(instance.digest());
        } catch (NoSuchAlgorithmException e) {
            C1480ba.m6942a("Failed to generate checksum: ", (Exception) e);
            return "0";
        } catch (UnsupportedEncodingException e2) {
            C1480ba.m6942a("Failed to generate checksum: ", (Exception) e2);
            return "1";
        }
    }

    /* renamed from: a */
    private static String m6675a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(String.format("%02x", new Object[]{Byte.valueOf(bArr[i])}));
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    private static JSONObject m6676a(String str, String str2, Double d, Bundle bundle, boolean z, UUID uuid) {
        m6677b(str2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("_eventName", str2);
        jSONObject.put("_logTime", System.currentTimeMillis() / 1000);
        jSONObject.put("_ui", str);
        if (uuid != null) {
            jSONObject.put("_session_id", uuid);
        }
        if (d != null) {
            jSONObject.put("_valueToSum", d.doubleValue());
        }
        if (z) {
            jSONObject.put("_implicitlyLogged", "1");
        }
        String e = C1406q.m6718e();
        if (e != null) {
            jSONObject.put("_app_user_id", e);
        }
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                m6677b(str3);
                Object obj = bundle.get(str3);
                if ((obj instanceof String) || (obj instanceof Number)) {
                    jSONObject.put(str3, obj.toString());
                } else {
                    throw new C1574p(String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", new Object[]{obj, str3}));
                }
            }
        }
        if (!z) {
            C1459P.m6842a(C1355K.APP_EVENTS, "AppEvents", "Created app event '%s'", jSONObject.toString());
        }
        return jSONObject;
    }

    /* renamed from: b */
    private static void m6677b(String str) {
        boolean contains;
        if (str == null || str.length() == 0 || str.length() > 40) {
            if (str == null) {
                str = "<None Provided>";
            }
            throw new C1574p(String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", new Object[]{str, 40}));
        }
        synchronized (f4906a) {
            contains = f4906a.contains(str);
        }
        if (contains) {
            return;
        }
        if (str.matches("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$")) {
            synchronized (f4906a) {
                f4906a.add(str);
            }
            return;
        }
        throw new C1574p(String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", new Object[]{str}));
    }

    /* renamed from: e */
    private String m6678e() {
        return m6674a(this.f4907b.toString());
    }

    private Object writeReplace() {
        return new C1394b(this.f4907b.toString(), this.f4908c, this.f4910e);
    }

    /* renamed from: a */
    public boolean mo6050a() {
        return this.f4908c;
    }

    /* renamed from: b */
    public JSONObject mo6051b() {
        return this.f4907b;
    }

    /* renamed from: c */
    public String mo6052c() {
        return this.f4909d;
    }

    /* renamed from: d */
    public boolean mo6053d() {
        if (this.f4910e == null) {
            return true;
        }
        return m6678e().equals(this.f4910e);
    }

    public String toString() {
        return String.format("\"%s\", implicit: %b, json: %s", new Object[]{this.f4907b.optString("_eventName"), Boolean.valueOf(this.f4908c), this.f4907b.toString()});
    }
}
