package android.support.constraint.p005a.p006a;

import android.support.constraint.p005a.C0066e;
import android.support.constraint.p005a.C0069h;
import android.support.constraint.p005a.p006a.C0053d;

/* renamed from: android.support.constraint.a.a.h */
public class C0058h {
    /* renamed from: a */
    static void m253a(C0055e eVar, C0066e eVar2, int i, C0053d dVar) {
        int i2;
        float f;
        float f2;
        C0048b bVar;
        float f3;
        C0048b bVar2;
        C0055e eVar3 = eVar;
        C0066e eVar4 = eVar2;
        int i3 = i;
        C0053d dVar2 = dVar;
        float f4 = 0.0f;
        int i4 = 0;
        int i5 = 0;
        C0053d dVar3 = null;
        while (true) {
            boolean z = true;
            if (dVar2 == null) {
                break;
            }
            if (dVar2.mo184s() != 8) {
                z = false;
            }
            if (!z) {
                i4++;
                if (dVar2.f260Q != C0053d.C0054a.MATCH_CONSTRAINT) {
                    int t = i5 + dVar2.mo185t();
                    C0048b bVar3 = dVar2.f287j;
                    int c = t + (bVar3.f217c != null ? bVar3.mo121c() : 0);
                    C0048b bVar4 = dVar2.f291l;
                    i5 = c + (bVar4.f217c != null ? bVar4.mo121c() : 0);
                } else {
                    f4 += dVar2.f292la;
                }
            }
            C0048b bVar5 = dVar2.f291l.f217c;
            C0053d dVar4 = bVar5 != null ? bVar5.f215a : null;
            if (dVar4 != null && ((bVar2 = dVar4.f287j.f217c) == null || !(bVar2 == null || bVar2.f215a == dVar2))) {
                dVar4 = null;
            }
            C0053d dVar5 = dVar4;
            dVar3 = dVar2;
            dVar2 = dVar5;
        }
        if (dVar3 != null) {
            C0048b bVar6 = dVar3.f291l.f217c;
            i2 = bVar6 != null ? bVar6.f215a.mo189w() : 0;
            C0048b bVar7 = dVar3.f291l.f217c;
            if (bVar7 != null && bVar7.f215a == eVar3) {
                i2 = eVar.mo180o();
            }
        } else {
            i2 = 0;
        }
        float f5 = ((float) (i2 - 0)) - ((float) i5);
        float f6 = f5 / ((float) (i4 + 1));
        if (i3 == 0) {
            f2 = f6;
            f = f2;
        } else {
            f2 = 0.0f;
            f = f5 / ((float) i3);
        }
        C0053d dVar6 = dVar;
        while (dVar6 != null) {
            C0048b bVar8 = dVar6.f287j;
            int c2 = bVar8.f217c != null ? bVar8.mo121c() : 0;
            C0048b bVar9 = dVar6.f291l;
            int c3 = bVar9.f217c != null ? bVar9.mo121c() : 0;
            if (dVar6.mo184s() != 8) {
                float f7 = (float) c2;
                float f8 = f2 + f7;
                eVar4.mo249a(dVar6.f287j.f223i, (int) (f8 + 0.5f));
                if (dVar6.f260Q == C0053d.C0054a.MATCH_CONSTRAINT) {
                    f3 = (f4 == 0.0f ? f - f7 : ((dVar6.f292la * f5) / f4) - f7) - ((float) c3);
                } else {
                    f3 = (float) dVar6.mo185t();
                }
                float f9 = f8 + f3;
                eVar4.mo249a(dVar6.f291l.f223i, (int) (0.5f + f9));
                if (i3 == 0) {
                    f9 += f;
                }
                f2 = f9 + ((float) c3);
            } else {
                int i6 = (int) ((f2 - (f / 2.0f)) + 0.5f);
                eVar4.mo249a(dVar6.f287j.f223i, i6);
                eVar4.mo249a(dVar6.f291l.f223i, i6);
            }
            C0048b bVar10 = dVar6.f291l.f217c;
            C0053d dVar7 = bVar10 != null ? bVar10.f215a : null;
            if (!(dVar7 == null || (bVar = dVar7.f287j.f217c) == null || bVar.f215a == dVar6)) {
                dVar7 = null;
            }
            dVar6 = dVar7 == eVar3 ? null : dVar7;
        }
    }

