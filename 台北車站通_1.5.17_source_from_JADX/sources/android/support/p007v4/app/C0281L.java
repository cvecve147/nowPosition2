package android.support.p007v4.app;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.L */
class C0281L implements Transition.TransitionListener {

    /* renamed from: a */
    final /* synthetic */ Object f1214a;

    /* renamed from: b */
    final /* synthetic */ ArrayList f1215b;

    /* renamed from: c */
    final /* synthetic */ Object f1216c;

    /* renamed from: d */
    final /* synthetic */ ArrayList f1217d;

    /* renamed from: e */
    final /* synthetic */ Object f1218e;

    /* renamed from: f */
    final /* synthetic */ ArrayList f1219f;

    /* renamed from: g */
    final /* synthetic */ C0285N f1220g;

    C0281L(C0285N n, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
        this.f1220g = n;
        this.f1214a = obj;
        this.f1215b = arrayList;
        this.f1216c = obj2;
        this.f1217d = arrayList2;
        this.f1218e = obj3;
        this.f1219f = arrayList3;
    }

    public void onTransitionCancel(Transition transition) {
    }

    public void onTransitionEnd(Transition transition) {
    }

    public void onTransitionPause(Transition transition) {
    }

    public void onTransitionResume(Transition transition) {
    }

    public void onTransitionStart(Transition transition) {
        Object obj = this.f1214a;
        if (obj != null) {
            this.f1220g.mo957a(obj, (ArrayList<View>) this.f1215b, (ArrayList<View>) null);
        }
        Object obj2 = this.f1216c;
        if (obj2 != null) {
            this.f1220g.mo957a(obj2, (ArrayList<View>) this.f1217d, (ArrayList<View>) null);
        }
        Object obj3 = this.f1218e;
        if (obj3 != null) {
            this.f1220g.mo957a(obj3, (ArrayList<View>) this.f1219f, (ArrayList<View>) null);
        }
    }
}
