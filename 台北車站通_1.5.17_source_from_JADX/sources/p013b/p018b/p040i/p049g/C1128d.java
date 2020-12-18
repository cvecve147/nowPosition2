package p013b.p018b.p040i.p049g;

import android.support.p011v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* renamed from: b.b.i.g.d */
public class C1128d {

    /* renamed from: a */
    private static final Comparator<C1133e> f4109a = new C1127c();

    /* renamed from: b.b.i.g.d$a */
    public static abstract class C1129a {
        /* renamed from: a */
        public abstract int mo5300a();

        /* renamed from: a */
        public abstract boolean mo5301a(int i, int i2);

        /* renamed from: b */
        public abstract int mo5302b();

        /* renamed from: b */
        public abstract boolean mo5303b(int i, int i2);

        /* renamed from: c */
        public Object mo5304c(int i, int i2) {
            return null;
        }
    }

    /* renamed from: b.b.i.g.d$b */
    public static class C1130b {

        /* renamed from: a */
        private final List<C1133e> f4110a;

        /* renamed from: b */
        private final int[] f4111b;

        /* renamed from: c */
        private final int[] f4112c;

        /* renamed from: d */
        private final C1129a f4113d;

        /* renamed from: e */
        private final int f4114e;

        /* renamed from: f */
        private final int f4115f;

        /* renamed from: g */
        private final boolean f4116g;

        C1130b(C1129a aVar, List<C1133e> list, int[] iArr, int[] iArr2, boolean z) {
            this.f4110a = list;
            this.f4111b = iArr;
            this.f4112c = iArr2;
            Arrays.fill(this.f4111b, 0);
            Arrays.fill(this.f4112c, 0);
            this.f4113d = aVar;
            this.f4114e = aVar.mo5302b();
            this.f4115f = aVar.mo5300a();
            this.f4116g = z;
            m5748a();
            m5752b();
        }

        /* renamed from: a */
        private static C1131c m5747a(List<C1131c> list, int i, boolean z) {
            int size = list.size() - 1;
            while (size >= 0) {
                C1131c cVar = list.get(size);
                if (cVar.f4117a == i && cVar.f4119c == z) {
                    list.remove(size);
                    while (size < list.size()) {
                        list.get(size).f4118b += z ? 1 : -1;
                        size++;
                    }
                    return cVar;
                }
                size--;
            }
            return null;
        }

        /* renamed from: a */
        private void m5748a() {
            C1133e eVar = this.f4110a.isEmpty() ? null : this.f4110a.get(0);
            if (eVar == null || eVar.f4124a != 0 || eVar.f4125b != 0) {
                C1133e eVar2 = new C1133e();
                eVar2.f4124a = 0;
                eVar2.f4125b = 0;
                eVar2.f4127d = false;
                eVar2.f4126c = 0;
                eVar2.f4128e = false;
                this.f4110a.add(0, eVar2);
            }
        }

        /* renamed from: a */
        private void m5749a(int i, int i2, int i3) {
            if (this.f4111b[i - 1] == 0) {
                m5751a(i, i2, i3, false);
            }
        }

        /* renamed from: a */
        private void m5750a(List<C1131c> list, C1134e eVar, int i, int i2, int i3) {
            if (!this.f4116g) {
                eVar.mo5295b(i, i2);
                return;
            }
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                int i5 = i3 + i4;
                int i6 = this.f4112c[i5] & 31;
                if (i6 == 0) {
                    eVar.mo5295b(i, 1);
                    for (C1131c cVar : list) {
                        cVar.f4118b++;
                    }
                } else if (i6 == 4 || i6 == 8) {
                    int i7 = this.f4112c[i5] >> 5;
                    eVar.mo5293a(m5747a(list, i7, true).f4118b, i);
                    if (i6 == 4) {
                        eVar.mo5294a(i, 1, this.f4113d.mo5304c(i7, i5));
                    }
                } else if (i6 == 16) {
                    list.add(new C1131c(i5, i, false));
                } else {
                    throw new IllegalStateException("unknown flag for pos " + i5 + " " + Long.toBinaryString((long) i6));
                }
            }
        }

