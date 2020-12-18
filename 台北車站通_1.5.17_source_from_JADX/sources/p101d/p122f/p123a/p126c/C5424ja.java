package p101d.p122f.p123a.p126c;

import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p208e.p209a.p210a.p211a.C6199f;
import p208e.p209a.p210a.p211a.C6211p;

/* renamed from: d.f.a.c.ja */
class C5424ja implements C5411ga {

    /* renamed from: a */
    private final File f15288a;

    /* renamed from: b */
    private final File[] f15289b;

    /* renamed from: c */
    private final Map<String, String> f15290c;

    public C5424ja(File file) {
        this(file, Collections.emptyMap());
    }

    public C5424ja(File file, Map<String, String> map) {
        this.f15288a = file;
        this.f15289b = new File[]{file};
        this.f15290c = new HashMap(map);
        if (this.f15288a.length() == 0) {
            this.f15290c.putAll(C5413ha.f15269a);
        }
    }

    /* renamed from: a */
    public Map<String, String> mo14791a() {
        return Collections.unmodifiableMap(this.f15290c);
    }

    /* renamed from: b */
    public String mo14792b() {
        String fileName = getFileName();
        return fileName.substring(0, fileName.lastIndexOf(46));
    }

    /* renamed from: c */
    public File mo14793c() {
        return this.f15288a;
    }

    /* renamed from: d */
    public File[] mo14794d() {
        return this.f15289b;
    }

    public String getFileName() {
        return mo14793c().getName();
    }

    public void remove() {
        C6211p f = C6199f.m23420f();
        f.mo16269d("CrashlyticsCore", "Removing report at " + this.f15288a.getPath());
        this.f15288a.delete();
    }
}
