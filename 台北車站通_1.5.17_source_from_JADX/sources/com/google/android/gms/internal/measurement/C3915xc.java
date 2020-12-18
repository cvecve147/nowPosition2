package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.xc */
public final class C3915xc extends C3832d<C3915xc> {

    /* renamed from: c */
    private static volatile C3915xc[] f11718c;

    /* renamed from: d */
    public String f11719d = null;

    /* renamed from: e */
    public String f11720e = null;

    public C3915xc() {
        this.f11405b = null;
        this.f11510a = -1;
    }

    /* renamed from: e */
    public static C3915xc[] m15868e() {
        if (f11718c == null) {
            synchronized (C3848h.f11468c) {
                if (f11718c == null) {
                    f11718c = new C3915xc[0];
                }
            }
        }
        return f11718c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10403a() {
        int a = super.mo10403a();
        String str = this.f11719d;
        if (str != null) {
            a += C3824b.m15349b(1, str);
        }
        String str2 = this.f11720e;
        return str2 != null ? a + C3824b.m15349b(2, str2) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ C3856j mo10404a(C3820a aVar) {
        while (true) {
            int c = aVar.mo10645c();
            if (c == 0) {
                return this;
            }
            if (c == 10) {
                this.f11719d = aVar.mo10642b();
            } else if (c == 18) {
                this.f11720e = aVar.mo10642b();
            } else if (!super.mo10679a(aVar, c)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo10405a(C3824b bVar) {
        String str = this.f11719d;
        if (str != null) {
            bVar.mo10668a(1, str);
        }
        String str2 = this.f11720e;
        if (str2 != null) {
            bVar.mo10668a(2, str2);
        }
        super.mo10405a(bVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3915xc)) {
            return false;
        }
        C3915xc xcVar = (C3915xc) obj;
        String str = this.f11719d;
        if (str == null) {
            if (xcVar.f11719d != null) {
                return false;
            }
        } else if (!str.equals(xcVar.f11719d)) {
            return false;
        }
        String str2 = this.f11720e;
        if (str2 == null) {
            if (xcVar.f11720e != null) {
                return false;
            }
        } else if (!str2.equals(xcVar.f11720e)) {
            return false;
        }
        C3840f fVar = this.f11405b;
        if (fVar != null && !fVar.mo10723d()) {
            return this.f11405b.equals(xcVar.f11405b);
        }
        C3840f fVar2 = xcVar.f11405b;
        return fVar2 == null || fVar2.mo10723d();
    }

    public final int hashCode() {
        int hashCode = (C3915xc.class.getName().hashCode() + 527) * 31;
        String str = this.f11719d;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f11720e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C3840f fVar = this.f11405b;
        if (fVar != null && !fVar.mo10723d()) {
            i = this.f11405b.hashCode();
        }
        return hashCode3 + i;
    }
}
