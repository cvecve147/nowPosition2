package p299tw.navin.navinmap.map;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import p267i.p268a.p269a.p270a.C6665e;
import p267i.p268a.p269a.p270a.C6666f;
import p299tw.navin.navinmap.map.C7112l;
import p299tw.navin.navinmap.util.C7158b;
import p299tw.navin.navinmap.util.MathUtils;

/* renamed from: tw.navin.navinmap.map.n */
class C7129n {

    /* renamed from: a */
    private C7131b f19675a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C7130a f19676b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public SparseArray<C7112l.C7123k> f19677c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public SparseArray<C7112l.C7123k> f19678d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public SparseArray<C7112l.C7123k> f19679e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C7112l.C7123k f19680f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C7112l.C7123k f19681g = null;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f19682h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public float f19683i;

    /* renamed from: j */
    private boolean f19684j = false;

    /* renamed from: tw.navin.navinmap.map.n$a */
    interface C7130a {
        /* renamed from: a */
        void mo21212a();
    }

    /* renamed from: tw.navin.navinmap.map.n$b */
    private class C7131b extends Thread {

        /* renamed from: a */
        private Context f19685a;

        /* renamed from: b */
        private Matrix f19686b;

        /* renamed from: c */
        private Matrix f19687c = new Matrix();

        /* renamed from: d */
        private final Object f19688d = new Object();

        /* renamed from: e */
        private boolean f19689e;

        /* renamed from: f */
        private boolean f19690f = true;

        /* renamed from: g */
        private float[] f19691g = new float[9];

        /* renamed from: h */
        private float[] f19692h = new float[2];

        /* renamed from: i */
        private float[] f19693i = new float[2];

        /* renamed from: j */
        private final int f19694j = 0;

        /* renamed from: k */
        private final int f19695k = 1;

        C7131b(Context context, Matrix matrix) {
            this.f19685a = context;
            this.f19686b = matrix;
            this.f19689e = true;
        }

