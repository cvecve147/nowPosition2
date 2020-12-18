package p013b.p018b.p028h.p039h;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: b.b.h.h.r */
public class C1101r<K, V> {

    /* renamed from: a */
    static Object[] f4083a;

    /* renamed from: b */
    static int f4084b;

    /* renamed from: c */
    static Object[] f4085c;

    /* renamed from: d */
    static int f4086d;

    /* renamed from: e */
    int[] f4087e;

    /* renamed from: f */
    Object[] f4088f;

    /* renamed from: g */
    int f4089g;

    public C1101r() {
        this.f4087e = C1084f.f4045a;
        this.f4088f = C1084f.f4047c;
        this.f4089g = 0;
    }

    public C1101r(int i) {
        if (i == 0) {
            this.f4087e = C1084f.f4045a;
            this.f4088f = C1084f.f4047c;
        } else {
            m5690e(i);
        }
        this.f4089g = 0;
    }

    public C1101r(C1101r<K, V> rVar) {
        this();
        if (rVar != null) {
            mo5234a(rVar);
        }
    }

    /* renamed from: a */
    private static int m5688a(int[] iArr, int i, int i2) {
        try {
            return C1084f.m5634a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: a */
    private static void m5689a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C1080b.class) {
                if (f4086d < 10) {
                    objArr[0] = f4085c;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f4085c = objArr;
                    f4086d++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C1080b.class) {
                if (f4084b < 10) {
                    objArr[0] = f4083a;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f4083a = objArr;
                    f4084b++;
                }
            }
        }
    }

