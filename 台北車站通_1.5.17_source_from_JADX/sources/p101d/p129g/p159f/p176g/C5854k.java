package p101d.p129g.p159f.p176g;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;
import p101d.p129g.p159f.C5771c;
import p101d.p129g.p159f.C5806e;
import p101d.p129g.p159f.C5882i;
import p101d.p129g.p159f.C5915k;
import p101d.p129g.p159f.C5916l;
import p101d.p129g.p159f.C5917m;
import p101d.p129g.p159f.C5918n;
import p101d.p129g.p159f.C5919o;
import p101d.p129g.p159f.p167c.C5772a;

/* renamed from: d.g.f.g.k */
public abstract class C5854k implements C5915k {
    /* renamed from: a */
    protected static float m22116a(int[] iArr, int[] iArr2, float f) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = (float) i;
        float f3 = f2 / ((float) i2);
        float f4 = f * f3;
        float f5 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            float f6 = ((float) iArr2[i4]) * f3;
            float f7 = (float) i5;
            float f8 = f7 > f6 ? f7 - f6 : f6 - f7;
            if (f8 > f4) {
                return Float.POSITIVE_INFINITY;
            }
            f5 += f8;
        }
        return f5 / f2;
    }

    /* renamed from: a */
    protected static void m22117a(C5772a aVar, int i, int[] iArr) {
        int length = iArr.length;
        Arrays.fill(iArr, 0, length, 0);
        int f = aVar.mo15378f();
        if (i < f) {
            boolean z = !aVar.mo15369a(i);
            int i2 = 0;
            while (i < f) {
                if (aVar.mo15369a(i) ^ z) {
                    iArr[i2] = iArr[i2] + 1;
                } else {
                    i2++;
                    if (i2 == length) {
                        break;
                    }
                    iArr[i2] = 1;
                    z = !z;
                }
                i++;
            }
            if (i2 == length) {
                return;
            }
            if (i2 != length - 1 || i != f) {
                throw C5882i.m22303a();
            }
            return;
        }
        throw C5882i.m22303a();
    }

    /* renamed from: b */
    private C5917m m22118b(C5771c cVar, Map<C5806e, ?> map) {
        int i;
        int i2;
        int i3;
        int i4;
        Map<C5806e, ?> map2 = map;
        int c = cVar.mo15364c();
        int b = cVar.mo15363b();
        C5772a aVar = new C5772a(c);
        int i5 = b >> 1;
        int i6 = 0;
        int i7 = 1;
        boolean z = map2 != null && map2.containsKey(C5806e.TRY_HARDER);
        int max = Math.max(1, b >> (z ? 8 : 5));
        int i8 = z ? b : 15;
        Map<C5806e, ?> map3 = map2;
        int i9 = 0;
        while (i9 < i8) {
            int i10 = i9 + 1;
            int i11 = i10 / 2;
            if (((i9 & 1) == 0 ? i7 : i6) == 0) {
                i11 = -i11;
            }
            int i12 = (i11 * max) + i5;
            if (i12 < 0 || i12 >= b) {
                break;
            }
            try {
                aVar = cVar.mo15361a(i12, aVar);
                EnumMap enumMap = map3;
                int i13 = i6;
                while (i13 < 2) {
                    if (i13 == i7) {
                        aVar.mo15379g();
                        if (enumMap != null && enumMap.containsKey(C5806e.NEED_RESULT_POINT_CALLBACK)) {
                            EnumMap enumMap2 = new EnumMap(C5806e.class);
                            enumMap2.putAll(enumMap);
                            enumMap2.remove(C5806e.NEED_RESULT_POINT_CALLBACK);
                            enumMap = enumMap2;
                        }
                    }
                    try {
                        C5917m a = mo15484a(i12, aVar, enumMap);
                        if (i13 == i7) {
                            try {
                                a.mo15694a(C5918n.ORIENTATION, 180);
                                C5919o[] d = a.mo15699d();
                                if (d != null) {
                                    float f = (float) c;
                                    i3 = c;
                                    try {
                                        d[0] = new C5919o((f - d[i6].mo15702a()) - 1.0f, d[i6].mo15703b());
                                        i4 = 1;
                                        try {
                                            d[1] = new C5919o((f - d[1].mo15702a()) - 1.0f, d[1].mo15703b());
                                        } catch (C5916l unused) {
                                            continue;
                                        }
                                    } catch (C5916l unused2) {
                                        i4 = 1;
                                        i13++;
                                        C5771c cVar2 = cVar;
                                        i7 = i4;
                                        c = i3;
                                        i6 = 0;
                                    }
                                }
                            } catch (C5916l unused3) {
                                i3 = c;
                                i4 = 1;
                                i13++;
                                C5771c cVar22 = cVar;
                                i7 = i4;
                                c = i3;
                                i6 = 0;
                            }
                        }
                        return a;
                    } catch (C5916l unused4) {
                        i3 = c;
                        i4 = i7;
                        i13++;
                        C5771c cVar222 = cVar;
                        i7 = i4;
                        c = i3;
                        i6 = 0;
                    }
                }
                i = c;
                i2 = i7;
                map3 = enumMap;
            } catch (C5882i unused5) {
                i = c;
                i2 = i7;
            }
            i9 = i10;
            i7 = i2;
            c = i;
            i6 = 0;
        }
        throw C5882i.m22303a();
    }

    /* renamed from: b */
    protected static void m22119b(C5772a aVar, int i, int[] iArr) {
        int length = iArr.length;
        boolean a = aVar.mo15369a(i);
        while (i > 0 && length >= 0) {
            i--;
            if (aVar.mo15369a(i) != a) {
                length--;
                a = !a;
            }
        }
        if (length < 0) {
            m22117a(aVar, i + 1, iArr);
            return;
        }
        throw C5882i.m22303a();
    }

    /* renamed from: a */
    public abstract C5917m mo15484a(int i, C5772a aVar, Map<C5806e, ?> map);

    /* renamed from: a */
    public C5917m mo15333a(C5771c cVar) {
        return mo15334a(cVar, (Map<C5806e, ?>) null);
    }

    /* renamed from: a */
    public C5917m mo15334a(C5771c cVar, Map<C5806e, ?> map) {
        try {
            return m22118b(cVar, map);
        } catch (C5882i e) {
            if (!(map != null && map.containsKey(C5806e.TRY_HARDER)) || !cVar.mo15365d()) {
                throw e;
            }
            cVar.mo15366e();
            throw null;
        }
    }

    public void reset() {
    }
}
