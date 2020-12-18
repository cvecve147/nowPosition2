package android.support.p007v4.view;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Display;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: android.support.v4.view.v */
public class C0487v {

    /* renamed from: a */
    static final C0497j f1805a;

    /* renamed from: android.support.v4.view.v$a */
    static class C0488a extends C0497j {
        C0488a() {
        }

        /* renamed from: t */
        public boolean mo1995t(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* renamed from: android.support.v4.view.v$b */
    static class C0489b extends C0488a {
        C0489b() {
        }

        /* renamed from: A */
        public void mo1996A(View view) {
            view.postInvalidateOnAnimation();
        }

        /* renamed from: B */
        public void mo1997B(View view) {
            view.requestFitSystemWindows();
        }

        /* renamed from: a */
        public void mo1998a(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        /* renamed from: a */
        public void mo1999a(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        /* renamed from: a */
        public void mo2000a(View view, Runnable runnable, long j) {
            view.postOnAnimationDelayed(runnable, j);
        }

        /* renamed from: a */
        public void mo2001a(View view, boolean z) {
            view.setHasTransientState(z);
        }

        /* renamed from: d */
        public void mo2002d(View view, int i) {
            if (i == 4) {
                i = 2;
            }
            view.setImportantForAccessibility(i);
        }

        /* renamed from: g */
        public boolean mo2003g(View view) {
            return view.getFitsSystemWindows();
        }

        /* renamed from: h */
        public int mo2004h(View view) {
            return view.getImportantForAccessibility();
        }

        /* renamed from: j */
        public int mo2005j(View view) {
            return view.getMinimumHeight();
        }

        /* renamed from: k */
        public int mo2006k(View view) {
            return view.getMinimumWidth();
        }

        /* renamed from: n */
        public ViewParent mo2007n(View view) {
            return view.getParentForAccessibility();
        }

        /* renamed from: u */
        public boolean mo2008u(View view) {
            return view.hasOverlappingRendering();
        }

        /* renamed from: v */
        public boolean mo2009v(View view) {
            return view.hasTransientState();
        }
    }

    /* renamed from: android.support.v4.view.v$c */
    static class C0490c extends C0489b {
        C0490c() {
        }

        /* renamed from: a */
        public void mo2010a(View view, int i, int i2, int i3, int i4) {
            view.setPaddingRelative(i, i2, i3, i4);
        }

        /* renamed from: e */
        public Display mo2011e(View view) {
            return view.getDisplay();
        }

        /* renamed from: i */
        public int mo2012i(View view) {
            return view.getLayoutDirection();
        }

        /* renamed from: l */
        public int mo2013l(View view) {
            return view.getPaddingEnd();
        }

        /* renamed from: m */
        public int mo2014m(View view) {
            return view.getPaddingStart();
        }

        /* renamed from: q */
        public int mo2015q(View view) {
            return view.getWindowSystemUiVisibility();
        }

        /* renamed from: z */
        public boolean mo2016z(View view) {
            return view.isPaddingRelative();
        }
    }

    /* renamed from: android.support.v4.view.v$d */
    static class C0491d extends C0490c {
        C0491d() {
        }

        /* renamed from: a */
        public void mo2017a(View view, Rect rect) {
            view.setClipBounds(rect);
        }

        /* renamed from: d */
        public Rect mo2018d(View view) {
            return view.getClipBounds();
        }
    }

    /* renamed from: android.support.v4.view.v$e */
    static class C0492e extends C0491d {
        C0492e() {
        }

        /* renamed from: c */
        public void mo2019c(View view, int i) {
            view.setAccessibilityLiveRegion(i);
        }

        /* renamed from: d */
        public void mo2002d(View view, int i) {
            view.setImportantForAccessibility(i);
        }

        /* renamed from: w */
        public boolean mo2020w(View view) {
            return view.isAttachedToWindow();
        }

        /* renamed from: x */
        public boolean mo2021x(View view) {
            return view.isLaidOut();
        }
    }

    /* renamed from: android.support.v4.view.v$f */
    static class C0493f extends C0492e {

        /* renamed from: j */
        private static ThreadLocal<Rect> f1806j;

        C0493f() {
        }

        /* renamed from: b */
        private static Rect m2339b() {
            if (f1806j == null) {
                f1806j = new ThreadLocal<>();
            }
            Rect rect = f1806j.get();
            if (rect == null) {
                rect = new Rect();
                f1806j.set(rect);
            }
            rect.setEmpty();
            return rect;
        }

        /* renamed from: B */
        public void mo1997B(View view) {
            view.requestApplyInsets();
        }

        /* renamed from: C */
        public void mo2022C(View view) {
            view.stopNestedScroll();
        }

        /* renamed from: a */
        public C0434L mo2023a(View view, C0434L l) {
            WindowInsets windowInsets = (WindowInsets) C0434L.m2017a(l);
            WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(windowInsets);
            if (dispatchApplyWindowInsets != windowInsets) {
                windowInsets = new WindowInsets(dispatchApplyWindowInsets);
            }
            return C0434L.m2016a((Object) windowInsets);
        }

        /* renamed from: a */
        public void mo2024a(View view, float f) {
            view.setElevation(f);
        }

        /* renamed from: a */
        public void mo2025a(View view, int i) {
            boolean z;
            Rect b = m2339b();
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                b.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !b.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            } else {
                z = false;
            }
            super.mo2025a(view, i);
            if (z && b.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(b);
            }
        }

        /* renamed from: a */
        public void mo2026a(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        }

        /* renamed from: a */
        public void mo2027a(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        }

        /* renamed from: a */
        public void mo2028a(View view, C0482q qVar) {
            if (qVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) null);
            } else {
                view.setOnApplyWindowInsetsListener(new C0498w(this, qVar));
            }
        }

        /* renamed from: a */
        public void mo2029a(View view, String str) {
            view.setTransitionName(str);
        }

        /* renamed from: b */
        public ColorStateList mo2030b(View view) {
            return view.getBackgroundTintList();
        }

        /* renamed from: b */
        public C0434L mo2031b(View view, C0434L l) {
            WindowInsets windowInsets = (WindowInsets) C0434L.m2017a(l);
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
            if (onApplyWindowInsets != windowInsets) {
                windowInsets = new WindowInsets(onApplyWindowInsets);
            }
            return C0434L.m2016a((Object) windowInsets);
        }

        /* renamed from: b */
        public void mo2032b(View view, int i) {
            boolean z;
            Rect b = m2339b();
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                b.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !b.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            } else {
                z = false;
            }
            super.mo2032b(view, i);
            if (z && b.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(b);
            }
        }

