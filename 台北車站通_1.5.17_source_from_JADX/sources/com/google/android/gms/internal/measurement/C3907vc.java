package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.vc */
public final class C3907vc extends C3832d<C3907vc> {

    /* renamed from: c */
    private static volatile C3907vc[] f11683c;

    /* renamed from: d */
    public String f11684d = null;

    /* renamed from: e */
    public Boolean f11685e = null;

    /* renamed from: f */
    public Boolean f11686f = null;

    /* renamed from: g */
    public Integer f11687g = null;

    public C3907vc() {
        this.f11405b = null;
        this.f11510a = -1;
    }

    /* renamed from: e */
    public static C3907vc[] m15755e() {
        if (f11683c == null) {
            synchronized (C3848h.f11468c) {
                if (f11683c == null) {
                    f11683c = new C3907vc[0];
                }
            }
        }
        return f11683c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10403a() {
        int a = super.mo10403a();
        String str = this.f11684d;
        if (str != null) {
            a += C3824b.m15349b(1, str);
        }
        Boolean bool = this.f11685e;
        if (bool != null) {
            bool.booleanValue();
            a += C3824b.m15346b(2) + 1;
        }
        Boolean bool2 = this.f11686f;
        if (bool2 != null) {
            bool2.booleanValue();
            a += C3824b.m15346b(3) + 1;
        }
        Integer num = this.f11687g;
        return num != null ? a + C3824b.m15347b(4, num.intValue()) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ C3856j mo10404a(C3820a aVar) {
        while (true) {
            int c = aVar.mo10645c();
            if (c == 0) {
                return this;
            }
            if (c == 10) {
                this.f11684d = aVar.mo10642b();
            } else if (c == 16) {
                this.f11685e = Boolean.valueOf(aVar.mo10648d());
            } else if (c == 24) {
                this.f11686f = Boolean.valueOf(aVar.mo10648d());
            } else if (c == 32) {
                this.f11687g = Integer.valueOf(aVar.mo10649e());
            } else if (!super.mo10679a(aVar, c)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo10405a(C3824b bVar) {
        String str = this.f11684d;
        if (str != null) {
            bVar.mo10668a(1, str);
        }
        Boolean bool = this.f11685e;
        if (bool != null) {
            bVar.mo10669a(2, bool.booleanValue());
        }
        Boolean bool2 = this.f11686f;
        if (bool2 != null) {
            bVar.mo10669a(3, bool2.booleanValue());
        }
        Integer num = this.f11687g;
        if (num != null) {
            bVar.mo10665a(4, num.intValue());
        }
        super.mo10405a(bVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3907vc)) {
            return false;
        }
        C3907vc vcVar = (C3907vc) obj;
        String str = this.f11684d;
        if (str == null) {
            if (vcVar.f11684d != null) {
                return false;
            }
        } else if (!str.equals(vcVar.f11684d)) {
            return false;
        }
        Boolean bool = this.f11685e;
        if (bool == null) {
            if (vcVar.f11685e != null) {
                return false;
            }
        } else if (!bool.equals(vcVar.f11685e)) {
            return false;
        }
        Boolean bool2 = this.f11686f;
        if (bool2 == null) {
            if (vcVar.f11686f != null) {
                return false;
            }
        } else if (!bool2.equals(vcVar.f11686f)) {
            return false;
        }
        Integer num = this.f11687g;
        if (num == null) {
            if (vcVar.f11687g != null) {
                return false;
            }
        } else if (!num.equals(vcVar.f11687g)) {
            return false;
        }
        C3840f fVar = this.f11405b;
        if (fVar != null && !fVar.mo10723d()) {
            return this.f11405b.equals(vcVar.f11405b);
        }
        C3840f fVar2 = vcVar.f11405b;
        return fVar2 == null || fVar2.mo10723d();
    }

    public final int hashCode() {
        int hashCode = (C3907vc.class.getName().hashCode() + 527) * 31;
        String str = this.f11684d;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f11685e;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f11686f;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.f11687g;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        C3840f fVar = this.f11405b;
        if (fVar != null && !fVar.mo10723d()) {
            i = this.f11405b.hashCode();
        }
        return hashCode5 + i;
    }
}
