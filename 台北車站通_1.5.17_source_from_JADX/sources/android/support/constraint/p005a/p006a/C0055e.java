package android.support.constraint.p005a.p006a;

import android.support.constraint.p005a.C0066e;
import android.support.constraint.p005a.p006a.C0053d;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: android.support.constraint.a.a.e */
public class C0055e extends C0062k {

    /* renamed from: Aa */
    private int f315Aa = 0;

    /* renamed from: Ba */
    private C0053d[] f316Ba = new C0053d[4];

    /* renamed from: Ca */
    private C0053d[] f317Ca = new C0053d[4];

    /* renamed from: Da */
    private C0053d[] f318Da = new C0053d[4];

    /* renamed from: Ea */
    private int f319Ea = 2;

    /* renamed from: Fa */
    private boolean[] f320Fa = new boolean[3];

    /* renamed from: Ga */
    private C0053d[] f321Ga = new C0053d[4];

    /* renamed from: Ha */
    private boolean f322Ha = false;

    /* renamed from: Ia */
    private boolean f323Ia = false;

    /* renamed from: qa */
    protected C0066e f324qa = new C0066e();

    /* renamed from: ra */
    protected C0066e f325ra = null;

    /* renamed from: sa */
    private C0060j f326sa;

    /* renamed from: ta */
    int f327ta;

    /* renamed from: ua */
    int f328ua;

    /* renamed from: va */
    int f329va;

    /* renamed from: wa */
    int f330wa;

    /* renamed from: xa */
    int f331xa;

    /* renamed from: ya */
    int f332ya;

    /* renamed from: za */
    private int f333za = 0;

    /* renamed from: J */
    private void m222J() {
        this.f333za = 0;
        this.f315Aa = 0;
    }

