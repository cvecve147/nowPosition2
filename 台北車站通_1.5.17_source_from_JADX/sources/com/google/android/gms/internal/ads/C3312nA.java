package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.C1815k;
import com.google.android.gms.ads.formats.C1652d;
import com.google.android.gms.ads.mediation.C1836i;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.nA */
public final class C3312nA implements C1836i {

    /* renamed from: a */
    private final Date f9842a;

    /* renamed from: b */
    private final int f9843b;

    /* renamed from: c */
    private final Set<String> f9844c;

    /* renamed from: d */
    private final boolean f9845d;

    /* renamed from: e */
    private final Location f9846e;

    /* renamed from: f */
    private final int f9847f;

    /* renamed from: g */
    private final zzpl f9848g;

    /* renamed from: h */
    private final List<String> f9849h = new ArrayList();

    /* renamed from: i */
    private final boolean f9850i;

    /* renamed from: j */
    private final Map<String, Boolean> f9851j = new HashMap();

    public C3312nA(Date date, int i, Set<String> set, Location location, boolean z, int i2, zzpl zzpl, List<String> list, boolean z2) {
        Map<String, Boolean> map;
        String str;
        boolean z3;
        this.f9842a = date;
        this.f9843b = i;
        this.f9844c = set;
        this.f9846e = location;
        this.f9845d = z;
        this.f9847f = i2;
        this.f9848g = zzpl;
        this.f9850i = z2;
        if (list != null) {
            for (String next : list) {
                if (next.startsWith("custom:")) {
                    String[] split = next.split(":", 3);
                    if (split.length == 3) {
                        if ("true".equals(split[2])) {
                            map = this.f9851j;
                            str = split[1];
                            z3 = true;
                        } else if ("false".equals(split[2])) {
                            map = this.f9851j;
                            str = split[1];
                            z3 = false;
                        }
                        map.put(str, z3);
                    }
                } else {
                    this.f9849h.add(next);
                }
            }
        }
    }

    /* renamed from: a */
    public final int mo7060a() {
        return this.f9847f;
    }

    /* renamed from: b */
    public final boolean mo7142b() {
        List<String> list = this.f9849h;
        return list != null && list.contains("6");
    }

    /* renamed from: c */
    public final boolean mo7061c() {
        return this.f9850i;
    }

    /* renamed from: d */
    public final Map<String, Boolean> mo7143d() {
        return this.f9851j;
    }

    /* renamed from: e */
    public final boolean mo7144e() {
        List<String> list = this.f9849h;
        if (list != null) {
            return list.contains("2") || this.f9849h.contains("6");
        }
        return false;
    }

    /* renamed from: f */
    public final Date mo7062f() {
        return this.f9842a;
    }

    /* renamed from: g */
    public final boolean mo7063g() {
        return this.f9845d;
    }

    public final Location getLocation() {
        return this.f9846e;
    }

    /* renamed from: h */
    public final Set<String> mo7065h() {
        return this.f9844c;
    }

    /* renamed from: i */
    public final boolean mo7145i() {
        List<String> list = this.f9849h;
        return list != null && list.contains("3");
    }

    /* renamed from: j */
    public final C1652d mo7146j() {
        zzmu zzmu;
        if (this.f9848g == null) {
            return null;
        }
        C1652d.C1653a aVar = new C1652d.C1653a();
        aVar.mo6626b(this.f9848g.f10909b);
        aVar.mo6625b(this.f9848g.f10910c);
        aVar.mo6623a(this.f9848g.f10911d);
        zzpl zzpl = this.f9848g;
        if (zzpl.f10908a >= 2) {
            aVar.mo6621a(zzpl.f10912e);
        }
        zzpl zzpl2 = this.f9848g;
        if (zzpl2.f10908a >= 3 && (zzmu = zzpl2.f10913f) != null) {
            aVar.mo6622a(new C1815k(zzmu));
        }
        return aVar.mo6624a();
    }

    /* renamed from: k */
    public final boolean mo7147k() {
        List<String> list = this.f9849h;
        if (list != null) {
            return list.contains("1") || this.f9849h.contains("6");
        }
        return false;
    }

    /* renamed from: l */
    public final int mo7066l() {
        return this.f9843b;
    }
}