        /* renamed from: c */
        public PorterDuff.Mode mo2033c(View view) {
            return view.getBackgroundTintMode();
        }

        /* renamed from: f */
        public float mo2034f(View view) {
            return view.getElevation();
        }

        /* renamed from: o */
        public String mo2035o(View view) {
            return view.getTransitionName();
        }

        /* renamed from: p */
        public float mo2036p(View view) {
            return view.getTranslationZ();
        }

        /* renamed from: r */
        public float mo2037r(View view) {
            return view.getZ();
        }

        /* renamed from: y */
        public boolean mo2038y(View view) {
            return view.isNestedScrollingEnabled();
        }
    }

    /* renamed from: android.support.v4.view.v$g */
    static class C0494g extends C0493f {
        C0494g() {
        }

        /* renamed from: a */
        public void mo2025a(View view, int i) {
            view.offsetLeftAndRight(i);
        }

        /* renamed from: a */
        public void mo2039a(View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }

        /* renamed from: b */
        public void mo2032b(View view, int i) {
            view.offsetTopAndBottom(i);
        }
    }

    /* renamed from: android.support.v4.view.v$h */
    static class C0495h extends C0494g {
        C0495h() {
        }

        /* renamed from: a */
        public void mo2040a(View view, C0484s sVar) {
            view.setPointerIcon((PointerIcon) (sVar != null ? sVar.mo1990a() : null));
        }
    }

