package com.google.android.gms.internal.measurement;

import org.apache.http.HttpStatus;

/* renamed from: com.google.android.gms.internal.measurement.Cc */
public final class C3725Cc extends C3832d<C3725Cc> {

    /* renamed from: c */
    private static volatile C3725Cc[] f11029c;

    /* renamed from: A */
    public String f11030A = null;

    /* renamed from: B */
    public String f11031B = null;

    /* renamed from: C */
    public Boolean f11032C = null;

    /* renamed from: D */
    public C3919yc[] f11033D = C3919yc.m15873e();

    /* renamed from: E */
    public String f11034E = null;

    /* renamed from: F */
    public Integer f11035F = null;

    /* renamed from: G */
    private Integer f11036G = null;

    /* renamed from: H */
    private Integer f11037H = null;

    /* renamed from: I */
    public String f11038I = null;

    /* renamed from: J */
    public Long f11039J = null;

    /* renamed from: K */
    public Long f11040K = null;

    /* renamed from: L */
    public String f11041L = null;

    /* renamed from: M */
    private String f11042M = null;

    /* renamed from: N */
    public Integer f11043N = null;

    /* renamed from: d */
    public Integer f11044d = null;

    /* renamed from: e */
    public C3923zc[] f11045e = C3923zc.m15942e();

    /* renamed from: f */
    public C3733Ec[] f11046f = C3733Ec.m14920e();

    /* renamed from: g */
    public Long f11047g = null;

    /* renamed from: h */
    public Long f11048h = null;

    /* renamed from: i */
    public Long f11049i = null;

    /* renamed from: j */
    public Long f11050j = null;

    /* renamed from: k */
    public Long f11051k = null;

    /* renamed from: l */
    public String f11052l = null;

    /* renamed from: m */
    public String f11053m = null;

    /* renamed from: n */
    public String f11054n = null;

    /* renamed from: o */
    public String f11055o = null;

    /* renamed from: p */
    public Integer f11056p = null;

    /* renamed from: q */
    public String f11057q = null;

    /* renamed from: r */
    public String f11058r = null;

    /* renamed from: s */
    public String f11059s = null;

    /* renamed from: t */
    public Long f11060t = null;

    /* renamed from: u */
    public Long f11061u = null;

    /* renamed from: v */
    public String f11062v = null;

    /* renamed from: w */
    public Boolean f11063w = null;

    /* renamed from: x */
    public String f11064x = null;

    /* renamed from: y */
    public Long f11065y = null;

    /* renamed from: z */
    public Integer f11066z = null;

    public C3725Cc() {
        this.f11405b = null;
        this.f11510a = -1;
    }

