package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.Pm */
final class C2613Pm extends C2979bm<Integer> implements C2728Tm<Integer>, RandomAccess {

    /* renamed from: b */
    private static final C2613Pm f8115b;

    /* renamed from: c */
    private int[] f8116c;

    /* renamed from: d */
    private int f8117d;

    static {
        C2613Pm pm = new C2613Pm();
        f8115b = pm;
        pm.mo8903k();
    }

    C2613Pm() {
        this(new int[10], 0);
    }

    private C2613Pm(int[] iArr, int i) {
        this.f8116c = iArr;
        this.f8117d = i;
    }

    /* renamed from: a */
    private final void m10918a(int i, int i2) {
        int i3;
        mo9247a();
        if (i < 0 || i > (i3 = this.f8117d)) {
            throw new IndexOutOfBoundsException(m10920f(i));
        }
        int[] iArr = this.f8116c;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        } else {
            int[] iArr2 = new int[(((i3 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f8116c, i, iArr2, i + 1, this.f8117d - i);
            this.f8116c = iArr2;
        }
        this.f8116c[i] = i2;
        this.f8117d++;
        this.modCount++;
    }

    /* renamed from: e */
    private final void m10919e(int i) {
        if (i < 0 || i >= this.f8117d) {
            throw new IndexOutOfBoundsException(m10920f(i));
        }
    }

    /* renamed from: f */
    private final String m10920f(int i) {
        int i2 = this.f8117d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final /* synthetic */ C2728Tm mo8232a(int i) {
        if (i >= this.f8117d) {
            return new C2613Pm(Arrays.copyOf(this.f8116c, i), this.f8117d);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m10918a(i, ((Integer) obj).intValue());
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        mo9247a();
        C2641Qm.m10987a(collection);
        if (!(collection instanceof C2613Pm)) {
            return super.addAll(collection);
        }
        C2613Pm pm = (C2613Pm) collection;
        int i = pm.f8117d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f8117d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f8116c;
            if (i3 > iArr.length) {
                this.f8116c = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(pm.f8116c, 0, this.f8116c, this.f8117d, pm.f8117d);
            this.f8117d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final int mo8688c(int i) {
        m10919e(i);
        return this.f8116c[i];
    }

    /* renamed from: d */
    public final void mo8689d(int i) {
        m10918a(this.f8117d, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2613Pm)) {
            return super.equals(obj);
        }
        C2613Pm pm = (C2613Pm) obj;
        if (this.f8117d != pm.f8117d) {
            return false;
        }
        int[] iArr = pm.f8116c;
        for (int i = 0; i < this.f8117d; i++) {
            if (this.f8116c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(mo8688c(i));
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f8117d; i2++) {
            i = (i * 31) + this.f8116c[i2];
        }
        return i;
    }

    public final /* synthetic */ Object remove(int i) {
        mo9247a();
        m10919e(i);
        int[] iArr = this.f8116c;
        int i2 = iArr[i];
        int i3 = this.f8117d;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, i3 - i);
        }
        this.f8117d--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final boolean remove(Object obj) {
        mo9247a();
        for (int i = 0; i < this.f8117d; i++) {
            if (obj.equals(Integer.valueOf(this.f8116c[i]))) {
                int[] iArr = this.f8116c;
                System.arraycopy(iArr, i + 1, iArr, i, this.f8117d - i);
                this.f8117d--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo9247a();
        if (i2 >= i) {
            int[] iArr = this.f8116c;
            System.arraycopy(iArr, i2, iArr, i, this.f8117d - i2);
            this.f8117d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo9247a();
        m10919e(i);
        int[] iArr = this.f8116c;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f8117d;
    }
}