    /* renamed from: android.support.v4.view.v$i */
    static class C0496i extends C0495h {
        C0496i() {
        }
    }

    /* renamed from: android.support.v4.view.v$j */
    static class C0497j {

        /* renamed from: a */
        private static Field f1807a;

        /* renamed from: b */
        private static boolean f1808b;

        /* renamed from: c */
        private static Field f1809c;

        /* renamed from: d */
        private static boolean f1810d;

        /* renamed from: e */
        private static WeakHashMap<View, String> f1811e;

        /* renamed from: f */
        private static final AtomicInteger f1812f = new AtomicInteger(1);

        /* renamed from: g */
        static Field f1813g;

        /* renamed from: h */
        static boolean f1814h = false;

        /* renamed from: i */
        WeakHashMap<View, C0429H> f1815i = null;

        C0497j() {
        }

        /* renamed from: D */
        private static void m2362D(View view) {
            float translationY = view.getTranslationY();
            view.setTranslationY(1.0f + translationY);
            view.setTranslationY(translationY);
        }

        /* renamed from: A */
        public void mo1996A(View view) {
            view.postInvalidate();
        }

        /* renamed from: B */
        public void mo1997B(View view) {
        }

        /* renamed from: C */
        public void mo2022C(View view) {
            if (view instanceof C0477l) {
                ((C0477l) view).stopNestedScroll();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public long mo2041a() {
            return ValueAnimator.getFrameDelay();
        }

        /* renamed from: a */
        public C0429H mo2042a(View view) {
            if (this.f1815i == null) {
                this.f1815i = new WeakHashMap<>();
            }
            C0429H h = this.f1815i.get(view);
            if (h != null) {
                return h;
            }
            C0429H h2 = new C0429H(view);
            this.f1815i.put(view, h2);
            return h2;
        }

        /* renamed from: a */
        public C0434L mo2023a(View view, C0434L l) {
            return l;
        }

        /* renamed from: a */
        public void mo2024a(View view, float f) {
        }

        /* renamed from: a */
        public void mo2025a(View view, int i) {
            view.offsetLeftAndRight(i);
            if (view.getVisibility() == 0) {
                m2362D(view);
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    m2362D((View) parent);
                }
            }
        }

        /* renamed from: a */
        public void mo2039a(View view, int i, int i2) {
        }

        /* renamed from: a */
        public void mo2010a(View view, int i, int i2, int i3, int i4) {
            view.setPadding(i, i2, i3, i4);
        }

        /* renamed from: a */
        public void mo2026a(View view, ColorStateList colorStateList) {
            if (view instanceof C0486u) {
                ((C0486u) view).setSupportBackgroundTintList(colorStateList);
            }
        }

        /* renamed from: a */
        public void mo2027a(View view, PorterDuff.Mode mode) {
            if (view instanceof C0486u) {
                ((C0486u) view).setSupportBackgroundTintMode(mode);
            }
        }

        /* renamed from: a */
        public void mo2017a(View view, Rect rect) {
        }

        /* renamed from: a */
        public void mo1998a(View view, Drawable drawable) {
            view.setBackgroundDrawable(drawable);
        }

        /* renamed from: a */
        public void mo2043a(View view, C0459c cVar) {
            view.setAccessibilityDelegate(cVar == null ? null : cVar.mo1918a());
        }

        /* renamed from: a */
        public void mo2028a(View view, C0482q qVar) {
        }

        /* renamed from: a */
        public void mo2040a(View view, C0484s sVar) {
        }

        /* renamed from: a */
        public void mo1999a(View view, Runnable runnable) {
            view.postDelayed(runnable, mo2041a());
        }

        /* renamed from: a */
        public void mo2000a(View view, Runnable runnable, long j) {
            view.postDelayed(runnable, mo2041a() + j);
        }

        /* renamed from: a */
        public void mo2029a(View view, String str) {
            if (f1811e == null) {
                f1811e = new WeakHashMap<>();
            }
            f1811e.put(view, str);
        }

        /* renamed from: a */
        public void mo2001a(View view, boolean z) {
        }

        /* renamed from: b */
        public ColorStateList mo2030b(View view) {
            if (view instanceof C0486u) {
                return ((C0486u) view).getSupportBackgroundTintList();
            }
            return null;
        }

        /* renamed from: b */
        public C0434L mo2031b(View view, C0434L l) {
            return l;
        }

        /* renamed from: b */
        public void mo2032b(View view, int i) {
            view.offsetTopAndBottom(i);
            if (view.getVisibility() == 0) {
                m2362D(view);
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    m2362D((View) parent);
                }
            }
        }

