package android.support.constraint.p005a.p006a;

import android.support.constraint.p005a.C0064c;
import android.support.constraint.p005a.C0066e;
import android.support.constraint.p005a.p006a.C0048b;
import java.util.ArrayList;

/* renamed from: android.support.constraint.a.a.d */
public class C0053d {

    /* renamed from: a */
    public static float f243a = 0.5f;

    /* renamed from: A */
    private int f244A = 0;

    /* renamed from: B */
    protected int f245B = 0;

    /* renamed from: C */
    protected int f246C = 0;

    /* renamed from: D */
    private int f247D = 0;

    /* renamed from: E */
    private int f248E = 0;

    /* renamed from: F */
    private int f249F = 0;

    /* renamed from: G */
    private int f250G = 0;

    /* renamed from: H */
    protected int f251H = 0;

    /* renamed from: I */
    protected int f252I = 0;

    /* renamed from: J */
    int f253J = 0;

    /* renamed from: K */
    protected int f254K;

    /* renamed from: L */
    protected int f255L;

    /* renamed from: M */
    private int f256M;

    /* renamed from: N */
    private int f257N;

    /* renamed from: O */
    float f258O;

    /* renamed from: P */
    float f259P;

    /* renamed from: Q */
    C0054a f260Q;

    /* renamed from: R */
    C0054a f261R;

    /* renamed from: S */
    private Object f262S;

    /* renamed from: T */
    private int f263T;

    /* renamed from: U */
    private int f264U;

    /* renamed from: V */
    private String f265V;

    /* renamed from: W */
    private String f266W;

    /* renamed from: X */
    int f267X;

    /* renamed from: Y */
    int f268Y;

    /* renamed from: Z */
    int f269Z;

    /* renamed from: aa */
    int f270aa;

    /* renamed from: b */
    public int f271b = -1;

    /* renamed from: ba */
    boolean f272ba;

    /* renamed from: c */
    public int f273c = -1;

    /* renamed from: ca */
    boolean f274ca;

    /* renamed from: d */
    int f275d = 0;

    /* renamed from: da */
    boolean f276da;

    /* renamed from: e */
    int f277e = 0;

    /* renamed from: ea */
    boolean f278ea;

    /* renamed from: f */
    int f279f = 0;

    /* renamed from: fa */
    boolean f280fa;

    /* renamed from: g */
    int f281g = 0;

    /* renamed from: ga */
    boolean f282ga;

    /* renamed from: h */
    int f283h = 0;

    /* renamed from: ha */
    int f284ha;

    /* renamed from: i */
    int f285i = 0;

    /* renamed from: ia */
    int f286ia;

    /* renamed from: j */
    C0048b f287j = new C0048b(this, C0048b.C0051c.LEFT);

    /* renamed from: ja */
    boolean f288ja;

    /* renamed from: k */
    C0048b f289k = new C0048b(this, C0048b.C0051c.TOP);

    /* renamed from: ka */
    boolean f290ka;

    /* renamed from: l */
    C0048b f291l = new C0048b(this, C0048b.C0051c.RIGHT);

    /* renamed from: la */
    float f292la;

    /* renamed from: m */
    C0048b f293m = new C0048b(this, C0048b.C0051c.BOTTOM);

    /* renamed from: ma */
    float f294ma;

    /* renamed from: n */
    C0048b f295n = new C0048b(this, C0048b.C0051c.BASELINE);

    /* renamed from: na */
    C0053d f296na;

    /* renamed from: o */
    C0048b f297o = new C0048b(this, C0048b.C0051c.CENTER_X);

    /* renamed from: oa */
    C0053d f298oa;

    /* renamed from: p */
    C0048b f299p = new C0048b(this, C0048b.C0051c.CENTER_Y);

    /* renamed from: q */
    C0048b f300q = new C0048b(this, C0048b.C0051c.CENTER);

    /* renamed from: r */
    protected ArrayList<C0048b> f301r = new ArrayList<>();

    /* renamed from: s */
    C0053d f302s = null;

    /* renamed from: t */
    int f303t = 0;

    /* renamed from: u */
    int f304u = 0;

    /* renamed from: v */
    protected float f305v = 0.0f;

    /* renamed from: w */
    protected int f306w = -1;

    /* renamed from: x */
    private int f307x = 0;

    /* renamed from: y */
    private int f308y = 0;

    /* renamed from: z */
    private int f309z = 0;

    /* renamed from: android.support.constraint.a.a.d$a */
    public enum C0054a {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public C0053d() {
        float f = f243a;
        this.f258O = f;
        this.f259P = f;
        C0054a aVar = C0054a.FIXED;
        this.f260Q = aVar;
        this.f261R = aVar;
        this.f263T = 0;
        this.f264U = 0;
        this.f265V = null;
        this.f266W = null;
        this.f284ha = 0;
        this.f286ia = 0;
        this.f292la = 0.0f;
        this.f294ma = 0.0f;
        this.f296na = null;
        this.f298oa = null;
        mo204D();
    }

