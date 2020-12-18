package p101d.p122f.p123a.p126c;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: d.f.a.c.pa */
final class C5436pa {

    /* renamed from: a */
    private static final FilenameFilter f15308a = new C5434oa();

    /* renamed from: a */
    static int m20862a(File file, int i, Comparator<File> comparator) {
        return m20863a(file, f15308a, i, comparator);
    }

    /* renamed from: a */
    static int m20863a(File file, FilenameFilter filenameFilter, int i, Comparator<File> comparator) {
        File[] listFiles = file.listFiles(filenameFilter);
        if (listFiles == null) {
            return 0;
        }
        int length = listFiles.length;
        Arrays.sort(listFiles, comparator);
        for (File file2 : listFiles) {
            if (length <= i) {
                return length;
            }
            file2.delete();
            length--;
        }
        return length;
    }
}
