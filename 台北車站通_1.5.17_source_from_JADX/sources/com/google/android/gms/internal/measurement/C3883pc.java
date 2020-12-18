package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.pc */
public final class C3883pc extends C3832d<C3883pc> {

    /* renamed from: c */
    private static volatile C3883pc[] f11580c;

    /* renamed from: d */
    public Integer f11581d = null;

    /* renamed from: e */
    public C3899tc[] f11582e = C3899tc.m15715e();

    /* renamed from: f */
    public C3887qc[] f11583f = C3887qc.m15609e();

    public C3883pc() {
        this.f11405b = null;
        this.f11510a = -1;
    }

    /* renamed from: e */
    public static C3883pc[] m15605e() {
        if (f11580c == null) {
            synchronized (C3848h.f11468c) {
                if (f11580c == null) {
                    f11580c = new C3883pc[0];
                }
            }
        }
        return f11580c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10403a() {
        int a = super.mo10403a();
        Integer num = this.f11581d;
        if (num != null) {
            a += C3824b.m15347b(1, num.intValue());
        }
        C3899tc[] tcVarArr = this.f11582e;
        int i = 0;
        if (tcVarArr != null && tcVarArr.length > 0) {
            int i2 = a;
            int i3 = 0;
            while (true) {
                C3899tc[] tcVarArr2 = this.f11582e;
                if (i3 >= tcVarArr2.length) {
                    break;
                }
                C3899tc tcVar = tcVarArr2[i3];
                if (tcVar != null) {
                    i2 += C3824b.m15348b(2, (C3856j) tcVar);
                }
                i3++;
            }
            a = i2;
        }
        C3887qc[] qcVarArr = this.f11583f;
        if (qcVarArr != null && qcVarArr.length > 0) {
            while (true) {
                C3887qc[] qcVarArr2 = this.f11583f;
                if (i >= qcVarArr2.length) {
                    break;
                }
                C3887qc qcVar = qcVarArr2[i];
                if (qcVar != null) {
                    a += C3824b.m15348b(3, (C3856j) qcVar);
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
                this.f11581d = Integer.valueOf(aVar.mo10649e());
            } else if (c == 18) {
                int a = C3868m.m15505a(aVar, 18);
                C3899tc[] tcVarArr = this.f11582e;
                int length = tcVarArr == null ? 0 : tcVarArr.length;
                C3899tc[] tcVarArr2 = new C3899tc[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.f11582e, 0, tcVarArr2, 0, length);
                }
                while (length < tcVarArr2.length - 1) {
                    tcVarArr2[length] = new C3899tc();
                    aVar.mo10640a((C3856j) tcVarArr2[length]);
                    aVar.mo10645c();
                    length++;
                }
                tcVarArr2[length] = new C3899tc();
                aVar.mo10640a((C3856j) tcVarArr2[length]);
                this.f11582e = tcVarArr2;
            } else if (c == 26) {
                int a2 = C3868m.m15505a(aVar, 26);
                C3887qc[] qcVarArr = this.f11583f;
                int length2 = qcVarArr == null ? 0 : qcVarArr.length;
                C3887qc[] qcVarArr2 = new C3887qc[(a2 + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.f11583f, 0, qcVarArr2, 0, length2);
                }
                while (length2 < qcVarArr2.length - 1) {
                    qcVarArr2[length2] = new C3887qc();
                    aVar.mo10640a((C3856j) qcVarArr2[length2]);
                    aVar.mo10645c();
                    length2++;
                }
                qcVarArr2[length2] = new C3887qc();
                aVar.mo10640a((C3856j) qcVarArr2[length2]);
                this.f11583f = qcVarArr2;
            } else if (!super.mo10679a(aVar, c)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo10405a(C3824b bVar) {
        Integer num = this.f11581d;
        if (num != null) {
            bVar.mo10665a(1, num.intValue());
        }
        C3899tc[] tcVarArr = this.f11582e;
        int i = 0;
        if (tcVarArr != null && tcVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                C3899tc[] tcVarArr2 = this.f11582e;
                if (i2 >= tcVarArr2.length) {
                    break;
                }
                C3899tc tcVar = tcVarArr2[i2];
                if (tcVar != null) {
                    bVar.mo10667a(2, (C3856j) tcVar);
                }
                i2++;
            }
        }
        C3887qc[] qcVarArr = this.f11583f;
        if (qcVarArr != null && qcVarArr.length > 0) {
            while (true) {
                C3887qc[] qcVarArr2 = this.f11583f;
                if (i >= qcVarArr2.length) {
                    break;
                }
                C3887qc qcVar = qcVarArr2[i];
                if (qcVar != null) {
                    bVar.mo10667a(3, (C3856j) qcVar);
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
        if (!(obj instanceof C3883pc)) {
            return false;
        }
        C3883pc pcVar = (C3883pc) obj;
        Integer num = this.f11581d;
        if (num == null) {
            if (pcVar.f11581d != null) {
                return false;
            }
        } else if (!num.equals(pcVar.f11581d)) {
            return false;
        }
        if (!C3848h.m15461a((Object[]) this.f11582e, (Object[]) pcVar.f11582e) || !C3848h.m15461a((Object[]) this.f11583f, (Object[]) pcVar.f11583f)) {
            return false;
        }
        C3840f fVar = this.f11405b;
        if (fVar != null && !fVar.mo10723d()) {
            return this.f11405b.equals(pcVar.f11405b);
        }
        C3840f fVar2 = pcVar.f11405b;
        return fVar2 == null || fVar2.mo10723d();
    }

    public final int hashCode() {
        int hashCode = (C3883pc.class.getName().hashCode() + 527) * 31;
        Integer num = this.f11581d;
        int i = 0;
        int hashCode2 = (((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + C3848h.m15458a((Object[]) this.f11582e)) * 31) + C3848h.m15458a((Object[]) this.f11583f)) * 31;
        C3840f fVar = this.f11405b;
        if (fVar != null && !fVar.mo10723d()) {
            i = this.f11405b.hashCode();
        }
        return hashCode2 + i;
    }
}
