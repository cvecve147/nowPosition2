package p101d.p119e.p120a.p121a;

import java.io.ByteArrayOutputStream;

/* renamed from: d.e.a.a.l */
public class C5264l extends ByteArrayOutputStream {

    /* renamed from: a */
    private final C5251c f14896a;

    public C5264l(C5251c cVar, int i) {
        this.f14896a = cVar;
        this.buf = this.f14896a.mo14575a(Math.max(i, 256));
    }

    /* renamed from: a */
    private void m20384a(int i) {
        int i2 = this.count;
        if (i2 + i > this.buf.length) {
            byte[] a = this.f14896a.mo14575a((i2 + i) * 2);
            System.arraycopy(this.buf, 0, a, 0, this.count);
            this.f14896a.mo14574a(this.buf);
            this.buf = a;
        }
    }

    public void close() {
        this.f14896a.mo14574a(this.buf);
        this.buf = null;
        super.close();
    }

    public void finalize() {
        this.f14896a.mo14574a(this.buf);
    }

    public synchronized void write(int i) {
        m20384a(1);
        super.write(i);
    }

    public synchronized void write(byte[] bArr, int i, int i2) {
        m20384a(i2);
        super.write(bArr, i, i2);
    }
}
