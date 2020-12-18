package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.zc */
public final class C3923zc extends C3832d<C3923zc> {

    /* renamed from: c */
    private static volatile C3923zc[] f11746c;

    /* renamed from: d */
    public C3717Ac[] f11747d = C3717Ac.m14877e();

    /* renamed from: e */
    public String f11748e = null;

    /* renamed from: f */
    public Long f11749f = null;

    /* renamed from: g */
    public Long f11750g = null;

    /* renamed from: h */
    public Integer f11751h = null;

    public C3923zc() {
        this.f11405b = null;
        this.f11510a = -1;
    }

    /* renamed from: e */
    public static C3923zc[] m15942e() {
        if (f11746c == null) {
            synchronized (C3848h.f11468c) {
                if (f11746c == null) {
                    f11746c = new C3923zc[0];
                }
            }
        }
        return f11746c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10403a() {
        int a = super.mo10403a();
        C3717Ac[] acArr = this.f11747d;
        if (acArr != null && acArr.length > 0) {
            int i = 0;
            while (true) {
                C3717Ac[] acArr2 = this.f11747d;
                if (i >= acArr2.length) {
                    break;
                }
                C3717Ac ac = acArr2[i];
                if (ac != null) {
                    a += C3824b.m15348b(1, (C3856j) ac);
                }
                i++;
            }
        }
        String str = this.f11748e;
        if (str != null) {
            a += C3824b.m15349b(2, str);
        }
        Long l = this.f11749f;
        if (l != null) {
            a += C3824b.m15351c(3, l.longValue());
        }
        Long l2 = this.f11750g;
        if (l2 != null) {
            a += C3824b.m15351c(4, l2.longValue());
        }
        Integer num = this.f11751h;
        return num != null ? a + C3824b.m15347b(5, num.intValue()) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ C3856j mo10404a(C3820a aVar) {
        while (true) {
            int c = aVar.mo10645c();
            if (c == 0) {
                return this;
            }
            if (c == 10) {
                int a = C3868m.m15505a(aVar, 10);
                C3717Ac[] acArr = this.f11747d;
                int length = acArr == null ? 0 : acArr.length;
                C3717Ac[] acArr2 = new C3717Ac[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.f11747d, 0, acArr2, 0, length);
                }
                while (length < acArr2.length - 1) {
                    acArr2[length] = new C3717Ac();
                    aVar.mo10640a((C3856j) acArr2[length]);
                    aVar.mo10645c();
                    length++;
                }
                acArr2[length] = new C3717Ac();
                aVar.mo10640a((C3856j) acArr2[length]);
                this.f11747d = acArr2;
            } else if (c == 18) {
                this.f11748e = aVar.mo10642b();
            } else if (c == 24) {
                this.f11749f = Long.valueOf(aVar.mo10651f());
            } else if (c == 32) {
                this.f11750g = Long.valueOf(aVar.mo10651f());
            } else if (c == 40) {
                this.f11751h = Integer.valueOf(aVar.mo10649e());
            } else if (!super.mo10679a(aVar, c)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo10405a(C3824b bVar) {
        C3717Ac[] acArr = this.f11747d;
        if (acArr != null && acArr.length > 0) {
            int i = 0;
            while (true) {
                C3717Ac[] acArr2 = this.f11747d;
                if (i >= acArr2.length) {
                    break;
                }
                C3717Ac ac = acArr2[i];
                if (ac != null) {
                    bVar.mo10667a(1, (C3856j) ac);
                }
                i++;
            }
        }
        String str = this.f11748e;
        if (str != null) {
            bVar.mo10668a(2, str);
        }
        Long l = this.f11749f;
        if (l != null) {
            bVar.mo10671b(3, l.longValue());
        }
        Long l2 = this.f11750g;
        if (l2 != null) {
            bVar.mo10671b(4, l2.longValue());
        }
        Integer num = this.f11751h;
        if (num != null) {
            bVar.mo10665a(5, num.intValue());
        }
        super.mo10405a(bVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3923zc)) {
            return false;
        }
        C3923zc zcVar = (C3923zc) obj;
        if (!C3848h.m15461a((Object[]) this.f11747d, (Object[]) zcVar.f11747d)) {
            return false;
        }
        String str = this.f11748e;
        if (str == null) {
            if (zcVar.f11748e != null) {
                return false;
            }
        } else if (!str.equals(zcVar.f11748e)) {
            return false;
        }
        Long l = this.f11749f;
        if (l == null) {
            if (zcVar.f11749f != null) {
                return false;
            }
        } else if (!l.equals(zcVar.f11749f)) {
            return false;
        }
        Long l2 = this.f11750g;
        if (l2 == null) {
            if (zcVar.f11750g != null) {
                return false;
            }
        } else if (!l2.equals(zcVar.f11750g)) {
            return false;
        }
        Integer num = this.f11751h;
        if (num == null) {
            if (zcVar.f11751h != null) {
                return false;
            }
        } else if (!num.equals(zcVar.f11751h)) {
            return false;
        }
        C3840f fVar = this.f11405b;
        if (fVar != null && !fVar.mo10723d()) {
            return this.f11405b.equals(zcVar.f11405b);
        }
        C3840f fVar2 = zcVar.f11405b;
        return fVar2 == null || fVar2.mo10723d();
    }

    public final int hashCode() {
        int hashCode = (((C3923zc.class.getName().hashCode() + 527) * 31) + C3848h.m15458a((Object[]) this.f11747d)) * 31;
        String str = this.f11748e;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.f11749f;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f11750g;
        int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.f11751h;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        C3840f fVar = this.f11405b;
        if (fVar != null && !fVar.mo10723d()) {
            i = this.f11405b.hashCode();
        }
        return hashCode5 + i;
    }
}
