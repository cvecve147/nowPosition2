package p013b.p018b.p028h.p039h;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: b.b.h.h.e */
public class C1083e {

    /* renamed from: a */
    private final File f4043a;

    /* renamed from: b */
    private final File f4044b;

    public C1083e(File file) {
        this.f4043a = file;
        this.f4044b = new File(file.getPath() + ".bak");
    }

    /* renamed from: b */
    private static boolean m5629b(FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public FileInputStream mo5138a() {
        if (this.f4044b.exists()) {
            this.f4043a.delete();
            this.f4044b.renameTo(this.f4043a);
        }
        return new FileInputStream(this.f4043a);
    }

    /* renamed from: a */
    public void mo5139a(FileOutputStream fileOutputStream) {
        if (fileOutputStream != null) {
            m5629b(fileOutputStream);
            try {
                fileOutputStream.close();
                this.f4044b.delete();
            } catch (IOException e) {
                Log.w("AtomicFile", "finishWrite: Got exception:", e);
            }
        }
    }

    /* renamed from: b */
    public FileOutputStream mo5140b() {
        if (this.f4043a.exists()) {
            if (this.f4044b.exists()) {
                this.f4043a.delete();
            } else if (!this.f4043a.renameTo(this.f4044b)) {
                Log.w("AtomicFile", "Couldn't rename file " + this.f4043a + " to backup file " + this.f4044b);
            }
        }
        try {
            return new FileOutputStream(this.f4043a);
        } catch (FileNotFoundException unused) {
            if (this.f4043a.getParentFile().mkdirs()) {
                try {
                    return new FileOutputStream(this.f4043a);
                } catch (FileNotFoundException unused2) {
                    throw new IOException("Couldn't create " + this.f4043a);
                }
            } else {
                throw new IOException("Couldn't create directory " + this.f4043a);
            }
        }
    }
}