    /* renamed from: e */
    public static C3725Cc[] m14907e() {
        if (f11029c == null) {
            synchronized (C3848h.f11468c) {
                if (f11029c == null) {
                    f11029c = new C3725Cc[0];
                }
            }
        }
        return f11029c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10403a() {
        int a = super.mo10403a();
        Integer num = this.f11044d;
        if (num != null) {
            a += C3824b.m15347b(1, num.intValue());
        }
        C3923zc[] zcVarArr = this.f11045e;
        int i = 0;
        if (zcVarArr != null && zcVarArr.length > 0) {
            int i2 = a;
            int i3 = 0;
            while (true) {
                C3923zc[] zcVarArr2 = this.f11045e;
                if (i3 >= zcVarArr2.length) {
                    break;
                }
                C3923zc zcVar = zcVarArr2[i3];
                if (zcVar != null) {
                    i2 += C3824b.m15348b(2, (C3856j) zcVar);
                }
                i3++;
            }
            a = i2;
        }
        C3733Ec[] ecArr = this.f11046f;
        if (ecArr != null && ecArr.length > 0) {
            int i4 = a;
            int i5 = 0;
            while (true) {
                C3733Ec[] ecArr2 = this.f11046f;
                if (i5 >= ecArr2.length) {
                    break;
                }
                C3733Ec ec = ecArr2[i5];
                if (ec != null) {
                    i4 += C3824b.m15348b(3, (C3856j) ec);
                }
                i5++;
            }
            a = i4;
        }
        Long l = this.f11047g;
        if (l != null) {
            a += C3824b.m15351c(4, l.longValue());
        }
        Long l2 = this.f11048h;
        if (l2 != null) {
            a += C3824b.m15351c(5, l2.longValue());
        }
        Long l3 = this.f11049i;
        if (l3 != null) {
            a += C3824b.m15351c(6, l3.longValue());
        }
        Long l4 = this.f11051k;
        if (l4 != null) {
            a += C3824b.m15351c(7, l4.longValue());
        }
        String str = this.f11052l;
        if (str != null) {
            a += C3824b.m15349b(8, str);
        }
        String str2 = this.f11053m;
        if (str2 != null) {
            a += C3824b.m15349b(9, str2);
        }
        String str3 = this.f11054n;
        if (str3 != null) {
            a += C3824b.m15349b(10, str3);
        }
        String str4 = this.f11055o;
        if (str4 != null) {
            a += C3824b.m15349b(11, str4);
        }
        Integer num2 = this.f11056p;
        if (num2 != null) {
            a += C3824b.m15347b(12, num2.intValue());
        }
        String str5 = this.f11057q;
        if (str5 != null) {
            a += C3824b.m15349b(13, str5);
        }
        String str6 = this.f11058r;
        if (str6 != null) {
            a += C3824b.m15349b(14, str6);
        }
        String str7 = this.f11059s;
        if (str7 != null) {
            a += C3824b.m15349b(16, str7);
        }
        Long l5 = this.f11060t;
        if (l5 != null) {
            a += C3824b.m15351c(17, l5.longValue());
        }
        Long l6 = this.f11061u;
        if (l6 != null) {
            a += C3824b.m15351c(18, l6.longValue());
        }
        String str8 = this.f11062v;
        if (str8 != null) {
            a += C3824b.m15349b(19, str8);
        }
        Boolean bool = this.f11063w;
        if (bool != null) {
            bool.booleanValue();
            a += C3824b.m15346b(20) + 1;
        }
        String str9 = this.f11064x;
        if (str9 != null) {
            a += C3824b.m15349b(21, str9);
        }
        Long l7 = this.f11065y;
        if (l7 != null) {
            a += C3824b.m15351c(22, l7.longValue());
        }
        Integer num3 = this.f11066z;
        if (num3 != null) {
            a += C3824b.m15347b(23, num3.intValue());
        }
        String str10 = this.f11030A;
        if (str10 != null) {
            a += C3824b.m15349b(24, str10);
        }
        String str11 = this.f11031B;
        if (str11 != null) {
            a += C3824b.m15349b(25, str11);
        }
        Long l8 = this.f11050j;
        if (l8 != null) {
            a += C3824b.m15351c(26, l8.longValue());
        }
        Boolean bool2 = this.f11032C;
        if (bool2 != null) {
            bool2.booleanValue();
            a += C3824b.m15346b(28) + 1;
        }
        C3919yc[] ycVarArr = this.f11033D;
        if (ycVarArr != null && ycVarArr.length > 0) {
            while (true) {
                C3919yc[] ycVarArr2 = this.f11033D;
                if (i >= ycVarArr2.length) {
                    break;
                }
                C3919yc ycVar = ycVarArr2[i];
                if (ycVar != null) {
                    a += C3824b.m15348b(29, (C3856j) ycVar);
                }
                i++;
            }
        }
        String str12 = this.f11034E;
        if (str12 != null) {
            a += C3824b.m15349b(30, str12);
        }
        Integer num4 = this.f11035F;
        if (num4 != null) {
            a += C3824b.m15347b(31, num4.intValue());
        }
        Integer num5 = this.f11036G;
        if (num5 != null) {
            a += C3824b.m15347b(32, num5.intValue());
        }
        Integer num6 = this.f11037H;
        if (num6 != null) {
            a += C3824b.m15347b(33, num6.intValue());
        }
        String str13 = this.f11038I;
        if (str13 != null) {
            a += C3824b.m15349b(34, str13);
        }
        Long l9 = this.f11039J;
        if (l9 != null) {
            a += C3824b.m15351c(35, l9.longValue());
        }
        Long l10 = this.f11040K;
        if (l10 != null) {
            a += C3824b.m15351c(36, l10.longValue());
        }
        String str14 = this.f11041L;
        if (str14 != null) {
            a += C3824b.m15349b(37, str14);
        }
        String str15 = this.f11042M;
        if (str15 != null) {
            a += C3824b.m15349b(38, str15);
        }
        Integer num7 = this.f11043N;
        return num7 != null ? a + C3824b.m15347b(39, num7.intValue()) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ C3856j mo10404a(C3820a aVar) {
        while (true) {
            int c = aVar.mo10645c();
            switch (c) {
                case 0:
                    return this;
                case 8:
                    this.f11044d = Integer.valueOf(aVar.mo10649e());
                    break;
                case 18:
                    int a = C3868m.m15505a(aVar, 18);
                    C3923zc[] zcVarArr = this.f11045e;
                    int length = zcVarArr == null ? 0 : zcVarArr.length;
                    C3923zc[] zcVarArr2 = new C3923zc[(a + length)];
                    if (length != 0) {
                        System.arraycopy(this.f11045e, 0, zcVarArr2, 0, length);
                    }
                    while (length < zcVarArr2.length - 1) {
                        zcVarArr2[length] = new C3923zc();
                        aVar.mo10640a((C3856j) zcVarArr2[length]);
                        aVar.mo10645c();
                        length++;
                    }
                    zcVarArr2[length] = new C3923zc();
                    aVar.mo10640a((C3856j) zcVarArr2[length]);
                    this.f11045e = zcVarArr2;
                    break;
                case 26:
                    int a2 = C3868m.m15505a(aVar, 26);
                    C3733Ec[] ecArr = this.f11046f;
                    int length2 = ecArr == null ? 0 : ecArr.length;
                    C3733Ec[] ecArr2 = new C3733Ec[(a2 + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.f11046f, 0, ecArr2, 0, length2);
                    }
                    while (length2 < ecArr2.length - 1) {
                        ecArr2[length2] = new C3733Ec();
                        aVar.mo10640a((C3856j) ecArr2[length2]);
                        aVar.mo10645c();
                        length2++;
                    }
                    ecArr2[length2] = new C3733Ec();
                    aVar.mo10640a((C3856j) ecArr2[length2]);
                    this.f11046f = ecArr2;
                    break;
                case 32:
                    this.f11047g = Long.valueOf(aVar.mo10651f());
                    break;
                case 40:
                    this.f11048h = Long.valueOf(aVar.mo10651f());
                    break;
                case 48:
                    this.f11049i = Long.valueOf(aVar.mo10651f());
                    break;
                case 56:
                    this.f11051k = Long.valueOf(aVar.mo10651f());
                    break;
                case 66:
                    this.f11052l = aVar.mo10642b();
                    break;
                case 74:
                    this.f11053m = aVar.mo10642b();
                    break;
                case 82:
                    this.f11054n = aVar.mo10642b();
                    break;
                case 90:
                    this.f11055o = aVar.mo10642b();
                    break;
                case 96:
                    this.f11056p = Integer.valueOf(aVar.mo10649e());
                    break;
                case 106:
                    this.f11057q = aVar.mo10642b();
                    break;
                case 114:
                    this.f11058r = aVar.mo10642b();
                    break;
                case 130:
                    this.f11059s = aVar.mo10642b();
                    break;
                case 136:
                    this.f11060t = Long.valueOf(aVar.mo10651f());
                    break;
                case 144:
                    this.f11061u = Long.valueOf(aVar.mo10651f());
                    break;
                case 154:
                    this.f11062v = aVar.mo10642b();
                    break;
                case 160:
                    this.f11063w = Boolean.valueOf(aVar.mo10648d());
                    break;
                case 170:
                    this.f11064x = aVar.mo10642b();
                    break;
                case 176:
                    this.f11065y = Long.valueOf(aVar.mo10651f());
                    break;
                case 184:
                    this.f11066z = Integer.valueOf(aVar.mo10649e());
                    break;
                case 194:
                    this.f11030A = aVar.mo10642b();
                    break;
                case HttpStatus.SC_ACCEPTED /*202*/:
                    this.f11031B = aVar.mo10642b();
                    break;
                case 208:
                    this.f11050j = Long.valueOf(aVar.mo10651f());
                    break;
                case 224:
                    this.f11032C = Boolean.valueOf(aVar.mo10648d());
                    break;
                case 234:
                    int a3 = C3868m.m15505a(aVar, 234);
                    C3919yc[] ycVarArr = this.f11033D;
                    int length3 = ycVarArr == null ? 0 : ycVarArr.length;
                    C3919yc[] ycVarArr2 = new C3919yc[(a3 + length3)];
                    if (length3 != 0) {
                        System.arraycopy(this.f11033D, 0, ycVarArr2, 0, length3);
                    }
                    while (length3 < ycVarArr2.length - 1) {
                        ycVarArr2[length3] = new C3919yc();
                        aVar.mo10640a((C3856j) ycVarArr2[length3]);
                        aVar.mo10645c();
                        length3++;
                    }
                    ycVarArr2[length3] = new C3919yc();
                    aVar.mo10640a((C3856j) ycVarArr2[length3]);
                    this.f11033D = ycVarArr2;
                    break;
                case 242:
                    this.f11034E = aVar.mo10642b();
                    break;
                case 248:
                    this.f11035F = Integer.valueOf(aVar.mo10649e());
                    break;
                case 256:
                    this.f11036G = Integer.valueOf(aVar.mo10649e());
                    break;
                case 264:
                    this.f11037H = Integer.valueOf(aVar.mo10649e());
                    break;
                case 274:
                    this.f11038I = aVar.mo10642b();
                    break;
                case 280:
                    this.f11039J = Long.valueOf(aVar.mo10651f());
                    break;
                case 288:
                    this.f11040K = Long.valueOf(aVar.mo10651f());
                    break;
                case 298:
                    this.f11041L = aVar.mo10642b();
                    break;
                case 306:
                    this.f11042M = aVar.mo10642b();
                    break;
                case 312:
                    this.f11043N = Integer.valueOf(aVar.mo10649e());
                    break;
                default:
                    if (super.mo10679a(aVar, c)) {
                        break;
                    } else {
                        return this;
                    }
            }
        }
    }

    /* renamed from: a */
    public final void mo10405a(C3824b bVar) {
        Integer num = this.f11044d;
        if (num != null) {
            bVar.mo10665a(1, num.intValue());
        }
        C3923zc[] zcVarArr = this.f11045e;
        int i = 0;
        if (zcVarArr != null && zcVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                C3923zc[] zcVarArr2 = this.f11045e;
                if (i2 >= zcVarArr2.length) {
                    break;
                }
                C3923zc zcVar = zcVarArr2[i2];
                if (zcVar != null) {
                    bVar.mo10667a(2, (C3856j) zcVar);
                }
                i2++;
            }
        }
        C3733Ec[] ecArr = this.f11046f;
        if (ecArr != null && ecArr.length > 0) {
            int i3 = 0;
            while (true) {
                C3733Ec[] ecArr2 = this.f11046f;
                if (i3 >= ecArr2.length) {
                    break;
                }
                C3733Ec ec = ecArr2[i3];
                if (ec != null) {
                    bVar.mo10667a(3, (C3856j) ec);
                }
                i3++;
            }
        }
        Long l = this.f11047g;
        if (l != null) {
            bVar.mo10671b(4, l.longValue());
        }
        Long l2 = this.f11048h;
        if (l2 != null) {
            bVar.mo10671b(5, l2.longValue());
        }
        Long l3 = this.f11049i;
        if (l3 != null) {
            bVar.mo10671b(6, l3.longValue());
        }
        Long l4 = this.f11051k;
        if (l4 != null) {
            bVar.mo10671b(7, l4.longValue());
        }
        String str = this.f11052l;
        if (str != null) {
            bVar.mo10668a(8, str);
        }
        String str2 = this.f11053m;
        if (str2 != null) {
            bVar.mo10668a(9, str2);
        }
        String str3 = this.f11054n;
        if (str3 != null) {
            bVar.mo10668a(10, str3);
        }
        String str4 = this.f11055o;
        if (str4 != null) {
            bVar.mo10668a(11, str4);
        }
        Integer num2 = this.f11056p;
        if (num2 != null) {
            bVar.mo10665a(12, num2.intValue());
        }
        String str5 = this.f11057q;
        if (str5 != null) {
            bVar.mo10668a(13, str5);
        }
        String str6 = this.f11058r;
        if (str6 != null) {
            bVar.mo10668a(14, str6);
        }
        String str7 = this.f11059s;
        if (str7 != null) {
            bVar.mo10668a(16, str7);
        }
        Long l5 = this.f11060t;
        if (l5 != null) {
            bVar.mo10671b(17, l5.longValue());
        }
        Long l6 = this.f11061u;
        if (l6 != null) {
            bVar.mo10671b(18, l6.longValue());
        }
        String str8 = this.f11062v;
        if (str8 != null) {
            bVar.mo10668a(19, str8);
        }
        Boolean bool = this.f11063w;
        if (bool != null) {
            bVar.mo10669a(20, bool.booleanValue());
        }
        String str9 = this.f11064x;
        if (str9 != null) {
            bVar.mo10668a(21, str9);
        }
        Long l7 = this.f11065y;
        if (l7 != null) {
            bVar.mo10671b(22, l7.longValue());
        }
        Integer num3 = this.f11066z;
        if (num3 != null) {
            bVar.mo10665a(23, num3.intValue());
        }
        String str10 = this.f11030A;
        if (str10 != null) {
            bVar.mo10668a(24, str10);
        }
        String str11 = this.f11031B;
        if (str11 != null) {
            bVar.mo10668a(25, str11);
        }
        Long l8 = this.f11050j;
        if (l8 != null) {
            bVar.mo10671b(26, l8.longValue());
        }
        Boolean bool2 = this.f11032C;
        if (bool2 != null) {
            bVar.mo10669a(28, bool2.booleanValue());
        }
        C3919yc[] ycVarArr = this.f11033D;
        if (ycVarArr != null && ycVarArr.length > 0) {
            while (true) {
                C3919yc[] ycVarArr2 = this.f11033D;
                if (i >= ycVarArr2.length) {
                    break;
                }
                C3919yc ycVar = ycVarArr2[i];
                if (ycVar != null) {
                    bVar.mo10667a(29, (C3856j) ycVar);
                }
                i++;
            }
        }
        String str12 = this.f11034E;
        if (str12 != null) {
            bVar.mo10668a(30, str12);
        }
        Integer num4 = this.f11035F;
        if (num4 != null) {
            bVar.mo10665a(31, num4.intValue());
        }
        Integer num5 = this.f11036G;
        if (num5 != null) {
            bVar.mo10665a(32, num5.intValue());
        }
        Integer num6 = this.f11037H;
        if (num6 != null) {
            bVar.mo10665a(33, num6.intValue());
        }
        String str13 = this.f11038I;
        if (str13 != null) {
            bVar.mo10668a(34, str13);
        }
        Long l9 = this.f11039J;
        if (l9 != null) {
            bVar.mo10671b(35, l9.longValue());
        }
        Long l10 = this.f11040K;
        if (l10 != null) {
            bVar.mo10671b(36, l10.longValue());
        }
        String str14 = this.f11041L;
        if (str14 != null) {
            bVar.mo10668a(37, str14);
        }
        String str15 = this.f11042M;
        if (str15 != null) {
            bVar.mo10668a(38, str15);
        }
        Integer num7 = this.f11043N;
        if (num7 != null) {
            bVar.mo10665a(39, num7.intValue());
        }
        super.mo10405a(bVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3725Cc)) {
            return false;
        }
        C3725Cc cc = (C3725Cc) obj;
        Integer num = this.f11044d;
        if (num == null) {
            if (cc.f11044d != null) {
                return false;
            }
        } else if (!num.equals(cc.f11044d)) {
            return false;
        }
        if (!C3848h.m15461a((Object[]) this.f11045e, (Object[]) cc.f11045e) || !C3848h.m15461a((Object[]) this.f11046f, (Object[]) cc.f11046f)) {
            return false;
        }
        Long l = this.f11047g;
        if (l == null) {
            if (cc.f11047g != null) {
                return false;
            }
        } else if (!l.equals(cc.f11047g)) {
            return false;
        }
        Long l2 = this.f11048h;
        if (l2 == null) {
            if (cc.f11048h != null) {
                return false;
            }
        } else if (!l2.equals(cc.f11048h)) {
            return false;
        }
        Long l3 = this.f11049i;
        if (l3 == null) {
            if (cc.f11049i != null) {
                return false;
            }
        } else if (!l3.equals(cc.f11049i)) {
            return false;
        }
        Long l4 = this.f11050j;
        if (l4 == null) {
            if (cc.f11050j != null) {
                return false;
            }
        } else if (!l4.equals(cc.f11050j)) {
            return false;
        }
        Long l5 = this.f11051k;
        if (l5 == null) {
            if (cc.f11051k != null) {
                return false;
            }
        } else if (!l5.equals(cc.f11051k)) {
            return false;
        }
        String str = this.f11052l;
        if (str == null) {
            if (cc.f11052l != null) {
                return false;
            }
        } else if (!str.equals(cc.f11052l)) {
            return false;
        }
        String str2 = this.f11053m;
        if (str2 == null) {
            if (cc.f11053m != null) {
                return false;
            }
        } else if (!str2.equals(cc.f11053m)) {
            return false;
        }
        String str3 = this.f11054n;
        if (str3 == null) {
            if (cc.f11054n != null) {
                return false;
            }
        } else if (!str3.equals(cc.f11054n)) {
            return false;
        }
        String str4 = this.f11055o;
        if (str4 == null) {
            if (cc.f11055o != null) {
                return false;
            }
        } else if (!str4.equals(cc.f11055o)) {
            return false;
        }
        Integer num2 = this.f11056p;
        if (num2 == null) {
            if (cc.f11056p != null) {
                return false;
            }
        } else if (!num2.equals(cc.f11056p)) {
            return false;
        }
        String str5 = this.f11057q;
        if (str5 == null) {
            if (cc.f11057q != null) {
                return false;
            }
        } else if (!str5.equals(cc.f11057q)) {
            return false;
        }
        String str6 = this.f11058r;
        if (str6 == null) {
            if (cc.f11058r != null) {
                return false;
            }
        } else if (!str6.equals(cc.f11058r)) {
            return false;
        }
        String str7 = this.f11059s;
        if (str7 == null) {
            if (cc.f11059s != null) {
                return false;
            }
        } else if (!str7.equals(cc.f11059s)) {
            return false;
        }
        Long l6 = this.f11060t;
        if (l6 == null) {
            if (cc.f11060t != null) {
                return false;
            }
        } else if (!l6.equals(cc.f11060t)) {
            return false;
        }
        Long l7 = this.f11061u;
        if (l7 == null) {
            if (cc.f11061u != null) {
                return false;
            }
        } else if (!l7.equals(cc.f11061u)) {
            return false;
        }
        String str8 = this.f11062v;
        if (str8 == null) {
            if (cc.f11062v != null) {
                return false;
            }
        } else if (!str8.equals(cc.f11062v)) {
            return false;
        }
        Boolean bool = this.f11063w;
        if (bool == null) {
            if (cc.f11063w != null) {
                return false;
            }
        } else if (!bool.equals(cc.f11063w)) {
            return false;
        }
        String str9 = this.f11064x;
        if (str9 == null) {
            if (cc.f11064x != null) {
                return false;
            }
        } else if (!str9.equals(cc.f11064x)) {
            return false;
        }
        Long l8 = this.f11065y;
        if (l8 == null) {
            if (cc.f11065y != null) {
                return false;
            }
        } else if (!l8.equals(cc.f11065y)) {
            return false;
        }
        Integer num3 = this.f11066z;
        if (num3 == null) {
            if (cc.f11066z != null) {
                return false;
            }
        } else if (!num3.equals(cc.f11066z)) {
            return false;
        }
        String str10 = this.f11030A;
        if (str10 == null) {
            if (cc.f11030A != null) {
                return false;
            }
        } else if (!str10.equals(cc.f11030A)) {
            return false;
        }
        String str11 = this.f11031B;
        if (str11 == null) {
            if (cc.f11031B != null) {
                return false;
            }
        } else if (!str11.equals(cc.f11031B)) {
            return false;
        }
        Boolean bool2 = this.f11032C;
        if (bool2 == null) {
            if (cc.f11032C != null) {
                return false;
            }
        } else if (!bool2.equals(cc.f11032C)) {
            return false;
        }
        if (!C3848h.m15461a((Object[]) this.f11033D, (Object[]) cc.f11033D)) {
            return false;
        }
        String str12 = this.f11034E;
        if (str12 == null) {
            if (cc.f11034E != null) {
                return false;
            }
        } else if (!str12.equals(cc.f11034E)) {
            return false;
        }
        Integer num4 = this.f11035F;
        if (num4 == null) {
            if (cc.f11035F != null) {
                return false;
            }
        } else if (!num4.equals(cc.f11035F)) {
            return false;
        }
        Integer num5 = this.f11036G;
        if (num5 == null) {
            if (cc.f11036G != null) {
                return false;
            }
        } else if (!num5.equals(cc.f11036G)) {
            return false;
        }
        Integer num6 = this.f11037H;
        if (num6 == null) {
            if (cc.f11037H != null) {
                return false;
            }
        } else if (!num6.equals(cc.f11037H)) {
            return false;
        }
        String str13 = this.f11038I;
        if (str13 == null) {
            if (cc.f11038I != null) {
                return false;
            }
        } else if (!str13.equals(cc.f11038I)) {
            return false;
        }
        Long l9 = this.f11039J;
        if (l9 == null) {
            if (cc.f11039J != null) {
                return false;
            }
        } else if (!l9.equals(cc.f11039J)) {
            return false;
        }
        Long l10 = this.f11040K;
        if (l10 == null) {
            if (cc.f11040K != null) {
                return false;
            }
        } else if (!l10.equals(cc.f11040K)) {
            return false;
        }
        String str14 = this.f11041L;
        if (str14 == null) {
            if (cc.f11041L != null) {
                return false;
            }
        } else if (!str14.equals(cc.f11041L)) {
            return false;
        }
        String str15 = this.f11042M;
        if (str15 == null) {
            if (cc.f11042M != null) {
                return false;
            }
        } else if (!str15.equals(cc.f11042M)) {
            return false;
        }
        Integer num7 = this.f11043N;
        if (num7 == null) {
            if (cc.f11043N != null) {
                return false;
            }
        } else if (!num7.equals(cc.f11043N)) {
            return false;
        }
        C3840f fVar = this.f11405b;
        if (fVar != null && !fVar.mo10723d()) {
            return this.f11405b.equals(cc.f11405b);
        }
        C3840f fVar2 = cc.f11405b;
        return fVar2 == null || fVar2.mo10723d();
    }