        /* renamed from: c */
        public PorterDuff.Mode mo2033c(View view) {
            if (view instanceof C0486u) {
                return ((C0486u) view).getSupportBackgroundTintMode();
            }
            return null;
        }

        /* renamed from: c */
        public void mo2019c(View view, int i) {
        }

        /* renamed from: d */
        public Rect mo2018d(View view) {
            return null;
        }

        /* renamed from: d */
        public void mo2002d(View view, int i) {
        }

        /* renamed from: e */
        public Display mo2011e(View view) {
            if (mo2020w(view)) {
                return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
            }
            return null;
        }

        /* renamed from: f */
        public float mo2034f(View view) {
            return 0.0f;
        }

        /* renamed from: g */
        public boolean mo2003g(View view) {
            return false;
        }

        /* renamed from: h */
        public int mo2004h(View view) {
            return 0;
        }

        /* renamed from: i */
        public int mo2012i(View view) {
            return 0;
        }

        /* renamed from: j */
        public int mo2005j(View view) {
            if (!f1810d) {
                try {
                    f1809c = View.class.getDeclaredField("mMinHeight");
                    f1809c.setAccessible(true);
                } catch (NoSuchFieldException unused) {
                }
                f1810d = true;
            }
            Field field = f1809c;
            if (field == null) {
                return 0;
            }
            try {
                return ((Integer) field.get(view)).intValue();
            } catch (Exception unused2) {
                return 0;
            }
        }

        /* renamed from: k */
        public int mo2006k(View view) {
            if (!f1808b) {
                try {
                    f1807a = View.class.getDeclaredField("mMinWidth");
                    f1807a.setAccessible(true);
                } catch (NoSuchFieldException unused) {
                }
                f1808b = true;
            }
            Field field = f1807a;
            if (field == null) {
                return 0;
            }
            try {
                return ((Integer) field.get(view)).intValue();
            } catch (Exception unused2) {
                return 0;
            }
        }

        /* renamed from: l */
        public int mo2013l(View view) {
            return view.getPaddingRight();
        }

        /* renamed from: m */
        public int mo2014m(View view) {
            return view.getPaddingLeft();
        }

        /* renamed from: n */
        public ViewParent mo2007n(View view) {
            return view.getParent();
        }

        /* renamed from: o */
        public String mo2035o(View view) {
            WeakHashMap<View, String> weakHashMap = f1811e;
            if (weakHashMap == null) {
                return null;
            }
            return weakHashMap.get(view);
        }

        /* renamed from: p */
        public float mo2036p(View view) {
            return 0.0f;
        }

        /* renamed from: q */
        public int mo2015q(View view) {
            return 0;
        }

        /* renamed from: r */
        public float mo2037r(View view) {
            return mo2036p(view) + mo2034f(view);
        }

