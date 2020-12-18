package p013b.p018b.p028h.p039h;

/* renamed from: b.b.h.h.i */
public class C1087i<E> implements Cloneable {

    /* renamed from: a */
    private static final Object f4050a = new Object();

    /* renamed from: b */
    private boolean f4051b;

    /* renamed from: c */
    private long[] f4052c;

    /* renamed from: d */
    private Object[] f4053d;

    /* renamed from: e */
    private int f4054e;

    public C1087i() {
        this(10);
    }

    public C1087i(int i) {
        Object[] objArr;
        this.f4051b = false;
        if (i == 0) {
            this.f4052c = C1084f.f4046b;
            objArr = C1084f.f4047c;
        } else {
            int c = C1084f.m5638c(i);
            this.f4052c = new long[c];
            objArr = new Object[c];
        }
        this.f4053d = objArr;
        this.f4054e = 0;
    }

    /* renamed from: f */
    private void m5641f() {
        int i = this.f4054e;
        long[] jArr = this.f4052c;
        Object[] objArr = this.f4053d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f4050a) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f4051b = false;
        this.f4054e = i2;
    }

    /* renamed from: a */
    public long mo5144a(int i) {
        if (this.f4051b) {
            m5641f();
        }
        return this.f4052c[i];
    }

    /* renamed from: a */
    public E mo5145a(long j, E e) {
        int a = C1084f.m5635a(this.f4052c, this.f4054e, j);
        if (a >= 0) {
            E[] eArr = this.f4053d;
            if (eArr[a] != f4050a) {
                return eArr[a];
            }
        }
        return e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r4 = r2.f4053d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5146a(long r3) {
        /*
            r2 = this;
            long[] r0 = r2.f4052c
            int r1 = r2.f4054e
            int r3 = p013b.p018b.p028h.p039h.C1084f.m5635a((long[]) r0, (int) r1, (long) r3)
            if (r3 < 0) goto L_0x0017
            java.lang.Object[] r4 = r2.f4053d
            r0 = r4[r3]
            java.lang.Object r1 = f4050a
            if (r0 == r1) goto L_0x0017
            r4[r3] = r1
            r3 = 1
            r2.f4051b = r3
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p018b.p028h.p039h.C1087i.mo5146a(long):void");
    }

    /* renamed from: b */
    public E mo5147b(long j) {
        return mo5145a(j, (Object) null);
    }

    /* renamed from: b */
    public void mo5148b(int i) {
        Object[] objArr = this.f4053d;
        Object obj = objArr[i];
        Object obj2 = f4050a;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f4051b = true;
        }
    }

    /* renamed from: b */
    public void mo5149b(long j, E e) {
        int a = C1084f.m5635a(this.f4052c, this.f4054e, j);
        if (a >= 0) {
            this.f4053d[a] = e;
            return;
        }
        int i = ~a;
        if (i < this.f4054e) {
            Object[] objArr = this.f4053d;
            if (objArr[i] == f4050a) {
                this.f4052c[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.f4051b && this.f4054e >= this.f4052c.length) {
            m5641f();
            i = ~C1084f.m5635a(this.f4052c, this.f4054e, j);
        }
        int i2 = this.f4054e;
        if (i2 >= this.f4052c.length) {
            int c = C1084f.m5638c(i2 + 1);
            long[] jArr = new long[c];
            Object[] objArr2 = new Object[c];
            long[] jArr2 = this.f4052c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f4053d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f4052c = jArr;
            this.f4053d = objArr2;
        }
        int i3 = this.f4054e;
        if (i3 - i != 0) {
            long[] jArr3 = this.f4052c;
            int i4 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i4, i3 - i);
            Object[] objArr4 = this.f4053d;
            System.arraycopy(objArr4, i, objArr4, i4, this.f4054e - i);
        }
        this.f4052c[i] = j;
        this.f4053d[i] = e;
        this.f4054e++;
    }

    /* renamed from: c */
    public int mo5150c(long j) {
        if (this.f4051b) {
            m5641f();
        }
        return C1084f.m5635a(this.f4052c, this.f4054e, j);
    }

    /* renamed from: c */
    public E mo5151c(int i) {
        if (this.f4051b) {
            m5641f();
        }
        return this.f4053d[i];
    }

    public C1087i<E> clone() {
        try {
            C1087i<E> iVar = (C1087i) super.clone();
            try {
                iVar.f4052c = (long[]) this.f4052c.clone();
                iVar.f4053d = (Object[]) this.f4053d.clone();
                return iVar;
            } catch (CloneNotSupportedException unused) {
                return iVar;
            }
        } catch (CloneNotSupportedException unused2) {
            return null;
        }
    }

    /* renamed from: d */
    public void mo5153d() {
        int i = this.f4054e;
        Object[] objArr = this.f4053d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f4054e = 0;
        this.f4051b = false;
    }

    /* renamed from: e */
    public int mo5154e() {
        if (this.f4051b) {
            m5641f();
        }
        return this.f4054e;
    }

    public String toString() {
        if (mo5154e() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4054e * 28);
        sb.append('{');
        for (int i = 0; i < this.f4054e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo5144a(i));
            sb.append('=');
            Object c = mo5151c(i);
            if (c != this) {
                sb.append(c);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
