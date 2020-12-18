package android.support.transition;

import android.support.transition.C0195M;
import android.view.ViewGroup;

/* renamed from: android.support.transition.o */
class C0243o extends C0199N {

    /* renamed from: a */
    boolean f1064a = false;

    /* renamed from: b */
    final /* synthetic */ ViewGroup f1065b;

    /* renamed from: c */
    final /* synthetic */ C0245p f1066c;

    C0243o(C0245p pVar, ViewGroup viewGroup) {
        this.f1066c = pVar;
        this.f1065b = viewGroup;
    }

    /* renamed from: a */
    public void mo1010a(C0195M m) {
        C0214aa.m1066a(this.f1065b, false);
    }

    /* renamed from: c */
    public void mo1012c(C0195M m) {
        C0214aa.m1066a(this.f1065b, true);
    }

    /* renamed from: d */
    public void mo1013d(C0195M m) {
        if (!this.f1064a) {
            C0214aa.m1066a(this.f1065b, false);
        }
        m.mo987b((C0195M.C0198c) this);
    }
}
