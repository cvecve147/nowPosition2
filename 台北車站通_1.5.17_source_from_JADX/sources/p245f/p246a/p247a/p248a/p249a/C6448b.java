package p245f.p246a.p247a.p248a.p249a;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: f.a.a.a.a.b */
public final class C6448b<E> implements Collection<E>, Set<E> {

    /* renamed from: a */
    static Object[] f17835a;

    /* renamed from: b */
    static int f17836b;

    /* renamed from: c */
    static Object[] f17837c;

    /* renamed from: d */
    static int f17838d;

    /* renamed from: e */
    int[] f17839e = C6450d.f17850e;

    /* renamed from: f */
    Object[] f17840f = C6450d.f17852g;

    /* renamed from: g */
    int f17841g = 0;

    /* renamed from: h */
    C6452f<E, E> f17842h;

    /* renamed from: a */
    private int m24078a(Object obj, int i) {
        int i2 = this.f17841g;
        if (i2 == 0) {
            return -1;
        }
        int a = C6449c.m24086a(this.f17839e, i2, i);
        if (a < 0 || obj.equals(this.f17840f[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f17839e[i3] == i) {
            if (obj.equals(this.f17840f[i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f17839e[i4] == i) {
            if (obj.equals(this.f17840f[i4])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    /* renamed from: a */
    private C6452f<E, E> m24079a() {
        if (this.f17842h == null) {
            this.f17842h = new C6447a(this);
        }
        return this.f17842h;
    }

    /* renamed from: a */
    private static void m24080a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C6448b.class) {
                if (f17838d < 10) {
                    objArr[0] = f17837c;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f17837c = objArr;
                    f17838d++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C6448b.class) {
                if (f17836b < 10) {
                    objArr[0] = f17835a;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f17835a = objArr;
                    f17836b++;
                }
            }
        }
    }

    /* renamed from: b */
    private int m24081b() {
        int i = this.f17841g;
        if (i == 0) {
            return -1;
        }
        int a = C6449c.m24086a(this.f17839e, i, 0);
        if (a < 0 || this.f17840f[a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f17839e[i2] == 0) {
            if (this.f17840f[i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f17839e[i3] == 0) {
            if (this.f17840f[i3] == null) {
                return i3;
            }
            i3--;
        }
        return ~i2;
    }

    /* renamed from: f */
    private void m24082f(int i) {
        if (i == 8) {
            synchronized (C6448b.class) {
                if (f17837c != null) {
                    Object[] objArr = f17837c;
                    this.f17840f = objArr;
                    f17837c = (Object[]) objArr[0];
                    this.f17839e = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f17838d--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C6448b.class) {
                if (f17835a != null) {
                    Object[] objArr2 = f17835a;
                    this.f17840f = objArr2;
                    f17835a = (Object[]) objArr2[0];
                    this.f17839e = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f17836b--;
                    return;
                }
            }
        }
        this.f17839e = new int[i];
        this.f17840f = new Object[i];
    }

    public boolean add(E e) {
        int i;
        int i2;
        if (e == null) {
            i2 = m24081b();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            i2 = m24078a(e, hashCode);
        }
        if (i2 >= 0) {
            return false;
        }
        int i3 = ~i2;
        int i4 = this.f17841g;
        if (i4 >= this.f17839e.length) {
            int i5 = 4;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i5 = 8;
            }
            int[] iArr = this.f17839e;
            Object[] objArr = this.f17840f;
            m24082f(i5);
            int[] iArr2 = this.f17839e;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f17840f, 0, objArr.length);
            }
            m24080a(iArr, objArr, this.f17841g);
        }
        int i6 = this.f17841g;
        if (i3 < i6) {
            int[] iArr3 = this.f17839e;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f17840f;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f17841g - i3);
        }
        this.f17839e[i3] = i;
        this.f17840f[i3] = e;
        this.f17841g++;
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo16562c(this.f17841g + collection.size());
        boolean z = false;
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    /* renamed from: c */
    public void mo16562c(int i) {
        int[] iArr = this.f17839e;
        if (iArr.length < i) {
            Object[] objArr = this.f17840f;
            m24082f(i);
            int i2 = this.f17841g;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f17839e, 0, i2);
                System.arraycopy(objArr, 0, this.f17840f, 0, this.f17841g);
            }
            m24080a(iArr, objArr, this.f17841g);
        }
    }

    public void clear() {
        int i = this.f17841g;
        if (i != 0) {
            m24080a(this.f17839e, this.f17840f, i);
            this.f17839e = C6450d.f17850e;
            this.f17840f = C6450d.f17852g;
            this.f17841g = 0;
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
    public E mo16566d(int i) {
        E[] eArr = this.f17840f;
        E e = eArr[i];
        int i2 = this.f17841g;
        if (i2 <= 1) {
            m24080a(this.f17839e, eArr, i2);
            this.f17839e = C6450d.f17850e;
            this.f17840f = C6450d.f17852g;
            this.f17841g = 0;
        } else {
            int[] iArr = this.f17839e;
            int i3 = 8;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                this.f17841g--;
                int i4 = this.f17841g;
                if (i < i4) {
                    int[] iArr2 = this.f17839e;
                    int i5 = i + 1;
                    System.arraycopy(iArr2, i5, iArr2, i, i4 - i);
                    Object[] objArr = this.f17840f;
                    System.arraycopy(objArr, i5, objArr, i, this.f17841g - i);
                }
                this.f17840f[this.f17841g] = null;
            } else {
                if (i2 > 8) {
                    i3 = i2 + (i2 >> 1);
                }
                int[] iArr3 = this.f17839e;
                Object[] objArr2 = this.f17840f;
                m24082f(i3);
                this.f17841g--;
                if (i > 0) {
                    System.arraycopy(iArr3, 0, this.f17839e, 0, i);
                    System.arraycopy(objArr2, 0, this.f17840f, 0, i);
                }
                int i6 = this.f17841g;
                if (i < i6) {
                    int i7 = i + 1;
                    System.arraycopy(iArr3, i7, this.f17839e, i, i6 - i);
                    System.arraycopy(objArr2, i7, this.f17840f, i, this.f17841g - i);
                }
            }
        }
        return e;
    }

    /* renamed from: e */
    public E mo16567e(int i) {
        return this.f17840f[i];
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
            while (i < this.f17841g) {
                try {
                    if (!set.contains(mo16567e(i))) {
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
        int[] iArr = this.f17839e;
        int i = this.f17841g;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public int indexOf(Object obj) {
        return obj == null ? m24081b() : m24078a(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        return this.f17841g <= 0;
    }

    public Iterator<E> iterator() {
        return m24079a().mo16607d().iterator();
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        mo16566d(indexOf);
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
        for (int i = this.f17841g - 1; i >= 0; i--) {
            if (!collection.contains(this.f17840f[i])) {
                mo16566d(i);
                z = true;
            }
        }
        return z;
    }

    public int size() {
        return this.f17841g;
    }

    public Object[] toArray() {
        int i = this.f17841g;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f17840f, 0, objArr, 0, i);
        return objArr;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f17841g) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f17841g);
        }
        System.arraycopy(this.f17840f, 0, tArr, 0, this.f17841g);
        int length = tArr.length;
        int i = this.f17841g;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f17841g * 14);
        sb.append('{');
        for (int i = 0; i < this.f17841g; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object e = mo16567e(i);
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
