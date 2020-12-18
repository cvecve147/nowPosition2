package p250g.p251a.p252a.p253a.p254a;

import java.util.Arrays;
import p250g.p251a.p252a.p253a.C6458a;
import p250g.p251a.p252a.p253a.C6463b;

/* renamed from: g.a.a.a.a.b */
public abstract class C6460b implements C6463b, C6458a {

    /* renamed from: a */
    protected final byte f17884a = 61;

    /* renamed from: b */
    private final int f17885b;

    /* renamed from: c */
    private final int f17886c;

    /* renamed from: d */
    protected final int f17887d;

    /* renamed from: e */
    private final int f17888e;

    /* renamed from: g.a.a.a.a.b$a */
    static class C6461a {

        /* renamed from: a */
        int f17889a;

        /* renamed from: b */
        long f17890b;

        /* renamed from: c */
        byte[] f17891c;

        /* renamed from: d */
        int f17892d;

        /* renamed from: e */
        int f17893e;

        /* renamed from: f */
        boolean f17894f;

        /* renamed from: g */
        int f17895g;

        /* renamed from: h */
        int f17896h;

        C6461a() {
        }

        public String toString() {
            return String.format("%s[buffer=%s, currentLinePos=%s, eof=%s, ibitWorkArea=%s, lbitWorkArea=%s, modulus=%s, pos=%s, readPos=%s]", new Object[]{C6461a.class.getSimpleName(), Arrays.toString(this.f17891c), Integer.valueOf(this.f17895g), Boolean.valueOf(this.f17894f), Integer.valueOf(this.f17889a), Long.valueOf(this.f17890b), Integer.valueOf(this.f17896h), Integer.valueOf(this.f17892d), Integer.valueOf(this.f17893e)});
        }
    }

    protected C6460b(int i, int i2, int i3, int i4) {
        this.f17885b = i;
        this.f17886c = i2;
        this.f17887d = i3 > 0 && i4 > 0 ? (i3 / i2) * i2 : 0;
        this.f17888e = i4;
    }

    /* renamed from: b */
    private byte[] m24139b(C6461a aVar) {
        byte[] bArr = aVar.f17891c;
        if (bArr == null) {
            aVar.f17891c = new byte[mo16631a()];
            aVar.f17892d = 0;
            aVar.f17893e = 0;
        } else {
            byte[] bArr2 = new byte[(bArr.length * 2)];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            aVar.f17891c = bArr2;
        }
        return aVar.f17891c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo16631a() {
        return 8192;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo16632a(C6461a aVar) {
        if (aVar.f17891c != null) {
            return aVar.f17892d - aVar.f17893e;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo16628a(byte[] bArr, int i, int i2, C6461a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo16629a(byte b);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo16633a(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (byte b : bArr) {
            if (61 == b || mo16629a(b)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public byte[] mo16634a(int i, C6461a aVar) {
        byte[] bArr = aVar.f17891c;
        return (bArr == null || bArr.length < aVar.f17892d + i) ? m24139b(aVar) : bArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo16630b(byte[] bArr, int i, int i2, C6461a aVar);

    /* renamed from: b */
    public byte[] mo16635b(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        C6461a aVar = new C6461a();
        mo16628a(bArr, 0, bArr.length, aVar);
        mo16628a(bArr, 0, -1, aVar);
        byte[] bArr2 = new byte[aVar.f17892d];
        mo16636c(bArr2, 0, bArr2.length, aVar);
        return bArr2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo16636c(byte[] bArr, int i, int i2, C6461a aVar) {
        if (aVar.f17891c == null) {
            return aVar.f17894f ? -1 : 0;
        }
        int min = Math.min(mo16632a(aVar), i2);
        System.arraycopy(aVar.f17891c, aVar.f17893e, bArr, i, min);
        aVar.f17893e += min;
        if (aVar.f17893e >= aVar.f17892d) {
            aVar.f17891c = null;
        }
        return min;
    }

    /* renamed from: c */
    public byte[] mo16637c(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        C6461a aVar = new C6461a();
        mo16630b(bArr, 0, bArr.length, aVar);
        mo16630b(bArr, 0, -1, aVar);
        byte[] bArr2 = new byte[(aVar.f17892d - aVar.f17893e)];
        mo16636c(bArr2, 0, bArr2.length, aVar);
        return bArr2;
    }

    /* renamed from: d */
    public long mo16638d(byte[] bArr) {
        int length = bArr.length;
        int i = this.f17885b;
        long j = ((long) (((length + i) - 1) / i)) * ((long) this.f17886c);
        int i2 = this.f17887d;
        return i2 > 0 ? j + ((((((long) i2) + j) - 1) / ((long) i2)) * ((long) this.f17888e)) : j;
    }
}
