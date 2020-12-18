package p101d.p191i.p192a.p198c;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: d.i.a.c.a */
class C6006a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f16749a;

    /* renamed from: b */
    final /* synthetic */ String f16750b;

    /* renamed from: c */
    final /* synthetic */ C6007b f16751c;

    C6006a(C6007b bVar, String str, String str2) {
        this.f16751c = bVar;
        this.f16749a = str;
        this.f16750b = str2;
    }

    public void run() {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f16749a).openConnection();
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            InputStream inputStream = httpURLConnection.getInputStream();
            File file = new File(this.f16750b);
            if (!file.exists()) {
                file.getParentFile().mkdirs();
                file.createNewFile();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(this.f16750b);
            byte[] bArr = new byte[C6007b.f16752a];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    inputStream.close();
                    fileOutputStream.close();
                    this.f16751c.m22770c(this.f16749a, this.f16750b);
                    return;
                }
            }
        } catch (FileNotFoundException | IOException unused) {
            this.f16751c.m22769b(this.f16749a);
        }
    }
}
