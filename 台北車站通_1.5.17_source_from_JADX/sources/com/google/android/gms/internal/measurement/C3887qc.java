package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.qc */
public final class C3887qc extends C3832d<C3887qc> {

    /* renamed from: c */
    private static volatile C3887qc[] f11596c;

    /* renamed from: d */
    public Integer f11597d = null;

    /* renamed from: e */
    public String f11598e = null;

    /* renamed from: f */
    public C3891rc[] f11599f = C3891rc.m15669e();

    /* renamed from: g */
    private Boolean f11600g = null;

    /* renamed from: h */
    public C3895sc f11601h = null;

    public C3887qc() {
        this.f11405b = null;
        this.f11510a = -1;
    }

    /* renamed from: e */
    public static C3887qc[] m15609e() {
        if (f11596c == null) {
            synchronized (C3848h.f11468c) {
                if (f11596c == null) {
                    f11596c = new C3887qc[0];
                }
            }
        }
        return f11596c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10403a() {
        int a = super.mo10403a();
        Integer num = this.f11597d;
        if (num != null) {
            a += C3824b.m15347b(1, num.intValue());
        }
        String str = this.f11598e;
        if (str != null) {
            a += C3824b.m15349b(2, str);
        }
        C3891rc[] rcVarArr = this.f11599f;
        if (rcVarArr != null && rcVarArr.length > 0) {
            int i = 0;
            while (true) {
                C3891rc[] rcVarArr2 = this.f11599f;
                if (i >= rcVarArr2.length) {
                    break;
                }
                C3891rc rcVar = rcVarArr2[i];
                if (rcVar != null) {
                    a += C3824b.m15348b(3, (C3856j) rcVar);
                }
                i++;
            }
        }
        Boolean bool = this.f11600g;
        if (bool != null) {
            bool.booleanValue();
            a += C3824b.m15346b(4) + 1;
        }
        C3895sc scVar = this.f11601h;
        return scVar != null ? a + C3824b.m15348b(5, (C3856j) scVar) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ C3856j mo10404a(C3820a aVar) {
        while (true) {
            int c = aVar.mo10645c();
            if (c == 0) {
                return this;
            }
            if (c == 8) {
                this.f11597d = Integer.valueOf(aVar.mo10649e());
            } else if (c == 18) {
                this.f11598e = aVar.mo10642b();
            } else if (c == 26) {
                int a = C3868m.m15505a(aVar, 26);
                C3891rc[] rcVarArr = this.f11599f;
                int length = rcVarArr == null ? 0 : rcVarArr.length;
                C3891rc[] rcVarArr2 = new C3891rc[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.f11599f, 0, rcVarArr2, 0, length);
                }
                while (length < rcVarArr2.length - 1) {
                    rcVarArr2[length] = new C3891rc();
                    aVar.mo10640a((C3856j) rcVarArr2[length]);
                    aVar.mo10645c();
                    length++;
                }
                rcVarArr2[length] = new C3891rc();
                aVar.mo10640a((C3856j) rcVarArr2[length]);
                this.f11599f = rcVarArr2;
            } else if (c == 32) {
                this.f11600g = Boolean.valueOf(aVar.mo10648d());
            } else if (c == 42) {
                if (this.f11601h == null) {
                    this.f11601h = new C3895sc();
                }
                aVar.mo10640a((C3856j) this.f11601h);
            } else if (!super.mo10679a(aVar, c)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo10405a(C3824b bVar) {
        Integer num = this.f11597d;
        if (num != null) {
            bVar.mo10665a(1, num.intValue());
        }
        String str = this.f11598e;
        if (str != null) {
            bVar.mo10668a(2, str);
        }
        C3891rc[] rcVarArr = this.f11599f;
        if (rcVarArr != null && rcVarArr.length > 0) {
            int i = 0;
            while (true) {
                C3891rc[] rcVarArr2 = this.f11599f;
                if (i >= rcVarArr2.length) {
                    break;
                }
                C3891rc rcVar = rcVarArr2[i];
                if (rcVar != null) {
                    bVar.mo10667a(3, (C3856j) rcVar);
                }
                i++;
            }
        }
        Boolean bool = this.f11600g;
        if (bool != null) {
            bVar.mo10669a(4, bool.booleanValue());
        }
        C3895sc scVar = this.f11601h;
        if (scVar != null) {
            bVar.mo10667a(5, (C3856j) scVar);
        }
        super.mo10405a(bVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3887qc)) {
            return false;
        }
        C3887qc qcVar = (C3887qc) obj;
        Integer num = this.f11597d;
        if (num == null) {
            if (qcVar.f11597d != null) {
                return false;
            }
        } else if (!num.equals(qcVar.f11597d)) {
            return false;
        }
        String str = this.f11598e;
        if (str == null) {
            if (qcVar.f11598e != null) {
                return false;
            }
        } else if (!str.equals(qcVar.f11598e)) {
            return false;
        }
        if (!C3848h.m15461a((Object[]) this.f11599f, (Object[]) qcVar.f11599f)) {
            return false;
        }
        Boolean bool = this.f11600g;
        if (bool == null) {
            if (qcVar.f11600g != null) {
                return false;
            }
        } else if (!bool.equals(qcVar.f11600g)) {
            return false;
        }
        C3895sc scVar = this.f11601h;
        if (scVar == null) {
            if (qcVar.f11601h != null) {
                return false;
            }
        } else if (!scVar.equals(qcVar.f11601h)) {
            return false;
        }
        C3840f fVar = this.f11405b;
        if (fVar != null && !fVar.mo10723d()) {
            return this.f11405b.equals(qcVar.f11405b);
        }
        C3840f fVar2 = qcVar.f11405b;
        return fVar2 == null || fVar2.mo10723d();
    }

    public final int hashCode() {
        int hashCode = (C3887qc.class.getName().hashCode() + 527) * 31;
        Integer num = this.f11597d;
        int i = 0;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f11598e;
        int hashCode3 = (((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + C3848h.m15458a((Object[]) this.f11599f)) * 31;
        Boolean bool = this.f11600g;
        int hashCode4 = hashCode3 + (bool == null ? 0 : bool.hashCode());
        C3895sc scVar = this.f11601h;
        int hashCode5 = ((hashCode4 * 31) + (scVar == null ? 0 : scVar.hashCode())) * 31;
        C3840f fVar = this.f11405b;
        if (fVar != null && !fVar.mo10723d()) {
            i = this.f11405b.hashCode();
        }
        return hashCode5 + i;
    }
}
