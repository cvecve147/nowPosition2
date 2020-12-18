package p299tw.navin.navinmap.map;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p101d.p129g.p146c.p148b.C5572a;
import p299tw.navin.navinmap.map.C7112l;
import p299tw.navin.navinmap.util.MathUtils;

/* renamed from: tw.navin.navinmap.map.RouteHelper */
class RouteHelper {

    /* renamed from: a */
    private ArrayList<Integer> f19449a;

    /* renamed from: b */
    private ArrayList<C7112l.C7122j> f19450b;

    /* renamed from: c */
    private ArrayList<C7112l.C7121i> f19451c;

    /* renamed from: d */
    private ArrayList<C7112l.C7121i> f19452d;

    /* renamed from: e */
    private float[] f19453e;

    /* renamed from: f */
    private HashMap<String, C7112l.C7120h> f19454f;

    /* renamed from: g */
    private HashMap<Integer, C7112l.C7122j> f19455g;

    /* renamed from: h */
    private HashSet<Integer> f19456h;

    /* renamed from: i */
    private C7112l.C7122j f19457i;

    /* renamed from: j */
    private C7112l.C7122j f19458j;

    /* renamed from: k */
    private int f19459k;

    /* renamed from: l */
    private int f19460l;

    /* renamed from: m */
    private int f19461m;

    /* renamed from: n */
    private int f19462n;

    /* renamed from: o */
    private ArrayList<C7112l.C7122j> f19463o = null;

    /* renamed from: p */
    private C7112l.C7122j f19464p;

    /* renamed from: q */
    private int[] f19465q;

    /* renamed from: r */
    private float f19466r;

    /* renamed from: s */
    private float f19467s;

    /* renamed from: t */
    boolean f19468t = false;

    RouteHelper(HashMap<String, C7112l.C7120h> hashMap) {
        this.f19454f = hashMap;
    }

    /* renamed from: a */
    static float m26583a(float f, PointF pointF, PointF pointF2) {
        return m26590b(f, pointF, pointF2) * 0.5f;
    }

    /* renamed from: a */
    private int m26584a(int[] iArr, String str, int i) {
        float f = Float.MAX_VALUE;
        int i2 = -1;
        int i3 = 1;
        while (i3 < i - 1) {
            C7112l.C7122j jVar = this.f19455g.get(Integer.valueOf(iArr[i3]));
            i3++;
            C7112l.C7122j jVar2 = this.f19455g.get(Integer.valueOf(iArr[i3]));
            if (jVar.f19651d.equals(str) && jVar2.f19651d.equals(str)) {
                float b = MathUtils.m26964b(jVar.f19650c, jVar2.f19650c, this.f19457i.f19650c);
                if (b < f) {
                    i2 = i3;
                    f = b;
                }
            }
        }
        return i2;
    }

    /* renamed from: a */
    private C7112l.C7121i m26585a(ArrayList<C7112l.C7122j> arrayList, C7112l.C7122j jVar) {
        Iterator<C7112l.C7122j> it = arrayList.iterator();
        C7112l.C7122j jVar2 = null;
        float f = Float.MAX_VALUE;
        while (it.hasNext()) {
            C7112l.C7122j next = it.next();
            float a = MathUtils.m26962a(next.f19650c, jVar.f19650c);
            if (a < f && this.f19456h.contains(Integer.valueOf(next.f19648a))) {
                jVar2 = next;
                f = a;
            }
        }
        C7112l.C7121i iVar = new C7112l.C7121i();
        iVar.f19641d = jVar;
        iVar.f19639b = jVar.f19648a;
        iVar.f19642e = jVar2;
        iVar.f19640c = jVar2.f19648a;
        iVar.f19638a = "";
        iVar.f19646i = 3.0f;
        return iVar;
    }

    /* renamed from: a */
    private void m26586a(int i) {
        float[] fArr = this.f19453e;
        int i2 = this.f19461m;
        int i3 = this.f19462n;
        fArr[(i2 * i) + i3] = -1.0f;
        fArr[(i3 * i) + i2] = -1.0f;
        int i4 = this.f19459k;
        int i5 = this.f19460l;
        fArr[(i4 * i) + i5] = -1.0f;
        fArr[(i5 * i) + i4] = -1.0f;
    }

