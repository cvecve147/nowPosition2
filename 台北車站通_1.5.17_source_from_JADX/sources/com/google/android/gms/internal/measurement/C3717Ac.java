package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.Ac */
public final class C3717Ac extends C3832d<C3717Ac> {

    /* renamed from: c */
    private static volatile C3717Ac[] f11013c;

    /* renamed from: d */
    public String f11014d = null;

    /* renamed from: e */
    public String f11015e = null;

    /* renamed from: f */
    public Long f11016f = null;

    /* renamed from: g */
    private Float f11017g = null;

    /* renamed from: h */
    public Double f11018h = null;

    public C3717Ac() {
        this.f11405b = null;
        this.f11510a = -1;
    }

    /* renamed from: e */
    public static C3717Ac[] m14877e() {
        if (f11013c == null) {
            synchronized (C3848h.f11468c) {
                if (f11013c == null) {
                    f11013c = new C3717Ac[0];
                }
            }
        }
        return f11013c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10403a() {
        int a = super.mo10403a();
        String str = this.f11014d;
        if (str != null) {
            a += C3824b.m15349b(1, str);
        }
        String str2 = this.f11015e;
        if (str2 != null) {
            a += C3824b.m15349b(2, str2);
        }
        Long l = this.f11016f;
        if (l != null) {
            a += C3824b.m15351c(3, l.longValue());
        }
        Float f = this.f11017g;
        if (f != null) {
            f.floatValue();
            a += C3824b.m15346b(4) + 4;
        }
        Double d = this.f11018h;
        if (d == null) {
            return a;
        }
        d.doubleValue();
        return a + C3824b.m15346b(5) + 8;
    }

    /* renamed from: a */
    public final /* synthetic */ C3856j mo10404a(C3820a aVar) {
        while (true) {
            int c = aVar.mo10645c();
            if (c == 0) {
                return this;
            }
            if (c == 10) {
                this.f11014d = aVar.mo10642b();
            } else if (c == 18) {
                this.f11015e = aVar.mo10642b();
            } else if (c == 24) {
                this.f11016f = Long.valueOf(aVar.mo10651f());
            } else if (c == 37) {
                this.f11017g = Float.valueOf(Float.intBitsToFloat(aVar.mo10652g()));
            } else if (c == 41) {
                this.f11018h = Double.valueOf(Double.longBitsToDouble(aVar.mo10653h()));
            } else if (!super.mo10679a(aVar, c)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo10405a(C3824b bVar) {
        String str = this.f11014d;
        if (str != null) {
            bVar.mo10668a(1, str);
        }
        String str2 = this.f11015e;
        if (str2 != null) {
            bVar.mo10668a(2, str2);
        }
        Long l = this.f11016f;
        if (l != null) {
            bVar.mo10671b(3, l.longValue());
        }
        Float f = this.f11017g;
        if (f != null) {
            bVar.mo10664a(4, f.floatValue());
        }
        Double d = this.f11018h;
        if (d != null) {
            bVar.mo10663a(5, d.doubleValue());
        }
        super.mo10405a(bVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3717Ac)) {
            return false;
        }
        C3717Ac ac = (C3717Ac) obj;
        String str = this.f11014d;
        if (str == null) {
            if (ac.f11014d != null) {
                return false;
            }
        } else if (!str.equals(ac.f11014d)) {
            return false;
        }
        String str2 = this.f11015e;
        if (str2 == null) {
            if (ac.f11015e != null) {
                return false;
            }
        } else if (!str2.equals(ac.f11015e)) {
            return false;
        }
        Long l = this.f11016f;
        if (l == null) {
            if (ac.f11016f != null) {
                return false;
            }
        } else if (!l.equals(ac.f11016f)) {
            return false;
        }
        Float f = this.f11017g;
        if (f == null) {
            if (ac.f11017g != null) {
                return false;
            }
        } else if (!f.equals(ac.f11017g)) {
            return false;
        }
        Double d = this.f11018h;
        if (d == null) {
            if (ac.f11018h != null) {
                return false;
            }
        } else if (!d.equals(ac.f11018h)) {
            return false;
        }
        C3840f fVar = this.f11405b;
        if (fVar != null && !fVar.mo10723d()) {
            return this.f11405b.equals(ac.f11405b);
        }
        C3840f fVar2 = ac.f11405b;
        return fVar2 == null || fVar2.mo10723d();
    }

    public final int hashCode() {
        int hashCode = (C3717Ac.class.getName().hashCode() + 527) * 31;
        String str = this.f11014d;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f11015e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.f11016f;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Float f = this.f11017g;
        int hashCode5 = (hashCode4 + (f == null ? 0 : f.hashCode())) * 31;
        Double d = this.f11018h;
        int hashCode6 = (hashCode5 + (d == null ? 0 : d.hashCode())) * 31;
        C3840f fVar = this.f11405b;
        if (fVar != null && !fVar.mo10723d()) {
            i = this.f11405b.hashCode();
        }
        return hashCode6 + i;
    }
}
