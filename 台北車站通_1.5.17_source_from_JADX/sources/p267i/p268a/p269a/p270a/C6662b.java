package p267i.p268a.p269a.p270a;

import java.io.File;
import java.util.HashSet;
import p299tw.navin.navinmap.util.C7173l;

/* renamed from: i.a.a.a.b */
class C6662b extends Thread {

    /* renamed from: a */
    final /* synthetic */ File f18455a;

    /* renamed from: b */
    final /* synthetic */ String f18456b;

    /* renamed from: c */
    final /* synthetic */ HashSet f18457c;

    /* renamed from: d */
    final /* synthetic */ String f18458d;

    /* renamed from: e */
    final /* synthetic */ boolean f18459e;

    /* renamed from: f */
    final /* synthetic */ File f18460f;

    /* renamed from: g */
    final /* synthetic */ C6663c f18461g;

    C6662b(C6663c cVar, File file, String str, HashSet hashSet, String str2, boolean z, File file2) {
        this.f18461g = cVar;
        this.f18455a = file;
        this.f18456b = str;
        this.f18457c = hashSet;
        this.f18458d = str2;
        this.f18459e = z;
        this.f18460f = file2;
    }

    public void run() {
        File[] listFiles;
        if (!this.f18455a.exists()) {
            try {
                this.f18461g.mo17112a(this.f18456b, this.f18455a);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        synchronized (this.f18461g.f18463b) {
            this.f18457c.add(this.f18458d);
            C6663c.m25332b(this.f18461g);
            if (this.f18459e && this.f18461g.f18465d >= this.f18461g.f18464c && (listFiles = this.f18460f.listFiles()) != null) {
                for (File file : listFiles) {
                    String a = C7173l.m26994a(file.getPath());
                    if (!a.equals("b1.svg") && !a.endsWith(this.f18461g.f18462a) && !this.f18457c.contains(a)) {
                        file.delete();
                    }
                }
            }
        }
    }
}
