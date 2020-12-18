package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.Mm */
final class C2520Mm extends C2979bm<Float> implements C2728Tm<Float>, RandomAccess {

    /* renamed from: b */
    private static final C2520Mm f7587b;

    /* renamed from: c */
    private float[] f7588c;

    /* renamed from: d */
    private int f7589d;

    static {
        C2520Mm mm = new C2520Mm();
        f7587b = mm;
        mm.mo8903k();
    }

    C2520Mm() {
        this(new float[10], 0);
    }

    private C2520Mm(float[] fArr, int i) {
        this.f7588c = fArr;
        this.f7589d = i;
    }

    /* renamed from: a */
    private final void m10602a(int i, float f) {
        int i2;
        mo9247a();
        if (i < 0 || i > (i2 = this.f7589d)) {
            throw new IndexOutOfBoundsException(m10604d(i));
        }
        float[] fArr = this.f7588c;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f7588c, i, fArr2, i + 1, this.f7589d - i);
            this.f7588c = fArr2;
        }
        this.f7588c[i] = f;
        this.f7589d++;
        this.modCount++;
    }

    /* renamed from: c */
    private final void m10603c(int i) {
        if (i < 0 || i >= this.f7589d) {
            throw new IndexOutOfBoundsException(m10604d(i));
        }
    }

    /* renamed from: d */
    private final String m10604d(int i) {
        int i2 = this.f7589d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final /* synthetic */ C2728Tm mo8232a(int i) {
        if (i >= this.f7589d) {
            return new C2520Mm(Arrays.copyOf(this.f7588c, i), this.f7589d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public final void mo8536a(float f) {
        m10602a(this.f7589d, f);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m10602a(i, ((Float) obj).floatValue());
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        mo9247a();
        C2641Qm.m10987a(collection);
        if (!(collection instanceof C2520Mm)) {
            return super.addAll(collection);
        }
        C2520Mm mm = (C2520Mm) collection;
        int i = mm.f7589d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f7589d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f7588c;
            if (i3 > fArr.length) {
                this.f7588c = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(mm.f7588c, 0, this.f7588c, this.f7589d, mm.f7589d);
            this.f7589d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2520Mm)) {
            return super.equals(obj);
        }
        C2520Mm mm = (C2520Mm) obj;
        if (this.f7589d != mm.f7589d) {
            return false;
        }
        float[] fArr = mm.f7588c;
        for (int i = 0; i < this.f7589d; i++) {
            if (this.f7588c[i] != fArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m10603c(i);
        return Float.valueOf(this.f7588c[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f7589d; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f7588c[i2]);
        }
        return i;
    }

    public final /* synthetic */ Object remove(int i) {
        mo9247a();
        m10603c(i);
        float[] fArr = this.f7588c;
        float f = fArr[i];
        int i2 = this.f7589d;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, i2 - i);
        }
        this.f7589d--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public final boolean remove(Object obj) {
        mo9247a();
        for (int i = 0; i < this.f7589d; i++) {
            if (obj.equals(Float.valueOf(this.f7588c[i]))) {
                float[] fArr = this.f7588c;
                System.arraycopy(fArr, i + 1, fArr, i, this.f7589d - i);
                this.f7589d--;
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
            float[] fArr = this.f7588c;
            System.arraycopy(fArr, i2, fArr, i, this.f7589d - i2);
            this.f7589d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo9247a();
        m10603c(i);
        float[] fArr = this.f7588c;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f7589d;
    }
}
