package p101d.p122f.p123a.p126c;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import p208e.p209a.p210a.p211a.C6199f;
import p208e.p209a.p210a.p211a.C6211p;
import p208e.p209a.p210a.p211a.p212a.p214b.C6080l;
import p208e.p209a.p210a.p211a.p212a.p214b.C6096y;

/* renamed from: d.f.a.c.ea */
class C5406ea implements C5366S {

    /* renamed from: a */
    private final File f15259a;

    /* renamed from: b */
    private final int f15260b;

    /* renamed from: c */
    private C6096y f15261c;

    public C5406ea(File file, int i) {
        this.f15259a = file;
        this.f15260b = i;
    }

    /* renamed from: d */
    private void m20740d() {
        if (this.f15261c == null) {
            try {
                this.f15261c = new C6096y(this.f15259a);
            } catch (IOException e) {
                C6211p f = C6199f.m23420f();
                f.mo16266b("CrashlyticsCore", "Could not open log file: " + this.f15259a, e);
            }
        }
    }

    /* renamed from: a */
    public void mo14788a() {
        C6080l.m23042a((Closeable) this.f15261c, "There was a problem closing the Crashlytics log file.");
        this.f15261c = null;
    }

    /* renamed from: b */
    public C5399b mo14789b() {
        if (!this.f15259a.exists()) {
            return null;
        }
        m20740d();
        C6096y yVar = this.f15261c;
        if (yVar == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[yVar.mo16090b()];
        try {
            this.f15261c.mo16085a((C6096y.C6099c) new C5404da(this, bArr, iArr));
        } catch (IOException e) {
            C6199f.m23420f().mo16266b("CrashlyticsCore", "A problem occurred while reading the Crashlytics log file.", e);
        }
        return C5399b.m20723a(bArr, 0, iArr[0]);
    }

    /* renamed from: c */
    public void mo14790c() {
        mo14788a();
        this.f15259a.delete();
    }
}
