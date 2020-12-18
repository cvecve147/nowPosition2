package android.support.p007v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.p007v4.view.AbsSavedState;
import android.support.p007v4.view.C0459c;
import android.support.p007v4.view.C0466f;
import android.support.p007v4.view.C0487v;
import android.support.p007v4.view.p009a.C0446b;
import android.support.p007v4.widget.C0525I;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;
import p013b.p018b.p028h.p029a.C1006a;
import p013b.p018b.p028h.p031b.p032a.C1026a;

/* renamed from: android.support.v4.widget.DrawerLayout */
public class DrawerLayout extends ViewGroup {

    /* renamed from: a */
    private static final int[] f1828a = {16843828};

    /* renamed from: b */
    static final int[] f1829b = {16842931};

    /* renamed from: c */
    static final boolean f1830c = (Build.VERSION.SDK_INT >= 19);

    /* renamed from: d */
    private static final boolean f1831d;

    /* renamed from: A */
    private float f1832A;

    /* renamed from: B */
    private Drawable f1833B;

    /* renamed from: C */
    private Drawable f1834C;

    /* renamed from: D */
    private Drawable f1835D;

    /* renamed from: E */
    private CharSequence f1836E;

    /* renamed from: F */
    private CharSequence f1837F;

    /* renamed from: G */
    private Object f1838G;

    /* renamed from: H */
    private boolean f1839H;

    /* renamed from: I */
    private Drawable f1840I;

    /* renamed from: J */
    private Drawable f1841J;

    /* renamed from: K */
    private Drawable f1842K;

    /* renamed from: L */
    private Drawable f1843L;

    /* renamed from: M */
    private final ArrayList<View> f1844M;

    /* renamed from: e */
    private final C0517b f1845e;

    /* renamed from: f */
    private float f1846f;

    /* renamed from: g */
    private int f1847g;

    /* renamed from: h */
    private int f1848h;

    /* renamed from: i */
    private float f1849i;

    /* renamed from: j */
    private Paint f1850j;

    /* renamed from: k */
    private final C0525I f1851k;

    /* renamed from: l */
    private final C0525I f1852l;

    /* renamed from: m */
    private final C0520e f1853m;

    /* renamed from: n */
    private final C0520e f1854n;

    /* renamed from: o */
    private int f1855o;

    /* renamed from: p */
    private boolean f1856p;

    /* renamed from: q */
    private boolean f1857q;

    /* renamed from: r */
    private int f1858r;

    /* renamed from: s */
    private int f1859s;

    /* renamed from: t */
    private int f1860t;

    /* renamed from: u */
    private int f1861u;

    /* renamed from: v */
    private boolean f1862v;

    /* renamed from: w */
    private boolean f1863w;

    /* renamed from: x */
    private C0518c f1864x;

    /* renamed from: y */
    private List<C0518c> f1865y;

    /* renamed from: z */
    private float f1866z;

    /* renamed from: android.support.v4.widget.DrawerLayout$SavedState */
    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0553l();

        /* renamed from: a */
        int f1867a = 0;

        /* renamed from: b */
        int f1868b;

        /* renamed from: c */
        int f1869c;

        /* renamed from: d */
        int f1870d;

