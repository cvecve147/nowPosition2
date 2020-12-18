package p208e.p209a.p210a.p211a.p212a.p217d;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: e.a.a.a.a.d.h */
public class C6141h extends C6142i {
    public C6141h(Context context, File file, String str, String str2) {
        super(context, file, str, str2);
    }

    /* renamed from: a */
    public OutputStream mo16177a(File file) {
        return new GZIPOutputStream(new FileOutputStream(file));
    }
}
