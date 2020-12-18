package p208e.p209a.p210a.p211a.p212a.p214b;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: e.a.a.a.a.b.y */
public class C6096y implements Closeable {

    /* renamed from: a */
    private static final Logger f17057a = Logger.getLogger(C6096y.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final RandomAccessFile f17058b;

    /* renamed from: c */
    int f17059c;

    /* renamed from: d */
    private int f17060d;

    /* renamed from: e */
    private C6097a f17061e;

    /* renamed from: f */
    private C6097a f17062f;

    /* renamed from: g */
    private final byte[] f17063g = new byte[16];

    /* renamed from: e.a.a.a.a.b.y$a */
    static class C6097a {

        /* renamed from: a */
        static final C6097a f17064a = new C6097a(0, 0);

        /* renamed from: b */
        final int f17065b;

        /* renamed from: c */
        final int f17066c;

        C6097a(int i, int i2) {
            this.f17065b = i;
            this.f17066c = i2;
        }

        public String toString() {
            return C6097a.class.getSimpleName() + "[position = " + this.f17065b + ", length = " + this.f17066c + "]";
        }
    }

    /* renamed from: e.a.a.a.a.b.y$b */
    private final class C6098b extends InputStream {

        /* renamed from: a */
        private int f17067a;

        /* renamed from: b */
        private int f17068b;

        private C6098b(C6097a aVar) {
            this.f17067a = C6096y.this.m23120d(aVar.f17065b + 4);
            this.f17068b = aVar.f17066c;
        }

        /* synthetic */ C6098b(C6096y yVar, C6097a aVar, C6095x xVar) {
            this(aVar);
        }

        public int read() {
            if (this.f17068b == 0) {
                return -1;
            }
            C6096y.this.f17058b.seek((long) this.f17067a);
            int read = C6096y.this.f17058b.read();
            this.f17067a = C6096y.this.m23120d(this.f17067a + 1);
            this.f17068b--;
            return read;
        }

        public int read(byte[] bArr, int i, int i2) {
            Object unused = C6096y.m23114b(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = this.f17068b;
            if (i3 <= 0) {
                return -1;
            }
            if (i2 > i3) {
                i2 = i3;
            }
            C6096y.this.m23108a(this.f17067a, bArr, i, i2);
            this.f17067a = C6096y.this.m23120d(this.f17067a + i2);
            this.f17068b -= i2;
            return i2;
        }
    }

    /* renamed from: e.a.a.a.a.b.y$c */
    public interface C6099c {
        /* renamed from: a */
        void mo14825a(InputStream inputStream, int i);
    }

    public C6096y(File file) {
        if (!file.exists()) {
            m23110a(file);
        }
        this.f17058b = m23113b(file);
        m23117c();
    }

    /* renamed from: a */
    private static int m23103a(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    /* renamed from: a */
    private void m23106a(int i) {
        int i2 = i + 4;
        int d = m23119d();
        if (d < i2) {
            int i3 = this.f17059c;
            do {
                d += i3;
                i3 <<= 1;
            } while (d < i2);
            m23118c(i3);
            C6097a aVar = this.f17062f;
            int d2 = m23120d(aVar.f17065b + 4 + aVar.f17066c);
            if (d2 < this.f17061e.f17065b) {
                FileChannel channel = this.f17058b.getChannel();
                channel.position((long) this.f17059c);
                long j = (long) (d2 - 4);
                if (channel.transferTo(16, j, channel) != j) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            }
            int i4 = this.f17062f.f17065b;
            int i5 = this.f17061e.f17065b;
            if (i4 < i5) {
                int i6 = (this.f17059c + i4) - 16;
                m23107a(i3, this.f17060d, i5, i6);
                this.f17062f = new C6097a(i6, this.f17062f.f17066c);
            } else {
                m23107a(i3, this.f17060d, i5, i4);
            }
            this.f17059c = i3;
        }
    }

    /* renamed from: a */
    private void m23107a(int i, int i2, int i3, int i4) {
        m23111a(this.f17063g, i, i2, i3, i4);
        this.f17058b.seek(0);
        this.f17058b.write(this.f17063g);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m23108a(int i, byte[] bArr, int i2, int i3) {
        RandomAccessFile randomAccessFile;
        int d = m23120d(i);
        int i4 = d + i3;
        int i5 = this.f17059c;
        if (i4 <= i5) {
            this.f17058b.seek((long) d);
            randomAccessFile = this.f17058b;
        } else {
            int i6 = i5 - d;
            this.f17058b.seek((long) d);
            this.f17058b.readFully(bArr, i2, i6);
            this.f17058b.seek(16);
            randomAccessFile = this.f17058b;
            i2 += i6;
            i3 -= i6;
        }
        randomAccessFile.readFully(bArr, i2, i3);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private static void m23110a(File file) {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile b = m23113b(file2);
        try {
            b.setLength(4096);
            b.seek(0);
            byte[] bArr = new byte[16];
            m23111a(bArr, 4096, 0, 0, 0);
            b.write(bArr);
            b.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            b.close();
            throw th;
        }
    }

    /* renamed from: a */
    private static void m23111a(byte[] bArr, int... iArr) {
        int i = 0;
        for (int b : iArr) {
            m23116b(bArr, i, b);
            i += 4;
        }
    }

    /* renamed from: b */
    private C6097a m23112b(int i) {
        if (i == 0) {
            return C6097a.f17064a;
        }
        this.f17058b.seek((long) i);
        return new C6097a(i, this.f17058b.readInt());
    }

    /* renamed from: b */
    private static RandomAccessFile m23113b(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static <T> T m23114b(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: b */
    private void m23115b(int i, byte[] bArr, int i2, int i3) {
        RandomAccessFile randomAccessFile;
        int d = m23120d(i);
        int i4 = d + i3;
        int i5 = this.f17059c;
        if (i4 <= i5) {
            this.f17058b.seek((long) d);
            randomAccessFile = this.f17058b;
        } else {
            int i6 = i5 - d;
            this.f17058b.seek((long) d);
            this.f17058b.write(bArr, i2, i6);
            this.f17058b.seek(16);
            randomAccessFile = this.f17058b;
            i2 += i6;
            i3 -= i6;
        }
        randomAccessFile.write(bArr, i2, i3);
    }

    /* renamed from: b */
    private static void m23116b(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    /* renamed from: c */
    private void m23117c() {
        this.f17058b.seek(0);
        this.f17058b.readFully(this.f17063g);
        this.f17059c = m23103a(this.f17063g, 0);
        if (((long) this.f17059c) <= this.f17058b.length()) {
            this.f17060d = m23103a(this.f17063g, 4);
            int a = m23103a(this.f17063g, 8);
            int a2 = m23103a(this.f17063g, 12);
            this.f17061e = m23112b(a);
            this.f17062f = m23112b(a2);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f17059c + ", Actual length: " + this.f17058b.length());
    }

    /* renamed from: c */
    private void m23118c(int i) {
        this.f17058b.setLength((long) i);
        this.f17058b.getChannel().force(true);
    }

    /* renamed from: d */
    private int m23119d() {
        return this.f17059c - mo16090b();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public int m23120d(int i) {
        int i2 = this.f17059c;
        return i < i2 ? i : (i + 16) - i2;
    }

    /* renamed from: a */
    public synchronized void mo16085a(C6099c cVar) {
        int i = this.f17061e.f17065b;
        for (int i2 = 0; i2 < this.f17060d; i2++) {
            C6097a b = m23112b(i);
            cVar.mo14825a(new C6098b(this, b, (C6095x) null), b.f17066c);
            i = m23120d(b.f17065b + 4 + b.f17066c);
        }
    }

    /* renamed from: a */
    public void mo16086a(byte[] bArr) {
        mo16087a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public synchronized void mo16087a(byte[] bArr, int i, int i2) {
        m23114b(bArr, "buffer");
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        m23106a(i2);
        boolean a = mo16088a();
        C6097a aVar = new C6097a(a ? 16 : m23120d(this.f17062f.f17065b + 4 + this.f17062f.f17066c), i2);
        m23116b(this.f17063g, 0, i2);
        m23115b(aVar.f17065b, this.f17063g, 0, 4);
        m23115b(aVar.f17065b + 4, bArr, i, i2);
        m23107a(this.f17059c, this.f17060d + 1, a ? aVar.f17065b : this.f17061e.f17065b, aVar.f17065b);
        this.f17062f = aVar;
        this.f17060d++;
        if (a) {
            this.f17061e = this.f17062f;
        }
    }

    /* renamed from: a */
    public synchronized boolean mo16088a() {
        return this.f17060d == 0;
    }

    /* renamed from: a */
    public boolean mo16089a(int i, int i2) {
        return (mo16090b() + 4) + i <= i2;
    }

    /* renamed from: b */
    public int mo16090b() {
        if (this.f17060d == 0) {
            return 16;
        }
        C6097a aVar = this.f17062f;
        int i = aVar.f17065b;
        int i2 = this.f17061e.f17065b;
        return i >= i2 ? (i - i2) + 4 + aVar.f17066c + 16 : (((i + 4) + aVar.f17066c) + this.f17059c) - i2;
    }

    public synchronized void close() {
        this.f17058b.close();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C6096y.class.getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f17059c);
        sb.append(", size=");
        sb.append(this.f17060d);
        sb.append(", first=");
        sb.append(this.f17061e);
        sb.append(", last=");
        sb.append(this.f17062f);
        sb.append(", element lengths=[");
        try {
            mo16085a((C6099c) new C6095x(this, sb));
        } catch (IOException e) {
            f17057a.log(Level.WARNING, "read error", e);
        }
        sb.append("]]");
        return sb.toString();
    }
}
