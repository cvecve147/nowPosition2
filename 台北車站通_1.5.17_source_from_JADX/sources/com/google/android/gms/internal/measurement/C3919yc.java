package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.yc */
public final class C3919yc extends C3832d<C3919yc> {

    /* renamed from: c */
    private static volatile C3919yc[] f11727c;

    /* renamed from: d */
    public Integer f11728d = null;

    /* renamed from: e */
    public C3729Dc f11729e = null;

    /* renamed from: f */
    public C3729Dc f11730f = null;

    /* renamed from: g */
    public Boolean f11731g = null;

    public C3919yc() {
        this.f11405b = null;
        this.f11510a = -1;
    }

    /* renamed from: e */
    public static C3919yc[] m15873e() {
        if (f11727c == null) {
            synchronized (C3848h.f11468c) {
                if (f11727c == null) {
                    f11727c = new C3919yc[0];
                }
            }
        }
        return f11727c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10403a() {
        int a = super.mo10403a();
        Integer num = this.f11728d;
        if (num != null) {
            a += C3824b.m15347b(1, num.intValue());
        }
        C3729Dc dc = this.f11729e;
        if (dc != null) {
            a += C3824b.m15348b(2, (C3856j) dc);
        }
        C3729Dc dc2 = this.f11730f;
        if (dc2 != null) {
            a += C3824b.m15348b(3, (C3856j) dc2);
        }
        Boolean bool = this.f11731g;
        if (bool == null) {
            return a;
        }
        bool.booleanValue();
        return a + C3824b.m15346b(4) + 1;
    }

    /* renamed from: a */
    public final /* synthetic */ C3856j mo10404a(C3820a aVar) {
        C3729Dc dc;
        while (true) {
            int c = aVar.mo10645c();
            if (c == 0) {
                return this;
            }
            if (c != 8) {
                if (c == 18) {
                    if (this.f11729e == null) {
                        this.f11729e = new C3729Dc();
                    }
                    dc = this.f11729e;
                } else if (c == 26) {
                    if (this.f11730f == null) {
                        this.f11730f = new C3729Dc();
                    }
                    dc = this.f11730f;
                } else if (c == 32) {
                    this.f11731g = Boolean.valueOf(aVar.mo10648d());
                } else if (!super.mo10679a(aVar, c)) {
                    return this;
                }
                aVar.mo10640a((C3856j) dc);
            } else {
                this.f11728d = Integer.valueOf(aVar.mo10649e());
            }
        }
    }

    /* renamed from: a */
    public final void mo10405a(C3824b bVar) {
        Integer num = this.f11728d;
        if (num != null) {
            bVar.mo10665a(1, num.intValue());
        }
        C3729Dc dc = this.f11729e;
        if (dc != null) {
            bVar.mo10667a(2, (C3856j) dc);
        }
        C3729Dc dc2 = this.f11730f;
        if (dc2 != null) {
            bVar.mo10667a(3, (C3856j) dc2);
        }
        Boolean bool = this.f11731g;
        if (bool != null) {
            bVar.mo10669a(4, bool.booleanValue());
        }
        super.mo10405a(bVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3919yc)) {
            return false;
        }
        C3919yc ycVar = (C3919yc) obj;
        Integer num = this.f11728d;
        if (num == null) {
            if (ycVar.f11728d != null) {
                return false;
            }
        } else if (!num.equals(ycVar.f11728d)) {
            return false;
        }
        C3729Dc dc = this.f11729e;
        if (dc == null) {
            if (ycVar.f11729e != null) {
                return false;
            }
        } else if (!dc.equals(ycVar.f11729e)) {
            return false;
        }
        C3729Dc dc2 = this.f11730f;
        if (dc2 == null) {
            if (ycVar.f11730f != null) {
                return false;
            }
        } else if (!dc2.equals(ycVar.f11730f)) {
            return false;
        }
        Boolean bool = this.f11731g;
        if (bool == null) {
            if (ycVar.f11731g != null) {
                return false;
            }
        } else if (!bool.equals(ycVar.f11731g)) {
            return false;
        }
        C3840f fVar = this.f11405b;
        if (fVar != null && !fVar.mo10723d()) {
            return this.f11405b.equals(ycVar.f11405b);
        }
        C3840f fVar2 = ycVar.f11405b;
        return fVar2 == null || fVar2.mo10723d();
    }

    public final int hashCode() {
        int hashCode = (C3919yc.class.getName().hashCode() + 527) * 31;
        Integer num = this.f11728d;
        int i = 0;
        int hashCode2 = hashCode + (num == null ? 0 : num.hashCode());
        C3729Dc dc = this.f11729e;
        int hashCode3 = (hashCode2 * 31) + (dc == null ? 0 : dc.hashCode());
        C3729Dc dc2 = this.f11730f;
        int hashCode4 = ((hashCode3 * 31) + (dc2 == null ? 0 : dc2.hashCode())) * 31;
        Boolean bool = this.f11731g;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        C3840f fVar = this.f11405b;
        if (fVar != null && !fVar.mo10723d()) {
            i = this.f11405b.hashCode();
        }
        return hashCode5 + i;
    }
}
