package android.support.design.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.design.widget.CoordinatorLayout;
import android.support.p007v4.view.AbsSavedState;
import android.support.p007v4.view.C0434L;
import android.support.p007v4.view.C0482q;
import android.support.p007v4.view.C0487v;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p013b.p018b.p022d.C0955a;
import p013b.p018b.p022d.C0962h;
import p013b.p018b.p022d.C0963i;
import p013b.p018b.p028h.p035d.C1052a;
import p013b.p018b.p028h.p039h.C1095l;

@CoordinatorLayout.C0105c(Behavior.class)
public class AppBarLayout extends LinearLayout {

    /* renamed from: a */
    private int f512a;

    /* renamed from: b */
    private int f513b;

    /* renamed from: c */
    private int f514c;

    /* renamed from: d */
    private boolean f515d;

    /* renamed from: e */
    private int f516e;

    /* renamed from: f */
    private C0434L f517f;

    /* renamed from: g */
    private List<C0096b> f518g;

    /* renamed from: h */
    private boolean f519h;

    /* renamed from: i */
    private boolean f520i;

    /* renamed from: j */
    private int[] f521j;

    public static class Behavior extends C0174y<AppBarLayout> {
        /* access modifiers changed from: private */

        /* renamed from: k */
        public int f522k;

        /* renamed from: l */
        private ValueAnimator f523l;

        /* renamed from: m */
        private int f524m = -1;

        /* renamed from: n */
        private boolean f525n;

        /* renamed from: o */
        private float f526o;

        /* renamed from: p */
        private WeakReference<View> f527p;

        /* renamed from: q */
        private C0094a f528q;

        protected static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new C0148d();

            /* renamed from: a */
            int f529a;

            /* renamed from: b */
            float f530b;