        /* renamed from: a */
        private void m26834a(Matrix matrix, SparseArray<C7112l.C7123k> sparseArray, SparseArray<C7112l.C7123k> sparseArray2, SparseArray<C7112l.C7123k> sparseArray3, int i, int i2) {
            boolean z;
            int i3;
            C6666f a;
            SparseArray<C7112l.C7123k> sparseArray4 = sparseArray2;
            SparseArray<C7112l.C7123k> sparseArray5 = sparseArray3;
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                C7112l.C7123k valueAt = sparseArray.valueAt(i4);
                if (sparseArray5.indexOfKey(valueAt.f19655a) < 0) {
                    if (!valueAt.f19665k) {
                        C6666f a2 = C6665e.m25345a().mo17118a(this.f19685a, valueAt);
                        if (a2 != null) {
                            int i5 = i;
                            int i6 = i2;
                            z = false;
                            while (i5 <= i6) {
                                ArrayList arrayList = valueAt.f19667m.get(i5);
                                if (arrayList != null) {
                                    Iterator it = arrayList.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        C7112l.C7123k kVar = (C7112l.C7123k) it.next();
                                        if (sparseArray4.indexOfKey(kVar.f19655a) >= 0 || ((sparseArray5.indexOfKey(kVar.f19655a) < 0 && !kVar.f19665k) || (a = C6665e.m25345a().mo17118a(this.f19685a, kVar)) == null)) {
                                            i3 = i5;
                                        } else {
                                            float[] fArr = this.f19692h;
                                            float[] fArr2 = this.f19693i;
                                            PointF pointF = valueAt.f19661g;
                                            float[] fArr3 = fArr2;
                                            Matrix matrix2 = matrix;
                                            C6666f fVar = a;
                                            C7112l.C7123k kVar2 = kVar;
                                            float f = pointF.x;
                                            i3 = i5;
                                            m26835a(matrix2, fArr, fArr3, f, pointF.y);
                                            float[] fArr4 = this.f19693i;
                                            float f2 = fArr4[0];
                                            float f3 = fArr4[1];
                                            float[] fArr5 = this.f19692h;
                                            PointF pointF2 = kVar2.f19661g;
                                            m26835a(matrix2, fArr5, fArr4, pointF2.x, pointF2.y);
                                            float[] fArr6 = this.f19693i;
                                            C6666f fVar2 = fVar;
                                            if (C7158b.m26967a(f2, f3, a2.f18475c, a2.f18476d, fArr6[0], fArr6[1], fVar2.f18475c, fVar2.f18476d)) {
                                                z = true;
                                                break;
                                            }
                                        }
                                        i5 = i3;
                                    }
                                }
                                i3 = i5;
                                i5 = i3 + 1;
                            }
                        } else {
                            int i7 = i2;
                            z = false;
                        }
                        if (z) {
                            valueAt.f19664j = true;
                            sparseArray4.put(valueAt.f19655a, valueAt);
                        } else {
                            valueAt.f19664j = false;
                        }
                    } else {
                        int i8 = i2;
                    }
                    sparseArray5.put(valueAt.f19655a, valueAt);
                } else {
                    int i9 = i2;
                }
            }
            SparseArray unused = C7129n.this.f19678d = sparseArray5;
            SparseArray unused2 = C7129n.this.f19679e = sparseArray4;
        }

        /* renamed from: a */
        private void m26835a(Matrix matrix, float[] fArr, float[] fArr2, float f, float f2) {
            fArr[0] = f;
            fArr[1] = f2;
            matrix.mapPoints(fArr2, fArr);
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x00cf  */
        /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m26836b() {
            /*
                r11 = this;
                android.graphics.Matrix r0 = r11.f19687c
                android.graphics.Matrix r1 = r11.f19686b
                r0.set(r1)
                android.graphics.Matrix r0 = r11.f19687c
                float[] r1 = r11.f19691g
                r0.getValues(r1)
                float[] r0 = r11.f19691g
                r1 = 0
                r2 = r0[r1]
                r3 = 3
                r0 = r0[r3]
                float r2 = r2 * r2
                float r0 = r0 * r0
                float r2 = r2 + r0
                double r2 = (double) r2
                double r2 = java.lang.Math.sqrt(r2)
                float r0 = (float) r2
                r2 = 1065353216(0x3f800000, float:1.0)
                float r2 = r2 / r0
                double r2 = (double) r2
                double r2 = java.lang.Math.floor(r2)
                int r2 = (int) r2
                tw.navin.navinmap.map.n r3 = p299tw.navin.navinmap.map.C7129n.this
                float r3 = r3.f19683i
                r4 = 0
                int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r3 != 0) goto L_0x0079
                r9 = 0
                tw.navin.navinmap.map.n r3 = p299tw.navin.navinmap.map.C7129n.this
                android.util.SparseArray r6 = r3.f19677c
                tw.navin.navinmap.map.n r3 = p299tw.navin.navinmap.map.C7129n.this
                android.util.SparseArray r4 = new android.util.SparseArray
                android.util.SparseArray r5 = r3.f19677c
                int r5 = r5.size()
                int r5 = r5 / 2
                r4.<init>(r5)
                android.util.SparseArray unused = r3.f19678d = r4
                tw.navin.navinmap.map.n r3 = p299tw.navin.navinmap.map.C7129n.this
                android.util.SparseArray r4 = new android.util.SparseArray
                android.util.SparseArray r5 = r3.f19677c
                int r5 = r5.size()
                int r5 = r5 / 2
                r4.<init>(r5)
            L_0x005f:
                android.util.SparseArray unused = r3.f19679e = r4
            L_0x0062:
                r11.m26837c()
                android.graphics.Matrix r5 = r11.f19687c
                tw.navin.navinmap.map.n r3 = p299tw.navin.navinmap.map.C7129n.this
                android.util.SparseArray r7 = r3.f19679e
                tw.navin.navinmap.map.n r3 = p299tw.navin.navinmap.map.C7129n.this
                android.util.SparseArray r8 = r3.f19678d
                r4 = r11
                r10 = r2
                r4.m26834a(r5, r6, r7, r8, r9, r10)
                goto L_0x00b9
            L_0x0079:
                tw.navin.navinmap.map.n r3 = p299tw.navin.navinmap.map.C7129n.this
                float r3 = r3.f19683i
                int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r3 <= 0) goto L_0x009a
                r9 = 0
                tw.navin.navinmap.map.n r3 = p299tw.navin.navinmap.map.C7129n.this
                android.util.SparseArray r6 = r3.f19679e
                tw.navin.navinmap.map.n r3 = p299tw.navin.navinmap.map.C7129n.this
                android.util.SparseArray r4 = new android.util.SparseArray
                android.util.SparseArray r5 = r3.f19679e
                int r5 = r5.size()
                r4.<init>(r5)
                goto L_0x005f
            L_0x009a:
                tw.navin.navinmap.map.n r3 = p299tw.navin.navinmap.map.C7129n.this
                int r9 = r3.f19682h
                tw.navin.navinmap.map.n r3 = p299tw.navin.navinmap.map.C7129n.this
                android.util.SparseArray r6 = r3.f19678d
                tw.navin.navinmap.map.n r3 = p299tw.navin.navinmap.map.C7129n.this
                android.util.SparseArray r4 = new android.util.SparseArray
                android.util.SparseArray r5 = r3.f19678d
                int r5 = r5.size()
                r4.<init>(r5)
                android.util.SparseArray unused = r3.f19678d = r4
                goto L_0x0062
            L_0x00b9:
                r11.f19689e = r1
                r11.f19690f = r1
                tw.navin.navinmap.map.n r1 = p299tw.navin.navinmap.map.C7129n.this
                int unused = r1.f19682h = r2
                tw.navin.navinmap.map.n r1 = p299tw.navin.navinmap.map.C7129n.this
                float unused = r1.f19683i = r0
                tw.navin.navinmap.map.n r0 = p299tw.navin.navinmap.map.C7129n.this
                tw.navin.navinmap.map.n$a r0 = r0.f19676b
                if (r0 == 0) goto L_0x00d8
                tw.navin.navinmap.map.n r0 = p299tw.navin.navinmap.map.C7129n.this
                tw.navin.navinmap.map.n$a r0 = r0.f19676b
                r0.mo21212a()
            L_0x00d8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p299tw.navin.navinmap.map.C7129n.C7131b.m26836b():void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x004f, code lost:
            if (p299tw.navin.navinmap.map.C7129n.m26819d(r3.f19696l).indexOfKey(p299tw.navin.navinmap.map.C7129n.m26822g(r3.f19696l).f19655a) < 0) goto L_0x0051;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m26837c() {
            /*
                r3 = this;
                tw.navin.navinmap.map.n r0 = p299tw.navin.navinmap.map.C7129n.this
                tw.navin.navinmap.map.l$k r0 = r0.f19680f
                if (r0 == 0) goto L_0x0069
                tw.navin.navinmap.map.n r0 = p299tw.navin.navinmap.map.C7129n.this
                tw.navin.navinmap.map.l$k r0 = r0.f19681g
                if (r0 == 0) goto L_0x0051
                tw.navin.navinmap.map.n r0 = p299tw.navin.navinmap.map.C7129n.this
                tw.navin.navinmap.map.l$k r0 = r0.f19681g
                int r0 = r0.f19655a
                tw.navin.navinmap.map.n r1 = p299tw.navin.navinmap.map.C7129n.this
                tw.navin.navinmap.map.l$k r1 = r1.f19680f
                int r1 = r1.f19655a
                if (r0 == r1) goto L_0x0051
                tw.navin.navinmap.map.n r0 = p299tw.navin.navinmap.map.C7129n.this
                tw.navin.navinmap.map.l$k r0 = r0.f19681g
                boolean r0 = r0.f19665k
                if (r0 != 0) goto L_0x003d
                tw.navin.navinmap.map.n r0 = p299tw.navin.navinmap.map.C7129n.this
                android.util.SparseArray r0 = r0.f19678d
                tw.navin.navinmap.map.n r1 = p299tw.navin.navinmap.map.C7129n.this
                tw.navin.navinmap.map.l$k r1 = r1.f19681g
                int r1 = r1.f19655a
                r0.remove(r1)
            L_0x003d:
                tw.navin.navinmap.map.n r0 = p299tw.navin.navinmap.map.C7129n.this
                android.util.SparseArray r0 = r0.f19678d
                tw.navin.navinmap.map.n r1 = p299tw.navin.navinmap.map.C7129n.this
                tw.navin.navinmap.map.l$k r1 = r1.f19680f
                int r1 = r1.f19655a
                int r0 = r0.indexOfKey(r1)
                if (r0 >= 0) goto L_0x008c
            L_0x0051:
                tw.navin.navinmap.map.n r0 = p299tw.navin.navinmap.map.C7129n.this
                android.util.SparseArray r0 = r0.f19678d
                tw.navin.navinmap.map.n r1 = p299tw.navin.navinmap.map.C7129n.this
                tw.navin.navinmap.map.l$k r1 = r1.f19680f
                int r1 = r1.f19655a
                tw.navin.navinmap.map.n r2 = p299tw.navin.navinmap.map.C7129n.this
                tw.navin.navinmap.map.l$k r2 = r2.f19680f
                r0.put(r1, r2)
                goto L_0x008c
            L_0x0069:
                tw.navin.navinmap.map.n r0 = p299tw.navin.navinmap.map.C7129n.this
                tw.navin.navinmap.map.l$k r0 = r0.f19681g
                if (r0 == 0) goto L_0x008c
                tw.navin.navinmap.map.n r0 = p299tw.navin.navinmap.map.C7129n.this
                tw.navin.navinmap.map.l$k r0 = r0.f19681g
                boolean r0 = r0.f19665k
                if (r0 != 0) goto L_0x008c
                tw.navin.navinmap.map.n r0 = p299tw.navin.navinmap.map.C7129n.this
                android.util.SparseArray r0 = r0.f19678d
                tw.navin.navinmap.map.n r1 = p299tw.navin.navinmap.map.C7129n.this
                tw.navin.navinmap.map.l$k r1 = r1.f19681g
                int r1 = r1.f19655a
                r0.remove(r1)
            L_0x008c:
                tw.navin.navinmap.map.n r0 = p299tw.navin.navinmap.map.C7129n.this
                tw.navin.navinmap.map.l$k r1 = r0.f19680f
                p299tw.navin.navinmap.map.C7112l.C7123k unused = r0.f19681g = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p299tw.navin.navinmap.map.C7129n.C7131b.m26837c():void");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized void mo21213a() {
            this.f19689e = false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo21214a(Context context, Matrix matrix) {
            synchronized (this.f19688d) {
                this.f19685a = context;
                this.f19686b = matrix;
                this.f19690f = true;
            }
        }

        public void run() {
            while (this.f19689e) {
                synchronized (this.f19688d) {
                    if (this.f19690f) {
                        try {
                            m26836b();
                        } catch (ConcurrentModificationException e) {
                            e.printStackTrace();
                            this.f19689e = false;
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                }
                if (this.f19689e) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e3) {
                        e3.printStackTrace();
                    }
                }
            }
        }
    }

    C7129n() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21203a() {
        this.f19684j = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21204a(Context context, Matrix matrix) {
        C7131b bVar = this.f19675a;
        if (bVar == null || !bVar.isAlive()) {
            this.f19675a = new C7131b(context, matrix);
            this.f19675a.start();
            return;
        }
        this.f19675a.mo21214a(context, matrix);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21205a(SparseArray<C7112l.C7123k> sparseArray) {
        this.f19677c = sparseArray;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21206a(C7112l.C7123k kVar) {
        this.f19680f = kVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21207a(C7130a aVar) {
        this.f19676b = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo21208b() {
        SparseArray<C7112l.C7123k> sparseArray = this.f19679e;
        if (sparseArray != null) {
            return sparseArray.size();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo21209b(SparseArray<C7112l.C7123k> sparseArray) {
        ArrayList arrayList;
        ArrayList arrayList2;
        float b = C6665e.m25345a().mo17120b() * 2.0f;
        for (int i = 0; i < sparseArray.size(); i++) {
            C7112l.C7123k valueAt = sparseArray.valueAt(i);
            SparseArray<ArrayList<C7112l.C7123k>> sparseArray2 = valueAt.f19667m;
            if (sparseArray2 != null) {
                sparseArray2.clear();
            } else {
                valueAt.f19667m = new SparseArray<>();
            }
            for (int i2 = 0; i2 <= i; i2++) {
                C7112l.C7123k valueAt2 = sparseArray.valueAt(i2);
                if (valueAt != valueAt2) {
                    int floor = (int) Math.floor((double) (MathUtils.m26962a(valueAt.f19661g, valueAt2.f19661g) / b));
                    if (valueAt.f19667m.indexOfKey(floor) < 0) {
                        arrayList = new ArrayList();
                        valueAt.f19667m.put(floor, arrayList);
                    } else {
                        arrayList = valueAt.f19667m.get(floor);
                    }
                    arrayList.add(valueAt2);
                    if (valueAt2.f19667m.indexOfKey(floor) < 0) {
                        arrayList2 = new ArrayList();
                        valueAt2.f19667m.put(floor, arrayList2);
                    } else {
                        arrayList2 = valueAt2.f19667m.get(floor);
                    }
                    arrayList2.add(valueAt);
                }
                if (this.f19684j) {
                    break;
                }
            }
            if (this.f19684j) {
                break;
            }
        }
        if (!this.f19684j) {
            this.f19677c = sparseArray;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo21210c() {
        C7131b bVar = this.f19675a;
        if (bVar != null) {
            bVar.mo21213a();
            this.f19675a = null;
        }
        mo21211d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo21211d() {
        this.f19682h = 0;
        this.f19683i = 0.0f;
        this.f19681g = null;
        this.f19678d = null;
        this.f19679e = null;
    }
}
