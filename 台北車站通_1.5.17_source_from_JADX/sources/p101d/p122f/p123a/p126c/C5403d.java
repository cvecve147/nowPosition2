package p101d.p122f.p123a.p126c;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: d.f.a.c.d */
class C5403d implements FilenameFilter {
    C5403d() {
    }

    public boolean accept(File file, String str) {
        return str.endsWith(".cls_temp");
    }
}