            /* renamed from: c */
            boolean f531c;

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f529a = parcel.readInt();
                this.f530b = parcel.readFloat();
                this.f531c = parcel.readByte() != 0;
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }

            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.f529a);
                parcel.writeFloat(this.f530b);
                parcel.writeByte(this.f531c ? (byte) 1 : 0);
            }
        }

        /* renamed from: android.support.design.widget.AppBarLayout$Behavior$a */
        public static abstract class C0094a {
            /* renamed from: a */
            public abstract boolean mo421a(AppBarLayout appBarLayout);
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        private static View m415a(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: a */
        private void m416a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, float f) {
            int abs = Math.abs(mo415c() - i);
            float abs2 = Math.abs(f);
            m417a(coordinatorLayout, appBarLayout, i, abs2 > 0.0f ? Math.round((((float) abs) / abs2) * 1000.0f) * 3 : (int) (((((float) abs) / ((float) appBarLayout.getHeight())) + 1.0f) * 150.0f));
        }

        /* renamed from: a */
        private void m417a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2) {
            int c = mo415c();
            if (c == i) {
                ValueAnimator valueAnimator = this.f523l;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f523l.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f523l;
            if (valueAnimator2 == null) {
                this.f523l = new ValueAnimator();
                this.f523l.setInterpolator(C0145a.f820e);
                this.f523l.addUpdateListener(new C0147c(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f523l.setDuration((long) Math.min(i2, 600));
            this.f523l.setIntValues(new int[]{c, i});
            this.f523l.start();
        }

        /* renamed from: a */
        private void m418a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
            View a = m415a(appBarLayout, i);
            if (a != null) {
                int a2 = ((C0095a) a.getLayoutParams()).mo428a();
                boolean z2 = false;
                if ((a2 & 1) != 0) {
                    int j = C0487v.m2294j(a);
                    if (i2 <= 0 || (a2 & 12) == 0 ? !((a2 & 2) == 0 || (-i) < (a.getBottom() - j) - appBarLayout.getTopInset()) : (-i) >= (a.getBottom() - j) - appBarLayout.getTopInset()) {
                        z2 = true;
                    }
                }
                boolean a3 = appBarLayout.mo369a(z2);
                if (Build.VERSION.SDK_INT < 11) {
                    return;
                }
                if (z || (a3 && m422c(coordinatorLayout, appBarLayout))) {
                    appBarLayout.jumpDrawablesToCurrentState();
                }
            }
        }

        /* renamed from: a */
        private static boolean m419a(int i, int i2) {
            return (i & i2) == i2;
        }

        /* renamed from: b */
        private int m420b(AppBarLayout appBarLayout, int i) {
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                int i3 = -i;
                if (childAt.getTop() <= i3 && childAt.getBottom() >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        /* renamed from: c */
        private int m421c(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = appBarLayout.getChildAt(i3);
                C0095a aVar = (C0095a) childAt.getLayoutParams();
                Interpolator b = aVar.mo429b();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i3++;
                } else if (b != null) {
                    int a = aVar.mo428a();
                    if ((a & 1) != 0) {
                        i2 = 0 + childAt.getHeight() + aVar.topMargin + aVar.bottomMargin;
                        if ((a & 2) != 0) {
                            i2 -= C0487v.m2294j(childAt);
                        }
                    }
                    if (C0487v.m2291g(childAt)) {
                        i2 -= appBarLayout.getTopInset();
                    }
                    if (i2 > 0) {
                        float f = (float) i2;
                        return Integer.signum(i) * (childAt.getTop() + Math.round(f * b.getInterpolation(((float) (abs - childAt.getTop())) / f)));
                    }
                }
            }
            return i;
        }

        /* renamed from: c */
        private boolean m422c(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            List<View> c = coordinatorLayout.mo538c((View) appBarLayout);
            int size = c.size();
            for (int i = 0; i < size; i++) {
                CoordinatorLayout.C0104b d = ((CoordinatorLayout.C0107e) c.get(i).getLayoutParams()).mo608d();
                if (d instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) d).mo929c() != 0;
                }
            }
            return false;
        }

        /* renamed from: d */
        private void m423d(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int c = mo415c();
            int b = m420b(appBarLayout, c);
            if (b >= 0) {
                View childAt = appBarLayout.getChildAt(b);
                int a = ((C0095a) childAt.getLayoutParams()).mo428a();
                if ((a & 17) == 17) {
                    int i = -childAt.getTop();
                    int i2 = -childAt.getBottom();
                    if (b == appBarLayout.getChildCount() - 1) {
                        i2 += appBarLayout.getTopInset();
                    }
                    if (m419a(a, 2)) {
                        i2 += C0487v.m2294j(childAt);
                    } else if (m419a(a, 5)) {
                        int j = C0487v.m2294j(childAt) + i2;
                        if (c < j) {
                            i = j;
                        } else {
                            i2 = j;
                        }
                    }
                    if (c < (i2 + i) / 2) {
                        i = i2;
                    }
                    m416a(coordinatorLayout, appBarLayout, C1052a.m5544a(i, -appBarLayout.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo411b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3) {
            int c = mo415c();
            int i4 = 0;
            if (i2 == 0 || c < i2 || c > i3) {
                this.f522k = 0;
            } else {
                int a = C1052a.m5544a(i, i2, i3);
                if (c != a) {
                    int c2 = appBarLayout.mo368a() ? m421c(appBarLayout, a) : a;
                    boolean a2 = mo401a(c2);
                    i4 = c - a;
                    this.f522k = a - c2;
                    if (!a2 && appBarLayout.mo368a()) {
                        coordinatorLayout.mo522a((View) appBarLayout);
                    }
                    appBarLayout.mo365a(mo409b());
                    m418a(coordinatorLayout, appBarLayout, a, a < c ? -1 : 1, false);
                }
            }
            return i4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo419e(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            m423d(coordinatorLayout, appBarLayout);
        }

        /* renamed from: a */
        public void mo397a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                SavedState savedState = (SavedState) parcelable;
                super.mo397a(coordinatorLayout, appBarLayout, savedState.mo1736a());
                this.f524m = savedState.f529a;
                this.f526o = savedState.f530b;
                this.f525n = savedState.f531c;
                return;
            }
            super.mo397a(coordinatorLayout, appBarLayout, parcelable);
            this.f524m = -1;
        }

        /* renamed from: a */
        public void mo398a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            if (i == 0) {
                m423d(coordinatorLayout, appBarLayout);
            }
            this.f527p = new WeakReference<>(view);
        }

        /* renamed from: a */
        public void mo399a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5) {
            if (i4 < 0) {
                mo923a(coordinatorLayout, appBarLayout, i4, -appBarLayout.getDownNestedScrollRange(), 0);
            }
        }

        /* renamed from: a */
        public void mo400a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    i5 = -appBarLayout.getTotalScrollRange();
                    i4 = appBarLayout.getDownNestedPreScrollRange() + i5;
                } else {
                    i5 = -appBarLayout.getUpNestedPreScrollRange();
                    i4 = 0;
                }
                int i6 = i5;
                int i7 = i4;
                if (i6 != i7) {
                    iArr[1] = mo923a(coordinatorLayout, appBarLayout, i2, i6, i7);
                }
            }
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo401a(int i) {
            return super.mo401a(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo408a(AppBarLayout appBarLayout) {
            C0094a aVar = this.f528q;
            if (aVar != null) {
                return aVar.mo421a(appBarLayout);
            }
            WeakReference<View> weakReference = this.f527p;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            return view != null && view.isShown() && !view.canScrollVertically(-1);
        }

        /* renamed from: a */
        public boolean mo406a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            boolean a = super.mo406a(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            int i2 = this.f524m;
            if (i2 >= 0 && (pendingAction & 8) == 0) {
                View childAt = appBarLayout.getChildAt(i2);
                mo925c(coordinatorLayout, appBarLayout, (-childAt.getBottom()) + (this.f525n ? C0487v.m2294j(childAt) + appBarLayout.getTopInset() : Math.round(((float) childAt.getHeight()) * this.f526o)));
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i3 = -appBarLayout.getUpNestedPreScrollRange();
                    if (z) {
                        m416a(coordinatorLayout, appBarLayout, i3, 0.0f);
                    } else {
                        mo925c(coordinatorLayout, appBarLayout, i3);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        m416a(coordinatorLayout, appBarLayout, 0, 0.0f);
                    } else {
                        mo925c(coordinatorLayout, appBarLayout, 0);
                    }
                }
            }
            appBarLayout.mo372c();
            this.f524m = -1;
            mo401a(C1052a.m5544a(mo409b(), -appBarLayout.getTotalScrollRange(), 0));
            m418a(coordinatorLayout, appBarLayout, mo409b(), 0, true);
            appBarLayout.mo365a(mo409b());
            return a;
        }

        /* renamed from: a */
        public boolean mo407a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            if (((CoordinatorLayout.C0107e) appBarLayout.getLayoutParams()).height != -2) {
                return super.mo407a(coordinatorLayout, appBarLayout, i, i2, i3, i4);
            }
            coordinatorLayout.mo524a((View) appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        /* renamed from: a */
        public boolean mo414b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            boolean z = (i & 2) != 0 && appBarLayout.mo371b() && coordinatorLayout.getHeight() - view.getHeight() <= appBarLayout.getHeight();
            if (z && (valueAnimator = this.f523l) != null) {
                valueAnimator.cancel();
            }
            this.f527p = null;
            return z;
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ int mo409b() {
            return super.mo409b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo412b(AppBarLayout appBarLayout) {
            return -appBarLayout.getDownNestedScrollRange();
        }

        /* renamed from: b */
        public Parcelable mo418d(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            Parcelable d = super.mo418d(coordinatorLayout, appBarLayout);
            int b = mo409b();
            int childCount = appBarLayout.getChildCount();
            boolean z = false;
            int i = 0;
            while (i < childCount) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + b;
                if (childAt.getTop() + b > 0 || bottom < 0) {
                    i++;
                } else {
                    SavedState savedState = new SavedState(d);
                    savedState.f529a = i;
                    if (bottom == C0487v.m2294j(childAt) + appBarLayout.getTopInset()) {
                        z = true;
                    }
                    savedState.f531c = z;
                    savedState.f530b = ((float) bottom) / ((float) childAt.getHeight());
                    return savedState;
                }
            }
            return d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo415c() {
            return mo409b() + this.f522k;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo417c(AppBarLayout appBarLayout) {
            return appBarLayout.getTotalScrollRange();
        }
    }

    public static class ScrollingViewBehavior extends C0176z {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0963i.ScrollingViewBehavior_Layout);
            mo928b(obtainStyledAttributes.getDimensionPixelSize(C0963i.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        private static int m454a(AppBarLayout appBarLayout) {
            CoordinatorLayout.C0104b d = ((CoordinatorLayout.C0107e) appBarLayout.getLayoutParams()).mo608d();
            if (d instanceof Behavior) {
                return ((Behavior) d).mo415c();
            }
            return 0;
        }

        /* renamed from: e */
        private void m455e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            CoordinatorLayout.C0104b d = ((CoordinatorLayout.C0107e) view2.getLayoutParams()).mo608d();
            if (d instanceof Behavior) {
                C0487v.m2283b(view, (((view2.getBottom() - view.getTop()) + ((Behavior) d).f522k) + mo930d()) - mo927a(view2));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public AppBarLayout m457a(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo406a(CoordinatorLayout coordinatorLayout, View view, int i) {
            return super.mo406a(coordinatorLayout, view, i);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo407a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.mo407a(coordinatorLayout, view, i, i2, i3, i4);
        }

        /* renamed from: a */
        public boolean mo423a(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout a = m457a(coordinatorLayout.mo533b(view));
            if (a != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f927d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    a.mo367a(false, !z);
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public boolean mo424a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public float mo425b(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int a = m454a(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + a > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (((float) a) / ((float) i)) + 1.0f;
                }
            }
            return 0.0f;
        }

        /* renamed from: b */
        public boolean mo426b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            m455e(coordinatorLayout, view, view2);
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo427c(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.mo427c(view);
        }
    }

    /* renamed from: android.support.design.widget.AppBarLayout$a */
    public static class C0095a extends LinearLayout.LayoutParams {

        /* renamed from: a */
        int f532a = 1;

        /* renamed from: b */
        Interpolator f533b;

        public C0095a(int i, int i2) {
            super(i, i2);
        }

        public C0095a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0963i.AppBarLayout_Layout);
            this.f532a = obtainStyledAttributes.getInt(C0963i.AppBarLayout_Layout_layout_scrollFlags, 0);
            if (obtainStyledAttributes.hasValue(C0963i.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.f533b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(C0963i.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public C0095a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0095a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0095a(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* renamed from: a */
        public int mo428a() {
            return this.f532a;
        }

        /* renamed from: b */
        public Interpolator mo429b() {
            return this.f533b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo430c() {
            int i = this.f532a;
            return (i & 1) == 1 && (i & 10) != 0;
        }
    }

    /* renamed from: android.support.design.widget.AppBarLayout$b */
    public interface C0096b {
        /* renamed from: a */
        void mo431a(AppBarLayout appBarLayout, int i);
    }

    public AppBarLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f512a = -1;
        this.f513b = -1;
        this.f514c = -1;
        this.f516e = 0;
        setOrientation(1);
        C0128S.m655a(context);
        if (Build.VERSION.SDK_INT >= 21) {
            C0143W.m777a(this);
            C0143W.m779a(this, attributeSet, 0, C0962h.Widget_Design_AppBarLayout);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0963i.AppBarLayout, 0, C0962h.Widget_Design_AppBarLayout);
        C0487v.m2273a((View) this, obtainStyledAttributes.getDrawable(C0963i.AppBarLayout_android_background));
        if (obtainStyledAttributes.hasValue(C0963i.AppBarLayout_expanded)) {
            m401a(obtainStyledAttributes.getBoolean(C0963i.AppBarLayout_expanded, false), false, false);
        }
        if (Build.VERSION.SDK_INT >= 21 && obtainStyledAttributes.hasValue(C0963i.AppBarLayout_elevation)) {
            C0143W.m778a(this, (float) obtainStyledAttributes.getDimensionPixelSize(C0963i.AppBarLayout_elevation, 0));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (obtainStyledAttributes.hasValue(C0963i.AppBarLayout_android_keyboardNavigationCluster)) {
                setKeyboardNavigationCluster(obtainStyledAttributes.getBoolean(C0963i.AppBarLayout_android_keyboardNavigationCluster, false));
            }
            if (obtainStyledAttributes.hasValue(C0963i.AppBarLayout_android_touchscreenBlocksFocus)) {
                setTouchscreenBlocksFocus(obtainStyledAttributes.getBoolean(C0963i.AppBarLayout_android_touchscreenBlocksFocus, false));
            }
        }
        obtainStyledAttributes.recycle();
        C0487v.m2275a((View) this, (C0482q) new C0146b(this));
    }

    /* renamed from: a */
    private void m401a(boolean z, boolean z2, boolean z3) {
        int i = 0;
        int i2 = (z ? 1 : 2) | (z2 ? 4 : 0);
        if (z3) {
            i = 8;
        }
        this.f516e = i2 | i;
        requestLayout();
    }

    /* renamed from: b */
    private boolean m402b(boolean z) {
        if (this.f519h == z) {
            return false;
        }
        this.f519h = z;
        refreshDrawableState();
        return true;
    }

    /* renamed from: d */
    private void m403d() {
        this.f512a = -1;
        this.f513b = -1;
        this.f514c = -1;
    }

    /* renamed from: e */
    private void m404e() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (((C0095a) getChildAt(i).getLayoutParams()).mo430c()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        m402b(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0434L mo364a(C0434L l) {
        C0434L l2 = C0487v.m2291g(this) ? l : null;
        if (!C1095l.m5678a(this.f517f, l2)) {
            this.f517f = l2;
            m403d();
        }
        return l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo365a(int i) {
        List<C0096b> list = this.f518g;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0096b bVar = this.f518g.get(i2);
                if (bVar != null) {
                    bVar.mo431a(this, i);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo366a(C0096b bVar) {
        if (this.f518g == null) {
            this.f518g = new ArrayList();
        }
        if (bVar != null && !this.f518g.contains(bVar)) {
            this.f518g.add(bVar);
        }
    }

    /* renamed from: a */
    public void mo367a(boolean z, boolean z2) {
        m401a(z, z2, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo368a() {
        return this.f515d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo369a(boolean z) {
        if (this.f520i == z) {
            return false;
        }
        this.f520i = z;
        refreshDrawableState();
        return true;
    }

    /* renamed from: b */
    public void mo370b(C0096b bVar) {
        List<C0096b> list = this.f518g;
        if (list != null && bVar != null) {
            list.remove(bVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo371b() {
        return getTotalScrollRange() != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo372c() {
        this.f516e = 0;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0095a;
    }

    /* access modifiers changed from: protected */
    public C0095a generateDefaultLayoutParams() {
        return new C0095a(-1, -2);
    }

    public C0095a generateLayoutParams(AttributeSet attributeSet) {
        return new C0095a(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0095a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (Build.VERSION.SDK_INT < 19 || !(layoutParams instanceof LinearLayout.LayoutParams)) ? layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0095a((ViewGroup.MarginLayoutParams) layoutParams) : new C0095a(layoutParams) : new C0095a((LinearLayout.LayoutParams) layoutParams);
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedPreScrollRange() {
        int i = this.f513b;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            C0095a aVar = (C0095a) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = aVar.f532a;
            if ((i3 & 5) == 5) {
                int i4 = i2 + aVar.topMargin + aVar.bottomMargin;
                if ((i3 & 8) != 0) {
                    i2 = i4 + C0487v.m2294j(childAt);
                } else {
                    i2 = i4 + (measuredHeight - ((i3 & 2) != 0 ? C0487v.m2294j(childAt) : getTopInset()));
                }
            } else if (i2 > 0) {
                break;
            }
        }
        int max = Math.max(0, i2);
        this.f513b = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedScrollRange() {
        int i = this.f514c;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C0095a aVar = (C0095a) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + aVar.topMargin + aVar.bottomMargin;
            int i4 = aVar.f532a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                i3 -= C0487v.m2294j(childAt) + getTopInset();
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f514c = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int j = C0487v.m2294j(this);
        if (j == 0) {
            int childCount = getChildCount();
            j = childCount >= 1 ? C0487v.m2294j(getChildAt(childCount - 1)) : 0;
            if (j == 0) {
                return getHeight() / 3;
            }
        }
        return (j * 2) + topInset;
    }

    /* access modifiers changed from: package-private */
    public int getPendingAction() {
        return this.f516e;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    public final int getTopInset() {
        C0434L l = this.f517f;
        if (l != null) {
            return l.mo1772e();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f512a;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C0095a aVar = (C0095a) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = aVar.f532a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight + aVar.topMargin + aVar.bottomMargin;
            if ((i4 & 2) != 0) {
                i3 -= C0487v.m2294j(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3 - getTopInset());
        this.f512a = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        if (this.f521j == null) {
            this.f521j = new int[2];
        }
        int[] iArr = this.f521j;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        iArr[0] = this.f519h ? C0955a.state_collapsible : -C0955a.state_collapsible;
        iArr[1] = (!this.f519h || !this.f520i) ? -C0955a.state_collapsed : C0955a.state_collapsed;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m403d();
        int i5 = 0;
        this.f515d = false;
        int childCount = getChildCount();
        while (true) {
            if (i5 >= childCount) {
                break;
            } else if (((C0095a) getChildAt(i5).getLayoutParams()).mo429b() != null) {
                this.f515d = true;
                break;
            } else {
                i5++;
            }
        }
        m404e();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m403d();
    }

    public void setExpanded(boolean z) {
        mo367a(z, C0487v.m2309y(this));
    }

    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    @Deprecated
    public void setTargetElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0143W.m778a(this, f);
        }
    }
}
