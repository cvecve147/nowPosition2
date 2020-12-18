package p208e.p209a.p210a.p211a.p212a.p217d;

import android.content.Context;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p208e.p209a.p210a.p211a.p212a.p214b.C6080l;
import p208e.p209a.p210a.p211a.p212a.p214b.C6096y;

/* renamed from: e.a.a.a.a.d.i */
public class C6142i implements C6137d {

    /* renamed from: a */
    private final Context f17134a;

    /* renamed from: b */
    private final File f17135b;

    /* renamed from: c */
    private final String f17136c;

    /* renamed from: d */
    private final File f17137d;

    /* renamed from: e */
    private C6096y f17138e = new C6096y(this.f17137d);

    /* renamed from: f */
    private File f17139f;

    public C6142i(Context context, File file, String str, String str2) {
        this.f17134a = context;
        this.f17135b = file;
        this.f17136c = str2;
        this.f17137d = new File(this.f17135b, str);
        m23227e();
    }

    /* renamed from: a */
    private void m23226a(File file, File file2) {
        FileInputStream fileInputStream;
        OutputStream outputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                outputStream = mo16177a(file2);
                C6080l.m23044a((InputStream) fileInputStream, outputStream, new byte[1024]);
                C6080l.m23042a((Closeable) fileInputStream, "Failed to close file input stream");
                C6080l.m23042a((Closeable) outputStream, "Failed to close output stream");
                file.delete();
            } catch (Throwable th) {
                th = th;
                C6080l.m23042a((Closeable) fileInputStream, "Failed to close file input stream");
                C6080l.m23042a((Closeable) outputStream, "Failed to close output stream");
                file.delete();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
            C6080l.m23042a((Closeable) fileInputStream, "Failed to close file input stream");
            C6080l.m23042a((Closeable) outputStream, "Failed to close output stream");
            file.delete();
            throw th;
        }
    }

    /* renamed from: e */
    private void m23227e() {
        this.f17139f = new File(this.f17135b, this.f17136c);
        if (!this.f17139f.exists()) {
            this.f17139f.mkdirs();
        }
    }

    /* renamed from: a */
    public int mo16168a() {
        return this.f17138e.mo16090b();
    }

    /* renamed from: a */
    public OutputStream mo16177a(File file) {
        throw null;
    }

    /* renamed from: a */
    public List<File> mo16169a(int i) {
        ArrayList arrayList = new ArrayList();
        for (File add : this.f17139f.listFiles()) {
            arrayList.add(add);
            if (arrayList.size() >= i) {
                break;
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo16170a(String str) {
        this.f17138e.close();
        m23226a(this.f17137d, new File(this.f17139f, str));
        this.f17138e = new C6096y(this.f17137d);
    }

    /* renamed from: a */
    public void mo16171a(List<File> list) {
        for (File next : list) {
            C6080l.m23054c(this.f17134a, String.format("deleting sent analytics file %s", new Object[]{next.getName()}));
            next.delete();
        }
    }

    /* renamed from: a */
    public void mo16172a(byte[] bArr) {
        this.f17138e.mo16086a(bArr);
    }

    /* renamed from: a */
    public boolean mo16173a(int i, int i2) {
        return this.f17138e.mo16089a(i, i2);
    }

    /* renamed from: b */
    public boolean mo16174b() {
        return this.f17138e.mo16088a();
    }

    /* renamed from: c */
    public List<File> mo16175c() {
        return Arrays.asList(this.f17139f.listFiles());
    }

    /* renamed from: d */
    public void mo16176d() {
        try {
            this.f17138e.close();
        } catch (IOException unused) {
        }
        this.f17137d.delete();
    }
}
