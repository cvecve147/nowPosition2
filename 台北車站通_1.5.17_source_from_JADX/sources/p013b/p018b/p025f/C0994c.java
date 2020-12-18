package p013b.p018b.p025f;

import java.io.File;
import java.io.FileFilter;

/* renamed from: b.b.f.c */
class C0994c implements FileFilter {

    /* renamed from: a */
    final /* synthetic */ C0995d f3884a;

    C0994c(C0995d dVar) {
        this.f3884a = dVar;
    }

    public boolean accept(File file) {
        return !file.getName().equals("MultiDex.lock");
    }
}
