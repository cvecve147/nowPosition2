package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.tc */
public final class C3899tc extends C3832d<C3899tc> {

    /* renamed from: c */
    private static volatile C3899tc[] f11661c;

    /* renamed from: d */
    public Integer f11662d = null;

    /* renamed from: e */
    public String f11663e = null;

    /* renamed from: f */
    public C3891rc f11664f = null;

    public C3899tc() {
        this.f11405b = null;
        this.f11510a = -1;
    }

    /* renamed from: e */
    public static C3899tc[] m15715e() {
        if (f11661c == null) {
            synchronized (C3848h.f11468c) {
                if (f11661c == null) {
                    f11661c = new C3899tc[0];
                }
            }
        }
        return f11661c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10403a() {
        int a = super.mo10403a();
        Integer num = this.f11662d;
        if (num != null) {
            a += C3824b.m15347b(1, num.intValue());
        }
        String str = this.f11663e;
        if (str != null) {
            a += C3824b.m15349b(2, str);
        }
        C3891rc rcVar = this.f11664f;
        return rcVar != null ? a + C3824b.m15348b(3, (C3856j) rcVar) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ C3856j mo10404a(C3820a aVar) {
        while (true) {
            int c = aVar.mo10645c();
            if (c == 0) {
                return this;
            }
            if (c == 8) {
                this.f11662d = Integer.valueOf(aVar.mo10649e());
            } else if (c == 18) {
                this.f11663e = aVar.mo10642b();
            } else if (c == 26) {
                if (this.f11664f == null) {
                    this.f11664f = new C3891rc();
                }
                aVar.mo10640a((C3856j) this.f11664f);
            } else if (!super.mo10679a(aVar, c)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo10405a(C3824b bVar) {
        Integer num = this.f11662d;
        if (num != null) {
            bVar.mo10665a(1, num.intValue());
        }
        String str = this.f11663e;
        if (str != null) {
            bVar.mo10668a(2, str);
        }
        C3891rc rcVar = this.f11664f;
        if (rcVar != null) {
            bVar.mo10667a(3, (C3856j) rcVar);
        }
        super.mo10405a(bVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3899tc)) {
            return false;
        }
        C3899tc tcVar = (C3899tc) obj;
        Integer num = this.f11662d;
        if (num == null) {
            if (tcVar.f11662d != null) {
                return false;
            }
        } else if (!num.equals(tcVar.f11662d)) {
            return false;
        }
        String str = this.f11663e;
        if (str == null) {
            if (tcVar.f11663e != null) {
                return false;
            }
        } else if (!str.equals(tcVar.f11663e)) {
            return false;
        }
        C3891rc rcVar = this.f11664f;
        if (rcVar == null) {
            if (tcVar.f11664f != null) {
                return false;
            }
        } else if (!rcVar.equals(tcVar.f11664f)) {
            return false;
        }
        C3840f fVar = this.f11405b;
        if (fVar != null && !fVar.mo10723d()) {
            return this.f11405b.equals(tcVar.f11405b);
        }
        C3840f fVar2 = tcVar.f11405b;
        return fVar2 == null || fVar2.mo10723d();
    }

    public final int hashCode() {
        int hashCode = (C3899tc.class.getName().hashCode() + 527) * 31;
        Integer num = this.f11662d;
        int i = 0;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f11663e;
        int hashCode3 = hashCode2 + (str == null ? 0 : str.hashCode());
        C3891rc rcVar = this.f11664f;
        int hashCode4 = ((hashCode3 * 31) + (rcVar == null ? 0 : rcVar.hashCode())) * 31;
        C3840f fVar = this.f11405b;
        if (fVar != null && !fVar.mo10723d()) {
            i = this.f11405b.hashCode();
        }
        return hashCode4 + i;
    }
}
