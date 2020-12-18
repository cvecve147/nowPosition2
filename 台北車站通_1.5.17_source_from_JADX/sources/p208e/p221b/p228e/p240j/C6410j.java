package p208e.p221b.p228e.p240j;

/* renamed from: e.b.e.j.j */
public final class C6410j<T> {

    /* renamed from: a */
    final float f17774a;

    /* renamed from: b */
    int f17775b;

    /* renamed from: c */
    int f17776c;

    /* renamed from: d */
    int f17777d;

    /* renamed from: e */
    T[] f17778e;

    public C6410j() {
        this(16, 0.75f);
    }

    public C6410j(int i, float f) {
        this.f17774a = f;
        int a = C6411k.m23961a(i);
        this.f17775b = a - 1;
        this.f17777d = (int) (f * ((float) a));
        this.f17778e = new Object[a];
    }

    /* renamed from: a */
    static int m23955a(int i) {
        int i2 = i * -1640531527;
        return i2 ^ (i2 >>> 16);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo16509a(int i, T[] tArr, int i2) {
        int i3;
        T t;
        this.f17776c--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                t = tArr[i3];
                if (t == null) {
                    tArr[i] = null;
                    return true;
                }
                int a = m23955a(t.hashCode()) & i2;
                if (i <= i3) {
                    if (i >= a || a > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                } else {
                    if (i >= a && a > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                }
            }
            tArr[i] = t;
            i = i3;
        }
    }

    /* renamed from: a */
    public boolean mo16510a(T t) {
        T t2;
        T[] tArr = this.f17778e;
        int i = this.f17775b;
        int a = m23955a(t.hashCode()) & i;
        T t3 = tArr[a];
        if (t3 != null) {
            if (t3.equals(t)) {
                return false;
            }
            do {
                a = (a + 1) & i;
                t2 = tArr[a];
                if (t2 == null) {
                }
            } while (!t2.equals(t));
            return false;
        }
        tArr[a] = t;
        int i2 = this.f17776c + 1;
        this.f17776c = i2;
        if (i2 >= this.f17777d) {
            mo16512b();
        }
        return true;
    }

    /* renamed from: a */
    public Object[] mo16511a() {
        return this.f17778e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo16512b() {
        T[] tArr = this.f17778e;
        int length = tArr.length;
        int i = length << 1;
        int i2 = i - 1;
        T[] tArr2 = new Object[i];
        int i3 = this.f17776c;
        while (true) {
            int i4 = i3 - 1;
            if (i3 != 0) {
                do {
                    length--;
                } while (tArr[length] == null);
                int a = m23955a(tArr[length].hashCode()) & i2;
                if (tArr2[a] != null) {
                    do {
                        a = (a + 1) & i2;
                    } while (tArr2[a] != null);
                }
                tArr2[a] = tArr[length];
                i3 = i4;
            } else {
                this.f17775b = i2;
                this.f17777d = (int) (((float) i) * this.f17774a);
                this.f17778e = tArr2;
                return;
            }
        }
    }

    /* renamed from: b */
    public boolean mo16513b(T t) {
        T t2;
        T[] tArr = this.f17778e;
        int i = this.f17775b;
        int a = m23955a(t.hashCode()) & i;
        T t3 = tArr[a];
        if (t3 == null) {
            return false;
        }
        if (t3.equals(t)) {
            return mo16509a(a, tArr, i);
        }
        do {
            a = (a + 1) & i;
            t2 = tArr[a];
            if (t2 == null) {
                return false;
            }
        } while (!t2.equals(t));
        return mo16509a(a, tArr, i);
    }
}
