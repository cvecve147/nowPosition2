package p101d.p122f.p123a.p126c;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;
import p208e.p209a.p210a.p211a.p212a.p214b.C6080l;
import p208e.p209a.p210a.p211a.p212a.p214b.C6091u;

/* renamed from: d.f.a.c.c */
class C5401c {

    /* renamed from: a */
    private static final AtomicLong f15248a = new AtomicLong(0);

    /* renamed from: b */
    private static String f15249b;

    public C5401c(C6091u uVar) {
        byte[] bArr = new byte[10];
        m20734c(bArr);
        m20732b(bArr);
        m20730a(bArr);
        String c = C6080l.m23053c(uVar.mo16075f());
        String a = C6080l.m23036a(bArr);
        f15249b = String.format(Locale.US, "%s-%s-%s-%s", new Object[]{a.substring(0, 12), a.substring(12, 16), a.subSequence(16, 20), c.substring(0, 12)}).toUpperCase(Locale.US);
    }

    /* renamed from: a */
    private void m20730a(byte[] bArr) {
        byte[] b = m20733b((long) Integer.valueOf(Process.myPid()).shortValue());
        bArr[8] = b[0];
        bArr[9] = b[1];
    }

    /* renamed from: a */
    private static byte[] m20731a(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) j);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    /* renamed from: b */
    private void m20732b(byte[] bArr) {
        byte[] b = m20733b(f15248a.incrementAndGet());
        bArr[6] = b[0];
        bArr[7] = b[1];
    }

    /* renamed from: b */
    private static byte[] m20733b(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) ((int) j));
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    /* renamed from: c */
    private void m20734c(byte[] bArr) {
        long time = new Date().getTime();
        byte[] a = m20731a(time / 1000);
        bArr[0] = a[0];
        bArr[1] = a[1];
        bArr[2] = a[2];
        bArr[3] = a[3];
        byte[] b = m20733b(time % 1000);
        bArr[4] = b[0];
        bArr[5] = b[1];
    }

    public String toString() {
        return f15249b;
    }
}