        /* renamed from: a */
        private boolean m5751a(int i, int i2, int i3, boolean z) {
            int i4;
            int i5;
            if (z) {
                i2--;
                i5 = i;
                i4 = i2;
            } else {
                i5 = i - 1;
                i4 = i5;
            }
            while (i3 >= 0) {
                C1133e eVar = this.f4110a.get(i3);
                int i6 = eVar.f4124a;
                int i7 = eVar.f4126c;
                int i8 = i6 + i7;
                int i9 = eVar.f4125b + i7;
                int i10 = 8;
                if (z) {
                    for (int i11 = i5 - 1; i11 >= i8; i11--) {
                        if (this.f4113d.mo5303b(i11, i4)) {
                            if (!this.f4113d.mo5301a(i11, i4)) {
                                i10 = 4;
                            }
                            this.f4112c[i4] = (i11 << 5) | 16;
                            this.f4111b[i11] = (i4 << 5) | i10;
                            return true;
                        }
                    }
                    continue;
                } else {
                    for (int i12 = i2 - 1; i12 >= i9; i12--) {
                        if (this.f4113d.mo5303b(i4, i12)) {
                            if (!this.f4113d.mo5301a(i4, i12)) {
                                i10 = 4;
                            }
                            int i13 = i - 1;
                            this.f4111b[i13] = (i12 << 5) | 16;
                            this.f4112c[i12] = (i13 << 5) | i10;
                            return true;
                        }
                    }
                    continue;
                }
                i5 = eVar.f4124a;
                i2 = eVar.f4125b;
                i3--;
            }
            return false;
        }

        /* renamed from: b */
        private void m5752b() {
            int i = this.f4114e;
            int i2 = this.f4115f;
            for (int size = this.f4110a.size() - 1; size >= 0; size--) {
                C1133e eVar = this.f4110a.get(size);
                int i3 = eVar.f4124a;
                int i4 = eVar.f4126c;
                int i5 = i3 + i4;
                int i6 = eVar.f4125b + i4;
                if (this.f4116g) {
                    while (i > i5) {
                        m5749a(i, i2, size);
                        i--;
                    }
                    while (i2 > i6) {
                        m5753b(i, i2, size);
                        i2--;
                    }
                }
                for (int i7 = 0; i7 < eVar.f4126c; i7++) {
                    int i8 = eVar.f4124a + i7;
                    int i9 = eVar.f4125b + i7;
                    int i10 = this.f4113d.mo5301a(i8, i9) ? 1 : 2;
                    this.f4111b[i8] = (i9 << 5) | i10;
                    this.f4112c[i9] = (i8 << 5) | i10;
                }
                i = eVar.f4124a;
                i2 = eVar.f4125b;
            }
        }

        /* renamed from: b */
        private void m5753b(int i, int i2, int i3) {
            if (this.f4112c[i2 - 1] == 0) {
                m5751a(i, i2, i3, true);
            }
        }

