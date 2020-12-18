package p101d.p122f.p123a.p126c;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;

/* renamed from: d.f.a.c.e */
class C5405e extends FileOutputStream {

    /* renamed from: a */
    public static final FilenameFilter f15254a = new C5403d();

    /* renamed from: b */
    private final String f15255b;

    /* renamed from: c */
    private File f15256c;

    /* renamed from: d */
    private File f15257d;

    /* renamed from: e */
    private boolean f15258e = false;

    public C5405e(File file, String str) {
        super(new File(file, str + ".cls_temp"));
        this.f15255b = file + File.separator + str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f15255b);
        sb.append(".cls_temp");
        this.f15256c = new File(sb.toString());
    }

    /* renamed from: a */
    public void mo14826a() {
        if (!this.f15258e) {
            this.f15258e = true;
            super.flush();
            super.close();
        }
    }

    public synchronized void close() {
        if (!this.f15258e) {
            this.f15258e = true;
            super.flush();
            super.close();
            File file = new File(this.f15255b + ".cls");
            if (this.f15256c.renameTo(file)) {
                this.f15256c = null;
                this.f15257d = file;
                return;
            }
            String str = "";
            if (file.exists()) {
                str = " (target already exists)";
            } else if (!this.f15256c.exists()) {
                str = " (source does not exist)";
            }
            throw new IOException("Could not rename temp file: " + this.f15256c + " -> " + file + str);
        }
    }
}
