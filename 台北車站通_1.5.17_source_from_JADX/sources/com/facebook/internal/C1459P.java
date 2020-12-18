package com.facebook.internal;

import android.util.Log;
import com.facebook.C1355K;
import com.facebook.C1601x;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.internal.P */
public class C1459P {

    /* renamed from: a */
    private static final HashMap<String, String> f5080a = new HashMap<>();

    /* renamed from: b */
    private final C1355K f5081b;

    /* renamed from: c */
    private final String f5082c;

    /* renamed from: d */
    private StringBuilder f5083d;

    /* renamed from: e */
    private int f5084e = 3;

    public C1459P(C1355K k, String str) {
        C1484ca.m6977a(str, "tag");
        this.f5081b = k;
        this.f5082c = "FacebookSDK." + str;
        this.f5083d = new StringBuilder();
    }

    /* renamed from: a */
    public static void m6839a(C1355K k, int i, String str, String str2) {
        if (C1601x.m7385a(k)) {
            String d = m6846d(str2);
            if (!str.startsWith("FacebookSDK.")) {
                str = "FacebookSDK." + str;
            }
            Log.println(i, str, d);
            if (k == C1355K.DEVELOPER_ERRORS) {
                new Exception().printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m6840a(C1355K k, int i, String str, String str2, Object... objArr) {
        if (C1601x.m7385a(k)) {
            m6839a(k, i, str, String.format(str2, objArr));
        }
    }

    /* renamed from: a */
    public static void m6841a(C1355K k, String str, String str2) {
        m6839a(k, 3, str, str2);
    }

    /* renamed from: a */
    public static void m6842a(C1355K k, String str, String str2, Object... objArr) {
        if (C1601x.m7385a(k)) {
            m6839a(k, 3, str, String.format(str2, objArr));
        }
    }

    /* renamed from: a */
    public static synchronized void m6843a(String str, String str2) {
        synchronized (C1459P.class) {
            f5080a.put(str, str2);
        }
    }

    /* renamed from: b */
    private boolean m6844b() {
        return C1601x.m7385a(this.f5081b);
    }

    /* renamed from: c */
    public static synchronized void m6845c(String str) {
        synchronized (C1459P.class) {
            if (!C1601x.m7385a(C1355K.INCLUDE_ACCESS_TOKENS)) {
                m6843a(str, "ACCESS_TOKEN_REMOVED");
            }
        }
    }

    /* renamed from: d */
    private static synchronized String m6846d(String str) {
        synchronized (C1459P.class) {
            for (Map.Entry next : f5080a.entrySet()) {
                str = str.replace((CharSequence) next.getKey(), (CharSequence) next.getValue());
            }
        }
        return str;
    }

    /* renamed from: a */
    public void mo6154a() {
        mo6158b(this.f5083d.toString());
        this.f5083d = new StringBuilder();
    }

    /* renamed from: a */
    public void mo6155a(String str) {
        if (m6844b()) {
            this.f5083d.append(str);
        }
    }

    /* renamed from: a */
    public void mo6156a(String str, Object obj) {
        mo6157a("  %s:\t%s\n", str, obj);
    }

    /* renamed from: a */
    public void mo6157a(String str, Object... objArr) {
        if (m6844b()) {
            this.f5083d.append(String.format(str, objArr));
        }
    }

    /* renamed from: b */
    public void mo6158b(String str) {
        m6839a(this.f5081b, this.f5084e, this.f5082c, str);
    }
}
