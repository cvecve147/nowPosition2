package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.tm */
final class C3497tm implements C2463Kn {

    /* renamed from: a */
    private final C3411qm f10265a;

    /* renamed from: b */
    private int f10266b;

    /* renamed from: c */
    private int f10267c;

    /* renamed from: d */
    private int f10268d = 0;

    private C3497tm(C3411qm qmVar) {
        C2641Qm.m10989a(qmVar, "input");
        this.f10265a = qmVar;
        this.f10265a.f10086d = this;
    }

    /* renamed from: a */
    public static C3497tm m13888a(C3411qm qmVar) {
        C3497tm tmVar = qmVar.f10086d;
        return tmVar != null ? tmVar : new C3497tm(qmVar);
    }

    /* renamed from: a */
    private final void m13889a(int i) {
        if ((this.f10266b & 7) != i) {
            throw C2755Um.m11352f();
        }
    }

    /* renamed from: a */
    private final void m13890a(List<String> list, boolean z) {
        int d;
        int d2;
        if ((this.f10266b & 7) != 2) {
            throw C2755Um.m11352f();
        } else if (!(list instanceof C3038dn) || z) {
            do {
                list.add(z ? mo8449o() : readString());
                if (!this.f10265a.mo9960s()) {
                    d = this.f10265a.mo9944d();
                } else {
                    return;
                }
            } while (d == this.f10266b);
            this.f10268d = d;
        } else {
            C3038dn dnVar = (C3038dn) list;
            do {
                dnVar.mo9277a(mo8451p());
                if (!this.f10265a.mo9960s()) {
                    d2 = this.f10265a.mo9944d();
                } else {
                    return;
                }
            } while (d2 == this.f10266b);
            this.f10268d = d2;
        }
    }

    /* renamed from: b */
    private static void m13891b(int i) {
        if ((i & 7) != 0) {
            throw C2755Um.m11353g();
        }
    }

