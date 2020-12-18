package android.support.design.widget;

import android.support.design.widget.CoordinatorLayout;
import android.support.p007v4.view.C0487v;
import android.support.p007v4.widget.C0525I;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.C0104b<V> {

    /* renamed from: a */
    C0525I f686a;

    /* renamed from: b */
    C0129a f687b;

    /* renamed from: c */
    private boolean f688c;

    /* renamed from: d */
    private float f689d = 0.0f;

    /* renamed from: e */
    private boolean f690e;

    /* renamed from: f */
    int f691f = 2;

    /* renamed from: g */
    float f692g = 0.5f;

    /* renamed from: h */
    float f693h = 0.0f;

    /* renamed from: i */
    float f694i = 0.5f;

    /* renamed from: j */
    private final C0525I.C0526a f695j = new C0116G(this);

    /* renamed from: android.support.design.widget.SwipeDismissBehavior$a */
    public interface C0129a {
        /* renamed from: a */
        void mo701a(int i);

        /* renamed from: a */
        void mo702a(View view);
    }

    /* renamed from: android.support.design.widget.SwipeDismissBehavior$b */
    private class C0130b implements Runnable {

        /* renamed from: a */
        private final View f696a;

        /* renamed from: b */
        private final boolean f697b;

        C0130b(View view, boolean z) {
            this.f696a = view;
            this.f697b = z;
        }

        public void run() {
            C0129a aVar;
            C0525I i = SwipeDismissBehavior.this.f686a;
            if (i != null && i.mo2146a(true)) {
                C0487v.m2277a(this.f696a, (Runnable) this);
            } else if (this.f697b && (aVar = SwipeDismissBehavior.this.f687b) != null) {
                aVar.mo702a(this.f696a);
            }
        }
    }

    /* renamed from: a */
    static float m656a(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    /* renamed from: a */
    static int m657a(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    /* renamed from: a */
    private void m658a(ViewGroup viewGroup) {
        if (this.f686a == null) {
            this.f686a = this.f690e ? C0525I.m2510a(viewGroup, this.f689d, this.f695j) : C0525I.m2511a(viewGroup, this.f695j);
        }
    }

    /* renamed from: b */
    static float m659b(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    /* renamed from: a */
    public boolean mo439a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f688c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f688c = coordinatorLayout.mo530a((View) v, (int) motionEvent.getX(), (int) motionEvent.getY());
            z = this.f688c;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f688c = false;
        }
        if (!z) {
            return false;
        }
        m658a((ViewGroup) coordinatorLayout);
        return this.f686a.mo2150b(motionEvent);
    }

    /* renamed from: a */
    public boolean mo700a(View view) {
        return true;
    }

    /* renamed from: b */
    public boolean mo444b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C0525I i = this.f686a;
        if (i == null) {
            return false;
        }
        i.mo2141a(motionEvent);
        return true;
    }
}
