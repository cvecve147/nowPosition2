package com.google.android.gms.internal.ads;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

/* renamed from: com.google.android.gms.internal.ads.Ao */
public final class C2180Ao {

    /* renamed from: a */
    private final ByteBuffer f6694a;

    private C2180Ao(ByteBuffer byteBuffer) {
        this.f6694a = byteBuffer;
        this.f6694a.order(ByteOrder.LITTLE_ENDIAN);
    }

    private C2180Ao(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, i, i2));
    }

    /* renamed from: a */
    public static int m9365a(int i) {
        return m9379c(i << 3);
    }

    /* renamed from: a */
    public static int m9366a(long j) {
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
    private static int m9367a(CharSequence charSequence) {
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
    public static int m9368a(String str) {
        int a = m9367a((CharSequence) str);
        return m9379c(a) + a;
    }

    /* renamed from: a */
    public static C2180Ao m9369a(byte[] bArr) {
        return m9370a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static C2180Ao m9370a(byte[] bArr, int i, int i2) {
        return new C2180Ao(bArr, 0, i2);
    }

    /* renamed from: a */
    private static void m9371a(CharSequence charSequence, ByteBuffer byteBuffer) {
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
    public static int m9372b(int i) {
        if (i >= 0) {
            return m9379c(i);
        }
        return 10;
    }

    /* renamed from: b */
    public static int m9373b(int i, long j) {
        return m9365a(i) + m9366a(j);
    }

    /* renamed from: b */
    public static int m9374b(int i, C2408Io io) {
        int a = m9365a(i);
        int a2 = io.mo8362a();
        return a + m9379c(a2) + a2;
    }

    /* renamed from: b */
    public static int m9375b(int i, String str) {
        return m9365a(i) + m9368a(str);
    }

    /* renamed from: b */
    public static int m9376b(int i, byte[] bArr) {
        return m9365a(i) + m9377b(bArr);
    }

    /* renamed from: b */
    public static int m9377b(byte[] bArr) {
        return m9379c(bArr.length) + bArr.length;
    }

    /* renamed from: b */
    private final void m9378b(long j) {
        while ((-128 & j) != 0) {
            m9382e((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m9382e((int) j);
    }

    /* renamed from: c */
    public static int m9379c(int i) {
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
    public static int m9380c(int i, int i2) {
        return m9365a(i) + m9372b(i2);
    }

    /* renamed from: c */
    public static int m9381c(int i, long j) {
        return m9365a(i) + m9366a(j);
    }

    /* renamed from: e */
    private final void m9382e(int i) {
        byte b = (byte) i;
        if (this.f6694a.hasRemaining()) {
            this.f6694a.put(b);
            return;
        }
        throw new C2208Bo(this.f6694a.position(), this.f6694a.limit());
    }

    /* renamed from: a */
    public final void mo7830a() {
        if (this.f6694a.remaining() != 0) {
            throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", new Object[]{Integer.valueOf(this.f6694a.remaining())}));
        }
    }

    /* renamed from: a */
    public final void mo7831a(int i, int i2) {
        mo7839d((i << 3) | i2);
    }

    /* renamed from: a */
    public final void mo7832a(int i, long j) {
        mo7831a(i, 0);
        m9378b(j);
    }

    /* renamed from: a */
    public final void mo7833a(int i, C2408Io io) {
        mo7831a(i, 2);
        if (io.f7295a < 0) {
            io.mo8362a();
        }
        mo7839d(io.f7295a);
        io.mo7848a(this);
    }

    /* renamed from: a */
    public final void mo7834a(int i, String str) {
        mo7831a(i, 2);
        try {
            int c = m9379c(str.length());
            if (c == m9379c(str.length() * 3)) {
                int position = this.f6694a.position();
                if (this.f6694a.remaining() >= c) {
                    this.f6694a.position(position + c);
                    m9371a((CharSequence) str, this.f6694a);
                    int position2 = this.f6694a.position();
                    this.f6694a.position(position);
                    mo7839d((position2 - position) - c);
                    this.f6694a.position(position2);
                    return;
                }
                throw new C2208Bo(position + c, this.f6694a.limit());
            }
            mo7839d(m9367a((CharSequence) str));
            m9371a((CharSequence) str, this.f6694a);
        } catch (BufferOverflowException e) {
            C2208Bo bo = new C2208Bo(this.f6694a.position(), this.f6694a.limit());
            bo.initCause(e);
            throw bo;
        }
    }

    /* renamed from: a */
    public final void mo7835a(int i, boolean z) {
        mo7831a(i, 0);
        byte b = z ? (byte) 1 : 0;
        if (this.f6694a.hasRemaining()) {
            this.f6694a.put(b);
            return;
        }
        throw new C2208Bo(this.f6694a.position(), this.f6694a.limit());
    }

    /* renamed from: a */
    public final void mo7836a(int i, byte[] bArr) {
        mo7831a(i, 2);
        mo7839d(bArr.length);
        mo7838c(bArr);
    }

    /* renamed from: b */
    public final void mo7837b(int i, int i2) {
        mo7831a(i, 0);
        if (i2 >= 0) {
            mo7839d(i2);
        } else {
            m9378b((long) i2);
        }
    }

    /* renamed from: c */
    public final void mo7838c(byte[] bArr) {
        int length = bArr.length;
        if (this.f6694a.remaining() >= length) {
            this.f6694a.put(bArr, 0, length);
            return;
        }
        throw new C2208Bo(this.f6694a.position(), this.f6694a.limit());
    }

    /* renamed from: d */
    public final void mo7839d(int i) {
        while ((i & -128) != 0) {
            m9382e((i & 127) | 128);
            i >>>= 7;
        }
        m9382e(i);
    }

    /* renamed from: d */
    public final void mo7840d(int i, long j) {
        mo7831a(i, 0);
        m9378b(j);
    }
}