        /* renamed from: s */
        public boolean mo2044s(View view) {
            if (f1814h) {
                return false;
            }
            if (f1813g == null) {
                try {
                    f1813g = View.class.getDeclaredField("mAccessibilityDelegate");
                    f1813g.setAccessible(true);
                } catch (Throwable unused) {
                    f1814h = true;
                    return false;
                }
            }
            try {
                return f1813g.get(view) != null;
            } catch (Throwable unused2) {
                f1814h = true;
                return false;
            }
        }

        /* renamed from: t */
        public boolean mo1995t(View view) {
            return false;
        }

        /* renamed from: u */
        public boolean mo2008u(View view) {
            return true;
        }

        /* renamed from: v */
        public boolean mo2009v(View view) {
            return false;
        }

        /* renamed from: w */
        public boolean mo2020w(View view) {
            return view.getWindowToken() != null;
        }

        /* renamed from: x */
        public boolean mo2021x(View view) {
            return view.getWidth() > 0 && view.getHeight() > 0;
        }

        /* renamed from: y */
        public boolean mo2038y(View view) {
            if (view instanceof C0477l) {
                return ((C0477l) view).isNestedScrollingEnabled();
            }
            return false;
        }

        /* renamed from: z */
        public boolean mo2016z(View view) {
            return false;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f1805a = i >= 26 ? new C0496i() : i >= 24 ? new C0495h() : i >= 23 ? new C0494g() : i >= 21 ? new C0493f() : i >= 19 ? new C0492e() : i >= 18 ? new C0491d() : i >= 17 ? new C0490c() : i >= 16 ? new C0489b() : i >= 15 ? new C0488a() : new C0497j();
    }

    /* renamed from: A */
    public static boolean m2260A(View view) {
        return f1805a.mo2016z(view);
    }

    /* renamed from: B */
    public static void m2261B(View view) {
        f1805a.mo1996A(view);
    }

    /* renamed from: C */
    public static void m2262C(View view) {
        f1805a.mo1997B(view);
    }

    /* renamed from: D */
    public static void m2263D(View view) {
        f1805a.mo2022C(view);
    }

    /* renamed from: a */
    public static C0429H m2264a(View view) {
        return f1805a.mo2042a(view);
    }

    /* renamed from: a */
    public static C0434L m2265a(View view, C0434L l) {
        return f1805a.mo2023a(view, l);
    }

    /* renamed from: a */
    public static void m2266a(View view, float f) {
        f1805a.mo2024a(view, f);
    }

    /* renamed from: a */
    public static void m2267a(View view, int i) {
        f1805a.mo2025a(view, i);
    }

    /* renamed from: a */
    public static void m2268a(View view, int i, int i2) {
        f1805a.mo2039a(view, i, i2);
    }

    /* renamed from: a */
    public static void m2269a(View view, int i, int i2, int i3, int i4) {
        f1805a.mo2010a(view, i, i2, i3, i4);
    }

    /* renamed from: a */
    public static void m2270a(View view, ColorStateList colorStateList) {
        f1805a.mo2026a(view, colorStateList);
    }

    /* renamed from: a */
    public static void m2271a(View view, PorterDuff.Mode mode) {
        f1805a.mo2027a(view, mode);
    }

    /* renamed from: a */
    public static void m2272a(View view, Rect rect) {
        f1805a.mo2017a(view, rect);
    }

    /* renamed from: a */
    public static void m2273a(View view, Drawable drawable) {
        f1805a.mo1998a(view, drawable);
    }

    /* renamed from: a */
    public static void m2274a(View view, C0459c cVar) {
        f1805a.mo2043a(view, cVar);
    }

    /* renamed from: a */
    public static void m2275a(View view, C0482q qVar) {
        f1805a.mo2028a(view, qVar);
    }

    /* renamed from: a */
    public static void m2276a(View view, C0484s sVar) {
        f1805a.mo2040a(view, sVar);
    }

    /* renamed from: a */
    public static void m2277a(View view, Runnable runnable) {
        f1805a.mo1999a(view, runnable);
    }

