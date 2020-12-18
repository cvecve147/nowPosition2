package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.in */
final class C3179in extends C2979bm<Long> implements C2728Tm<Long>, RandomAccess {

    /* renamed from: b */
    private static final C3179in f9499b;

    /* renamed from: c */
    private long[] f9500c;

    /* renamed from: d */
    private int f9501d;

    static {
        C3179in inVar = new C3179in();
        f9499b = inVar;
        inVar.mo8903k();
    }

    C3179in() {
        this(new long[10], 0);
    }

    private C3179in(long[] jArr, int i) {
        this.f9500c = jArr;
        this.f9501d = i;
    }

    /* renamed from: a */
    private final void m12633a(int i, long j) {
        int i2;
        mo9247a();
        if (i < 0 || i > (i2 = this.f9501d)) {
            throw new IndexOutOfBoundsException(m12635e(i));
        }
        long[] jArr = this.f9500c;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f9500c, i, jArr2, i + 1, this.f9501d - i);
            this.f9500c = jArr2;
        }
        this.f9500c[i] = j;
        this.f9501d++;
        this.modCount++;
    }

    /* renamed from: d */
    private final void m12634d(int i) {
        if (i < 0 || i >= this.f9501d) {
            throw new IndexOutOfBoundsException(m12635e(i));
        }
    }

    /* renamed from: e */
    private final String m12635e(int i) {
        int i2 = this.f9501d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final /* synthetic */ C2728Tm mo8232a(int i) {
        if (i >= this.f9501d) {
            return new C3179in(Arrays.copyOf(this.f9500c, i), this.f9501d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public final void mo9555a(long j) {
        m12633a(this.f9501d, j);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m12633a(i, ((Long) obj).longValue());
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        mo9247a();
        C2641Qm.m10987a(collection);
        if (!(collection instanceof C3179in)) {
            return super.addAll(collection);
        }
        C3179in inVar = (C3179in) collection;
        int i = inVar.f9501d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f9501d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f9500c;
            if (i3 > jArr.length) {
                this.f9500c = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(inVar.f9500c, 0, this.f9500c, this.f9501d, inVar.f9501d);
            this.f9501d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final long mo9557c(int i) {
        m12634d(i);
        return this.f9500c[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3179in)) {
            return super.equals(obj);
        }
        C3179in inVar = (C3179in) obj;
        if (this.f9501d != inVar.f9501d) {
            return false;
        }
        long[] jArr = inVar.f9500c;
        for (int i = 0; i < this.f9501d; i++) {
            if (this.f9500c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(mo9557c(i));
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f9501d; i2++) {
            i = (i * 31) + C2641Qm.m10984a(this.f9500c[i2]);
        }
        return i;
    }

    public final /* synthetic */ Object remove(int i) {
        mo9247a();
        m12634d(i);
        long[] jArr = this.f9500c;
        long j = jArr[i];
        int i2 = this.f9501d;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, i2 - i);
        }
        this.f9501d--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final boolean remove(Object obj) {
        mo9247a();
        for (int i = 0; i < this.f9501d; i++) {
            if (obj.equals(Long.valueOf(this.f9500c[i]))) {
                long[] jArr = this.f9500c;
                System.arraycopy(jArr, i + 1, jArr, i, this.f9501d - i);
                this.f9501d--;
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
            long[] jArr = this.f9500c;
            System.arraycopy(jArr, i2, jArr, i, this.f9501d - i2);
            this.f9501d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo9247a();
        m12634d(i);
        long[] jArr = this.f9500c;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f9501d;
    }
}
