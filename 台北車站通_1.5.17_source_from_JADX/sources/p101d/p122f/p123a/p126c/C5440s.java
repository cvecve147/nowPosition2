package p101d.p122f.p123a.p126c;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: d.f.a.c.s */
class C5440s implements FilenameFilter {
    C5440s() {
    }

    public boolean accept(File file, String str) {
        return str.length() == 39 && str.endsWith(".cls");
    }
}
