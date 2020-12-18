package android.support.constraint.p005a.p006a;

import android.support.constraint.p005a.C0063b;
import android.support.constraint.p005a.C0066e;
import android.support.constraint.p005a.C0069h;
import android.support.constraint.p005a.p006a.C0048b;
import java.util.ArrayList;

/* renamed from: android.support.constraint.a.a.g */
public class C0057g extends C0053d {

    /* renamed from: pa */
    protected float f335pa = -1.0f;

    /* renamed from: qa */
    protected int f336qa = -1;

    /* renamed from: ra */
    protected int f337ra = -1;

    /* renamed from: sa */
    private C0048b f338sa = this.f289k;

    /* renamed from: ta */
    private int f339ta = 0;

    /* renamed from: ua */
    private boolean f340ua = false;

    /* renamed from: va */
    private int f341va = 0;

    /* renamed from: wa */
    private C0059i f342wa = new C0059i();

    /* renamed from: xa */
    private int f343xa = 8;

    public C0057g() {
        this.f301r.clear();
        this.f301r.add(this.f338sa);
    }

    /* renamed from: D */
    public int mo204D() {
        return this.f339ta;
    }

    /* renamed from: E */
    public int mo205E() {
        return this.f336qa;
    }

    /* renamed from: F */
    public int mo206F() {
        return this.f337ra;
    }

    /* renamed from: G */
    public float mo207G() {
        return this.f335pa;
    }

    /* renamed from: a */
    public C0048b mo133a(C0048b.C0051c cVar) {
        int i = C0056f.f334a[cVar.ordinal()];
        if (i == 1 || i == 2) {
            if (this.f339ta == 1) {
                return this.f338sa;
            }
            return null;
        } else if ((i == 3 || i == 4) && this.f339ta == 0) {
            return this.f338sa;
        } else {
            return null;
        }
    }

    /* renamed from: a */
    public ArrayList<C0048b> mo134a() {
        return this.f301r;
    }

    /* renamed from: a */
    public void mo144a(C0066e eVar, int i) {
        C0063b a;
        C0069h a2;
        C0069h a3;
        int i2;
        C0055e eVar2 = (C0055e) mo179n();
        if (eVar2 != null) {
            C0048b a4 = eVar2.mo133a(C0048b.C0051c.LEFT);
            C0048b a5 = eVar2.mo133a(C0048b.C0051c.RIGHT);
            if (this.f339ta == 0) {
                a4 = eVar2.mo133a(C0048b.C0051c.TOP);
                a5 = eVar2.mo133a(C0048b.C0051c.BOTTOM);
            }
            if (this.f336qa != -1) {
                a2 = eVar.mo246a((Object) this.f338sa);
                a3 = eVar.mo246a((Object) a4);
                i2 = this.f336qa;
            } else if (this.f337ra != -1) {
                a2 = eVar.mo246a((Object) this.f338sa);
                a3 = eVar.mo246a((Object) a5);
                i2 = -this.f337ra;
            } else if (this.f335pa != -1.0f) {
                a = C0066e.m296a(eVar, eVar.mo246a((Object) this.f338sa), eVar.mo246a((Object) a4), eVar.mo246a((Object) a5), this.f335pa, this.f340ua);
                eVar.mo247a(a);
            } else {
                return;
            }
            a = C0066e.m295a(eVar, a2, a3, i2, false);
            eVar.mo247a(a);
        }
    }

    /* renamed from: b */
    public void mo153b(C0066e eVar, int i) {
        if (mo179n() != null) {
            int b = eVar.mo251b((Object) this.f338sa);
            if (this.f339ta == 1) {
                mo175k(b);
                mo177l(0);
                mo149b(mo179n().mo172j());
                mo169h(0);
                return;
            }
            mo175k(0);
            mo177l(b);
            mo169h(mo179n().mo185t());
            mo149b(0);
        }
    }

    /* renamed from: e */
    public void mo208e(float f) {
        if (f > -1.0f) {
            this.f335pa = f;
            this.f336qa = -1;
            this.f337ra = -1;
        }
    }

    /* renamed from: m */
    public void mo209m(int i) {
        if (i > -1) {
            this.f335pa = -1.0f;
            this.f336qa = i;
            this.f337ra = -1;
        }
    }

    /* renamed from: n */
    public void mo210n(int i) {
        if (i > -1) {
            this.f335pa = -1.0f;
            this.f336qa = -1;
            this.f337ra = i;
        }
    }

    /* renamed from: o */
    public void mo211o(int i) {
        if (this.f339ta != i) {
            this.f339ta = i;
            this.f301r.clear();
            this.f338sa = this.f339ta == 1 ? this.f287j : this.f289k;
            this.f301r.add(this.f338sa);
        }
    }
}
