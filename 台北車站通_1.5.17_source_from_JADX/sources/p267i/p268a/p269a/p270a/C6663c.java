package p267i.p268a.p269a.p270a;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashSet;
import p299tw.navin.navinmap.util.C7173l;

/* renamed from: i.a.a.a.c */
class C6663c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public String f18462a = ".tmp";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Object f18463b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f18464c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f18465d;

    /* renamed from: e */
    private final String f18466e = "b1.svg";

    C6663c() {
    }

    /* renamed from: b */
    static /* synthetic */ int m25332b(C6663c cVar) {
        int i = cVar.f18465d;
        cVar.f18465d = i + 1;
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo17111a(Context context, String[] strArr, String str, boolean z) {
        File dir = context.getDir(str, 0);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        this.f18464c = strArr.length;
        this.f18465d = 0;
        HashSet hashSet = new HashSet();
        for (String str2 : strArr) {
            String a = C7173l.m26995a(str2, "/");
            new C6662b(this, new File(dir, a), str2, hashSet, a, z, dir).start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo17112a(String str, File file) {
        File file2 = new File(file.getAbsolutePath() + ".tmp");
        if (!file2.getParentFile().exists()) {
            file2.getParentFile().mkdirs();
        }
        if (file2.exists()) {
            file2.delete();
        }
        InputStream inputStream = ((HttpURLConnection) new URL(str).openConnection()).getInputStream();
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                break;
            }
            fileOutputStream.write(bArr, 0, read);
        }
        inputStream.close();
        fileOutputStream.close();
        if (file.exists()) {
            file2.delete();
        } else {
            file2.renameTo(file);
        }
    }
}