    /* renamed from: a */
    private int m223a(C0066e eVar, C0053d[] dVarArr, C0053d dVar, int i, boolean[] zArr) {
        int i2;
        char c;
        C0053d.C0054a aVar;
        char c2;
        C0053d.C0054a aVar2;
        C0066e eVar2 = eVar;
        C0053d dVar2 = dVar;
        zArr[0] = true;
        zArr[1] = false;
        C0053d dVar3 = null;
        dVarArr[0] = null;
        dVarArr[2] = null;
        dVarArr[1] = null;
        dVarArr[3] = null;
        float f = 0.0f;
        int i3 = 5;
        if (i == 0) {
            C0048b bVar = dVar2.f287j.f217c;
            boolean z = bVar == null || bVar.f215a == this;
            dVar2.f296na = null;
            i2 = 0;
            C0053d dVar4 = null;
            C0053d dVar5 = dVar.mo184s() != 8 ? dVar2 : null;
            C0053d dVar6 = dVar5;
            C0053d dVar7 = dVar2;
            while (dVar7.f291l.f217c != null) {
                dVar7.f296na = dVar3;
                if (dVar7.mo184s() != 8) {
                    if (dVar5 == null) {
                        dVar5 = dVar7;
                    }
                    if (!(dVar6 == null || dVar6 == dVar7)) {
                        dVar6.f296na = dVar7;
                    }
                    dVar6 = dVar7;
                } else {
                    C0048b bVar2 = dVar7.f287j;
                    eVar2.mo244a(bVar2.f223i, bVar2.f217c.f223i, 0, 5);
                    eVar2.mo244a(dVar7.f291l.f223i, dVar7.f287j.f223i, 0, 5);
                }
                if (dVar7.mo184s() != 8 && dVar7.f260Q == (aVar2 = C0053d.C0054a.MATCH_CONSTRAINT)) {
                    if (dVar7.f261R == aVar2) {
                        zArr[0] = false;
                    }
                    if (dVar7.f305v <= f) {
                        zArr[0] = false;
                        int i4 = i2 + 1;
                        C0053d[] dVarArr2 = this.f316Ba;
                        if (i4 >= dVarArr2.length) {
                            this.f316Ba = (C0053d[]) Arrays.copyOf(dVarArr2, dVarArr2.length * 2);
                        }
                        this.f316Ba[i2] = dVar7;
                        i2 = i4;
                    }
                }
                C0053d dVar8 = dVar7.f291l.f217c.f215a;
                C0048b bVar3 = dVar8.f287j.f217c;
                if (bVar3 == null || bVar3.f215a != dVar7 || dVar8 == dVar7) {
                    break;
                }
                dVar4 = dVar8;
                dVar7 = dVar4;
                dVar3 = null;
                f = 0.0f;
            }
            C0048b bVar4 = dVar7.f291l.f217c;
            if (!(bVar4 == null || bVar4.f215a == this)) {
                z = false;
            }
            if (dVar2.f287j.f217c == null || dVar4.f291l.f217c == null) {
                c2 = 1;
                zArr[1] = true;
            } else {
                c2 = 1;
            }
            dVar2.f288ja = z;
            dVar4.f296na = null;
            dVarArr[0] = dVar2;
            dVarArr[2] = dVar5;
            dVarArr[c2] = dVar4;
            dVarArr[3] = dVar6;
        } else {
            C0048b bVar5 = dVar2.f289k.f217c;
            boolean z2 = bVar5 == null || bVar5.f215a == this;
            C0053d dVar9 = null;
            dVar2.f298oa = null;
            int i5 = 0;
            C0053d dVar10 = null;
            C0053d dVar11 = dVar.mo184s() != 8 ? dVar2 : null;
            C0053d dVar12 = dVar11;
            C0053d dVar13 = dVar2;
            while (dVar13.f293m.f217c != null) {
                dVar13.f298oa = dVar9;
                if (dVar13.mo184s() != 8) {
                    if (dVar11 == null) {
                        dVar11 = dVar13;
                    }
                    if (!(dVar12 == null || dVar12 == dVar13)) {
                        dVar12.f298oa = dVar13;
                    }
                    dVar12 = dVar13;
                } else {
                    C0048b bVar6 = dVar13.f289k;
                    eVar2.mo244a(bVar6.f223i, bVar6.f217c.f223i, 0, i3);
                    eVar2.mo244a(dVar13.f293m.f223i, dVar13.f289k.f223i, 0, i3);
                }
                if (dVar13.mo184s() != 8 && dVar13.f261R == (aVar = C0053d.C0054a.MATCH_CONSTRAINT)) {
                    if (dVar13.f260Q == aVar) {
                        zArr[0] = false;
                    }
                    if (dVar13.f305v <= 0.0f) {
                        zArr[0] = false;
                        int i6 = i5 + 1;
                        C0053d[] dVarArr3 = this.f316Ba;
                        if (i6 >= dVarArr3.length) {
                            this.f316Ba = (C0053d[]) Arrays.copyOf(dVarArr3, dVarArr3.length * 2);
                        }
                        this.f316Ba[i5] = dVar13;
                        i5 = i6;
                    }
                }
                C0053d dVar14 = dVar13.f293m.f217c.f215a;
                C0048b bVar7 = dVar14.f289k.f217c;
                if (bVar7 == null || bVar7.f215a != dVar13 || dVar14 == dVar13) {
                    break;
                }
                dVar13 = dVar14;
                dVar10 = dVar13;
                dVar9 = null;
                i3 = 5;
            }
            i2 = i5;
            C0048b bVar8 = dVar13.f293m.f217c;
            if (!(bVar8 == null || bVar8.f215a == this)) {
                z2 = false;
            }
            if (dVar2.f289k.f217c == null || dVar10.f293m.f217c == null) {
                c = 1;
                zArr[1] = true;
            } else {
                c = 1;
            }
            dVar2.f290ka = z2;
            dVar10.f298oa = null;
            dVarArr[0] = dVar2;
            dVarArr[2] = dVar11;
            dVarArr[c] = dVar10;
            dVarArr[3] = dVar12;
        }
        return i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:195:0x042b  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x042d A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m224a(android.support.constraint.p005a.C0066e r31) {
        /*
            r30 = this;
            r6 = r30
            r15 = r31
            r14 = 0
            r13 = r14
        L_0x0006:
            int r0 = r6.f333za
            if (r13 >= r0) goto L_0x0488
            android.support.constraint.a.a.d[] r0 = r6.f318Da
            r12 = r0[r13]
            android.support.constraint.a.a.d[] r2 = r6.f321Ga
            r3 = r0[r13]
            r4 = 0
            boolean[] r5 = r6.f320Fa
            r0 = r30
            r1 = r31
            int r0 = r0.m223a(r1, r2, r3, r4, r5)
            android.support.constraint.a.a.d[] r1 = r6.f321Ga
            r2 = 2
            r1 = r1[r2]
            if (r1 != 0) goto L_0x002a
        L_0x0024:
            r4 = r13
            r21 = r14
            r3 = r15
            goto L_0x047f
        L_0x002a:
            boolean[] r3 = r6.f320Fa
            r4 = 1
            boolean r3 = r3[r4]
            if (r3 == 0) goto L_0x0055
            int r0 = r12.mo168h()
        L_0x0035:
            if (r1 == 0) goto L_0x0024
            android.support.constraint.a.a.b r2 = r1.f287j
            android.support.constraint.a.h r2 = r2.f223i
            r15.mo249a((android.support.constraint.p005a.C0069h) r2, (int) r0)
            android.support.constraint.a.a.d r2 = r1.f296na
            android.support.constraint.a.a.b r3 = r1.f287j
            int r3 = r3.mo121c()
            int r4 = r1.mo185t()
            int r3 = r3 + r4
            android.support.constraint.a.a.b r1 = r1.f291l
            int r1 = r1.mo121c()
            int r3 = r3 + r1
            int r0 = r0 + r3
            r1 = r2
            goto L_0x0035
        L_0x0055:
            int r3 = r12.f284ha
            if (r3 != 0) goto L_0x005b
            r3 = r4
            goto L_0x005c
        L_0x005b:
            r3 = r14
        L_0x005c:
            int r5 = r12.f284ha
            if (r5 != r2) goto L_0x0062
            r5 = r4
            goto L_0x0063
        L_0x0062:
            r5 = r14
        L_0x0063:
            android.support.constraint.a.a.d$a r7 = r6.f260Q
            android.support.constraint.a.a.d$a r8 = android.support.constraint.p005a.p006a.C0053d.C0054a.WRAP_CONTENT
            if (r7 != r8) goto L_0x006b
            r7 = r4
            goto L_0x006c
        L_0x006b:
            r7 = r14
        L_0x006c:
            int r8 = r6.f319Ea
            if (r8 == r2) goto L_0x0074
            r9 = 8
            if (r8 != r9) goto L_0x008a
        L_0x0074:
            boolean[] r8 = r6.f320Fa
            boolean r8 = r8[r14]
            if (r8 == 0) goto L_0x008a
            boolean r8 = r12.f288ja
            if (r8 == 0) goto L_0x008a
            if (r5 != 0) goto L_0x008a
            if (r7 != 0) goto L_0x008a
            int r7 = r12.f284ha
            if (r7 != 0) goto L_0x008a
            android.support.constraint.p005a.p006a.C0058h.m253a(r6, r15, r0, r12)
            goto L_0x0024
        L_0x008a:
            r11 = 3
            r16 = 0
            if (r0 == 0) goto L_0x02d6
            if (r5 == 0) goto L_0x0093
            goto L_0x02d6
        L_0x0093:
            r3 = 0
            r5 = r16
        L_0x0096:
            if (r1 == 0) goto L_0x0140
            android.support.constraint.a.a.d$a r7 = r1.f260Q
            android.support.constraint.a.a.d$a r8 = android.support.constraint.p005a.p006a.C0053d.C0054a.MATCH_CONSTRAINT
            if (r7 == r8) goto L_0x00fe
            android.support.constraint.a.a.b r7 = r1.f287j
            int r7 = r7.mo121c()
            if (r5 == 0) goto L_0x00ad
            android.support.constraint.a.a.b r5 = r5.f291l
            int r5 = r5.mo121c()
            int r7 = r7 + r5
        L_0x00ad:
            android.support.constraint.a.a.b r5 = r1.f287j
            android.support.constraint.a.a.b r5 = r5.f217c
            android.support.constraint.a.a.d r5 = r5.f215a
            android.support.constraint.a.a.d$a r5 = r5.f260Q
            android.support.constraint.a.a.d$a r8 = android.support.constraint.p005a.p006a.C0053d.C0054a.MATCH_CONSTRAINT
            if (r5 != r8) goto L_0x00bb
            r5 = r2
            goto L_0x00bc
        L_0x00bb:
            r5 = r11
        L_0x00bc:
            android.support.constraint.a.a.b r8 = r1.f287j
            android.support.constraint.a.h r9 = r8.f223i
            android.support.constraint.a.a.b r8 = r8.f217c
            android.support.constraint.a.h r8 = r8.f223i
            r15.mo253b(r9, r8, r7, r5)
            android.support.constraint.a.a.b r5 = r1.f291l
            int r5 = r5.mo121c()
            android.support.constraint.a.a.b r7 = r1.f291l
            android.support.constraint.a.a.b r7 = r7.f217c
            android.support.constraint.a.a.d r7 = r7.f215a
            android.support.constraint.a.a.b r7 = r7.f287j
            android.support.constraint.a.a.b r8 = r7.f217c
            if (r8 == 0) goto L_0x00e2
            android.support.constraint.a.a.d r8 = r8.f215a
            if (r8 != r1) goto L_0x00e2
            int r7 = r7.mo121c()
            int r5 = r5 + r7
        L_0x00e2:
            android.support.constraint.a.a.b r7 = r1.f291l
            android.support.constraint.a.a.b r7 = r7.f217c
            android.support.constraint.a.a.d r7 = r7.f215a
            android.support.constraint.a.a.d$a r7 = r7.f260Q
            android.support.constraint.a.a.d$a r8 = android.support.constraint.p005a.p006a.C0053d.C0054a.MATCH_CONSTRAINT
            if (r7 != r8) goto L_0x00f0
            r7 = r2
            goto L_0x00f1
        L_0x00f0:
            r7 = r11
        L_0x00f1:
            android.support.constraint.a.a.b r8 = r1.f291l
            android.support.constraint.a.h r9 = r8.f223i
            android.support.constraint.a.a.b r8 = r8.f217c
            android.support.constraint.a.h r8 = r8.f223i
            int r5 = -r5
            r15.mo255c(r9, r8, r5, r7)
            goto L_0x0137
        L_0x00fe:
            float r5 = r1.f292la
            float r3 = r3 + r5
            android.support.constraint.a.a.b r5 = r1.f291l
            android.support.constraint.a.a.b r7 = r5.f217c
            if (r7 == 0) goto L_0x011f
            int r5 = r5.mo121c()
            android.support.constraint.a.a.d[] r7 = r6.f321Ga
            r7 = r7[r11]
            if (r1 == r7) goto L_0x0120
            android.support.constraint.a.a.b r7 = r1.f291l
            android.support.constraint.a.a.b r7 = r7.f217c
            android.support.constraint.a.a.d r7 = r7.f215a
            android.support.constraint.a.a.b r7 = r7.f287j
            int r7 = r7.mo121c()
            int r5 = r5 + r7
            goto L_0x0120
        L_0x011f:
            r5 = r14
        L_0x0120:
            android.support.constraint.a.a.b r7 = r1.f291l
            android.support.constraint.a.h r7 = r7.f223i
            android.support.constraint.a.a.b r8 = r1.f287j
            android.support.constraint.a.h r8 = r8.f223i
            r15.mo253b(r7, r8, r14, r4)
            android.support.constraint.a.a.b r7 = r1.f291l
            android.support.constraint.a.h r8 = r7.f223i
            android.support.constraint.a.a.b r7 = r7.f217c
            android.support.constraint.a.h r7 = r7.f223i
            int r5 = -r5
            r15.mo255c(r8, r7, r5, r4)
        L_0x0137:
            android.support.constraint.a.a.d r5 = r1.f296na
            r29 = r5
            r5 = r1
            r1 = r29
            goto L_0x0096
        L_0x0140:
            if (r0 != r4) goto L_0x01b9
            android.support.constraint.a.a.d[] r0 = r6.f316Ba
            r0 = r0[r14]
            android.support.constraint.a.a.b r1 = r0.f287j
            int r1 = r1.mo121c()
            android.support.constraint.a.a.b r3 = r0.f287j
            android.support.constraint.a.a.b r3 = r3.f217c
            if (r3 == 0) goto L_0x0157
            int r3 = r3.mo121c()
            int r1 = r1 + r3
        L_0x0157:
            android.support.constraint.a.a.b r3 = r0.f291l
            int r3 = r3.mo121c()
            android.support.constraint.a.a.b r5 = r0.f291l
            android.support.constraint.a.a.b r5 = r5.f217c
            if (r5 == 0) goto L_0x0168
            int r5 = r5.mo121c()
            int r3 = r3 + r5
        L_0x0168:
            android.support.constraint.a.a.b r5 = r12.f291l
            android.support.constraint.a.a.b r5 = r5.f217c
            android.support.constraint.a.h r5 = r5.f223i
            android.support.constraint.a.a.d[] r7 = r6.f321Ga
            r8 = r7[r11]
            if (r0 != r8) goto L_0x017c
            r5 = r7[r4]
            android.support.constraint.a.a.b r5 = r5.f291l
            android.support.constraint.a.a.b r5 = r5.f217c
            android.support.constraint.a.h r5 = r5.f223i
        L_0x017c:
            int r7 = r0.f275d
            if (r7 != r4) goto L_0x01a4
            android.support.constraint.a.a.b r0 = r12.f287j
            android.support.constraint.a.h r7 = r0.f223i
            android.support.constraint.a.a.b r0 = r0.f217c
            android.support.constraint.a.h r0 = r0.f223i
            r15.mo253b(r7, r0, r1, r4)
            android.support.constraint.a.a.b r0 = r12.f291l
            android.support.constraint.a.h r0 = r0.f223i
            int r1 = -r3
            r15.mo255c(r0, r5, r1, r4)
            android.support.constraint.a.a.b r0 = r12.f291l
            android.support.constraint.a.h r0 = r0.f223i
            android.support.constraint.a.a.b r1 = r12.f287j
            android.support.constraint.a.h r1 = r1.f223i
            int r3 = r12.mo185t()
            r15.mo244a(r0, r1, r3, r2)
            goto L_0x0024
        L_0x01a4:
            android.support.constraint.a.a.b r2 = r0.f287j
            android.support.constraint.a.h r7 = r2.f223i
            android.support.constraint.a.a.b r2 = r2.f217c
            android.support.constraint.a.h r2 = r2.f223i
            r15.mo244a(r7, r2, r1, r4)
            android.support.constraint.a.a.b r0 = r0.f291l
            android.support.constraint.a.h r0 = r0.f223i
            int r1 = -r3
            r15.mo244a(r0, r5, r1, r4)
            goto L_0x0024
        L_0x01b9:
            r1 = r14
        L_0x01ba:
            int r5 = r0 + -1
            if (r1 >= r5) goto L_0x0024
            android.support.constraint.a.a.d[] r7 = r6.f316Ba
            r8 = r7[r1]
            int r1 = r1 + 1
            r7 = r7[r1]
            android.support.constraint.a.a.b r9 = r8.f287j
            android.support.constraint.a.h r9 = r9.f223i
            android.support.constraint.a.a.b r10 = r8.f291l
            android.support.constraint.a.h r10 = r10.f223i
            android.support.constraint.a.a.b r14 = r7.f287j
            android.support.constraint.a.h r14 = r14.f223i
            android.support.constraint.a.a.b r2 = r7.f291l
            android.support.constraint.a.h r2 = r2.f223i
            android.support.constraint.a.a.d[] r4 = r6.f321Ga
            r28 = r0
            r0 = r4[r11]
            if (r7 != r0) goto L_0x01e6
            r0 = 1
            r2 = r4[r0]
            android.support.constraint.a.a.b r0 = r2.f291l
            android.support.constraint.a.h r0 = r0.f223i
            goto L_0x01e7
        L_0x01e6:
            r0 = r2
        L_0x01e7:
            android.support.constraint.a.a.b r2 = r8.f287j
            int r2 = r2.mo121c()
            android.support.constraint.a.a.b r4 = r8.f287j
            android.support.constraint.a.a.b r4 = r4.f217c
            if (r4 == 0) goto L_0x0204
            android.support.constraint.a.a.d r4 = r4.f215a
            android.support.constraint.a.a.b r4 = r4.f291l
            android.support.constraint.a.a.b r11 = r4.f217c
            if (r11 == 0) goto L_0x0204
            android.support.constraint.a.a.d r11 = r11.f215a
            if (r11 != r8) goto L_0x0204
            int r4 = r4.mo121c()
            int r2 = r2 + r4
        L_0x0204:
            android.support.constraint.a.a.b r4 = r8.f287j
            android.support.constraint.a.a.b r4 = r4.f217c
            android.support.constraint.a.h r4 = r4.f223i
            r11 = 2
            r15.mo253b(r9, r4, r2, r11)
            android.support.constraint.a.a.b r2 = r8.f291l
            int r2 = r2.mo121c()
            android.support.constraint.a.a.b r4 = r8.f291l
            android.support.constraint.a.a.b r4 = r4.f217c
            if (r4 == 0) goto L_0x022b
            android.support.constraint.a.a.d r4 = r8.f296na
            if (r4 == 0) goto L_0x022b
            android.support.constraint.a.a.b r4 = r4.f287j
            android.support.constraint.a.a.b r11 = r4.f217c
            if (r11 == 0) goto L_0x0229
            int r4 = r4.mo121c()
            goto L_0x022a
        L_0x0229:
            r4 = 0
        L_0x022a:
            int r2 = r2 + r4
        L_0x022b:
            android.support.constraint.a.a.b r4 = r8.f291l
            android.support.constraint.a.a.b r4 = r4.f217c
            android.support.constraint.a.h r4 = r4.f223i
            int r2 = -r2
            r11 = 2
            r15.mo255c(r10, r4, r2, r11)
            if (r1 != r5) goto L_0x0290
            android.support.constraint.a.a.b r2 = r7.f287j
            int r2 = r2.mo121c()
            android.support.constraint.a.a.b r4 = r7.f287j
            android.support.constraint.a.a.b r4 = r4.f217c
            if (r4 == 0) goto L_0x0255
            android.support.constraint.a.a.d r4 = r4.f215a
            android.support.constraint.a.a.b r4 = r4.f291l
            android.support.constraint.a.a.b r5 = r4.f217c
            if (r5 == 0) goto L_0x0255
            android.support.constraint.a.a.d r5 = r5.f215a
            if (r5 != r7) goto L_0x0255
            int r4 = r4.mo121c()
            int r2 = r2 + r4
        L_0x0255:
            android.support.constraint.a.a.b r4 = r7.f287j
            android.support.constraint.a.a.b r4 = r4.f217c
            android.support.constraint.a.h r4 = r4.f223i
            r5 = 2
            r15.mo253b(r14, r4, r2, r5)
            android.support.constraint.a.a.b r2 = r7.f291l
            android.support.constraint.a.a.d[] r4 = r6.f321Ga
            r5 = 3
            r11 = r4[r5]
            if (r7 != r11) goto L_0x026d
            r5 = 1
            r2 = r4[r5]
            android.support.constraint.a.a.b r2 = r2.f291l
        L_0x026d:
            int r4 = r2.mo121c()
            android.support.constraint.a.a.b r5 = r2.f217c
            if (r5 == 0) goto L_0x0286
            android.support.constraint.a.a.d r5 = r5.f215a
            android.support.constraint.a.a.b r5 = r5.f287j
            android.support.constraint.a.a.b r11 = r5.f217c
            if (r11 == 0) goto L_0x0286
            android.support.constraint.a.a.d r11 = r11.f215a
            if (r11 != r7) goto L_0x0286
            int r5 = r5.mo121c()
            int r4 = r4 + r5
        L_0x0286:
            android.support.constraint.a.a.b r2 = r2.f217c
            android.support.constraint.a.h r2 = r2.f223i
            int r4 = -r4
            r5 = 2
            r15.mo255c(r0, r2, r4, r5)
            goto L_0x0291
        L_0x0290:
            r5 = 2
        L_0x0291:
            int r2 = r12.f281g
            if (r2 <= 0) goto L_0x0298
            r15.mo255c(r10, r9, r2, r5)
        L_0x0298:
            android.support.constraint.a.b r2 = r31.mo252b()
            float r4 = r8.f292la
            float r11 = r7.f292la
            android.support.constraint.a.a.b r5 = r8.f287j
            int r21 = r5.mo121c()
            android.support.constraint.a.a.b r5 = r8.f291l
            int r23 = r5.mo121c()
            android.support.constraint.a.a.b r5 = r7.f287j
            int r25 = r5.mo121c()
            android.support.constraint.a.a.b r5 = r7.f291l
            int r27 = r5.mo121c()
            r16 = r2
            r17 = r4
            r18 = r3
            r19 = r11
            r20 = r9
            r22 = r10
            r24 = r14
            r26 = r0
            r16.mo219a(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r15.mo247a((android.support.constraint.p005a.C0063b) r2)
            r0 = r28
            r2 = 2
            r4 = 1
            r11 = 3
            r14 = 0
            goto L_0x01ba
        L_0x02d6:
            r0 = r1
            r2 = r16
            r4 = r2
            r7 = 0
        L_0x02db:
            if (r0 == 0) goto L_0x043d
            android.support.constraint.a.a.d r8 = r0.f296na
            if (r8 != 0) goto L_0x02e9
            android.support.constraint.a.a.d[] r2 = r6.f321Ga
            r7 = 1
            r2 = r2[r7]
            r14 = r2
            r2 = 1
            goto L_0x02eb
        L_0x02e9:
            r14 = r2
            r2 = r7
        L_0x02eb:
            if (r5 == 0) goto L_0x0342
            android.support.constraint.a.a.b r7 = r0.f287j
            int r9 = r7.mo121c()
            if (r4 == 0) goto L_0x02fc
            android.support.constraint.a.a.b r4 = r4.f291l
            int r4 = r4.mo121c()
            int r9 = r9 + r4
        L_0x02fc:
            if (r1 == r0) goto L_0x0300
            r4 = 3
            goto L_0x0301
        L_0x0300:
            r4 = 1
        L_0x0301:
            android.support.constraint.a.h r10 = r7.f223i
            android.support.constraint.a.a.b r11 = r7.f217c
            android.support.constraint.a.h r11 = r11.f223i
            r15.mo253b(r10, r11, r9, r4)
            android.support.constraint.a.a.d$a r4 = r0.f260Q
            android.support.constraint.a.a.d$a r9 = android.support.constraint.p005a.p006a.C0053d.C0054a.MATCH_CONSTRAINT
            if (r4 != r9) goto L_0x0340
            android.support.constraint.a.a.b r4 = r0.f291l
            int r9 = r0.f275d
            r10 = 1
            if (r9 != r10) goto L_0x032a
            int r9 = r0.f279f
            int r10 = r0.mo185t()
            int r9 = java.lang.Math.max(r9, r10)
            android.support.constraint.a.h r4 = r4.f223i
            android.support.constraint.a.h r7 = r7.f223i
            r11 = 3
            r15.mo244a(r4, r7, r9, r11)
            goto L_0x038f
        L_0x032a:
            r11 = 3
            android.support.constraint.a.h r9 = r7.f223i
            android.support.constraint.a.a.b r10 = r7.f217c
            android.support.constraint.a.h r10 = r10.f223i
            int r6 = r7.f218d
            r15.mo253b(r9, r10, r6, r11)
            android.support.constraint.a.h r4 = r4.f223i
            android.support.constraint.a.h r6 = r7.f223i
            int r7 = r0.f279f
            r15.mo255c(r4, r6, r7, r11)
            goto L_0x038f
        L_0x0340:
            r11 = 3
            goto L_0x038f
        L_0x0342:
            r11 = 3
            r6 = 5
            if (r3 != 0) goto L_0x036d
            if (r2 == 0) goto L_0x036d
            if (r4 == 0) goto L_0x036d
            android.support.constraint.a.a.b r4 = r0.f291l
            android.support.constraint.a.a.b r7 = r4.f217c
            if (r7 != 0) goto L_0x035a
            android.support.constraint.a.h r4 = r4.f223i
            int r6 = r0.mo166g()
        L_0x0356:
            r15.mo249a((android.support.constraint.p005a.C0069h) r4, (int) r6)
            goto L_0x038f
        L_0x035a:
            int r4 = r4.mo121c()
            android.support.constraint.a.a.b r7 = r0.f291l
            android.support.constraint.a.h r7 = r7.f223i
            android.support.constraint.a.a.b r9 = r14.f291l
            android.support.constraint.a.a.b r9 = r9.f217c
            android.support.constraint.a.h r9 = r9.f223i
            int r4 = -r4
        L_0x0369:
            r15.mo244a(r7, r9, r4, r6)
            goto L_0x038f
        L_0x036d:
            if (r3 != 0) goto L_0x039e
            if (r2 != 0) goto L_0x039e
            if (r4 != 0) goto L_0x039e
            android.support.constraint.a.a.b r4 = r0.f287j
            android.support.constraint.a.a.b r7 = r4.f217c
            if (r7 != 0) goto L_0x0380
            android.support.constraint.a.h r4 = r4.f223i
            int r6 = r0.mo168h()
            goto L_0x0356
        L_0x0380:
            int r4 = r4.mo121c()
            android.support.constraint.a.a.b r7 = r0.f287j
            android.support.constraint.a.h r7 = r7.f223i
            android.support.constraint.a.a.b r9 = r12.f287j
            android.support.constraint.a.a.b r9 = r9.f217c
            android.support.constraint.a.h r9 = r9.f223i
            goto L_0x0369
        L_0x038f:
            r17 = r0
            r18 = r3
            r20 = r8
            r0 = r12
            r4 = r13
            r19 = r14
            r3 = r15
            r21 = 0
            goto L_0x0429
        L_0x039e:
            android.support.constraint.a.a.b r6 = r0.f287j
            android.support.constraint.a.a.b r7 = r0.f291l
            int r10 = r6.mo121c()
            int r9 = r7.mo121c()
            android.support.constraint.a.h r11 = r6.f223i
            r17 = r0
            android.support.constraint.a.a.b r0 = r6.f217c
            android.support.constraint.a.h r0 = r0.f223i
            r18 = r3
            r3 = 1
            r15.mo253b(r11, r0, r10, r3)
            android.support.constraint.a.h r0 = r7.f223i
            android.support.constraint.a.a.b r11 = r7.f217c
            android.support.constraint.a.h r11 = r11.f223i
            r19 = r13
            int r13 = -r9
            r15.mo255c(r0, r11, r13, r3)
            android.support.constraint.a.a.b r0 = r6.f217c
            if (r0 == 0) goto L_0x03cb
            android.support.constraint.a.h r0 = r0.f223i
            goto L_0x03cd
        L_0x03cb:
            r0 = r16
        L_0x03cd:
            if (r4 != 0) goto L_0x03da
            android.support.constraint.a.a.b r0 = r12.f287j
            android.support.constraint.a.a.b r0 = r0.f217c
            if (r0 == 0) goto L_0x03d8
            android.support.constraint.a.h r0 = r0.f223i
            goto L_0x03da
        L_0x03d8:
            r0 = r16
        L_0x03da:
            if (r8 != 0) goto L_0x03e8
            android.support.constraint.a.a.b r3 = r14.f291l
            android.support.constraint.a.a.b r3 = r3.f217c
            if (r3 == 0) goto L_0x03e6
            android.support.constraint.a.a.d r3 = r3.f215a
            r8 = r3
            goto L_0x03e8
        L_0x03e6:
            r8 = r16
        L_0x03e8:
            r3 = r8
            if (r3 == 0) goto L_0x041f
            android.support.constraint.a.a.b r4 = r3.f287j
            android.support.constraint.a.h r4 = r4.f223i
            if (r2 == 0) goto L_0x03fc
            android.support.constraint.a.a.b r4 = r14.f291l
            android.support.constraint.a.a.b r4 = r4.f217c
            if (r4 == 0) goto L_0x03fa
            android.support.constraint.a.h r4 = r4.f223i
            goto L_0x03fc
        L_0x03fa:
            r4 = r16
        L_0x03fc:
            if (r0 == 0) goto L_0x041f
            if (r4 == 0) goto L_0x041f
            android.support.constraint.a.h r8 = r6.f223i
            r11 = 1056964608(0x3f000000, float:0.5)
            android.support.constraint.a.h r13 = r7.f223i
            r6 = 4
            r7 = r31
            r20 = r9
            r9 = r0
            r0 = 3
            r0 = r12
            r12 = r4
            r4 = r19
            r19 = r14
            r21 = 0
            r14 = r20
            r20 = r3
            r3 = r15
            r15 = r6
            r7.mo250a(r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0429
        L_0x041f:
            r20 = r3
            r0 = r12
            r3 = r15
            r4 = r19
            r21 = 0
            r19 = r14
        L_0x0429:
            if (r2 == 0) goto L_0x042d
            r20 = r16
        L_0x042d:
            r6 = r30
            r12 = r0
            r7 = r2
            r15 = r3
            r13 = r4
            r4 = r17
            r3 = r18
            r2 = r19
            r0 = r20
            goto L_0x02db
        L_0x043d:
            r0 = r12
            r4 = r13
            r3 = r15
            r21 = 0
            if (r5 == 0) goto L_0x047f
            android.support.constraint.a.a.b r1 = r1.f287j
            android.support.constraint.a.a.b r5 = r2.f291l
            int r10 = r1.mo121c()
            int r14 = r5.mo121c()
            android.support.constraint.a.a.b r6 = r0.f287j
            android.support.constraint.a.a.b r6 = r6.f217c
            if (r6 == 0) goto L_0x045a
            android.support.constraint.a.h r6 = r6.f223i
            r9 = r6
            goto L_0x045c
        L_0x045a:
            r9 = r16
        L_0x045c:
            android.support.constraint.a.a.b r2 = r2.f291l
            android.support.constraint.a.a.b r2 = r2.f217c
            if (r2 == 0) goto L_0x0466
            android.support.constraint.a.h r2 = r2.f223i
            r12 = r2
            goto L_0x0468
        L_0x0466:
            r12 = r16
        L_0x0468:
            if (r9 == 0) goto L_0x047f
            if (r12 == 0) goto L_0x047f
            android.support.constraint.a.h r2 = r5.f223i
            int r6 = -r14
            r7 = 1
            r3.mo255c(r2, r12, r6, r7)
            android.support.constraint.a.h r8 = r1.f223i
            float r11 = r0.f258O
            android.support.constraint.a.h r13 = r5.f223i
            r15 = 4
            r7 = r31
            r7.mo250a(r8, r9, r10, r11, r12, r13, r14, r15)
        L_0x047f:
            int r13 = r4 + 1
            r6 = r30
            r15 = r3
            r14 = r21
            goto L_0x0006
        L_0x0488:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p005a.p006a.C0055e.m224a(android.support.constraint.a.e):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:205:0x044b  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x044d A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m225b(android.support.constraint.p005a.C0066e r31) {
        /*
            r30 = this;
            r6 = r30
            r15 = r31
            r14 = 0
            r13 = r14
        L_0x0006:
            int r0 = r6.f315Aa
            if (r13 >= r0) goto L_0x04a8
            android.support.constraint.a.a.d[] r0 = r6.f317Ca
            r12 = r0[r13]
            android.support.constraint.a.a.d[] r2 = r6.f321Ga
            r3 = r0[r13]
            r4 = 1
            boolean[] r5 = r6.f320Fa
            r0 = r30
            r1 = r31
            int r0 = r0.m223a(r1, r2, r3, r4, r5)
            android.support.constraint.a.a.d[] r1 = r6.f321Ga
            r2 = 2
            r1 = r1[r2]
            if (r1 != 0) goto L_0x002a
        L_0x0024:
            r4 = r13
            r21 = r14
            r3 = r15
            goto L_0x049f
        L_0x002a:
            boolean[] r3 = r6.f320Fa
            r4 = 1
            boolean r3 = r3[r4]
            if (r3 == 0) goto L_0x0055
            int r0 = r12.mo170i()
        L_0x0035:
            if (r1 == 0) goto L_0x0024
            android.support.constraint.a.a.b r2 = r1.f289k
            android.support.constraint.a.h r2 = r2.f223i
            r15.mo249a((android.support.constraint.p005a.C0069h) r2, (int) r0)
            android.support.constraint.a.a.d r2 = r1.f298oa
            android.support.constraint.a.a.b r3 = r1.f289k
            int r3 = r3.mo121c()
            int r4 = r1.mo172j()
            int r3 = r3 + r4
            android.support.constraint.a.a.b r1 = r1.f293m
            int r1 = r1.mo121c()
            int r3 = r3 + r1
            int r0 = r0 + r3
            r1 = r2
            goto L_0x0035
        L_0x0055:
            int r3 = r12.f286ia
            if (r3 != 0) goto L_0x005b
            r3 = r4
            goto L_0x005c
        L_0x005b:
            r3 = r14
        L_0x005c:
            int r5 = r12.f286ia
            if (r5 != r2) goto L_0x0062
            r5 = r4
            goto L_0x0063
        L_0x0062:
            r5 = r14
        L_0x0063:
            android.support.constraint.a.a.d$a r7 = r6.f261R
            android.support.constraint.a.a.d$a r8 = android.support.constraint.p005a.p006a.C0053d.C0054a.WRAP_CONTENT
            if (r7 != r8) goto L_0x006b
            r7 = r4
            goto L_0x006c
        L_0x006b:
            r7 = r14
        L_0x006c:
            int r8 = r6.f319Ea
            if (r8 == r2) goto L_0x0074
            r9 = 8
            if (r8 != r9) goto L_0x008a
        L_0x0074:
            boolean[] r8 = r6.f320Fa
            boolean r8 = r8[r14]
            if (r8 == 0) goto L_0x008a
            boolean r8 = r12.f290ka
            if (r8 == 0) goto L_0x008a
            if (r5 != 0) goto L_0x008a
            if (r7 != 0) goto L_0x008a
            int r7 = r12.f286ia
            if (r7 != 0) goto L_0x008a
            android.support.constraint.p005a.p006a.C0058h.m255b(r6, r15, r0, r12)
            goto L_0x0024
        L_0x008a:
            r11 = 3
            r16 = 0
            if (r0 == 0) goto L_0x02d6
            if (r5 == 0) goto L_0x0093
            goto L_0x02d6
        L_0x0093:
            r3 = 0
            r5 = r16
        L_0x0096:
            if (r1 == 0) goto L_0x0140
            android.support.constraint.a.a.d$a r7 = r1.f261R
            android.support.constraint.a.a.d$a r8 = android.support.constraint.p005a.p006a.C0053d.C0054a.MATCH_CONSTRAINT
            if (r7 == r8) goto L_0x00fe
            android.support.constraint.a.a.b r7 = r1.f289k
            int r7 = r7.mo121c()
            if (r5 == 0) goto L_0x00ad
            android.support.constraint.a.a.b r5 = r5.f293m
            int r5 = r5.mo121c()
            int r7 = r7 + r5
        L_0x00ad:
            android.support.constraint.a.a.b r5 = r1.f289k
            android.support.constraint.a.a.b r5 = r5.f217c
            android.support.constraint.a.a.d r5 = r5.f215a
            android.support.constraint.a.a.d$a r5 = r5.f261R
            android.support.constraint.a.a.d$a r8 = android.support.constraint.p005a.p006a.C0053d.C0054a.MATCH_CONSTRAINT
            if (r5 != r8) goto L_0x00bb
            r5 = r2
            goto L_0x00bc
        L_0x00bb:
            r5 = r11
        L_0x00bc:
            android.support.constraint.a.a.b r8 = r1.f289k
            android.support.constraint.a.h r9 = r8.f223i
            android.support.constraint.a.a.b r8 = r8.f217c
            android.support.constraint.a.h r8 = r8.f223i
            r15.mo253b(r9, r8, r7, r5)
            android.support.constraint.a.a.b r5 = r1.f293m
            int r5 = r5.mo121c()
            android.support.constraint.a.a.b r7 = r1.f293m
            android.support.constraint.a.a.b r7 = r7.f217c
            android.support.constraint.a.a.d r7 = r7.f215a
            android.support.constraint.a.a.b r7 = r7.f289k
            android.support.constraint.a.a.b r8 = r7.f217c
            if (r8 == 0) goto L_0x00e2
            android.support.constraint.a.a.d r8 = r8.f215a
            if (r8 != r1) goto L_0x00e2
            int r7 = r7.mo121c()
            int r5 = r5 + r7
        L_0x00e2:
            android.support.constraint.a.a.b r7 = r1.f293m
            android.support.constraint.a.a.b r7 = r7.f217c
            android.support.constraint.a.a.d r7 = r7.f215a
            android.support.constraint.a.a.d$a r7 = r7.f261R
            android.support.constraint.a.a.d$a r8 = android.support.constraint.p005a.p006a.C0053d.C0054a.MATCH_CONSTRAINT
            if (r7 != r8) goto L_0x00f0
            r7 = r2
            goto L_0x00f1
        L_0x00f0:
            r7 = r11
        L_0x00f1:
            android.support.constraint.a.a.b r8 = r1.f293m
            android.support.constraint.a.h r9 = r8.f223i
            android.support.constraint.a.a.b r8 = r8.f217c
            android.support.constraint.a.h r8 = r8.f223i
            int r5 = -r5
            r15.mo255c(r9, r8, r5, r7)
            goto L_0x0137
        L_0x00fe:
            float r5 = r1.f294ma
            float r3 = r3 + r5
            android.support.constraint.a.a.b r5 = r1.f293m
            android.support.constraint.a.a.b r7 = r5.f217c
            if (r7 == 0) goto L_0x011f
            int r5 = r5.mo121c()
            android.support.constraint.a.a.d[] r7 = r6.f321Ga
            r7 = r7[r11]
            if (r1 == r7) goto L_0x0120
            android.support.constraint.a.a.b r7 = r1.f293m
            android.support.constraint.a.a.b r7 = r7.f217c
            android.support.constraint.a.a.d r7 = r7.f215a
            android.support.constraint.a.a.b r7 = r7.f289k
            int r7 = r7.mo121c()
            int r5 = r5 + r7
            goto L_0x0120
        L_0x011f:
            r5 = r14
        L_0x0120:
            android.support.constraint.a.a.b r7 = r1.f293m
            android.support.constraint.a.h r7 = r7.f223i
            android.support.constraint.a.a.b r8 = r1.f289k
            android.support.constraint.a.h r8 = r8.f223i
            r15.mo253b(r7, r8, r14, r4)
            android.support.constraint.a.a.b r7 = r1.f293m
            android.support.constraint.a.h r8 = r7.f223i
            android.support.constraint.a.a.b r7 = r7.f217c
            android.support.constraint.a.h r7 = r7.f223i
            int r5 = -r5
            r15.mo255c(r8, r7, r5, r4)
        L_0x0137:
            android.support.constraint.a.a.d r5 = r1.f298oa
            r29 = r5
            r5 = r1
            r1 = r29
            goto L_0x0096
        L_0x0140:
            if (r0 != r4) goto L_0x01b9
            android.support.constraint.a.a.d[] r0 = r6.f316Ba
            r0 = r0[r14]
            android.support.constraint.a.a.b r1 = r0.f289k
            int r1 = r1.mo121c()
            android.support.constraint.a.a.b r3 = r0.f289k
            android.support.constraint.a.a.b r3 = r3.f217c
            if (r3 == 0) goto L_0x0157
            int r3 = r3.mo121c()
            int r1 = r1 + r3
        L_0x0157:
            android.support.constraint.a.a.b r3 = r0.f293m
            int r3 = r3.mo121c()
            android.support.constraint.a.a.b r5 = r0.f293m
            android.support.constraint.a.a.b r5 = r5.f217c
            if (r5 == 0) goto L_0x0168
            int r5 = r5.mo121c()
            int r3 = r3 + r5
        L_0x0168:
            android.support.constraint.a.a.b r5 = r12.f293m
            android.support.constraint.a.a.b r5 = r5.f217c
            android.support.constraint.a.h r5 = r5.f223i
            android.support.constraint.a.a.d[] r7 = r6.f321Ga
            r8 = r7[r11]
            if (r0 != r8) goto L_0x017c
            r5 = r7[r4]
            android.support.constraint.a.a.b r5 = r5.f293m
            android.support.constraint.a.a.b r5 = r5.f217c
            android.support.constraint.a.h r5 = r5.f223i
        L_0x017c:
            int r7 = r0.f277e
            if (r7 != r4) goto L_0x01a4
            android.support.constraint.a.a.b r0 = r12.f289k
            android.support.constraint.a.h r7 = r0.f223i
            android.support.constraint.a.a.b r0 = r0.f217c
            android.support.constraint.a.h r0 = r0.f223i
            r15.mo253b(r7, r0, r1, r4)
            android.support.constraint.a.a.b r0 = r12.f293m
            android.support.constraint.a.h r0 = r0.f223i
            int r1 = -r3
            r15.mo255c(r0, r5, r1, r4)
            android.support.constraint.a.a.b r0 = r12.f293m
            android.support.constraint.a.h r0 = r0.f223i
            android.support.constraint.a.a.b r1 = r12.f289k
            android.support.constraint.a.h r1 = r1.f223i
            int r3 = r12.mo172j()
            r15.mo244a(r0, r1, r3, r2)
            goto L_0x0024
        L_0x01a4:
            android.support.constraint.a.a.b r2 = r0.f289k
            android.support.constraint.a.h r7 = r2.f223i
            android.support.constraint.a.a.b r2 = r2.f217c
            android.support.constraint.a.h r2 = r2.f223i
            r15.mo244a(r7, r2, r1, r4)
            android.support.constraint.a.a.b r0 = r0.f293m
            android.support.constraint.a.h r0 = r0.f223i
            int r1 = -r3
            r15.mo244a(r0, r5, r1, r4)
            goto L_0x0024
        L_0x01b9:
            r1 = r14
        L_0x01ba:
            int r5 = r0 + -1
            if (r1 >= r5) goto L_0x0024
            android.support.constraint.a.a.d[] r7 = r6.f316Ba
            r8 = r7[r1]
            int r1 = r1 + 1
            r7 = r7[r1]
            android.support.constraint.a.a.b r9 = r8.f289k
            android.support.constraint.a.h r9 = r9.f223i
            android.support.constraint.a.a.b r10 = r8.f293m
            android.support.constraint.a.h r10 = r10.f223i
            android.support.constraint.a.a.b r14 = r7.f289k
            android.support.constraint.a.h r14 = r14.f223i
            android.support.constraint.a.a.b r2 = r7.f293m
            android.support.constraint.a.h r2 = r2.f223i
            android.support.constraint.a.a.d[] r4 = r6.f321Ga
            r28 = r0
            r0 = r4[r11]
            if (r7 != r0) goto L_0x01e6
            r0 = 1
            r2 = r4[r0]
            android.support.constraint.a.a.b r0 = r2.f293m
            android.support.constraint.a.h r0 = r0.f223i
            goto L_0x01e7
        L_0x01e6:
            r0 = r2
        L_0x01e7:
            android.support.constraint.a.a.b r2 = r8.f289k
            int r2 = r2.mo121c()
            android.support.constraint.a.a.b r4 = r8.f289k
            android.support.constraint.a.a.b r4 = r4.f217c
            if (r4 == 0) goto L_0x0204
            android.support.constraint.a.a.d r4 = r4.f215a
            android.support.constraint.a.a.b r4 = r4.f293m
            android.support.constraint.a.a.b r11 = r4.f217c
            if (r11 == 0) goto L_0x0204
            android.support.constraint.a.a.d r11 = r11.f215a
            if (r11 != r8) goto L_0x0204
            int r4 = r4.mo121c()
            int r2 = r2 + r4
        L_0x0204:
            android.support.constraint.a.a.b r4 = r8.f289k
            android.support.constraint.a.a.b r4 = r4.f217c
            android.support.constraint.a.h r4 = r4.f223i
            r11 = 2
            r15.mo253b(r9, r4, r2, r11)
            android.support.constraint.a.a.b r2 = r8.f293m
            int r2 = r2.mo121c()
            android.support.constraint.a.a.b r4 = r8.f293m
            android.support.constraint.a.a.b r4 = r4.f217c
            if (r4 == 0) goto L_0x022b
            android.support.constraint.a.a.d r4 = r8.f298oa
            if (r4 == 0) goto L_0x022b
            android.support.constraint.a.a.b r4 = r4.f289k
            android.support.constraint.a.a.b r11 = r4.f217c
            if (r11 == 0) goto L_0x0229
            int r4 = r4.mo121c()
            goto L_0x022a
        L_0x0229:
            r4 = 0
        L_0x022a:
            int r2 = r2 + r4
        L_0x022b:
            android.support.constraint.a.a.b r4 = r8.f293m
            android.support.constraint.a.a.b r4 = r4.f217c
            android.support.constraint.a.h r4 = r4.f223i
            int r2 = -r2
            r11 = 2
            r15.mo255c(r10, r4, r2, r11)
            if (r1 != r5) goto L_0x0290
            android.support.constraint.a.a.b r2 = r7.f289k
            int r2 = r2.mo121c()
            android.support.constraint.a.a.b r4 = r7.f289k
            android.support.constraint.a.a.b r4 = r4.f217c
            if (r4 == 0) goto L_0x0255
            android.support.constraint.a.a.d r4 = r4.f215a
            android.support.constraint.a.a.b r4 = r4.f293m
            android.support.constraint.a.a.b r5 = r4.f217c
            if (r5 == 0) goto L_0x0255
            android.support.constraint.a.a.d r5 = r5.f215a
            if (r5 != r7) goto L_0x0255
            int r4 = r4.mo121c()
            int r2 = r2 + r4
        L_0x0255:
            android.support.constraint.a.a.b r4 = r7.f289k
            android.support.constraint.a.a.b r4 = r4.f217c
            android.support.constraint.a.h r4 = r4.f223i
            r5 = 2
            r15.mo253b(r14, r4, r2, r5)
            android.support.constraint.a.a.b r2 = r7.f293m
            android.support.constraint.a.a.d[] r4 = r6.f321Ga
            r5 = 3
            r11 = r4[r5]
            if (r7 != r11) goto L_0x026d
            r5 = 1
            r2 = r4[r5]
            android.support.constraint.a.a.b r2 = r2.f293m
        L_0x026d:
            int r4 = r2.mo121c()
            android.support.constraint.a.a.b r5 = r2.f217c
            if (r5 == 0) goto L_0x0286
            android.support.constraint.a.a.d r5 = r5.f215a
            android.support.constraint.a.a.b r5 = r5.f289k
            android.support.constraint.a.a.b r11 = r5.f217c
            if (r11 == 0) goto L_0x0286
            android.support.constraint.a.a.d r11 = r11.f215a
            if (r11 != r7) goto L_0x0286
            int r5 = r5.mo121c()
            int r4 = r4 + r5
        L_0x0286:
            android.support.constraint.a.a.b r2 = r2.f217c
            android.support.constraint.a.h r2 = r2.f223i
            int r4 = -r4
            r5 = 2
            r15.mo255c(r0, r2, r4, r5)
            goto L_0x0291
        L_0x0290:
            r5 = 2
        L_0x0291:
            int r2 = r12.f285i
            if (r2 <= 0) goto L_0x0298
            r15.mo255c(r10, r9, r2, r5)
        L_0x0298:
            android.support.constraint.a.b r2 = r31.mo252b()
            float r4 = r8.f294ma
            float r11 = r7.f294ma
            android.support.constraint.a.a.b r5 = r8.f289k
            int r21 = r5.mo121c()
            android.support.constraint.a.a.b r5 = r8.f293m
            int r23 = r5.mo121c()
            android.support.constraint.a.a.b r5 = r7.f289k
            int r25 = r5.mo121c()
            android.support.constraint.a.a.b r5 = r7.f293m
            int r27 = r5.mo121c()
            r16 = r2
            r17 = r4
            r18 = r3
            r19 = r11
            r20 = r9
            r22 = r10
            r24 = r14
            r26 = r0
            r16.mo219a(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r15.mo247a((android.support.constraint.p005a.C0063b) r2)
            r0 = r28
            r2 = 2
            r4 = 1
            r11 = 3
            r14 = 0
            goto L_0x01ba
        L_0x02d6:
            r0 = r1
            r2 = r16
            r4 = r2
            r7 = 0
        L_0x02db:
            if (r0 == 0) goto L_0x045d
            android.support.constraint.a.a.d r8 = r0.f298oa
            if (r8 != 0) goto L_0x02e9
            android.support.constraint.a.a.d[] r2 = r6.f321Ga
            r7 = 1
            r2 = r2[r7]
            r14 = r2
            r2 = 1
            goto L_0x02eb
        L_0x02e9:
            r14 = r2
            r2 = r7
        L_0x02eb:
            if (r5 == 0) goto L_0x0362
            android.support.constraint.a.a.b r7 = r0.f289k
            int r9 = r7.mo121c()
            if (r4 == 0) goto L_0x02fc
            android.support.constraint.a.a.b r4 = r4.f293m
            int r4 = r4.mo121c()
            int r9 = r9 + r4
        L_0x02fc:
            if (r1 == r0) goto L_0x0300
            r4 = 3
            goto L_0x0301
        L_0x0300:
            r4 = 1
        L_0x0301:
            android.support.constraint.a.a.b r10 = r7.f217c
            if (r10 == 0) goto L_0x030f
            android.support.constraint.a.h r11 = r7.f223i
            android.support.constraint.a.h r10 = r10.f223i
            r29 = r11
            r11 = r10
            r10 = r29
            goto L_0x0323
        L_0x030f:
            android.support.constraint.a.a.b r10 = r0.f295n
            android.support.constraint.a.a.b r11 = r10.f217c
            if (r11 == 0) goto L_0x0320
            android.support.constraint.a.h r10 = r10.f223i
            android.support.constraint.a.h r11 = r11.f223i
            int r17 = r7.mo121c()
            int r9 = r9 - r17
            goto L_0x0323
        L_0x0320:
            r10 = r16
            r11 = r10
        L_0x0323:
            if (r10 == 0) goto L_0x032a
            if (r11 == 0) goto L_0x032a
            r15.mo253b(r10, r11, r9, r4)
        L_0x032a:
            android.support.constraint.a.a.d$a r4 = r0.f261R
            android.support.constraint.a.a.d$a r9 = android.support.constraint.p005a.p006a.C0053d.C0054a.MATCH_CONSTRAINT
            if (r4 != r9) goto L_0x0360
            android.support.constraint.a.a.b r4 = r0.f293m
            int r9 = r0.f277e
            r10 = 1
            if (r9 != r10) goto L_0x034a
            int r9 = r0.f283h
            int r10 = r0.mo172j()
            int r9 = java.lang.Math.max(r9, r10)
            android.support.constraint.a.h r4 = r4.f223i
            android.support.constraint.a.h r7 = r7.f223i
            r11 = 3
            r15.mo244a(r4, r7, r9, r11)
            goto L_0x03af
        L_0x034a:
            r11 = 3
            android.support.constraint.a.h r9 = r7.f223i
            android.support.constraint.a.a.b r10 = r7.f217c
            android.support.constraint.a.h r10 = r10.f223i
            int r6 = r7.f218d
            r15.mo253b(r9, r10, r6, r11)
            android.support.constraint.a.h r4 = r4.f223i
            android.support.constraint.a.h r6 = r7.f223i
            int r7 = r0.f283h
            r15.mo255c(r4, r6, r7, r11)
            goto L_0x03af
        L_0x0360:
            r11 = 3
            goto L_0x03af
        L_0x0362:
            r11 = 3
            r6 = 5
            if (r3 != 0) goto L_0x038d
            if (r2 == 0) goto L_0x038d
            if (r4 == 0) goto L_0x038d
            android.support.constraint.a.a.b r4 = r0.f293m
            android.support.constraint.a.a.b r7 = r4.f217c
            if (r7 != 0) goto L_0x037a
            android.support.constraint.a.h r4 = r4.f223i
            int r6 = r0.mo164f()
        L_0x0376:
            r15.mo249a((android.support.constraint.p005a.C0069h) r4, (int) r6)
            goto L_0x03af
        L_0x037a:
            int r4 = r4.mo121c()
            android.support.constraint.a.a.b r7 = r0.f293m
            android.support.constraint.a.h r7 = r7.f223i
            android.support.constraint.a.a.b r9 = r14.f293m
            android.support.constraint.a.a.b r9 = r9.f217c
            android.support.constraint.a.h r9 = r9.f223i
            int r4 = -r4
        L_0x0389:
            r15.mo244a(r7, r9, r4, r6)
            goto L_0x03af
        L_0x038d:
            if (r3 != 0) goto L_0x03be
            if (r2 != 0) goto L_0x03be
            if (r4 != 0) goto L_0x03be
            android.support.constraint.a.a.b r4 = r0.f289k
            android.support.constraint.a.a.b r7 = r4.f217c
            if (r7 != 0) goto L_0x03a0
            android.support.constraint.a.h r4 = r4.f223i
            int r6 = r0.mo170i()
            goto L_0x0376
        L_0x03a0:
            int r4 = r4.mo121c()
            android.support.constraint.a.a.b r7 = r0.f289k
            android.support.constraint.a.h r7 = r7.f223i
            android.support.constraint.a.a.b r9 = r12.f289k
            android.support.constraint.a.a.b r9 = r9.f217c
            android.support.constraint.a.h r9 = r9.f223i
            goto L_0x0389
        L_0x03af:
            r17 = r0
            r18 = r3
            r20 = r8
            r0 = r12
            r4 = r13
            r19 = r14
            r3 = r15
            r21 = 0
            goto L_0x0449
        L_0x03be:
            android.support.constraint.a.a.b r6 = r0.f289k
            android.support.constraint.a.a.b r7 = r0.f293m
            int r10 = r6.mo121c()
            int r9 = r7.mo121c()
            android.support.constraint.a.h r11 = r6.f223i
            r17 = r0
            android.support.constraint.a.a.b r0 = r6.f217c
            android.support.constraint.a.h r0 = r0.f223i
            r18 = r3
            r3 = 1
            r15.mo253b(r11, r0, r10, r3)
            android.support.constraint.a.h r0 = r7.f223i
            android.support.constraint.a.a.b r11 = r7.f217c
            android.support.constraint.a.h r11 = r11.f223i
            r19 = r13
            int r13 = -r9
            r15.mo255c(r0, r11, r13, r3)
            android.support.constraint.a.a.b r0 = r6.f217c
            if (r0 == 0) goto L_0x03eb
            android.support.constraint.a.h r0 = r0.f223i
            goto L_0x03ed
        L_0x03eb:
            r0 = r16
        L_0x03ed:
            if (r4 != 0) goto L_0x03fa
            android.support.constraint.a.a.b r0 = r12.f289k
            android.support.constraint.a.a.b r0 = r0.f217c
            if (r0 == 0) goto L_0x03f8
            android.support.constraint.a.h r0 = r0.f223i
            goto L_0x03fa
        L_0x03f8:
            r0 = r16
        L_0x03fa:
            if (r8 != 0) goto L_0x0408
            android.support.constraint.a.a.b r3 = r14.f293m
            android.support.constraint.a.a.b r3 = r3.f217c
            if (r3 == 0) goto L_0x0406
            android.support.constraint.a.a.d r3 = r3.f215a
            r8 = r3
            goto L_0x0408
        L_0x0406:
            r8 = r16
        L_0x0408:
            r3 = r8
            if (r3 == 0) goto L_0x043f
            android.support.constraint.a.a.b r4 = r3.f289k
            android.support.constraint.a.h r4 = r4.f223i
            if (r2 == 0) goto L_0x041c
            android.support.constraint.a.a.b r4 = r14.f293m
            android.support.constraint.a.a.b r4 = r4.f217c
            if (r4 == 0) goto L_0x041a
            android.support.constraint.a.h r4 = r4.f223i
            goto L_0x041c
        L_0x041a:
            r4 = r16
        L_0x041c:
            if (r0 == 0) goto L_0x043f
            if (r4 == 0) goto L_0x043f
            android.support.constraint.a.h r8 = r6.f223i
            r11 = 1056964608(0x3f000000, float:0.5)
            android.support.constraint.a.h r13 = r7.f223i
            r6 = 4
            r7 = r31
            r20 = r9
            r9 = r0
            r0 = 3
            r0 = r12
            r12 = r4
            r4 = r19
            r19 = r14
            r21 = 0
            r14 = r20
            r20 = r3
            r3 = r15
            r15 = r6
            r7.mo250a(r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0449
        L_0x043f:
            r20 = r3
            r0 = r12
            r3 = r15
            r4 = r19
            r21 = 0
            r19 = r14
        L_0x0449:
            if (r2 == 0) goto L_0x044d
            r20 = r16
        L_0x044d:
            r6 = r30
            r12 = r0
            r7 = r2
            r15 = r3
            r13 = r4
            r4 = r17
            r3 = r18
            r2 = r19
            r0 = r20
            goto L_0x02db
        L_0x045d:
            r0 = r12
            r4 = r13
            r3 = r15
            r21 = 0
            if (r5 == 0) goto L_0x049f
            android.support.constraint.a.a.b r1 = r1.f289k
            android.support.constraint.a.a.b r5 = r2.f293m
            int r10 = r1.mo121c()
            int r14 = r5.mo121c()
            android.support.constraint.a.a.b r6 = r0.f289k
            android.support.constraint.a.a.b r6 = r6.f217c
            if (r6 == 0) goto L_0x047a
            android.support.constraint.a.h r6 = r6.f223i
            r9 = r6
            goto L_0x047c
        L_0x047a:
            r9 = r16
        L_0x047c:
            android.support.constraint.a.a.b r2 = r2.f293m
            android.support.constraint.a.a.b r2 = r2.f217c
            if (r2 == 0) goto L_0x0486
            android.support.constraint.a.h r2 = r2.f223i
            r12 = r2
            goto L_0x0488
        L_0x0486:
            r12 = r16
        L_0x0488:
            if (r9 == 0) goto L_0x049f
            if (r12 == 0) goto L_0x049f
            android.support.constraint.a.h r2 = r5.f223i
            int r6 = -r14
            r7 = 1
            r3.mo255c(r2, r12, r6, r7)
            android.support.constraint.a.h r8 = r1.f223i
            float r11 = r0.f259P
            android.support.constraint.a.h r13 = r5.f223i
            r15 = 4
            r7 = r31
            r7.mo250a(r8, r9, r10, r11, r12, r13, r14, r15)
        L_0x049f:
            int r13 = r4 + 1
            r6 = r30
            r15 = r3
            r14 = r21
            goto L_0x0006
        L_0x04a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p005a.p006a.C0055e.m225b(android.support.constraint.a.e):void");
    }

    /* renamed from: c */
    private boolean m226c(C0066e eVar) {
        int size = this.f354pa.size();
        for (int i = 0; i < size; i++) {
            C0053d dVar = this.f354pa.get(i);
            dVar.f271b = -1;
            dVar.f273c = -1;
            C0053d.C0054a aVar = dVar.f260Q;
            C0053d.C0054a aVar2 = C0053d.C0054a.MATCH_CONSTRAINT;
            if (aVar == aVar2 || dVar.f261R == aVar2) {
                dVar.f271b = 1;
                dVar.f273c = 1;
            }
        }
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        while (!z) {
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                C0053d dVar2 = this.f354pa.get(i6);
                if (dVar2.f271b == -1) {
                    if (this.f260Q == C0053d.C0054a.WRAP_CONTENT) {
                        dVar2.f271b = 1;
                    } else {
                        C0058h.m254a(this, eVar, dVar2);
                    }
                }
                if (dVar2.f273c == -1) {
                    if (this.f261R == C0053d.C0054a.WRAP_CONTENT) {
                        dVar2.f273c = 1;
                    } else {
                        C0058h.m257c(this, eVar, dVar2);
                    }
                }
                if (dVar2.f273c == -1) {
                    i4++;
                }
                if (dVar2.f271b == -1) {
                    i5++;
                }
            }
            if ((i4 == 0 && i5 == 0) || (i2 == i4 && i3 == i5)) {
                z = true;
            }
            i2 = i4;
            i3 = i5;
        }
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            C0053d dVar3 = this.f354pa.get(i9);
            int i10 = dVar3.f271b;
            if (i10 == 1 || i10 == -1) {
                i7++;
            }
            int i11 = dVar3.f273c;
            if (i11 == 1 || i11 == -1) {
                i8++;
            }
        }
        return i7 == 0 && i8 == 0;
    }

