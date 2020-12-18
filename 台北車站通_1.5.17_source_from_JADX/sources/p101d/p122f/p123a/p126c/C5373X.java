package p101d.p122f.p123a.p126c;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.http.protocol.HTTP;
import org.json.JSONObject;
import p208e.p209a.p210a.p211a.C6199f;
import p208e.p209a.p210a.p211a.p212a.p214b.C6080l;

/* renamed from: d.f.a.c.X */
class C5373X {

    /* renamed from: a */
    private static final Charset f15168a = Charset.forName(HTTP.UTF_8);

    /* renamed from: b */
    private final File f15169b;

    public C5373X(File file) {
        this.f15169b = file;
    }

    /* renamed from: a */
    private static String m20676a(JSONObject jSONObject, String str) {
        if (!jSONObject.isNull(str)) {
            return jSONObject.optString(str, (String) null);
        }
        return null;
    }

    /* renamed from: c */
    private File m20677c(String str) {
        File file = this.f15169b;
        return new File(file, str + "keys" + ".meta");
    }

    /* renamed from: d */
    private File m20678d(String str) {
        File file = this.f15169b;
        return new File(file, str + "user" + ".meta");
    }

    /* renamed from: e */
    private static Map<String, String> m20679e(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, m20676a(jSONObject, next));
        }
        return hashMap;
    }

    /* renamed from: f */
    private static C5432na m20680f(String str) {
        JSONObject jSONObject = new JSONObject(str);
        return new C5432na(m20676a(jSONObject, "userId"), m20676a(jSONObject, "userName"), m20676a(jSONObject, "userEmail"));
    }

    /* renamed from: a */
    public Map<String, String> mo14804a(String str) {
        File c = m20677c(str);
        if (!c.exists()) {
            return Collections.emptyMap();
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(c);
            try {
                Map<String, String> e = m20679e(C6080l.m23049b((InputStream) fileInputStream2));
                C6080l.m23042a((Closeable) fileInputStream2, "Failed to close user metadata file.");
                return e;
            } catch (Exception e2) {
                e = e2;
                fileInputStream = fileInputStream2;
                try {
                    C6199f.m23420f().mo16266b("CrashlyticsCore", "Error deserializing user metadata.", e);
                    C6080l.m23042a((Closeable) fileInputStream, "Failed to close user metadata file.");
                    return Collections.emptyMap();
                } catch (Throwable th) {
                    th = th;
                    C6080l.m23042a((Closeable) fileInputStream, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                C6080l.m23042a((Closeable) fileInputStream, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            C6199f.m23420f().mo16266b("CrashlyticsCore", "Error deserializing user metadata.", e);
            C6080l.m23042a((Closeable) fileInputStream, "Failed to close user metadata file.");
            return Collections.emptyMap();
        }
    }

    /* renamed from: b */
    public C5432na mo14805b(String str) {
        File d = m20678d(str);
        if (!d.exists()) {
            return C5432na.f15301a;
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(d);
            try {
                C5432na f = m20680f(C6080l.m23049b((InputStream) fileInputStream2));
                C6080l.m23042a((Closeable) fileInputStream2, "Failed to close user metadata file.");
                return f;
            } catch (Exception e) {
                e = e;
                fileInputStream = fileInputStream2;
                try {
                    C6199f.m23420f().mo16266b("CrashlyticsCore", "Error deserializing user metadata.", e);
                    C6080l.m23042a((Closeable) fileInputStream, "Failed to close user metadata file.");
                    return C5432na.f15301a;
                } catch (Throwable th) {
                    th = th;
                    C6080l.m23042a((Closeable) fileInputStream, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                C6080l.m23042a((Closeable) fileInputStream, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            C6199f.m23420f().mo16266b("CrashlyticsCore", "Error deserializing user metadata.", e);
            C6080l.m23042a((Closeable) fileInputStream, "Failed to close user metadata file.");
            return C5432na.f15301a;
        }
    }
}
