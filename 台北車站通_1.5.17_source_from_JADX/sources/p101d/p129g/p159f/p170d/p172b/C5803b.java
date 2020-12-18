package p101d.p129g.p159f.p170d.p172b;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import p101d.p129g.p159f.C5882i;
import p101d.p129g.p159f.C5919o;
import p101d.p129g.p159f.p167c.C5775b;
import p101d.p129g.p159f.p167c.C5784g;
import p101d.p129g.p159f.p167c.C5786i;
import p101d.p129g.p159f.p167c.p168a.C5773a;
import p101d.p129g.p159f.p167c.p168a.C5774b;

/* renamed from: d.g.f.d.b.b */
public final class C5803b {

    /* renamed from: a */
    private final C5775b f16066a;

    /* renamed from: b */
    private final C5774b f16067b;

    /* renamed from: d.g.f.d.b.b$a */
    private static final class C5804a {

        /* renamed from: a */
        private final C5919o f16068a;

        /* renamed from: b */
        private final C5919o f16069b;

        /* renamed from: c */
        private final int f16070c;

        private C5804a(C5919o oVar, C5919o oVar2, int i) {
            this.f16068a = oVar;
            this.f16069b = oVar2;
            this.f16070c = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C5919o mo15468a() {
            return this.f16068a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C5919o mo15469b() {
            return this.f16069b;
        }

        /* renamed from: c */
        public int mo15470c() {
            return this.f16070c;
        }

        public String toString() {
            return this.f16068a + "/" + this.f16069b + '/' + this.f16070c;
        }
    }

    /* renamed from: d.g.f.d.b.b$b */
    private static final class C5805b implements Comparator<C5804a>, Serializable {
        private C5805b() {
        }

        /* renamed from: a */
        public int compare(C5804a aVar, C5804a aVar2) {
            return aVar.mo15470c() - aVar2.mo15470c();
        }
    }

    public C5803b(C5775b bVar) {
        this.f16066a = bVar;
        this.f16067b = new C5774b(bVar);
    }

    /* renamed from: a */
    private static int m21919a(C5919o oVar, C5919o oVar2) {
        return C5773a.m21796a(C5919o.m22413a(oVar, oVar2));
    }

    /* renamed from: a */
    private static C5775b m21920a(C5775b bVar, C5919o oVar, C5919o oVar2, C5919o oVar3, C5919o oVar4, int i, int i2) {
        float f = ((float) i) - 0.5f;
        float f2 = ((float) i2) - 0.5f;
        return C5786i.m21861a().mo15436a(bVar, i, i2, 0.5f, 0.5f, f, 0.5f, f, f2, 0.5f, f2, oVar.mo15702a(), oVar.mo15703b(), oVar4.mo15702a(), oVar4.mo15703b(), oVar3.mo15702a(), oVar3.mo15703b(), oVar2.mo15702a(), oVar2.mo15703b());
    }

    /* renamed from: a */
    private C5919o m21921a(C5919o oVar, C5919o oVar2, C5919o oVar3, C5919o oVar4, int i) {
        float f = (float) i;
        float a = ((float) m21919a(oVar, oVar2)) / f;
        float a2 = (float) m21919a(oVar3, oVar4);
        C5919o oVar5 = new C5919o(oVar4.mo15702a() + (((oVar4.mo15702a() - oVar3.mo15702a()) / a2) * a), oVar4.mo15703b() + (a * ((oVar4.mo15703b() - oVar3.mo15703b()) / a2)));
        float a3 = ((float) m21919a(oVar, oVar3)) / f;
        float a4 = (float) m21919a(oVar2, oVar4);
        C5919o oVar6 = new C5919o(oVar4.mo15702a() + (((oVar4.mo15702a() - oVar2.mo15702a()) / a4) * a3), oVar4.mo15703b() + (a3 * ((oVar4.mo15703b() - oVar2.mo15703b()) / a4)));
        if (m21924a(oVar5)) {
            return !m21924a(oVar6) ? oVar5 : Math.abs(m21925b(oVar3, oVar5).mo15470c() - m21925b(oVar2, oVar5).mo15470c()) <= Math.abs(m21925b(oVar3, oVar6).mo15470c() - m21925b(oVar2, oVar6).mo15470c()) ? oVar5 : oVar6;
        }
        if (m21924a(oVar6)) {
            return oVar6;
        }
        return null;
    }

    /* renamed from: a */
    private C5919o m21922a(C5919o oVar, C5919o oVar2, C5919o oVar3, C5919o oVar4, int i, int i2) {
        float a = ((float) m21919a(oVar, oVar2)) / ((float) i);
        float a2 = (float) m21919a(oVar3, oVar4);
        C5919o oVar5 = new C5919o(oVar4.mo15702a() + (((oVar4.mo15702a() - oVar3.mo15702a()) / a2) * a), oVar4.mo15703b() + (a * ((oVar4.mo15703b() - oVar3.mo15703b()) / a2)));
        float a3 = ((float) m21919a(oVar, oVar3)) / ((float) i2);
        float a4 = (float) m21919a(oVar2, oVar4);
        C5919o oVar6 = new C5919o(oVar4.mo15702a() + (((oVar4.mo15702a() - oVar2.mo15702a()) / a4) * a3), oVar4.mo15703b() + (a3 * ((oVar4.mo15703b() - oVar2.mo15703b()) / a4)));
        if (m21924a(oVar5)) {
            return (m21924a(oVar6) && Math.abs(i - m21925b(oVar3, oVar5).mo15470c()) + Math.abs(i2 - m21925b(oVar2, oVar5).mo15470c()) > Math.abs(i - m21925b(oVar3, oVar6).mo15470c()) + Math.abs(i2 - m21925b(oVar2, oVar6).mo15470c())) ? oVar6 : oVar5;
        }
        if (m21924a(oVar6)) {
            return oVar6;
        }
        return null;
    }

    /* renamed from: a */
    private static void m21923a(Map<C5919o, Integer> map, C5919o oVar) {
        Integer num = map.get(oVar);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        map.put(oVar, Integer.valueOf(i));
    }

    /* renamed from: a */
    private boolean m21924a(C5919o oVar) {
        return oVar.mo15702a() >= 0.0f && oVar.mo15702a() < ((float) this.f16066a.mo15397h()) && oVar.mo15703b() > 0.0f && oVar.mo15703b() < ((float) this.f16066a.mo15395f());
    }

    /* renamed from: b */
    private C5804a m21925b(C5919o oVar, C5919o oVar2) {
        int a = (int) oVar.mo15702a();
        int b = (int) oVar.mo15703b();
        int a2 = (int) oVar2.mo15702a();
        int b2 = (int) oVar2.mo15703b();
        int i = 0;
        int i2 = 1;
        boolean z = Math.abs(b2 - b) > Math.abs(a2 - a);
        if (z) {
            int i3 = b;
            b = a;
            a = i3;
            int i4 = b2;
            b2 = a2;
            a2 = i4;
        }
        int abs = Math.abs(a2 - a);
        int abs2 = Math.abs(b2 - b);
        int i5 = (-abs) / 2;
        int i6 = b < b2 ? 1 : -1;
        if (a >= a2) {
            i2 = -1;
        }
        boolean b3 = this.f16066a.mo15389b(z ? b : a, z ? a : b);
        while (a != a2) {
            boolean b4 = this.f16066a.mo15389b(z ? b : a, z ? a : b);
            if (b4 != b3) {
                i++;
                b3 = b4;
            }
            i5 += abs2;
            if (i5 > 0) {
                if (b == b2) {
                    break;
                }
                b += i6;
                i5 -= abs;
            }
            a += i2;
        }
        return new C5804a(oVar, oVar2, i);
    }

    /* renamed from: a */
    public C5784g mo15467a() {
        C5919o oVar;
        C5775b bVar;
        C5919o oVar2;
        C5919o[] a = this.f16067b.mo15382a();
        C5919o oVar3 = a[0];
        C5919o oVar4 = a[1];
        C5919o oVar5 = a[2];
        C5919o oVar6 = a[3];
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(m21925b(oVar3, oVar4));
        arrayList.add(m21925b(oVar3, oVar5));
        arrayList.add(m21925b(oVar4, oVar6));
        arrayList.add(m21925b(oVar5, oVar6));
        C5919o oVar7 = null;
        Collections.sort(arrayList, new C5805b());
        C5804a aVar = (C5804a) arrayList.get(0);
        C5804a aVar2 = (C5804a) arrayList.get(1);
        HashMap hashMap = new HashMap();
        m21923a((Map<C5919o, Integer>) hashMap, aVar.mo15468a());
        m21923a((Map<C5919o, Integer>) hashMap, aVar.mo15469b());
        m21923a((Map<C5919o, Integer>) hashMap, aVar2.mo15468a());
        m21923a((Map<C5919o, Integer>) hashMap, aVar2.mo15469b());
        C5919o oVar8 = null;
        C5919o oVar9 = null;
        for (Map.Entry entry : hashMap.entrySet()) {
            C5919o oVar10 = (C5919o) entry.getKey();
            if (((Integer) entry.getValue()).intValue() == 2) {
                oVar8 = oVar10;
            } else if (oVar7 == null) {
                oVar7 = oVar10;
            } else {
                oVar9 = oVar10;
            }
        }
        if (oVar7 == null || oVar8 == null || oVar9 == null) {
            throw C5882i.m22303a();
        }
        C5919o[] oVarArr = {oVar7, oVar8, oVar9};
        C5919o.m22415a(oVarArr);
        C5919o oVar11 = oVarArr[0];
        C5919o oVar12 = oVarArr[1];
        C5919o oVar13 = oVarArr[2];
        C5919o oVar14 = !hashMap.containsKey(oVar3) ? oVar3 : !hashMap.containsKey(oVar4) ? oVar4 : !hashMap.containsKey(oVar5) ? oVar5 : oVar6;
        int c = m21925b(oVar13, oVar14).mo15470c();
        int c2 = m21925b(oVar11, oVar14).mo15470c();
        if ((c & 1) == 1) {
            c++;
        }
        int i = c + 2;
        if ((c2 & 1) == 1) {
            c2++;
        }
        int i2 = c2 + 2;
        if (i * 4 >= i2 * 7 || i2 * 4 >= i * 7) {
            oVar = oVar13;
            C5919o a2 = m21922a(oVar12, oVar11, oVar13, oVar14, i, i2);
            if (a2 == null) {
                a2 = oVar14;
            }
            int c3 = m21925b(oVar, oVar2).mo15470c();
            int c4 = m21925b(oVar11, oVar2).mo15470c();
            if ((c3 & 1) == 1) {
                c3++;
            }
            int i3 = c3;
            if ((c4 & 1) == 1) {
                c4++;
            }
            bVar = m21920a(this.f16066a, oVar, oVar12, oVar11, oVar2, i3, c4);
        } else {
            oVar2 = m21921a(oVar12, oVar11, oVar13, oVar14, Math.min(i2, i));
            if (oVar2 == null) {
                oVar2 = oVar14;
            }
            int max = Math.max(m21925b(oVar13, oVar2).mo15470c(), m21925b(oVar11, oVar2).mo15470c()) + 1;
            if ((max & 1) == 1) {
                max++;
            }
            int i4 = max;
            bVar = m21920a(this.f16066a, oVar13, oVar12, oVar11, oVar2, i4, i4);
            oVar = oVar13;
        }
        return new C5784g(bVar, new C5919o[]{oVar, oVar12, oVar11, oVar2});
    }
}
