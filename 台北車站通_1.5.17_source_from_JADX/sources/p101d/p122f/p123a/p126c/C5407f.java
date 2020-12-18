package p101d.p122f.p123a.p126c;

import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: d.f.a.c.f */
final class C5407f implements Flushable {

    /* renamed from: a */
    private final byte[] f15262a;

    /* renamed from: b */
    private final int f15263b;

    /* renamed from: c */
    private int f15264c = 0;

    /* renamed from: d */
    private final OutputStream f15265d;

    /* renamed from: d.f.a.c.f$a */
    static class C5408a extends IOException {
        C5408a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    private C5407f(OutputStream outputStream, byte[] bArr) {
        this.f15265d = outputStream;
        this.f15262a = bArr;
        this.f15263b = bArr.length;
    }

    /* renamed from: a */
    public static int m20744a(float f) {
        return 4;
    }

    /* renamed from: a */
    public static int m20745a(int i) {
        return m20757b(i);
    }

    /* renamed from: a */
    public static int m20746a(int i, float f) {
        return m20763e(i) + m20744a(f);
    }

    /* renamed from: a */
    public static int m20747a(int i, int i2) {
        return m20763e(i) + m20745a(i2);
    }

    /* renamed from: a */
    public static int m20748a(int i, long j) {
        return m20763e(i) + m20759b(j);
    }

    /* renamed from: a */
    public static int m20749a(int i, C5399b bVar) {
        return m20763e(i) + m20752a(bVar);
    }

    /* renamed from: a */
    public static int m20750a(int i, boolean z) {
        return m20763e(i) + m20753a(z);
    }