    /* renamed from: a */
    public static void m2278a(View view, Runnable runnable, long j) {
        f1805a.mo2000a(view, runnable, j);
    }

    /* renamed from: a */
    public static void m2279a(View view, String str) {
        f1805a.mo2029a(view, str);
    }

    @Deprecated
    /* renamed from: a */
    public static void m2280a(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    /* renamed from: b */
    public static ColorStateList m2281b(View view) {
        return f1805a.mo2030b(view);
    }

    /* renamed from: b */
    public static C0434L m2282b(View view, C0434L l) {
        return f1805a.mo2031b(view, l);
    }

    /* renamed from: b */
    public static void m2283b(View view, int i) {
        f1805a.mo2032b(view, i);
    }

    /* renamed from: b */
    public static void m2284b(View view, boolean z) {
        f1805a.mo2001a(view, z);
    }

    /* renamed from: c */
    public static PorterDuff.Mode m2285c(View view) {
        return f1805a.mo2033c(view);
    }

    /* renamed from: c */
    public static void m2286c(View view, int i) {
        f1805a.mo2019c(view, i);
    }

    /* renamed from: d */
    public static Rect m2287d(View view) {
        return f1805a.mo2018d(view);
    }

    /* renamed from: d */
    public static void m2288d(View view, int i) {
        f1805a.mo2002d(view, i);
    }

    /* renamed from: e */
    public static Display m2289e(View view) {
        return f1805a.mo2011e(view);
    }

    /* renamed from: f */
    public static float m2290f(View view) {
        return f1805a.mo2034f(view);
    }

    /* renamed from: g */
    public static boolean m2291g(View view) {
        return f1805a.mo2003g(view);
    }

    /* renamed from: h */
    public static int m2292h(View view) {
        return f1805a.mo2004h(view);
    }

    /* renamed from: i */
    public static int m2293i(View view) {
        return f1805a.mo2012i(view);
    }

    /* renamed from: j */
    public static int m2294j(View view) {
        return f1805a.mo2005j(view);
    }

    /* renamed from: k */
    public static int m2295k(View view) {
        return f1805a.mo2006k(view);
    }

    /* renamed from: l */
    public static int m2296l(View view) {
        return f1805a.mo2013l(view);
    }

    /* renamed from: m */
    public static int m2297m(View view) {
        return f1805a.mo2014m(view);
    }

    /* renamed from: n */
    public static ViewParent m2298n(View view) {
        return f1805a.mo2007n(view);
    }

    /* renamed from: o */
    public static String m2299o(View view) {
        return f1805a.mo2035o(view);
    }

    @Deprecated
    /* renamed from: p */
    public static float m2300p(View view) {
        return view.getTranslationY();
    }

    /* renamed from: q */
    public static int m2301q(View view) {
        return f1805a.mo2015q(view);
    }

    @Deprecated
    /* renamed from: r */
    public static float m2302r(View view) {
        return view.getY();
    }

    /* renamed from: s */
    public static float m2303s(View view) {
        return f1805a.mo2037r(view);
    }

    /* renamed from: t */
    public static boolean m2304t(View view) {
        return f1805a.mo2044s(view);
    }

    /* renamed from: u */
    public static boolean m2305u(View view) {
        return f1805a.mo1995t(view);
    }

    /* renamed from: v */
    public static boolean m2306v(View view) {
        return f1805a.mo2008u(view);
    }

    /* renamed from: w */
    public static boolean m2307w(View view) {
        return f1805a.mo2009v(view);
    }

    /* renamed from: x */
    public static boolean m2308x(View view) {
        return f1805a.mo2020w(view);
    }

    /* renamed from: y */
    public static boolean m2309y(View view) {
        return f1805a.mo2021x(view);
    }

    /* renamed from: z */
    public static boolean m2310z(View view) {
        return f1805a.mo2038y(view);
    }
}
