package android.support.p011v7.widget;

import android.support.p011v7.widget.C0887sb;
import android.support.p011v7.widget.RecyclerView;
import android.view.View;

/* renamed from: android.support.v7.widget.Ha */
class C0720Ha implements C0887sb.C0889b {

    /* renamed from: a */
    final /* synthetic */ RecyclerView.C0759i f2802a;

    C0720Ha(RecyclerView.C0759i iVar) {
        this.f2802a = iVar;
    }

    /* renamed from: a */
    public int mo3402a() {
        return this.f2802a.mo3928o();
    }

    /* renamed from: a */
    public int mo3403a(View view) {
        return this.f2802a.mo3907f(view) - ((RecyclerView.C0762j) view.getLayoutParams()).leftMargin;
    }

    /* renamed from: a */
    public View mo3404a(int i) {
        return this.f2802a.mo3890c(i);
    }

    /* renamed from: b */
    public int mo3405b() {
        return this.f2802a.mo3932r() - this.f2802a.mo3930p();
    }

    /* renamed from: b */
    public int mo3406b(View view) {
        return this.f2802a.mo3917i(view) + ((RecyclerView.C0762j) view.getLayoutParams()).rightMargin;
    }
}