    /* renamed from: a */
    static void m254a(C0055e eVar, C0066e eVar2, C0053d dVar) {
        int c;
        int c2;
        int t;
        C0048b bVar;
        int i;
        C0053d.C0054a aVar = dVar.f260Q;
        if (aVar == C0053d.C0054a.MATCH_CONSTRAINT) {
            dVar.f271b = 1;
        } else if (eVar.f260Q == C0053d.C0054a.WRAP_CONTENT || aVar != C0053d.C0054a.MATCH_PARENT) {
            C0048b bVar2 = dVar.f287j;
            C0048b bVar3 = bVar2.f217c;
            if (bVar3 == null || (bVar = dVar.f291l.f217c) == null) {
                C0048b bVar4 = dVar.f287j;
                C0048b bVar5 = bVar4.f217c;
                if (bVar5 == null || bVar5.f215a != eVar) {
                    C0048b bVar6 = dVar.f291l.f217c;
                    if (bVar6 == null || bVar6.f215a != eVar) {
                        C0048b bVar7 = dVar.f287j;
                        C0048b bVar8 = bVar7.f217c;
                        if (bVar8 == null || bVar8.f215a.f271b != 2) {
                            C0048b bVar9 = dVar.f291l.f217c;
                            if (bVar9 == null || bVar9.f215a.f271b != 2) {
                                boolean z = dVar.f287j.f217c != null;
                                boolean z2 = dVar.f291l.f217c != null;
                                if (!z && !z2) {
                                    if (dVar instanceof C0057g) {
                                        C0057g gVar = (C0057g) dVar;
                                        if (gVar.mo204D() == 1) {
                                            C0048b bVar10 = dVar.f287j;
                                            bVar10.f223i = eVar2.mo246a((Object) bVar10);
                                            C0048b bVar11 = dVar.f291l;
                                            bVar11.f223i = eVar2.mo246a((Object) bVar11);
                                            int E = (int) ((gVar.mo205E() != -1 ? (float) gVar.mo205E() : gVar.mo206F() != -1 ? (float) (eVar.mo185t() - gVar.mo206F()) : gVar.mo207G() * ((float) eVar.mo185t())) + 0.5f);
                                            eVar2.mo249a(dVar.f287j.f223i, E);
                                            eVar2.mo249a(dVar.f291l.f223i, E);
                                            dVar.f271b = 2;
                                            dVar.f273c = 2;
                                            dVar.mo137a(E, E);
                                            dVar.mo161d(0, eVar.mo172j());
                                            return;
                                        }
                                        return;
                                    }
                                    C0048b bVar12 = dVar.f287j;
                                    bVar12.f223i = eVar2.mo246a((Object) bVar12);
                                    C0048b bVar13 = dVar.f291l;
                                    bVar13.f223i = eVar2.mo246a((Object) bVar13);
                                    int w = dVar.mo189w();
                                    int t2 = dVar.mo185t() + w;
                                    eVar2.mo249a(dVar.f287j.f223i, w);
                                    eVar2.mo249a(dVar.f291l.f223i, t2);
                                    dVar.f271b = 2;
                                    return;
                                }
                                return;
                            }
                            C0069h hVar = bVar9.f223i;
                            C0048b bVar14 = dVar.f287j;
                            bVar14.f223i = eVar2.mo246a((Object) bVar14);
                            C0048b bVar15 = dVar.f291l;
                            bVar15.f223i = eVar2.mo246a((Object) bVar15);
                            c = (int) ((hVar.f385e - ((float) dVar.f291l.mo121c())) + 0.5f);
                        } else {
                            C0069h hVar2 = bVar8.f223i;
                            bVar7.f223i = eVar2.mo246a((Object) bVar7);
                            C0048b bVar16 = dVar.f291l;
                            bVar16.f223i = eVar2.mo246a((Object) bVar16);
                            c2 = (int) (hVar2.f385e + ((float) dVar.f287j.mo121c()) + 0.5f);
                            t = dVar.mo185t() + c2;
                        }
                    } else {
                        C0048b bVar17 = dVar.f287j;
                        bVar17.f223i = eVar2.mo246a((Object) bVar17);
                        C0048b bVar18 = dVar.f291l;
                        bVar18.f223i = eVar2.mo246a((Object) bVar18);
                        c = eVar.mo185t() - dVar.f291l.mo121c();
                    }
                    int t3 = c - dVar.mo185t();
                    eVar2.mo249a(dVar.f287j.f223i, t3);
                    eVar2.mo249a(dVar.f291l.f223i, c);
                    dVar.f271b = 2;
                    dVar.mo137a(t3, c);
                    return;
                }
                c2 = bVar4.mo121c();
                t = dVar.mo185t() + c2;
                C0048b bVar19 = dVar.f287j;
                bVar19.f223i = eVar2.mo246a((Object) bVar19);
                C0048b bVar20 = dVar.f291l;
                bVar20.f223i = eVar2.mo246a((Object) bVar20);
                eVar2.mo249a(dVar.f287j.f223i, c2);
                eVar2.mo249a(dVar.f291l.f223i, t);
                dVar.f271b = 2;
                dVar.mo137a(c2, t);
            } else if (bVar3.f215a == eVar && bVar.f215a == eVar) {
                int c3 = bVar2.mo121c();
                int c4 = dVar.f291l.mo121c();
                if (eVar.f260Q == C0053d.C0054a.MATCH_CONSTRAINT) {
                    i = eVar.mo185t() - c4;
                } else {
                    c3 += (int) ((((float) (((eVar.mo185t() - c3) - c4) - dVar.mo185t())) * dVar.f258O) + 0.5f);
                    i = dVar.mo185t() + c3;
                }
                C0048b bVar21 = dVar.f287j;
                bVar21.f223i = eVar2.mo246a((Object) bVar21);
                C0048b bVar22 = dVar.f291l;
                bVar22.f223i = eVar2.mo246a((Object) bVar22);
                eVar2.mo249a(dVar.f287j.f223i, c3);
                eVar2.mo249a(dVar.f291l.f223i, i);
                dVar.f271b = 2;
                dVar.mo137a(c3, i);
            } else {
                dVar.f271b = 1;
            }
        } else {
            C0048b bVar23 = dVar.f287j;
            bVar23.f223i = eVar2.mo246a((Object) bVar23);
            C0048b bVar24 = dVar.f291l;
            bVar24.f223i = eVar2.mo246a((Object) bVar24);
            int i2 = dVar.f287j.f218d;
            int t4 = eVar.mo185t() - dVar.f291l.f218d;
            eVar2.mo249a(dVar.f287j.f223i, i2);
            eVar2.mo249a(dVar.f291l.f223i, t4);
            dVar.mo137a(i2, t4);
            dVar.f271b = 2;
        }
    }