    /* renamed from: a */
    private void m26587a(C7112l.C7121i iVar, C7112l.C7121i iVar2, int i) {
        this.f19461m = this.f19449a.indexOf(Integer.valueOf(iVar.f19639b));
        this.f19462n = this.f19449a.indexOf(Integer.valueOf(iVar.f19640c));
        float a = MathUtils.m26962a(iVar.f19641d.f19650c, iVar.f19642e.f19650c);
        float[] fArr = this.f19453e;
        int i2 = this.f19461m;
        int i3 = this.f19462n;
        fArr[(i2 * i) + i3] = a;
        fArr[(i3 * i) + i2] = a;
        this.f19459k = this.f19449a.indexOf(Integer.valueOf(iVar2.f19639b));
        this.f19460l = this.f19449a.indexOf(Integer.valueOf(iVar2.f19640c));
        float a2 = MathUtils.m26962a(iVar2.f19641d.f19650c, iVar2.f19642e.f19650c);
        float[] fArr2 = this.f19453e;
        int i4 = this.f19459k;
        int i5 = this.f19460l;
        fArr2[(i4 * i) + i5] = a2;
        fArr2[(i5 * i) + i4] = a2;
    }

    /* renamed from: a */
    private void m26588a(int[] iArr, int i) {
        if (i != -1) {
            if (this.f19455g.get(Integer.valueOf(iArr[i])).mo21198b()) {
                boolean z = false;
                while (!z) {
                    int i2 = i + 1;
                    this.f19464p = this.f19455g.get(Integer.valueOf(iArr[i2]));
                    i = i2 + 2;
                    if (i < iArr.length) {
                        if (this.f19455g.get(Integer.valueOf(iArr[i])).mo21198b()) {
                        }
                    }
                    z = true;
                }
                return;
            }
            this.f19464p = null;
        }
    }

    /* renamed from: a */
    private void m26589a(int[] iArr, String str, PointF pointF, int i, int i2) {
        this.f19457i.f19650c.set(pointF.x, pointF.y);
        this.f19457i.f19651d = str;
        this.f19463o.clear();
        float f = 0.0f;
        float f2 = 0.0f;
        int i3 = -1;
        boolean z = true;
        for (int i4 = i; i4 <= i2; i4++) {
            C7112l.C7122j jVar = this.f19455g.get(Integer.valueOf(iArr[i4]));
            if (!z || !jVar.f19651d.equals(this.f19457i.f19651d)) {
                z = false;
            } else {
                this.f19463o.add(jVar);
                i3 = i4;
            }
            if (i4 <= i2 - 1) {
                C7112l.C7122j jVar2 = this.f19455g.get(Integer.valueOf(iArr[i4 + 1]));
                if (jVar.f19651d.equals(jVar2.f19651d)) {
                    float a = m26583a(this.f19454f.get(jVar.f19651d).f19627i, jVar.f19650c, jVar2.f19650c);
                    f += a;
                    if (jVar.f19651d.equals(this.f19457i.f19651d)) {
                        f2 += a;
                    }
                }
            }
        }
        if (this.f19463o.size() == 0) {
            this.f19463o.add(this.f19455g.get(Integer.valueOf(iArr[i - 1])));
        }
        float a2 = m26583a(this.f19454f.get(this.f19457i.f19651d).f19627i, this.f19457i.f19650c, this.f19463o.get(0).f19650c);
        this.f19463o.add(0, this.f19457i);
        this.f19466r = f + a2;
        this.f19467s = f2 + a2;
        m26588a(iArr, i3);
    }

    /* renamed from: b */
    private static float m26590b(float f, PointF pointF, PointF pointF2) {
        return MathUtils.m26962a(pointF, pointF2) / f;
    }

    /* renamed from: b */
    private void m26591b(ArrayList<C7112l.C7122j> arrayList, ArrayList<C7112l.C7122j> arrayList2, String str, String str2, PointF pointF, PointF pointF2) {
        int[] c = m26592c(arrayList, arrayList2, str, str2, pointF, pointF2);
        if (c == null || c.length <= 2) {
            c = null;
        } else {
            int length = c.length;
            this.f19458j.f19650c = MathUtils.calProjectionPoint(this.f19455g.get(Integer.valueOf(c[length - 3])).f19650c, this.f19455g.get(Integer.valueOf(c[length - 2])).f19650c, this.f19455g.get(Integer.valueOf(c[length - 1])).f19650c);
            c[c.length - 2] = -1;
        }
        this.f19465q = c;
    }

