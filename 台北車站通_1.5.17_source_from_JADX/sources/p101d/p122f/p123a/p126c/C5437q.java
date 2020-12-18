package p101d.p122f.p123a.p126c;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Set;

/* renamed from: d.f.a.c.q */
class C5437q implements FilenameFilter {

    /* renamed from: a */
    final /* synthetic */ Set f15309a;

    /* renamed from: b */
    final /* synthetic */ C5446y f15310b;

    C5437q(C5446y yVar, Set set) {
        this.f15310b = yVar;
        this.f15309a = set;
    }

    public boolean accept(File file, String str) {
        if (str.length() < 35) {
            return false;
        }
        return this.f15309a.contains(str.substring(0, 35));
    }
}
