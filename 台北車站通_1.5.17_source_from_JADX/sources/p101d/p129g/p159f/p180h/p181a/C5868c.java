package p101d.p129g.p159f.p180h.p181a;

import p101d.p129g.p159f.C5882i;
import p101d.p129g.p159f.C5919o;
import p101d.p129g.p159f.p167c.C5775b;

/* renamed from: d.g.f.h.a.c */
final class C5868c {

    /* renamed from: a */
    private C5775b f16231a;

    /* renamed from: b */
    private C5919o f16232b;

    /* renamed from: c */
    private C5919o f16233c;

    /* renamed from: d */
    private C5919o f16234d;

    /* renamed from: e */
    private C5919o f16235e;

    /* renamed from: f */
    private int f16236f;

    /* renamed from: g */
    private int f16237g;

    /* renamed from: h */
    private int f16238h;

    /* renamed from: i */
    private int f16239i;

    C5868c(C5775b bVar, C5919o oVar, C5919o oVar2, C5919o oVar3, C5919o oVar4) {
        if (!(oVar == null && oVar3 == null) && (!(oVar2 == null && oVar4 == null) && ((oVar == null || oVar2 != null) && (oVar3 == null || oVar4 != null)))) {
            m22197a(bVar, oVar, oVar2, oVar3, oVar4);
            return;
        }
        throw C5882i.m22303a();
    }

    C5868c(C5868c cVar) {
        m22197a(cVar.f16231a, cVar.f16232b, cVar.f16233c, cVar.f16234d, cVar.f16235e);
    }

    /* renamed from: a */
    static C5868c m22196a(C5868c cVar, C5868c cVar2) {
        return cVar == null ? cVar2 : cVar2 == null ? cVar : new C5868c(cVar.f16231a, cVar.f16232b, cVar.f16233c, cVar2.f16234d, cVar2.f16235e);
    }

    /* renamed from: a */
    private void m22197a(C5775b bVar, C5919o oVar, C5919o oVar2, C5919o oVar3, C5919o oVar4) {
        this.f16231a = bVar;
        this.f16232b = oVar;
        this.f16233c = oVar2;
        this.f16234d = oVar3;
        this.f16235e = oVar4;
        m22198i();
    }

    /* renamed from: i */
    private void m22198i() {
        if (this.f16232b == null) {
            this.f16232b = new C5919o(0.0f, this.f16234d.mo15703b());
            this.f16233c = new C5919o(0.0f, this.f16235e.mo15703b());
        } else if (this.f16234d == null) {
            this.f16234d = new C5919o((float) (this.f16231a.mo15397h() - 1), this.f16232b.mo15703b());
            this.f16235e = new C5919o((float) (this.f16231a.mo15397h() - 1), this.f16233c.mo15703b());
        }
        this.f16236f = (int) Math.min(this.f16232b.mo15702a(), this.f16233c.mo15702a());
        this.f16237g = (int) Math.max(this.f16234d.mo15702a(), this.f16235e.mo15702a());
        this.f16238h = (int) Math.min(this.f16232b.mo15703b(), this.f16234d.mo15703b());
        this.f16239i = (int) Math.max(this.f16233c.mo15703b(), this.f16235e.mo15703b());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p101d.p129g.p159f.p180h.p181a.C5868c mo15596a(int r13, int r14, boolean r15) {
        /*
            r12 = this;
            d.g.f.o r0 = r12.f16232b
            d.g.f.o r1 = r12.f16233c
            d.g.f.o r2 = r12.f16234d
            d.g.f.o r3 = r12.f16235e
            if (r13 <= 0) goto L_0x0029
            if (r15 == 0) goto L_0x000e
            r4 = r0
            goto L_0x000f
        L_0x000e:
            r4 = r2
        L_0x000f:
            float r5 = r4.mo15703b()
            int r5 = (int) r5
            int r5 = r5 - r13
            if (r5 >= 0) goto L_0x0018
            r5 = 0
        L_0x0018:
            d.g.f.o r13 = new d.g.f.o
            float r4 = r4.mo15702a()
            float r5 = (float) r5
            r13.<init>(r4, r5)
            if (r15 == 0) goto L_0x0026
            r8 = r13
            goto L_0x002a
        L_0x0026:
            r10 = r13
            r8 = r0
            goto L_0x002b
        L_0x0029:
            r8 = r0
        L_0x002a:
            r10 = r2
        L_0x002b:
            if (r14 <= 0) goto L_0x005b
            if (r15 == 0) goto L_0x0032
            d.g.f.o r13 = r12.f16233c
            goto L_0x0034
        L_0x0032:
            d.g.f.o r13 = r12.f16235e
        L_0x0034:
            float r0 = r13.mo15703b()
            int r0 = (int) r0
            int r0 = r0 + r14
            d.g.f.c.b r14 = r12.f16231a
            int r14 = r14.mo15395f()
            if (r0 < r14) goto L_0x004a
            d.g.f.c.b r14 = r12.f16231a
            int r14 = r14.mo15395f()
            int r0 = r14 + -1
        L_0x004a:
            d.g.f.o r14 = new d.g.f.o
            float r13 = r13.mo15702a()
            float r0 = (float) r0
            r14.<init>(r13, r0)
            if (r15 == 0) goto L_0x0058
            r9 = r14
            goto L_0x005c
        L_0x0058:
            r11 = r14
            r9 = r1
            goto L_0x005d
        L_0x005b:
            r9 = r1
        L_0x005c:
            r11 = r3
        L_0x005d:
            r12.m22198i()
            d.g.f.h.a.c r13 = new d.g.f.h.a.c
            d.g.f.c.b r7 = r12.f16231a
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p129g.p159f.p180h.p181a.C5868c.mo15596a(int, int, boolean):d.g.f.h.a.c");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C5919o mo15597a() {
        return this.f16233c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C5919o mo15598b() {
        return this.f16235e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo15599c() {
        return this.f16237g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo15600d() {
        return this.f16239i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo15601e() {
        return this.f16236f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo15602f() {
        return this.f16238h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C5919o mo15603g() {
        return this.f16232b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C5919o mo15604h() {
        return this.f16234d;
    }
}
