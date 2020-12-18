package p101d.p122f.p123a.p126c;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import org.apache.http.protocol.HTTP;

/* renamed from: d.f.a.c.b */
final class C5399b {

    /* renamed from: a */
    public static final C5399b f15245a = new C5399b(new byte[0]);

    /* renamed from: b */
    private final byte[] f15246b;

    /* renamed from: c */
    private volatile int f15247c = 0;

    private C5399b(byte[] bArr) {
        this.f15246b = bArr;
    }

    /* renamed from: a */
    public static C5399b m20722a(String str) {
        try {
            return new C5399b(str.getBytes(HTTP.UTF_8));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported.", e);
        }
    }

    /* renamed from: a */
    public static C5399b m20723a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C5399b(bArr2);
    }

    /* renamed from: a */
    public InputStream mo14813a() {
        return new ByteArrayInputStream(this.f15246b);
    }

    /* renamed from: a */
    public void mo14814a(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f15246b, i, bArr, i2, i3);
    }

    /* renamed from: b */
    public int mo14815b() {
        return this.f15246b.length;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5399b)) {
            return false;
        }
        byte[] bArr = this.f15246b;
        int length = bArr.length;
        byte[] bArr2 = ((C5399b) obj).f15246b;
        if (length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.f15247c;
        if (i == 0) {
            int i2 = r1;
            for (byte b : this.f15246b) {
                i2 = (i2 * 31) + b;
            }
            i = i2 == 0 ? 1 : i2;
            this.f15247c = i;
        }
        return i;
    }
}