    public final int hashCode() {
        int hashCode = (C3725Cc.class.getName().hashCode() + 527) * 31;
        Integer num = this.f11044d;
        int i = 0;
        int hashCode2 = (((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + C3848h.m15458a((Object[]) this.f11045e)) * 31) + C3848h.m15458a((Object[]) this.f11046f)) * 31;
        Long l = this.f11047g;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f11048h;
        int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f11049i;
        int hashCode5 = (hashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.f11050j;
        int hashCode6 = (hashCode5 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.f11051k;
        int hashCode7 = (hashCode6 + (l5 == null ? 0 : l5.hashCode())) * 31;
        String str = this.f11052l;
        int hashCode8 = (hashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f11053m;
        int hashCode9 = (hashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f11054n;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f11055o;
        int hashCode11 = (hashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.f11056p;
        int hashCode12 = (hashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.f11057q;
        int hashCode13 = (hashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f11058r;
        int hashCode14 = (hashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f11059s;
        int hashCode15 = (hashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l6 = this.f11060t;
        int hashCode16 = (hashCode15 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Long l7 = this.f11061u;
        int hashCode17 = (hashCode16 + (l7 == null ? 0 : l7.hashCode())) * 31;
        String str8 = this.f11062v;
        int hashCode18 = (hashCode17 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool = this.f11063w;
        int hashCode19 = (hashCode18 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str9 = this.f11064x;
        int hashCode20 = (hashCode19 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Long l8 = this.f11065y;
        int hashCode21 = (hashCode20 + (l8 == null ? 0 : l8.hashCode())) * 31;
        Integer num3 = this.f11066z;
        int hashCode22 = (hashCode21 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str10 = this.f11030A;
        int hashCode23 = (hashCode22 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f11031B;
        int hashCode24 = (hashCode23 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Boolean bool2 = this.f11032C;
        int hashCode25 = (((hashCode24 + (bool2 == null ? 0 : bool2.hashCode())) * 31) + C3848h.m15458a((Object[]) this.f11033D)) * 31;
        String str12 = this.f11034E;
        int hashCode26 = (hashCode25 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num4 = this.f11035F;
        int hashCode27 = (hashCode26 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f11036G;
        int hashCode28 = (hashCode27 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f11037H;
        int hashCode29 = (hashCode28 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str13 = this.f11038I;
        int hashCode30 = (hashCode29 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Long l9 = this.f11039J;
        int hashCode31 = (hashCode30 + (l9 == null ? 0 : l9.hashCode())) * 31;
        Long l10 = this.f11040K;
        int hashCode32 = (hashCode31 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str14 = this.f11041L;
        int hashCode33 = (hashCode32 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.f11042M;
        int hashCode34 = (hashCode33 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Integer num7 = this.f11043N;
        int hashCode35 = (hashCode34 + (num7 == null ? 0 : num7.hashCode())) * 31;
        C3840f fVar = this.f11405b;
        if (fVar != null && !fVar.mo10723d()) {
            i = this.f11405b.hashCode();
        }
        return hashCode35 + i;
    }
}
