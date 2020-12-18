package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.dm */
final class C3037dm {
    /* renamed from: a */
    static int m12172a(int i, byte[] bArr, int i2, int i3, C2728Tm<?> tm, C3065em emVar) {
        C2613Pm pm = (C2613Pm) tm;
        int a = m12178a(bArr, i2, emVar);
        while (true) {
            pm.mo8689d(emVar.f9105a);
            if (a >= i3) {
                break;
            }
            int a2 = m12178a(bArr, a, emVar);
            if (i != emVar.f9105a) {
                break;
            }
            a = m12178a(bArr, a2, emVar);
        }
        return a;
    }

    /* renamed from: a */
    static int m12173a(int i, byte[] bArr, int i2, int i3, C3065em emVar) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return m12179b(bArr, i2, emVar);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return m12178a(bArr, i2, emVar) + emVar.f9105a;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = m12178a(bArr, i2, emVar);
                    i6 = emVar.f9105a;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = m12173a(i6, bArr, i2, i3, emVar);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw C2755Um.m11353g();
            } else if (i4 == 5) {
                return i2 + 4;
            } else {
                throw C2755Um.m11350d();
            }
        } else {
            throw C2755Um.m11350d();
        }
    }

    /* renamed from: a */
    static int m12174a(int i, byte[] bArr, int i2, int i3, C3067eo eoVar, C3065em emVar) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int b = m12179b(bArr, i2, emVar);
                eoVar.mo9399a(i, (Object) Long.valueOf(emVar.f9106b));
                return b;
            } else if (i4 == 1) {
                eoVar.mo9399a(i, (Object) Long.valueOf(m12180b(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int a = m12178a(bArr, i2, emVar);
                int i5 = emVar.f9105a;
                eoVar.mo9399a(i, (Object) i5 == 0 ? C3150hm.f9434a : C3150hm.m12538a(bArr, a, i5));
                return a + i5;
            } else if (i4 == 3) {
                C3067eo d = C3067eo.m12292d();
                int i6 = (i & -8) | 4;
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int a2 = m12178a(bArr, i2, emVar);
                    int i8 = emVar.f9105a;
                    if (i8 == i6) {
                        i7 = i8;
                        i2 = a2;
                        break;
                    }
                    i7 = i8;
                    i2 = m12174a(i8, bArr, a2, i3, d, emVar);
                }
                if (i2 > i3 || i7 != i6) {
                    throw C2755Um.m11353g();
                }
                eoVar.mo9399a(i, (Object) d);
                return i2;
            } else if (i4 == 5) {
                eoVar.mo9399a(i, (Object) Integer.valueOf(m12176a(bArr, i2)));
                return i2 + 4;
            } else {
                throw C2755Um.m11350d();
            }
        } else {
            throw C2755Um.m11350d();
        }
    }

    /* renamed from: a */
    static int m12175a(int i, byte[] bArr, int i2, C3065em emVar) {
        int i3;
        int i4;
        int i5 = i & 127;
        int i6 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            i4 = b << 7;
        } else {
            int i7 = i5 | ((b & Byte.MAX_VALUE) << 7);
            int i8 = i6 + 1;
            byte b2 = bArr[i6];
            if (b2 >= 0) {
                i3 = b2 << 14;
            } else {
                i5 = i7 | ((b2 & Byte.MAX_VALUE) << 14);
                i6 = i8 + 1;
                byte b3 = bArr[i8];
                if (b3 >= 0) {
                    i4 = b3 << 21;
                } else {
                    i7 = i5 | ((b3 & Byte.MAX_VALUE) << 21);
                    i8 = i6 + 1;
                    byte b4 = bArr[i6];
                    if (b4 >= 0) {
                        i3 = b4 << 28;
                    } else {
                        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i10 = i8 + 1;
                            if (bArr[i8] >= 0) {
                                emVar.f9105a = i9;
                                return i10;
                            }
                            i8 = i10;
                        }
                    }
                }
            }
            emVar.f9105a = i7 | i3;
            return i8;
        }
        emVar.f9105a = i5 | i4;
        return i6;
    }

    /* renamed from: a */
    static int m12176a(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: a */
    static int m12177a(byte[] bArr, int i, C2728Tm<?> tm, C3065em emVar) {
        C2613Pm pm = (C2613Pm) tm;
        int a = m12178a(bArr, i, emVar);
        int i2 = emVar.f9105a + a;
        while (a < i2) {
            a = m12178a(bArr, a, emVar);
            pm.mo8689d(emVar.f9105a);
        }
        if (a == i2) {
            return a;
        }
        throw C2755Um.m11347a();
    }

    /* renamed from: a */
    static int m12178a(byte[] bArr, int i, C3065em emVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m12175a((int) b, bArr, i2, emVar);
        }
        emVar.f9105a = b;
        return i2;
    }

    /* renamed from: b */
    static int m12179b(byte[] bArr, int i, C3065em emVar) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            emVar.f9106b = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & Byte.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & Byte.MAX_VALUE)) << i4;
            int i6 = i5;
            b = b2;
            i3 = i6;
        }
        emVar.f9106b = j2;
        return i3;
    }

    /* renamed from: b */
    static long m12180b(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* renamed from: c */
    static double m12181c(byte[] bArr, int i) {
        return Double.longBitsToDouble(m12180b(bArr, i));
    }

    /* renamed from: c */
    static int m12182c(byte[] bArr, int i, C3065em emVar) {
        int a = m12178a(bArr, i, emVar);
        int i2 = emVar.f9105a;
        if (i2 == 0) {
            emVar.f9107c = "";
            return a;
        }
        emVar.f9107c = new String(bArr, a, i2, C2641Qm.f8145a);
        return a + i2;
    }

    /* renamed from: d */
    static float m12183d(byte[] bArr, int i) {
        return Float.intBitsToFloat(m12176a(bArr, i));
    }

    /* renamed from: d */
    static int m12184d(byte[] bArr, int i, C3065em emVar) {
        int a = m12178a(bArr, i, emVar);
        int i2 = emVar.f9105a;
        if (i2 == 0) {
            emVar.f9107c = "";
            return a;
        }
        int i3 = a + i2;
        if (C3271lo.m12994a(bArr, a, i3)) {
            emVar.f9107c = new String(bArr, a, i2, C2641Qm.f8145a);
            return i3;
        }
        throw C2755Um.m11354h();
    }

    /* renamed from: e */
    static int m12185e(byte[] bArr, int i, C3065em emVar) {
        int a = m12178a(bArr, i, emVar);
        int i2 = emVar.f9105a;
        if (i2 == 0) {
            emVar.f9107c = C3150hm.f9434a;
            return a;
        }
        emVar.f9107c = C3150hm.m12538a(bArr, a, i2);
        return a + i2;
    }
}