    /* renamed from: b */
    static void m255b(C0055e eVar, C0066e eVar2, int i, C0053d dVar) {
        int i2;
        float f;
        float f2;
        C0048b bVar;
        float f3;
        C0048b bVar2;
        C0055e eVar3 = eVar;
        C0066e eVar4 = eVar2;
        int i3 = i;
        C0053d dVar2 = dVar;
        float f4 = 0.0f;
        int i4 = 0;
        int i5 = 0;
        C0053d dVar3 = null;
        while (true) {
            boolean z = true;
            if (dVar2 == null) {
                break;
            }
            if (dVar2.mo184s() != 8) {
                z = false;
            }
            if (!z) {
                i4++;
                if (dVar2.f261R != C0053d.C0054a.MATCH_CONSTRAINT) {
                    int j = i5 + dVar2.mo172j();
                    C0048b bVar3 = dVar2.f289k;
                    int c = j + (bVar3.f217c != null ? bVar3.mo121c() : 0);
                    C0048b bVar4 = dVar2.f293m;
                    i5 = c + (bVar4.f217c != null ? bVar4.mo121c() : 0);
                } else {
                    f4 += dVar2.f294ma;
                }
            }
            C0048b bVar5 = dVar2.f293m.f217c;
            C0053d dVar4 = bVar5 != null ? bVar5.f215a : null;
            if (dVar4 != null && ((bVar2 = dVar4.f289k.f217c) == null || !(bVar2 == null || bVar2.f215a == dVar2))) {
                dVar4 = null;
            }
            C0053d dVar5 = dVar4;
            dVar3 = dVar2;
            dVar2 = dVar5;
        }
        if (dVar3 != null) {
            C0048b bVar6 = dVar3.f293m.f217c;
            i2 = bVar6 != null ? bVar6.f215a.mo189w() : 0;
            C0048b bVar7 = dVar3.f293m.f217c;
            if (bVar7 != null && bVar7.f215a == eVar3) {
                i2 = eVar.mo154c();
            }
        } else {
            i2 = 0;
        }
        float f5 = ((float) (i2 - 0)) - ((float) i5);
        float f6 = f5 / ((float) (i4 + 1));
        if (i3 == 0) {
            f2 = f6;
            f = f2;
        } else {
            f2 = 0.0f;
            f = f5 / ((float) i3);
        }
        C0053d dVar6 = dVar;
        while (dVar6 != null) {
            C0048b bVar8 = dVar6.f289k;
            int c2 = bVar8.f217c != null ? bVar8.mo121c() : 0;
            C0048b bVar9 = dVar6.f293m;
            int c3 = bVar9.f217c != null ? bVar9.mo121c() : 0;
            if (dVar6.mo184s() != 8) {
                float f7 = (float) c2;
                float f8 = f2 + f7;
                eVar4.mo249a(dVar6.f289k.f223i, (int) (f8 + 0.5f));
                if (dVar6.f261R == C0053d.C0054a.MATCH_CONSTRAINT) {
                    f3 = (f4 == 0.0f ? f - f7 : ((dVar6.f294ma * f5) / f4) - f7) - ((float) c3);
                } else {
                    f3 = (float) dVar6.mo172j();
                }
                float f9 = f8 + f3;
                eVar4.mo249a(dVar6.f293m.f223i, (int) (0.5f + f9));
                if (i3 == 0) {
                    f9 += f;
                }
                f2 = f9 + ((float) c3);
            } else {
                int i6 = (int) ((f2 - (f / 2.0f)) + 0.5f);
                eVar4.mo249a(dVar6.f289k.f223i, i6);
                eVar4.mo249a(dVar6.f293m.f223i, i6);
            }
            C0048b bVar10 = dVar6.f293m.f217c;
            C0053d dVar7 = bVar10 != null ? bVar10.f215a : null;
            if (!(dVar7 == null || (bVar = dVar7.f289k.f217c) == null || bVar.f215a == dVar6)) {
                dVar7 = null;
            }
            dVar6 = dVar7 == eVar3 ? null : dVar7;
        }
    }

