package android.support.constraint.p005a.p006a;

import android.support.constraint.p005a.p006a.C0048b;
import java.util.ArrayList;

/* renamed from: android.support.constraint.a.a.j */
public class C0060j {

    /* renamed from: a */
    private int f344a;

    /* renamed from: b */
    private int f345b;

    /* renamed from: c */
    private int f346c;

    /* renamed from: d */
    private int f347d;

    /* renamed from: e */
    private ArrayList<C0061a> f348e = new ArrayList<>();

    /* renamed from: android.support.constraint.a.a.j$a */
    static class C0061a {

        /* renamed from: a */
        private C0048b f349a;

        /* renamed from: b */
        private C0048b f350b;

        /* renamed from: c */
        private int f351c;

        /* renamed from: d */
        private C0048b.C0050b f352d;

        /* renamed from: e */
        private int f353e;

        public C0061a(C0048b bVar) {
            this.f349a = bVar;
            this.f350b = bVar.mo125g();
            this.f351c = bVar.mo121c();
            this.f352d = bVar.mo124f();
            this.f353e = bVar.mo114a();
        }

        /* renamed from: a */
        public void mo214a(C0053d dVar) {
            dVar.mo133a(this.f349a.mo126h()).mo119a(this.f350b, this.f351c, this.f352d, this.f353e);
        }

        /* renamed from: b */
        public void mo215b(C0053d dVar) {
            int i;
            this.f349a = dVar.mo133a(this.f349a.mo126h());
            C0048b bVar = this.f349a;
            if (bVar != null) {
                this.f350b = bVar.mo125g();
                this.f351c = this.f349a.mo121c();
                this.f352d = this.f349a.mo124f();
                i = this.f349a.mo114a();
            } else {
                this.f350b = null;
                i = 0;
                this.f351c = 0;
                this.f352d = C0048b.C0050b.STRONG;
            }
            this.f353e = i;
        }
    }

    public C0060j(C0053d dVar) {
        this.f344a = dVar.mo189w();
        this.f345b = dVar.mo190x();
        this.f346c = dVar.mo185t();
        this.f347d = dVar.mo172j();
        ArrayList<C0048b> a = dVar.mo134a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            this.f348e.add(new C0061a(a.get(i)));
        }
    }

    /* renamed from: a */
    public void mo212a(C0053d dVar) {
        dVar.mo175k(this.f344a);
        dVar.mo177l(this.f345b);
        dVar.mo169h(this.f346c);
        dVar.mo149b(this.f347d);
        int size = this.f348e.size();
        for (int i = 0; i < size; i++) {
            this.f348e.get(i).mo214a(dVar);
        }
    }

    /* renamed from: b */
    public void mo213b(C0053d dVar) {
        this.f344a = dVar.mo189w();
        this.f345b = dVar.mo190x();
        this.f346c = dVar.mo185t();
        this.f347d = dVar.mo172j();
        int size = this.f348e.size();
        for (int i = 0; i < size; i++) {
            this.f348e.get(i).mo215b(dVar);
        }
    }
}