        /* renamed from: b */
        private void m5754b(List<C1131c> list, C1134e eVar, int i, int i2, int i3) {
            if (!this.f4116g) {
                eVar.mo5296c(i, i2);
                return;
            }
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                int i5 = i3 + i4;
                int i6 = this.f4111b[i5] & 31;
                if (i6 == 0) {
                    eVar.mo5296c(i + i4, 1);
                    for (C1131c cVar : list) {
                        cVar.f4118b--;
                    }
                } else if (i6 == 4 || i6 == 8) {
                    int i7 = this.f4111b[i5] >> 5;
                    C1131c a = m5747a(list, i7, false);
                    eVar.mo5293a(i + i4, a.f4118b - 1);
                    if (i6 == 4) {
                        eVar.mo5294a(a.f4118b - 1, 1, this.f4113d.mo5304c(i5, i7));
                    }
                } else if (i6 == 16) {
                    list.add(new C1131c(i5, i + i4, true));
                } else {
                    throw new IllegalStateException("unknown flag for pos " + i5 + " " + Long.toBinaryString((long) i6));
                }
            }
        }

        /* renamed from: a */
        public void mo5305a(RecyclerView.C0748a aVar) {
            mo5306a((C1134e) new C1125a(aVar));
        }

        /* renamed from: a */
        public void mo5306a(C1134e eVar) {
            C1126b bVar = eVar instanceof C1126b ? (C1126b) eVar : new C1126b(eVar);
            ArrayList arrayList = new ArrayList();
            int i = this.f4114e;
            int i2 = this.f4115f;
            for (int size = this.f4110a.size() - 1; size >= 0; size--) {
                C1133e eVar2 = this.f4110a.get(size);
                int i3 = eVar2.f4126c;
                int i4 = eVar2.f4124a + i3;
                int i5 = eVar2.f4125b + i3;
                if (i4 < i) {
                    m5754b(arrayList, bVar, i4, i - i4, i4);
                }
                if (i5 < i2) {
                    m5750a(arrayList, bVar, i4, i2 - i5, i5);
                }
                for (int i6 = i3 - 1; i6 >= 0; i6--) {
                    int[] iArr = this.f4111b;
                    int i7 = eVar2.f4124a;
                    if ((iArr[i7 + i6] & 31) == 2) {
                        bVar.mo5294a(i7 + i6, 1, this.f4113d.mo5304c(i7 + i6, eVar2.f4125b + i6));
                    }
                }
                i = eVar2.f4124a;
                i2 = eVar2.f4125b;
            }
            bVar.mo5297a();
        }
    }

    /* renamed from: b.b.i.g.d$c */
    private static class C1131c {

        /* renamed from: a */
        int f4117a;

        /* renamed from: b */
        int f4118b;

        /* renamed from: c */
        boolean f4119c;

        public C1131c(int i, int i2, boolean z) {
            this.f4117a = i;
            this.f4118b = i2;
            this.f4119c = z;
        }
    }

    /* renamed from: b.b.i.g.d$d */
    static class C1132d {

        /* renamed from: a */
        int f4120a;

        /* renamed from: b */
        int f4121b;

        /* renamed from: c */
        int f4122c;

        /* renamed from: d */
        int f4123d;

        public C1132d() {
        }

        public C1132d(int i, int i2, int i3, int i4) {
            this.f4120a = i;
            this.f4121b = i2;
            this.f4122c = i3;
            this.f4123d = i4;
        }
    }

    /* renamed from: b.b.i.g.d$e */
    static class C1133e {

        /* renamed from: a */
        int f4124a;

        /* renamed from: b */
        int f4125b;

        /* renamed from: c */
        int f4126c;

        /* renamed from: d */
        boolean f4127d;

        /* renamed from: e */
        boolean f4128e;

        C1133e() {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p013b.p018b.p040i.p049g.C1128d.C1130b m5740a(p013b.p018b.p040i.p049g.C1128d.C1129a r15, boolean r16) {
        /*
            int r0 = r15.mo5302b()
            int r1 = r15.mo5300a()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            b.b.i.g.d$d r3 = new b.b.i.g.d$d
            r5 = 0
            r3.<init>(r5, r0, r5, r1)
            r2.add(r3)
            int r3 = r0 + r1
            int r0 = r0 - r1
            int r0 = java.lang.Math.abs(r0)
            int r0 = r0 + r3
            int r1 = r0 * 2
            int[] r13 = new int[r1]
            int[] r1 = new int[r1]
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x002e:
            boolean r5 = r2.isEmpty()
            if (r5 != 0) goto L_0x00dd
            int r5 = r2.size()
            int r5 = r5 + -1
            java.lang.Object r5 = r2.remove(r5)
            r14 = r5
            b.b.i.g.d$d r14 = (p013b.p018b.p040i.p049g.C1128d.C1132d) r14
            int r6 = r14.f4120a
            int r7 = r14.f4121b
            int r8 = r14.f4122c
            int r9 = r14.f4123d
            r5 = r15
            r10 = r13
            r11 = r1
            r12 = r0
            b.b.i.g.d$e r5 = m5741a(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r5 == 0) goto L_0x00d8
            int r6 = r5.f4126c
            if (r6 <= 0) goto L_0x005a
            r4.add(r5)
        L_0x005a:
            int r6 = r5.f4124a
            int r7 = r14.f4120a
            int r6 = r6 + r7
            r5.f4124a = r6
            int r6 = r5.f4125b
            int r7 = r14.f4122c
            int r6 = r6 + r7
            r5.f4125b = r6
            boolean r6 = r3.isEmpty()
            if (r6 == 0) goto L_0x0074
            b.b.i.g.d$d r6 = new b.b.i.g.d$d
            r6.<init>()
            goto L_0x0080
        L_0x0074:
            int r6 = r3.size()
            int r6 = r6 + -1
            java.lang.Object r6 = r3.remove(r6)
            b.b.i.g.d$d r6 = (p013b.p018b.p040i.p049g.C1128d.C1132d) r6
        L_0x0080:
            int r7 = r14.f4120a
            r6.f4120a = r7
            int r7 = r14.f4122c
            r6.f4122c = r7
            boolean r7 = r5.f4128e
            if (r7 == 0) goto L_0x0095
            int r7 = r5.f4124a
        L_0x008e:
            r6.f4121b = r7
            int r7 = r5.f4125b
        L_0x0092:
            r6.f4123d = r7
            goto L_0x00a7
        L_0x0095:
            boolean r7 = r5.f4127d
            if (r7 == 0) goto L_0x009e
            int r7 = r5.f4124a
            int r7 = r7 + -1
            goto L_0x008e
        L_0x009e:
            int r7 = r5.f4124a
            r6.f4121b = r7
            int r7 = r5.f4125b
            int r7 = r7 + -1
            goto L_0x0092
        L_0x00a7:
            r2.add(r6)
            boolean r6 = r5.f4128e
            if (r6 == 0) goto L_0x00c7
            boolean r6 = r5.f4127d
            if (r6 == 0) goto L_0x00ba
            int r6 = r5.f4124a
            int r7 = r5.f4126c
            int r6 = r6 + r7
            int r6 = r6 + 1
            goto L_0x00cc
        L_0x00ba:
            int r6 = r5.f4124a
            int r7 = r5.f4126c
            int r6 = r6 + r7
            r14.f4120a = r6
            int r5 = r5.f4125b
            int r5 = r5 + r7
            int r5 = r5 + 1
            goto L_0x00d1
        L_0x00c7:
            int r6 = r5.f4124a
            int r7 = r5.f4126c
            int r6 = r6 + r7
        L_0x00cc:
            r14.f4120a = r6
            int r5 = r5.f4125b
            int r5 = r5 + r7
        L_0x00d1:
            r14.f4122c = r5
            r2.add(r14)
            goto L_0x002e
        L_0x00d8:
            r3.add(r14)
            goto L_0x002e
        L_0x00dd:
            java.util.Comparator<b.b.i.g.d$e> r0 = f4109a
            java.util.Collections.sort(r4, r0)
            b.b.i.g.d$b r0 = new b.b.i.g.d$b
            r2 = r0
            r3 = r15
            r5 = r13
            r6 = r1
            r7 = r16
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p018b.p040i.p049g.C1128d.m5740a(b.b.i.g.d$a, boolean):b.b.i.g.d$b");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r1[r13 - 1] < r1[r13 + r5]) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ba, code lost:
        if (r2[r13 - 1] < r2[r13 + 1]) goto L_0x00c7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009c A[LOOP:1: B:10:0x0033->B:33:0x009c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0081 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p013b.p018b.p040i.p049g.C1128d.C1133e m5741a(p013b.p018b.p040i.p049g.C1128d.C1129a r19, int r20, int r21, int r22, int r23, int[] r24, int[] r25, int r26) {
        /*
            r0 = r19
            r1 = r24
            r2 = r25
            int r3 = r21 - r20
            int r4 = r23 - r22
            r5 = 1
            if (r3 < r5) goto L_0x0133
            if (r4 >= r5) goto L_0x0011
            goto L_0x0133
        L_0x0011:
            int r6 = r3 - r4
            int r7 = r3 + r4
            int r7 = r7 + r5
            int r7 = r7 / 2
            int r8 = r26 - r7
            int r8 = r8 - r5
            int r9 = r26 + r7
            int r9 = r9 + r5
            r10 = 0
            java.util.Arrays.fill(r1, r8, r9, r10)
            int r8 = r8 + r6
            int r9 = r9 + r6
            java.util.Arrays.fill(r2, r8, r9, r3)
            int r8 = r6 % 2
            if (r8 == 0) goto L_0x002d
            r8 = r5
            goto L_0x002e
        L_0x002d:
            r8 = r10
        L_0x002e:
            r9 = r10
        L_0x002f:
            if (r9 > r7) goto L_0x012b
            int r11 = -r9
            r12 = r11
        L_0x0033:
            if (r12 > r9) goto L_0x00a2
            if (r12 == r11) goto L_0x004d
            if (r12 == r9) goto L_0x0045
            int r13 = r26 + r12
            int r14 = r13 + -1
            r14 = r1[r14]
            int r13 = r13 + r5
            r13 = r1[r13]
            if (r14 >= r13) goto L_0x0045
            goto L_0x004d
        L_0x0045:
            int r13 = r26 + r12
            int r13 = r13 - r5
            r13 = r1[r13]
            int r13 = r13 + r5
            r14 = r5
            goto L_0x0053
        L_0x004d:
            int r13 = r26 + r12
            int r13 = r13 + r5
            r13 = r1[r13]
            r14 = r10
        L_0x0053:
            int r15 = r13 - r12
        L_0x0055:
            if (r13 >= r3) goto L_0x006a
            if (r15 >= r4) goto L_0x006a
            int r10 = r20 + r13
            int r5 = r22 + r15
            boolean r5 = r0.mo5303b(r10, r5)
            if (r5 == 0) goto L_0x006a
            int r13 = r13 + 1
            int r15 = r15 + 1
            r5 = 1
            r10 = 0
            goto L_0x0055
        L_0x006a:
            int r5 = r26 + r12
            r1[r5] = r13
            if (r8 == 0) goto L_0x009c
            int r10 = r6 - r9
            r13 = 1
            int r10 = r10 + r13
            if (r12 < r10) goto L_0x009c
            int r10 = r6 + r9
            int r10 = r10 - r13
            if (r12 > r10) goto L_0x009c
            r10 = r1[r5]
            r13 = r2[r5]
            if (r10 < r13) goto L_0x009c
            b.b.i.g.d$e r0 = new b.b.i.g.d$e
            r0.<init>()
            r3 = r2[r5]
            r0.f4124a = r3
            int r3 = r0.f4124a
            int r3 = r3 - r12
            r0.f4125b = r3
            r1 = r1[r5]
            r2 = r2[r5]
            int r1 = r1 - r2
            r0.f4126c = r1
            r0.f4127d = r14
            r5 = 0
            r0.f4128e = r5
            return r0
        L_0x009c:
            r5 = 0
            int r12 = r12 + 2
            r10 = r5
            r5 = 1
            goto L_0x0033
        L_0x00a2:
            r5 = r10
            r10 = r11
        L_0x00a4:
            if (r10 > r9) goto L_0x0120
            int r12 = r10 + r6
            int r13 = r9 + r6
            if (r12 == r13) goto L_0x00c6
            int r13 = r11 + r6
            if (r12 == r13) goto L_0x00bd
            int r13 = r26 + r12
            int r14 = r13 + -1
            r14 = r2[r14]
            r15 = 1
            int r13 = r13 + r15
            r13 = r2[r13]
            if (r14 >= r13) goto L_0x00be
            goto L_0x00c7
        L_0x00bd:
            r15 = 1
        L_0x00be:
            int r13 = r26 + r12
            int r13 = r13 + r15
            r13 = r2[r13]
            int r13 = r13 - r15
            r14 = r15
            goto L_0x00cd
        L_0x00c6:
            r15 = 1
        L_0x00c7:
            int r13 = r26 + r12
            int r13 = r13 - r15
            r13 = r2[r13]
            r14 = r5
        L_0x00cd:
            int r16 = r13 - r12
        L_0x00cf:
            if (r13 <= 0) goto L_0x00ec
            if (r16 <= 0) goto L_0x00ec
            int r17 = r20 + r13
            int r5 = r17 + -1
            int r17 = r22 + r16
            r18 = r3
            int r3 = r17 + -1
            boolean r3 = r0.mo5303b(r5, r3)
            if (r3 == 0) goto L_0x00ee
            int r13 = r13 + -1
            int r16 = r16 + -1
            r3 = r18
            r5 = 0
            r15 = 1
            goto L_0x00cf
        L_0x00ec:
            r18 = r3
        L_0x00ee:
            int r3 = r26 + r12
            r2[r3] = r13
            if (r8 != 0) goto L_0x0119
            if (r12 < r11) goto L_0x0119
            if (r12 > r9) goto L_0x0119
            r5 = r1[r3]
            r13 = r2[r3]
            if (r5 < r13) goto L_0x0119
            b.b.i.g.d$e r0 = new b.b.i.g.d$e
            r0.<init>()
            r4 = r2[r3]
            r0.f4124a = r4
            int r4 = r0.f4124a
            int r4 = r4 - r12
            r0.f4125b = r4
            r1 = r1[r3]
            r2 = r2[r3]
            int r1 = r1 - r2
            r0.f4126c = r1
            r0.f4127d = r14
            r3 = 1
            r0.f4128e = r3
            return r0
        L_0x0119:
            r3 = 1
            int r10 = r10 + 2
            r3 = r18
            r5 = 0
            goto L_0x00a4
        L_0x0120:
            r18 = r3
            r3 = 1
            int r9 = r9 + 1
            r5 = r3
            r3 = r18
            r10 = 0
            goto L_0x002f
        L_0x012b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "DiffUtil hit an unexpected case while trying to calculate the optimal path. Please make sure your data is not changing during the diff calculation."
            r0.<init>(r1)
            throw r0
        L_0x0133:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p013b.p018b.p040i.p049g.C1128d.m5741a(b.b.i.g.d$a, int, int, int, int, int[], int[], int):b.b.i.g.d$e");
    }
}