    /* renamed from: e */
    private void m5690e(int i) {
        if (i == 8) {
            synchronized (C1080b.class) {
                if (f4085c != null) {
                    Object[] objArr = f4085c;
                    this.f4088f = objArr;
                    f4085c = (Object[]) objArr[0];
                    this.f4087e = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f4086d--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C1080b.class) {
                if (f4083a != null) {
                    Object[] objArr2 = f4083a;
                    this.f4088f = objArr2;
                    f4083a = (Object[]) objArr2[0];
                    this.f4087e = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f4084b--;
                    return;
                }
            }
        }
        this.f4087e = new int[i];
        this.f4088f = new Object[(i << 1)];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo5229a() {
        int i = this.f4089g;
        if (i == 0) {
            return -1;
        }
        int a = m5688a(this.f4087e, i, 0);
        if (a < 0 || this.f4088f[a << 1] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f4087e[i2] == 0) {
            if (this.f4088f[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f4087e[i3] == 0) {
            if (this.f4088f[i3 << 1] == null) {
                return i3;
            }
            i3--;
        }
        return ~i2;
    }

    /* renamed from: a */
    public int mo5230a(Object obj) {
        return obj == null ? mo5229a() : mo5231a(obj, obj.hashCode());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo5231a(Object obj, int i) {
        int i2 = this.f4089g;
        if (i2 == 0) {
            return -1;
        }
        int a = m5688a(this.f4087e, i2, i);
        if (a < 0 || obj.equals(this.f4088f[a << 1])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f4087e[i3] == i) {
            if (obj.equals(this.f4088f[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f4087e[i4] == i) {
            if (obj.equals(this.f4088f[i4 << 1])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    /* renamed from: a */
    public V mo5232a(int i, V v) {
        int i2 = (i << 1) + 1;
        V[] vArr = this.f4088f;
        V v2 = vArr[i2];
        vArr[i2] = v;
        return v2;
    }

    /* renamed from: a */
    public void mo5233a(int i) {
        int i2 = this.f4089g;
        int[] iArr = this.f4087e;
        if (iArr.length < i) {
            Object[] objArr = this.f4088f;
            m5690e(i);
            if (this.f4089g > 0) {
                System.arraycopy(iArr, 0, this.f4087e, 0, i2);
                System.arraycopy(objArr, 0, this.f4088f, 0, i2 << 1);
            }
            m5689a(iArr, objArr, i2);
        }
        if (this.f4089g != i2) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: a */
    public void mo5234a(C1101r<? extends K, ? extends V> rVar) {
        int i = rVar.f4089g;
        mo5233a(this.f4089g + i);
        if (this.f4089g != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(rVar.mo5236b(i2), rVar.mo5241d(i2));
            }
        } else if (i > 0) {
            System.arraycopy(rVar.f4087e, 0, this.f4087e, 0, i);
            System.arraycopy(rVar.f4088f, 0, this.f4088f, 0, i << 1);
            this.f4089g = i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo5235b(Object obj) {
        int i = this.f4089g * 2;
        Object[] objArr = this.f4088f;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public K mo5236b(int i) {
        return this.f4088f[i << 1];
    }

    /* renamed from: c */
    public V mo5237c(int i) {
        int i2;
        V[] vArr = this.f4088f;
        int i3 = i << 1;
        V v = vArr[i3 + 1];
        int i4 = this.f4089g;
        if (i4 <= 1) {
            m5689a(this.f4087e, (Object[]) vArr, i4);
            this.f4087e = C1084f.f4045a;
            this.f4088f = C1084f.f4047c;
            i2 = 0;
        } else {
            i2 = i4 - 1;
            int[] iArr = this.f4087e;
            int i5 = 8;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i < i2) {
                    int[] iArr2 = this.f4087e;
                    int i6 = i + 1;
                    int i7 = i2 - i;
                    System.arraycopy(iArr2, i6, iArr2, i, i7);
                    Object[] objArr = this.f4088f;
                    System.arraycopy(objArr, i6 << 1, objArr, i3, i7 << 1);
                }
                Object[] objArr2 = this.f4088f;
                int i8 = i2 << 1;
                objArr2[i8] = null;
                objArr2[i8 + 1] = null;
            } else {
                if (i4 > 8) {
                    i5 = i4 + (i4 >> 1);
                }
                int[] iArr3 = this.f4087e;
                Object[] objArr3 = this.f4088f;
                m5690e(i5);
                if (i4 == this.f4089g) {
                    if (i > 0) {
                        System.arraycopy(iArr3, 0, this.f4087e, 0, i);
                        System.arraycopy(objArr3, 0, this.f4088f, 0, i3);
                    }
                    if (i < i2) {
                        int i9 = i + 1;
                        int i10 = i2 - i;
                        System.arraycopy(iArr3, i9, this.f4087e, i, i10);
                        System.arraycopy(objArr3, i9 << 1, this.f4088f, i3, i10 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
        }
        if (i4 == this.f4089g) {
            this.f4089g = i2;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public void clear() {
        int i = this.f4089g;
        if (i > 0) {
            int[] iArr = this.f4087e;
            Object[] objArr = this.f4088f;
            this.f4087e = C1084f.f4045a;
            this.f4088f = C1084f.f4047c;
            this.f4089g = 0;
            m5689a(iArr, objArr, i);
        }
        if (this.f4089g > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return mo5230a(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return mo5235b(obj) >= 0;
    }

    /* renamed from: d */
    public V mo5241d(int i) {
        return this.f4088f[(i << 1) + 1];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1101r) {
            C1101r rVar = (C1101r) obj;
            if (size() != rVar.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f4089g) {
                try {
                    Object b = mo5236b(i);
                    Object d = mo5241d(i);
                    Object obj2 = rVar.get(b);
                    if (d == null) {
                        if (obj2 != null || !rVar.containsKey(b)) {
                            return false;
                        }
                    } else if (!d.equals(obj2)) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.f4089g) {
                try {
                    Object b2 = mo5236b(i2);
                    Object d2 = mo5241d(i2);
                    Object obj3 = map.get(b2);
                    if (d2 == null) {
                        if (obj3 != null || !map.containsKey(b2)) {
                            return false;
                        }
                    } else if (!d2.equals(obj3)) {
                        return false;
                    }
                    i2++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public V get(Object obj) {
        int a = mo5230a(obj);
        if (a >= 0) {
            return this.f4088f[(a << 1) + 1];
        }
        return null;
    }

    public int hashCode() {
        int[] iArr = this.f4087e;
        Object[] objArr = this.f4088f;
        int i = this.f4089g;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public boolean isEmpty() {
        return this.f4089g <= 0;
    }

    public V put(K k, V v) {
        int i;
        int i2;
        int i3 = this.f4089g;
        if (k == null) {
            i2 = mo5229a();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            i2 = mo5231a((Object) k, hashCode);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            V[] vArr = this.f4088f;
            V v2 = vArr[i4];
            vArr[i4] = v;
            return v2;
        }
        int i5 = ~i2;
        if (i3 >= this.f4087e.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            int[] iArr = this.f4087e;
            Object[] objArr = this.f4088f;
            m5690e(i6);
            if (i3 == this.f4089g) {
                int[] iArr2 = this.f4087e;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f4088f, 0, objArr.length);
                }
                m5689a(iArr, objArr, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.f4087e;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr2 = this.f4088f;
            System.arraycopy(objArr2, i5 << 1, objArr2, i7 << 1, (this.f4089g - i5) << 1);
        }
        int i8 = this.f4089g;
        if (i3 == i8) {
            int[] iArr4 = this.f4087e;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                Object[] objArr3 = this.f4088f;
                int i9 = i5 << 1;
                objArr3[i9] = k;
                objArr3[i9 + 1] = v;
                this.f4089g = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V remove(Object obj) {
        int a = mo5230a(obj);
        if (a >= 0) {
            return mo5237c(a);
        }
        return null;
    }

    public int size() {
        return this.f4089g;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4089g * 28);
        sb.append('{');
        for (int i = 0; i < this.f4089g; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object b = mo5236b(i);
            if (b != this) {
                sb.append(b);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object d = mo5241d(i);
            if (d != this) {
                sb.append(d);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
