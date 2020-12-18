package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.Ec */
public final class C3733Ec extends C3832d<C3733Ec> {

    /* renamed from: c */
    private static volatile C3733Ec[] f11088c;

    /* renamed from: d */
    public Long f11089d = null;

    /* renamed from: e */
    public String f11090e = null;

    /* renamed from: f */
    public String f11091f = null;

    /* renamed from: g */
    public Long f11092g = null;

    /* renamed from: h */
    private Float f11093h = null;

    /* renamed from: i */
    public Double f11094i = null;

    public C3733Ec() {
        this.f11405b = null;
        this.f11510a = -1;
    }

    /* renamed from: e */
    public static C3733Ec[] m14920e() {
        if (f11088c == null) {
            synchronized (C3848h.f11468c) {
                if (f11088c == null) {
                    f11088c = new C3733Ec[0];
                }
            }
        }
        return f11088c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10403a() {
        int a = super.mo10403a();
        Long l = this.f11089d;
        if (l != null) {
            a += C3824b.m15351c(1, l.longValue());
        }
        String str = this.f11090e;
        if (str != null) {
            a += C3824b.m15349b(2, str);
        }
        String str2 = this.f11091f;
        if (str2 != null) {
            a += C3824b.m15349b(3, str2);
        }
        Long l2 = this.f11092g;
        if (l2 != null) {
            a += C3824b.m15351c(4, l2.longValue());
        }
        Float f = this.f11093h;
        if (f != null) {
            f.floatValue();
            a += C3824b.m15346b(5) + 4;
        }
        Double d = this.f11094i;
        if (d == null) {
            return a;
        }
        d.doubleValue();
        return a + C3824b.m15346b(6) + 8;
    }

    /* renamed from: a */
    public final /* synthetic */ C3856j mo10404a(C3820a aVar) {
        while (true) {
            int c = aVar.mo10645c();
            if (c == 0) {
                return this;
            }
            if (c == 8) {
                this.f11089d = Long.valueOf(aVar.mo10651f());
            } else if (c == 18) {
                this.f11090e = aVar.mo10642b();
            } else if (c == 26) {
                this.f11091f = aVar.mo10642b();
            } else if (c == 32) {
                this.f11092g = Long.valueOf(aVar.mo10651f());
            } else if (c == 45) {
                this.f11093h = Float.valueOf(Float.intBitsToFloat(aVar.mo10652g()));
            } else if (c == 49) {
                this.f11094i = Double.valueOf(Double.longBitsToDouble(aVar.mo10653h()));
            } else if (!super.mo10679a(aVar, c)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo10405a(C3824b bVar) {
        Long l = this.f11089d;
        if (l != null) {
            bVar.mo10671b(1, l.longValue());
        }
        String str = this.f11090e;
        if (str != null) {
            bVar.mo10668a(2, str);
        }
        String str2 = this.f11091f;
        if (str2 != null) {
            bVar.mo10668a(3, str2);
        }
        Long l2 = this.f11092g;
        if (l2 != null) {
            bVar.mo10671b(4, l2.longValue());
        }
        Float f = this.f11093h;
        if (f != null) {
            bVar.mo10664a(5, f.floatValue());
        }
        Double d = this.f11094i;
        if (d != null) {
            bVar.mo10663a(6, d.doubleValue());
        }
        super.mo10405a(bVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3733Ec)) {
            return false;
        }
        C3733Ec ec = (C3733Ec) obj;
        Long l = this.f11089d;
        if (l == null) {
            if (ec.f11089d != null) {
                return false;
            }
        } else if (!l.equals(ec.f11089d)) {
            return false;
        }
        String str = this.f11090e;
        if (str == null) {
            if (ec.f11090e != null) {
                return false;
            }
        } else if (!str.equals(ec.f11090e)) {
            return false;
        }
        String str2 = this.f11091f;
        if (str2 == null) {
            if (ec.f11091f != null) {
                return false;
            }
        } else if (!str2.equals(ec.f11091f)) {
            return false;
        }
        Long l2 = this.f11092g;
        if (l2 == null) {
            if (ec.f11092g != null) {
                return false;
            }
        } else if (!l2.equals(ec.f11092g)) {
            return false;
        }
        Float f = this.f11093h;
        if (f == null) {
            if (ec.f11093h != null) {
                return false;
            }
        } else if (!f.equals(ec.f11093h)) {
            return false;
        }
        Double d = this.f11094i;
        if (d == null) {
            if (ec.f11094i != null) {
                return false;
            }
        } else if (!d.equals(ec.f11094i)) {
            return false;
        }
        C3840f fVar = this.f11405b;
        if (fVar != null && !fVar.mo10723d()) {
            return this.f11405b.equals(ec.f11405b);
        }
        C3840f fVar2 = ec.f11405b;
        return fVar2 == null || fVar2.mo10723d();
    }

    public final int hashCode() {
        int hashCode = (C3733Ec.class.getName().hashCode() + 527) * 31;
        Long l = this.f11089d;
        int i = 0;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.f11090e;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f11091f;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.f11092g;
        int hashCode5 = (hashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Float f = this.f11093h;
        int hashCode6 = (hashCode5 + (f == null ? 0 : f.hashCode())) * 31;
        Double d = this.f11094i;
        int hashCode7 = (hashCode6 + (d == null ? 0 : d.hashCode())) * 31;
        C3840f fVar = this.f11405b;
        if (fVar != null && !fVar.mo10723d()) {
            i = this.f11405b.hashCode();
        }
        return hashCode7 + i;
    }
}
