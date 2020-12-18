package android.support.transition;

import android.support.transition.C0195M;
import android.view.View;
import java.util.ArrayList;

/* renamed from: android.support.transition.t */
class C0257t implements C0195M.C0198c {

    /* renamed from: a */
    final /* synthetic */ View f1114a;

    /* renamed from: b */
    final /* synthetic */ ArrayList f1115b;

    /* renamed from: c */
    final /* synthetic */ FragmentTransitionSupport f1116c;

    C0257t(FragmentTransitionSupport fragmentTransitionSupport, View view, ArrayList arrayList) {
        this.f1116c = fragmentTransitionSupport;
        this.f1114a = view;
        this.f1115b = arrayList;
    }

    /* renamed from: a */
    public void mo1010a(C0195M m) {
    }

    /* renamed from: b */
    public void mo1011b(C0195M m) {
    }

    /* renamed from: c */
    public void mo1012c(C0195M m) {
    }

    /* renamed from: d */
    public void mo1013d(C0195M m) {
        m.mo987b((C0195M.C0198c) this);
        this.f1114a.setVisibility(8);
        int size = this.f1115b.size();
        for (int i = 0; i < size; i++) {
            ((View) this.f1115b.get(i)).setVisibility(0);
        }
    }
}
