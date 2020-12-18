package p101d.p122f.p123a.p126c;

import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p208e.p209a.p210a.p211a.C6199f;

/* renamed from: d.f.a.c.T */
class C5367T implements C5411ga {

    /* renamed from: a */
    private final File[] f15159a;

    /* renamed from: b */
    private final Map<String, String> f15160b = new HashMap(C5413ha.f15269a);

    /* renamed from: c */
    private final String f15161c;

    public C5367T(String str, File[] fileArr) {
        this.f15159a = fileArr;
        this.f15161c = str;
    }

    /* renamed from: a */
    public Map<String, String> mo14791a() {
        return Collections.unmodifiableMap(this.f15160b);
    }

    /* renamed from: b */
    public String mo14792b() {
        return this.f15161c;
    }

    /* renamed from: c */
    public File mo14793c() {
        return this.f15159a[0];
    }

    /* renamed from: d */
    public File[] mo14794d() {
        return this.f15159a;
    }

    public String getFileName() {
        return this.f15159a[0].getName();
    }

    public void remove() {
        for (File file : this.f15159a) {
            C6199f.m23420f().mo16269d("CrashlyticsCore", "Removing invalid report file at " + file.getPath());
            file.delete();
        }
    }
}
