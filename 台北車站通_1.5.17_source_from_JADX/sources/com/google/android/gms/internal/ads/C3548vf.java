package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.JsonWriter;
import com.google.android.gms.common.util.C2081c;
import com.google.android.gms.common.util.C2083e;
import com.google.android.gms.common.util.C2086h;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.vf */
public final class C3548vf {

    /* renamed from: a */
    private static Object f10336a = new Object();

    /* renamed from: b */
    private static boolean f10337b = false;

    /* renamed from: c */
    private static boolean f10338c = false;

    /* renamed from: d */
    private static C2083e f10339d = C2086h.m9144d();

    /* renamed from: e */
    private static final Set<String> f10340e = new HashSet(Arrays.asList(new String[0]));

    /* renamed from: f */
    private final List<String> f10341f;

    public C3548vf() {
        this((String) null);
    }

    public C3548vf(String str) {
        List<String> list;
        if (!m14223a()) {
            list = new ArrayList<>();
        } else {
            String uuid = UUID.randomUUID().toString();
            if (str == null) {
                String[] strArr = new String[1];
                String valueOf = String.valueOf(uuid);
                strArr[0] = valueOf.length() != 0 ? "network_request_".concat(valueOf) : new String("network_request_");
                list = Arrays.asList(strArr);
            } else {
                String[] strArr2 = new String[2];
                String valueOf2 = String.valueOf(str);
                strArr2[0] = valueOf2.length() != 0 ? "ad_request_".concat(valueOf2) : new String("ad_request_");
                String valueOf3 = String.valueOf(uuid);
                strArr2[1] = valueOf3.length() != 0 ? "network_request_".concat(valueOf3) : new String("network_request_");
                list = Arrays.asList(strArr2);
            }
        }
        this.f10341f = list;
    }

    /* renamed from: a */
    static final /* synthetic */ void m14216a(int i, Map map, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value((long) i);
        jsonWriter.endObject();
        m14217a(jsonWriter, (Map<String, ?>) map);
        jsonWriter.endObject();
    }

