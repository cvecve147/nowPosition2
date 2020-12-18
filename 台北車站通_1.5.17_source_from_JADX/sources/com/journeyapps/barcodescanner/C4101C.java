package com.journeyapps.barcodescanner;

/* renamed from: com.journeyapps.barcodescanner.C */
public class C4101C implements Comparable<C4101C> {

    /* renamed from: a */
    public final int f12161a;

    /* renamed from: b */
    public final int f12162b;

    public C4101C(int i, int i2) {
        this.f12161a = i;
        this.f12162b = i2;
    }

    /* renamed from: a */
    public int compareTo(C4101C c) {
        int i = this.f12162b * this.f12161a;
        int i2 = c.f12162b * c.f12161a;
        if (i2 < i) {
            return 1;
        }
        return i2 > i ? -1 : 0;
    }

    /* renamed from: a */
    public C4101C mo11563a() {
        return new C4101C(this.f12162b, this.f12161a);
    }

    /* renamed from: b */
    public C4101C mo11564b(C4101C c) {
        int i = this.f12161a;
        int i2 = c.f12162b;
        int i3 = i * i2;
        int i4 = c.f12161a;
        int i5 = this.f12162b;
        return i3 <= i4 * i5 ? new C4101C(i4, (i5 * i4) / i) : new C4101C((i * i2) / i5, i2);
    }

    /* renamed from: c */
    public C4101C mo11565c(C4101C c) {
        int i = this.f12161a;
        int i2 = c.f12162b;
        int i3 = i * i2;
        int i4 = c.f12161a;
        int i5 = this.f12162b;
        return i3 >= i4 * i5 ? new C4101C(i4, (i5 * i4) / i) : new C4101C((i * i2) / i5, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4101C.class != obj.getClass()) {
            return false;
        }
        C4101C c = (C4101C) obj;
        return this.f12161a == c.f12161a && this.f12162b == c.f12162b;
    }

    public int hashCode() {
        return (this.f12161a * 31) + this.f12162b;
    }

    public String toString() {
        return this.f12161a + "x" + this.f12162b;
    }
}
