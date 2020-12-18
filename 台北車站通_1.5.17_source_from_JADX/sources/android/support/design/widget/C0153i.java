package android.support.design.widget;

import android.support.p007v4.widget.C0525I;
import android.view.View;
import java.lang.ref.WeakReference;
import p013b.p018b.p028h.p035d.C1052a;

/* renamed from: android.support.design.widget.i */
class C0153i extends C0525I.C0526a {

    /* renamed from: a */
    final /* synthetic */ BottomSheetBehavior f827a;

    C0153i(BottomSheetBehavior bottomSheetBehavior) {
        this.f827a = bottomSheetBehavior;
    }

    /* renamed from: a */
    public int mo660a(View view, int i, int i2) {
        return view.getLeft();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003a, code lost:
        if (java.lang.Math.abs(r6 - r4.f827a.f538e) < java.lang.Math.abs(r6 - r4.f827a.f539f)) goto L_0x0007;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0060  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo661a(android.view.View r5, float r6, float r7) {
        /*
            r4 = this;
            r6 = 0
            int r0 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            r1 = 4
            r2 = 3
            if (r0 >= 0) goto L_0x000d
        L_0x0007:
            android.support.design.widget.BottomSheetBehavior r6 = r4.f827a
            int r6 = r6.f538e
            r1 = r2
            goto L_0x0041
        L_0x000d:
            android.support.design.widget.BottomSheetBehavior r0 = r4.f827a
            boolean r3 = r0.f540g
            if (r3 == 0) goto L_0x001f
            boolean r0 = r0.mo441a(r5, r7)
            if (r0 == 0) goto L_0x001f
            android.support.design.widget.BottomSheetBehavior r6 = r4.f827a
            int r6 = r6.f547n
            r1 = 5
            goto L_0x0041
        L_0x001f:
            int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x003d
            int r6 = r5.getTop()
            android.support.design.widget.BottomSheetBehavior r7 = r4.f827a
            int r7 = r7.f538e
            int r7 = r6 - r7
            int r7 = java.lang.Math.abs(r7)
            android.support.design.widget.BottomSheetBehavior r0 = r4.f827a
            int r0 = r0.f539f
            int r6 = r6 - r0
            int r6 = java.lang.Math.abs(r6)
            if (r7 >= r6) goto L_0x003d
            goto L_0x0007
        L_0x003d:
            android.support.design.widget.BottomSheetBehavior r6 = r4.f827a
            int r6 = r6.f539f
        L_0x0041:
            android.support.design.widget.BottomSheetBehavior r7 = r4.f827a
            android.support.v4.widget.I r7 = r7.f543j
            int r0 = r5.getLeft()
            boolean r6 = r7.mo2158d(r0, r6)
            if (r6 == 0) goto L_0x0060
            android.support.design.widget.BottomSheetBehavior r6 = r4.f827a
            r7 = 2
            r6.mo446c(r7)
            android.support.design.widget.BottomSheetBehavior$b r6 = new android.support.design.widget.BottomSheetBehavior$b
            android.support.design.widget.BottomSheetBehavior r7 = r4.f827a
            r6.<init>(r5, r1)
            android.support.p007v4.view.C0487v.m2277a((android.view.View) r5, (java.lang.Runnable) r6)
            goto L_0x0065
        L_0x0060:
            android.support.design.widget.BottomSheetBehavior r5 = r4.f827a
            r5.mo446c(r1)
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.C0153i.mo661a(android.view.View, float, float):void");
    }

    /* renamed from: a */
    public void mo663a(View view, int i, int i2, int i3, int i4) {
        this.f827a.mo436a(i2);
    }

    /* renamed from: b */
    public int mo853b(View view) {
        BottomSheetBehavior bottomSheetBehavior = this.f827a;
        return (bottomSheetBehavior.f540g ? bottomSheetBehavior.f547n : bottomSheetBehavior.f539f) - bottomSheetBehavior.f538e;
    }

    /* renamed from: b */
    public int mo664b(View view, int i, int i2) {
        BottomSheetBehavior bottomSheetBehavior = this.f827a;
        return C1052a.m5544a(i, bottomSheetBehavior.f538e, bottomSheetBehavior.f540g ? bottomSheetBehavior.f547n : bottomSheetBehavior.f539f);
    }

    /* renamed from: b */
    public boolean mo665b(View view, int i) {
        View view2;
        BottomSheetBehavior bottomSheetBehavior = this.f827a;
        int i2 = bottomSheetBehavior.f542i;
        if (i2 == 1 || bottomSheetBehavior.f554u) {
            return false;
        }
        if (i2 == 3 && bottomSheetBehavior.f552s == i && (view2 = (View) bottomSheetBehavior.f549p.get()) != null && view2.canScrollVertically(-1)) {
            return false;
        }
        WeakReference<V> weakReference = this.f827a.f548o;
        return weakReference != null && weakReference.get() == view;
    }

    /* renamed from: c */
    public void mo666c(int i) {
        if (i == 1) {
            this.f827a.mo446c(1);
        }
    }
}
