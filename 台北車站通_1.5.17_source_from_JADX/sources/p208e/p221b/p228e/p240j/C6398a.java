package p208e.p221b.p228e.p240j;

import p208e.p221b.C6438q;

/* renamed from: e.b.e.j.a */
public class C6398a<T> {

    /* renamed from: a */
    final int f17759a;

    /* renamed from: b */
    final Object[] f17760b;

    /* renamed from: c */
    Object[] f17761c = this.f17760b;

    /* renamed from: d */
    int f17762d;

    public C6398a(int i) {
        this.f17759a = i;
        this.f17760b = new Object[(i + 1)];
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo16497a(T r4) {
        /*
            r3 = this;
            int r0 = r3.f17759a
            int r1 = r3.f17762d
            if (r1 != r0) goto L_0x0011
            int r1 = r0 + 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object[] r2 = r3.f17761c
            r2[r0] = r1
            r3.f17761c = r1
            r1 = 0
        L_0x0011:
            java.lang.Object[] r0 = r3.f17761c
            r0[r1] = r4
            int r1 = r1 + 1
            r3.f17762d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p208e.p221b.p228e.p240j.C6398a.mo16497a(java.lang.Object):void");
    }

    /* renamed from: a */
    public <U> boolean mo16498a(C6438q<? super U> qVar) {
        Object[] objArr = this.f17760b;
        int i = this.f17759a;
        while (true) {
            int i2 = 0;
            if (objArr == null) {
                return false;
            }
            while (i2 < i) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    continue;
                    break;
                } else if (C6407i.m23954a(objArr2, qVar)) {
                    return true;
                } else {
                    i2++;
                }
            }
            objArr = objArr[i];
        }
    }

    /* renamed from: b */
    public void mo16499b(T t) {
        this.f17760b[0] = t;
    }
}
