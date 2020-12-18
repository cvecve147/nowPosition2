package p013b.p018b.p028h.p039h;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: b.b.h.h.d */
public final class C1082d<E> implements Collection<E>, Set<E> {

    /* renamed from: a */
    private static final int[] f4033a = new int[0];

    /* renamed from: b */
    private static final Object[] f4034b = new Object[0];

    /* renamed from: c */
    private static Object[] f4035c;

    /* renamed from: d */
    private static int f4036d;

    /* renamed from: e */
    private static Object[] f4037e;

    /* renamed from: f */
    private static int f4038f;

    /* renamed from: g */
    private int[] f4039g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Object[] f4040h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f4041i;

    /* renamed from: j */
    private C1089k<E, E> f4042j;

    public C1082d() {
        this(0);
    }

    public C1082d(int i) {
        if (i == 0) {
            this.f4039g = f4033a;
            this.f4040h = f4034b;
        } else {
            m5625f(i);
        }
        this.f4041i = 0;
    }

    /* renamed from: a */
    private int m5620a(Object obj, int i) {
        int i2 = this.f4041i;
        if (i2 == 0) {
            return -1;
        }
        int a = C1084f.m5634a(this.f4039g, i2, i);
        if (a < 0 || obj.equals(this.f4040h[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f4039g[i3] == i) {
            if (obj.equals(this.f4040h[i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f4039g[i4] == i) {
            if (obj.equals(this.f4040h[i4])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    /* renamed from: a */
    private C1089k<E, E> m5621a() {
        if (this.f4042j == null) {
            this.f4042j = new C1081c(this);
        }
        return this.f4042j;
    }

    /* renamed from: a */
    private static void m5622a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C1082d.class) {
                if (f4038f < 10) {
                    objArr[0] = f4037e;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f4037e = objArr;
                    f4038f++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C1082d.class) {
                if (f4036d < 10) {
                    objArr[0] = f4035c;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f4035c = objArr;
                    f4036d++;
                }
            }
        }
    }

    /* renamed from: b */
    private int m5623b() {
        int i = this.f4041i;
        if (i == 0) {
            return -1;
        }
        int a = C1084f.m5634a(this.f4039g, i, 0);
        if (a < 0 || this.f4040h[a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f4039g[i2] == 0) {
            if (this.f4040h[i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f4039g[i3] == 0) {
            if (this.f4040h[i3] == null) {
                return i3;
            }
            i3--;
        }
        return ~i2;
    }

    /* renamed from: f */
    private void m5625f(int i) {
        if (i == 8) {
            synchronized (C1082d.class) {
                if (f4037e != null) {
                    Object[] objArr = f4037e;
                    this.f4040h = objArr;
                    f4037e = (Object[]) objArr[0];
                    this.f4039g = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f4038f--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C1082d.class) {
                if (f4035c != null) {
                    Object[] objArr2 = f4035c;
                    this.f4040h = objArr2;
                    f4035c = (Object[]) objArr2[0];
                    this.f4039g = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f4036d--;
                    return;
                }
            }
        }
        this.f4039g = new int[i];
        this.f4040h = new Object[i];
    }

    public boolean add(E e) {
        int i;
        int i2;
        if (e == null) {
            i2 = m5623b();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            i2 = m5620a(e, hashCode);
        }
        if (i2 >= 0) {
            return false;
        }
        int i3 = ~i2;
        int i4 = this.f4041i;
        if (i4 >= this.f4039g.length) {
            int i5 = 4;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i5 = 8;
            }
            int[] iArr = this.f4039g;
            Object[] objArr = this.f4040h;
            m5625f(i5);
            int[] iArr2 = this.f4039g;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f4040h, 0, objArr.length);
            }
            m5622a(iArr, objArr, this.f4041i);
        }
        int i6 = this.f4041i;
        if (i3 < i6) {
            int[] iArr3 = this.f4039g;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f4040h;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f4041i - i3);
        }
        this.f4039g[i3] = i;
        this.f4040h[i3] = e;
        this.f4041i++;
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo5120c(this.f4041i + collection.size());
        boolean z = false;
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    /* renamed from: c */
    public void mo5120c(int i) {
        int[] iArr = this.f4039g;
        if (iArr.length < i) {
            Object[] objArr = this.f4040h;
            m5625f(i);
            int i2 = this.f4041i;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f4039g, 0, i2);
                System.arraycopy(objArr, 0, this.f4040h, 0, this.f4041i);
            }
            m5622a(iArr, objArr, this.f4041i);
        }
    }

    public void clear() {
        int i = this.f4041i;
        if (i != 0) {
            m5622a(this.f4039g, this.f4040h, i);
            this.f4039g = f4033a;
            this.f4040h = f4034b;
            this.f4041i = 0;
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public E mo5124d(int i) {
        E[] eArr = this.f4040h;
        E e = eArr[i];
        int i2 = this.f4041i;
        if (i2 <= 1) {
            m5622a(this.f4039g, eArr, i2);
            this.f4039g = f4033a;
            this.f4040h = f4034b;
            this.f4041i = 0;
        } else {
            int[] iArr = this.f4039g;
            int i3 = 8;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                this.f4041i--;
                int i4 = this.f4041i;
                if (i < i4) {
                    int[] iArr2 = this.f4039g;
                    int i5 = i + 1;
                    System.arraycopy(iArr2, i5, iArr2, i, i4 - i);
                    Object[] objArr = this.f4040h;
                    System.arraycopy(objArr, i5, objArr, i, this.f4041i - i);
                }
                this.f4040h[this.f4041i] = null;
            } else {
                if (i2 > 8) {
                    i3 = i2 + (i2 >> 1);
                }
                int[] iArr3 = this.f4039g;
                Object[] objArr2 = this.f4040h;
                m5625f(i3);
                this.f4041i--;
                if (i > 0) {
                    System.arraycopy(iArr3, 0, this.f4039g, 0, i);
                    System.arraycopy(objArr2, 0, this.f4040h, 0, i);
                }
                int i6 = this.f4041i;
                if (i < i6) {
                    int i7 = i + 1;
                    System.arraycopy(iArr3, i7, this.f4039g, i, i6 - i);
                    System.arraycopy(objArr2, i7, this.f4040h, i, this.f4041i - i);
                }
            }
        }
        return e;
    }

    /* renamed from: e */
    public E mo5125e(int i) {
        return this.f4040h[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f4041i) {
                try {
                    if (!set.contains(mo5125e(i))) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int[] iArr = this.f4039g;
        int i = this.f4041i;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public int indexOf(Object obj) {
        return obj == null ? m5623b() : m5620a(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        return this.f4041i <= 0;
    }

    public Iterator<E> iterator() {
        return m5621a().mo5166e().iterator();
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        mo5124d(indexOf);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f4041i - 1; i >= 0; i--) {
            if (!collection.contains(this.f4040h[i])) {
                mo5124d(i);
                z = true;
            }
        }
        return z;
    }

    public int size() {
        return this.f4041i;
    }

    public Object[] toArray() {
        int i = this.f4041i;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f4040h, 0, objArr, 0, i);
        return objArr;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f4041i) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f4041i);
        }
        System.arraycopy(this.f4040h, 0, tArr, 0, this.f4041i);
        int length = tArr.length;
        int i = this.f4041i;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4041i * 14);
        sb.append('{');
        for (int i = 0; i < this.f4041i; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object e = mo5125e(i);
            if (e != this) {
                sb.append(e);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
