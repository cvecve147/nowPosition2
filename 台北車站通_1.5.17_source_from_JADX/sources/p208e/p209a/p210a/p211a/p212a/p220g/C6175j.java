package p208e.p209a.p210a.p211a.p212a.p220g;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import org.json.JSONObject;
import p208e.p209a.p210a.p211a.C6199f;
import p208e.p209a.p210a.p211a.C6208m;
import p208e.p209a.p210a.p211a.p212a.p214b.C6080l;
import p208e.p209a.p210a.p211a.p212a.p219f.C6162b;

/* renamed from: e.a.a.a.a.g.j */
class C6175j implements C6173h {

    /* renamed from: a */
    private final C6208m f17216a;

    public C6175j(C6208m mVar) {
        this.f17216a = mVar;
    }

    /* renamed from: a */
    public JSONObject mo16241a() {
        Throwable th;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        C6199f.m23420f().mo16269d("Fabric", "Reading cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            File file = new File(new C6162b(this.f17216a).mo16233a(), "com.crashlytics.settings.json");
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    jSONObject = new JSONObject(C6080l.m23049b((InputStream) fileInputStream));
                    fileInputStream2 = fileInputStream;
                } catch (Exception e) {
                    e = e;
                    try {
                        C6199f.m23420f().mo16266b("Fabric", "Failed to fetch cached settings", e);
                        C6080l.m23042a((Closeable) fileInputStream, "Error while closing settings cache file.");
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream2 = fileInputStream;
                        C6080l.m23042a((Closeable) fileInputStream2, "Error while closing settings cache file.");
                        throw th;
                    }
                }
            } else {
                C6199f.m23420f().mo16269d("Fabric", "No cached settings found.");
                jSONObject = null;
            }
            C6080l.m23042a((Closeable) fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
            C6199f.m23420f().mo16266b("Fabric", "Failed to fetch cached settings", e);
            C6080l.m23042a((Closeable) fileInputStream, "Error while closing settings cache file.");
            return null;
        } catch (Throwable th3) {
            th = th3;
            C6080l.m23042a((Closeable) fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    /* renamed from: a */
    public void mo16242a(long j, JSONObject jSONObject) {
        C6199f.m23420f().mo16269d("Fabric", "Writing settings to cache file...");
        if (jSONObject != null) {
            FileWriter fileWriter = null;
            try {
                jSONObject.put("expires_at", j);
                FileWriter fileWriter2 = new FileWriter(new File(new C6162b(this.f17216a).mo16233a(), "com.crashlytics.settings.json"));
                try {
                    fileWriter2.write(jSONObject.toString());
                    fileWriter2.flush();
                    C6080l.m23042a((Closeable) fileWriter2, "Failed to close settings writer.");
                } catch (Exception e) {
                    e = e;
                    fileWriter = fileWriter2;
                    try {
                        C6199f.m23420f().mo16266b("Fabric", "Failed to cache settings", e);
                        C6080l.m23042a((Closeable) fileWriter, "Failed to close settings writer.");
                    } catch (Throwable th) {
                        th = th;
                        C6080l.m23042a((Closeable) fileWriter, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter = fileWriter2;
                    C6080l.m23042a((Closeable) fileWriter, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                C6199f.m23420f().mo16266b("Fabric", "Failed to cache settings", e);
                C6080l.m23042a((Closeable) fileWriter, "Failed to close settings writer.");
            }
        }
    }
}
