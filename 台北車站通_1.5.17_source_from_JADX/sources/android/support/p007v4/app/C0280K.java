package android.support.p007v4.app;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.K */
class C0280K implements Transition.TransitionListener {

    /* renamed from: a */
    final /* synthetic */ View f1211a;

    /* renamed from: b */
    final /* synthetic */ ArrayList f1212b;

    /* renamed from: c */
    final /* synthetic */ C0285N f1213c;

    C0280K(C0285N n, View view, ArrayList arrayList) {
        this.f1213c = n;
        this.f1211a = view;
        this.f1212b = arrayList;
    }

    public void onTransitionCancel(Transition transition) {
    }

    public void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        this.f1211a.setVisibility(8);
        int size = this.f1212b.size();
        for (int i = 0; i < size; i++) {
            ((View) this.f1212b.get(i)).setVisibility(0);
        }
    }

    public void onTransitionPause(Transition transition) {
    }

    public void onTransitionResume(Transition transition) {
    }

    public void onTransitionStart(Transition transition) {
    }
}
