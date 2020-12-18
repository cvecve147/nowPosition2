package com.google.android.gms.internal.measurement;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

/* renamed from: com.google.android.gms.internal.measurement.b */
public final class C3824b {

    /* renamed from: a */
    private final ByteBuffer f11397a;

    private C3824b(ByteBuffer byteBuffer) {
        this.f11397a = byteBuffer;
        this.f11397a.order(ByteOrder.LITTLE_ENDIAN);
    }

    private C3824b(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, i, i2));
    }

    /* renamed from: a */
    public static int m15339a(int i) {
        if (i >= 0) {
            return m15352d(i);
        }
        return 10;
    }

    /* renamed from: a */
    public static int m15340a(long j) {
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
    private static int m15341a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                StringBuilder sb = new StringBuilder(39);
                                sb.append("Unpaired surrogate at index ");
                                sb.append(i2);
                                throw new IllegalArgumentException(sb.toString());
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(((long) i3) + 4294967296L);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: a */
    public static int m15342a(String str) {
        int a = m15341a((CharSequence) str);
        return m15352d(a) + a;
    }

    /* renamed from: a */
    public static C3824b m15343a(byte[] bArr) {
        return m15344a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static C3824b m15344a(byte[] bArr, int i, int i2) {
        return new C3824b(bArr, 0, i2);
    }

    /* renamed from: a */
    private static void m15345a(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i;
        int i2;
        int i3;
        char charAt;
        if (!byteBuffer.isReadOnly()) {
            int i4 = 0;
            if (byteBuffer.hasArray()) {
                try {
                    byte[] array = byteBuffer.array();
                    int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                    int remaining = byteBuffer.remaining();
                    int length = charSequence.length();
                    int i5 = remaining + arrayOffset;
                    while (i4 < length) {
                        int i6 = i4 + arrayOffset;
                        if (i6 >= i5 || (charAt = charSequence.charAt(i4)) >= 128) {
                            break;
                        }
                        array[i6] = (byte) charAt;
                        i4++;
                    }
                    if (i4 == length) {
                        i2 = arrayOffset + length;
                    } else {
                        i2 = arrayOffset + i4;
                        while (i4 < length) {
                            char charAt2 = charSequence.charAt(i4);
                            if (charAt2 < 128 && i2 < i5) {
                                i3 = i2 + 1;
                                array[i2] = (byte) charAt2;
                            } else if (charAt2 < 2048 && i2 <= i5 - 2) {
                                int i7 = i2 + 1;
                                array[i2] = (byte) ((charAt2 >>> 6) | 960);
                                i2 = i7 + 1;
                                array[i7] = (byte) ((charAt2 & '?') | 128);
                                i4++;
                            } else if ((charAt2 < 55296 || 57343 < charAt2) && i2 <= i5 - 3) {
                                int i8 = i2 + 1;
                                array[i2] = (byte) ((charAt2 >>> 12) | 480);
                                int i9 = i8 + 1;
                                array[i8] = (byte) (((charAt2 >>> 6) & 63) | 128);
                                i3 = i9 + 1;
                                array[i9] = (byte) ((charAt2 & '?') | 128);
                            } else if (i2 <= i5 - 4) {
                                int i10 = i4 + 1;
                                if (i10 != charSequence.length()) {
                                    char charAt3 = charSequence.charAt(i10);
                                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                                        int i11 = i2 + 1;
                                        array[i2] = (byte) ((codePoint >>> 18) | 240);
                                        int i12 = i11 + 1;
                                        array[i11] = (byte) (((codePoint >>> 12) & 63) | 128);
                                        int i13 = i12 + 1;
                                        array[i12] = (byte) (((codePoint >>> 6) & 63) | 128);
                                        i2 = i13 + 1;
                                        array[i13] = (byte) ((codePoint & 63) | 128);
                                        i4 = i10;
                                        i4++;
                                    } else {
                                        i4 = i10;
                                    }
                                }
                                StringBuilder sb = new StringBuilder(39);
                                sb.append("Unpaired surrogate at index ");
                                sb.append(i4 - 1);
                                throw new IllegalArgumentException(sb.toString());
                            } else {
                                StringBuilder sb2 = new StringBuilder(37);
                                sb2.append("Failed writing ");
                                sb2.append(charAt2);
                                sb2.append(" at index ");
                                sb2.append(i2);
                                throw new ArrayIndexOutOfBoundsException(sb2.toString());
                            }
                            i2 = i3;
                            i4++;
                        }
                    }
                    byteBuffer.position(i2 - byteBuffer.arrayOffset());
                } catch (ArrayIndexOutOfBoundsException e) {
                    BufferOverflowException bufferOverflowException = new BufferOverflowException();
                    bufferOverflowException.initCause(e);
                    throw bufferOverflowException;
                }
            } else {
                int length2 = charSequence.length();
                while (i4 < length2) {
                    char charAt4 = charSequence.charAt(i4);
                    if (charAt4 >= 128) {
                        if (charAt4 < 2048) {
                            i = (charAt4 >>> 6) | 960;
                        } else if (charAt4 < 55296 || 57343 < charAt4) {
                            byteBuffer.put((byte) ((charAt4 >>> 12) | 480));
                            i = ((charAt4 >>> 6) & 63) | 128;
                        } else {
                            int i14 = i4 + 1;
                            if (i14 != charSequence.length()) {
                                char charAt5 = charSequence.charAt(i14);
                                if (Character.isSurrogatePair(charAt4, charAt5)) {
                                    int codePoint2 = Character.toCodePoint(charAt4, charAt5);
                                    byteBuffer.put((byte) ((codePoint2 >>> 18) | 240));
                                    byteBuffer.put((byte) (((codePoint2 >>> 12) & 63) | 128));
                                    byteBuffer.put((byte) (((codePoint2 >>> 6) & 63) | 128));
                                    byteBuffer.put((byte) ((codePoint2 & 63) | 128));
                                    i4 = i14;
                                    i4++;
                                } else {
                                    i4 = i14;
                                }
                            }
                            StringBuilder sb3 = new StringBuilder(39);
                            sb3.append("Unpaired surrogate at index ");
                            sb3.append(i4 - 1);
                            throw new IllegalArgumentException(sb3.toString());
                        }
                        byteBuffer.put((byte) i);
                        charAt4 = (charAt4 & '?') | 128;
                    }
                    byteBuffer.put((byte) charAt4);
                    i4++;
                }
            }
        } else {
            throw new ReadOnlyBufferException();
        }
    }

    /* renamed from: b */
    public static int m15346b(int i) {
        return m15352d(i << 3);
    }

    /* renamed from: b */
    public static int m15347b(int i, int i2) {
        return m15346b(i) + m15339a(i2);
    }

    /* renamed from: b */
    public static int m15348b(int i, C3856j jVar) {
        int b = m15346b(i);
        int d = jVar.mo10758d();
        return b + m15352d(d) + d;
    }

    /* renamed from: b */
    public static int m15349b(int i, String str) {
        return m15346b(i) + m15342a(str);
    }

    /* renamed from: b */
    private final void m15350b(long j) {
        while ((-128 & j) != 0) {
            m15353e((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m15353e((int) j);
    }

    /* renamed from: c */
    public static int m15351c(int i, long j) {
        return m15346b(i) + m15340a(j);
    }

    /* renamed from: d */
    public static int m15352d(int i) {
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

    /* renamed from: e */
    private final void m15353e(int i) {
        byte b = (byte) i;
        if (this.f11397a.hasRemaining()) {
            this.f11397a.put(b);
            return;
        }
        throw new C3828c(this.f11397a.position(), this.f11397a.limit());
    }

    /* renamed from: a */
    public final void mo10662a() {
        if (this.f11397a.remaining() != 0) {
            throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", new Object[]{Integer.valueOf(this.f11397a.remaining())}));
        }
    }

    /* renamed from: a */
    public final void mo10663a(int i, double d) {
        mo10674c(i, 1);
        long doubleToLongBits = Double.doubleToLongBits(d);
        if (this.f11397a.remaining() >= 8) {
            this.f11397a.putLong(doubleToLongBits);
            return;
        }
        throw new C3828c(this.f11397a.position(), this.f11397a.limit());
    }

    /* renamed from: a */
    public final void mo10664a(int i, float f) {
        mo10674c(i, 5);
        int floatToIntBits = Float.floatToIntBits(f);
        if (this.f11397a.remaining() >= 4) {
            this.f11397a.putInt(floatToIntBits);
            return;
        }
        throw new C3828c(this.f11397a.position(), this.f11397a.limit());
    }

    /* renamed from: a */
    public final void mo10665a(int i, int i2) {
        mo10674c(i, 0);
        if (i2 >= 0) {
            mo10673c(i2);
        } else {
            m15350b((long) i2);
        }
    }

    /* renamed from: a */
    public final void mo10666a(int i, long j) {
        mo10674c(i, 0);
        m15350b(j);
    }

    /* renamed from: a */
    public final void mo10667a(int i, C3856j jVar) {
        mo10674c(i, 2);
        mo10670a(jVar);
    }

    /* renamed from: a */
    public final void mo10668a(int i, String str) {
        mo10674c(i, 2);
        try {
            int d = m15352d(str.length());
            if (d == m15352d(str.length() * 3)) {
                int position = this.f11397a.position();
                if (this.f11397a.remaining() >= d) {
                    this.f11397a.position(position + d);
                    m15345a((CharSequence) str, this.f11397a);
                    int position2 = this.f11397a.position();
                    this.f11397a.position(position);
                    mo10673c((position2 - position) - d);
                    this.f11397a.position(position2);
                    return;
                }
                throw new C3828c(position + d, this.f11397a.limit());
            }
            mo10673c(m15341a((CharSequence) str));
            m15345a((CharSequence) str, this.f11397a);
        } catch (BufferOverflowException e) {
            C3828c cVar = new C3828c(this.f11397a.position(), this.f11397a.limit());
            cVar.initCause(e);
            throw cVar;
        }
    }

    /* renamed from: a */
    public final void mo10669a(int i, boolean z) {
        mo10674c(i, 0);
        byte b = z ? (byte) 1 : 0;
        if (this.f11397a.hasRemaining()) {
            this.f11397a.put(b);
            return;
        }
        throw new C3828c(this.f11397a.position(), this.f11397a.limit());
    }

    /* renamed from: a */
    public final void mo10670a(C3856j jVar) {
        mo10673c(jVar.mo10757c());
        jVar.mo10405a(this);
    }

    /* renamed from: b */
    public final void mo10671b(int i, long j) {
        mo10674c(i, 0);
        m15350b(j);
    }

    /* renamed from: b */
    public final void mo10672b(byte[] bArr) {
        int length = bArr.length;
        if (this.f11397a.remaining() >= length) {
            this.f11397a.put(bArr, 0, length);
            return;
        }
        throw new C3828c(this.f11397a.position(), this.f11397a.limit());
    }

    /* renamed from: c */
    public final void mo10673c(int i) {
        while ((i & -128) != 0) {
            m15353e((i & 127) | 128);
            i >>>= 7;
        }
        m15353e(i);
    }

    /* renamed from: c */
    public final void mo10674c(int i, int i2) {
        mo10673c((i << 3) | i2);
    }
}
