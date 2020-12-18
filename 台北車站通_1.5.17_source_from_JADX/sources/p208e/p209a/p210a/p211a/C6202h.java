package p208e.p209a.p210a.p211a;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p208e.p209a.p210a.p211a.p212a.p214b.C6080l;

/* renamed from: e.a.a.a.h */
class C6202h implements Callable<Map<String, C6210o>> {

    /* renamed from: a */
    final String f17311a;

    C6202h(String str) {
        this.f17311a = str;
    }

    /* renamed from: a */
    private C6210o m23437a(ZipEntry zipEntry, ZipFile zipFile) {
        InputStream inputStream;
        try {
            inputStream = zipFile.getInputStream(zipEntry);
            try {
                Properties properties = new Properties();
                properties.load(inputStream);
                String property = properties.getProperty("fabric-identifier");
                String property2 = properties.getProperty("fabric-version");
                String property3 = properties.getProperty("fabric-build-type");
                if (TextUtils.isEmpty(property) || TextUtils.isEmpty(property2)) {
                    throw new IllegalStateException("Invalid format of fabric file," + zipEntry.getName());
                }
                C6210o oVar = new C6210o(property, property2, property3);
                C6080l.m23041a((Closeable) inputStream);
                return oVar;
            } catch (IOException e) {
                e = e;
                try {
                    C6199f.m23420f().mo16266b("Fabric", "Error when parsing fabric properties " + zipEntry.getName(), e);
                    C6080l.m23041a((Closeable) inputStream);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    C6080l.m23041a((Closeable) inputStream);
                    throw th;
                }
            }
        } catch (IOException e2) {
            e = e2;
            inputStream = null;
            C6199f.m23420f().mo16266b("Fabric", "Error when parsing fabric properties " + zipEntry.getName(), e);
            C6080l.m23041a((Closeable) inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            C6080l.m23041a((Closeable) inputStream);
            throw th;
        }
    }

    /* renamed from: b */
    private Map<String, C6210o> m23438b() {
        HashMap hashMap = new HashMap();
        try {
            Class.forName("com.google.android.gms.ads.e");
            C6210o oVar = new C6210o("com.google.firebase.firebase-ads", "0.0.0", "binary");
            hashMap.put(oVar.mo16313b(), oVar);
            C6199f.m23420f().mo16267c("Fabric", "Found kit: com.google.firebase.firebase-ads");
        } catch (Exception unused) {
        }
        return hashMap;
    }

    /* renamed from: c */
    private Map<String, C6210o> m23439c() {
        C6210o a;
        HashMap hashMap = new HashMap();
        ZipFile a2 = mo16296a();
        Enumeration<? extends ZipEntry> entries = a2.entries();
        while (entries.hasMoreElements()) {
            ZipEntry zipEntry = (ZipEntry) entries.nextElement();
            if (zipEntry.getName().startsWith("fabric/") && zipEntry.getName().length() > 7 && (a = m23437a(zipEntry, a2)) != null) {
                hashMap.put(a.mo16313b(), a);
                C6199f.m23420f().mo16267c("Fabric", String.format("Found kit:[%s] version:[%s]", new Object[]{a.mo16313b(), a.mo16314c()}));
            }
        }
        if (a2 != null) {
            try {
                a2.close();
            } catch (IOException unused) {
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ZipFile mo16296a() {
        return new ZipFile(this.f17311a);
    }

    public Map<String, C6210o> call() {
        HashMap hashMap = new HashMap();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        hashMap.putAll(m23438b());
        hashMap.putAll(m23439c());
        C6211p f = C6199f.m23420f();
        f.mo16267c("Fabric", "finish scanning in " + (SystemClock.elapsedRealtime() - elapsedRealtime));
        return hashMap;
    }
}
