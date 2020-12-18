package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lo */
final class C3271lo {

    /* renamed from: a */
    private static final C3299mo f9750a = (C3210jo.m12744b() && C3210jo.m12747c() ? new C3385po() : new C3328no());

    /* renamed from: a */
    static int m12991a(CharSequence charSequence) {
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
                                throw new C3356oo(i2, length2);
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
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(((long) i3) + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    static int m12992a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f9750a.mo9753a(charSequence, bArr, i, i2);
    }

    /* renamed from: a */
    public static boolean m12993a(byte[] bArr) {
        return f9750a.mo9754a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static boolean m12994a(byte[] bArr, int i, int i2) {
        return f9750a.mo9754a(bArr, i, i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m12995b(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m12996b(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m12997b(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static int m12999c(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return m12995b(b);
        }
        if (i3 == 1) {
            return m12996b(b, bArr[i]);
        }
        if (i3 == 2) {
            return m12997b((int) b, (int) bArr[i], (int) bArr[i + 1]);
        }
        throw new AssertionError();
    }
}
