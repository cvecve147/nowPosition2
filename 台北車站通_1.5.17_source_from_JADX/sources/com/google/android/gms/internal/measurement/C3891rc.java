package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.rc */
public final class C3891rc extends C3832d<C3891rc> {

    /* renamed from: c */
    private static volatile C3891rc[] f11632c;

    /* renamed from: d */
    public C3903uc f11633d = null;

    /* renamed from: e */
    public C3895sc f11634e = null;

    /* renamed from: f */
    public Boolean f11635f = null;

    /* renamed from: g */
    public String f11636g = null;

    public C3891rc() {
        this.f11405b = null;
        this.f11510a = -1;
    }

    /* renamed from: e */
    public static C3891rc[] m15669e() {
        if (f11632c == null) {
            synchronized (C3848h.f11468c) {
                if (f11632c == null) {
                    f11632c = new C3891rc[0];
                }
            }
        }
        return f11632c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10403a() {
        int a = super.mo10403a();
        C3903uc ucVar = this.f11633d;
        if (ucVar != null) {
            a += C3824b.m15348b(1, (C3856j) ucVar);
        }
        C3895sc scVar = this.f11634e;
        if (scVar != null) {
            a += C3824b.m15348b(2, (C3856j) scVar);
        }
        Boolean bool = this.f11635f;
        if (bool != null) {
            bool.booleanValue();
            a += C3824b.m15346b(3) + 1;
        }
        String str = this.f11636g;
        return str != null ? a + C3824b.m15349b(4, str) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ C3856j mo10404a(C3820a aVar) {
        C3856j jVar;
        while (true) {
            int c = aVar.mo10645c();
            if (c == 0) {
                return this;
            }
            if (c == 10) {
                if (this.f11633d == null) {
                    this.f11633d = new C3903uc();
                }
                jVar = this.f11633d;
            } else if (c == 18) {
                if (this.f11634e == null) {
                    this.f11634e = new C3895sc();
                }
                jVar = this.f11634e;
            } else if (c == 24) {
                this.f11635f = Boolean.valueOf(aVar.mo10648d());
            } else if (c == 34) {
                this.f11636g = aVar.mo10642b();
            } else if (!super.mo10679a(aVar, c)) {
                return this;
            }
            aVar.mo10640a(jVar);
        }
    }

    /* renamed from: a */
    public final void mo10405a(C3824b bVar) {
        C3903uc ucVar = this.f11633d;
        if (ucVar != null) {
            bVar.mo10667a(1, (C3856j) ucVar);
        }
        C3895sc scVar = this.f11634e;
        if (scVar != null) {
            bVar.mo10667a(2, (C3856j) scVar);
        }
        Boolean bool = this.f11635f;
        if (bool != null) {
            bVar.mo10669a(3, bool.booleanValue());
        }
        String str = this.f11636g;
        if (str != null) {
            bVar.mo10668a(4, str);
        }
        super.mo10405a(bVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3891rc)) {
            return false;
        }
        C3891rc rcVar = (C3891rc) obj;
        C3903uc ucVar = this.f11633d;
        if (ucVar == null) {
            if (rcVar.f11633d != null) {
                return false;
            }
        } else if (!ucVar.equals(rcVar.f11633d)) {
            return false;
        }
        C3895sc scVar = this.f11634e;
        if (scVar == null) {
            if (rcVar.f11634e != null) {
                return false;
            }
        } else if (!scVar.equals(rcVar.f11634e)) {
            return false;
        }
        Boolean bool = this.f11635f;
        if (bool == null) {
            if (rcVar.f11635f != null) {
                return false;
            }
        } else if (!bool.equals(rcVar.f11635f)) {
            return false;
        }
        String str = this.f11636g;
        if (str == null) {
            if (rcVar.f11636g != null) {
                return false;
            }
        } else if (!str.equals(rcVar.f11636g)) {
            return false;
        }
        C3840f fVar = this.f11405b;
        if (fVar != null && !fVar.mo10723d()) {
            return this.f11405b.equals(rcVar.f11405b);
        }
        C3840f fVar2 = rcVar.f11405b;
        return fVar2 == null || fVar2.mo10723d();
    }

    public final int hashCode() {
        C3903uc ucVar = this.f11633d;
        int i = 0;
        int hashCode = ((C3891rc.class.getName().hashCode() + 527) * 31) + (ucVar == null ? 0 : ucVar.hashCode());
        C3895sc scVar = this.f11634e;
        int hashCode2 = ((hashCode * 31) + (scVar == null ? 0 : scVar.hashCode())) * 31;
        Boolean bool = this.f11635f;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f11636g;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        C3840f fVar = this.f11405b;
        if (fVar != null && !fVar.mo10723d()) {
            i = this.f11405b.hashCode();
        }
        return hashCode4 + i;
    }
}