        /* renamed from: e */
        int f1871e;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1867a = parcel.readInt();
            this.f1868b = parcel.readInt();
            this.f1869c = parcel.readInt();
            this.f1870d = parcel.readInt();
            this.f1871e = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1867a);
            parcel.writeInt(this.f1868b);
            parcel.writeInt(this.f1869c);
            parcel.writeInt(this.f1870d);
            parcel.writeInt(this.f1871e);
        }
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$a */
    class C0516a extends C0459c {

        /* renamed from: d */
        private final Rect f1872d = new Rect();

        C0516a() {
        }

        /* renamed from: a */
        private void m2481a(C0446b bVar, C0446b bVar2) {
            Rect rect = this.f1872d;
            bVar2.mo1855a(rect);
            bVar.mo1868c(rect);
            bVar2.mo1862b(rect);
            bVar.mo1873d(rect);
            bVar.mo1894l(bVar2.mo1901r());
            bVar.mo1875d(bVar2.mo1872d());
            bVar.mo1857a(bVar2.mo1861b());
            bVar.mo1864b(bVar2.mo1867c());
            bVar.mo1882f(bVar2.mo1893k());
            bVar.mo1876d(bVar2.mo1891j());
            bVar.mo1883g(bVar2.mo1895l());
            bVar.mo1885h(bVar2.mo1896m());
            bVar.mo1859a(bVar2.mo1884g());
            bVar.mo1892k(bVar2.mo1900q());
            bVar.mo1888i(bVar2.mo1897n());
            bVar.mo1854a(bVar2.mo1853a());
        }

        /* renamed from: a */
        private void m2482a(C0446b bVar, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (DrawerLayout.m2443g(childAt)) {
                    bVar.mo1856a(childAt);
                }
            }
        }

        /* renamed from: a */
        public void mo309a(View view, C0446b bVar) {
            if (DrawerLayout.f1830c) {
                super.mo309a(view, bVar);
            } else {
                C0446b a = C0446b.m2086a(bVar);
                super.mo309a(view, a);
                bVar.mo1874d(view);
                ViewParent n = C0487v.m2298n(view);
                if (n instanceof View) {
                    bVar.mo1869c((View) n);
                }
                m2481a(bVar, a);
                a.mo1902s();
                m2482a(bVar, (ViewGroup) view);
            }
            bVar.mo1857a((CharSequence) DrawerLayout.class.getName());
            bVar.mo1883g(false);
            bVar.mo1885h(false);
            bVar.mo1860a(C0446b.C0447a.f1744a);
            bVar.mo1860a(C0446b.C0447a.f1745b);
        }

        /* renamed from: a */
        public boolean mo1920a(View view, AccessibilityEvent accessibilityEvent) {
            CharSequence d;
            if (accessibilityEvent.getEventType() != 32) {
                return super.mo1920a(view, accessibilityEvent);
            }
            List text = accessibilityEvent.getText();
            View d2 = DrawerLayout.this.mo2084d();
            if (d2 == null || (d = DrawerLayout.this.mo2085d(DrawerLayout.this.mo2087e(d2))) == null) {
                return true;
            }
            text.add(d);
            return true;
        }

        /* renamed from: a */
        public boolean mo1921a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.f1830c || DrawerLayout.m2443g(view)) {
                return super.mo1921a(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        /* renamed from: b */
        public void mo832b(View view, AccessibilityEvent accessibilityEvent) {
            super.mo832b(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.class.getName());
        }
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$b */
    static final class C0517b extends C0459c {
        C0517b() {
        }

        /* renamed from: a */
        public void mo309a(View view, C0446b bVar) {
            super.mo309a(view, bVar);
            if (!DrawerLayout.m2443g(view)) {
                bVar.mo1869c((View) null);
            }
        }
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$c */
    public interface C0518c {
        /* renamed from: a */
        void mo2121a(int i);

        /* renamed from: a */
        void mo2122a(View view);

        /* renamed from: a */
        void mo2123a(View view, float f);

        /* renamed from: b */
        void mo2124b(View view);
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$d */
    public static class C0519d extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f1874a = 0;

        /* renamed from: b */
        float f1875b;

        /* renamed from: c */
        boolean f1876c;

        /* renamed from: d */
        int f1877d;

        public C0519d(int i, int i2) {
            super(i, i2);
        }

        public C0519d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f1829b);
            this.f1874a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public C0519d(C0519d dVar) {
            super(dVar);
            this.f1874a = dVar.f1874a;
        }

        public C0519d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0519d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$e */
    private class C0520e extends C0525I.C0526a {

        /* renamed from: a */
        private final int f1878a;

        /* renamed from: b */
        private C0525I f1879b;

        /* renamed from: c */
        private final Runnable f1880c = new C0554m(this);

        C0520e(int i) {
            this.f1878a = i;
        }

        /* renamed from: c */
        private void m2492c() {
            int i = 3;
            if (this.f1878a == 3) {
                i = 5;
            }
            View b = DrawerLayout.this.mo2070b(i);
            if (b != null) {
                DrawerLayout.this.mo2062a(b);
            }
        }

        /* renamed from: a */
        public int mo659a(View view) {
            if (DrawerLayout.this.mo2097j(view)) {
                return view.getWidth();
            }
            return 0;
        }

        /* renamed from: a */
        public int mo660a(View view, int i, int i2) {
            int width;
            int width2;
            if (DrawerLayout.this.mo2067a(view, 3)) {
                width2 = -view.getWidth();
                width = 0;
            } else {
                width = DrawerLayout.this.getWidth();
                width2 = width - view.getWidth();
            }
            return Math.max(width2, Math.min(i, width));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2125a() {
            View view;
            int i;
            int c = this.f1879b.mo2153c();
            int i2 = 0;
            boolean z = this.f1878a == 3;
            if (z) {
                view = DrawerLayout.this.mo2070b(3);
                if (view != null) {
                    i2 = -view.getWidth();
                }
                i = i2 + c;
            } else {
                view = DrawerLayout.this.mo2070b(5);
                i = DrawerLayout.this.getWidth() - c;
            }
            if (view == null) {
                return;
            }
            if (((z && view.getLeft() < i) || (!z && view.getLeft() > i)) && DrawerLayout.this.mo2083d(view) == 0) {
                this.f1879b.mo2152b(view, i, view.getTop());
                ((C0519d) view.getLayoutParams()).f1876c = true;
                DrawerLayout.this.invalidate();
                m2492c();
                DrawerLayout.this.mo2056a();
            }
        }

        /* renamed from: a */
        public void mo2126a(int i, int i2) {
            DrawerLayout drawerLayout;
            int i3;
            if ((i & 1) == 1) {
                drawerLayout = DrawerLayout.this;
                i3 = 3;
            } else {
                drawerLayout = DrawerLayout.this;
                i3 = 5;
            }
            View b = drawerLayout.mo2070b(i3);
            if (b != null && DrawerLayout.this.mo2083d(b) == 0) {
                this.f1879b.mo2142a(b, i2);
            }
        }

        /* renamed from: a */
        public void mo2127a(C0525I i) {
            this.f1879b = i;
        }

        /* renamed from: a */
        public void mo661a(View view, float f, float f2) {
            int i;
            float f3 = DrawerLayout.this.mo2088f(view);
            int width = view.getWidth();
            if (DrawerLayout.this.mo2067a(view, 3)) {
                int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                i = (i2 > 0 || (i2 == 0 && f3 > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f < 0.0f || (f == 0.0f && f3 > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.f1879b.mo2158d(i, view.getTop());
            DrawerLayout.this.invalidate();
        }

        /* renamed from: a */
        public void mo662a(View view, int i) {
            ((C0519d) view.getLayoutParams()).f1876c = false;
            m2492c();
        }

        /* renamed from: a */
        public void mo663a(View view, int i, int i2, int i3, int i4) {
            int width = view.getWidth();
            float width2 = (DrawerLayout.this.mo2067a(view, 3) ? (float) (i + width) : (float) (DrawerLayout.this.getWidth() - i)) / ((float) width);
            DrawerLayout.this.mo2080c(view, width2);
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        /* renamed from: b */
        public int mo664b(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: b */
        public void mo2128b() {
            DrawerLayout.this.removeCallbacks(this.f1880c);
        }

        /* renamed from: b */
        public void mo2129b(int i, int i2) {
            DrawerLayout.this.postDelayed(this.f1880c, 160);
        }

        /* renamed from: b */
        public boolean mo2130b(int i) {
            return false;
        }

        /* renamed from: b */
        public boolean mo665b(View view, int i) {
            return DrawerLayout.this.mo2097j(view) && DrawerLayout.this.mo2067a(view, this.f1878a) && DrawerLayout.this.mo2083d(view) == 0;
        }

        /* renamed from: c */
        public void mo666c(int i) {
            DrawerLayout.this.mo2059a(this.f1878a, i, this.f1879b.mo2147b());
        }
    }

    static {
        boolean z = true;
        if (Build.VERSION.SDK_INT < 21) {
            z = false;
        }
        f1831d = z;
    }

    public DrawerLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1845e = new C0517b();
        this.f1848h = -1728053248;
        this.f1850j = new Paint();
        this.f1857q = true;
        this.f1858r = 3;
        this.f1859s = 3;
        this.f1860t = 3;
        this.f1861u = 3;
        this.f1840I = null;
        this.f1841J = null;
        this.f1842K = null;
        this.f1843L = null;
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f1847g = (int) ((64.0f * f) + 0.5f);
        float f2 = 400.0f * f;
        this.f1853m = new C0520e(3);
        this.f1854n = new C0520e(5);
        this.f1851k = C0525I.m2510a((ViewGroup) this, 1.0f, (C0525I.C0526a) this.f1853m);
        this.f1851k.mo2157d(1);
        this.f1851k.mo2140a(f2);
        this.f1853m.mo2127a(this.f1851k);
        this.f1852l = C0525I.m2510a((ViewGroup) this, 1.0f, (C0525I.C0526a) this.f1854n);
        this.f1852l.mo2157d(2);
        this.f1852l.mo2140a(f2);
        this.f1854n.mo2127a(this.f1852l);
        setFocusableInTouchMode(true);
        C0487v.m2288d(this, 1);
        C0487v.m2274a((View) this, (C0459c) new C0516a());
        setMotionEventSplittingEnabled(false);
        if (C0487v.m2291g(this)) {
            if (Build.VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new C0552k(this));
                setSystemUiVisibility(1280);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f1828a);
                try {
                    this.f1833B = obtainStyledAttributes.getDrawable(0);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            } else {
                this.f1833B = null;
            }
        }
        this.f1846f = f * 10.0f;
        this.f1844M = new ArrayList<>();
    }

    /* renamed from: a */
    private boolean m2437a(Drawable drawable, int i) {
        if (drawable == null || !C1026a.m5459f(drawable)) {
            return false;
        }
        C1026a.m5453a(drawable, i);
        return true;
    }

    /* renamed from: c */
    private void m2438c(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0487v.m2288d(childAt, ((z || mo2097j(childAt)) && (!z || childAt != view)) ? 4 : 1);
        }
    }

    /* renamed from: e */
    static String m2439e(int i) {
        return (i & 3) == 3 ? "LEFT" : (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    /* renamed from: e */
    private boolean m2440e() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((C0519d) getChildAt(i).getLayoutParams()).f1876c) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    private boolean m2441f() {
        return mo2084d() != null;
    }

    /* renamed from: g */
    private Drawable m2442g() {
        int i = C0487v.m2293i(this);
        if (i == 0) {
            Drawable drawable = this.f1840I;
            if (drawable != null) {
                m2437a(drawable, i);
                return this.f1840I;
            }
        } else {
            Drawable drawable2 = this.f1841J;
            if (drawable2 != null) {
                m2437a(drawable2, i);
                return this.f1841J;
            }
        }
        return this.f1842K;
    }

    /* renamed from: g */
    static boolean m2443g(View view) {
        return (C0487v.m2292h(view) == 4 || C0487v.m2292h(view) == 2) ? false : true;
    }

    /* renamed from: h */
    private Drawable m2444h() {
        int i = C0487v.m2293i(this);
        if (i == 0) {
            Drawable drawable = this.f1841J;
            if (drawable != null) {
                m2437a(drawable, i);
                return this.f1841J;
            }
        } else {
            Drawable drawable2 = this.f1840I;
            if (drawable2 != null) {
                m2437a(drawable2, i);
                return this.f1840I;
            }
        }
        return this.f1843L;
    }

    /* renamed from: i */
    private void m2445i() {
        if (!f1831d) {
            this.f1834C = m2442g();
            this.f1835D = m2444h();
        }
    }

    /* renamed from: m */
    private static boolean m2446m(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2056a() {
        if (!this.f1863w) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.f1863w = true;
        }
    }

    /* renamed from: a */
    public void mo2057a(int i) {
        mo2060a(i, true);
    }

    /* renamed from: a */
    public void mo2058a(int i, int i2) {
        View b;
        int a = C0466f.m2170a(i2, C0487v.m2293i(this));
        if (i2 == 3) {
            this.f1858r = i;
        } else if (i2 == 5) {
            this.f1859s = i;
        } else if (i2 == 8388611) {
            this.f1860t = i;
        } else if (i2 == 8388613) {
            this.f1861u = i;
        }
        if (i != 0) {
            (a == 3 ? this.f1851k : this.f1852l).mo2139a();
        }
        if (i == 1) {
            View b2 = mo2070b(a);
            if (b2 != null) {
                mo2062a(b2);
            }
        } else if (i == 2 && (b = mo2070b(a)) != null) {
            mo2099l(b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2059a(int i, int i2, View view) {
        int e = this.f1851k.mo2159e();
        int e2 = this.f1852l.mo2159e();
        int i3 = 2;
        if (e == 1 || e2 == 1) {
            i3 = 1;
        } else if (!(e == 2 || e2 == 2)) {
            i3 = 0;
        }
        if (view != null && i2 == 0) {
            float f = ((C0519d) view.getLayoutParams()).f1875b;
            if (f == 0.0f) {
                mo2074b(view);
            } else if (f == 1.0f) {
                mo2079c(view);
            }
        }
        if (i3 != this.f1855o) {
            this.f1855o = i3;
            List<C0518c> list = this.f1865y;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f1865y.get(size).mo2121a(i3);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo2060a(int i, boolean z) {
        View b = mo2070b(i);
        if (b != null) {
            mo2064a(b, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + m2439e(i));
    }

    /* renamed from: a */
    public void mo2061a(C0518c cVar) {
        if (cVar != null) {
            if (this.f1865y == null) {
                this.f1865y = new ArrayList();
            }
            this.f1865y.add(cVar);
        }
    }

    /* renamed from: a */
    public void mo2062a(View view) {
        mo2064a(view, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2063a(View view, float f) {
        List<C0518c> list = this.f1865y;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f1865y.get(size).mo2123a(view, f);
            }
        }
    }

    /* renamed from: a */
    public void mo2064a(View view, boolean z) {
        C0525I i;
        int i2;
        if (mo2097j(view)) {
            C0519d dVar = (C0519d) view.getLayoutParams();
            if (this.f1857q) {
                dVar.f1875b = 0.0f;
                dVar.f1877d = 0;
            } else if (z) {
                dVar.f1877d |= 4;
                if (mo2067a(view, 3)) {
                    i = this.f1851k;
                    i2 = -view.getWidth();
                } else {
                    i = this.f1852l;
                    i2 = getWidth();
                }
                i.mo2152b(view, i2, view.getTop());
            } else {
                mo2075b(view, 0.0f);
                mo2059a(dVar.f1874a, 0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    /* renamed from: a */
    public void mo2065a(Object obj, boolean z) {
        this.f1838G = obj;
        this.f1839H = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2066a(boolean z) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0519d dVar = (C0519d) childAt.getLayoutParams();
            if (mo2097j(childAt) && (!z || dVar.f1876c)) {
                z2 |= mo2067a(childAt, 3) ? this.f1851k.mo2152b(childAt, -childAt.getWidth(), childAt.getTop()) : this.f1852l.mo2152b(childAt, getWidth(), childAt.getTop());
                dVar.f1876c = false;
            }
        }
        this.f1853m.mo2128b();
        this.f1854n.mo2128b();
        if (z2) {
            invalidate();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo2067a(View view, int i) {
        return (mo2087e(view) & i) == i;
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z = false;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (!mo2097j(childAt)) {
                    this.f1844M.add(childAt);
                } else if (mo2096i(childAt)) {
                    childAt.addFocusables(arrayList, i, i2);
                    z = true;
                }
            }
            if (!z) {
                int size = this.f1844M.size();
                for (int i4 = 0; i4 < size; i4++) {
                    View view = this.f1844M.get(i4);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i, i2);
                    }
                }
            }
            this.f1844M.clear();
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        C0487v.m2288d(view, (mo2078c() != null || mo2097j(view)) ? 4 : 1);
        if (!f1830c) {
            C0487v.m2274a(view, (C0459c) this.f1845e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public View mo2070b(int i) {
        int a = C0466f.m2170a(i, C0487v.m2293i(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((mo2087e(childAt) & 7) == a) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: b */
    public void mo2071b() {
        mo2066a(false);
    }

    /* renamed from: b */
    public void mo2072b(int i, boolean z) {
        View b = mo2070b(i);
        if (b != null) {
            mo2076b(b, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + m2439e(i));
    }

    /* renamed from: b */
    public void mo2073b(C0518c cVar) {
        List<C0518c> list;
        if (cVar != null && (list = this.f1865y) != null) {
            list.remove(cVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2074b(View view) {
        View rootView;
        C0519d dVar = (C0519d) view.getLayoutParams();
        if ((dVar.f1877d & 1) == 1) {
            dVar.f1877d = 0;
            List<C0518c> list = this.f1865y;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f1865y.get(size).mo2124b(view);
                }
            }
            m2438c(view, false);
            if (hasWindowFocus() && (rootView = getRootView()) != null) {
                rootView.sendAccessibilityEvent(32);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2075b(View view, float f) {
        float f2 = mo2088f(view);
        float width = (float) view.getWidth();
        int i = ((int) (width * f)) - ((int) (f2 * width));
        if (!mo2067a(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        mo2080c(view, f);
    }

    /* renamed from: b */
    public void mo2076b(View view, boolean z) {
        if (mo2097j(view)) {
            C0519d dVar = (C0519d) view.getLayoutParams();
            if (this.f1857q) {
                dVar.f1875b = 1.0f;
                dVar.f1877d = 1;
                m2438c(view, true);
            } else if (z) {
                dVar.f1877d |= 2;
                if (mo2067a(view, 3)) {
                    this.f1851k.mo2152b(view, 0, view.getTop());
                } else {
                    this.f1852l.mo2152b(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                mo2075b(view, 1.0f);
                mo2059a(dVar.f1874a, 0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    /* renamed from: c */
    public int mo2077c(int i) {
        int i2 = C0487v.m2293i(this);
        if (i == 3) {
            int i3 = this.f1858r;
            if (i3 != 3) {
                return i3;
            }
            int i4 = i2 == 0 ? this.f1860t : this.f1861u;
            if (i4 != 3) {
                return i4;
            }
            return 0;
        } else if (i == 5) {
            int i5 = this.f1859s;
            if (i5 != 3) {
                return i5;
            }
            int i6 = i2 == 0 ? this.f1861u : this.f1860t;
            if (i6 != 3) {
                return i6;
            }
            return 0;
        } else if (i == 8388611) {
            int i7 = this.f1860t;
            if (i7 != 3) {
                return i7;
            }
            int i8 = i2 == 0 ? this.f1858r : this.f1859s;
            if (i8 != 3) {
                return i8;
            }
            return 0;
        } else if (i != 8388613) {
            return 0;
        } else {
            int i9 = this.f1861u;
            if (i9 != 3) {
                return i9;
            }
            int i10 = i2 == 0 ? this.f1859s : this.f1858r;
            if (i10 != 3) {
                return i10;
            }
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public View mo2078c() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((C0519d) childAt.getLayoutParams()).f1877d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2079c(View view) {
        C0519d dVar = (C0519d) view.getLayoutParams();
        if ((dVar.f1877d & 1) == 0) {
            dVar.f1877d = 1;
            List<C0518c> list = this.f1865y;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f1865y.get(size).mo2122a(view);
                }
            }
            m2438c(view, true);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2080c(View view, float f) {
        C0519d dVar = (C0519d) view.getLayoutParams();
        if (f != dVar.f1875b) {
            dVar.f1875b = f;
            mo2063a(view, f);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0519d) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((C0519d) getChildAt(i).getLayoutParams()).f1875b);
        }
        this.f1849i = f;
        boolean a = this.f1851k.mo2146a(true);
        boolean a2 = this.f1852l.mo2146a(true);
        if (a || a2) {
            C0487v.m2261B(this);
        }
    }

    /* renamed from: d */
    public int mo2083d(View view) {
        if (mo2097j(view)) {
            return mo2077c(((C0519d) view.getLayoutParams()).f1874a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public View mo2084d() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (mo2097j(childAt) && mo2098k(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: d */
    public CharSequence mo2085d(int i) {
        int a = C0466f.m2170a(i, C0487v.m2293i(this));
        if (a == 3) {
            return this.f1836E;
        }
        if (a == 5) {
            return this.f1837F;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        Drawable drawable;
        Canvas canvas2 = canvas;
        View view2 = view;
        int height = getHeight();
        boolean h = mo2095h(view2);
        int width = getWidth();
        int save = canvas.save();
        int i2 = 0;
        if (h) {
            int childCount = getChildCount();
            i = width;
            int i3 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt != view2 && childAt.getVisibility() == 0 && m2446m(childAt) && mo2097j(childAt) && childAt.getHeight() >= height) {
                    if (mo2067a(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i3) {
                            i3 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < i) {
                            i = left;
                        }
                    }
                }
            }
            canvas.clipRect(i3, 0, i, getHeight());
            i2 = i3;
        } else {
            i = width;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        float f = this.f1849i;
        if (f <= 0.0f || !h) {
            if (this.f1834C != null && mo2067a(view2, 3)) {
                int intrinsicWidth = this.f1834C.getIntrinsicWidth();
                int right2 = view.getRight();
                float max = Math.max(0.0f, Math.min(((float) right2) / ((float) this.f1851k.mo2153c()), 1.0f));
                this.f1834C.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
                this.f1834C.setAlpha((int) (max * 255.0f));
                drawable = this.f1834C;
            } else if (this.f1835D != null && mo2067a(view2, 5)) {
                int intrinsicWidth2 = this.f1835D.getIntrinsicWidth();
                int left2 = view.getLeft();
                float max2 = Math.max(0.0f, Math.min(((float) (getWidth() - left2)) / ((float) this.f1852l.mo2153c()), 1.0f));
                this.f1835D.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
                this.f1835D.setAlpha((int) (max2 * 255.0f));
                drawable = this.f1835D;
            }
            drawable.draw(canvas);
        } else {
            int i5 = this.f1848h;
            this.f1850j.setColor((i5 & 16777215) | (((int) (((float) ((-16777216 & i5) >>> 24)) * f)) << 24));
            canvas.drawRect((float) i2, 0.0f, (float) i, (float) getHeight(), this.f1850j);
        }
        return drawChild;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo2087e(View view) {
        return C0466f.m2170a(((C0519d) view.getLayoutParams()).f1874a, C0487v.m2293i(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public float mo2088f(View view) {
        return ((C0519d) view.getLayoutParams()).f1875b;
    }

    /* renamed from: f */
    public void mo2089f(int i) {
        mo2072b(i, true);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0519d(-1, -1);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0519d(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0519d ? new C0519d((C0519d) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0519d((ViewGroup.MarginLayoutParams) layoutParams) : new C0519d(layoutParams);
    }

    public float getDrawerElevation() {
        if (f1831d) {
            return this.f1846f;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f1833B;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo2095h(View view) {
        return ((C0519d) view.getLayoutParams()).f1874a == 0;
    }

    /* renamed from: i */
    public boolean mo2096i(View view) {
        if (mo2097j(view)) {
            return (((C0519d) view.getLayoutParams()).f1877d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo2097j(View view) {
        int a = C0466f.m2170a(((C0519d) view.getLayoutParams()).f1874a, C0487v.m2293i(view));
        return ((a & 3) == 0 && (a & 5) == 0) ? false : true;
    }

    /* renamed from: k */
    public boolean mo2098k(View view) {
        if (mo2097j(view)) {
            return ((C0519d) view.getLayoutParams()).f1875b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: l */
    public void mo2099l(View view) {
        mo2076b(view, true);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1857q = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1857q = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r4.f1838G;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r5) {
        /*
            r4 = this;
            super.onDraw(r5)
            boolean r0 = r4.f1839H
            if (r0 == 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r4.f1833B
            if (r0 == 0) goto L_0x002e
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            r2 = 0
            if (r0 < r1) goto L_0x001d
            java.lang.Object r0 = r4.f1838G
            if (r0 == 0) goto L_0x001d
            android.view.WindowInsets r0 = (android.view.WindowInsets) r0
            int r0 = r0.getSystemWindowInsetTop()
            goto L_0x001e
        L_0x001d:
            r0 = r2
        L_0x001e:
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r1 = r4.f1833B
            int r3 = r4.getWidth()
            r1.setBounds(r2, r2, r3, r0)
            android.graphics.drawable.Drawable r0 = r4.f1833B
            r0.draw(r5)
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p007v4.widget.DrawerLayout.onDraw(android.graphics.Canvas):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004d, code lost:
        r7 = r6.f1851k.mo2148b((int) r0, (int) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r0 != 3) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            android.support.v4.widget.I r1 = r6.f1851k
            boolean r1 = r1.mo2150b((android.view.MotionEvent) r7)
            android.support.v4.widget.I r2 = r6.f1852l
            boolean r2 = r2.mo2150b((android.view.MotionEvent) r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x003a
            if (r0 == r2) goto L_0x0031
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L_0x001e
            if (r0 == r4) goto L_0x0031
            goto L_0x0038
        L_0x001e:
            android.support.v4.widget.I r7 = r6.f1851k
            boolean r7 = r7.mo2143a((int) r4)
            if (r7 == 0) goto L_0x0038
            android.support.v4.widget.DrawerLayout$e r7 = r6.f1853m
            r7.mo2128b()
            android.support.v4.widget.DrawerLayout$e r7 = r6.f1854n
            r7.mo2128b()
            goto L_0x0038
        L_0x0031:
            r6.mo2066a((boolean) r2)
            r6.f1862v = r3
            r6.f1863w = r3
        L_0x0038:
            r7 = r3
            goto L_0x0064
        L_0x003a:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f1866z = r0
            r6.f1832A = r7
            float r4 = r6.f1849i
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x005f
            android.support.v4.widget.I r4 = r6.f1851k
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.mo2148b((int) r0, (int) r7)
            if (r7 == 0) goto L_0x005f
            boolean r7 = r6.mo2095h(r7)
            if (r7 == 0) goto L_0x005f
            r7 = r2
            goto L_0x0060
        L_0x005f:
            r7 = r3
        L_0x0060:
            r6.f1862v = r3
            r6.f1863w = r3
        L_0x0064:
            if (r1 != 0) goto L_0x0074
            if (r7 != 0) goto L_0x0074
            boolean r7 = r6.m2440e()
            if (r7 != 0) goto L_0x0074
            boolean r7 = r6.f1863w
            if (r7 == 0) goto L_0x0073
            goto L_0x0074
        L_0x0073:
            r2 = r3
        L_0x0074:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p007v4.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !m2441f()) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View d = mo2084d();
        if (d != null && mo2083d(d) == 0) {
            mo2071b();
        }
        return d != null;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        int i5;
        int measuredHeight;
        int i6;
        int i7;
        boolean z2 = true;
        this.f1856p = true;
        int i8 = i3 - i;
        int childCount = getChildCount();
        int i9 = 0;
        while (i9 < childCount) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                C0519d dVar = (C0519d) childAt.getLayoutParams();
                if (mo2095h(childAt)) {
                    int i10 = dVar.leftMargin;
                    childAt.layout(i10, dVar.topMargin, childAt.getMeasuredWidth() + i10, dVar.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    if (mo2067a(childAt, 3)) {
                        float f2 = (float) measuredWidth;
                        i5 = (-measuredWidth) + ((int) (dVar.f1875b * f2));
                        f = ((float) (measuredWidth + i5)) / f2;
                    } else {
                        float f3 = (float) measuredWidth;
                        int i11 = i8 - ((int) (dVar.f1875b * f3));
                        f = ((float) (i8 - i11)) / f3;
                        i5 = i11;
                    }
                    boolean z3 = f != dVar.f1875b ? z2 : false;
                    int i12 = dVar.f1874a & 112;
                    if (i12 != 16) {
                        if (i12 != 80) {
                            measuredHeight = dVar.topMargin;
                            i6 = measuredWidth + i5;
                            i7 = measuredHeight2 + measuredHeight;
                        } else {
                            int i13 = i4 - i2;
                            measuredHeight = (i13 - dVar.bottomMargin) - childAt.getMeasuredHeight();
                            i6 = measuredWidth + i5;
                            i7 = i13 - dVar.bottomMargin;
                        }
                        childAt.layout(i5, measuredHeight, i6, i7);
                    } else {
                        int i14 = i4 - i2;
                        int i15 = (i14 - measuredHeight2) / 2;
                        int i16 = dVar.topMargin;
                        if (i15 < i16) {
                            i15 = i16;
                        } else {
                            int i17 = i15 + measuredHeight2;
                            int i18 = dVar.bottomMargin;
                            if (i17 > i14 - i18) {
                                i15 = (i14 - i18) - measuredHeight2;
                            }
                        }
                        childAt.layout(i5, i15, measuredWidth + i5, measuredHeight2 + i15);
                    }
                    if (z3) {
                        mo2080c(childAt, f);
                    }
                    int i19 = dVar.f1875b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i19) {
                        childAt.setVisibility(i19);
                    }
                }
            }
            i9++;
            z2 = true;
        }
        this.f1856p = false;
        this.f1857q = false;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (isInEditMode()) {
                if (mode != Integer.MIN_VALUE && mode == 0) {
                    size = 300;
                }
                if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                    size2 = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        int i3 = 0;
        boolean z = this.f1838G != null && C0487v.m2291g(this);
        int i4 = C0487v.m2293i(this);
        int childCount = getChildCount();
        int i5 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i5 < childCount) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0519d dVar = (C0519d) childAt.getLayoutParams();
                if (z) {
                    int a = C0466f.m2170a(dVar.f1874a, i4);
                    if (C0487v.m2291g(childAt)) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            WindowInsets windowInsets = (WindowInsets) this.f1838G;
                            if (a == 3) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i3, windowInsets.getSystemWindowInsetBottom());
                            } else if (a == 5) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(i3, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                            childAt.dispatchApplyWindowInsets(windowInsets);
                        }
                    } else if (Build.VERSION.SDK_INT >= 21) {
                        WindowInsets windowInsets2 = (WindowInsets) this.f1838G;
                        if (a == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), i3, windowInsets2.getSystemWindowInsetBottom());
                        } else if (a == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(i3, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        dVar.leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        dVar.topMargin = windowInsets2.getSystemWindowInsetTop();
                        dVar.rightMargin = windowInsets2.getSystemWindowInsetRight();
                        dVar.bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (mo2095h(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - dVar.leftMargin) - dVar.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - dVar.topMargin) - dVar.bottomMargin, 1073741824));
                } else if (mo2097j(childAt)) {
                    if (f1831d) {
                        float f = C0487v.m2290f(childAt);
                        float f2 = this.f1846f;
                        if (f != f2) {
                            C0487v.m2266a(childAt, f2);
                        }
                    }
                    int e = mo2087e(childAt) & 7;
                    int i6 = e == 3 ? 1 : i3;
                    if ((i6 == 0 || !z2) && (i6 != 0 || !z3)) {
                        if (i6 != 0) {
                            z2 = true;
                        } else {
                            z3 = true;
                        }
                        childAt.measure(ViewGroup.getChildMeasureSpec(i, this.f1847g + dVar.leftMargin + dVar.rightMargin, dVar.width), ViewGroup.getChildMeasureSpec(i2, dVar.topMargin + dVar.bottomMargin, dVar.height));
                        i5++;
                        i3 = 0;
                    } else {
                        throw new IllegalStateException("Child drawer has absolute gravity " + m2439e(e) + " but this " + "DrawerLayout" + " already has a " + "drawer view along that edge");
                    }
                } else {
                    throw new IllegalStateException("Child " + childAt + " at index " + i5 + " does not have a valid layout_gravity - must be Gravity.LEFT, " + "Gravity.RIGHT or Gravity.NO_GRAVITY");
                }
            }
            int i7 = i;
            int i8 = i2;
            i5++;
            i3 = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        View b;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo1736a());
        int i = savedState.f1867a;
        if (!(i == 0 || (b = mo2070b(i)) == null)) {
            mo2099l(b);
        }
        int i2 = savedState.f1868b;
        if (i2 != 3) {
            mo2058a(i2, 3);
        }
        int i3 = savedState.f1869c;
        if (i3 != 3) {
            mo2058a(i3, 5);
        }
        int i4 = savedState.f1870d;
        if (i4 != 3) {
            mo2058a(i4, 8388611);
        }
        int i5 = savedState.f1871e;
        if (i5 != 3) {
            mo2058a(i5, 8388613);
        }
    }

    public void onRtlPropertiesChanged(int i) {
        m2445i();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            C0519d dVar = (C0519d) getChildAt(i).getLayoutParams();
            boolean z = true;
            boolean z2 = dVar.f1877d == 1;
            if (dVar.f1877d != 2) {
                z = false;
            }
            if (z2 || z) {
                savedState.f1867a = dVar.f1874a;
            } else {
                i++;
            }
        }
        savedState.f1868b = this.f1858r;
        savedState.f1869c = this.f1859s;
        savedState.f1870d = this.f1860t;
        savedState.f1871e = this.f1861u;
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View c;
        this.f1851k.mo2141a(motionEvent);
        this.f1852l.mo2141a(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action == 1) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                View b = this.f1851k.mo2148b((int) x, (int) y);
                if (b != null && mo2095h(b)) {
                    float f = x - this.f1866z;
                    float f2 = y - this.f1832A;
                    int d = this.f1851k.mo2156d();
                    if (!((f * f) + (f2 * f2) >= ((float) (d * d)) || (c = mo2078c()) == null || mo2083d(c) == 2)) {
                        z = false;
                        mo2066a(z);
                        this.f1862v = false;
                    }
                }
                z = true;
                mo2066a(z);
                this.f1862v = false;
            } else if (action == 3) {
                mo2066a(true);
            }
            return true;
        }
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        this.f1866z = x2;
        this.f1832A = y2;
        this.f1862v = false;
        this.f1863w = false;
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.f1862v = z;
        if (z) {
            mo2066a(true);
        }
    }

    public void requestLayout() {
        if (!this.f1856p) {
            super.requestLayout();
        }
    }

    public void setDrawerElevation(float f) {
        this.f1846f = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (mo2097j(childAt)) {
                C0487v.m2266a(childAt, this.f1846f);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(C0518c cVar) {
        C0518c cVar2 = this.f1864x;
        if (cVar2 != null) {
            mo2073b(cVar2);
        }
        if (cVar != null) {
            mo2061a(cVar);
        }
        this.f1864x = cVar;
    }

    public void setDrawerLockMode(int i) {
        mo2058a(i, 3);
        mo2058a(i, 5);
    }

    public void setScrimColor(int i) {
        this.f1848h = i;
        invalidate();
    }

    public void setStatusBarBackground(int i) {
        this.f1833B = i != 0 ? C1006a.m5394c(getContext(), i) : null;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f1833B = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.f1833B = new ColorDrawable(i);
        invalidate();
    }
}