    /* renamed from: d */
    private void m227d(C0053d dVar) {
        int i = 0;
        while (true) {
            int i2 = this.f333za;
            if (i >= i2) {
                int i3 = i2 + 1;
                C0053d[] dVarArr = this.f318Da;
                if (i3 >= dVarArr.length) {
                    this.f318Da = (C0053d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
                }
                C0053d[] dVarArr2 = this.f318Da;
                int i4 = this.f333za;
                dVarArr2[i4] = dVar;
                this.f333za = i4 + 1;
                return;
            } else if (this.f318Da[i] != dVar) {
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    private void m228e(C0053d dVar) {
        int i = 0;
        while (true) {
            int i2 = this.f315Aa;
            if (i >= i2) {
                int i3 = i2 + 1;
                C0053d[] dVarArr = this.f317Ca;
                if (i3 >= dVarArr.length) {
                    this.f317Ca = (C0053d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
                }
                C0053d[] dVarArr2 = this.f317Ca;
                int i4 = this.f315Aa;
                dVarArr2[i4] = dVar;
                this.f315Aa = i4 + 1;
                return;
            } else if (this.f317Ca[i] != dVar) {
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: A */
    public void mo130A() {
        this.f324qa.mo258f();
        this.f329va = 0;
        this.f331xa = 0;
        this.f330wa = 0;
        this.f332ya = 0;
        super.mo130A();
    }

    /* renamed from: E */
    public void mo193E() {
        boolean z;
        boolean z2;
        C0053d.C0054a aVar;
        int i = this.f245B;
        int i2 = this.f246C;
        int i3 = 0;
        int max = Math.max(0, mo185t());
        int max2 = Math.max(0, mo172j());
        this.f322Ha = false;
        this.f323Ia = false;
        if (this.f302s != null) {
            if (this.f326sa == null) {
                this.f326sa = new C0060j(this);
            }
            this.f326sa.mo213b(this);
            mo175k(this.f329va);
            mo177l(this.f330wa);
            mo131B();
            mo143a(this.f324qa.mo256d());
        } else {
            this.f245B = 0;
            this.f246C = 0;
        }
        C0053d.C0054a aVar2 = this.f261R;
        C0053d.C0054a aVar3 = this.f260Q;
        char c = 2;
        if (this.f319Ea == 2 && (aVar2 == (aVar = C0053d.C0054a.WRAP_CONTENT) || aVar3 == aVar)) {
            mo200a(this.f354pa, this.f320Fa);
            z = this.f320Fa[0];
            if (max > 0 && max2 > 0 && (this.f327ta > max || this.f328ua > max2)) {
                z = false;
            }
            if (z) {
                if (this.f260Q == C0053d.C0054a.WRAP_CONTENT) {
                    this.f260Q = C0053d.C0054a.FIXED;
                    if (max <= 0 || max >= this.f327ta) {
                        mo169h(Math.max(this.f254K, this.f327ta));
                    } else {
                        this.f322Ha = true;
                        mo169h(max);
                    }
                }
                if (this.f261R == C0053d.C0054a.WRAP_CONTENT) {
                    this.f261R = C0053d.C0054a.FIXED;
                    if (max2 <= 0 || max2 >= this.f328ua) {
                        mo149b(Math.max(this.f255L, this.f328ua));
                    } else {
                        this.f323Ia = true;
                        mo149b(max2);
                    }
                }
            }
        } else {
            z = false;
        }
        m222J();
        int size = this.f354pa.size();
        for (int i4 = 0; i4 < size; i4++) {
            C0053d dVar = this.f354pa.get(i4);
            if (dVar instanceof C0062k) {
                ((C0062k) dVar).mo193E();
            }
        }
        boolean z3 = z;
        int i5 = 0;
        boolean z4 = true;
        while (z4) {
            int i6 = i5 + 1;
            try {
                this.f324qa.mo258f();
                z4 = mo202c(this.f324qa, Integer.MAX_VALUE);
                if (z4) {
                    this.f324qa.mo257e();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (!z4) {
                mo153b(this.f324qa, Integer.MAX_VALUE);
                int i7 = i3;
                while (true) {
                    if (i7 >= size) {
                        break;
                    }
                    C0053d dVar2 = this.f354pa.get(i7);
                    if (dVar2.f260Q != C0053d.C0054a.MATCH_CONSTRAINT || dVar2.mo185t() >= dVar2.mo188v()) {
                        if (dVar2.f261R == C0053d.C0054a.MATCH_CONSTRAINT && dVar2.mo172j() < dVar2.mo187u()) {
                            this.f320Fa[c] = true;
                            break;
                        }
                        i7++;
                    } else {
                        this.f320Fa[c] = true;
                        break;
                    }
                }
            } else {
                mo199a(this.f324qa, Integer.MAX_VALUE, this.f320Fa);
            }
            if (i6 >= 8 || !this.f320Fa[c]) {
                z2 = false;
            } else {
                int i8 = 0;
                int i9 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    C0053d dVar3 = this.f354pa.get(i10);
                    i8 = Math.max(i8, dVar3.f245B + dVar3.mo185t());
                    i9 = Math.max(i9, dVar3.f246C + dVar3.mo172j());
                }
                int max3 = Math.max(this.f254K, i8);
                int max4 = Math.max(this.f255L, i9);
                if (aVar3 != C0053d.C0054a.WRAP_CONTENT || mo185t() >= max3) {
                    z2 = false;
                } else {
                    mo169h(max3);
                    this.f260Q = C0053d.C0054a.WRAP_CONTENT;
                    z2 = true;
                    z3 = true;
                }
                if (aVar2 == C0053d.C0054a.WRAP_CONTENT && mo172j() < max4) {
                    mo149b(max4);
                    this.f261R = C0053d.C0054a.WRAP_CONTENT;
                    z2 = true;
                    z3 = true;
                }
            }
            int max5 = Math.max(this.f254K, mo185t());
            if (max5 > mo185t()) {
                mo169h(max5);
                this.f260Q = C0053d.C0054a.FIXED;
                z2 = true;
                z3 = true;
            }
            int max6 = Math.max(this.f255L, mo172j());
            if (max6 > mo172j()) {
                mo149b(max6);
                this.f261R = C0053d.C0054a.FIXED;
                z2 = true;
                z3 = true;
            }
            if (!z3) {
                if (this.f260Q == C0053d.C0054a.WRAP_CONTENT && max > 0 && mo185t() > max) {
                    this.f322Ha = true;
                    this.f260Q = C0053d.C0054a.FIXED;
                    mo169h(max);
                    z2 = true;
                    z3 = true;
                }
                if (this.f261R == C0053d.C0054a.WRAP_CONTENT && max2 > 0 && mo172j() > max2) {
                    this.f323Ia = true;
                    this.f261R = C0053d.C0054a.FIXED;
                    mo149b(max2);
                    z4 = true;
                    z3 = true;
                    i5 = i6;
                    i3 = 0;
                    c = 2;
                }
            }
            z4 = z2;
            i5 = i6;
            i3 = 0;
            c = 2;
        }
        if (this.f302s != null) {
            int max7 = Math.max(this.f254K, mo185t());
            int max8 = Math.max(this.f255L, mo172j());
            this.f326sa.mo212a(this);
            mo169h(max7 + this.f329va + this.f331xa);
            mo149b(max8 + this.f330wa + this.f332ya);
        } else {
            this.f245B = i;
            this.f246C = i2;
        }
        if (z3) {
            this.f260Q = aVar3;
            this.f261R = aVar2;
        }
        mo143a(this.f324qa.mo256d());
        if (this == mo204D()) {
            mo132C();
        }
    }

    /* renamed from: G */
    public boolean mo194G() {
        return false;
    }

    /* renamed from: H */
    public boolean mo195H() {
        return this.f323Ia;
    }

    /* renamed from: I */
    public boolean mo196I() {
        return this.f322Ha;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo197a(C0053d dVar, int i) {
        if (i == 0) {
            while (true) {
                C0048b bVar = dVar.f287j;
                C0048b bVar2 = bVar.f217c;
                if (bVar2 == null) {
                    break;
                }
                C0053d dVar2 = bVar2.f215a;
                C0048b bVar3 = dVar2.f291l.f217c;
                if (bVar3 == null || bVar3 != bVar || dVar2 == dVar) {
                    break;
                }
                dVar = dVar2;
            }
            m227d(dVar);
        } else if (i == 1) {
            while (true) {
                C0048b bVar4 = dVar.f289k;
                C0048b bVar5 = bVar4.f217c;
                if (bVar5 == null) {
                    break;
                }
                C0053d dVar3 = bVar5.f215a;
                C0048b bVar6 = dVar3.f293m.f217c;
                if (bVar6 == null || bVar6 != bVar4 || dVar3 == dVar) {
                    break;
                }
                dVar = dVar3;
            }
            m228e(dVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:118:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0109  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo198a(android.support.constraint.p005a.p006a.C0053d r9, boolean[] r10) {
        /*
            r8 = this;
            android.support.constraint.a.a.d$a r0 = r9.f260Q
            android.support.constraint.a.a.d$a r1 = android.support.constraint.p005a.p006a.C0053d.C0054a.MATCH_CONSTRAINT
            r2 = 0
            r3 = 0
            if (r0 != r1) goto L_0x0015
            android.support.constraint.a.a.d$a r0 = r9.f261R
            if (r0 != r1) goto L_0x0015
            float r0 = r9.f305v
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0015
            r10[r3] = r3
            return
        L_0x0015:
            int r0 = r9.mo178m()
            android.support.constraint.a.a.d$a r1 = r9.f260Q
            android.support.constraint.a.a.d$a r4 = android.support.constraint.p005a.p006a.C0053d.C0054a.MATCH_CONSTRAINT
            if (r1 != r4) goto L_0x002c
            android.support.constraint.a.a.d$a r1 = r9.f261R
            if (r1 == r4) goto L_0x002c
            float r1 = r9.f305v
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x002c
            r10[r3] = r3
            return
        L_0x002c:
            r1 = 1
            r9.f280fa = r1
            boolean r2 = r9 instanceof android.support.constraint.p005a.p006a.C0057g
            if (r2 == 0) goto L_0x005c
            r10 = r9
            android.support.constraint.a.a.g r10 = (android.support.constraint.p005a.p006a.C0057g) r10
            int r2 = r10.mo204D()
            if (r2 != r1) goto L_0x0058
            int r0 = r10.mo205E()
            r1 = -1
            if (r0 == r1) goto L_0x004a
            int r10 = r10.mo205E()
            r0 = r3
            r3 = r10
            goto L_0x0059
        L_0x004a:
            int r0 = r10.mo206F()
            if (r0 == r1) goto L_0x0056
            int r10 = r10.mo206F()
            r0 = r10
            goto L_0x0059
        L_0x0056:
            r0 = r3
            goto L_0x0059
        L_0x0058:
            r3 = r0
        L_0x0059:
            r2 = r0
            goto L_0x0181
        L_0x005c:
            android.support.constraint.a.a.b r2 = r9.f291l
            boolean r2 = r2.mo127i()
            if (r2 != 0) goto L_0x0073
            android.support.constraint.a.a.b r2 = r9.f287j
            boolean r2 = r2.mo127i()
            if (r2 != 0) goto L_0x0073
            int r10 = r9.mo189w()
            int r3 = r0 + r10
            goto L_0x0059
        L_0x0073:
            android.support.constraint.a.a.b r2 = r9.f291l
            android.support.constraint.a.a.b r2 = r2.f217c
            if (r2 == 0) goto L_0x008e
            android.support.constraint.a.a.b r4 = r9.f287j
            android.support.constraint.a.a.b r4 = r4.f217c
            if (r4 == 0) goto L_0x008e
            if (r2 == r4) goto L_0x008b
            android.support.constraint.a.a.d r2 = r2.f215a
            android.support.constraint.a.a.d r4 = r4.f215a
            if (r2 != r4) goto L_0x008e
            android.support.constraint.a.a.d r4 = r9.f302s
            if (r2 == r4) goto L_0x008e
        L_0x008b:
            r10[r3] = r3
            return
        L_0x008e:
            android.support.constraint.a.a.b r2 = r9.f291l
            android.support.constraint.a.a.b r4 = r2.f217c
            r5 = 0
            if (r4 == 0) goto L_0x00aa
            android.support.constraint.a.a.d r4 = r4.f215a
            int r2 = r2.mo121c()
            int r2 = r2 + r0
            boolean r6 = r4.mo192z()
            if (r6 != 0) goto L_0x00ac
            boolean r6 = r4.f280fa
            if (r6 != 0) goto L_0x00ac
            r8.mo198a((android.support.constraint.p005a.p006a.C0053d) r4, (boolean[]) r10)
            goto L_0x00ac
        L_0x00aa:
            r2 = r0
            r4 = r5
        L_0x00ac:
            android.support.constraint.a.a.b r6 = r9.f287j
            android.support.constraint.a.a.b r7 = r6.f217c
            if (r7 == 0) goto L_0x00c6
            android.support.constraint.a.a.d r5 = r7.f215a
            int r6 = r6.mo121c()
            int r0 = r0 + r6
            boolean r6 = r5.mo192z()
            if (r6 != 0) goto L_0x00c6
            boolean r6 = r5.f280fa
            if (r6 != 0) goto L_0x00c6
            r8.mo198a((android.support.constraint.p005a.p006a.C0053d) r5, (boolean[]) r10)
        L_0x00c6:
            android.support.constraint.a.a.b r10 = r9.f291l
            android.support.constraint.a.a.b r10 = r10.f217c
            if (r10 == 0) goto L_0x0120
            boolean r10 = r4.mo192z()
            if (r10 != 0) goto L_0x0120
            android.support.constraint.a.a.b r10 = r9.f291l
            android.support.constraint.a.a.b r10 = r10.f217c
            android.support.constraint.a.a.b$c r6 = r10.f216b
            android.support.constraint.a.a.b$c r7 = android.support.constraint.p005a.p006a.C0048b.C0051c.RIGHT
            if (r6 != r7) goto L_0x00e5
            int r10 = r4.f269Z
            int r6 = r4.mo178m()
            int r10 = r10 - r6
        L_0x00e3:
            int r2 = r2 + r10
            goto L_0x00f0
        L_0x00e5:
            android.support.constraint.a.a.b$c r10 = r10.mo126h()
            android.support.constraint.a.a.b$c r6 = android.support.constraint.p005a.p006a.C0048b.C0051c.LEFT
            if (r10 != r6) goto L_0x00f0
            int r10 = r4.f269Z
            goto L_0x00e3
        L_0x00f0:
            boolean r10 = r4.f274ca
            if (r10 != 0) goto L_0x0109
            android.support.constraint.a.a.b r10 = r4.f287j
            android.support.constraint.a.a.b r10 = r10.f217c
            if (r10 == 0) goto L_0x0107
            android.support.constraint.a.a.b r10 = r4.f291l
            android.support.constraint.a.a.b r10 = r10.f217c
            if (r10 == 0) goto L_0x0107
            android.support.constraint.a.a.d$a r10 = r4.f260Q
            android.support.constraint.a.a.d$a r6 = android.support.constraint.p005a.p006a.C0053d.C0054a.MATCH_CONSTRAINT
            if (r10 == r6) goto L_0x0107
            goto L_0x0109
        L_0x0107:
            r10 = r3
            goto L_0x010a
        L_0x0109:
            r10 = r1
        L_0x010a:
            r9.f274ca = r10
            boolean r10 = r9.f274ca
            if (r10 == 0) goto L_0x0120
            android.support.constraint.a.a.b r10 = r4.f287j
            android.support.constraint.a.a.b r10 = r10.f217c
            if (r10 != 0) goto L_0x0117
            goto L_0x011b
        L_0x0117:
            android.support.constraint.a.a.d r10 = r10.f215a
            if (r10 == r9) goto L_0x0120
        L_0x011b:
            int r10 = r4.f269Z
            int r10 = r2 - r10
            int r2 = r2 + r10
        L_0x0120:
            android.support.constraint.a.a.b r10 = r9.f287j
            android.support.constraint.a.a.b r10 = r10.f217c
            if (r10 == 0) goto L_0x0180
            boolean r10 = r5.mo192z()
            if (r10 != 0) goto L_0x0180
            android.support.constraint.a.a.b r10 = r9.f287j
            android.support.constraint.a.a.b r10 = r10.f217c
            android.support.constraint.a.a.b$c r10 = r10.mo126h()
            android.support.constraint.a.a.b$c r4 = android.support.constraint.p005a.p006a.C0048b.C0051c.LEFT
            if (r10 != r4) goto L_0x0141
            int r10 = r5.f268Y
            int r4 = r5.mo178m()
            int r10 = r10 - r4
        L_0x013f:
            int r0 = r0 + r10
            goto L_0x0150
        L_0x0141:
            android.support.constraint.a.a.b r10 = r9.f287j
            android.support.constraint.a.a.b r10 = r10.f217c
            android.support.constraint.a.a.b$c r10 = r10.mo126h()
            android.support.constraint.a.a.b$c r4 = android.support.constraint.p005a.p006a.C0048b.C0051c.RIGHT
            if (r10 != r4) goto L_0x0150
            int r10 = r5.f268Y
            goto L_0x013f
        L_0x0150:
            boolean r10 = r5.f272ba
            if (r10 != 0) goto L_0x0168
            android.support.constraint.a.a.b r10 = r5.f287j
            android.support.constraint.a.a.b r10 = r10.f217c
            if (r10 == 0) goto L_0x0167
            android.support.constraint.a.a.b r10 = r5.f291l
            android.support.constraint.a.a.b r10 = r10.f217c
            if (r10 == 0) goto L_0x0167
            android.support.constraint.a.a.d$a r10 = r5.f260Q
            android.support.constraint.a.a.d$a r4 = android.support.constraint.p005a.p006a.C0053d.C0054a.MATCH_CONSTRAINT
            if (r10 == r4) goto L_0x0167
            goto L_0x0168
        L_0x0167:
            r1 = r3
        L_0x0168:
            r9.f272ba = r1
            boolean r10 = r9.f272ba
            if (r10 == 0) goto L_0x0180
            android.support.constraint.a.a.b r10 = r5.f291l
            android.support.constraint.a.a.b r10 = r10.f217c
            if (r10 != 0) goto L_0x0175
            goto L_0x0179
        L_0x0175:
            android.support.constraint.a.a.d r10 = r10.f215a
            if (r10 == r9) goto L_0x0180
        L_0x0179:
            int r10 = r5.f268Y
            int r10 = r0 - r10
            int r3 = r0 + r10
            goto L_0x0181
        L_0x0180:
            r3 = r0
        L_0x0181:
            int r10 = r9.mo184s()
            r0 = 8
            if (r10 != r0) goto L_0x018d
            int r10 = r9.f303t
            int r3 = r3 - r10
            int r2 = r2 - r10
        L_0x018d:
            r9.f268Y = r3
            r9.f269Z = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p005a.p006a.C0055e.mo198a(android.support.constraint.a.a.d, boolean[]):void");
    }

    /* renamed from: a */
    public void mo199a(C0066e eVar, int i, boolean[] zArr) {
        zArr[2] = false;
        mo153b(eVar, i);
        int size = this.f354pa.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0053d dVar = this.f354pa.get(i2);
            dVar.mo153b(eVar, i);
            if (dVar.f260Q == C0053d.C0054a.MATCH_CONSTRAINT && dVar.mo185t() < dVar.mo188v()) {
                zArr[2] = true;
            }
            if (dVar.f261R == C0053d.C0054a.MATCH_CONSTRAINT && dVar.mo172j() < dVar.mo187u()) {
                zArr[2] = true;
            }
        }
    }

    /* renamed from: a */
    public void mo200a(ArrayList<C0053d> arrayList, boolean[] zArr) {
        ArrayList<C0053d> arrayList2 = arrayList;
        boolean[] zArr2 = zArr;
        int size = arrayList.size();
        char c = 0;
        zArr2[0] = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i < size) {
            C0053d dVar = arrayList2.get(i);
            if (!dVar.mo192z()) {
                if (!dVar.f280fa) {
                    mo198a(dVar, zArr2);
                }
                if (!dVar.f282ga) {
                    mo201b(dVar, zArr2);
                }
                if (zArr2[c]) {
                    int t = (dVar.f268Y + dVar.f269Z) - dVar.mo185t();
                    int j = (dVar.f267X + dVar.f270aa) - dVar.mo172j();
                    int t2 = dVar.f260Q == C0053d.C0054a.MATCH_PARENT ? dVar.mo185t() + dVar.f287j.f218d + dVar.f291l.f218d : t;
                    int j2 = dVar.f261R == C0053d.C0054a.MATCH_PARENT ? dVar.mo172j() + dVar.f289k.f218d + dVar.f293m.f218d : j;
                    if (dVar.mo184s() == 8) {
                        t2 = 0;
                        j2 = 0;
                    }
                    i2 = Math.max(i2, dVar.f268Y);
                    i3 = Math.max(i3, dVar.f269Z);
                    i6 = Math.max(i6, dVar.f270aa);
                    i5 = Math.max(i5, dVar.f267X);
                    int max = Math.max(i4, t2);
                    i7 = Math.max(i7, j2);
                    i4 = max;
                } else {
                    return;
                }
            }
            i++;
            c = 0;
        }
        this.f327ta = Math.max(this.f254K, Math.max(Math.max(i2, i3), i4));
        this.f328ua = Math.max(this.f255L, Math.max(Math.max(i5, i6), i7));
        for (int i8 = 0; i8 < size; i8++) {
            C0053d dVar2 = arrayList2.get(i8);
            dVar2.f280fa = false;
            dVar2.f282ga = false;
            dVar2.f272ba = false;
            dVar2.f274ca = false;
            dVar2.f276da = false;
            dVar2.f278ea = false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:130:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0156  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo201b(android.support.constraint.p005a.p006a.C0053d r9, boolean[] r10) {
        /*
            r8 = this;
            android.support.constraint.a.a.d$a r0 = r9.f261R
            android.support.constraint.a.a.d$a r1 = android.support.constraint.p005a.p006a.C0053d.C0054a.MATCH_CONSTRAINT
            r2 = 0
            if (r0 != r1) goto L_0x0015
            android.support.constraint.a.a.d$a r0 = r9.f260Q
            if (r0 == r1) goto L_0x0015
            float r0 = r9.f305v
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0015
            r10[r2] = r2
            return
        L_0x0015:
            int r0 = r9.mo176l()
            r1 = 1
            r9.f282ga = r1
            boolean r3 = r9 instanceof android.support.constraint.p005a.p006a.C0057g
            r4 = 8
            if (r3 == 0) goto L_0x004b
            r10 = r9
            android.support.constraint.a.a.g r10 = (android.support.constraint.p005a.p006a.C0057g) r10
            int r1 = r10.mo204D()
            if (r1 != 0) goto L_0x0047
            int r0 = r10.mo205E()
            r1 = -1
            if (r0 == r1) goto L_0x0039
            int r10 = r10.mo205E()
            r0 = r2
            r2 = r10
            goto L_0x0048
        L_0x0039:
            int r0 = r10.mo206F()
            if (r0 == r1) goto L_0x0045
            int r10 = r10.mo206F()
            r0 = r10
            goto L_0x0048
        L_0x0045:
            r0 = r2
            goto L_0x0048
        L_0x0047:
            r2 = r0
        L_0x0048:
            r6 = r2
            goto L_0x01d3
        L_0x004b:
            android.support.constraint.a.a.b r3 = r9.f295n
            android.support.constraint.a.a.b r3 = r3.f217c
            if (r3 != 0) goto L_0x0064
            android.support.constraint.a.a.b r3 = r9.f289k
            android.support.constraint.a.a.b r3 = r3.f217c
            if (r3 != 0) goto L_0x0064
            android.support.constraint.a.a.b r3 = r9.f293m
            android.support.constraint.a.a.b r3 = r3.f217c
            if (r3 != 0) goto L_0x0064
            int r10 = r9.mo190x()
            int r2 = r0 + r10
            goto L_0x0048
        L_0x0064:
            android.support.constraint.a.a.b r3 = r9.f293m
            android.support.constraint.a.a.b r3 = r3.f217c
            if (r3 == 0) goto L_0x007f
            android.support.constraint.a.a.b r5 = r9.f289k
            android.support.constraint.a.a.b r5 = r5.f217c
            if (r5 == 0) goto L_0x007f
            if (r3 == r5) goto L_0x007c
            android.support.constraint.a.a.d r3 = r3.f215a
            android.support.constraint.a.a.d r5 = r5.f215a
            if (r3 != r5) goto L_0x007f
            android.support.constraint.a.a.d r5 = r9.f302s
            if (r3 == r5) goto L_0x007f
        L_0x007c:
            r10[r2] = r2
            return
        L_0x007f:
            android.support.constraint.a.a.b r3 = r9.f295n
            boolean r3 = r3.mo127i()
            if (r3 == 0) goto L_0x00b9
            android.support.constraint.a.a.b r1 = r9.f295n
            android.support.constraint.a.a.b r1 = r1.f217c
            android.support.constraint.a.a.d r1 = r1.mo122d()
            boolean r2 = r1.f282ga
            if (r2 != 0) goto L_0x0096
            r8.mo201b(r1, r10)
        L_0x0096:
            int r10 = r1.f267X
            int r2 = r1.f304u
            int r10 = r10 - r2
            int r10 = r10 + r0
            int r10 = java.lang.Math.max(r10, r0)
            int r2 = r1.f270aa
            int r1 = r1.f304u
            int r2 = r2 - r1
            int r2 = r2 + r0
            int r0 = java.lang.Math.max(r2, r0)
            int r1 = r9.mo184s()
            if (r1 != r4) goto L_0x00b4
            int r1 = r9.f304u
            int r10 = r10 - r1
            int r0 = r0 - r1
        L_0x00b4:
            r9.f267X = r10
        L_0x00b6:
            r9.f270aa = r0
            return
        L_0x00b9:
            android.support.constraint.a.a.b r3 = r9.f289k
            boolean r3 = r3.mo127i()
            r5 = 0
            if (r3 == 0) goto L_0x00df
            android.support.constraint.a.a.b r3 = r9.f289k
            android.support.constraint.a.a.b r3 = r3.f217c
            android.support.constraint.a.a.d r3 = r3.mo122d()
            android.support.constraint.a.a.b r6 = r9.f289k
            int r6 = r6.mo121c()
            int r6 = r6 + r0
            boolean r7 = r3.mo192z()
            if (r7 != 0) goto L_0x00e1
            boolean r7 = r3.f282ga
            if (r7 != 0) goto L_0x00e1
            r8.mo201b(r3, r10)
            goto L_0x00e1
        L_0x00df:
            r6 = r0
            r3 = r5
        L_0x00e1:
            android.support.constraint.a.a.b r7 = r9.f293m
            boolean r7 = r7.mo127i()
            if (r7 == 0) goto L_0x0105
            android.support.constraint.a.a.b r5 = r9.f293m
            android.support.constraint.a.a.b r5 = r5.f217c
            android.support.constraint.a.a.d r5 = r5.mo122d()
            android.support.constraint.a.a.b r7 = r9.f293m
            int r7 = r7.mo121c()
            int r0 = r0 + r7
            boolean r7 = r5.mo192z()
            if (r7 != 0) goto L_0x0105
            boolean r7 = r5.f282ga
            if (r7 != 0) goto L_0x0105
            r8.mo201b(r5, r10)
        L_0x0105:
            android.support.constraint.a.a.b r10 = r9.f289k
            android.support.constraint.a.a.b r10 = r10.f217c
            if (r10 == 0) goto L_0x016d
            boolean r10 = r3.mo192z()
            if (r10 != 0) goto L_0x016d
            android.support.constraint.a.a.b r10 = r9.f289k
            android.support.constraint.a.a.b r10 = r10.f217c
            android.support.constraint.a.a.b$c r10 = r10.mo126h()
            android.support.constraint.a.a.b$c r7 = android.support.constraint.p005a.p006a.C0048b.C0051c.TOP
            if (r10 != r7) goto L_0x0126
            int r10 = r3.f267X
            int r7 = r3.mo176l()
            int r10 = r10 - r7
        L_0x0124:
            int r6 = r6 + r10
            goto L_0x0135
        L_0x0126:
            android.support.constraint.a.a.b r10 = r9.f289k
            android.support.constraint.a.a.b r10 = r10.f217c
            android.support.constraint.a.a.b$c r10 = r10.mo126h()
            android.support.constraint.a.a.b$c r7 = android.support.constraint.p005a.p006a.C0048b.C0051c.BOTTOM
            if (r10 != r7) goto L_0x0135
            int r10 = r3.f267X
            goto L_0x0124
        L_0x0135:
            boolean r10 = r3.f276da
            if (r10 != 0) goto L_0x0156
            android.support.constraint.a.a.b r10 = r3.f289k
            android.support.constraint.a.a.b r10 = r10.f217c
            if (r10 == 0) goto L_0x0154
            android.support.constraint.a.a.d r10 = r10.f215a
            if (r10 == r9) goto L_0x0154
            android.support.constraint.a.a.b r10 = r3.f293m
            android.support.constraint.a.a.b r10 = r10.f217c
            if (r10 == 0) goto L_0x0154
            android.support.constraint.a.a.d r10 = r10.f215a
            if (r10 == r9) goto L_0x0154
            android.support.constraint.a.a.d$a r10 = r3.f261R
            android.support.constraint.a.a.d$a r7 = android.support.constraint.p005a.p006a.C0053d.C0054a.MATCH_CONSTRAINT
            if (r10 == r7) goto L_0x0154
            goto L_0x0156
        L_0x0154:
            r10 = r2
            goto L_0x0157
        L_0x0156:
            r10 = r1
        L_0x0157:
            r9.f276da = r10
            boolean r10 = r9.f276da
            if (r10 == 0) goto L_0x016d
            android.support.constraint.a.a.b r10 = r3.f293m
            android.support.constraint.a.a.b r10 = r10.f217c
            if (r10 != 0) goto L_0x0164
            goto L_0x0168
        L_0x0164:
            android.support.constraint.a.a.d r10 = r10.f215a
            if (r10 == r9) goto L_0x016d
        L_0x0168:
            int r10 = r3.f267X
            int r10 = r6 - r10
            int r6 = r6 + r10
        L_0x016d:
            android.support.constraint.a.a.b r10 = r9.f293m
            android.support.constraint.a.a.b r10 = r10.f217c
            if (r10 == 0) goto L_0x01d3
            boolean r10 = r5.mo192z()
            if (r10 != 0) goto L_0x01d3
            android.support.constraint.a.a.b r10 = r9.f293m
            android.support.constraint.a.a.b r10 = r10.f217c
            android.support.constraint.a.a.b$c r10 = r10.mo126h()
            android.support.constraint.a.a.b$c r3 = android.support.constraint.p005a.p006a.C0048b.C0051c.BOTTOM
            if (r10 != r3) goto L_0x018e
            int r10 = r5.f270aa
            int r3 = r5.mo176l()
            int r10 = r10 - r3
        L_0x018c:
            int r0 = r0 + r10
            goto L_0x019d
        L_0x018e:
            android.support.constraint.a.a.b r10 = r9.f293m
            android.support.constraint.a.a.b r10 = r10.f217c
            android.support.constraint.a.a.b$c r10 = r10.mo126h()
            android.support.constraint.a.a.b$c r3 = android.support.constraint.p005a.p006a.C0048b.C0051c.TOP
            if (r10 != r3) goto L_0x019d
            int r10 = r5.f270aa
            goto L_0x018c
        L_0x019d:
            boolean r10 = r5.f278ea
            if (r10 != 0) goto L_0x01bd
            android.support.constraint.a.a.b r10 = r5.f289k
            android.support.constraint.a.a.b r10 = r10.f217c
            if (r10 == 0) goto L_0x01bc
            android.support.constraint.a.a.d r10 = r10.f215a
            if (r10 == r9) goto L_0x01bc
            android.support.constraint.a.a.b r10 = r5.f293m
            android.support.constraint.a.a.b r10 = r10.f217c
            if (r10 == 0) goto L_0x01bc
            android.support.constraint.a.a.d r10 = r10.f215a
            if (r10 == r9) goto L_0x01bc
            android.support.constraint.a.a.d$a r10 = r5.f261R
            android.support.constraint.a.a.d$a r3 = android.support.constraint.p005a.p006a.C0053d.C0054a.MATCH_CONSTRAINT
            if (r10 == r3) goto L_0x01bc
            goto L_0x01bd
        L_0x01bc:
            r1 = r2
        L_0x01bd:
            r9.f278ea = r1
            boolean r10 = r9.f278ea
            if (r10 == 0) goto L_0x01d3
            android.support.constraint.a.a.b r10 = r5.f289k
            android.support.constraint.a.a.b r10 = r10.f217c
            if (r10 != 0) goto L_0x01ca
            goto L_0x01ce
        L_0x01ca:
            android.support.constraint.a.a.d r10 = r10.f215a
            if (r10 == r9) goto L_0x01d3
        L_0x01ce:
            int r10 = r5.f270aa
            int r10 = r0 - r10
            int r0 = r0 + r10
        L_0x01d3:
            int r10 = r9.mo184s()
            if (r10 != r4) goto L_0x01dd
            int r10 = r9.f304u
            int r6 = r6 - r10
            int r0 = r0 - r10
        L_0x01dd:
            r9.f267X = r6
            goto L_0x00b6
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p005a.p006a.C0055e.mo201b(android.support.constraint.a.a.d, boolean[]):void");
    }

    /* renamed from: c */
    public boolean mo202c(C0066e eVar, int i) {
        boolean z;
        mo144a(eVar, i);
        int size = this.f354pa.size();
        int i2 = this.f319Ea;
        if (i2 != 2 && i2 != 4) {
            z = true;
        } else if (m226c(eVar)) {
            return false;
        } else {
            z = false;
        }
        for (int i3 = 0; i3 < size; i3++) {
            C0053d dVar = this.f354pa.get(i3);
            if (dVar instanceof C0055e) {
                C0053d.C0054a aVar = dVar.f260Q;
                C0053d.C0054a aVar2 = dVar.f261R;
                if (aVar == C0053d.C0054a.WRAP_CONTENT) {
                    dVar.mo141a(C0053d.C0054a.FIXED);
                }
                if (aVar2 == C0053d.C0054a.WRAP_CONTENT) {
                    dVar.mo152b(C0053d.C0054a.FIXED);
                }
                dVar.mo144a(eVar, i);
                if (aVar == C0053d.C0054a.WRAP_CONTENT) {
                    dVar.mo141a(aVar);
                }
                if (aVar2 == C0053d.C0054a.WRAP_CONTENT) {
                    dVar.mo152b(aVar2);
                }
            } else {
                if (z) {
                    C0058h.m256b(this, eVar, dVar);
                }
                dVar.mo144a(eVar, i);
            }
        }
        if (this.f333za > 0) {
            m224a(eVar);
        }
        if (this.f315Aa > 0) {
            m225b(eVar);
        }
        return true;
    }

    /* renamed from: m */
    public void mo203m(int i) {
        this.f319Ea = i;
    }
}
