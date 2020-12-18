package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.uc */
public final class C3903uc extends C3832d<C3903uc> {

    /* renamed from: c */
    public Integer f11669c = null;

    /* renamed from: d */
    public String f11670d = null;

    /* renamed from: e */
    public Boolean f11671e = null;

    /* renamed from: f */
    public String[] f11672f = C3868m.f11544f;

    public C3903uc() {
        this.f11405b = null;
        this.f11510a = -1;
    }

    /* renamed from: b */
    private final C3903uc m15724b(C3820a aVar) {
        int e;
        while (true) {
            int c = aVar.mo10645c();
            if (c == 0) {
                return this;
            }
            if (c == 8) {
                try {
                    e = aVar.mo10649e();
                    if (e < 0 || e > 6) {
                        StringBuilder sb = new StringBuilder(41);
                        sb.append(e);
                        sb.append(" is not a valid enum MatchType");
                    } else {
                        this.f11669c = Integer.valueOf(e);
                    }
                } catch (IllegalArgumentException unused) {
                    aVar.mo10650e(aVar.mo10638a());
                    mo10679a(aVar, c);
                }
            } else if (c == 18) {
                this.f11670d = aVar.mo10642b();
            } else if (c == 24) {
                this.f11671e = Boolean.valueOf(aVar.mo10648d());
            } else if (c == 34) {
                int a = C3868m.m15505a(aVar, 34);
                String[] strArr = this.f11672f;
                int length = strArr == null ? 0 : strArr.length;
                String[] strArr2 = new String[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.f11672f, 0, strArr2, 0, length);
                }
                while (length < strArr2.length - 1) {
                    strArr2[length] = aVar.mo10642b();
                    aVar.mo10645c();
                    length++;
                }
                strArr2[length] = aVar.mo10642b();
                this.f11672f = strArr2;
            } else if (!super.mo10679a(aVar, c)) {
                return this;
            }
        }
        StringBuilder sb2 = new StringBuilder(41);
        sb2.append(e);
        sb2.append(" is not a valid enum MatchType");
        throw new IllegalArgumentException(sb2.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10403a() {
        int a = super.mo10403a();
        Integer num = this.f11669c;
        if (num != null) {
            a += C3824b.m15347b(1, num.intValue());
        }
        String str = this.f11670d;
        if (str != null) {
            a += C3824b.m15349b(2, str);
        }
        Boolean bool = this.f11671e;
        if (bool != null) {
            bool.booleanValue();
            a += C3824b.m15346b(3) + 1;
        }
        String[] strArr = this.f11672f;
        if (strArr == null || strArr.length <= 0) {
            return a;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            String[] strArr2 = this.f11672f;
            if (i >= strArr2.length) {
                return a + i2 + (i3 * 1);
            }
            String str2 = strArr2[i];
            if (str2 != null) {
                i3++;
                i2 += C3824b.m15342a(str2);
            }
            i++;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ C3856j mo10404a(C3820a aVar) {
        m15724b(aVar);
        return this;
    }

    /* renamed from: a */
    public final void mo10405a(C3824b bVar) {
        Integer num = this.f11669c;
        if (num != null) {
            bVar.mo10665a(1, num.intValue());
        }
        String str = this.f11670d;
        if (str != null) {
            bVar.mo10668a(2, str);
        }
        Boolean bool = this.f11671e;
        if (bool != null) {
            bVar.mo10669a(3, bool.booleanValue());
        }
        String[] strArr = this.f11672f;
        if (strArr != null && strArr.length > 0) {
            int i = 0;
            while (true) {
                String[] strArr2 = this.f11672f;
                if (i >= strArr2.length) {
                    break;
                }
                String str2 = strArr2[i];
                if (str2 != null) {
                    bVar.mo10668a(4, str2);
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
        if (!(obj instanceof C3903uc)) {
            return false;
        }
        C3903uc ucVar = (C3903uc) obj;
        Integer num = this.f11669c;
        if (num == null) {
            if (ucVar.f11669c != null) {
                return false;
            }
        } else if (!num.equals(ucVar.f11669c)) {
            return false;
        }
        String str = this.f11670d;
        if (str == null) {
            if (ucVar.f11670d != null) {
                return false;
            }
        } else if (!str.equals(ucVar.f11670d)) {
            return false;
        }
        Boolean bool = this.f11671e;
        if (bool == null) {
            if (ucVar.f11671e != null) {
                return false;
            }
        } else if (!bool.equals(ucVar.f11671e)) {
            return false;
        }
        if (!C3848h.m15461a((Object[]) this.f11672f, (Object[]) ucVar.f11672f)) {
            return false;
        }
        C3840f fVar = this.f11405b;
        if (fVar != null && !fVar.mo10723d()) {
            return this.f11405b.equals(ucVar.f11405b);
        }
        C3840f fVar2 = ucVar.f11405b;
        return fVar2 == null || fVar2.mo10723d();
    }

    public final int hashCode() {
        int hashCode = (C3903uc.class.getName().hashCode() + 527) * 31;
        Integer num = this.f11669c;
        int i = 0;
        int intValue = (hashCode + (num == null ? 0 : num.intValue())) * 31;
        String str = this.f11670d;
        int hashCode2 = (intValue + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f11671e;
        int hashCode3 = (((hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31) + C3848h.m15458a((Object[]) this.f11672f)) * 31;
        C3840f fVar = this.f11405b;
        if (fVar != null && !fVar.mo10723d()) {
            i = this.f11405b.hashCode();
        }
        return hashCode3 + i;
    }
}
