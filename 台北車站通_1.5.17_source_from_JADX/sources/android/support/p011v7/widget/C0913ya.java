package android.support.p011v7.widget;

import android.support.p011v7.widget.RecyclerView;
import android.view.View;

/* renamed from: android.support.v7.widget.ya */
class C0913ya extends C0687Aa {
    C0913ya(RecyclerView.C0759i iVar) {
        super(iVar, (C0913ya) null);
    }

    /* renamed from: a */
    public int mo3073a() {
        return this.f2622a.mo3932r();
    }

    /* renamed from: a */
    public int mo3074a(View view) {
        return this.f2622a.mo3917i(view) + ((RecyclerView.C0762j) view.getLayoutParams()).rightMargin;
    }

    /* renamed from: a */
    public void mo3075a(int i) {
        this.f2622a.mo3900d(i);
    }

    /* renamed from: b */
    public int mo3076b() {
        return this.f2622a.mo3932r() - this.f2622a.mo3930p();
    }

    /* renamed from: b */
    public int mo3077b(View view) {
        RecyclerView.C0762j jVar = (RecyclerView.C0762j) view.getLayoutParams();
        return this.f2622a.mo3915h(view) + jVar.leftMargin + jVar.rightMargin;
    }

    /* renamed from: c */
    public int mo3078c() {
        return this.f2622a.mo3930p();
    }

    /* renamed from: c */
    public int mo3079c(View view) {
        RecyclerView.C0762j jVar = (RecyclerView.C0762j) view.getLayoutParams();
        return this.f2622a.mo3911g(view) + jVar.topMargin + jVar.bottomMargin;
    }

    /* renamed from: d */
    public int mo3080d() {
        return this.f2622a.mo3933s();
    }

    /* renamed from: d */
    public int mo3081d(View view) {
        return this.f2622a.mo3907f(view) - ((RecyclerView.C0762j) view.getLayoutParams()).leftMargin;
    }

    /* renamed from: e */
    public int mo3082e() {
        return this.f2622a.mo3916i();
    }

    /* renamed from: e */
    public int mo3083e(View view) {
        this.f2622a.mo3869a(view, true, this.f2624c);
        return this.f2624c.right;
    }

    /* renamed from: f */
    public int mo3084f() {
        return this.f2622a.mo3928o();
    }

    /* renamed from: f */
    public int mo3085f(View view) {
        this.f2622a.mo3869a(view, true, this.f2624c);
        return this.f2624c.left;
    }

    /* renamed from: g */
    public int mo3086g() {
        return (this.f2622a.mo3932r() - this.f2622a.mo3928o()) - this.f2622a.mo3930p();
    }
}
