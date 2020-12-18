package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C2061y;

/* renamed from: com.google.android.gms.internal.measurement.r */
final class C3888r {

    /* renamed from: A */
    private long f11602A;

    /* renamed from: B */
    private long f11603B;

    /* renamed from: a */
    private final C3715Aa f11604a;

    /* renamed from: b */
    private final String f11605b;

    /* renamed from: c */
    private String f11606c;

    /* renamed from: d */
    private String f11607d;

    /* renamed from: e */
    private String f11608e;

    /* renamed from: f */
    private String f11609f;

    /* renamed from: g */
    private long f11610g;

    /* renamed from: h */
    private long f11611h;

    /* renamed from: i */
    private long f11612i;

    /* renamed from: j */
    private String f11613j;

    /* renamed from: k */
    private long f11614k;

    /* renamed from: l */
    private String f11615l;

    /* renamed from: m */
    private long f11616m;

    /* renamed from: n */
    private long f11617n;

    /* renamed from: o */
    private boolean f11618o;

    /* renamed from: p */
    private long f11619p;

    /* renamed from: q */
    private boolean f11620q;

    /* renamed from: r */
    private boolean f11621r;

    /* renamed from: s */
    private long f11622s;

    /* renamed from: t */
    private long f11623t;

    /* renamed from: u */
    private long f11624u;

    /* renamed from: v */
    private long f11625v;

    /* renamed from: w */
    private long f11626w;

    /* renamed from: x */
    private long f11627x;

    /* renamed from: y */
    private String f11628y;

    /* renamed from: z */
    private boolean f11629z;

    C3888r(C3715Aa aa, String str) {
        C2061y.m9067a(aa);
        C2061y.m9076b(str);
        this.f11604a = aa;
        this.f11605b = str;
        this.f11604a.mo10388e();
    }

    /* renamed from: A */
    public final long mo10894A() {
        this.f11604a.mo10388e();
        return this.f11619p;
    }

    /* renamed from: B */
    public final boolean mo10895B() {
        this.f11604a.mo10388e();
        return this.f11620q;
    }

    /* renamed from: C */
    public final boolean mo10896C() {
        this.f11604a.mo10388e();
        return this.f11621r;
    }

    /* renamed from: a */
    public final String mo10897a() {
        this.f11604a.mo10388e();
        return this.f11606c;
    }

    /* renamed from: a */
    public final void mo10898a(long j) {
        this.f11604a.mo10388e();
        this.f11629z |= this.f11619p != j;
        this.f11619p = j;
    }

    /* renamed from: a */
    public final void mo10899a(String str) {
        this.f11604a.mo10388e();
        this.f11629z |= !C3871mc.m15529c(this.f11613j, str);
        this.f11613j = str;
    }

    /* renamed from: a */
    public final void mo10900a(boolean z) {
        this.f11604a.mo10388e();
        this.f11629z |= this.f11618o != z;
        this.f11618o = z;
    }

    /* renamed from: b */
    public final String mo10901b() {
        this.f11604a.mo10388e();
        return this.f11607d;
    }

    /* renamed from: b */
    public final void mo10902b(long j) {
        this.f11604a.mo10388e();
        this.f11629z |= this.f11611h != j;
        this.f11611h = j;
    }

    /* renamed from: b */
    public final void mo10903b(String str) {
        this.f11604a.mo10388e();
        this.f11629z |= !C3871mc.m15529c(this.f11606c, str);
        this.f11606c = str;
    }

    /* renamed from: b */
    public final void mo10904b(boolean z) {
        this.f11604a.mo10388e();
        this.f11629z = this.f11620q != z;
        this.f11620q = z;
    }

    /* renamed from: c */
    public final void mo10905c(long j) {
        this.f11604a.mo10388e();
        this.f11629z |= this.f11612i != j;
        this.f11612i = j;
    }

    /* renamed from: c */
    public final void mo10906c(String str) {
        this.f11604a.mo10388e();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f11629z |= !C3871mc.m15529c(this.f11607d, str);
        this.f11607d = str;
    }

    /* renamed from: c */
    public final void mo10907c(boolean z) {
        this.f11604a.mo10388e();
        this.f11629z = this.f11621r != z;
        this.f11621r = z;
    }

    /* renamed from: c */
    public final boolean mo10908c() {
        this.f11604a.mo10388e();
        return this.f11618o;
    }

    /* renamed from: d */
    public final String mo10909d() {
        this.f11604a.mo10388e();
        return this.f11613j;
    }

    /* renamed from: d */
    public final void mo10910d(long j) {
        this.f11604a.mo10388e();
        this.f11629z |= this.f11614k != j;
        this.f11614k = j;
    }

    /* renamed from: d */
    public final void mo10911d(String str) {
        this.f11604a.mo10388e();
        this.f11629z |= !C3871mc.m15529c(this.f11608e, str);
        this.f11608e = str;
    }

    /* renamed from: e */
    public final String mo10912e() {
        this.f11604a.mo10388e();
        return this.f11605b;
    }

    /* renamed from: e */
    public final void mo10913e(long j) {
        this.f11604a.mo10388e();
        this.f11629z |= this.f11616m != j;
        this.f11616m = j;
    }

    /* renamed from: e */
    public final void mo10914e(String str) {
        this.f11604a.mo10388e();
        this.f11629z |= !C3871mc.m15529c(this.f11609f, str);
        this.f11609f = str;
    }

