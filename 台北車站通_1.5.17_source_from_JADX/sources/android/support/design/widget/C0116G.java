package android.support.design.widget;

import android.support.design.widget.SwipeDismissBehavior;
import android.support.p007v4.view.C0487v;
import android.support.p007v4.widget.C0525I;
import android.view.View;
import android.view.ViewParent;

/* renamed from: android.support.design.widget.G */
class C0116G extends C0525I.C0526a {

    /* renamed from: a */
    private int f657a;

    /* renamed from: b */
    private int f658b = -1;

    /* renamed from: c */
    final /* synthetic */ SwipeDismissBehavior f659c;

    C0116G(SwipeDismissBehavior swipeDismissBehavior) {
        this.f659c = swipeDismissBehavior;
    }

    /* renamed from: a */
    private boolean m640a(View view, float f) {
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (i != 0) {
            boolean z = C0487v.m2293i(view) == 1;
            int i2 = this.f659c.f691f;
            if (i2 == 2) {
                return true;
            }
            if (i2 == 0) {
                if (z) {
                    if (f >= 0.0f) {
                        return false;
                    }
                } else if (i <= 0) {
                    return false;
                }
                return true;
            } else if (i2 != 1) {
                return false;
            } else {
                if (z) {
                    if (i <= 0) {
                        return false;
                    }
                } else if (f >= 0.0f) {
                    return false;
                }
                return true;
            }
        } else {
            return Math.abs(view.getLeft() - this.f657a) >= Math.round(((float) view.getWidth()) * this.f659c.f692g);
        }
    }

    /* renamed from: a */
    public int mo659a(View view) {
        return view.getWidth();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        if (r5 != false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        if (r5 != false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        r5 = r2.f657a;
        r3 = r3.getWidth() + r5;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo660a(android.view.View r3, int r4, int r5) {
        /*
            r2 = this;
            int r5 = android.support.p007v4.view.C0487v.m2293i(r3)
            r0 = 1
            if (r5 != r0) goto L_0x0009
            r5 = r0
            goto L_0x000a
        L_0x0009:
            r5 = 0
        L_0x000a:
            android.support.design.widget.SwipeDismissBehavior r1 = r2.f659c
            int r1 = r1.f691f
            if (r1 != 0) goto L_0x0024
            if (r5 == 0) goto L_0x001c
        L_0x0012:
            int r5 = r2.f657a
            int r3 = r3.getWidth()
            int r5 = r5 - r3
            int r3 = r2.f657a
            goto L_0x0037
        L_0x001c:
            int r5 = r2.f657a
            int r3 = r3.getWidth()
            int r3 = r3 + r5
            goto L_0x0037
        L_0x0024:
            if (r1 != r0) goto L_0x0029
            if (r5 == 0) goto L_0x0012
            goto L_0x001c
        L_0x0029:
            int r5 = r2.f657a
            int r0 = r3.getWidth()
            int r5 = r5 - r0
            int r0 = r2.f657a
            int r3 = r3.getWidth()
            int r3 = r3 + r0
        L_0x0037:
            int r3 = android.support.design.widget.SwipeDismissBehavior.m657a((int) r5, (int) r4, (int) r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.C0116G.mo660a(android.view.View, int, int):int");
    }

    /* renamed from: a */
    public void mo661a(View view, float f, float f2) {
        boolean z;
        int i;
        SwipeDismissBehavior.C0129a aVar;
        this.f658b = -1;
        int width = view.getWidth();
        if (m640a(view, f)) {
            int left = view.getLeft();
            int i2 = this.f657a;
            i = left < i2 ? i2 - width : i2 + width;
            z = true;
        } else {
            i = this.f657a;
            z = false;
        }
        if (this.f659c.f686a.mo2158d(i, view.getTop())) {
            C0487v.m2277a(view, (Runnable) new SwipeDismissBehavior.C0130b(view, z));
        } else if (z && (aVar = this.f659c.f687b) != null) {
            aVar.mo702a(view);
        }
    }

    /* renamed from: a */
    public void mo662a(View view, int i) {
        this.f658b = i;
        this.f657a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    /* renamed from: a */
    public void mo663a(View view, int i, int i2, int i3, int i4) {
        float width = ((float) this.f657a) + (((float) view.getWidth()) * this.f659c.f693h);
        float width2 = ((float) this.f657a) + (((float) view.getWidth()) * this.f659c.f694i);
        float f = (float) i;
        if (f <= width) {
            view.setAlpha(1.0f);
        } else if (f >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(SwipeDismissBehavior.m656a(0.0f, 1.0f - SwipeDismissBehavior.m659b(width, width2, f), 1.0f));
        }
    }

    /* renamed from: b */
    public int mo664b(View view, int i, int i2) {
        return view.getTop();
    }

    /* renamed from: b */
    public boolean mo665b(View view, int i) {
        return this.f658b == -1 && this.f659c.mo700a(view);
    }

    /* renamed from: c */
    public void mo666c(int i) {
        SwipeDismissBehavior.C0129a aVar = this.f659c.f687b;
        if (aVar != null) {
            aVar.mo701a(i);
        }
    }
}
