package android.support.transition;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.transition.I */
public class C0191I {

    /* renamed from: a */
    private ViewGroup f954a;

    /* renamed from: b */
    private Runnable f955b;

    /* renamed from: a */
    static C0191I m948a(View view) {
        return (C0191I) view.getTag(C0189G.transition_current_scene);
    }

    /* renamed from: a */
    static void m949a(View view, C0191I i) {
        view.setTag(C0189G.transition_current_scene, i);
    }

    /* renamed from: a */
    public void mo968a() {
        Runnable runnable;
        if (m948a(this.f954a) == this && (runnable = this.f955b) != null) {
            runnable.run();
        }
    }
}
