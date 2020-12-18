package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.wc */
public final class C3911wc extends C3832d<C3911wc> {

    /* renamed from: c */
    public Long f11708c = null;

    /* renamed from: d */
    public String f11709d = null;

    /* renamed from: e */
    private Integer f11710e = null;

    /* renamed from: f */
    public C3915xc[] f11711f = C3915xc.m15868e();

    /* renamed from: g */
    public C3907vc[] f11712g = C3907vc.m15755e();

    /* renamed from: h */
    public C3883pc[] f11713h = C3883pc.m15605e();

    public C3911wc() {
        this.f11405b = null;
        this.f11510a = -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10403a() {
        int a = super.mo10403a();
        Long l = this.f11708c;
        if (l != null) {
            a += C3824b.m15351c(1, l.longValue());
        }
        String str = this.f11709d;
        if (str != null) {
            a += C3824b.m15349b(2, str);
        }
        Integer num = this.f11710e;
        if (num != null) {
            a += C3824b.m15347b(3, num.intValue());
        }
        C3915xc[] xcVarArr = this.f11711f;
        int i = 0;
        if (xcVarArr != null && xcVarArr.length > 0) {
            int i2 = a;
            int i3 = 0;
            while (true) {
                C3915xc[] xcVarArr2 = this.f11711f;
                if (i3 >= xcVarArr2.length) {
                    break;
                }
                C3915xc xcVar = xcVarArr2[i3];
                if (xcVar != null) {
                    i2 += C3824b.m15348b(4, (C3856j) xcVar);
                }
                i3++;
            }
            a = i2;
        }
        C3907vc[] vcVarArr = this.f11712g;
        if (vcVarArr != null && vcVarArr.length > 0) {
            int i4 = a;
            int i5 = 0;
            while (true) {
                C3907vc[] vcVarArr2 = this.f11712g;
                if (i5 >= vcVarArr2.length) {
                    break;
                }
                C3907vc vcVar = vcVarArr2[i5];
                if (vcVar != null) {
                    i4 += C3824b.m15348b(5, (C3856j) vcVar);
                }
                i5++;
            }
            a = i4;
        }
        C3883pc[] pcVarArr = this.f11713h;
        if (pcVarArr != null && pcVarArr.length > 0) {
            while (true) {
                C3883pc[] pcVarArr2 = this.f11713h;
                if (i >= pcVarArr2.length) {
                    break;
                }
                C3883pc pcVar = pcVarArr2[i];
                if (pcVar != null) {
                    a += C3824b.m15348b(6, (C3856j) pcVar);
                }
                i++;
            }
        }
        return a;
    }

    /* renamed from: a */
    public final /* synthetic */ C3856j mo10404a(C3820a aVar) {
        while (true) {
            int c = aVar.mo10645c();
            if (c == 0) {
                return this;
            }
            if (c == 8) {
                this.f11708c = Long.valueOf(aVar.mo10651f());
            } else if (c == 18) {
                this.f11709d = aVar.mo10642b();
            } else if (c == 24) {
                this.f11710e = Integer.valueOf(aVar.mo10649e());
            } else if (c == 34) {
                int a = C3868m.m15505a(aVar, 34);
                C3915xc[] xcVarArr = this.f11711f;
                int length = xcVarArr == null ? 0 : xcVarArr.length;
                C3915xc[] xcVarArr2 = new C3915xc[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.f11711f, 0, xcVarArr2, 0, length);
                }
                while (length < xcVarArr2.length - 1) {
                    xcVarArr2[length] = new C3915xc();
                    aVar.mo10640a((C3856j) xcVarArr2[length]);
                    aVar.mo10645c();
                    length++;
                }
                xcVarArr2[length] = new C3915xc();
                aVar.mo10640a((C3856j) xcVarArr2[length]);
                this.f11711f = xcVarArr2;
            } else if (c == 42) {
                int a2 = C3868m.m15505a(aVar, 42);
                C3907vc[] vcVarArr = this.f11712g;
                int length2 = vcVarArr == null ? 0 : vcVarArr.length;
                C3907vc[] vcVarArr2 = new C3907vc[(a2 + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.f11712g, 0, vcVarArr2, 0, length2);
                }
                while (length2 < vcVarArr2.length - 1) {
                    vcVarArr2[length2] = new C3907vc();
                    aVar.mo10640a((C3856j) vcVarArr2[length2]);
                    aVar.mo10645c();
                    length2++;
                }
                vcVarArr2[length2] = new C3907vc();
                aVar.mo10640a((C3856j) vcVarArr2[length2]);
                this.f11712g = vcVarArr2;
            } else if (c == 50) {
                int a3 = C3868m.m15505a(aVar, 50);
                C3883pc[] pcVarArr = this.f11713h;
                int length3 = pcVarArr == null ? 0 : pcVarArr.length;
                C3883pc[] pcVarArr2 = new C3883pc[(a3 + length3)];
                if (length3 != 0) {
                    System.arraycopy(this.f11713h, 0, pcVarArr2, 0, length3);
                }
                while (length3 < pcVarArr2.length - 1) {
                    pcVarArr2[length3] = new C3883pc();
                    aVar.mo10640a((C3856j) pcVarArr2[length3]);
                    aVar.mo10645c();
                    length3++;
                }
                pcVarArr2[length3] = new C3883pc();
                aVar.mo10640a((C3856j) pcVarArr2[length3]);
                this.f11713h = pcVarArr2;
            } else if (!super.mo10679a(aVar, c)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo10405a(C3824b bVar) {
        Long l = this.f11708c;
        if (l != null) {
            bVar.mo10671b(1, l.longValue());
        }
        String str = this.f11709d;
        if (str != null) {
            bVar.mo10668a(2, str);
        }
        Integer num = this.f11710e;
        if (num != null) {
            bVar.mo10665a(3, num.intValue());
        }
        C3915xc[] xcVarArr = this.f11711f;
        int i = 0;
        if (xcVarArr != null && xcVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                C3915xc[] xcVarArr2 = this.f11711f;
                if (i2 >= xcVarArr2.length) {
                    break;
                }
                C3915xc xcVar = xcVarArr2[i2];
                if (xcVar != null) {
                    bVar.mo10667a(4, (C3856j) xcVar);
                }
                i2++;
            }
        }
        C3907vc[] vcVarArr = this.f11712g;
        if (vcVarArr != null && vcVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                C3907vc[] vcVarArr2 = this.f11712g;
                if (i3 >= vcVarArr2.length) {
                    break;
                }
                C3907vc vcVar = vcVarArr2[i3];
                if (vcVar != null) {
                    bVar.mo10667a(5, (C3856j) vcVar);
                }
                i3++;
            }
        }
        C3883pc[] pcVarArr = this.f11713h;
        if (pcVarArr != null && pcVarArr.length > 0) {
            while (true) {
                C3883pc[] pcVarArr2 = this.f11713h;
                if (i >= pcVarArr2.length) {
                    break;
                }
                C3883pc pcVar = pcVarArr2[i];
                if (pcVar != null) {
                    bVar.mo10667a(6, (C3856j) pcVar);
                }
                i++;
            }
        }
        super.mo10405a(bVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3911wc)) {
            return false;
        }
        C3911wc wcVar = (C3911wc) obj;
        Long l = this.f11708c;
        if (l == null) {
            if (wcVar.f11708c != null) {
                return false;
            }
        } else if (!l.equals(wcVar.f11708c)) {
            return false;
        }
        String str = this.f11709d;
        if (str == null) {
            if (wcVar.f11709d != null) {
                return false;
            }
        } else if (!str.equals(wcVar.f11709d)) {
            return false;
        }
        Integer num = this.f11710e;
        if (num == null) {
            if (wcVar.f11710e != null) {
                return false;
            }
        } else if (!num.equals(wcVar.f11710e)) {
            return false;
        }
        if (!C3848h.m15461a((Object[]) this.f11711f, (Object[]) wcVar.f11711f) || !C3848h.m15461a((Object[]) this.f11712g, (Object[]) wcVar.f11712g) || !C3848h.m15461a((Object[]) this.f11713h, (Object[]) wcVar.f11713h)) {
            return false;
        }
        C3840f fVar = this.f11405b;
        if (fVar != null && !fVar.mo10723d()) {
            return this.f11405b.equals(wcVar.f11405b);
        }
        C3840f fVar2 = wcVar.f11405b;
        return fVar2 == null || fVar2.mo10723d();
    }

    public final int hashCode() {
        int hashCode = (C3911wc.class.getName().hashCode() + 527) * 31;
        Long l = this.f11708c;
        int i = 0;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.f11709d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f11710e;
        int hashCode4 = (((((((hashCode3 + (num == null ? 0 : num.hashCode())) * 31) + C3848h.m15458a((Object[]) this.f11711f)) * 31) + C3848h.m15458a((Object[]) this.f11712g)) * 31) + C3848h.m15458a((Object[]) this.f11713h)) * 31;
        C3840f fVar = this.f11405b;
        if (fVar != null && !fVar.mo10723d()) {
            i = this.f11405b.hashCode();
        }
        return hashCode4 + i;
    }
}
