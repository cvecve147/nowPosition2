package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.p007v4.view.C0487v;
import android.support.transition.C0195M;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* renamed from: android.support.transition.p */
public class C0245p extends C0195M {

    /* renamed from: K */
    private static final String[] f1071K = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: L */
    private static final Property<Drawable, PointF> f1072L = new C0227g(PointF.class, "boundsOrigin");

    /* renamed from: M */
    private static final Property<C0246a, PointF> f1073M = new C0229h(PointF.class, "topLeft");

    /* renamed from: N */
    private static final Property<C0246a, PointF> f1074N = new C0231i(PointF.class, "bottomRight");

    /* renamed from: O */
    private static final Property<View, PointF> f1075O = new C0233j(PointF.class, "bottomRight");

    /* renamed from: P */
    private static final Property<View, PointF> f1076P = new C0235k(PointF.class, "topLeft");

    /* renamed from: Q */
    private static final Property<View, PointF> f1077Q = new C0237l(PointF.class, "position");

    /* renamed from: R */
    private static C0190H f1078R = new C0190H();

    /* renamed from: S */
    private int[] f1079S = new int[2];

    /* renamed from: T */
    private boolean f1080T = false;

    /* renamed from: U */
    private boolean f1081U = false;

    /* renamed from: android.support.transition.p$a */
    private static class C0246a {

        /* renamed from: a */
        private int f1082a;

        /* renamed from: b */
        private int f1083b;

        /* renamed from: c */
        private int f1084c;

        /* renamed from: d */
        private int f1085d;

        /* renamed from: e */
        private View f1086e;

        /* renamed from: f */
        private int f1087f;

        /* renamed from: g */
        private int f1088g;

        C0246a(View view) {
            this.f1086e = view;
        }