    /* renamed from: a */
    public static int m20751a(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if ((-16384 & j) == 0) {
            return 2;
        }
        if ((-2097152 & j) == 0) {
            return 3;
        }
        if ((-268435456 & j) == 0) {
            return 4;
        }
        if ((-34359738368L & j) == 0) {
            return 5;
        }
        if ((-4398046511104L & j) == 0) {
            return 6;
        }
        if ((-562949953421312L & j) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* renamed from: a */
    public static int m20752a(C5399b bVar) {
        return m20760c(bVar.mo14815b()) + bVar.mo14815b();
    }

    /* renamed from: a */
    public static int m20753a(boolean z) {
        return 1;
    }

    /* renamed from: a */
    public static C5407f m20754a(OutputStream outputStream) {
        return m20755a(outputStream, (int) SVGParser.ENTITY_WATCH_BUFFER_SIZE);
    }

    /* renamed from: a */
    public static C5407f m20755a(OutputStream outputStream, int i) {
        return new C5407f(outputStream, new byte[i]);
    }

    /* renamed from: a */
    private void m20756a() {
        OutputStream outputStream = this.f15265d;
        if (outputStream != null) {
            outputStream.write(this.f15262a, 0, this.f15264c);
            this.f15264c = 0;
            return;
        }
        throw new C5408a();
    }

    /* renamed from: b */
    public static int m20757b(int i) {
        if (i >= 0) {
            return m20760c(i);
        }
        return 10;
    }

    /* renamed from: b */
    public static int m20758b(int i, int i2) {
        return m20763e(i) + m20762d(i2);
    }

    /* renamed from: b */
    public static int m20759b(long j) {
        return m20751a(j);
    }

    /* renamed from: c */
    public static int m20760c(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: c */
    public static int m20761c(int i, int i2) {
        return m20763e(i) + m20764f(i2);
    }

    /* renamed from: d */
    public static int m20762d(int i) {
        return m20760c(m20765g(i));
    }

    /* renamed from: e */
    public static int m20763e(int i) {
        return m20760c(C5438qa.m20864a(i, 0));
    }

    /* renamed from: f */
    public static int m20764f(int i) {
        return m20760c(i);
    }

    /* renamed from: g */
    public static int m20765g(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: a */
    public void mo14828a(byte b) {
        if (this.f15264c == this.f15263b) {
            m20756a();
        }
        byte[] bArr = this.f15262a;
        int i = this.f15264c;
        this.f15264c = i + 1;
        bArr[i] = b;
    }

    /* renamed from: a */
    public void mo14829a(C5399b bVar, int i, int i2) {
        int i3 = this.f15263b;
        int i4 = this.f15264c;
        if (i3 - i4 >= i2) {
            bVar.mo14814a(this.f15262a, i, i4, i2);
            this.f15264c += i2;
            return;
        }
        int i5 = i3 - i4;
        bVar.mo14814a(this.f15262a, i, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f15264c = this.f15263b;
        m20756a();
        if (i7 <= this.f15263b) {
            bVar.mo14814a(this.f15262a, i6, 0, i7);
            this.f15264c = i7;
            return;
        }
        InputStream a = bVar.mo14813a();
        long j = (long) i6;
        if (j == a.skip(j)) {
            while (i7 > 0) {
                int min = Math.min(i7, this.f15263b);
                int read = a.read(this.f15262a, 0, min);
                if (read == min) {
                    this.f15265d.write(this.f15262a, 0, read);
                    i7 -= read;
                } else {
                    throw new IllegalStateException("Read failed.");
                }
            }
            return;
        }
        throw new IllegalStateException("Skip failed.");
    }

    /* renamed from: a */
    public void mo14830a(byte[] bArr) {
        mo14831a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public void mo14831a(byte[] bArr, int i, int i2) {
        int i3 = this.f15263b;
        int i4 = this.f15264c;
        if (i3 - i4 >= i2) {
            System.arraycopy(bArr, i, this.f15262a, i4, i2);
            this.f15264c += i2;
            return;
        }
        int i5 = i3 - i4;
        System.arraycopy(bArr, i, this.f15262a, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f15264c = this.f15263b;
        m20756a();
        if (i7 <= this.f15263b) {
            System.arraycopy(bArr, i6, this.f15262a, 0, i7);
            this.f15264c = i7;
            return;
        }
        this.f15265d.write(bArr, i6, i7);
    }

    /* renamed from: b */
    public void mo14832b(float f) {
        mo14850k(Float.floatToRawIntBits(f));
    }

    /* renamed from: b */
    public void mo14833b(int i, float f) {
        mo14844f(i, 5);
        mo14832b(f);
    }

    /* renamed from: b */
    public void mo14834b(int i, long j) {
        mo14844f(i, 0);
        mo14842d(j);
    }

    /* renamed from: b */
    public void mo14835b(int i, C5399b bVar) {
        mo14844f(i, 2);
        mo14837b(bVar);
    }

    /* renamed from: b */
    public void mo14836b(int i, boolean z) {
        mo14844f(i, 0);
        mo14838b(z);
    }

    /* renamed from: b */
    public void mo14837b(C5399b bVar) {
        mo14851l(bVar.mo14815b());
        mo14840c(bVar);
    }

    /* renamed from: b */
    public void mo14838b(boolean z) {
        mo14849j(z ? 1 : 0);
    }

    /* renamed from: c */
    public void mo14839c(long j) {
        while ((-128 & j) != 0) {
            mo14849j((((int) j) & 127) | 128);
            j >>>= 7;
        }
        mo14849j((int) j);
    }

    /* renamed from: c */
    public void mo14840c(C5399b bVar) {
        mo14829a(bVar, 0, bVar.mo14815b());
    }

    /* renamed from: d */
    public void mo14841d(int i, int i2) {
        mo14844f(i, 0);
        mo14847h(i2);
    }

    /* renamed from: d */
    public void mo14842d(long j) {
        mo14839c(j);
    }

    /* renamed from: e */
    public void mo14843e(int i, int i2) {
        mo14844f(i, 0);
        mo14852m(i2);
    }

    /* renamed from: f */
    public void mo14844f(int i, int i2) {
        mo14851l(C5438qa.m20864a(i, i2));
    }

    public void flush() {
        if (this.f15265d != null) {
            m20756a();
        }
    }

    /* renamed from: g */
    public void mo14846g(int i, int i2) {
        mo14844f(i, 0);
        mo14853n(i2);
    }

    /* renamed from: h */
    public void mo14847h(int i) {
        mo14848i(i);
    }

    /* renamed from: i */
    public void mo14848i(int i) {
        if (i >= 0) {
            mo14851l(i);
        } else {
            mo14839c((long) i);
        }
    }

    /* renamed from: j */
    public void mo14849j(int i) {
        mo14828a((byte) i);
    }

    /* renamed from: k */
    public void mo14850k(int i) {
        mo14849j(i & 255);
        mo14849j((i >> 8) & 255);
        mo14849j((i >> 16) & 255);
        mo14849j((i >> 24) & 255);
    }

    /* renamed from: l */
    public void mo14851l(int i) {
        while ((i & -128) != 0) {
            mo14849j((i & 127) | 128);
            i >>>= 7;
        }
        mo14849j(i);
    }

    /* renamed from: m */
    public void mo14852m(int i) {
        mo14851l(m20765g(i));
    }

    /* renamed from: n */
    public void mo14853n(int i) {
        mo14851l(i);
    }
}