    /* renamed from: c */
    private final <T> T m13892c(C2493Ln<T> ln, C2206Bm bm) {
        int m = this.f10265a.mo9954m();
        C3411qm qmVar = this.f10265a;
        if (qmVar.f10083a < qmVar.f10084b) {
            int c = qmVar.mo9942c(m);
            T a = ln.mo8496a();
            this.f10265a.f10083a++;
            ln.mo8497a(a, this, bm);
            ln.mo8504c(a);
            this.f10265a.mo9939a(0);
            C3411qm qmVar2 = this.f10265a;
            qmVar2.f10083a--;
            qmVar2.mo9945d(c);
            return a;
        }
        throw new C2755Um("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: c */
    private static void m13893c(int i) {
        if ((i & 3) != 0) {
            throw C2755Um.m11353g();
        }
    }

    /* renamed from: d */
    private final <T> T m13894d(C2493Ln<T> ln, C2206Bm bm) {
        int i = this.f10267c;
        this.f10267c = ((this.f10266b >>> 3) << 3) | 4;
        try {
            T a = ln.mo8496a();
            ln.mo8497a(a, this, bm);
            ln.mo8504c(a);
            if (this.f10266b == this.f10267c) {
                return a;
            }
            throw C2755Um.m11353g();
        } finally {
            this.f10267c = i;
        }
    }

    /* renamed from: d */
    private final void m13895d(int i) {
        if (this.f10265a.mo9961t() != i) {
            throw C2755Um.m11347a();
        }
    }

    /* renamed from: a */
    public final long mo8416a() {
        m13889a(0);
        return this.f10265a.mo9946e();
    }

    /* renamed from: a */
    public final <T> T mo8417a(C2493Ln<T> ln, C2206Bm bm) {
        m13889a(3);
        return m13894d(ln, bm);
    }

    /* renamed from: a */
    public final void mo8418a(List<C3150hm> list) {
        int d;
        if ((this.f10266b & 7) == 2) {
            do {
                list.add(mo8451p());
                if (!this.f10265a.mo9960s()) {
                    d = this.f10265a.mo9944d();
                } else {
                    return;
                }
            } while (d == this.f10266b);
            this.f10268d = d;
            return;
        }
        throw C2755Um.m11352f();
    }

    /* renamed from: a */
    public final <T> void mo8419a(List<T> list, C2493Ln<T> ln, C2206Bm bm) {
        int d;
        int i = this.f10266b;
        if ((i & 7) == 2) {
            do {
                list.add(m13892c(ln, bm));
                if (!this.f10265a.mo9960s() && this.f10268d == 0) {
                    d = this.f10265a.mo9944d();
                } else {
                    return;
                }
            } while (d == i);
            this.f10268d = d;
            return;
        }
        throw C2755Um.m11352f();
    }

    /* renamed from: b */
    public final int mo8420b() {
        m13889a(0);
        return this.f10265a.mo9954m();
    }

    /* renamed from: b */
    public final <T> T mo8421b(C2493Ln<T> ln, C2206Bm bm) {
        m13889a(2);
        return m13892c(ln, bm);
    }

    /* renamed from: b */
    public final void mo8422b(List<Double> list) {
        int d;
        int d2;
        if (list instanceof C3611xm) {
            C3611xm xmVar = (C3611xm) list;
            int i = this.f10266b & 7;
            if (i == 1) {
                do {
                    xmVar.mo10211a(this.f10265a.mo9938a());
                    if (!this.f10265a.mo9960s()) {
                        d2 = this.f10265a.mo9944d();
                    } else {
                        return;
                    }
                } while (d2 == this.f10266b);
                this.f10268d = d2;
            } else if (i == 2) {
                int m = this.f10265a.mo9954m();
                m13891b(m);
                int t = this.f10265a.mo9961t() + m;
                do {
                    xmVar.mo10211a(this.f10265a.mo9938a());
                } while (this.f10265a.mo9961t() < t);
            } else {
                throw C2755Um.m11352f();
            }
        } else {
            int i2 = this.f10266b & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(this.f10265a.mo9938a()));
                    if (!this.f10265a.mo9960s()) {
                        d = this.f10265a.mo9944d();
                    } else {
                        return;
                    }
                } while (d == this.f10266b);
                this.f10268d = d;
            } else if (i2 == 2) {
                int m2 = this.f10265a.mo9954m();
                m13891b(m2);
                int t2 = this.f10265a.mo9961t() + m2;
                do {
                    list.add(Double.valueOf(this.f10265a.mo9938a()));
                } while (this.f10265a.mo9961t() < t2);
            } else {
                throw C2755Um.m11352f();
            }
        }
    }

    /* renamed from: b */
    public final <T> void mo8423b(List<T> list, C2493Ln<T> ln, C2206Bm bm) {
        int d;
        int i = this.f10266b;
        if ((i & 7) == 3) {
            do {
                list.add(m13894d(ln, bm));
                if (!this.f10265a.mo9960s() && this.f10268d == 0) {
                    d = this.f10265a.mo9944d();
                } else {
                    return;
                }
            } while (d == i);
            this.f10268d = d;
            return;
        }
        throw C2755Um.m11352f();
    }

    /* renamed from: c */
    public final long mo8424c() {
        m13889a(0);
        return this.f10265a.mo9947f();
    }

    /* renamed from: c */
    public final void mo8425c(List<String> list) {
        m13890a(list, true);
    }

    /* renamed from: d */
    public final int mo8426d() {
        m13889a(0);
        return this.f10265a.mo9955n();
    }

    /* renamed from: d */
    public final void mo8427d(List<Boolean> list) {
        int d;
        int d2;
        if (list instanceof C3094fm) {
            C3094fm fmVar = (C3094fm) list;
            int i = this.f10266b & 7;
            if (i == 0) {
                do {
                    fmVar.mo9429a(this.f10265a.mo9951j());
                    if (!this.f10265a.mo9960s()) {
                        d2 = this.f10265a.mo9944d();
                    } else {
                        return;
                    }
                } while (d2 == this.f10266b);
                this.f10268d = d2;
            } else if (i == 2) {
                int t = this.f10265a.mo9961t() + this.f10265a.mo9954m();
                do {
                    fmVar.mo9429a(this.f10265a.mo9951j());
                } while (this.f10265a.mo9961t() < t);
                m13895d(t);
            } else {
                throw C2755Um.m11352f();
            }
        } else {
            int i2 = this.f10266b & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f10265a.mo9951j()));
                    if (!this.f10265a.mo9960s()) {
                        d = this.f10265a.mo9944d();
                    } else {
                        return;
                    }
                } while (d == this.f10266b);
                this.f10268d = d;
            } else if (i2 == 2) {
                int t2 = this.f10265a.mo9961t() + this.f10265a.mo9954m();
                do {
                    list.add(Boolean.valueOf(this.f10265a.mo9951j()));
                } while (this.f10265a.mo9961t() < t2);
                m13895d(t2);
            } else {
                throw C2755Um.m11352f();
            }
        }
    }

    /* renamed from: e */
    public final int mo8428e() {
        m13889a(0);
        return this.f10265a.mo9948g();
    }

    /* renamed from: e */
    public final void mo8429e(List<Integer> list) {
        int d;
        int d2;
        if (list instanceof C2613Pm) {
            C2613Pm pm = (C2613Pm) list;
            int i = this.f10266b & 7;
            if (i == 0) {
                do {
                    pm.mo8689d(this.f10265a.mo9955n());
                    if (!this.f10265a.mo9960s()) {
                        d2 = this.f10265a.mo9944d();
                    } else {
                        return;
                    }
                } while (d2 == this.f10266b);
                this.f10268d = d2;
            } else if (i == 2) {
                int t = this.f10265a.mo9961t() + this.f10265a.mo9954m();
                do {
                    pm.mo8689d(this.f10265a.mo9955n());
                } while (this.f10265a.mo9961t() < t);
                m13895d(t);
            } else {
                throw C2755Um.m11352f();
            }
        } else {
            int i2 = this.f10266b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f10265a.mo9955n()));
                    if (!this.f10265a.mo9960s()) {
                        d = this.f10265a.mo9944d();
                    } else {
                        return;
                    }
                } while (d == this.f10266b);
                this.f10268d = d;
            } else if (i2 == 2) {
                int t2 = this.f10265a.mo9961t() + this.f10265a.mo9954m();
                do {
                    list.add(Integer.valueOf(this.f10265a.mo9955n()));
                } while (this.f10265a.mo9961t() < t2);
                m13895d(t2);
            } else {
                throw C2755Um.m11352f();
            }
        }
    }

    /* renamed from: f */
    public final int mo8430f() {
        m13889a(5);
        return this.f10265a.mo9956o();
    }

    /* renamed from: f */
    public final void mo8431f(List<Long> list) {
        int d;
        int d2;
        if (list instanceof C3179in) {
            C3179in inVar = (C3179in) list;
            int i = this.f10266b & 7;
            if (i == 0) {
                do {
                    inVar.mo9555a(this.f10265a.mo9946e());
                    if (!this.f10265a.mo9960s()) {
                        d2 = this.f10265a.mo9944d();
                    } else {
                        return;
                    }
                } while (d2 == this.f10266b);
                this.f10268d = d2;
            } else if (i == 2) {
                int t = this.f10265a.mo9961t() + this.f10265a.mo9954m();
                do {
                    inVar.mo9555a(this.f10265a.mo9946e());
                } while (this.f10265a.mo9961t() < t);
                m13895d(t);
            } else {
                throw C2755Um.m11352f();
            }
        } else {
            int i2 = this.f10266b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f10265a.mo9946e()));
                    if (!this.f10265a.mo9960s()) {
                        d = this.f10265a.mo9944d();
                    } else {
                        return;
                    }
                } while (d == this.f10266b);
                this.f10268d = d;
            } else if (i2 == 2) {
                int t2 = this.f10265a.mo9961t() + this.f10265a.mo9954m();
                do {
                    list.add(Long.valueOf(this.f10265a.mo9946e()));
                } while (this.f10265a.mo9961t() < t2);
                m13895d(t2);
            } else {
                throw C2755Um.m11352f();
            }
        }
    }

    /* renamed from: g */
    public final long mo8432g() {
        m13889a(1);
        return this.f10265a.mo9949h();
    }

    /* renamed from: g */
    public final void mo8433g(List<Integer> list) {
        int d;
        int d2;
        if (list instanceof C2613Pm) {
            C2613Pm pm = (C2613Pm) list;
            int i = this.f10266b & 7;
            if (i == 0) {
                do {
                    pm.mo8689d(this.f10265a.mo9954m());
                    if (!this.f10265a.mo9960s()) {
                        d2 = this.f10265a.mo9944d();
                    } else {
                        return;
                    }
                } while (d2 == this.f10266b);
                this.f10268d = d2;
            } else if (i == 2) {
                int t = this.f10265a.mo9961t() + this.f10265a.mo9954m();
                do {
                    pm.mo8689d(this.f10265a.mo9954m());
                } while (this.f10265a.mo9961t() < t);
                m13895d(t);
            } else {
                throw C2755Um.m11352f();
            }
        } else {
            int i2 = this.f10266b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f10265a.mo9954m()));
                    if (!this.f10265a.mo9960s()) {
                        d = this.f10265a.mo9944d();
                    } else {
                        return;
                    }
                } while (d == this.f10266b);
                this.f10268d = d;
            } else if (i2 == 2) {
                int t2 = this.f10265a.mo9961t() + this.f10265a.mo9954m();
                do {
                    list.add(Integer.valueOf(this.f10265a.mo9954m()));
                } while (this.f10265a.mo9961t() < t2);
                m13895d(t2);
            } else {
                throw C2755Um.m11352f();
            }
        }
    }

    public final int getTag() {
        return this.f10266b;
    }

    /* renamed from: h */
    public final long mo8435h() {
        m13889a(1);
        return this.f10265a.mo9957p();
    }

    /* renamed from: h */
    public final void mo8436h(List<Float> list) {
        int d;
        int d2;
        if (list instanceof C2520Mm) {
            C2520Mm mm = (C2520Mm) list;
            int i = this.f10266b & 7;
            if (i == 2) {
                int m = this.f10265a.mo9954m();
                m13893c(m);
                int t = this.f10265a.mo9961t() + m;
                do {
                    mm.mo8536a(this.f10265a.mo9940b());
                } while (this.f10265a.mo9961t() < t);
            } else if (i == 5) {
                do {
                    mm.mo8536a(this.f10265a.mo9940b());
                    if (!this.f10265a.mo9960s()) {
                        d2 = this.f10265a.mo9944d();
                    } else {
                        return;
                    }
                } while (d2 == this.f10266b);
                this.f10268d = d2;
            } else {
                throw C2755Um.m11352f();
            }
        } else {
            int i2 = this.f10266b & 7;
            if (i2 == 2) {
                int m2 = this.f10265a.mo9954m();
                m13893c(m2);
                int t2 = this.f10265a.mo9961t() + m2;
                do {
                    list.add(Float.valueOf(this.f10265a.mo9940b()));
                } while (this.f10265a.mo9961t() < t2);
            } else if (i2 == 5) {
                do {
                    list.add(Float.valueOf(this.f10265a.mo9940b()));
                    if (!this.f10265a.mo9960s()) {
                        d = this.f10265a.mo9944d();
                    } else {
                        return;
                    }
                } while (d == this.f10266b);
                this.f10268d = d;
            } else {
                throw C2755Um.m11352f();
            }
        }
    }

    /* renamed from: i */
    public final int mo8437i() {
        int i = this.f10268d;
        if (i != 0) {
            this.f10266b = i;
            this.f10268d = 0;
        } else {
            this.f10266b = this.f10265a.mo9944d();
        }
        int i2 = this.f10266b;
        if (i2 == 0 || i2 == this.f10267c) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    /* renamed from: i */
    public final void mo8438i(List<Integer> list) {
        int d;
        int d2;
        if (list instanceof C2613Pm) {
            C2613Pm pm = (C2613Pm) list;
            int i = this.f10266b & 7;
            if (i == 0) {
                do {
                    pm.mo8689d(this.f10265a.mo9948g());
                    if (!this.f10265a.mo9960s()) {
                        d2 = this.f10265a.mo9944d();
                    } else {
                        return;
                    }
                } while (d2 == this.f10266b);
                this.f10268d = d2;
            } else if (i == 2) {
                int t = this.f10265a.mo9961t() + this.f10265a.mo9954m();
                do {
                    pm.mo8689d(this.f10265a.mo9948g());
                } while (this.f10265a.mo9961t() < t);
                m13895d(t);
            } else {
                throw C2755Um.m11352f();
            }
        } else {
            int i2 = this.f10266b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f10265a.mo9948g()));
                    if (!this.f10265a.mo9960s()) {
                        d = this.f10265a.mo9944d();
                    } else {
                        return;
                    }
                } while (d == this.f10266b);
                this.f10268d = d;
            } else if (i2 == 2) {
                int t2 = this.f10265a.mo9961t() + this.f10265a.mo9954m();
                do {
                    list.add(Integer.valueOf(this.f10265a.mo9948g()));
                } while (this.f10265a.mo9961t() < t2);
                m13895d(t2);
            } else {
                throw C2755Um.m11352f();
            }
        }
    }

    /* renamed from: j */
    public final int mo8439j() {
        m13889a(5);
        return this.f10265a.mo9950i();
    }

    /* renamed from: j */
    public final void mo8440j(List<Integer> list) {
        int d;
        int d2;
        if (list instanceof C2613Pm) {
            C2613Pm pm = (C2613Pm) list;
            int i = this.f10266b & 7;
            if (i == 0) {
                do {
                    pm.mo8689d(this.f10265a.mo9958q());
                    if (!this.f10265a.mo9960s()) {
                        d2 = this.f10265a.mo9944d();
                    } else {
                        return;
                    }
                } while (d2 == this.f10266b);
                this.f10268d = d2;
            } else if (i == 2) {
                int t = this.f10265a.mo9961t() + this.f10265a.mo9954m();
                do {
                    pm.mo8689d(this.f10265a.mo9958q());
                } while (this.f10265a.mo9961t() < t);
                m13895d(t);
            } else {
                throw C2755Um.m11352f();
            }
        } else {
            int i2 = this.f10266b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f10265a.mo9958q()));
                    if (!this.f10265a.mo9960s()) {
                        d = this.f10265a.mo9944d();
                    } else {
                        return;
                    }
                } while (d == this.f10266b);
                this.f10268d = d;
            } else if (i2 == 2) {
                int t2 = this.f10265a.mo9961t() + this.f10265a.mo9954m();
                do {
                    list.add(Integer.valueOf(this.f10265a.mo9958q()));
                } while (this.f10265a.mo9961t() < t2);
                m13895d(t2);
            } else {
                throw C2755Um.m11352f();
            }
        }
    }

    /* renamed from: k */
    public final void mo8441k(List<Long> list) {
        int d;
        int d2;
        if (list instanceof C3179in) {
            C3179in inVar = (C3179in) list;
            int i = this.f10266b & 7;
            if (i == 0) {
                do {
                    inVar.mo9555a(this.f10265a.mo9947f());
                    if (!this.f10265a.mo9960s()) {
                        d2 = this.f10265a.mo9944d();
                    } else {
                        return;
                    }
                } while (d2 == this.f10266b);
                this.f10268d = d2;
            } else if (i == 2) {
                int t = this.f10265a.mo9961t() + this.f10265a.mo9954m();
                do {
                    inVar.mo9555a(this.f10265a.mo9947f());
                } while (this.f10265a.mo9961t() < t);
                m13895d(t);
            } else {
                throw C2755Um.m11352f();
            }
        } else {
            int i2 = this.f10266b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f10265a.mo9947f()));
                    if (!this.f10265a.mo9960s()) {
                        d = this.f10265a.mo9944d();
                    } else {
                        return;
                    }
                } while (d == this.f10266b);
                this.f10268d = d;
            } else if (i2 == 2) {
                int t2 = this.f10265a.mo9961t() + this.f10265a.mo9954m();
                do {
                    list.add(Long.valueOf(this.f10265a.mo9947f()));
                } while (this.f10265a.mo9961t() < t2);
                m13895d(t2);
            } else {
                throw C2755Um.m11352f();
            }
        }
    }

    /* renamed from: k */
    public final boolean mo8442k() {
        int i;
        if (this.f10265a.mo9960s() || (i = this.f10266b) == this.f10267c) {
            return false;
        }
        return this.f10265a.mo9941b(i);
    }

    /* renamed from: l */
    public final int mo8443l() {
        m13889a(0);
        return this.f10265a.mo9958q();
    }

    /* renamed from: l */
    public final void mo8444l(List<Long> list) {
        int d;
        int d2;
        if (list instanceof C3179in) {
            C3179in inVar = (C3179in) list;
            int i = this.f10266b & 7;
            if (i == 0) {
                do {
                    inVar.mo9555a(this.f10265a.mo9959r());
                    if (!this.f10265a.mo9960s()) {
                        d2 = this.f10265a.mo9944d();
                    } else {
                        return;
                    }
                } while (d2 == this.f10266b);
                this.f10268d = d2;
            } else if (i == 2) {
                int t = this.f10265a.mo9961t() + this.f10265a.mo9954m();
                do {
                    inVar.mo9555a(this.f10265a.mo9959r());
                } while (this.f10265a.mo9961t() < t);
                m13895d(t);
            } else {
                throw C2755Um.m11352f();
            }
        } else {
            int i2 = this.f10266b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f10265a.mo9959r()));
                    if (!this.f10265a.mo9960s()) {
                        d = this.f10265a.mo9944d();
                    } else {
                        return;
                    }
                } while (d == this.f10266b);
                this.f10268d = d;
            } else if (i2 == 2) {
                int t2 = this.f10265a.mo9961t() + this.f10265a.mo9954m();
                do {
                    list.add(Long.valueOf(this.f10265a.mo9959r()));
                } while (this.f10265a.mo9961t() < t2);
                m13895d(t2);
            } else {
                throw C2755Um.m11352f();
            }
        }
    }

    /* renamed from: m */
    public final void mo8445m(List<String> list) {
        m13890a(list, false);
    }

    /* renamed from: m */
    public final boolean mo8446m() {
        m13889a(0);
        return this.f10265a.mo9951j();
    }

    /* renamed from: n */
    public final long mo8447n() {
        m13889a(0);
        return this.f10265a.mo9959r();
    }

    /* renamed from: n */
    public final void mo8448n(List<Integer> list) {
        int d;
        int d2;
        if (list instanceof C2613Pm) {
            C2613Pm pm = (C2613Pm) list;
            int i = this.f10266b & 7;
            if (i == 2) {
                int m = this.f10265a.mo9954m();
                m13893c(m);
                int t = this.f10265a.mo9961t() + m;
                do {
                    pm.mo8689d(this.f10265a.mo9950i());
                } while (this.f10265a.mo9961t() < t);
            } else if (i == 5) {
                do {
                    pm.mo8689d(this.f10265a.mo9950i());
                    if (!this.f10265a.mo9960s()) {
                        d2 = this.f10265a.mo9944d();
                    } else {
                        return;
                    }
                } while (d2 == this.f10266b);
                this.f10268d = d2;
            } else {
                throw C2755Um.m11352f();
            }
        } else {
            int i2 = this.f10266b & 7;
            if (i2 == 2) {
                int m2 = this.f10265a.mo9954m();
                m13893c(m2);
                int t2 = this.f10265a.mo9961t() + m2;
                do {
                    list.add(Integer.valueOf(this.f10265a.mo9950i()));
                } while (this.f10265a.mo9961t() < t2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f10265a.mo9950i()));
                    if (!this.f10265a.mo9960s()) {
                        d = this.f10265a.mo9944d();
                    } else {
                        return;
                    }
                } while (d == this.f10266b);
                this.f10268d = d;
            } else {
                throw C2755Um.m11352f();
            }
        }
    }

    /* renamed from: o */
    public final String mo8449o() {
        m13889a(2);
        return this.f10265a.mo9952k();
    }

    /* renamed from: o */
    public final void mo8450o(List<Integer> list) {
        int d;
        int d2;
        if (list instanceof C2613Pm) {
            C2613Pm pm = (C2613Pm) list;
            int i = this.f10266b & 7;
            if (i == 2) {
                int m = this.f10265a.mo9954m();
                m13893c(m);
                int t = this.f10265a.mo9961t() + m;
                do {
                    pm.mo8689d(this.f10265a.mo9956o());
                } while (this.f10265a.mo9961t() < t);
            } else if (i == 5) {
                do {
                    pm.mo8689d(this.f10265a.mo9956o());
                    if (!this.f10265a.mo9960s()) {
                        d2 = this.f10265a.mo9944d();
                    } else {
                        return;
                    }
                } while (d2 == this.f10266b);
                this.f10268d = d2;
            } else {
                throw C2755Um.m11352f();
            }
        } else {
            int i2 = this.f10266b & 7;
            if (i2 == 2) {
                int m2 = this.f10265a.mo9954m();
                m13893c(m2);
                int t2 = this.f10265a.mo9961t() + m2;
                do {
                    list.add(Integer.valueOf(this.f10265a.mo9956o()));
                } while (this.f10265a.mo9961t() < t2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f10265a.mo9956o()));
                    if (!this.f10265a.mo9960s()) {
                        d = this.f10265a.mo9944d();
                    } else {
                        return;
                    }
                } while (d == this.f10266b);
                this.f10268d = d;
            } else {
                throw C2755Um.m11352f();
            }
        }
    }

    /* renamed from: p */
    public final C3150hm mo8451p() {
        m13889a(2);
        return this.f10265a.mo9953l();
    }

    /* renamed from: p */
    public final void mo8452p(List<Long> list) {
        int d;
        int d2;
        if (list instanceof C3179in) {
            C3179in inVar = (C3179in) list;
            int i = this.f10266b & 7;
            if (i == 1) {
                do {
                    inVar.mo9555a(this.f10265a.mo9949h());
                    if (!this.f10265a.mo9960s()) {
                        d2 = this.f10265a.mo9944d();
                    } else {
                        return;
                    }
                } while (d2 == this.f10266b);
                this.f10268d = d2;
            } else if (i == 2) {
                int m = this.f10265a.mo9954m();
                m13891b(m);
                int t = this.f10265a.mo9961t() + m;
                do {
                    inVar.mo9555a(this.f10265a.mo9949h());
                } while (this.f10265a.mo9961t() < t);
            } else {
                throw C2755Um.m11352f();
            }
        } else {
            int i2 = this.f10266b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.f10265a.mo9949h()));
                    if (!this.f10265a.mo9960s()) {
                        d = this.f10265a.mo9944d();
                    } else {
                        return;
                    }
                } while (d == this.f10266b);
                this.f10268d = d;
            } else if (i2 == 2) {
                int m2 = this.f10265a.mo9954m();
                m13891b(m2);
                int t2 = this.f10265a.mo9961t() + m2;
                do {
                    list.add(Long.valueOf(this.f10265a.mo9949h()));
                } while (this.f10265a.mo9961t() < t2);
            } else {
                throw C2755Um.m11352f();
            }
        }
    }

    /* renamed from: q */
    public final void mo8453q(List<Long> list) {
        int d;
        int d2;
        if (list instanceof C3179in) {
            C3179in inVar = (C3179in) list;
            int i = this.f10266b & 7;
            if (i == 1) {
                do {
                    inVar.mo9555a(this.f10265a.mo9957p());
                    if (!this.f10265a.mo9960s()) {
                        d2 = this.f10265a.mo9944d();
                    } else {
                        return;
                    }
                } while (d2 == this.f10266b);
                this.f10268d = d2;
            } else if (i == 2) {
                int m = this.f10265a.mo9954m();
                m13891b(m);
                int t = this.f10265a.mo9961t() + m;
                do {
                    inVar.mo9555a(this.f10265a.mo9957p());
                } while (this.f10265a.mo9961t() < t);
            } else {
                throw C2755Um.m11352f();
            }
        } else {
            int i2 = this.f10266b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.f10265a.mo9957p()));
                    if (!this.f10265a.mo9960s()) {
                        d = this.f10265a.mo9944d();
                    } else {
                        return;
                    }
                } while (d == this.f10266b);
                this.f10268d = d;
            } else if (i2 == 2) {
                int m2 = this.f10265a.mo9954m();
                m13891b(m2);
                int t2 = this.f10265a.mo9961t() + m2;
                do {
                    list.add(Long.valueOf(this.f10265a.mo9957p()));
                } while (this.f10265a.mo9961t() < t2);
            } else {
                throw C2755Um.m11352f();
            }
        }
    }

    public final double readDouble() {
        m13889a(1);
        return this.f10265a.mo9938a();
    }

    public final float readFloat() {
        m13889a(5);
        return this.f10265a.mo9940b();
    }

    public final String readString() {
        m13889a(2);
        return this.f10265a.mo9943c();
    }
}