        /* renamed from: a */
        private void m1156a() {
            C0236ka.m1117a(this.f1086e, this.f1082a, this.f1083b, this.f1084c, this.f1085d);
            this.f1087f = 0;
            this.f1088g = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1094a(PointF pointF) {
            this.f1084c = Math.round(pointF.x);
            this.f1085d = Math.round(pointF.y);
            this.f1088g++;
            if (this.f1087f == this.f1088g) {
                m1156a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo1095b(PointF pointF) {
            this.f1082a = Math.round(pointF.x);
            this.f1083b = Math.round(pointF.y);
            this.f1087f++;
            if (this.f1087f == this.f1088g) {
                m1156a();
            }
        }
    }

    /* renamed from: a */
    private boolean m1150a(View view, View view2) {
        if (!this.f1081U) {
            return true;
        }
        C0208V a = mo976a(view, true);
        if (a == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == a.f1015b) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private void m1151d(C0208V v) {
        View view = v.f1015b;
        if (C0487v.m2309y(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            v.f1014a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            v.f1014a.put("android:changeBounds:parent", v.f1015b.getParent());
            if (this.f1081U) {
                v.f1015b.getLocationInWindow(this.f1079S);
                v.f1014a.put("android:changeBounds:windowX", Integer.valueOf(this.f1079S[0]));
                v.f1014a.put("android:changeBounds:windowY", Integer.valueOf(this.f1079S[1]));
            }
            if (this.f1080T) {
                v.f1014a.put("android:changeBounds:clip", C0487v.m2287d(view));
            }
        }
    }

    /* renamed from: a */
    public Animator mo972a(ViewGroup viewGroup, C0208V v, C0208V v2) {
        int i;
        View view;
        Animator animator;
        int i2;
        Rect rect;
        ObjectAnimator objectAnimator;
        Property<View, PointF> property;
        Path path;
        C0208V v3 = v;
        C0208V v4 = v2;
        if (v3 == null || v4 == null) {
            return null;
        }
        Map<String, Object> map = v3.f1014a;
        Map<String, Object> map2 = v4.f1014a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = v4.f1015b;
        if (m1150a(viewGroup2, viewGroup3)) {
            Rect rect2 = (Rect) v3.f1014a.get("android:changeBounds:bounds");
            Rect rect3 = (Rect) v4.f1014a.get("android:changeBounds:bounds");
            int i3 = rect2.left;
            int i4 = rect3.left;
            int i5 = rect2.top;
            int i6 = rect3.top;
            int i7 = rect2.right;
            int i8 = rect3.right;
            int i9 = rect2.bottom;
            int i10 = rect3.bottom;
            int i11 = i7 - i3;
            int i12 = i9 - i5;
            int i13 = i8 - i4;
            int i14 = i10 - i6;
            View view3 = view2;
            Rect rect4 = (Rect) v3.f1014a.get("android:changeBounds:clip");
            Rect rect5 = (Rect) v4.f1014a.get("android:changeBounds:clip");
            if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
                i = 0;
            } else {
                i = (i3 == i4 && i5 == i6) ? 0 : 1;
                if (!(i7 == i8 && i9 == i10)) {
                    i++;
                }
            }
            if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                i++;
            }
            if (i <= 0) {
                return null;
            }
            Rect rect6 = rect5;
            Rect rect7 = rect4;
            if (!this.f1080T) {
                view = view3;
                C0236ka.m1117a(view, i3, i5, i7, i9);
                if (i == 2) {
                    if (i11 == i13 && i12 == i14) {
                        path = mo1000h().mo945a((float) i3, (float) i5, (float) i4, (float) i6);
                        property = f1077Q;
                    } else {
                        C0246a aVar = new C0246a(view);
                        ObjectAnimator a = C0263w.m1202a(aVar, f1073M, mo1000h().mo945a((float) i3, (float) i5, (float) i4, (float) i6));
                        ObjectAnimator a2 = C0263w.m1202a(aVar, f1074N, mo1000h().mo945a((float) i7, (float) i9, (float) i8, (float) i10));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(new Animator[]{a, a2});
                        animatorSet.addListener(new C0239m(this, aVar));
                        animator = animatorSet;
                    }
                } else if (i3 == i4 && i5 == i6) {
                    path = mo1000h().mo945a((float) i7, (float) i9, (float) i8, (float) i10);
                    property = f1075O;
                } else {
                    path = mo1000h().mo945a((float) i3, (float) i5, (float) i4, (float) i6);
                    property = f1076P;
                }
                animator = C0263w.m1202a(view, property, path);
            } else {
                view = view3;
                C0236ka.m1117a(view, i3, i5, Math.max(i11, i13) + i3, Math.max(i12, i14) + i5);
                ObjectAnimator a3 = (i3 == i4 && i5 == i6) ? null : C0263w.m1202a(view, f1077Q, mo1000h().mo945a((float) i3, (float) i5, (float) i4, (float) i6));
                if (rect7 == null) {
                    i2 = 0;
                    rect = new Rect(0, 0, i11, i12);
                } else {
                    i2 = 0;
                    rect = rect7;
                }
                Rect rect8 = rect6 == null ? new Rect(i2, i2, i13, i14) : rect6;
                if (!rect.equals(rect8)) {
                    C0487v.m2272a(view, rect);
                    C0190H h = f1078R;
                    Object[] objArr = new Object[2];
                    objArr[i2] = rect;
                    objArr[1] = rect8;
                    objectAnimator = ObjectAnimator.ofObject(view, "clipBounds", h, objArr);
                    objectAnimator.addListener(new C0241n(this, view, rect6, i4, i6, i8, i10));
                } else {
                    objectAnimator = null;
                }
                animator = C0207U.m1050a(a3, objectAnimator);
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                C0214aa.m1066a(viewGroup4, true);
                mo974a((C0195M.C0198c) new C0243o(this, viewGroup4));
            }
            return animator;
        }
        int intValue = ((Integer) v3.f1014a.get("android:changeBounds:windowX")).intValue();
        int intValue2 = ((Integer) v3.f1014a.get("android:changeBounds:windowY")).intValue();
        int intValue3 = ((Integer) v4.f1014a.get("android:changeBounds:windowX")).intValue();
        int intValue4 = ((Integer) v4.f1014a.get("android:changeBounds:windowY")).intValue();
        if (intValue == intValue3 && intValue2 == intValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.f1079S);
        Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
        float c = C0236ka.m1121c(view2);
        C0236ka.m1115a(view2, 0.0f);
        C0236ka.m1119b(viewGroup).mo1029a(bitmapDrawable);
        C0183A h2 = mo1000h();
        int[] iArr = this.f1079S;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, new PropertyValuesHolder[]{C0185C.m926a(f1072L, h2.mo945a((float) (intValue - iArr[0]), (float) (intValue2 - iArr[1]), (float) (intValue3 - iArr[0]), (float) (intValue4 - iArr[1])))});
        ofPropertyValuesHolder.addListener(new C0224f(this, viewGroup, bitmapDrawable, view2, c));
        return ofPropertyValuesHolder;
    }

    /* renamed from: a */
    public void mo980a(C0208V v) {
        m1151d(v);
    }

    /* renamed from: c */
    public void mo991c(C0208V v) {
        m1151d(v);
    }

    /* renamed from: n */
    public String[] mo1006n() {
        return f1071K;
    }
}
