package p101d.p129g.p146c.p148b;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import p101d.p129g.p146c.p147a.C5571a;

/* renamed from: d.g.c.b.a */
public final class C5572a {

    /* renamed from: d.g.c.b.a$a */
    private static class C5573a extends AbstractList<Integer> implements RandomAccess, Serializable {

        /* renamed from: a */
        final int[] f15533a;

        /* renamed from: b */
        final int f15534b;

        /* renamed from: c */
        final int f15535c;

        C5573a(int[] iArr, int i, int i2) {
            this.f15533a = iArr;
            this.f15534b = i;
            this.f15535c = i2;
        }

        /* renamed from: a */
        public Integer set(int i, Integer num) {
            C5571a.m21184a(i, size());
            int[] iArr = this.f15533a;
            int i2 = this.f15534b;
            int i3 = iArr[i2 + i];
            C5571a.m21186a(num);
            iArr[i2 + i] = num.intValue();
            return Integer.valueOf(i3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int[] mo15051a() {
            return Arrays.copyOfRange(this.f15533a, this.f15534b, this.f15535c);
        }

        public boolean contains(Object obj) {
            return (obj instanceof Integer) && C5572a.m21196c(this.f15533a, ((Integer) obj).intValue(), this.f15534b, this.f15535c) != -1;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C5573a)) {
                return super.equals(obj);
            }
            C5573a aVar = (C5573a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.f15533a[this.f15534b + i] != aVar.f15533a[aVar.f15534b + i]) {
                    return false;
                }
            }
            return true;
        }

        public Integer get(int i) {
            C5571a.m21184a(i, size());
            return Integer.valueOf(this.f15533a[this.f15534b + i]);
        }

        public int hashCode() {
            int i = 1;
            for (int i2 = this.f15534b; i2 < this.f15535c; i2++) {
                int i3 = this.f15533a[i2];
                C5572a.m21192a(i3);
                i = (i * 31) + i3;
            }
            return i;
        }

        public int indexOf(Object obj) {
            int a;
            if (!(obj instanceof Integer) || (a = C5572a.m21196c(this.f15533a, ((Integer) obj).intValue(), this.f15534b, this.f15535c)) < 0) {
                return -1;
            }
            return a - this.f15534b;
        }

        public boolean isEmpty() {
            return false;
        }

        public int lastIndexOf(Object obj) {
            int b;
            if (!(obj instanceof Integer) || (b = C5572a.m21197d(this.f15533a, ((Integer) obj).intValue(), this.f15534b, this.f15535c)) < 0) {
                return -1;
            }
            return b - this.f15534b;
        }

        public int size() {
            return this.f15535c - this.f15534b;
        }

        public List<Integer> subList(int i, int i2) {
            C5571a.m21188a(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            int[] iArr = this.f15533a;
            int i3 = this.f15534b;
            return new C5573a(iArr, i + i3, i3 + i2);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
            sb.append('[');
            sb.append(this.f15533a[this.f15534b]);
            int i = this.f15534b;
            while (true) {
                i++;
                if (i < this.f15535c) {
                    sb.append(", ");
                    sb.append(this.f15533a[i]);
                } else {
                    sb.append(']');
                    return sb.toString();
                }
            }
        }
    }

    /* renamed from: a */
    public static int m21192a(int i) {
        return i;
    }

    /* renamed from: a */
    public static int[] m21194a(Collection<? extends Number> collection) {
        if (collection instanceof C5573a) {
            return ((C5573a) collection).mo15051a();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            C5571a.m21186a(obj);
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static int m21196c(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static int m21197d(int[] iArr, int i, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            if (iArr[i4] == i) {
                return i4;
            }
        }
        return -1;
    }
}
