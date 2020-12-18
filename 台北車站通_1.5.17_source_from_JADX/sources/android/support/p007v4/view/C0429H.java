package android.support.p007v4.view;

import android.animation.Animator;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v4.view.H */
public final class C0429H {

    /* renamed from: a */
    private WeakReference<View> f1654a;

    /* renamed from: b */
    Runnable f1655b = null;

    /* renamed from: c */
    Runnable f1656c = null;

    /* renamed from: d */
    int f1657d = -1;

    /* renamed from: android.support.v4.view.H$a */
    static class C0430a implements C0431I {

        /* renamed from: a */
        C0429H f1658a;

        /* renamed from: b */
        boolean f1659b;

        C0430a(C0429H h) {
            this.f1658a = h;
        }

        /* renamed from: a */
        public void mo1763a(View view) {
            Object tag = view.getTag(2113929216);
            C0431I i = tag instanceof C0431I ? (C0431I) tag : null;
            if (i != null) {
                i.mo1763a(view);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: android.support.v4.view.I} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo1764b(android.view.View r4) {
            /*
                r3 = this;
                android.support.v4.view.H r0 = r3.f1658a
                int r0 = r0.f1657d
                r1 = -1
                r2 = 0
                if (r0 <= r1) goto L_0x000f
                r4.setLayerType(r0, r2)
                android.support.v4.view.H r0 = r3.f1658a
                r0.f1657d = r1
            L_0x000f:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 16
                if (r0 >= r1) goto L_0x0019
                boolean r0 = r3.f1659b
                if (r0 != 0) goto L_0x0039
            L_0x0019:
                android.support.v4.view.H r0 = r3.f1658a
                java.lang.Runnable r1 = r0.f1656c
                if (r1 == 0) goto L_0x0024
                r0.f1656c = r2
                r1.run()
            L_0x0024:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r1 = r0 instanceof android.support.p007v4.view.C0431I
                if (r1 == 0) goto L_0x0031
                r2 = r0
                android.support.v4.view.I r2 = (android.support.p007v4.view.C0431I) r2
            L_0x0031:
                if (r2 == 0) goto L_0x0036
                r2.mo1764b(r4)
            L_0x0036:
                r4 = 1
                r3.f1659b = r4
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p007v4.view.C0429H.C0430a.mo1764b(android.view.View):void");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.support.v4.view.I} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo1765c(android.view.View r4) {
            /*
                r3 = this;
                r0 = 0
                r3.f1659b = r0
                android.support.v4.view.H r0 = r3.f1658a
                int r0 = r0.f1657d
                r1 = 0
                r2 = -1
                if (r0 <= r2) goto L_0x000f
                r0 = 2
                r4.setLayerType(r0, r1)
            L_0x000f:
                android.support.v4.view.H r0 = r3.f1658a
                java.lang.Runnable r2 = r0.f1655b
                if (r2 == 0) goto L_0x001a
                r0.f1655b = r1
                r2.run()
            L_0x001a:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r2 = r0 instanceof android.support.p007v4.view.C0431I
                if (r2 == 0) goto L_0x0027
                r1 = r0
                android.support.v4.view.I r1 = (android.support.p007v4.view.C0431I) r1
            L_0x0027:
                if (r1 == 0) goto L_0x002c
                r1.mo1765c(r4)
            L_0x002c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p007v4.view.C0429H.C0430a.mo1765c(android.view.View):void");
        }
    }

    C0429H(View view) {
        this.f1654a = new WeakReference<>(view);
    }

    /* renamed from: a */
    private void m1996a(View view, C0431I i) {
        if (i != null) {
            view.animate().setListener(new C0427F(this, i, view));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    /* renamed from: a */
    public C0429H mo1753a(float f) {
        View view = (View) this.f1654a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: a */
    public C0429H mo1754a(long j) {
        View view = (View) this.f1654a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: a */
    public C0429H mo1755a(C0431I i) {
        View view = (View) this.f1654a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT < 16) {
                view.setTag(2113929216, i);
                i = new C0430a(this);
            }
            m1996a(view, i);
        }
        return this;
    }

    /* renamed from: a */
    public C0429H mo1756a(C0433K k) {
        View view = (View) this.f1654a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            C0428G g = null;
            if (k != null) {
                g = new C0428G(this, k, view);
            }
            view.animate().setUpdateListener(g);
        }
        return this;
    }

    /* renamed from: a */
    public C0429H mo1757a(Interpolator interpolator) {
        View view = (View) this.f1654a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: a */
    public void mo1758a() {
        View view = (View) this.f1654a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: b */
    public long mo1759b() {
        View view = (View) this.f1654a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    /* renamed from: b */
    public C0429H mo1760b(float f) {
        View view = (View) this.f1654a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    /* renamed from: b */
    public C0429H mo1761b(long j) {
        View view = (View) this.f1654a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    /* renamed from: c */
    public void mo1762c() {
        View view = (View) this.f1654a.get();
        if (view != null) {
            view.animate().start();
        }
    }
}