    /* renamed from: c */
    private int[] m26592c(ArrayList<C7112l.C7122j> arrayList, ArrayList<C7112l.C7122j> arrayList2, String str, String str2, PointF pointF, PointF pointF2) {
        int size = this.f19449a.size();
        this.f19457i.f19650c.set(pointF.x, pointF.y);
        this.f19457i.f19651d = str;
        this.f19458j.f19650c.set(pointF2.x, pointF2.y);
        this.f19458j.f19651d = str2;
        m26587a(m26585a(arrayList, this.f19457i), m26585a(arrayList2, this.f19458j), size);
        int[] route = route(this.f19449a.indexOf(0), this.f19449a.indexOf(-1), this.f19453e, C5572a.m21194a((Collection<? extends Number>) this.f19449a), size);
        m26586a(size);
        return route;
    }

    private native int[] route(int i, int i2, float[] fArr, int[] iArr, int i3);

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0082, code lost:
        return r7.f19463o;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<p299tw.navin.navinmap.map.C7112l.C7122j> mo21069a(java.util.ArrayList<p299tw.navin.navinmap.map.C7112l.C7122j> r13, java.util.ArrayList<p299tw.navin.navinmap.map.C7112l.C7122j> r14, java.lang.String r15, java.lang.String r16, android.graphics.PointF r17, android.graphics.PointF r18) {
        /*
            r12 = this;
            r7 = r12
            r0 = r15
            boolean r1 = r7.f19468t
            r8 = 0
            if (r1 != 0) goto L_0x0008
            return r8
        L_0x0008:
            monitor-enter(r12)
            boolean r1 = r7.f19468t     // Catch:{ all -> 0x0083 }
            if (r1 != 0) goto L_0x000f
            monitor-exit(r12)     // Catch:{ all -> 0x0083 }
            return r8
        L_0x000f:
            int[] r1 = r7.f19465q     // Catch:{ all -> 0x0083 }
            r9 = 2
            r10 = 1
            if (r1 == 0) goto L_0x005a
            int[] r1 = r7.f19465q     // Catch:{ all -> 0x0083 }
            int[] r2 = r7.f19465q     // Catch:{ all -> 0x0083 }
            int r2 = r2.length     // Catch:{ all -> 0x0083 }
            int r2 = r2 - r10
            int r5 = r12.m26584a((int[]) r1, (java.lang.String) r15, (int) r2)     // Catch:{ all -> 0x0083 }
            r1 = -1
            if (r5 == r1) goto L_0x005a
            int[] r1 = r7.f19465q     // Catch:{ all -> 0x0083 }
            r1 = r1[r5]     // Catch:{ all -> 0x0083 }
            java.util.HashMap<java.lang.String, tw.navin.navinmap.map.l$h> r2 = r7.f19454f     // Catch:{ all -> 0x0083 }
            java.lang.Object r2 = r2.get(r15)     // Catch:{ all -> 0x0083 }
            tw.navin.navinmap.map.l$h r2 = (p299tw.navin.navinmap.map.C7112l.C7120h) r2     // Catch:{ all -> 0x0083 }
            float r2 = r2.f19627i     // Catch:{ all -> 0x0083 }
            java.util.HashMap<java.lang.Integer, tw.navin.navinmap.map.l$j> r3 = r7.f19455g     // Catch:{ all -> 0x0083 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0083 }
            java.lang.Object r1 = r3.get(r1)     // Catch:{ all -> 0x0083 }
            tw.navin.navinmap.map.l$j r1 = (p299tw.navin.navinmap.map.C7112l.C7122j) r1     // Catch:{ all -> 0x0083 }
            android.graphics.PointF r1 = r1.f19650c     // Catch:{ all -> 0x0083 }
            r11 = r17
            float r1 = m26590b(r2, r11, r1)     // Catch:{ all -> 0x0083 }
            r2 = 1099956224(0x41900000, float:18.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x005c
            int[] r2 = r7.f19465q     // Catch:{ all -> 0x0083 }
            int[] r1 = r7.f19465q     // Catch:{ all -> 0x0083 }
            int r1 = r1.length     // Catch:{ all -> 0x0083 }
            int r6 = r1 + -2
            r1 = r12
            r3 = r15
            r4 = r17
            r1.m26589a(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0083 }
            r1 = 0
            goto L_0x005d
        L_0x005a:
            r11 = r17
        L_0x005c:
            r1 = r10
        L_0x005d:
            if (r1 == 0) goto L_0x007f
            r12.m26591b(r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0083 }
            int[] r1 = r7.f19465q     // Catch:{ all -> 0x0083 }
            if (r1 != 0) goto L_0x0068
            monitor-exit(r12)     // Catch:{ all -> 0x0083 }
            return r8
        L_0x0068:
            int[] r1 = r7.f19465q     // Catch:{ all -> 0x0083 }
            int r1 = r1.length     // Catch:{ all -> 0x0083 }
            r2 = 3
            if (r1 <= r2) goto L_0x0070
            r5 = r9
            goto L_0x0071
        L_0x0070:
            r5 = r10
        L_0x0071:
            int[] r2 = r7.f19465q     // Catch:{ all -> 0x0083 }
            int[] r1 = r7.f19465q     // Catch:{ all -> 0x0083 }
            int r1 = r1.length     // Catch:{ all -> 0x0083 }
            int r6 = r1 + -2
            r1 = r12
            r3 = r15
            r4 = r17
            r1.m26589a(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0083 }
        L_0x007f:
            monitor-exit(r12)     // Catch:{ all -> 0x0083 }
            java.util.ArrayList<tw.navin.navinmap.map.l$j> r0 = r7.f19463o
            return r0
        L_0x0083:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x0083 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p299tw.navin.navinmap.map.RouteHelper.mo21069a(java.util.ArrayList, java.util.ArrayList, java.lang.String, java.lang.String, android.graphics.PointF, android.graphics.PointF):java.util.ArrayList");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C7112l.C7122j mo21070a() {
        return this.f19464p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C7112l.C7123k mo21071a(HashMap<String, C7112l.C7120h> hashMap, ArrayList<C7112l.C7123k> arrayList, String str, PointF pointF) {
        HashMap<String, C7112l.C7120h> hashMap2 = hashMap;
        ArrayList<C7112l.C7122j> arrayList2 = hashMap2.get(str).f19632n;
        Iterator<C7112l.C7123k> it = arrayList.iterator();
        C7112l.C7123k kVar = null;
        float f = Float.MAX_VALUE;
        while (it.hasNext()) {
            C7112l.C7123k next = it.next();
            int[] c = m26592c(arrayList2, hashMap2.get(next.f19660f).f19632n, str, next.f19660f, pointF, next.f19661g);
            if (c != null && c.length > 2) {
                float f2 = 0.0f;
                int i = 0;
                while (i < c.length - 1) {
                    try {
                        C7112l.C7122j jVar = this.f19455g.get(Integer.valueOf(c[i]));
                        i++;
                        C7112l.C7122j jVar2 = this.f19455g.get(Integer.valueOf(c[i]));
                        f2 += (jVar.f19649b.equals("N") || jVar2.f19649b.equals("N") || jVar.f19651d.equals(jVar2.f19651d)) ? MathUtils.m26962a(jVar.f19650c, jVar2.f19650c) : 100000.0f;
                        if (jVar.f19652e && jVar2.f19652e) {
                            f2 += 500000.0f;
                        }
                    } catch (NullPointerException e) {
                        e.printStackTrace();
                    }
                }
                if (f2 < f) {
                    kVar = next;
                    f = f2;
                }
            }
        }
        return kVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21072a(ArrayList<C7112l.C7122j> arrayList, ArrayList<C7112l.C7121i> arrayList2, HashSet<String> hashSet) {
        this.f19450b = arrayList;
        this.f19451c = arrayList2;
        this.f19457i = new C7112l.C7122j();
        C7112l.C7122j jVar = this.f19457i;
        jVar.f19648a = 0;
        jVar.f19649b = "N";
        jVar.f19650c = new PointF();
        this.f19458j = new C7112l.C7122j();
        C7112l.C7122j jVar2 = this.f19458j;
        jVar2.f19648a = -1;
        jVar2.f19649b = "N";
        jVar2.f19650c = new PointF();
        this.f19455g = new HashMap<>();
        this.f19449a = new ArrayList<>();
        Iterator<C7112l.C7122j> it = this.f19450b.iterator();
        while (it.hasNext()) {
            C7112l.C7122j next = it.next();
            this.f19449a.add(Integer.valueOf(next.f19648a));
            this.f19455g.put(Integer.valueOf(next.f19648a), next);
        }
        this.f19455g.put(Integer.valueOf(this.f19457i.f19648a), this.f19457i);
        this.f19455g.put(Integer.valueOf(this.f19458j.f19648a), this.f19458j);
        this.f19449a.add(Integer.valueOf(this.f19457i.f19648a));
        this.f19449a.add(Integer.valueOf(this.f19458j.f19648a));
        mo21073a(hashSet);
        this.f19463o = new ArrayList<>();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21073a(HashSet<String> hashSet) {
        ArrayList<C7112l.C7121i> arrayList = new ArrayList<>();
        HashSet<Integer> hashSet2 = new HashSet<>();
        int size = this.f19449a.size();
        Iterator<C7112l.C7121i> it = this.f19451c.iterator();
        while (it.hasNext()) {
            C7112l.C7121i next = it.next();
            if (hashSet.contains(next.f19644g)) {
                arrayList.add(next);
                hashSet2.add(Integer.valueOf(next.f19639b));
            }
        }
        this.f19452d = arrayList;
        this.f19456h = hashSet2;
        float[] fArr = new float[(size * size)];
        for (int i = 0; i < size; i++) {
            for (int i2 = 0; i2 < size; i2++) {
                if (i == i2) {
                    fArr[(i * size) + i2] = 0.0f;
                } else {
                    fArr[(i * size) + i2] = -1.0f;
                }
            }
        }
        Iterator<C7112l.C7121i> it2 = this.f19452d.iterator();
        while (it2.hasNext()) {
            C7112l.C7121i next2 = it2.next();
            int indexOf = this.f19449a.indexOf(Integer.valueOf(next2.f19639b));
            int indexOf2 = this.f19449a.indexOf(Integer.valueOf(next2.f19640c));
            float a = MathUtils.m26962a(next2.f19641d.f19650c, next2.f19642e.f19650c);
            if (next2.f19644g.equals("SU") || next2.f19644g.equals("SD") || next2.f19644g.equals("ESU") || next2.f19644g.equals("ESD")) {
                if (!next2.f19641d.f19651d.equals(next2.f19642e.f19651d)) {
                    fArr[(indexOf * size) + indexOf2] = 100000.0f;
                    fArr[(indexOf2 * size) + indexOf] = -1.0f;
                } else {
                    fArr[(indexOf * size) + indexOf2] = a;
                    fArr[(indexOf2 * size) + indexOf] = -1.0f;
                }
            } else if (next2.f19644g.equals("E") || next2.f19644g.equals("DE") || next2.f19644g.equals("G") || next2.f19644g.equals("AR")) {
                if (!next2.f19641d.f19651d.equals(next2.f19642e.f19651d)) {
                    fArr[(indexOf * size) + indexOf2] = 100000.0f;
                    fArr[(indexOf2 * size) + indexOf] = 100000.0f;
                } else {
                    fArr[(indexOf * size) + indexOf2] = a;
                    fArr[(indexOf2 * size) + indexOf] = a;
                }
            } else if (!next2.f19641d.f19652e || !next2.f19642e.f19652e) {
                fArr[(indexOf * size) + indexOf2] = a;
                fArr[(indexOf2 * size) + indexOf] = a;
            } else {
                fArr[(indexOf * size) + indexOf2] = 500000.0f;
                fArr[(indexOf2 * size) + indexOf] = 500000.0f;
            }
        }
        this.f19453e = fArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21074a(boolean z) {
        synchronized (this) {
            this.f19468t = z;
            if (!this.f19468t) {
                this.f19465q = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public float mo21075b() {
        return this.f19466r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public float mo21076c() {
        return this.f19467s;
    }
}