    /* renamed from: a */
    private static void m14217a(JsonWriter jsonWriter, Map<String, ?> map) {
        if (map != null) {
            jsonWriter.name("headers").beginArray();
            Iterator<Map.Entry<String, ?>> it = map.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                String str = (String) next.getKey();
                if (!f10340e.contains(str)) {
                    if (!(next.getValue() instanceof List)) {
                        if (!(next.getValue() instanceof String)) {
                            C2227Cf.m9529a("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                            break;
                        }
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name("value").value((String) next.getValue());
                        jsonWriter.endObject();
                    } else {
                        for (String value : (List) next.getValue()) {
                            jsonWriter.beginObject();
                            jsonWriter.name("name").value(str);
                            jsonWriter.name("value").value(value);
                            jsonWriter.endObject();
                        }
                    }
                }
            }
            jsonWriter.endArray();
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m14218a(String str, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }

    /* renamed from: a */
    private final void m14219a(String str, C2199Bf bf) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(f10339d.mo7725a());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            for (String value : this.f10341f) {
                jsonWriter.value(value);
            }
            jsonWriter.endArray();
            bf.mo7817a(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e) {
            C2227Cf.m9533b("unable to log", e);
        }
        m14229c(stringWriter.toString());
    }

    /* renamed from: a */
    static final /* synthetic */ void m14220a(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        m14217a(jsonWriter, (Map<String, ?>) map);
        if (bArr != null) {
            jsonWriter.name("body").value(C2081c.m9108a(bArr));
        }
        jsonWriter.endObject();
    }

    /* renamed from: a */
    public static void m14221a(boolean z) {
        synchronized (f10336a) {
            f10337b = true;
            f10338c = z;
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m14222a(byte[] bArr, JsonWriter jsonWriter) {
        String str;
        jsonWriter.name("params").beginObject();
        int length = bArr.length;
        String a = C2081c.m9108a(bArr);
        if (length < 10000) {
            str = "body";
        } else {
            a = C3432rf.m13598a(a);
            if (a != null) {
                str = "bodydigest";
            }
            jsonWriter.name("bodylength").value((long) length);
            jsonWriter.endObject();
        }
        jsonWriter.name(str).value(a);
        jsonWriter.name("bodylength").value((long) length);
        jsonWriter.endObject();
    }

    /* renamed from: a */
    public static boolean m14223a() {
        boolean z;
        synchronized (f10336a) {
            z = f10337b && f10338c;
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m14224a(Context context) {
        if (Build.VERSION.SDK_INT < 17) {
            return false;
        }
        if (!((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7772Lb)).booleanValue()) {
            return false;
        }
        try {
            return Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0;
        } catch (Exception e) {
            C2227Cf.m9535c("Fail to determine debug setting.", e);
            return false;
        }
    }

    /* renamed from: b */
    public static void m14225b() {
        synchronized (f10336a) {
            f10337b = false;
            f10338c = false;
            C2227Cf.m9536d("Ad debug logging enablement is out of date.");
        }
    }

    /* renamed from: b */
    private final void m14226b(String str) {
        m14219a("onNetworkRequestError", (C2199Bf) new C2170Af(str));
    }

    /* renamed from: b */
    private final void m14227b(String str, String str2, Map<String, ?> map, byte[] bArr) {
        m14219a("onNetworkRequest", (C2199Bf) new C3576wf(str, str2, map, bArr));
    }

    /* renamed from: b */
    private final void m14228b(Map<String, ?> map, int i) {
        m14219a("onNetworkResponse", (C2199Bf) new C3632yf(i, map));
    }

    /* renamed from: c */
    private static synchronized void m14229c(String str) {
        synchronized (C3548vf.class) {
            C2227Cf.m9534c("GMA Debug BEGIN");
            int i = 0;
            while (i < str.length()) {
                int i2 = i + 4000;
                String valueOf = String.valueOf(str.substring(i, Math.min(i2, str.length())));
                C2227Cf.m9534c(valueOf.length() != 0 ? "GMA Debug CONTENT ".concat(valueOf) : new String("GMA Debug CONTENT "));
                i = i2;
            }
            C2227Cf.m9534c("GMA Debug FINISH");
        }
    }

    /* renamed from: c */
    public static boolean m14230c() {
        boolean z;
        synchronized (f10336a) {
            z = f10337b;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo10122a(String str) {
        if (m14223a() && str != null) {
            mo10127a(str.getBytes());
        }
    }

    /* renamed from: a */
    public final void mo10123a(String str, String str2, Map<String, ?> map, byte[] bArr) {
        if (m14223a()) {
            m14227b(str, str2, map, bArr);
        }
    }

    /* renamed from: a */
    public final void mo10124a(HttpURLConnection httpURLConnection, int i) {
        if (m14223a()) {
            String str = null;
            m14228b(httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), i);
            if (i < 200 || i >= 300) {
                try {
                    str = httpURLConnection.getResponseMessage();
                } catch (IOException e) {
                    String valueOf = String.valueOf(e.getMessage());
                    C2227Cf.m9536d(valueOf.length() != 0 ? "Can not get error message from error HttpURLConnection\n".concat(valueOf) : new String("Can not get error message from error HttpURLConnection\n"));
                }
                m14226b(str);
            }
        }
    }

    /* renamed from: a */
    public final void mo10125a(HttpURLConnection httpURLConnection, byte[] bArr) {
        if (m14223a()) {
            m14227b(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr);
        }
    }

    /* renamed from: a */
    public final void mo10126a(Map<String, ?> map, int i) {
        if (m14223a()) {
            m14228b(map, i);
            if (i < 200 || i >= 300) {
                m14226b((String) null);
            }
        }
    }

    /* renamed from: a */
    public final void mo10127a(byte[] bArr) {
        m14219a("onNetworkResponseBody", (C2199Bf) new C3661zf(bArr));
    }
}
