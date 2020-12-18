package p267i.p268a.p269a.p270a;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: i.a.a.a.d */
public class C6664d {

    /* renamed from: a */
    private static C6664d f18467a;

    /* renamed from: b */
    private C6663c f18468b = new C6663c();

    private C6664d() {
    }

    /* renamed from: a */
    public static C6664d m25338a() {
        if (f18467a == null) {
            f18467a = new C6664d();
        }
        return f18467a;
    }

    /* renamed from: a */
    public File mo17113a(Context context, String str) {
        return new File(context.getDir("image", 0), str);
    }

    /* renamed from: a */
    public void mo17114a(Context context) {
        File a = mo17113a(context, "b1.svg");
        if (!a.exists()) {
            mo17116a(context.getAssets().open("b1.svg"), a);
        }
    }

    /* renamed from: a */
    public void mo17115a(Context context, String[] strArr) {
        this.f18468b.mo17111a(context, strArr, "image", true);
    }

    /* renamed from: a */
    public void mo17116a(InputStream inputStream, File file) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read > 0) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    inputStream.close();
                    return;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
