package android.support.p011v7.widget;

import android.support.p011v7.widget.C0887sb;
import android.support.p011v7.widget.RecyclerView;
import android.view.View;

/* renamed from: android.support.v7.widget.Ia */
class C0722Ia implements C0887sb.C0889b {

    /* renamed from: a */
    final /* synthetic */ RecyclerView.C0759i f2805a;

    C0722Ia(RecyclerView.C0759i iVar) {
        this.f2805a = iVar;
    }

    /* renamed from: a */
    public int mo3402a() {
        return this.f2805a.mo3931q();
    }

    /* renamed from: a */
    public int mo3403a(View view) {
        return this.f2805a.mo3919j(view) - ((RecyclerView.C0762j) view.getLayoutParams()).topMargin;
    }

    /* renamed from: a */
    public View mo3404a(int i) {
        return this.f2805a.mo3890c(i);
    }

    /* renamed from: b */
    public int mo3405b() {
        return this.f2805a.mo3914h() - this.f2805a.mo3926n();
    }

    /* renamed from: b */
    public int mo3406b(View view) {
        return this.f2805a.mo3904e(view) + ((RecyclerView.C0762j) view.getLayoutParams()).bottomMargin;
    }
}