    /* renamed from: D */
    private void mo204D() {
        this.f301r.add(this.f287j);
        this.f301r.add(this.f289k);
        this.f301r.add(this.f291l);
        this.f301r.add(this.f293m);
        this.f301r.add(this.f297o);
        this.f301r.add(this.f299p);
        this.f301r.add(this.f295n);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0080, code lost:
        if (r4 != false) goto L_0x0082;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m159a(android.support.constraint.p005a.C0066e r18, boolean r19, boolean r20, android.support.constraint.p005a.p006a.C0048b r21, android.support.constraint.p005a.p006a.C0048b r22, int r23, int r24, int r25, int r26, float r27, boolean r28, boolean r29, int r30, int r31, int r32) {
        /*
            r17 = this;
            r9 = r18
            r0 = r23
            r1 = r24
            r2 = r26
            r3 = r31
            r4 = r21
            r5 = r32
            android.support.constraint.a.h r6 = r9.mo246a((java.lang.Object) r4)
            r7 = r22
            android.support.constraint.a.h r8 = r9.mo246a((java.lang.Object) r7)
            android.support.constraint.a.a.b r10 = r21.mo125g()
            android.support.constraint.a.h r10 = r9.mo246a((java.lang.Object) r10)
            android.support.constraint.a.a.b r11 = r22.mo125g()
            android.support.constraint.a.h r11 = r9.mo246a((java.lang.Object) r11)
            int r12 = r21.mo121c()
            int r13 = r22.mo121c()
            r14 = r17
            int r15 = r14.f264U
            r4 = 8
            if (r15 != r4) goto L_0x003b
            r4 = 1
            r15 = 0
            goto L_0x003f
        L_0x003b:
            r4 = r20
            r15 = r25
        L_0x003f:
            if (r10 != 0) goto L_0x0062
            if (r11 != 0) goto L_0x0062
            android.support.constraint.a.b r3 = r18.mo252b()
            r3.mo234c(r6, r0)
            r9.mo247a((android.support.constraint.p005a.C0063b) r3)
            if (r28 != 0) goto L_0x01be
            if (r19 == 0) goto L_0x0052
            goto L_0x0074
        L_0x0052:
            if (r4 == 0) goto L_0x005a
            r0 = 0
            android.support.constraint.a.b r0 = android.support.constraint.p005a.C0066e.m295a(r9, r8, r6, r15, r0)
            goto L_0x0079
        L_0x005a:
            android.support.constraint.a.b r0 = r18.mo252b()
            r0.mo234c(r8, r1)
            goto L_0x0079
        L_0x0062:
            r16 = 0
            if (r10 == 0) goto L_0x008a
            if (r11 != 0) goto L_0x008a
            android.support.constraint.a.b r0 = r18.mo252b()
            r0.mo222a(r6, r10, r12)
            r9.mo247a((android.support.constraint.p005a.C0063b) r0)
            if (r19 == 0) goto L_0x007e
        L_0x0074:
            r0 = 1
            android.support.constraint.a.b r0 = android.support.constraint.p005a.C0066e.m295a(r9, r8, r6, r2, r0)
        L_0x0079:
            r9.mo247a((android.support.constraint.p005a.C0063b) r0)
            goto L_0x01be
        L_0x007e:
            if (r28 != 0) goto L_0x01be
            if (r4 == 0) goto L_0x005a
        L_0x0082:
            android.support.constraint.a.b r0 = r18.mo252b()
            r0.mo222a(r8, r6, r15)
            goto L_0x0079
        L_0x008a:
            if (r10 != 0) goto L_0x00b3
            if (r11 == 0) goto L_0x00b3
            android.support.constraint.a.b r1 = r18.mo252b()
            int r13 = r13 * -1
            r1.mo222a(r8, r11, r13)
            r9.mo247a((android.support.constraint.p005a.C0063b) r1)
            if (r19 == 0) goto L_0x00a2
            r1 = 1
            android.support.constraint.a.b r0 = android.support.constraint.p005a.C0066e.m295a(r9, r8, r6, r2, r1)
            goto L_0x0079
        L_0x00a2:
            if (r28 != 0) goto L_0x01be
            if (r4 == 0) goto L_0x00a7
            goto L_0x0082
        L_0x00a7:
            android.support.constraint.a.b r1 = r18.mo252b()
            r1.mo234c(r6, r0)
        L_0x00ae:
            r9.mo247a((android.support.constraint.p005a.C0063b) r1)
            goto L_0x01be
        L_0x00b3:
            if (r4 == 0) goto L_0x0158
            if (r19 == 0) goto L_0x00c0
            r0 = 1
            android.support.constraint.a.b r1 = android.support.constraint.p005a.C0066e.m295a(r9, r8, r6, r2, r0)
            r9.mo247a((android.support.constraint.p005a.C0063b) r1)
            goto L_0x00ca
        L_0x00c0:
            android.support.constraint.a.b r0 = r18.mo252b()
            r0.mo222a(r8, r6, r15)
            r9.mo247a((android.support.constraint.p005a.C0063b) r0)
        L_0x00ca:
            android.support.constraint.a.a.b$b r0 = r21.mo124f()
            android.support.constraint.a.a.b$b r1 = r22.mo124f()
            if (r0 == r1) goto L_0x010d
            android.support.constraint.a.a.b$b r0 = r21.mo124f()
            android.support.constraint.a.a.b$b r1 = android.support.constraint.p005a.p006a.C0048b.C0050b.STRONG
            if (r0 != r1) goto L_0x00f4
            android.support.constraint.a.b r0 = r18.mo252b()
            r0.mo222a(r6, r10, r12)
            r9.mo247a((android.support.constraint.p005a.C0063b) r0)
            android.support.constraint.a.h r0 = r18.mo254c()
            android.support.constraint.a.b r1 = r18.mo252b()
            int r13 = r13 * -1
            r1.mo231b(r8, r11, r0, r13)
            goto L_0x00ae
        L_0x00f4:
            android.support.constraint.a.h r0 = r18.mo254c()
            android.support.constraint.a.b r1 = r18.mo252b()
            r1.mo225a((android.support.constraint.p005a.C0069h) r6, (android.support.constraint.p005a.C0069h) r10, (android.support.constraint.p005a.C0069h) r0, (int) r12)
            r9.mo247a((android.support.constraint.p005a.C0063b) r1)
        L_0x0102:
            android.support.constraint.a.b r0 = r18.mo252b()
            int r13 = r13 * -1
            r0.mo222a(r8, r11, r13)
            goto L_0x0079
        L_0x010d:
            if (r10 != r11) goto L_0x012c
            r0 = 0
            r1 = 1056964608(0x3f000000, float:0.5)
            r2 = 0
            r3 = 1
            r19 = r18
            r20 = r6
            r21 = r10
            r22 = r0
            r23 = r1
            r24 = r11
            r25 = r8
            r26 = r2
            r27 = r3
            android.support.constraint.a.b r0 = android.support.constraint.p005a.C0066e.m294a(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0079
        L_0x012c:
            if (r29 != 0) goto L_0x01be
            android.support.constraint.a.a.b$a r0 = r21.mo120b()
            android.support.constraint.a.a.b$a r1 = android.support.constraint.p005a.p006a.C0048b.C0049a.STRICT
            if (r0 == r1) goto L_0x0138
            r0 = 1
            goto L_0x013a
        L_0x0138:
            r0 = r16
        L_0x013a:
            android.support.constraint.a.b r0 = android.support.constraint.p005a.C0066e.m300b(r9, r6, r10, r12, r0)
            r9.mo247a((android.support.constraint.p005a.C0063b) r0)
            android.support.constraint.a.a.b$a r0 = r22.mo120b()
            android.support.constraint.a.a.b$a r1 = android.support.constraint.p005a.p006a.C0048b.C0049a.STRICT
            if (r0 == r1) goto L_0x014b
            r0 = 1
            goto L_0x014d
        L_0x014b:
            r0 = r16
        L_0x014d:
            int r1 = r13 * -1
            android.support.constraint.a.b r0 = android.support.constraint.p005a.C0066e.m303c(r9, r8, r11, r1, r0)
            r9.mo247a((android.support.constraint.p005a.C0063b) r0)
            r15 = 0
            goto L_0x0164
        L_0x0158:
            r0 = 3
            if (r28 == 0) goto L_0x0175
            r9.mo253b(r6, r10, r12, r0)
            int r1 = r13 * -1
            r9.mo255c(r8, r11, r1, r0)
            r15 = 1
        L_0x0164:
            r0 = r18
            r1 = r6
            r2 = r10
            r3 = r12
            r4 = r27
            r5 = r11
            r6 = r8
            r7 = r13
            r8 = r15
            android.support.constraint.a.b r0 = android.support.constraint.p005a.C0066e.m294a(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0079
        L_0x0175:
            if (r29 != 0) goto L_0x01be
            r1 = 2
            r2 = r30
            r4 = 1
            if (r2 != r4) goto L_0x018e
            if (r3 <= r15) goto L_0x0180
            goto L_0x0181
        L_0x0180:
            r3 = r15
        L_0x0181:
            if (r5 <= 0) goto L_0x018a
            if (r5 >= r3) goto L_0x0187
            r3 = r5
            goto L_0x018a
        L_0x0187:
            r9.mo255c(r8, r6, r5, r0)
        L_0x018a:
            r9.mo244a(r8, r6, r3, r0)
            goto L_0x01a3
        L_0x018e:
            if (r3 != 0) goto L_0x019e
            if (r5 != 0) goto L_0x019e
            android.support.constraint.a.b r0 = r18.mo252b()
            r0.mo222a(r6, r10, r12)
            r9.mo247a((android.support.constraint.p005a.C0063b) r0)
            goto L_0x0102
        L_0x019e:
            if (r5 <= 0) goto L_0x01a3
            r9.mo255c(r8, r6, r5, r0)
        L_0x01a3:
            r9.mo253b(r6, r10, r12, r1)
            int r0 = -r13
            r9.mo255c(r8, r11, r0, r1)
            r0 = 4
            r19 = r6
            r20 = r10
            r21 = r12
            r22 = r27
            r23 = r11
            r24 = r8
            r25 = r13
            r26 = r0
            r18.mo250a(r19, r20, r21, r22, r23, r24, r25, r26)
        L_0x01be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p005a.p006a.C0053d.m159a(android.support.constraint.a.e, boolean, boolean, android.support.constraint.a.a.b, android.support.constraint.a.a.b, int, int, int, int, float, boolean, boolean, int, int, int):void");
    }

    /* renamed from: A */
    public void mo130A() {
        this.f287j.mo128j();
        this.f289k.mo128j();
        this.f291l.mo128j();
        this.f293m.mo128j();
        this.f295n.mo128j();
        this.f297o.mo128j();
        this.f299p.mo128j();
        this.f300q.mo128j();
        this.f302s = null;
        this.f303t = 0;
        this.f304u = 0;
        this.f305v = 0.0f;
        this.f306w = -1;
        this.f245B = 0;
        this.f246C = 0;
        this.f247D = 0;
        this.f248E = 0;
        this.f249F = 0;
        this.f250G = 0;
        this.f251H = 0;
        this.f252I = 0;
        this.f253J = 0;
        this.f254K = 0;
        this.f255L = 0;
        this.f256M = 0;
        this.f257N = 0;
        float f = f243a;
        this.f258O = f;
        this.f259P = f;
        C0054a aVar = C0054a.FIXED;
        this.f260Q = aVar;
        this.f261R = aVar;
        this.f262S = null;
        this.f263T = 0;
        this.f264U = 0;
        this.f265V = null;
        this.f266W = null;
        this.f280fa = false;
        this.f282ga = false;
        this.f284ha = 0;
        this.f286ia = 0;
        this.f288ja = false;
        this.f290ka = false;
        this.f292la = 0.0f;
        this.f294ma = 0.0f;
        this.f271b = -1;
        this.f273c = -1;
    }

    /* renamed from: B */
    public void mo131B() {
        C0053d n = mo179n();
        if (n == null || !(n instanceof C0055e) || !((C0055e) mo179n()).mo194G()) {
            int size = this.f301r.size();
            for (int i = 0; i < size; i++) {
                this.f301r.get(i).mo128j();
            }
        }
    }

    /* renamed from: C */
    public void mo132C() {
        int i = this.f245B;
        int i2 = this.f246C;
        this.f247D = i;
        this.f248E = i2;
        this.f249F = (this.f303t + i) - i;
        this.f250G = (this.f304u + i2) - i2;
    }

    /* renamed from: a */
    public C0048b mo133a(C0048b.C0051c cVar) {
        switch (C0052c.f242a[cVar.ordinal()]) {
            case 1:
                return this.f287j;
            case 2:
                return this.f289k;
            case 3:
                return this.f291l;
            case 4:
                return this.f293m;
            case 5:
                return this.f295n;
            case 6:
                return this.f297o;
            case 7:
                return this.f299p;
            case 8:
                return this.f300q;
            default:
                return null;
        }
    }

    /* renamed from: a */
    public ArrayList<C0048b> mo134a() {
        return this.f301r;
    }

    /* renamed from: a */
    public void mo135a(float f) {
        this.f258O = f;
    }

    /* renamed from: a */
    public void mo136a(int i) {
        this.f253J = i;
    }

    /* renamed from: a */
    public void mo137a(int i, int i2) {
        this.f245B = i;
        this.f303t = i2 - i;
        int i3 = this.f303t;
        int i4 = this.f254K;
        if (i3 < i4) {
            this.f303t = i4;
        }
    }

    /* renamed from: a */
    public void mo138a(int i, int i2, int i3) {
        this.f275d = i;
        this.f279f = i2;
        this.f281g = i3;
    }

    /* renamed from: a */
    public void mo139a(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        this.f245B = i;
        this.f246C = i2;
        if (this.f264U == 8) {
            this.f303t = 0;
            this.f304u = 0;
            return;
        }
        if (this.f260Q != C0054a.FIXED || i7 >= (i5 = this.f303t)) {
            i5 = i7;
        }
        if (this.f261R != C0054a.FIXED || i8 >= (i6 = this.f304u)) {
            i6 = i8;
        }
        this.f303t = i5;
        this.f304u = i6;
        int i9 = this.f304u;
        int i10 = this.f255L;
        if (i9 < i10) {
            this.f304u = i10;
        }
        int i11 = this.f303t;
        int i12 = this.f254K;
        if (i11 < i12) {
            this.f303t = i12;
        }
    }

    /* renamed from: a */
    public void mo140a(C0048b.C0051c cVar, C0053d dVar, C0048b.C0051c cVar2, int i, int i2) {
        mo133a(cVar).mo118a(dVar.mo133a(cVar2), i, i2, C0048b.C0050b.STRONG, 0, true);
    }

    /* renamed from: a */
    public void mo141a(C0054a aVar) {
        this.f260Q = aVar;
        if (this.f260Q == C0054a.WRAP_CONTENT) {
            mo169h(this.f256M);
        }
    }

    /* renamed from: a */
    public void mo142a(C0053d dVar) {
        this.f302s = dVar;
    }

    /* renamed from: a */
    public void mo143a(C0064c cVar) {
        this.f287j.mo116a(cVar);
        this.f289k.mo116a(cVar);
        this.f291l.mo116a(cVar);
        this.f293m.mo116a(cVar);
        this.f295n.mo116a(cVar);
        this.f300q.mo116a(cVar);
        this.f297o.mo116a(cVar);
        this.f299p.mo116a(cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:208:0x03a7, code lost:
        if (r14 == -1) goto L_0x03ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x04d0, code lost:
        if (r9.f293m.f224j == r12) goto L_0x04db;
     */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0263 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0379  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0390 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0391  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x03b7  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x04b3  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x0566  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x05e8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo144a(android.support.constraint.p005a.C0066e r37, int r38) {
        /*
            r36 = this;
            r15 = r36
            r14 = r37
            r13 = r38
            r0 = 0
            r12 = 2147483647(0x7fffffff, float:NaN)
            if (r13 == r12) goto L_0x0015
            android.support.constraint.a.a.b r1 = r15.f287j
            int r1 = r1.f224j
            if (r1 != r13) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r11 = r0
            goto L_0x001c
        L_0x0015:
            android.support.constraint.a.a.b r1 = r15.f287j
            android.support.constraint.a.h r1 = r14.mo246a((java.lang.Object) r1)
            r11 = r1
        L_0x001c:
            if (r13 == r12) goto L_0x0027
            android.support.constraint.a.a.b r1 = r15.f291l
            int r1 = r1.f224j
            if (r1 != r13) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r10 = r0
            goto L_0x002e
        L_0x0027:
            android.support.constraint.a.a.b r1 = r15.f291l
            android.support.constraint.a.h r1 = r14.mo246a((java.lang.Object) r1)
            r10 = r1
        L_0x002e:
            if (r13 == r12) goto L_0x0039
            android.support.constraint.a.a.b r1 = r15.f289k
            int r1 = r1.f224j
            if (r1 != r13) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r9 = r0
            goto L_0x0040
        L_0x0039:
            android.support.constraint.a.a.b r1 = r15.f289k
            android.support.constraint.a.h r1 = r14.mo246a((java.lang.Object) r1)
            r9 = r1
        L_0x0040:
            if (r13 == r12) goto L_0x004b
            android.support.constraint.a.a.b r1 = r15.f293m
            int r1 = r1.f224j
            if (r1 != r13) goto L_0x0049
            goto L_0x004b
        L_0x0049:
            r8 = r0
            goto L_0x0052
        L_0x004b:
            android.support.constraint.a.a.b r1 = r15.f293m
            android.support.constraint.a.h r1 = r14.mo246a((java.lang.Object) r1)
            r8 = r1
        L_0x0052:
            if (r13 == r12) goto L_0x005a
            android.support.constraint.a.a.b r1 = r15.f295n
            int r1 = r1.f224j
            if (r1 != r13) goto L_0x0060
        L_0x005a:
            android.support.constraint.a.a.b r0 = r15.f295n
            android.support.constraint.a.h r0 = r14.mo246a((java.lang.Object) r0)
        L_0x0060:
            r7 = r0
            android.support.constraint.a.a.d r0 = r15.f302s
            r6 = 0
            r5 = 1
            if (r0 == 0) goto L_0x0174
            android.support.constraint.a.a.b r0 = r15.f287j
            android.support.constraint.a.a.b r1 = r0.f217c
            if (r1 == 0) goto L_0x0071
            android.support.constraint.a.a.b r1 = r1.f217c
            if (r1 == r0) goto L_0x007b
        L_0x0071:
            android.support.constraint.a.a.b r0 = r15.f291l
            android.support.constraint.a.a.b r1 = r0.f217c
            if (r1 == 0) goto L_0x0084
            android.support.constraint.a.a.b r1 = r1.f217c
            if (r1 != r0) goto L_0x0084
        L_0x007b:
            android.support.constraint.a.a.d r0 = r15.f302s
            android.support.constraint.a.a.e r0 = (android.support.constraint.p005a.p006a.C0055e) r0
            r0.mo197a((android.support.constraint.p005a.p006a.C0053d) r15, (int) r6)
            r0 = r5
            goto L_0x0085
        L_0x0084:
            r0 = r6
        L_0x0085:
            android.support.constraint.a.a.b r1 = r15.f289k
            android.support.constraint.a.a.b r2 = r1.f217c
            if (r2 == 0) goto L_0x008f
            android.support.constraint.a.a.b r2 = r2.f217c
            if (r2 == r1) goto L_0x0099
        L_0x008f:
            android.support.constraint.a.a.b r1 = r15.f293m
            android.support.constraint.a.a.b r2 = r1.f217c
            if (r2 == 0) goto L_0x00a2
            android.support.constraint.a.a.b r2 = r2.f217c
            if (r2 != r1) goto L_0x00a2
        L_0x0099:
            android.support.constraint.a.a.d r1 = r15.f302s
            android.support.constraint.a.a.e r1 = (android.support.constraint.p005a.p006a.C0055e) r1
            r1.mo197a((android.support.constraint.p005a.p006a.C0053d) r15, (int) r5)
            r1 = r5
            goto L_0x00a3
        L_0x00a2:
            r1 = r6
        L_0x00a3:
            android.support.constraint.a.a.d r2 = r15.f302s
            android.support.constraint.a.a.d$a r2 = r2.mo174k()
            android.support.constraint.a.a.d$a r3 = android.support.constraint.p005a.p006a.C0053d.C0054a.WRAP_CONTENT
            if (r2 != r3) goto L_0x0109
            if (r0 != 0) goto L_0x0109
            android.support.constraint.a.a.b r2 = r15.f287j
            android.support.constraint.a.a.b r3 = r2.f217c
            if (r3 == 0) goto L_0x00c6
            android.support.constraint.a.a.d r4 = r3.f215a
            android.support.constraint.a.a.d r5 = r15.f302s
            if (r4 == r5) goto L_0x00bc
            goto L_0x00c6
        L_0x00bc:
            if (r3 == 0) goto L_0x00dc
            if (r4 != r5) goto L_0x00dc
            android.support.constraint.a.a.b$a r3 = android.support.constraint.p005a.p006a.C0048b.C0049a.STRICT
            r2.mo115a((android.support.constraint.p005a.p006a.C0048b.C0049a) r3)
            goto L_0x00dc
        L_0x00c6:
            android.support.constraint.a.a.d r2 = r15.f302s
            android.support.constraint.a.a.b r2 = r2.f287j
            android.support.constraint.a.h r2 = r14.mo246a((java.lang.Object) r2)
            android.support.constraint.a.b r3 = r37.mo252b()
            android.support.constraint.a.h r4 = r37.mo254c()
            r3.mo225a((android.support.constraint.p005a.C0069h) r11, (android.support.constraint.p005a.C0069h) r2, (android.support.constraint.p005a.C0069h) r4, (int) r6)
            r14.mo247a((android.support.constraint.p005a.C0063b) r3)
        L_0x00dc:
            android.support.constraint.a.a.b r2 = r15.f291l
            android.support.constraint.a.a.b r3 = r2.f217c
            if (r3 == 0) goto L_0x00f3
            android.support.constraint.a.a.d r4 = r3.f215a
            android.support.constraint.a.a.d r5 = r15.f302s
            if (r4 == r5) goto L_0x00e9
            goto L_0x00f3
        L_0x00e9:
            if (r3 == 0) goto L_0x0109
            if (r4 != r5) goto L_0x0109
            android.support.constraint.a.a.b$a r3 = android.support.constraint.p005a.p006a.C0048b.C0049a.STRICT
            r2.mo115a((android.support.constraint.p005a.p006a.C0048b.C0049a) r3)
            goto L_0x0109
        L_0x00f3:
            android.support.constraint.a.a.d r2 = r15.f302s
            android.support.constraint.a.a.b r2 = r2.f291l
            android.support.constraint.a.h r2 = r14.mo246a((java.lang.Object) r2)
            android.support.constraint.a.b r3 = r37.mo252b()
            android.support.constraint.a.h r4 = r37.mo254c()
            r3.mo225a((android.support.constraint.p005a.C0069h) r2, (android.support.constraint.p005a.C0069h) r10, (android.support.constraint.p005a.C0069h) r4, (int) r6)
            r14.mo247a((android.support.constraint.p005a.C0063b) r3)
        L_0x0109:
            android.support.constraint.a.a.d r2 = r15.f302s
            android.support.constraint.a.a.d$a r2 = r2.mo183r()
            android.support.constraint.a.a.d$a r3 = android.support.constraint.p005a.p006a.C0053d.C0054a.WRAP_CONTENT
            if (r2 != r3) goto L_0x016f
            if (r1 != 0) goto L_0x016f
            android.support.constraint.a.a.b r2 = r15.f289k
            android.support.constraint.a.a.b r3 = r2.f217c
            if (r3 == 0) goto L_0x012c
            android.support.constraint.a.a.d r4 = r3.f215a
            android.support.constraint.a.a.d r5 = r15.f302s
            if (r4 == r5) goto L_0x0122
            goto L_0x012c
        L_0x0122:
            if (r3 == 0) goto L_0x0142
            if (r4 != r5) goto L_0x0142
            android.support.constraint.a.a.b$a r3 = android.support.constraint.p005a.p006a.C0048b.C0049a.STRICT
            r2.mo115a((android.support.constraint.p005a.p006a.C0048b.C0049a) r3)
            goto L_0x0142
        L_0x012c:
            android.support.constraint.a.a.d r2 = r15.f302s
            android.support.constraint.a.a.b r2 = r2.f289k
            android.support.constraint.a.h r2 = r14.mo246a((java.lang.Object) r2)
            android.support.constraint.a.b r3 = r37.mo252b()
            android.support.constraint.a.h r4 = r37.mo254c()
            r3.mo225a((android.support.constraint.p005a.C0069h) r9, (android.support.constraint.p005a.C0069h) r2, (android.support.constraint.p005a.C0069h) r4, (int) r6)
            r14.mo247a((android.support.constraint.p005a.C0063b) r3)
        L_0x0142:
            android.support.constraint.a.a.b r2 = r15.f293m
            android.support.constraint.a.a.b r3 = r2.f217c
            if (r3 == 0) goto L_0x0159
            android.support.constraint.a.a.d r4 = r3.f215a
            android.support.constraint.a.a.d r5 = r15.f302s
            if (r4 == r5) goto L_0x014f
            goto L_0x0159
        L_0x014f:
            if (r3 == 0) goto L_0x016f
            if (r4 != r5) goto L_0x016f
            android.support.constraint.a.a.b$a r3 = android.support.constraint.p005a.p006a.C0048b.C0049a.STRICT
            r2.mo115a((android.support.constraint.p005a.p006a.C0048b.C0049a) r3)
            goto L_0x016f
        L_0x0159:
            android.support.constraint.a.a.d r2 = r15.f302s
            android.support.constraint.a.a.b r2 = r2.f293m
            android.support.constraint.a.h r2 = r14.mo246a((java.lang.Object) r2)
            android.support.constraint.a.b r3 = r37.mo252b()
            android.support.constraint.a.h r4 = r37.mo254c()
            r3.mo225a((android.support.constraint.p005a.C0069h) r2, (android.support.constraint.p005a.C0069h) r8, (android.support.constraint.p005a.C0069h) r4, (int) r6)
            r14.mo247a((android.support.constraint.p005a.C0063b) r3)
        L_0x016f:
            r17 = r0
            r18 = r1
            goto L_0x0178
        L_0x0174:
            r17 = r6
            r18 = r17
        L_0x0178:
            int r0 = r15.f303t
            int r1 = r15.f254K
            if (r0 >= r1) goto L_0x017f
            r0 = r1
        L_0x017f:
            int r1 = r15.f304u
            int r2 = r15.f255L
            if (r1 >= r2) goto L_0x0186
            r1 = r2
        L_0x0186:
            android.support.constraint.a.a.d$a r2 = r15.f260Q
            android.support.constraint.a.a.d$a r3 = android.support.constraint.p005a.p006a.C0053d.C0054a.MATCH_CONSTRAINT
            if (r2 == r3) goto L_0x018e
            r5 = 1
            goto L_0x018f
        L_0x018e:
            r5 = r6
        L_0x018f:
            android.support.constraint.a.a.d$a r2 = r15.f261R
            android.support.constraint.a.a.d$a r3 = android.support.constraint.p005a.p006a.C0053d.C0054a.MATCH_CONSTRAINT
            if (r2 == r3) goto L_0x0197
            r2 = 1
            goto L_0x0198
        L_0x0197:
            r2 = r6
        L_0x0198:
            if (r5 != 0) goto L_0x01ab
            android.support.constraint.a.a.b r3 = r15.f287j
            if (r3 == 0) goto L_0x01ab
            android.support.constraint.a.a.b r4 = r15.f291l
            if (r4 == 0) goto L_0x01ab
            android.support.constraint.a.a.b r3 = r3.f217c
            if (r3 == 0) goto L_0x01aa
            android.support.constraint.a.a.b r3 = r4.f217c
            if (r3 != 0) goto L_0x01ab
        L_0x01aa:
            r5 = 1
        L_0x01ab:
            if (r2 != 0) goto L_0x01d0
            android.support.constraint.a.a.b r3 = r15.f289k
            if (r3 == 0) goto L_0x01d0
            android.support.constraint.a.a.b r4 = r15.f293m
            if (r4 == 0) goto L_0x01d0
            android.support.constraint.a.a.b r3 = r3.f217c
            if (r3 == 0) goto L_0x01bd
            android.support.constraint.a.a.b r3 = r4.f217c
            if (r3 != 0) goto L_0x01d0
        L_0x01bd:
            int r3 = r15.f253J
            if (r3 == 0) goto L_0x01cf
            android.support.constraint.a.a.b r3 = r15.f295n
            if (r3 == 0) goto L_0x01d0
            android.support.constraint.a.a.b r4 = r15.f289k
            android.support.constraint.a.a.b r4 = r4.f217c
            if (r4 == 0) goto L_0x01cf
            android.support.constraint.a.a.b r3 = r3.f217c
            if (r3 != 0) goto L_0x01d0
        L_0x01cf:
            r2 = 1
        L_0x01d0:
            int r3 = r15.f306w
            float r4 = r15.f305v
            r19 = 0
            int r19 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            r20 = r8
            r8 = -1
            if (r19 <= 0) goto L_0x0256
            int r6 = r15.f264U
            r12 = 8
            if (r6 == r12) goto L_0x0256
            android.support.constraint.a.a.d$a r6 = r15.f260Q
            android.support.constraint.a.a.d$a r12 = android.support.constraint.p005a.p006a.C0053d.C0054a.MATCH_CONSTRAINT
            r22 = 1065353216(0x3f800000, float:1.0)
            if (r6 != r12) goto L_0x0226
            android.support.constraint.a.a.d$a r6 = r15.f261R
            if (r6 != r12) goto L_0x0226
            if (r5 == 0) goto L_0x01fd
            if (r2 != 0) goto L_0x01fd
            r23 = r0
            r6 = r1
            r24 = r2
            r25 = r4
            r3 = r5
            r12 = 0
            goto L_0x0223
        L_0x01fd:
            if (r5 != 0) goto L_0x021a
            if (r2 == 0) goto L_0x021a
            int r3 = r15.f306w
            if (r3 != r8) goto L_0x0210
            float r22 = r22 / r4
            r23 = r0
            r6 = r1
            r24 = r2
            r3 = r5
            r25 = r22
            goto L_0x0218
        L_0x0210:
            r23 = r0
            r6 = r1
            r24 = r2
            r25 = r4
            r3 = r5
        L_0x0218:
            r12 = 1
            goto L_0x0223
        L_0x021a:
            r23 = r0
            r6 = r1
            r24 = r2
            r12 = r3
            r25 = r4
            r3 = r5
        L_0x0223:
            r22 = 1
            goto L_0x0261
        L_0x0226:
            android.support.constraint.a.a.d$a r6 = r15.f260Q
            android.support.constraint.a.a.d$a r12 = android.support.constraint.p005a.p006a.C0053d.C0054a.MATCH_CONSTRAINT
            if (r6 != r12) goto L_0x023b
            int r0 = r15.f304u
            float r0 = (float) r0
            float r0 = r0 * r4
            int r0 = (int) r0
            r23 = r0
            r6 = r1
            r24 = r2
            r25 = r4
            r3 = 1
            r12 = 0
            goto L_0x025f
        L_0x023b:
            android.support.constraint.a.a.d$a r6 = r15.f261R
            if (r6 != r12) goto L_0x0256
            int r1 = r15.f306w
            if (r1 != r8) goto L_0x0245
            float r4 = r22 / r4
        L_0x0245:
            int r1 = r15.f303t
            float r1 = (float) r1
            float r1 = r1 * r4
            int r1 = (int) r1
            r23 = r0
            r6 = r1
            r25 = r4
            r3 = r5
            r12 = 1
            r22 = 0
            r24 = 1
            goto L_0x0261
        L_0x0256:
            r23 = r0
            r6 = r1
            r24 = r2
            r12 = r3
            r25 = r4
            r3 = r5
        L_0x025f:
            r22 = 0
        L_0x0261:
            if (r22 == 0) goto L_0x026a
            if (r12 == 0) goto L_0x0267
            if (r12 != r8) goto L_0x026a
        L_0x0267:
            r26 = 1
            goto L_0x026c
        L_0x026a:
            r26 = 0
        L_0x026c:
            android.support.constraint.a.a.d$a r0 = r15.f260Q
            android.support.constraint.a.a.d$a r1 = android.support.constraint.p005a.p006a.C0053d.C0054a.WRAP_CONTENT
            if (r0 != r1) goto L_0x0278
            boolean r0 = r15 instanceof android.support.constraint.p005a.p006a.C0055e
            if (r0 == 0) goto L_0x0278
            r2 = 1
            goto L_0x0279
        L_0x0278:
            r2 = 0
        L_0x0279:
            int r0 = r15.f271b
            r5 = 2
            r4 = 3
            if (r0 == r5) goto L_0x0379
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r13 == r1) goto L_0x02a3
            android.support.constraint.a.a.b r0 = r15.f287j
            int r0 = r0.f224j
            if (r0 != r13) goto L_0x0291
            android.support.constraint.a.a.b r0 = r15.f291l
            int r0 = r0.f224j
            if (r0 != r13) goto L_0x0291
            goto L_0x02a3
        L_0x0291:
            r29 = r6
            r30 = r7
            r32 = r9
            r23 = r10
            r27 = r11
            r33 = r12
            r31 = r20
            r16 = 0
            goto L_0x038b
        L_0x02a3:
            if (r26 == 0) goto L_0x0333
            android.support.constraint.a.a.b r0 = r15.f287j
            android.support.constraint.a.a.b r1 = r0.f217c
            if (r1 == 0) goto L_0x0327
            android.support.constraint.a.a.b r1 = r15.f291l
            android.support.constraint.a.a.b r1 = r1.f217c
            if (r1 == 0) goto L_0x0327
            android.support.constraint.a.h r1 = r14.mo246a((java.lang.Object) r0)
            android.support.constraint.a.a.b r0 = r15.f291l
            android.support.constraint.a.h r3 = r14.mo246a((java.lang.Object) r0)
            android.support.constraint.a.a.b r0 = r15.f287j
            android.support.constraint.a.a.b r0 = r0.mo125g()
            android.support.constraint.a.h r2 = r14.mo246a((java.lang.Object) r0)
            android.support.constraint.a.a.b r0 = r15.f291l
            android.support.constraint.a.a.b r0 = r0.mo125g()
            android.support.constraint.a.h r0 = r14.mo246a((java.lang.Object) r0)
            android.support.constraint.a.a.b r5 = r15.f287j
            int r5 = r5.mo121c()
            r14.mo253b(r1, r2, r5, r4)
            android.support.constraint.a.a.b r5 = r15.f291l
            int r5 = r5.mo121c()
            int r5 = r5 * r8
            r14.mo255c(r3, r0, r5, r4)
            if (r17 != 0) goto L_0x0312
            android.support.constraint.a.a.b r5 = r15.f287j
            int r5 = r5.mo121c()
            float r4 = r15.f258O
            android.support.constraint.a.a.b r8 = r15.f291l
            int r8 = r8.mo121c()
            r17 = 4
            r23 = r0
            r0 = r37
            r21 = 2147483647(0x7fffffff, float:NaN)
            r26 = r3
            r3 = r5
            r5 = 3
            r5 = r23
            r29 = r6
            r16 = 0
            r6 = r26
            r30 = r7
            r7 = r8
            r31 = r20
            r8 = r17
            r0.mo250a(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x031d
        L_0x0312:
            r29 = r6
            r30 = r7
            r31 = r20
            r16 = 0
            r21 = 2147483647(0x7fffffff, float:NaN)
        L_0x031d:
            r32 = r9
            r23 = r10
            r27 = r11
            r33 = r12
            goto L_0x038b
        L_0x0327:
            r29 = r6
            r30 = r7
            r31 = r20
            r16 = 0
            r21 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x033d
        L_0x0333:
            r21 = r1
            r29 = r6
            r30 = r7
            r31 = r20
            r16 = 0
        L_0x033d:
            android.support.constraint.a.a.b r4 = r15.f287j
            android.support.constraint.a.a.b r5 = r15.f291l
            int r6 = r15.f245B
            int r7 = r6 + r23
            int r8 = r15.f254K
            float r1 = r15.f258O
            int r0 = r15.f275d
            int r14 = r15.f279f
            r19 = r14
            int r14 = r15.f281g
            r20 = r0
            r0 = r36
            r27 = r1
            r1 = r37
            r28 = r8
            r8 = r23
            r32 = r9
            r9 = r28
            r23 = r10
            r10 = r27
            r27 = r11
            r11 = r26
            r33 = r12
            r12 = r17
            r13 = r20
            r17 = r14
            r14 = r19
            r15 = r17
            r0.m159a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0389
        L_0x0379:
            r29 = r6
            r30 = r7
            r32 = r9
            r23 = r10
            r27 = r11
            r33 = r12
            r31 = r20
            r16 = 0
        L_0x0389:
            r15 = r36
        L_0x038b:
            int r0 = r15.f273c
            r1 = 2
            if (r0 != r1) goto L_0x0391
            return
        L_0x0391:
            android.support.constraint.a.a.d$a r0 = r15.f261R
            android.support.constraint.a.a.d$a r1 = android.support.constraint.p005a.p006a.C0053d.C0054a.WRAP_CONTENT
            if (r0 != r1) goto L_0x039d
            boolean r0 = r15 instanceof android.support.constraint.p005a.p006a.C0055e
            if (r0 == 0) goto L_0x039d
            r2 = 1
            goto L_0x039f
        L_0x039d:
            r2 = r16
        L_0x039f:
            if (r22 == 0) goto L_0x03ad
            r14 = r33
            r13 = 1
            if (r14 == r13) goto L_0x03aa
            r0 = -1
            if (r14 != r0) goto L_0x03b1
            goto L_0x03ab
        L_0x03aa:
            r0 = -1
        L_0x03ab:
            r11 = r13
            goto L_0x03b3
        L_0x03ad:
            r14 = r33
            r0 = -1
            r13 = 1
        L_0x03b1:
            r11 = r16
        L_0x03b3:
            int r1 = r15.f253J
            if (r1 <= 0) goto L_0x04b3
            android.support.constraint.a.a.b r1 = r15.f293m
            r12 = 5
            r10 = r38
            r9 = 2147483647(0x7fffffff, float:NaN)
            if (r10 == r9) goto L_0x03d1
            int r3 = r1.f224j
            if (r3 != r10) goto L_0x03cc
            android.support.constraint.a.a.b r3 = r15.f295n
            int r3 = r3.f224j
            if (r3 != r10) goto L_0x03cc
            goto L_0x03d1
        L_0x03cc:
            r8 = r37
            r7 = r32
            goto L_0x03de
        L_0x03d1:
            int r3 = r36.mo147b()
            r8 = r37
            r4 = r30
            r7 = r32
            r8.mo244a(r4, r7, r3, r12)
        L_0x03de:
            android.support.constraint.a.a.b r3 = r15.f295n
            android.support.constraint.a.a.b r4 = r3.f217c
            if (r4 == 0) goto L_0x03ea
            int r1 = r15.f253J
            r16 = r1
            r5 = r3
            goto L_0x03ed
        L_0x03ea:
            r5 = r1
            r16 = r29
        L_0x03ed:
            if (r10 == r9) goto L_0x0402
            android.support.constraint.a.a.b r1 = r15.f289k
            int r1 = r1.f224j
            if (r1 != r10) goto L_0x03fa
            int r1 = r5.f224j
            if (r1 != r10) goto L_0x03fa
            goto L_0x0402
        L_0x03fa:
            r15 = r8
            r35 = r14
            r13 = r31
            r14 = r7
            goto L_0x04d3
        L_0x0402:
            if (r11 == 0) goto L_0x046c
            android.support.constraint.a.a.b r1 = r15.f289k
            android.support.constraint.a.a.b r3 = r1.f217c
            if (r3 == 0) goto L_0x046c
            android.support.constraint.a.a.b r3 = r15.f293m
            android.support.constraint.a.a.b r3 = r3.f217c
            if (r3 == 0) goto L_0x046c
            android.support.constraint.a.h r1 = r8.mo246a((java.lang.Object) r1)
            android.support.constraint.a.a.b r2 = r15.f293m
            android.support.constraint.a.h r6 = r8.mo246a((java.lang.Object) r2)
            android.support.constraint.a.a.b r2 = r15.f289k
            android.support.constraint.a.a.b r2 = r2.mo125g()
            android.support.constraint.a.h r2 = r8.mo246a((java.lang.Object) r2)
            android.support.constraint.a.a.b r3 = r15.f293m
            android.support.constraint.a.a.b r3 = r3.mo125g()
            android.support.constraint.a.h r5 = r8.mo246a((java.lang.Object) r3)
            android.support.constraint.a.a.b r3 = r15.f289k
            int r3 = r3.mo121c()
            r11 = 3
            r8.mo253b(r1, r2, r3, r11)
            android.support.constraint.a.a.b r3 = r15.f293m
            int r3 = r3.mo121c()
            int r3 = r3 * r0
            r8.mo255c(r6, r5, r3, r11)
            if (r18 != 0) goto L_0x0460
            android.support.constraint.a.a.b r0 = r15.f289k
            int r3 = r0.mo121c()
            float r4 = r15.f259P
            android.support.constraint.a.a.b r0 = r15.f293m
            int r12 = r0.mo121c()
            r16 = 4
            r0 = r37
            r34 = r7
            r7 = r12
            r12 = r8
            r8 = r16
            r0.mo250a(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0463
        L_0x0460:
            r34 = r7
            r12 = r8
        L_0x0463:
            r15 = r12
            r35 = r14
            r13 = r31
            r14 = r34
            goto L_0x04d3
        L_0x046c:
            r34 = r7
            r7 = 3
            android.support.constraint.a.a.b r4 = r15.f289k
            int r6 = r15.f246C
            int r17 = r6 + r16
            int r3 = r15.f255L
            float r1 = r15.f259P
            int r0 = r15.f277e
            r33 = r14
            int r14 = r15.f283h
            r19 = r14
            int r14 = r15.f285i
            r20 = r0
            r0 = r36
            r21 = r1
            r1 = r37
            r26 = r3
            r3 = r24
            r7 = r17
            r8 = r16
            r9 = r26
            r10 = r21
            r12 = r18
            r13 = r20
            r16 = r14
            r35 = r33
            r14 = r19
            r15 = r16
            r0.m159a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r15 = r37
            r8 = r29
            r13 = r31
            r14 = r34
            r0 = 5
            r15.mo244a(r13, r14, r8, r0)
            goto L_0x04d3
        L_0x04b3:
            r15 = r37
            r12 = r38
            r35 = r14
            r8 = r29
            r13 = r31
            r14 = r32
            r10 = 2147483647(0x7fffffff, float:NaN)
            if (r12 == r10) goto L_0x04d9
            r9 = r36
            android.support.constraint.a.a.b r1 = r9.f289k
            int r1 = r1.f224j
            if (r1 != r12) goto L_0x04d3
            android.support.constraint.a.a.b r1 = r9.f293m
            int r1 = r1.f224j
            if (r1 != r12) goto L_0x04d3
            goto L_0x04db
        L_0x04d3:
            r31 = r13
            r34 = r14
            goto L_0x0564
        L_0x04d9:
            r9 = r36
        L_0x04db:
            if (r11 == 0) goto L_0x0532
            android.support.constraint.a.a.b r1 = r9.f289k
            android.support.constraint.a.a.b r3 = r1.f217c
            if (r3 == 0) goto L_0x0532
            android.support.constraint.a.a.b r3 = r9.f293m
            android.support.constraint.a.a.b r3 = r3.f217c
            if (r3 == 0) goto L_0x0532
            android.support.constraint.a.h r1 = r15.mo246a((java.lang.Object) r1)
            android.support.constraint.a.a.b r2 = r9.f293m
            android.support.constraint.a.h r6 = r15.mo246a((java.lang.Object) r2)
            android.support.constraint.a.a.b r2 = r9.f289k
            android.support.constraint.a.a.b r2 = r2.mo125g()
            android.support.constraint.a.h r2 = r15.mo246a((java.lang.Object) r2)
            android.support.constraint.a.a.b r3 = r9.f293m
            android.support.constraint.a.a.b r3 = r3.mo125g()
            android.support.constraint.a.h r5 = r15.mo246a((java.lang.Object) r3)
            android.support.constraint.a.a.b r3 = r9.f289k
            int r3 = r3.mo121c()
            r11 = 3
            r15.mo253b(r1, r2, r3, r11)
            android.support.constraint.a.a.b r3 = r9.f293m
            int r3 = r3.mo121c()
            int r3 = r3 * r0
            r15.mo255c(r6, r5, r3, r11)
            if (r18 != 0) goto L_0x04d3
            android.support.constraint.a.a.b r0 = r9.f289k
            int r3 = r0.mo121c()
            float r4 = r9.f259P
            android.support.constraint.a.a.b r0 = r9.f293m
            int r7 = r0.mo121c()
            r8 = 4
            r0 = r37
            r0.mo250a(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x04d3
        L_0x0532:
            r7 = 3
            android.support.constraint.a.a.b r4 = r9.f289k
            android.support.constraint.a.a.b r5 = r9.f293m
            int r6 = r9.f246C
            int r16 = r6 + r8
            int r3 = r9.f255L
            float r1 = r9.f259P
            int r0 = r9.f277e
            r32 = r14
            int r14 = r9.f283h
            int r15 = r9.f285i
            r17 = r0
            r0 = r36
            r19 = r1
            r1 = r37
            r20 = r3
            r3 = r24
            r7 = r16
            r9 = r20
            r10 = r19
            r12 = r18
            r31 = r13
            r13 = r17
            r34 = r32
            r0.m159a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
        L_0x0564:
            if (r22 == 0) goto L_0x05e8
            android.support.constraint.a.b r0 = r37.mo252b()
            r1 = r38
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r2) goto L_0x0580
            r8 = r36
            android.support.constraint.a.a.b r2 = r8.f287j
            int r2 = r2.f224j
            if (r2 != r1) goto L_0x05ea
            android.support.constraint.a.a.b r2 = r8.f291l
            int r2 = r2.f224j
            if (r2 != r1) goto L_0x05ea
            goto L_0x0582
        L_0x0580:
            r8 = r36
        L_0x0582:
            r3 = r35
            if (r3 != 0) goto L_0x059a
            r2 = r0
            r3 = r23
            r4 = r27
            r5 = r31
            r6 = r34
            r7 = r25
            r2.mo226a(r3, r4, r5, r6, r7)
            r1 = r37
        L_0x0596:
            r1.mo247a((android.support.constraint.p005a.C0063b) r0)
            goto L_0x05ea
        L_0x059a:
            r1 = r37
            r2 = 1
            if (r3 != r2) goto L_0x05ae
            r2 = r0
            r3 = r31
            r4 = r34
            r5 = r23
            r6 = r27
            r7 = r25
            r2.mo226a(r3, r4, r5, r6, r7)
            goto L_0x0596
        L_0x05ae:
            int r2 = r8.f279f
            if (r2 <= 0) goto L_0x05bb
            r3 = r23
            r4 = r27
            r5 = 3
            r1.mo253b(r3, r4, r2, r5)
            goto L_0x05c0
        L_0x05bb:
            r3 = r23
            r4 = r27
            r5 = 3
        L_0x05c0:
            int r2 = r8.f283h
            if (r2 <= 0) goto L_0x05cc
            r7 = r31
            r6 = r34
            r1.mo253b(r7, r6, r2, r5)
            goto L_0x05d0
        L_0x05cc:
            r7 = r31
            r6 = r34
        L_0x05d0:
            r9 = 4
            r2 = r0
            r5 = r7
            r7 = r25
            r2.mo226a(r3, r4, r5, r6, r7)
            android.support.constraint.a.h r2 = r37.mo245a()
            android.support.constraint.a.h r3 = r37.mo245a()
            r2.f384d = r9
            r3.f384d = r9
            r0.mo221a((android.support.constraint.p005a.C0069h) r2, (android.support.constraint.p005a.C0069h) r3)
            goto L_0x0596
        L_0x05e8:
            r8 = r36
        L_0x05ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p005a.p006a.C0053d.mo144a(android.support.constraint.a.e, int):void");
    }

    /* renamed from: a */
    public void mo145a(Object obj) {
        this.f262S = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo146a(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x008e
            int r1 = r9.length()
            if (r1 != 0) goto L_0x000b
            goto L_0x008e
        L_0x000b:
            r1 = -1
            int r2 = r9.length()
            r3 = 44
            int r3 = r9.indexOf(r3)
            r4 = 0
            r5 = 1
            if (r3 <= 0) goto L_0x0037
            int r6 = r2 + -1
            if (r3 >= r6) goto L_0x0037
            java.lang.String r6 = r9.substring(r4, r3)
            java.lang.String r7 = "W"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L_0x002c
            r1 = r4
            goto L_0x0035
        L_0x002c:
            java.lang.String r4 = "H"
            boolean r4 = r6.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0035
            r1 = r5
        L_0x0035:
            int r4 = r3 + 1
        L_0x0037:
            r3 = 58
            int r3 = r9.indexOf(r3)
            if (r3 < 0) goto L_0x0075
            int r2 = r2 - r5
            if (r3 >= r2) goto L_0x0075
            java.lang.String r2 = r9.substring(r4, r3)
            int r3 = r3 + r5
            java.lang.String r9 = r9.substring(r3)
            int r3 = r2.length()
            if (r3 <= 0) goto L_0x0084
            int r3 = r9.length()
            if (r3 <= 0) goto L_0x0084
            float r2 = java.lang.Float.parseFloat(r2)     // Catch:{ NumberFormatException -> 0x0084 }
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0084
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0084
            if (r1 != r5) goto L_0x006f
            float r9 = r9 / r2
            float r9 = java.lang.Math.abs(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x006f:
            float r2 = r2 / r9
            float r9 = java.lang.Math.abs(r2)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x0075:
            java.lang.String r9 = r9.substring(r4)
            int r2 = r9.length()
            if (r2 <= 0) goto L_0x0084
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x0084:
            r9 = r0
        L_0x0085:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x008d
            r8.f305v = r9
            r8.f306w = r1
        L_0x008d:
            return
        L_0x008e:
            r8.f305v = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p005a.p006a.C0053d.mo146a(java.lang.String):void");
    }

    /* renamed from: b */
    public int mo147b() {
        return this.f253J;
    }

    /* renamed from: b */
    public void mo148b(float f) {
        this.f292la = f;
    }

    /* renamed from: b */
    public void mo149b(int i) {
        this.f304u = i;
        int i2 = this.f304u;
        int i3 = this.f255L;
        if (i2 < i3) {
            this.f304u = i3;
        }
    }

    /* renamed from: b */
    public void mo150b(int i, int i2) {
        this.f251H = i;
        this.f252I = i2;
    }

    /* renamed from: b */
    public void mo151b(int i, int i2, int i3) {
        this.f277e = i;
        this.f283h = i2;
        this.f285i = i3;
    }

    /* renamed from: b */
    public void mo152b(C0054a aVar) {
        this.f261R = aVar;
        if (this.f261R == C0054a.WRAP_CONTENT) {
            mo149b(this.f257N);
        }
    }

    /* renamed from: b */
    public void mo153b(C0066e eVar, int i) {
        if (i == Integer.MAX_VALUE) {
            mo139a(eVar.mo251b((Object) this.f287j), eVar.mo251b((Object) this.f289k), eVar.mo251b((Object) this.f291l), eVar.mo251b((Object) this.f293m));
        } else if (i == -2) {
            mo139a(this.f307x, this.f308y, this.f309z, this.f244A);
        } else {
            C0048b bVar = this.f287j;
            if (bVar.f224j == i) {
                this.f307x = eVar.mo251b((Object) bVar);
            }
            C0048b bVar2 = this.f289k;
            if (bVar2.f224j == i) {
                this.f308y = eVar.mo251b((Object) bVar2);
            }
            C0048b bVar3 = this.f291l;
            if (bVar3.f224j == i) {
                this.f309z = eVar.mo251b((Object) bVar3);
            }
            C0048b bVar4 = this.f293m;
            if (bVar4.f224j == i) {
                this.f244A = eVar.mo251b((Object) bVar4);
            }
        }
    }

    /* renamed from: c */
    public int mo154c() {
        return mo190x() + this.f304u;
    }

    /* renamed from: c */
    public void mo155c(float f) {
        this.f259P = f;
    }

    /* renamed from: c */
    public void mo156c(int i) {
        this.f284ha = i;
    }

    /* renamed from: c */
    public void mo157c(int i, int i2) {
        this.f245B = i;
        this.f246C = i2;
    }

    /* renamed from: d */
    public Object mo158d() {
        return this.f262S;
    }

    /* renamed from: d */
    public void mo159d(float f) {
        this.f294ma = f;
    }

    /* renamed from: d */
    public void mo160d(int i) {
        if (i < 0) {
            i = 0;
        }
        this.f255L = i;
    }

    /* renamed from: d */
    public void mo161d(int i, int i2) {
        this.f246C = i;
        this.f304u = i2 - i;
        int i3 = this.f304u;
        int i4 = this.f255L;
        if (i3 < i4) {
            this.f304u = i4;
        }
    }

    /* renamed from: e */
    public String mo162e() {
        return this.f265V;
    }

    /* renamed from: e */
    public void mo163e(int i) {
        if (i < 0) {
            i = 0;
        }
        this.f254K = i;
    }

    /* renamed from: f */
    public int mo164f() {
        return mo170i() + this.f250G;
    }

    /* renamed from: f */
    public void mo165f(int i) {
        this.f286ia = i;
    }

    /* renamed from: g */
    public int mo166g() {
        return mo168h() + this.f249F;
    }

    /* renamed from: g */
    public void mo167g(int i) {
        this.f264U = i;
    }

    /* renamed from: h */
    public int mo168h() {
        return this.f247D + this.f251H;
    }

    /* renamed from: h */
    public void mo169h(int i) {
        this.f303t = i;
        int i2 = this.f303t;
        int i3 = this.f254K;
        if (i2 < i3) {
            this.f303t = i3;
        }
    }

    /* renamed from: i */
    public int mo170i() {
        return this.f248E + this.f252I;
    }

    /* renamed from: i */
    public void mo171i(int i) {
        this.f257N = i;
    }

    /* renamed from: j */
    public int mo172j() {
        if (this.f264U == 8) {
            return 0;
        }
        return this.f304u;
    }

    /* renamed from: j */
    public void mo173j(int i) {
        this.f256M = i;
    }

    /* renamed from: k */
    public C0054a mo174k() {
        return this.f260Q;
    }

    /* renamed from: k */
    public void mo175k(int i) {
        this.f245B = i;
    }

    /* renamed from: l */
    public int mo176l() {
        int i;
        int i2 = this.f304u;
        if (this.f261R != C0054a.MATCH_CONSTRAINT) {
            return i2;
        }
        if (this.f277e == 1) {
            i = Math.max(this.f283h, i2);
        } else {
            i = this.f283h;
            if (i > 0) {
                this.f304u = i;
            } else {
                i = 0;
            }
        }
        int i3 = this.f285i;
        return (i3 <= 0 || i3 >= i) ? i : i3;
    }

    /* renamed from: l */
    public void mo177l(int i) {
        this.f246C = i;
    }

    /* renamed from: m */
    public int mo178m() {
        int i;
        int i2 = this.f303t;
        if (this.f260Q != C0054a.MATCH_CONSTRAINT) {
            return i2;
        }
        if (this.f275d == 1) {
            i = Math.max(this.f279f, i2);
        } else {
            i = this.f279f;
            if (i > 0) {
                this.f303t = i;
            } else {
                i = 0;
            }
        }
        int i3 = this.f281g;
        return (i3 <= 0 || i3 >= i) ? i : i3;
    }

    /* renamed from: n */
    public C0053d mo179n() {
        return this.f302s;
    }

    /* renamed from: o */
    public int mo180o() {
        return mo189w() + this.f303t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public int mo181p() {
        return this.f245B + this.f251H;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public int mo182q() {
        return this.f246C + this.f252I;
    }

    /* renamed from: r */
    public C0054a mo183r() {
        return this.f261R;
    }

    /* renamed from: s */
    public int mo184s() {
        return this.f264U;
    }

    /* renamed from: t */
    public int mo185t() {
        if (this.f264U == 8) {
            return 0;
        }
        return this.f303t;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.f266W != null) {
            str = "type: " + this.f266W + " ";
        } else {
            str = str2;
        }
        sb.append(str);
        if (this.f265V != null) {
            str2 = "id: " + this.f265V + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.f245B);
        sb.append(", ");
        sb.append(this.f246C);
        sb.append(") - (");
        sb.append(this.f303t);
        sb.append(" x ");
        sb.append(this.f304u);
        sb.append(")");
        sb.append(" wrap: (");
        sb.append(this.f256M);
        sb.append(" x ");
        sb.append(this.f257N);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: u */
    public int mo187u() {
        return this.f257N;
    }

    /* renamed from: v */
    public int mo188v() {
        return this.f256M;
    }

    /* renamed from: w */
    public int mo189w() {
        return this.f245B;
    }

    /* renamed from: x */
    public int mo190x() {
        return this.f246C;
    }

    /* renamed from: y */
    public boolean mo191y() {
        return this.f253J > 0;
    }

    /* renamed from: z */
    public boolean mo192z() {
        return this.f302s == null;
    }
}