    /* renamed from: b */
    static void m256b(C0055e eVar, C0066e eVar2, C0053d dVar) {
        if (eVar.f260Q != C0053d.C0054a.WRAP_CONTENT && dVar.f260Q == C0053d.C0054a.MATCH_PARENT) {
            C0048b bVar = dVar.f287j;
            bVar.f223i = eVar2.mo246a((Object) bVar);
            C0048b bVar2 = dVar.f291l;
            bVar2.f223i = eVar2.mo246a((Object) bVar2);
            int i = dVar.f287j.f218d;
            int t = eVar.mo185t() - dVar.f291l.f218d;
            eVar2.mo249a(dVar.f287j.f223i, i);
            eVar2.mo249a(dVar.f291l.f223i, t);
            dVar.mo137a(i, t);
            dVar.f271b = 2;
        }
        if (eVar.f261R != C0053d.C0054a.WRAP_CONTENT && dVar.f261R == C0053d.C0054a.MATCH_PARENT) {
            C0048b bVar3 = dVar.f289k;
            bVar3.f223i = eVar2.mo246a((Object) bVar3);
            C0048b bVar4 = dVar.f293m;
            bVar4.f223i = eVar2.mo246a((Object) bVar4);
            int i2 = dVar.f289k.f218d;
            int j = eVar.mo172j() - dVar.f293m.f218d;
            eVar2.mo249a(dVar.f289k.f223i, i2);
            eVar2.mo249a(dVar.f293m.f223i, j);
            if (dVar.f253J > 0 || dVar.mo184s() == 8) {
                C0048b bVar5 = dVar.f295n;
                bVar5.f223i = eVar2.mo246a((Object) bVar5);
                eVar2.mo249a(dVar.f295n.f223i, dVar.f253J + i2);
            }
            dVar.mo161d(i2, j);
            dVar.f273c = 2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x011f, code lost:
        if (r10.mo184s() != 8) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x016b, code lost:
        if (r10.mo184s() != 8) goto L_0x017f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01c9, code lost:
        if (r10.mo184s() != 8) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0213, code lost:
        if (r10.mo184s() != 8) goto L_0x017f;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m257c(android.support.constraint.p005a.p006a.C0055e r8, android.support.constraint.p005a.C0066e r9, android.support.constraint.p005a.p006a.C0053d r10) {
        /*
            android.support.constraint.a.a.d$a r0 = r10.f261R
            android.support.constraint.a.a.d$a r1 = android.support.constraint.p005a.p006a.C0053d.C0054a.MATCH_CONSTRAINT
            r2 = 1
            if (r0 != r1) goto L_0x000a
            r10.f273c = r2
            return
        L_0x000a:
            android.support.constraint.a.a.d$a r1 = r8.f261R
            android.support.constraint.a.a.d$a r3 = android.support.constraint.p005a.p006a.C0053d.C0054a.WRAP_CONTENT
            r4 = 8
            r5 = 2
            if (r1 == r3) goto L_0x0064
            android.support.constraint.a.a.d$a r1 = android.support.constraint.p005a.p006a.C0053d.C0054a.MATCH_PARENT
            if (r0 != r1) goto L_0x0064
            android.support.constraint.a.a.b r0 = r10.f289k
            android.support.constraint.a.h r1 = r9.mo246a((java.lang.Object) r0)
            r0.f223i = r1
            android.support.constraint.a.a.b r0 = r10.f293m
            android.support.constraint.a.h r1 = r9.mo246a((java.lang.Object) r0)
            r0.f223i = r1
            android.support.constraint.a.a.b r0 = r10.f289k
            int r0 = r0.f218d
            int r8 = r8.mo172j()
            android.support.constraint.a.a.b r1 = r10.f293m
            int r1 = r1.f218d
            int r8 = r8 - r1
            android.support.constraint.a.a.b r1 = r10.f289k
            android.support.constraint.a.h r1 = r1.f223i
            r9.mo249a((android.support.constraint.p005a.C0069h) r1, (int) r0)
            android.support.constraint.a.a.b r1 = r10.f293m
            android.support.constraint.a.h r1 = r1.f223i
            r9.mo249a((android.support.constraint.p005a.C0069h) r1, (int) r8)
            int r1 = r10.f253J
            if (r1 > 0) goto L_0x004c
            int r1 = r10.mo184s()
            if (r1 != r4) goto L_0x005e
        L_0x004c:
            android.support.constraint.a.a.b r1 = r10.f295n
            android.support.constraint.a.h r2 = r9.mo246a((java.lang.Object) r1)
            r1.f223i = r2
            android.support.constraint.a.a.b r1 = r10.f295n
            android.support.constraint.a.h r1 = r1.f223i
            int r2 = r10.f253J
            int r2 = r2 + r0
            r9.mo249a((android.support.constraint.p005a.C0069h) r1, (int) r2)
        L_0x005e:
            r10.mo161d(r0, r8)
            r10.f273c = r5
            return
        L_0x0064:
            android.support.constraint.a.a.b r0 = r10.f289k
            android.support.constraint.a.a.b r1 = r0.f217c
            r3 = 1056964608(0x3f000000, float:0.5)
            if (r1 == 0) goto L_0x00e6
            android.support.constraint.a.a.b r6 = r10.f293m
            android.support.constraint.a.a.b r6 = r6.f217c
            if (r6 == 0) goto L_0x00e6
            android.support.constraint.a.a.d r1 = r1.f215a
            if (r1 != r8) goto L_0x00e3
            android.support.constraint.a.a.d r1 = r6.f215a
            if (r1 != r8) goto L_0x00e3
            int r0 = r0.mo121c()
            android.support.constraint.a.a.b r1 = r10.f293m
            int r1 = r1.mo121c()
            android.support.constraint.a.a.d$a r2 = r8.f261R
            android.support.constraint.a.a.d$a r6 = android.support.constraint.p005a.p006a.C0053d.C0054a.MATCH_CONSTRAINT
            if (r2 != r6) goto L_0x008b
            goto L_0x009e
        L_0x008b:
            int r2 = r10.mo172j()
            int r8 = r8.mo172j()
            int r8 = r8 - r0
            int r8 = r8 - r1
            int r8 = r8 - r2
            float r0 = (float) r0
            float r8 = (float) r8
            float r1 = r10.f259P
            float r8 = r8 * r1
            float r0 = r0 + r8
            float r0 = r0 + r3
            int r0 = (int) r0
        L_0x009e:
            int r8 = r10.mo172j()
            int r8 = r8 + r0
            android.support.constraint.a.a.b r1 = r10.f289k
            android.support.constraint.a.h r2 = r9.mo246a((java.lang.Object) r1)
            r1.f223i = r2
            android.support.constraint.a.a.b r1 = r10.f293m
            android.support.constraint.a.h r2 = r9.mo246a((java.lang.Object) r1)
            r1.f223i = r2
            android.support.constraint.a.a.b r1 = r10.f289k
            android.support.constraint.a.h r1 = r1.f223i
            r9.mo249a((android.support.constraint.p005a.C0069h) r1, (int) r0)
            android.support.constraint.a.a.b r1 = r10.f293m
            android.support.constraint.a.h r1 = r1.f223i
            r9.mo249a((android.support.constraint.p005a.C0069h) r1, (int) r8)
            int r1 = r10.f253J
            if (r1 > 0) goto L_0x00cb
            int r1 = r10.mo184s()
            if (r1 != r4) goto L_0x00dd
        L_0x00cb:
            android.support.constraint.a.a.b r1 = r10.f295n
            android.support.constraint.a.h r2 = r9.mo246a((java.lang.Object) r1)
            r1.f223i = r2
            android.support.constraint.a.a.b r1 = r10.f295n
            android.support.constraint.a.h r1 = r1.f223i
            int r2 = r10.f253J
            int r2 = r2 + r0
            r9.mo249a((android.support.constraint.p005a.C0069h) r1, (int) r2)
        L_0x00dd:
            r10.f273c = r5
            r10.mo161d(r0, r8)
            return
        L_0x00e3:
            r10.f273c = r2
            return
        L_0x00e6:
            android.support.constraint.a.a.b r0 = r10.f289k
            android.support.constraint.a.a.b r1 = r0.f217c
            if (r1 == 0) goto L_0x012a
            android.support.constraint.a.a.d r1 = r1.f215a
            if (r1 != r8) goto L_0x012a
            int r8 = r0.mo121c()
            int r0 = r10.mo172j()
            int r0 = r0 + r8
            android.support.constraint.a.a.b r1 = r10.f289k
            android.support.constraint.a.h r2 = r9.mo246a((java.lang.Object) r1)
            r1.f223i = r2
            android.support.constraint.a.a.b r1 = r10.f293m
            android.support.constraint.a.h r2 = r9.mo246a((java.lang.Object) r1)
            r1.f223i = r2
            android.support.constraint.a.a.b r1 = r10.f289k
            android.support.constraint.a.h r1 = r1.f223i
            r9.mo249a((android.support.constraint.p005a.C0069h) r1, (int) r8)
            android.support.constraint.a.a.b r1 = r10.f293m
            android.support.constraint.a.h r1 = r1.f223i
            r9.mo249a((android.support.constraint.p005a.C0069h) r1, (int) r0)
            int r1 = r10.f253J
            if (r1 > 0) goto L_0x0250
            int r1 = r10.mo184s()
            if (r1 != r4) goto L_0x0123
        L_0x0121:
            goto L_0x0250
        L_0x0123:
            r10.f273c = r5
            r10.mo161d(r8, r0)
            goto L_0x032e
        L_0x012a:
            android.support.constraint.a.a.b r0 = r10.f293m
            android.support.constraint.a.a.b r0 = r0.f217c
            if (r0 == 0) goto L_0x0186
            android.support.constraint.a.a.d r0 = r0.f215a
            if (r0 != r8) goto L_0x0186
            android.support.constraint.a.a.b r0 = r10.f289k
            android.support.constraint.a.h r1 = r9.mo246a((java.lang.Object) r0)
            r0.f223i = r1
            android.support.constraint.a.a.b r0 = r10.f293m
            android.support.constraint.a.h r1 = r9.mo246a((java.lang.Object) r0)
            r0.f223i = r1
            int r8 = r8.mo172j()
            android.support.constraint.a.a.b r0 = r10.f293m
            int r0 = r0.mo121c()
            int r8 = r8 - r0
            int r0 = r10.mo172j()
            int r0 = r8 - r0
            android.support.constraint.a.a.b r1 = r10.f289k
            android.support.constraint.a.h r1 = r1.f223i
            r9.mo249a((android.support.constraint.p005a.C0069h) r1, (int) r0)
            android.support.constraint.a.a.b r1 = r10.f293m
            android.support.constraint.a.h r1 = r1.f223i
            r9.mo249a((android.support.constraint.p005a.C0069h) r1, (int) r8)
            int r1 = r10.f253J
            if (r1 > 0) goto L_0x016d
            int r1 = r10.mo184s()
            if (r1 != r4) goto L_0x017f
        L_0x016d:
            android.support.constraint.a.a.b r1 = r10.f295n
            android.support.constraint.a.h r2 = r9.mo246a((java.lang.Object) r1)
            r1.f223i = r2
            android.support.constraint.a.a.b r1 = r10.f295n
            android.support.constraint.a.h r1 = r1.f223i
            int r2 = r10.f253J
            int r2 = r2 + r0
            r9.mo249a((android.support.constraint.p005a.C0069h) r1, (int) r2)
        L_0x017f:
            r10.f273c = r5
            r10.mo161d(r0, r8)
            goto L_0x032e
        L_0x0186:
            android.support.constraint.a.a.b r0 = r10.f289k
            android.support.constraint.a.a.b r1 = r0.f217c
            if (r1 == 0) goto L_0x01cd
            android.support.constraint.a.a.d r6 = r1.f215a
            int r6 = r6.f273c
            if (r6 != r5) goto L_0x01cd
            android.support.constraint.a.h r8 = r1.f223i
            android.support.constraint.a.h r1 = r9.mo246a((java.lang.Object) r0)
            r0.f223i = r1
            android.support.constraint.a.a.b r0 = r10.f293m
            android.support.constraint.a.h r1 = r9.mo246a((java.lang.Object) r0)
            r0.f223i = r1
            float r8 = r8.f385e
            android.support.constraint.a.a.b r0 = r10.f289k
            int r0 = r0.mo121c()
            float r0 = (float) r0
            float r8 = r8 + r0
            float r8 = r8 + r3
            int r8 = (int) r8
            int r0 = r10.mo172j()
            int r0 = r0 + r8
            android.support.constraint.a.a.b r1 = r10.f289k
            android.support.constraint.a.h r1 = r1.f223i
            r9.mo249a((android.support.constraint.p005a.C0069h) r1, (int) r8)
            android.support.constraint.a.a.b r1 = r10.f293m
            android.support.constraint.a.h r1 = r1.f223i
            r9.mo249a((android.support.constraint.p005a.C0069h) r1, (int) r0)
            int r1 = r10.f253J
            if (r1 > 0) goto L_0x0250
            int r1 = r10.mo184s()
            if (r1 != r4) goto L_0x0123
            goto L_0x0121
        L_0x01cd:
            android.support.constraint.a.a.b r0 = r10.f293m
            android.support.constraint.a.a.b r0 = r0.f217c
            if (r0 == 0) goto L_0x0217
            android.support.constraint.a.a.d r1 = r0.f215a
            int r1 = r1.f273c
            if (r1 != r5) goto L_0x0217
            android.support.constraint.a.h r8 = r0.f223i
            android.support.constraint.a.a.b r0 = r10.f289k
            android.support.constraint.a.h r1 = r9.mo246a((java.lang.Object) r0)
            r0.f223i = r1
            android.support.constraint.a.a.b r0 = r10.f293m
            android.support.constraint.a.h r1 = r9.mo246a((java.lang.Object) r0)
            r0.f223i = r1
            float r8 = r8.f385e
            android.support.constraint.a.a.b r0 = r10.f293m
            int r0 = r0.mo121c()
            float r0 = (float) r0
            float r8 = r8 - r0
            float r8 = r8 + r3
            int r8 = (int) r8
            int r0 = r10.mo172j()
            int r0 = r8 - r0
            android.support.constraint.a.a.b r1 = r10.f289k
            android.support.constraint.a.h r1 = r1.f223i
            r9.mo249a((android.support.constraint.p005a.C0069h) r1, (int) r0)
            android.support.constraint.a.a.b r1 = r10.f293m
            android.support.constraint.a.h r1 = r1.f223i
            r9.mo249a((android.support.constraint.p005a.C0069h) r1, (int) r8)
            int r1 = r10.f253J
            if (r1 > 0) goto L_0x016d
            int r1 = r10.mo184s()
            if (r1 != r4) goto L_0x017f
            goto L_0x016d
        L_0x0217:
            android.support.constraint.a.a.b r0 = r10.f295n
            android.support.constraint.a.a.b r0 = r0.f217c
            if (r0 == 0) goto L_0x0264
            android.support.constraint.a.a.d r1 = r0.f215a
            int r1 = r1.f273c
            if (r1 != r5) goto L_0x0264
            android.support.constraint.a.h r8 = r0.f223i
            android.support.constraint.a.a.b r0 = r10.f289k
            android.support.constraint.a.h r1 = r9.mo246a((java.lang.Object) r0)
            r0.f223i = r1
            android.support.constraint.a.a.b r0 = r10.f293m
            android.support.constraint.a.h r1 = r9.mo246a((java.lang.Object) r0)
            r0.f223i = r1
            float r8 = r8.f385e
            int r0 = r10.f253J
            float r0 = (float) r0
            float r8 = r8 - r0
            float r8 = r8 + r3
            int r8 = (int) r8
            int r0 = r10.mo172j()
            int r0 = r0 + r8
            android.support.constraint.a.a.b r1 = r10.f289k
            android.support.constraint.a.h r1 = r1.f223i
            r9.mo249a((android.support.constraint.p005a.C0069h) r1, (int) r8)
            android.support.constraint.a.a.b r1 = r10.f293m
            android.support.constraint.a.h r1 = r1.f223i
            r9.mo249a((android.support.constraint.p005a.C0069h) r1, (int) r0)
        L_0x0250:
            android.support.constraint.a.a.b r1 = r10.f295n
            android.support.constraint.a.h r2 = r9.mo246a((java.lang.Object) r1)
            r1.f223i = r2
            android.support.constraint.a.a.b r1 = r10.f295n
            android.support.constraint.a.h r1 = r1.f223i
            int r2 = r10.f253J
            int r2 = r2 + r8
            r9.mo249a((android.support.constraint.p005a.C0069h) r1, (int) r2)
            goto L_0x0123
        L_0x0264:
            android.support.constraint.a.a.b r0 = r10.f295n
            android.support.constraint.a.a.b r0 = r0.f217c
            r1 = 0
            if (r0 == 0) goto L_0x026d
            r0 = r2
            goto L_0x026e
        L_0x026d:
            r0 = r1
        L_0x026e:
            android.support.constraint.a.a.b r6 = r10.f289k
            android.support.constraint.a.a.b r6 = r6.f217c
            if (r6 == 0) goto L_0x0276
            r6 = r2
            goto L_0x0277
        L_0x0276:
            r6 = r1
        L_0x0277:
            android.support.constraint.a.a.b r7 = r10.f293m
            android.support.constraint.a.a.b r7 = r7.f217c
            if (r7 == 0) goto L_0x027e
            goto L_0x027f
        L_0x027e:
            r2 = r1
        L_0x027f:
            if (r0 != 0) goto L_0x032e
            if (r6 != 0) goto L_0x032e
            if (r2 != 0) goto L_0x032e
            boolean r0 = r10 instanceof android.support.constraint.p005a.p006a.C0057g
            if (r0 == 0) goto L_0x02e9
            r0 = r10
            android.support.constraint.a.a.g r0 = (android.support.constraint.p005a.p006a.C0057g) r0
            int r2 = r0.mo204D()
            if (r2 != 0) goto L_0x032e
            android.support.constraint.a.a.b r2 = r10.f289k
            android.support.constraint.a.h r4 = r9.mo246a((java.lang.Object) r2)
            r2.f223i = r4
            android.support.constraint.a.a.b r2 = r10.f293m
            android.support.constraint.a.h r4 = r9.mo246a((java.lang.Object) r2)
            r2.f223i = r4
            int r2 = r0.mo205E()
            r4 = -1
            if (r2 == r4) goto L_0x02af
            int r0 = r0.mo205E()
            float r0 = (float) r0
            goto L_0x02ca
        L_0x02af:
            int r2 = r0.mo206F()
            if (r2 == r4) goto L_0x02c0
            int r2 = r8.mo172j()
            int r0 = r0.mo206F()
            int r2 = r2 - r0
            float r0 = (float) r2
            goto L_0x02ca
        L_0x02c0:
            int r2 = r8.mo172j()
            float r2 = (float) r2
            float r0 = r0.mo207G()
            float r0 = r0 * r2
        L_0x02ca:
            float r0 = r0 + r3
            int r0 = (int) r0
            android.support.constraint.a.a.b r2 = r10.f289k
            android.support.constraint.a.h r2 = r2.f223i
            r9.mo249a((android.support.constraint.p005a.C0069h) r2, (int) r0)
            android.support.constraint.a.a.b r2 = r10.f293m
            android.support.constraint.a.h r2 = r2.f223i
            r9.mo249a((android.support.constraint.p005a.C0069h) r2, (int) r0)
            r10.f273c = r5
            r10.f271b = r5
            r10.mo161d(r0, r0)
            int r8 = r8.mo185t()
            r10.mo137a((int) r1, (int) r8)
            goto L_0x032e
        L_0x02e9:
            android.support.constraint.a.a.b r8 = r10.f289k
            android.support.constraint.a.h r0 = r9.mo246a((java.lang.Object) r8)
            r8.f223i = r0
            android.support.constraint.a.a.b r8 = r10.f293m
            android.support.constraint.a.h r0 = r9.mo246a((java.lang.Object) r8)
            r8.f223i = r0
            int r8 = r10.mo190x()
            int r0 = r10.mo172j()
            int r0 = r0 + r8
            android.support.constraint.a.a.b r1 = r10.f289k
            android.support.constraint.a.h r1 = r1.f223i
            r9.mo249a((android.support.constraint.p005a.C0069h) r1, (int) r8)
            android.support.constraint.a.a.b r1 = r10.f293m
            android.support.constraint.a.h r1 = r1.f223i
            r9.mo249a((android.support.constraint.p005a.C0069h) r1, (int) r0)
            int r0 = r10.f253J
            if (r0 > 0) goto L_0x031a
            int r0 = r10.mo184s()
            if (r0 != r4) goto L_0x032c
        L_0x031a:
            android.support.constraint.a.a.b r0 = r10.f295n
            android.support.constraint.a.h r1 = r9.mo246a((java.lang.Object) r0)
            r0.f223i = r1
            android.support.constraint.a.a.b r0 = r10.f295n
            android.support.constraint.a.h r0 = r0.f223i
            int r1 = r10.f253J
            int r8 = r8 + r1
            r9.mo249a((android.support.constraint.p005a.C0069h) r0, (int) r8)
        L_0x032c:
            r10.f273c = r5
        L_0x032e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p005a.p006a.C0058h.m257c(android.support.constraint.a.a.e, android.support.constraint.a.e, android.support.constraint.a.a.d):void");
    }
}
