package org.altbeacon.beacon;

import android.annotation.TargetApi;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import java.util.Arrays;
import java.util.UUID;
import java.util.regex.Pattern;

/* renamed from: org.altbeacon.beacon.j */
public class C6912j implements Comparable<C6912j>, Serializable {

    /* renamed from: a */
    private static final Pattern f19067a = Pattern.compile("^0x[0-9A-Fa-f]*$");

    /* renamed from: b */
    private static final Pattern f19068b = Pattern.compile("^[0-9A-Fa-f]*$");

    /* renamed from: c */
    private static final Pattern f19069c = Pattern.compile("^0|[1-9][0-9]*$");

    /* renamed from: d */
    private static final Pattern f19070d = Pattern.compile("^[0-9A-Fa-f]{8}-?[0-9A-Fa-f]{4}-?[0-9A-Fa-f]{4}-?[0-9A-Fa-f]{4}-?[0-9A-Fa-f]{12}$");

    /* renamed from: e */
    private static final char[] f19071e = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: f */
    private final byte[] f19072f;

    protected C6912j(byte[] bArr) {
        if (bArr != null) {
            this.f19072f = bArr;
            return;
        }
        throw new NullPointerException("Identifiers cannot be constructed from null pointers but \"value\" is null.");
    }

    /* renamed from: a */
    public static C6912j m26125a(int i) {
        if (i < 0 || i > 65535) {
            throw new IllegalArgumentException("Identifiers can only be constructed from integers between 0 and 65535 (inclusive).");
        }
        return new C6912j(new byte[]{(byte) (i >> 8), (byte) i});
    }

    /* renamed from: a */
    public static C6912j m26126a(long j, int i) {
        if (i >= 0) {
            byte[] bArr = new byte[i];
            for (int i2 = i - 1; i2 >= 0; i2--) {
                bArr[i2] = (byte) ((int) (255 & j));
                j >>= 8;
            }
            return new C6912j(bArr);
        }
        throw new IllegalArgumentException("Identifier length must be > 0.");
    }

    /* renamed from: a */
    public static C6912j m26127a(String str) {
        return m26128a(str, -1);
    }

    /* renamed from: a */
    public static C6912j m26128a(String str, int i) {
        if (str == null) {
            throw new NullPointerException("Identifiers cannot be constructed from null pointers but \"stringValue\" is null.");
        } else if (f19067a.matcher(str).matches()) {
            return m26131b(str.substring(2), i);
        } else {
            if (f19070d.matcher(str).matches()) {
                return m26131b(str.replace("-", ""), i);
            }
            if (f19069c.matcher(str).matches()) {
                try {
                    int intValue = Integer.valueOf(str).intValue();
                    return (i <= 0 || i == 2) ? m26125a(intValue) : m26126a((long) intValue, i);
                } catch (Throwable th) {
                    throw new IllegalArgumentException("Unable to parse Identifier in decimal format.", th);
                }
            } else if (f19068b.matcher(str).matches()) {
                return m26131b(str, i);
            } else {
                throw new IllegalArgumentException("Unable to parse Identifier.");
            }
        }
    }

    @TargetApi(9)
    /* renamed from: a */
    public static C6912j m26129a(byte[] bArr, int i, int i2, boolean z) {
        if (bArr == null) {
            throw new NullPointerException("Identifiers cannot be constructed from null pointers but \"bytes\" is null.");
        } else if (i < 0 || i > bArr.length) {
            throw new ArrayIndexOutOfBoundsException("start < 0 || start > bytes.length");
        } else if (i2 > bArr.length) {
            throw new ArrayIndexOutOfBoundsException("end > bytes.length");
        } else if (i <= i2) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
            if (z) {
                m26130a(copyOfRange);
            }
            return new C6912j(copyOfRange);
        } else {
            throw new IllegalArgumentException("start > end");
        }
    }

    /* renamed from: a */
    private static void m26130a(byte[] bArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            int length = (bArr.length - i) - 1;
            byte b = bArr[i];
            bArr[i] = bArr[length];
            bArr[length] = b;
        }
    }

    /* renamed from: b */
    private static C6912j m26131b(String str, int i) {
        String str2 = (str.length() % 2 == 0 ? "" : "0") + str.toUpperCase();
        if (i > 0 && i < str2.length() / 2) {
            str2 = str2.substring(str2.length() - (i * 2));
        }
        if (i > 0 && i > str2.length() / 2) {
            int length = (i * 2) - str2.length();
            StringBuilder sb = new StringBuilder();
            while (sb.length() < length) {
                sb.append("0");
            }
            str2 = sb.toString() + str2;
        }
        byte[] bArr = new byte[(str2.length() / 2)];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) (Integer.parseInt(str2.substring(i3, i3 + 2), 16) & 255);
        }
        return new C6912j(bArr);
    }

    /* renamed from: a */
    public int compareTo(C6912j jVar) {
        byte[] bArr = this.f19072f;
        int length = bArr.length;
        byte[] bArr2 = jVar.f19072f;
        if (length != bArr2.length) {
            return bArr.length < bArr2.length ? -1 : 1;
        }
        int i = 0;
        while (true) {
            byte[] bArr3 = this.f19072f;
            if (i >= bArr3.length) {
                return 0;
            }
            byte b = bArr3[i];
            byte[] bArr4 = jVar.f19072f;
            if (b != bArr4[i]) {
                return bArr3[i] < bArr4[i] ? -1 : 1;
            }
            i++;
        }
    }

    /* renamed from: a */
    public String mo18796a() {
        int length = this.f19072f.length;
        int i = 2;
        char[] cArr = new char[((length * 2) + 2)];
        cArr[0] = '0';
        cArr[1] = 'x';
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i + 1;
            char[] cArr2 = f19071e;
            byte[] bArr = this.f19072f;
            cArr[i] = cArr2[(bArr[i2] & 240) >>> 4];
            i = i3 + 1;
            cArr[i3] = cArr2[bArr[i2] & 15];
        }
        return new String(cArr);
    }

    /* renamed from: b */
    public int mo18797b() {
        if (this.f19072f.length <= 2) {
            int i = 0;
            int i2 = 0;
            while (true) {
                byte[] bArr = this.f19072f;
                if (i >= bArr.length) {
                    return i2;
                }
                i2 |= (bArr[i] & 255) << (((bArr.length - i) - 1) * 8);
                i++;
            }
        } else {
            throw new UnsupportedOperationException("Only supported for Identifiers with max byte length of 2");
        }
    }

    /* renamed from: c */
    public UUID mo18798c() {
        byte[] bArr = this.f19072f;
        if (bArr.length == 16) {
            LongBuffer asLongBuffer = ByteBuffer.wrap(bArr).asLongBuffer();
            return new UUID(asLongBuffer.get(), asLongBuffer.get());
        }
        throw new UnsupportedOperationException("Only Identifiers backed by a byte array with length of exactly 16 can be UUIDs.");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6912j)) {
            return false;
        }
        return Arrays.equals(this.f19072f, ((C6912j) obj).f19072f);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f19072f);
    }

    public String toString() {
        byte[] bArr = this.f19072f;
        return bArr.length == 2 ? Integer.toString(mo18797b()) : bArr.length == 16 ? mo18798c().toString() : mo18796a();
    }
}
