package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.xm */
final class C3611xm extends C2979bm<Double> implements C2728Tm<Double>, RandomAccess {

    /* renamed from: b */
    private static final C3611xm f10514b;

    /* renamed from: c */
    private double[] f10515c;

    /* renamed from: d */
    private int f10516d;

    static {
        C3611xm xmVar = new C3611xm();
        f10514b = xmVar;
        xmVar.mo8903k();
    }

    C3611xm() {
        this(new double[10], 0);
    }

    private C3611xm(double[] dArr, int i) {
        this.f10515c = dArr;
        this.f10516d = i;
    }

    /* renamed from: a */
    private final void m14430a(int i, double d) {
        int i2;
        mo9247a();
        if (i < 0 || i > (i2 = this.f10516d)) {
            throw new IndexOutOfBoundsException(m14432d(i));
        }
        double[] dArr = this.f10515c;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f10515c, i, dArr2, i + 1, this.f10516d - i);
            this.f10515c = dArr2;
        }
        this.f10515c[i] = d;
        this.f10516d++;
        this.modCount++;
    }

    /* renamed from: c */
    private final void m14431c(int i) {
        if (i < 0 || i >= this.f10516d) {
            throw new IndexOutOfBoundsException(m14432d(i));
        }
    }

    /* renamed from: d */
    private final String m14432d(int i) {
        int i2 = this.f10516d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final /* synthetic */ C2728Tm mo8232a(int i) {
        if (i >= this.f10516d) {
            return new C3611xm(Arrays.copyOf(this.f10515c, i), this.f10516d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public final void mo10211a(double d) {
        m14430a(this.f10516d, d);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m14430a(i, ((Double) obj).doubleValue());
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        mo9247a();
        C2641Qm.m10987a(collection);
        if (!(collection instanceof C3611xm)) {
            return super.addAll(collection);
        }
        C3611xm xmVar = (C3611xm) collection;
        int i = xmVar.f10516d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f10516d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f10515c;
            if (i3 > dArr.length) {
                this.f10515c = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(xmVar.f10515c, 0, this.f10515c, this.f10516d, xmVar.f10516d);
            this.f10516d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3611xm)) {
            return super.equals(obj);
        }
        C3611xm xmVar = (C3611xm) obj;
        if (this.f10516d != xmVar.f10516d) {
            return false;
        }
        double[] dArr = xmVar.f10515c;
        for (int i = 0; i < this.f10516d; i++) {
            if (this.f10515c[i] != dArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m14431c(i);
        return Double.valueOf(this.f10515c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f10516d; i2++) {
            i = (i * 31) + C2641Qm.m10984a(Double.doubleToLongBits(this.f10515c[i2]));
        }
        return i;
    }

    public final /* synthetic */ Object remove(int i) {
        mo9247a();
        m14431c(i);
        double[] dArr = this.f10515c;
        double d = dArr[i];
        int i2 = this.f10516d;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, i2 - i);
        }
        this.f10516d--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final boolean remove(Object obj) {
        mo9247a();
        for (int i = 0; i < this.f10516d; i++) {
            if (obj.equals(Double.valueOf(this.f10515c[i]))) {
                double[] dArr = this.f10515c;
                System.arraycopy(dArr, i + 1, dArr, i, this.f10516d - i);
                this.f10516d--;
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
            double[] dArr = this.f10515c;
            System.arraycopy(dArr, i2, dArr, i, this.f10516d - i2);
            this.f10516d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo9247a();
        m14431c(i);
        double[] dArr = this.f10515c;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f10516d;
    }
}
