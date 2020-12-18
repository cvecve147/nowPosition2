package android.support.constraint.p005a.p006a;

import android.support.constraint.p005a.C0064c;
import java.util.ArrayList;

/* renamed from: android.support.constraint.a.a.k */
public class C0062k extends C0053d {

    /* renamed from: pa */
    protected ArrayList<C0053d> f354pa = new ArrayList<>();

    /* renamed from: A */
    public void mo130A() {
        this.f354pa.clear();
        super.mo130A();
    }

    /* renamed from: C */
    public void mo132C() {
        super.mo132C();
        ArrayList<C0053d> arrayList = this.f354pa;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C0053d dVar = this.f354pa.get(i);
                dVar.mo150b(mo168h(), mo170i());
                if (!(dVar instanceof C0055e)) {
                    dVar.mo132C();
                }
            }
        }
    }

    /* renamed from: D */
    public C0055e mo204D() {
        C0053d n = mo179n();
        C0055e eVar = this instanceof C0055e ? (C0055e) this : null;
        while (n != null) {
            C0053d n2 = n.mo179n();
            if (n instanceof C0055e) {
                eVar = (C0055e) n;
            }
            n = n2;
        }
        return eVar;
    }

    /* renamed from: E */
    public void mo193E() {
        mo132C();
        ArrayList<C0053d> arrayList = this.f354pa;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C0053d dVar = this.f354pa.get(i);
                if (dVar instanceof C0062k) {
                    ((C0062k) dVar).mo193E();
                }
            }
        }
    }

    /* renamed from: F */
    public void mo216F() {
        this.f354pa.clear();
    }

    /* renamed from: a */
    public void mo143a(C0064c cVar) {
        super.mo143a(cVar);
        int size = this.f354pa.size();
        for (int i = 0; i < size; i++) {
            this.f354pa.get(i).mo143a(cVar);
        }
    }

    /* renamed from: b */
    public void mo150b(int i, int i2) {
        super.mo150b(i, i2);
        int size = this.f354pa.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.f354pa.get(i3).mo150b(mo181p(), mo182q());
        }
    }

    /* renamed from: b */
    public void mo217b(C0053d dVar) {
        this.f354pa.add(dVar);
        if (dVar.mo179n() != null) {
            ((C0062k) dVar.mo179n()).mo218c(dVar);
        }
        dVar.mo142a((C0053d) this);
    }

    /* renamed from: c */
    public void mo218c(C0053d dVar) {
        this.f354pa.remove(dVar);
        dVar.mo142a((C0053d) null);
    }
}
