package android.support.p011v7.widget;

import android.support.p011v7.widget.C0844j;
import java.util.List;

/* renamed from: android.support.v7.widget.xa */
class C0910xa {

    /* renamed from: a */
    final C0911a f3712a;

    /* renamed from: android.support.v7.widget.xa$a */
    interface C0911a {
        /* renamed from: a */
        C0844j.C0846b mo4523a(int i, int i2, int i3, Object obj);

        /* renamed from: a */
        void mo4525a(C0844j.C0846b bVar);
    }

    C0910xa(C0911a aVar) {
        this.f3712a = aVar;
    }

    /* renamed from: a */
    private void m5161a(List<C0844j.C0846b> list, int i, int i2) {
        C0844j.C0846b bVar = list.get(i);
        C0844j.C0846b bVar2 = list.get(i2);
        int i3 = bVar2.f3464a;
        if (i3 == 1) {
            m5163c(list, i, bVar, i2, bVar2);
        } else if (i3 == 2) {
            mo4783a(list, i, bVar, i2, bVar2);
        } else if (i3 == 4) {
            mo4784b(list, i, bVar, i2, bVar2);
        }
    }

    /* renamed from: b */
    private int m5162b(List<C0844j.C0846b> list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).f3464a != 8) {
                z = true;
            } else if (z) {
                return size;
            }
        }
        return -1;
    }

    /* renamed from: c */
    private void m5163c(List<C0844j.C0846b> list, int i, C0844j.C0846b bVar, int i2, C0844j.C0846b bVar2) {
        int i3 = bVar.f3467d < bVar2.f3465b ? -1 : 0;
        if (bVar.f3465b < bVar2.f3465b) {
            i3++;
        }
        int i4 = bVar2.f3465b;
        int i5 = bVar.f3465b;
        if (i4 <= i5) {
            bVar.f3465b = i5 + bVar2.f3467d;
        }
        int i6 = bVar2.f3465b;
        int i7 = bVar.f3467d;
        if (i6 <= i7) {
            bVar.f3467d = i7 + bVar2.f3467d;
        }
        bVar2.f3465b += i3;
        list.set(i, bVar2);
        list.set(i2, bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4782a(List<C0844j.C0846b> list) {
        while (true) {
            int b = m5162b(list);
            if (b != -1) {
                m5161a(list, b, b + 1);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a1, code lost:
        if (r0 > r14.f3465b) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00cb, code lost:
        if (r0 >= r14.f3465b) goto L_0x00cd;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4783a(java.util.List<android.support.p011v7.widget.C0844j.C0846b> r10, int r11, android.support.p011v7.widget.C0844j.C0846b r12, int r13, android.support.p011v7.widget.C0844j.C0846b r14) {
        /*
            r9 = this;
            int r0 = r12.f3465b
            int r1 = r12.f3467d
            r2 = 0
            r3 = 1
            if (r0 >= r1) goto L_0x0016
            int r4 = r14.f3465b
            if (r4 != r0) goto L_0x0014
            int r4 = r14.f3467d
            int r1 = r1 - r0
            if (r4 != r1) goto L_0x0014
            r0 = r2
            r2 = r3
            goto L_0x0025
        L_0x0014:
            r0 = r2
            goto L_0x0025
        L_0x0016:
            int r4 = r14.f3465b
            int r5 = r1 + 1
            if (r4 != r5) goto L_0x0024
            int r4 = r14.f3467d
            int r0 = r0 - r1
            if (r4 != r0) goto L_0x0024
            r0 = r3
            r2 = r0
            goto L_0x0025
        L_0x0024:
            r0 = r3
        L_0x0025:
            int r1 = r12.f3467d
            int r4 = r14.f3465b
            r5 = 2
            if (r1 >= r4) goto L_0x0030
            int r4 = r4 - r3
            r14.f3465b = r4
            goto L_0x0049
        L_0x0030:
            int r6 = r14.f3467d
            int r4 = r4 + r6
            if (r1 >= r4) goto L_0x0049
            int r6 = r6 - r3
            r14.f3467d = r6
            r12.f3464a = r5
            r12.f3467d = r3
            int r11 = r14.f3467d
            if (r11 != 0) goto L_0x0048
            r10.remove(r13)
            android.support.v7.widget.xa$a r10 = r9.f3712a
            r10.mo4525a(r14)
        L_0x0048:
            return
        L_0x0049:
            int r1 = r12.f3465b
            int r4 = r14.f3465b
            r6 = 0
            if (r1 > r4) goto L_0x0054
            int r4 = r4 + r3
            r14.f3465b = r4
            goto L_0x006a
        L_0x0054:
            int r7 = r14.f3467d
            int r8 = r4 + r7
            if (r1 >= r8) goto L_0x006a
            int r4 = r4 + r7
            int r4 = r4 - r1
            android.support.v7.widget.xa$a r7 = r9.f3712a
            int r1 = r1 + r3
            android.support.v7.widget.j$b r6 = r7.mo4523a(r5, r1, r4, r6)
            int r1 = r12.f3465b
            int r3 = r14.f3465b
            int r1 = r1 - r3
            r14.f3467d = r1
        L_0x006a:
            if (r2 == 0) goto L_0x0078
            r10.set(r11, r14)
            r10.remove(r13)
            android.support.v7.widget.xa$a r10 = r9.f3712a
            r10.mo4525a(r12)
            return
        L_0x0078:
            if (r0 == 0) goto L_0x00a4
            if (r6 == 0) goto L_0x0092
            int r0 = r12.f3465b
            int r1 = r6.f3465b
            if (r0 <= r1) goto L_0x0087
            int r1 = r6.f3467d
            int r0 = r0 - r1
            r12.f3465b = r0
        L_0x0087:
            int r0 = r12.f3467d
            int r1 = r6.f3465b
            if (r0 <= r1) goto L_0x0092
            int r1 = r6.f3467d
            int r0 = r0 - r1
            r12.f3467d = r0
        L_0x0092:
            int r0 = r12.f3465b
            int r1 = r14.f3465b
            if (r0 <= r1) goto L_0x009d
            int r1 = r14.f3467d
            int r0 = r0 - r1
            r12.f3465b = r0
        L_0x009d:
            int r0 = r12.f3467d
            int r1 = r14.f3465b
            if (r0 <= r1) goto L_0x00d2
            goto L_0x00cd
        L_0x00a4:
            if (r6 == 0) goto L_0x00bc
            int r0 = r12.f3465b
            int r1 = r6.f3465b
            if (r0 < r1) goto L_0x00b1
            int r1 = r6.f3467d
            int r0 = r0 - r1
            r12.f3465b = r0
        L_0x00b1:
            int r0 = r12.f3467d
            int r1 = r6.f3465b
            if (r0 < r1) goto L_0x00bc
            int r1 = r6.f3467d
            int r0 = r0 - r1
            r12.f3467d = r0
        L_0x00bc:
            int r0 = r12.f3465b
            int r1 = r14.f3465b
            if (r0 < r1) goto L_0x00c7
            int r1 = r14.f3467d
            int r0 = r0 - r1
            r12.f3465b = r0
        L_0x00c7:
            int r0 = r12.f3467d
            int r1 = r14.f3465b
            if (r0 < r1) goto L_0x00d2
        L_0x00cd:
            int r1 = r14.f3467d
            int r0 = r0 - r1
            r12.f3467d = r0
        L_0x00d2:
            r10.set(r11, r14)
            int r14 = r12.f3465b
            int r0 = r12.f3467d
            if (r14 == r0) goto L_0x00df
            r10.set(r13, r12)
            goto L_0x00e2
        L_0x00df:
            r10.remove(r13)
        L_0x00e2:
            if (r6 == 0) goto L_0x00e7
            r10.add(r11, r6)
        L_0x00e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.widget.C0910xa.mo4783a(java.util.List, int, android.support.v7.widget.j$b, int, android.support.v7.widget.j$b):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4784b(java.util.List<android.support.p011v7.widget.C0844j.C0846b> r9, int r10, android.support.p011v7.widget.C0844j.C0846b r11, int r12, android.support.p011v7.widget.C0844j.C0846b r13) {
        /*
            r8 = this;
            int r0 = r11.f3467d
            int r1 = r13.f3465b
            r2 = 4
            r3 = 0
            r4 = 1
            if (r0 >= r1) goto L_0x000d
            int r1 = r1 - r4
            r13.f3465b = r1
            goto L_0x0020
        L_0x000d:
            int r5 = r13.f3467d
            int r1 = r1 + r5
            if (r0 >= r1) goto L_0x0020
            int r5 = r5 - r4
            r13.f3467d = r5
            android.support.v7.widget.xa$a r0 = r8.f3712a
            int r1 = r11.f3465b
            java.lang.Object r5 = r13.f3466c
            android.support.v7.widget.j$b r0 = r0.mo4523a(r2, r1, r4, r5)
            goto L_0x0021
        L_0x0020:
            r0 = r3
        L_0x0021:
            int r1 = r11.f3465b
            int r5 = r13.f3465b
            if (r1 > r5) goto L_0x002b
            int r5 = r5 + r4
            r13.f3465b = r5
            goto L_0x0041
        L_0x002b:
            int r6 = r13.f3467d
            int r7 = r5 + r6
            if (r1 >= r7) goto L_0x0041
            int r5 = r5 + r6
            int r5 = r5 - r1
            android.support.v7.widget.xa$a r3 = r8.f3712a
            int r1 = r1 + r4
            java.lang.Object r4 = r13.f3466c
            android.support.v7.widget.j$b r3 = r3.mo4523a(r2, r1, r5, r4)
            int r1 = r13.f3467d
            int r1 = r1 - r5
            r13.f3467d = r1
        L_0x0041:
            r9.set(r12, r11)
            int r11 = r13.f3467d
            if (r11 <= 0) goto L_0x004c
            r9.set(r10, r13)
            goto L_0x0054
        L_0x004c:
            r9.remove(r10)
            android.support.v7.widget.xa$a r11 = r8.f3712a
            r11.mo4525a(r13)
        L_0x0054:
            if (r0 == 0) goto L_0x0059
            r9.add(r10, r0)
        L_0x0059:
            if (r3 == 0) goto L_0x005e
            r9.add(r10, r3)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.widget.C0910xa.mo4784b(java.util.List, int, android.support.v7.widget.j$b, int, android.support.v7.widget.j$b):void");
    }
}
