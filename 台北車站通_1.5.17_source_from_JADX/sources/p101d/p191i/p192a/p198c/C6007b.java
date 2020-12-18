package p101d.p191i.p192a.p198c;

import android.content.Context;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: d.i.a.c.b */
public class C6007b {

    /* renamed from: a */
    public static int f16752a = 2048;

    /* renamed from: b */
    private boolean f16753b = false;

    /* renamed from: c */
    private Context f16754c;

    /* renamed from: d */
    private List<C6008a> f16755d = new ArrayList();

    /* renamed from: d.i.a.c.b$a */
    public interface C6008a {
        /* renamed from: a */
        void mo15744a(String str);

        /* renamed from: a */
        void mo15745a(String str, String str2);
    }

    public C6007b(Context context) {
        this.f16754c = context;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m22769b(String str) {
        for (int i = 0; i < this.f16755d.size(); i++) {
            this.f16755d.get(i).mo15744a(str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m22770c(String str, String str2) {
        for (int i = 0; i < this.f16755d.size(); i++) {
            this.f16755d.get(i).mo15745a(str, str2);
        }
    }

    /* renamed from: a */
    public Boolean mo15881a(String str) {
        boolean z;
        File file = new File(str);
        if (file.exists()) {
            file.delete();
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: a */
    public void mo15882a() {
        List<C6008a> list = this.f16755d;
        list.removeAll(list);
    }

    /* renamed from: a */
    public void mo15883a(C6008a aVar) {
        this.f16755d.add(aVar);
    }

    /* renamed from: a */
    public void mo15884a(String str, String str2) {
        new Thread(new C6006a(this, str, str2)).start();
    }

    /* renamed from: b */
    public void mo15885b(String str, String str2) {
        try {
            ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(str)));
            byte[] bArr = new byte[1024];
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry != null) {
                    String name = nextEntry.getName();
                    if (nextEntry.isDirectory()) {
                        new File(str2 + name).mkdirs();
                    } else {
                        FileOutputStream fileOutputStream = new FileOutputStream(str2 + name);
                        while (true) {
                            int read = zipInputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        }
                        fileOutputStream.close();
                        zipInputStream.closeEntry();
                    }
                } else {
                    zipInputStream.close();
                    return;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
