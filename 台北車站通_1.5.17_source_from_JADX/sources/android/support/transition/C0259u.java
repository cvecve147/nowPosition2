package android.support.transition;

import android.support.transition.C0195M;
import android.view.View;
import java.util.ArrayList;

/* renamed from: android.support.transition.u */
class C0259u implements C0195M.C0198c {

    /* renamed from: a */
    final /* synthetic */ Object f1118a;

    /* renamed from: b */
    final /* synthetic */ ArrayList f1119b;

    /* renamed from: c */
    final /* synthetic */ Object f1120c;

    /* renamed from: d */
    final /* synthetic */ ArrayList f1121d;

    /* renamed from: e */
    final /* synthetic */ Object f1122e;

    /* renamed from: f */
    final /* synthetic */ ArrayList f1123f;

    /* renamed from: g */
    final /* synthetic */ FragmentTransitionSupport f1124g;

    C0259u(FragmentTransitionSupport fragmentTransitionSupport, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
        this.f1124g = fragmentTransitionSupport;
        this.f1118a = obj;
        this.f1119b = arrayList;
        this.f1120c = obj2;
        this.f1121d = arrayList2;
        this.f1122e = obj3;
        this.f1123f = arrayList3;
    }

    /* renamed from: a */
    public void mo1010a(C0195M m) {
    }

    /* renamed from: b */
    public void mo1011b(C0195M m) {
        Object obj = this.f1118a;
        if (obj != null) {
            this.f1124g.mo957a(obj, (ArrayList<View>) this.f1119b, (ArrayList<View>) null);
        }
        Object obj2 = this.f1120c;
        if (obj2 != null) {
            this.f1124g.mo957a(obj2, (ArrayList<View>) this.f1121d, (ArrayList<View>) null);
        }
        Object obj3 = this.f1122e;
        if (obj3 != null) {
            this.f1124g.mo957a(obj3, (ArrayList<View>) this.f1123f, (ArrayList<View>) null);
        }
    }

    /* renamed from: c */
    public void mo1012c(C0195M m) {
    }

    /* renamed from: d */
    public void mo1013d(C0195M m) {
    }
}
