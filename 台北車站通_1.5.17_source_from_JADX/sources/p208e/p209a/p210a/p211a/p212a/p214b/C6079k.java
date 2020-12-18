package p208e.p209a.p210a.p211a.p212a.p214b;

import java.io.File;
import java.util.Comparator;

/* renamed from: e.a.a.a.a.b.k */
class C6079k implements Comparator<File> {
    C6079k() {
    }

    /* renamed from: a */
    public int compare(File file, File file2) {
        return (int) (file.lastModified() - file2.lastModified());
    }
}
