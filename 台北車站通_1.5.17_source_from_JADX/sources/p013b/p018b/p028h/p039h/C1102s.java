package p013b.p018b.p028h.p039h;

/* renamed from: b.b.h.h.s */
public class C1102s<E> implements Cloneable {

    /* renamed from: a */
    private static final Object f4090a = new Object();

    /* renamed from: b */
    private boolean f4091b;

    /* renamed from: c */
    private int[] f4092c;

    /* renamed from: d */
    private Object[] f4093d;

    /* renamed from: e */
    private int f4094e;

    public C1102s() {
        this(10);
    }

    public C1102s(int i) {
        Object[] objArr;
        this.f4091b = false;
        if (i == 0) {
            this.f4092c = C1084f.f4045a;
            objArr = C1084f.f4047c;
        } else {
            int b = C1084f.m5637b(i);
            this.f4092c = new int[b];
            objArr = new Object[b];
        }
        this.f4093d = objArr;
        this.f4094e = 0;
    }

    /* renamed from: f */
    private void m5701f() {
        int i = this.f4094e;
        int[] iArr = this.f4092c;
        Object[] objArr = this.f4093d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f4090a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f4091b = false;
        this.f4094e = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r3.f4093d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5250a(int r4) {
        /*
            r3 = this;
            int[] r0 = r3.f4092c
            int r1 = r3.f4094e
            int r4 = p013b.p018b.p028h.p039h.C1084f.m5634a((int[]) r0, (int) r1, (int) r4)
            if (r4 < 0) goto L_0x0017
            java.lang.Object[] r0 = r3.f4093d
            r1 = r0[r4]
            java.lang.Object r2 = f4090a
            if (r1 == r2) goto L_0x0017
            r0[r4] = r2
            r4 = 1
            r3.f4091b = r4
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p018b.p028h.p039h.C1102s.mo5250a(int):void");
    }

    /* renamed from: a */
    public void mo5251a(int i, E e) {
        int i2 = this.f4094e;
        if (i2 == 0 || i > this.f4092c[i2 - 1]) {
            if (this.f4091b && this.f4094e >= this.f4092c.length) {
                m5701f();
            }
            int i3 = this.f4094e;
            if (i3 >= this.f4092c.length) {
                int b = C1084f.m5637b(i3 + 1);
                int[] iArr = new int[b];
                Object[] objArr = new Object[b];
                int[] iArr2 = this.f4092c;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f4093d;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f4092c = iArr;
                this.f4093d = objArr;
            }
            this.f4092c[i3] = i;
            this.f4093d[i3] = e;
            this.f4094e = i3 + 1;
            return;
        }
        mo5255c(i, e);
    }

    /* renamed from: b */
    public E mo5252b(int i) {
        return mo5253b(i, (Object) null);
    }

    /* renamed from: b */
    public E mo5253b(int i, E e) {
        int a = C1084f.m5634a(this.f4092c, this.f4094e, i);
        if (a >= 0) {
            E[] eArr = this.f4093d;
            if (eArr[a] != f4090a) {
                return eArr[a];
            }
        }
        return e;
    }

    /* renamed from: c */
    public int mo5254c(int i) {
        if (this.f4091b) {
            m5701f();
        }
        return C1084f.m5634a(this.f4092c, this.f4094e, i);
    }

    /* renamed from: c */
    public void mo5255c(int i, E e) {
        int a = C1084f.m5634a(this.f4092c, this.f4094e, i);
        if (a >= 0) {
            this.f4093d[a] = e;
            return;
        }
        int i2 = ~a;
        if (i2 < this.f4094e) {
            Object[] objArr = this.f4093d;
            if (objArr[i2] == f4090a) {
                this.f4092c[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f4091b && this.f4094e >= this.f4092c.length) {
            m5701f();
            i2 = ~C1084f.m5634a(this.f4092c, this.f4094e, i);
        }
        int i3 = this.f4094e;
        if (i3 >= this.f4092c.length) {
            int b = C1084f.m5637b(i3 + 1);
            int[] iArr = new int[b];
            Object[] objArr2 = new Object[b];
            int[] iArr2 = this.f4092c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f4093d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f4092c = iArr;
            this.f4093d = objArr2;
        }
        int i4 = this.f4094e;
        if (i4 - i2 != 0) {
            int[] iArr3 = this.f4092c;
            int i5 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i5, i4 - i2);
            Object[] objArr4 = this.f4093d;
            System.arraycopy(objArr4, i2, objArr4, i5, this.f4094e - i2);
        }
        this.f4092c[i2] = i;
        this.f4093d[i2] = e;
        this.f4094e++;
    }

    public C1102s<E> clone() {
        try {
            C1102s<E> sVar = (C1102s) super.clone();
            try {
                sVar.f4092c = (int[]) this.f4092c.clone();
                sVar.f4093d = (Object[]) this.f4093d.clone();
                return sVar;
            } catch (CloneNotSupportedException unused) {
                return sVar;
            }
        } catch (CloneNotSupportedException unused2) {
            return null;
        }
    }

    /* renamed from: d */
    public int mo5257d(int i) {
        if (this.f4091b) {
            m5701f();
        }
        return this.f4092c[i];
    }

    /* renamed from: d */
    public void mo5258d() {
        int i = this.f4094e;
        Object[] objArr = this.f4093d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f4094e = 0;
        this.f4091b = false;
    }

    /* renamed from: e */
    public int mo5259e() {
        if (this.f4091b) {
            m5701f();
        }
        return this.f4094e;
    }

    /* renamed from: e */
    public void mo5260e(int i) {
        mo5250a(i);
    }

    /* renamed from: f */
    public E mo5261f(int i) {
        if (this.f4091b) {
            m5701f();
        }
        return this.f4093d[i];
    }

    public String toString() {
        if (mo5259e() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4094e * 28);
        sb.append('{');
        for (int i = 0; i < this.f4094e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo5257d(i));
            sb.append('=');
            Object f = mo5261f(i);
            if (f != this) {
                sb.append(f);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
