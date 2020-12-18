package android.support.transition;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p007v4.view.C0487v;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: android.support.transition.fa */
class C0225fa implements C0230ha {

    /* renamed from: a */
    protected C0226a f1037a;

    /* renamed from: android.support.transition.fa$a */
    static class C0226a extends ViewGroup {

        /* renamed from: a */
        static Method f1038a;

        /* renamed from: b */
        ViewGroup f1039b;

        /* renamed from: c */
        View f1040c;

        /* renamed from: d */
        ArrayList<Drawable> f1041d = null;

        /* renamed from: e */
        C0225fa f1042e;

        static {
            Class<ViewGroup> cls = ViewGroup.class;
            try {
                f1038a = cls.getDeclaredMethod("invalidateChildInParentFast", new Class[]{Integer.TYPE, Integer.TYPE, Rect.class});
            } catch (NoSuchMethodException unused) {
            }
        }

        C0226a(Context context, ViewGroup viewGroup, View view, C0225fa faVar) {
            super(context);
            this.f1039b = viewGroup;
            this.f1040c = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f1042e = faVar;
        }

        /* renamed from: a */
        private void m1089a(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f1039b.getLocationOnScreen(iArr2);
            this.f1040c.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        /* renamed from: a */
        public void mo1040a(Drawable drawable) {
            if (this.f1041d == null) {
                this.f1041d = new ArrayList<>();
            }
            if (!this.f1041d.contains(drawable)) {
                this.f1041d.add(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(this);
            }
        }

        /* renamed from: a */
        public void mo1041a(View view) {
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (!(viewGroup == this.f1039b || viewGroup.getParent() == null || !C0487v.m2308x(viewGroup))) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f1039b.getLocationOnScreen(iArr2);
                    C0487v.m2267a(view, iArr[0] - iArr2[0]);
                    C0487v.m2283b(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view, getChildCount() - 1);
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r1.f1041d;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo1042a() {
            /*
                r1 = this;
                int r0 = r1.getChildCount()
                if (r0 != 0) goto L_0x0012
                java.util.ArrayList<android.graphics.drawable.Drawable> r0 = r1.f1041d
                if (r0 == 0) goto L_0x0010
                int r0 = r0.size()
                if (r0 != 0) goto L_0x0012
            L_0x0010:
                r0 = 1
                goto L_0x0013
            L_0x0012:
                r0 = 0
            L_0x0013:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.transition.C0225fa.C0226a.mo1042a():boolean");
        }

        /* renamed from: b */
        public void mo1043b(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f1041d;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback((Drawable.Callback) null);
            }
        }

        /* renamed from: b */
        public void mo1044b(View view) {
            super.removeView(view);
            if (mo1042a()) {
                this.f1039b.removeView(this);
            }
        }

        /* access modifiers changed from: protected */
        public void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f1039b.getLocationOnScreen(iArr);
            this.f1040c.getLocationOnScreen(iArr2);
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.f1040c.getWidth(), this.f1040c.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f1041d;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f1041d.get(i).draw(canvas);
            }
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f1039b == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (this.f1039b instanceof ViewGroup) {
                iArr[0] = 0;
                iArr[1] = 0;
                int[] iArr2 = new int[2];
                m1089a(iArr2);
                rect.offset(iArr2[0], iArr2[1]);
                return super.invalidateChildInParent(iArr, rect);
            }
            invalidate(rect);
            return null;
        }

        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r1.f1041d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
            /*
                r1 = this;
                boolean r0 = super.verifyDrawable(r2)
                if (r0 != 0) goto L_0x0013
                java.util.ArrayList<android.graphics.drawable.Drawable> r0 = r1.f1041d
                if (r0 == 0) goto L_0x0011
                boolean r2 = r0.contains(r2)
                if (r2 == 0) goto L_0x0011
                goto L_0x0013
            L_0x0011:
                r2 = 0
                goto L_0x0014
            L_0x0013:
                r2 = 1
            L_0x0014:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.transition.C0225fa.C0226a.verifyDrawable(android.graphics.drawable.Drawable):boolean");
        }
    }

    C0225fa(Context context, ViewGroup viewGroup, View view) {
        this.f1037a = new C0226a(context, viewGroup, view, this);
    }

    /* renamed from: c */
    static C0225fa m1085c(View view) {
        ViewGroup d = m1086d(view);
        if (d == null) {
            return null;
        }
        int childCount = d.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = d.getChildAt(i);
            if (childAt instanceof C0226a) {
                return ((C0226a) childAt).f1042e;
            }
        }
        return new C0210X(d.getContext(), d, view);
    }

    /* renamed from: d */
    static ViewGroup m1086d(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo1029a(Drawable drawable) {
        this.f1037a.mo1040a(drawable);
    }

    /* renamed from: b */
    public void mo1030b(Drawable drawable) {
        this.f1037a.mo1043b(drawable);
    }
}
