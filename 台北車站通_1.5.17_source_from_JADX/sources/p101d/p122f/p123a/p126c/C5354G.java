package p101d.p122f.p123a.p126c;

import java.io.File;
import java.io.IOException;
import p208e.p209a.p210a.p211a.C6199f;
import p208e.p209a.p210a.p211a.C6211p;
import p208e.p209a.p210a.p211a.p212a.p219f.C6161a;

/* renamed from: d.f.a.c.G */
class C5354G {

    /* renamed from: a */
    private final String f15139a;

    /* renamed from: b */
    private final C6161a f15140b;

    public C5354G(String str, C6161a aVar) {
        this.f15139a = str;
        this.f15140b = aVar;
    }

    /* renamed from: d */
    private File m20631d() {
        return new File(this.f15140b.mo16233a(), this.f15139a);
    }

    /* renamed from: a */
    public boolean mo14768a() {
        try {
            return m20631d().createNewFile();
        } catch (IOException e) {
            C6211p f = C6199f.m23420f();
            f.mo16266b("CrashlyticsCore", "Error creating marker: " + this.f15139a, e);
            return false;
        }
    }

    /* renamed from: b */
    public boolean mo14769b() {
        return m20631d().exists();
    }

    /* renamed from: c */
    public boolean mo14770c() {
        return m20631d().delete();
    }
}
