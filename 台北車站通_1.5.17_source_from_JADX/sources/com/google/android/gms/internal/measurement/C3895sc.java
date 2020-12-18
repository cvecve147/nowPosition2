package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.sc */
public final class C3895sc extends C3832d<C3895sc> {

    /* renamed from: c */
    public Integer f11643c = null;

    /* renamed from: d */
    public Boolean f11644d = null;

    /* renamed from: e */
    public String f11645e = null;

    /* renamed from: f */
    public String f11646f = null;

    /* renamed from: g */
    public String f11647g = null;

    public C3895sc() {
        this.f11405b = null;
        this.f11510a = -1;
    }

    /* renamed from: b */
    private final C3895sc m15673b(C3820a aVar) {
        int e;
        while (true) {
            int c = aVar.mo10645c();
            if (c == 0) {
                return this;
            }
            if (c == 8) {
                try {
                    e = aVar.mo10649e();
                    if (e < 0 || e > 4) {
                        StringBuilder sb = new StringBuilder(46);
                        sb.append(e);
                        sb.append(" is not a valid enum ComparisonType");
                    } else {
                        this.f11643c = Integer.valueOf(e);
                    }
                } catch (IllegalArgumentException unused) {
                    aVar.mo10650e(aVar.mo10638a());
                    mo10679a(aVar, c);
                }
            } else if (c == 16) {
                this.f11644d = Boolean.valueOf(aVar.mo10648d());
            } else if (c == 26) {
                this.f11645e = aVar.mo10642b();
            } else if (c == 34) {
                this.f11646f = aVar.mo10642b();
            } else if (c == 42) {
                this.f11647g = aVar.mo10642b();
            } else if (!super.mo10679a(aVar, c)) {
                return this;
            }
        }
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append(e);
        sb2.append(" is not a valid enum ComparisonType");
        throw new IllegalArgumentException(sb2.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10403a() {
        int a = super.mo10403a();
        Integer num = this.f11643c;
        if (num != null) {
            a += C3824b.m15347b(1, num.intValue());
        }
        Boolean bool = this.f11644d;
        if (bool != null) {
            bool.booleanValue();
            a += C3824b.m15346b(2) + 1;
        }
        String str = this.f11645e;
        if (str != null) {
            a += C3824b.m15349b(3, str);
        }
        String str2 = this.f11646f;
        if (str2 != null) {
            a += C3824b.m15349b(4, str2);
        }
        String str3 = this.f11647g;
        return str3 != null ? a + C3824b.m15349b(5, str3) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ C3856j mo10404a(C3820a aVar) {
        m15673b(aVar);
        return this;
    }

    /* renamed from: a */
    public final void mo10405a(C3824b bVar) {
        Integer num = this.f11643c;
        if (num != null) {
            bVar.mo10665a(1, num.intValue());
        }
        Boolean bool = this.f11644d;
        if (bool != null) {
            bVar.mo10669a(2, bool.booleanValue());
        }
        String str = this.f11645e;
        if (str != null) {
            bVar.mo10668a(3, str);
        }
        String str2 = this.f11646f;
        if (str2 != null) {
            bVar.mo10668a(4, str2);
        }
        String str3 = this.f11647g;
        if (str3 != null) {
            bVar.mo10668a(5, str3);
        }
        super.mo10405a(bVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3895sc)) {
            return false;
        }
        C3895sc scVar = (C3895sc) obj;
        Integer num = this.f11643c;
        if (num == null) {
            if (scVar.f11643c != null) {
                return false;
            }
        } else if (!num.equals(scVar.f11643c)) {
            return false;
        }
        Boolean bool = this.f11644d;
        if (bool == null) {
            if (scVar.f11644d != null) {
                return false;
            }
        } else if (!bool.equals(scVar.f11644d)) {
            return false;
        }
        String str = this.f11645e;
        if (str == null) {
            if (scVar.f11645e != null) {
                return false;
            }
        } else if (!str.equals(scVar.f11645e)) {
            return false;
        }
        String str2 = this.f11646f;
        if (str2 == null) {
            if (scVar.f11646f != null) {
                return false;
            }
        } else if (!str2.equals(scVar.f11646f)) {
            return false;
        }
        String str3 = this.f11647g;
        if (str3 == null) {
            if (scVar.f11647g != null) {
                return false;
            }
        } else if (!str3.equals(scVar.f11647g)) {
            return false;
        }
        C3840f fVar = this.f11405b;
        if (fVar != null && !fVar.mo10723d()) {
            return this.f11405b.equals(scVar.f11405b);
        }
        C3840f fVar2 = scVar.f11405b;
        return fVar2 == null || fVar2.mo10723d();
    }

    public final int hashCode() {
        int hashCode = (C3895sc.class.getName().hashCode() + 527) * 31;
        Integer num = this.f11643c;
        int i = 0;
        int intValue = (hashCode + (num == null ? 0 : num.intValue())) * 31;
        Boolean bool = this.f11644d;
        int hashCode2 = (intValue + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f11645e;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f11646f;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f11647g;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C3840f fVar = this.f11405b;
        if (fVar != null && !fVar.mo10723d()) {
            i = this.f11405b.hashCode();
        }
        return hashCode5 + i;
    }
}
