package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.fm */
final class C3094fm extends C2979bm<Boolean> implements C2728Tm<Boolean>, RandomAccess {

    /* renamed from: b */
    private static final C3094fm f9145b;

    /* renamed from: c */
    private boolean[] f9146c;

    /* renamed from: d */
    private int f9147d;

    static {
        C3094fm fmVar = new C3094fm();
        f9145b = fmVar;
        fmVar.mo8903k();
    }

    C3094fm() {
        this(new boolean[10], 0);
    }

    private C3094fm(boolean[] zArr, int i) {
        this.f9146c = zArr;
        this.f9147d = i;
    }

    /* renamed from: a */
    private final void m12343a(int i, boolean z) {
        int i2;
        mo9247a();
        if (i < 0 || i > (i2 = this.f9147d)) {
            throw new IndexOutOfBoundsException(m12345d(i));
        }
        boolean[] zArr = this.f9146c;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f9146c, i, zArr2, i + 1, this.f9147d - i);
            this.f9146c = zArr2;
        }
        this.f9146c[i] = z;
        this.f9147d++;
        this.modCount++;
    }

    /* renamed from: c */
    private final void m12344c(int i) {
        if (i < 0 || i >= this.f9147d) {
            throw new IndexOutOfBoundsException(m12345d(i));
        }
    }

    /* renamed from: d */
    private final String m12345d(int i) {
        int i2 = this.f9147d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final /* synthetic */ C2728Tm mo8232a(int i) {
        if (i >= this.f9147d) {
            return new C3094fm(Arrays.copyOf(this.f9146c, i), this.f9147d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public final void mo9429a(boolean z) {
        m12343a(this.f9147d, z);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m12343a(i, ((Boolean) obj).booleanValue());
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        mo9247a();
        C2641Qm.m10987a(collection);
        if (!(collection instanceof C3094fm)) {
            return super.addAll(collection);
        }
        C3094fm fmVar = (C3094fm) collection;
        int i = fmVar.f9147d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f9147d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f9146c;
            if (i3 > zArr.length) {
                this.f9146c = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(fmVar.f9146c, 0, this.f9146c, this.f9147d, fmVar.f9147d);
            this.f9147d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3094fm)) {
            return super.equals(obj);
        }
        C3094fm fmVar = (C3094fm) obj;
        if (this.f9147d != fmVar.f9147d) {
            return false;
        }
        boolean[] zArr = fmVar.f9146c;
        for (int i = 0; i < this.f9147d; i++) {
            if (this.f9146c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m12344c(i);
        return Boolean.valueOf(this.f9146c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f9147d; i2++) {
            i = (i * 31) + C2641Qm.m10985a(this.f9146c[i2]);
        }
        return i;
    }

    public final /* synthetic */ Object remove(int i) {
        mo9247a();
        m12344c(i);
        boolean[] zArr = this.f9146c;
        boolean z = zArr[i];
        int i2 = this.f9147d;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, i2 - i);
        }
        this.f9147d--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final boolean remove(Object obj) {
        mo9247a();
        for (int i = 0; i < this.f9147d; i++) {
            if (obj.equals(Boolean.valueOf(this.f9146c[i]))) {
                boolean[] zArr = this.f9146c;
                System.arraycopy(zArr, i + 1, zArr, i, this.f9147d - i);
                this.f9147d--;
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
            boolean[] zArr = this.f9146c;
            System.arraycopy(zArr, i2, zArr, i, this.f9147d - i2);
            this.f9147d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo9247a();
        m12344c(i);
        boolean[] zArr = this.f9146c;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f9147d;
    }
}