    /* renamed from: f */
    public final void mo10915f() {
        this.f11604a.mo10388e();
        this.f11629z = false;
    }

    /* renamed from: f */
    public final void mo10916f(long j) {
        this.f11604a.mo10388e();
        this.f11629z |= this.f11617n != j;
        this.f11617n = j;
    }

    /* renamed from: f */
    public final void mo10917f(String str) {
        this.f11604a.mo10388e();
        this.f11629z |= !C3871mc.m15529c(this.f11615l, str);
        this.f11615l = str;
    }

    /* renamed from: g */
    public final String mo10918g() {
        this.f11604a.mo10388e();
        return this.f11608e;
    }

    /* renamed from: g */
    public final void mo10919g(long j) {
        boolean z = true;
        C2061y.m9073a(j >= 0);
        this.f11604a.mo10388e();
        boolean z2 = this.f11629z;
        if (this.f11610g == j) {
            z = false;
        }
        this.f11629z = z2 | z;
        this.f11610g = j;
    }

    /* renamed from: g */
    public final void mo10920g(String str) {
        this.f11604a.mo10388e();
        this.f11629z |= !C3871mc.m15529c(this.f11628y, str);
        this.f11628y = str;
    }

    /* renamed from: h */
    public final String mo10921h() {
        this.f11604a.mo10388e();
        return this.f11609f;
    }

    /* renamed from: h */
    public final void mo10922h(long j) {
        this.f11604a.mo10388e();
        this.f11629z |= this.f11602A != j;
        this.f11602A = j;
    }

    /* renamed from: i */
    public final long mo10923i() {
        this.f11604a.mo10388e();
        return this.f11611h;
    }

    /* renamed from: i */
    public final void mo10924i(long j) {
        this.f11604a.mo10388e();
        this.f11629z |= this.f11603B != j;
        this.f11603B = j;
    }

    /* renamed from: j */
    public final long mo10925j() {
        this.f11604a.mo10388e();
        return this.f11612i;
    }

    /* renamed from: j */
    public final void mo10926j(long j) {
        this.f11604a.mo10388e();
        this.f11629z |= this.f11622s != j;
        this.f11622s = j;
    }

    /* renamed from: k */
    public final long mo10927k() {
        this.f11604a.mo10388e();
        return this.f11614k;
    }

    /* renamed from: k */
    public final void mo10928k(long j) {
        this.f11604a.mo10388e();
        this.f11629z |= this.f11623t != j;
        this.f11623t = j;
    }

    /* renamed from: l */
    public final String mo10929l() {
        this.f11604a.mo10388e();
        return this.f11615l;
    }

    /* renamed from: l */
    public final void mo10930l(long j) {
        this.f11604a.mo10388e();
        this.f11629z |= this.f11624u != j;
        this.f11624u = j;
    }

    /* renamed from: m */
    public final long mo10931m() {
        this.f11604a.mo10388e();
        return this.f11616m;
    }

    /* renamed from: m */
    public final void mo10932m(long j) {
        this.f11604a.mo10388e();
        this.f11629z |= this.f11625v != j;
        this.f11625v = j;
    }

    /* renamed from: n */
    public final long mo10933n() {
        this.f11604a.mo10388e();
        return this.f11617n;
    }

    /* renamed from: n */
    public final void mo10934n(long j) {
        this.f11604a.mo10388e();
        this.f11629z |= this.f11627x != j;
        this.f11627x = j;
    }

    /* renamed from: o */
    public final long mo10935o() {
        this.f11604a.mo10388e();
        return this.f11610g;
    }

    /* renamed from: o */
    public final void mo10936o(long j) {
        this.f11604a.mo10388e();
        this.f11629z |= this.f11626w != j;
        this.f11626w = j;
    }

    /* renamed from: p */
    public final long mo10937p() {
        this.f11604a.mo10388e();
        return this.f11602A;
    }

    /* renamed from: q */
    public final long mo10938q() {
        this.f11604a.mo10388e();
        return this.f11603B;
    }

    /* renamed from: r */
    public final void mo10939r() {
        this.f11604a.mo10388e();
        long j = this.f11610g + 1;
        if (j > 2147483647L) {
            this.f11604a.mo10385b().mo10576B().mo10593a("Bundle index overflow. appId", C3801W.m15166a(this.f11605b));
            j = 0;
        }
        this.f11629z = true;
        this.f11610g = j;
    }

    /* renamed from: s */
    public final long mo10940s() {
        this.f11604a.mo10388e();
        return this.f11622s;
    }

    /* renamed from: t */
    public final long mo10941t() {
        this.f11604a.mo10388e();
        return this.f11623t;
    }

    /* renamed from: u */
    public final long mo10942u() {
        this.f11604a.mo10388e();
        return this.f11624u;
    }

    /* renamed from: v */
    public final long mo10943v() {
        this.f11604a.mo10388e();
        return this.f11625v;
    }

    /* renamed from: w */
    public final long mo10944w() {
        this.f11604a.mo10388e();
        return this.f11627x;
    }

    /* renamed from: x */
    public final long mo10945x() {
        this.f11604a.mo10388e();
        return this.f11626w;
    }

    /* renamed from: y */
    public final String mo10946y() {
        this.f11604a.mo10388e();
        return this.f11628y;
    }

    /* renamed from: z */
    public final String mo10947z() {
        this.f11604a.mo10388e();
        String str = this.f11628y;
        mo10920g((String) null);
        return str;
    }
}
