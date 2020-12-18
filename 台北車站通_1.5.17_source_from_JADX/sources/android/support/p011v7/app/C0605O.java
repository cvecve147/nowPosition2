package android.support.p011v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.p007v4.view.C0429H;
import android.support.p007v4.view.C0431I;
import android.support.p007v4.view.C0433K;
import android.support.p007v4.view.C0487v;
import android.support.p011v7.app.C0607a;
import android.support.p011v7.view.menu.C0662l;
import android.support.p011v7.widget.ActionBarContainer;
import android.support.p011v7.widget.ActionBarContextView;
import android.support.p011v7.widget.ActionBarOverlayLayout;
import android.support.p011v7.widget.C0744Ra;
import android.support.p011v7.widget.C0798V;
import android.support.p011v7.widget.Toolbar;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p013b.p018b.p040i.p041a.C1103a;
import p013b.p018b.p040i.p041a.C1108f;
import p013b.p018b.p040i.p041a.C1112j;
import p013b.p018b.p040i.p050h.C1135a;
import p013b.p018b.p040i.p050h.C1136b;
import p013b.p018b.p040i.p050h.C1143g;
import p013b.p018b.p040i.p050h.C1147i;

/* renamed from: android.support.v7.app.O */
public class C0605O extends C0607a implements ActionBarOverlayLayout.C0688a {

    /* renamed from: a */
    private static final Interpolator f2277a = new AccelerateInterpolator();

    /* renamed from: b */
    private static final Interpolator f2278b = new DecelerateInterpolator();

    /* renamed from: A */
    private boolean f2279A = true;

    /* renamed from: B */
    C1147i f2280B;

    /* renamed from: C */
    private boolean f2281C;

    /* renamed from: D */
    boolean f2282D;

    /* renamed from: E */
    final C0431I f2283E = new C0602L(this);

    /* renamed from: F */
    final C0431I f2284F = new C0603M(this);

    /* renamed from: G */
    final C0433K f2285G = new C0604N(this);

    /* renamed from: c */
    Context f2286c;

    /* renamed from: d */
    private Context f2287d;

    /* renamed from: e */
    private Activity f2288e;

    /* renamed from: f */
    private Dialog f2289f;

    /* renamed from: g */
    ActionBarOverlayLayout f2290g;

    /* renamed from: h */
    ActionBarContainer f2291h;

    /* renamed from: i */
    C0798V f2292i;

    /* renamed from: j */
    ActionBarContextView f2293j;

    /* renamed from: k */
    View f2294k;

    /* renamed from: l */
    C0744Ra f2295l;

    /* renamed from: m */
    private ArrayList<Object> f2296m = new ArrayList<>();

    /* renamed from: n */
    private int f2297n = -1;

    /* renamed from: o */
    private boolean f2298o;

    /* renamed from: p */
    C0606a f2299p;

    /* renamed from: q */
    C1136b f2300q;

    /* renamed from: r */
    C1136b.C1137a f2301r;

    /* renamed from: s */
    private boolean f2302s;

    /* renamed from: t */
    private ArrayList<C0607a.C0609b> f2303t = new ArrayList<>();

    /* renamed from: u */
    private boolean f2304u;

    /* renamed from: v */
    private int f2305v = 0;

    /* renamed from: w */
    boolean f2306w = true;

    /* renamed from: x */
    boolean f2307x;

    /* renamed from: y */
    boolean f2308y;

    /* renamed from: z */
    private boolean f2309z;

    /* renamed from: android.support.v7.app.O$a */
    public class C0606a extends C1136b implements C0662l.C0663a {

        /* renamed from: c */
        private final Context f2310c;

        /* renamed from: d */
        private final C0662l f2311d;

        /* renamed from: e */
        private C1136b.C1137a f2312e;

        /* renamed from: f */
        private WeakReference<View> f2313f;

        public C0606a(Context context, C1136b.C1137a aVar) {
            this.f2310c = context;
            this.f2312e = aVar;
            C0662l lVar = new C0662l(context);
            lVar.mo2875c(1);
            this.f2311d = lVar;
            this.f2311d.mo2708a((C0662l.C0663a) this);
        }

        /* renamed from: a */
        public void mo2561a() {
            C0605O o = C0605O.this;
            if (o.f2299p == this) {
                if (!C0605O.m2952a(o.f2307x, o.f2308y, false)) {
                    C0605O o2 = C0605O.this;
                    o2.f2300q = this;
                    o2.f2301r = this.f2312e;
                } else {
                    this.f2312e.mo2486a(this);
                }
                this.f2312e = null;
                C0605O.this.mo2552g(false);
                C0605O.this.f2293j.mo3108a();
                C0605O.this.f2292i.mo4393l().sendAccessibilityEvent(32);
                C0605O o3 = C0605O.this;
                o3.f2290g.setHideOnContentScrollEnabled(o3.f2282D);
                C0605O.this.f2299p = null;
            }
        }

        /* renamed from: a */
        public void mo2562a(int i) {
            mo2564a((CharSequence) C0605O.this.f2286c.getResources().getString(i));
        }

        /* renamed from: a */
        public void mo362a(C0662l lVar) {
            if (this.f2312e != null) {
                mo2573i();
                C0605O.this.f2293j.mo3112d();
            }
        }

        /* renamed from: a */
        public void mo2563a(View view) {
            C0605O.this.f2293j.setCustomView(view);
            this.f2313f = new WeakReference<>(view);
        }

        /* renamed from: a */
        public void mo2564a(CharSequence charSequence) {
            C0605O.this.f2293j.setSubtitle(charSequence);
        }

        /* renamed from: a */
        public void mo2565a(boolean z) {
            super.mo2565a(z);
            C0605O.this.f2293j.setTitleOptional(z);
        }

        /* renamed from: a */
        public boolean mo363a(C0662l lVar, MenuItem menuItem) {
            C1136b.C1137a aVar = this.f2312e;
            if (aVar != null) {
                return aVar.mo2488a((C1136b) this, menuItem);
            }
            return false;
        }

        /* renamed from: b */
        public View mo2566b() {
            WeakReference<View> weakReference = this.f2313f;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        /* renamed from: b */
        public void mo2567b(int i) {
            mo2568b((CharSequence) C0605O.this.f2286c.getResources().getString(i));
        }

        /* renamed from: b */
        public void mo2568b(CharSequence charSequence) {
            C0605O.this.f2293j.setTitle(charSequence);
        }

        /* renamed from: c */
        public Menu mo2569c() {
            return this.f2311d;
        }

        /* renamed from: d */
        public MenuInflater mo2570d() {
            return new C1143g(this.f2310c);
        }

        /* renamed from: e */
        public CharSequence mo2571e() {
            return C0605O.this.f2293j.getSubtitle();
        }

        /* renamed from: g */
        public CharSequence mo2572g() {
            return C0605O.this.f2293j.getTitle();
        }

        /* renamed from: i */
        public void mo2573i() {
            if (C0605O.this.f2299p == this) {
                this.f2311d.mo2903r();
                try {
                    this.f2312e.mo2489b(this, this.f2311d);
                } finally {
                    this.f2311d.mo2902q();
                }
            }
        }

        /* renamed from: j */
        public boolean mo2574j() {
            return C0605O.this.f2293j.mo3110b();
        }

        /* renamed from: k */
        public boolean mo2575k() {
            this.f2311d.mo2903r();
            try {
                return this.f2312e.mo2487a((C1136b) this, (Menu) this.f2311d);
            } finally {
                this.f2311d.mo2902q();
            }
        }
    }

    public C0605O(Activity activity, boolean z) {
        this.f2288e = activity;
        View decorView = activity.getWindow().getDecorView();
        m2954c(decorView);
        if (!z) {
            this.f2294k = decorView.findViewById(16908290);
        }
    }

    public C0605O(Dialog dialog) {
        this.f2289f = dialog;
        m2954c(dialog.getWindow().getDecorView());
    }

    /* renamed from: a */
    static boolean m2952a(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return !z && !z2;
    }

    /* renamed from: b */
    private C0798V m2953b(View view) {
        if (view instanceof C0798V) {
            return (C0798V) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view);
        throw new IllegalStateException(sb.toString() != null ? view.getClass().getSimpleName() : "null");
    }

    /* renamed from: c */
    private void m2954c(View view) {
        this.f2290g = (ActionBarOverlayLayout) view.findViewById(C1108f.decor_content_parent);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2290g;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f2292i = m2953b(view.findViewById(C1108f.action_bar));
        this.f2293j = (ActionBarContextView) view.findViewById(C1108f.action_context_bar);
        this.f2291h = (ActionBarContainer) view.findViewById(C1108f.action_bar_container);
        C0798V v = this.f2292i;
        if (v == null || this.f2293j == null || this.f2291h == null) {
            throw new IllegalStateException(C0605O.class.getSimpleName() + " can only be used " + "with a compatible window decor layout");
        }
        this.f2286c = v.getContext();
        boolean z = (this.f2292i.mo4394m() & 4) != 0;
        if (z) {
            this.f2298o = true;
        }
        C1135a a = C1135a.m5761a(this.f2286c);
        mo2526e(a.mo5307a() || z);
        m2955k(a.mo5312f());
        TypedArray obtainStyledAttributes = this.f2286c.obtainStyledAttributes((AttributeSet) null, C1112j.ActionBar, C1103a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(C1112j.ActionBar_hideOnContentScroll, false)) {
            mo2555j(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C1112j.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            mo2545a((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: k */
    private void m2955k(boolean z) {
        this.f2304u = z;
        if (!this.f2304u) {
            this.f2292i.mo4372a((C0744Ra) null);
            this.f2291h.setTabContainer(this.f2295l);
        } else {
            this.f2291h.setTabContainer((C0744Ra) null);
            this.f2292i.mo4372a(this.f2295l);
        }
        boolean z2 = true;
        boolean z3 = mo2560q() == 2;
        C0744Ra ra = this.f2295l;
        if (ra != null) {
            if (z3) {
                ra.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2290g;
                if (actionBarOverlayLayout != null) {
                    C0487v.m2262C(actionBarOverlayLayout);
                }
            } else {
                ra.setVisibility(8);
            }
        }
        this.f2292i.mo4379b(!this.f2304u && z3);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2290g;
        if (this.f2304u || !z3) {
            z2 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z2);
    }

    /* renamed from: l */
    private void m2956l(boolean z) {
        if (m2952a(this.f2307x, this.f2308y, this.f2309z)) {
            if (!this.f2279A) {
                this.f2279A = true;
                mo2554i(z);
            }
        } else if (this.f2279A) {
            this.f2279A = false;
            mo2553h(z);
        }
    }

    /* renamed from: r */
    private void m2957r() {
        if (this.f2309z) {
            this.f2309z = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f2290g;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m2956l(false);
        }
    }

    /* renamed from: s */
    private boolean m2958s() {
        return C0487v.m2309y(this.f2291h);
    }

    /* renamed from: t */
    private void m2959t() {
        if (!this.f2309z) {
            this.f2309z = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f2290g;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            m2956l(false);
        }
    }

    /* renamed from: a */
    public C1136b mo2543a(C1136b.C1137a aVar) {
        C0606a aVar2 = this.f2299p;
        if (aVar2 != null) {
            aVar2.mo2561a();
        }
        this.f2290g.setHideOnContentScrollEnabled(false);
        this.f2293j.mo3111c();
        C0606a aVar3 = new C0606a(this.f2293j.getContext(), aVar);
        if (!aVar3.mo2575k()) {
            return null;
        }
        this.f2299p = aVar3;
        aVar3.mo2573i();
        this.f2293j.mo3109a(aVar3);
        mo2552g(true);
        this.f2293j.sendAccessibilityEvent(32);
        return aVar3;
    }

    /* renamed from: a */
    public void mo2544a() {
        if (this.f2308y) {
            this.f2308y = false;
            m2956l(true);
        }
    }

    /* renamed from: a */
    public void mo2545a(float f) {
        C0487v.m2266a((View) this.f2291h, f);
    }

    /* renamed from: a */
    public void mo2514a(int i) {
        mo2547a(LayoutInflater.from(mo2531h()).inflate(i, this.f2292i.mo4393l(), false));
    }

    /* renamed from: a */
    public void mo2546a(int i, int i2) {
        int m = this.f2292i.mo4394m();
        if ((i2 & 4) != 0) {
            this.f2298o = true;
        }
        this.f2292i.mo4370a((i & i2) | ((~i2) & m));
    }

    /* renamed from: a */
    public void mo2516a(Configuration configuration) {
        m2955k(C1135a.m5761a(this.f2286c).mo5312f());
    }

    /* renamed from: a */
    public void mo2547a(View view) {
        this.f2292i.mo4374a(view);
    }

    /* renamed from: a */
    public void mo2519a(CharSequence charSequence) {
        this.f2292i.setWindowTitle(charSequence);
    }

    /* renamed from: a */
    public void mo2548a(boolean z) {
        this.f2306w = z;
    }

    /* renamed from: a */
    public boolean mo2520a(int i, KeyEvent keyEvent) {
        Menu c;
        C0606a aVar = this.f2299p;
        if (aVar == null || (c = aVar.mo2569c()) == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        c.setQwertyMode(z);
        return c.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: b */
    public void mo2549b() {
    }

    /* renamed from: b */
    public void mo2522b(int i) {
        if ((i & 4) != 0) {
            this.f2298o = true;
        }
        this.f2292i.mo4370a(i);
    }

    /* renamed from: b */
    public void mo2523b(boolean z) {
        if (z != this.f2302s) {
            this.f2302s = z;
            int size = this.f2303t.size();
            for (int i = 0; i < size; i++) {
                this.f2303t.get(i).onMenuVisibilityChanged(z);
            }
        }
    }

    /* renamed from: c */
    public void mo2550c() {
        if (!this.f2308y) {
            this.f2308y = true;
            m2956l(true);
        }
    }

    /* renamed from: c */
    public void mo2524c(boolean z) {
        if (!this.f2298o) {
            mo2525d(z);
        }
    }

    /* renamed from: d */
    public void mo2551d() {
        C1147i iVar = this.f2280B;
        if (iVar != null) {
            iVar.mo5358a();
            this.f2280B = null;
        }
    }

    /* renamed from: d */
    public void mo2525d(boolean z) {
        mo2546a(z ? 4 : 0, 4);
    }

    /* renamed from: e */
    public void mo2526e(boolean z) {
        this.f2292i.mo4375a(z);
    }

    /* renamed from: f */
    public void mo2528f(boolean z) {
        C1147i iVar;
        this.f2281C = z;
        if (!z && (iVar = this.f2280B) != null) {
            iVar.mo5358a();
        }
    }

    /* renamed from: f */
    public boolean mo2529f() {
        C0798V v = this.f2292i;
        if (v == null || !v.mo4390i()) {
            return false;
        }
        this.f2292i.collapseActionView();
        return true;
    }

    /* renamed from: g */
    public int mo2530g() {
        return this.f2292i.mo4394m();
    }

    /* renamed from: g */
    public void mo2552g(boolean z) {
        C0429H h;
        C0429H h2;
        if (z) {
            m2959t();
        } else {
            m2957r();
        }
        if (m2958s()) {
            if (z) {
                h = this.f2292i.mo4369a(4, 100);
                h2 = this.f2293j.mo3107a(0, 200);
            } else {
                h2 = this.f2292i.mo4369a(0, 200);
                h = this.f2293j.mo3107a(8, 100);
            }
            C1147i iVar = new C1147i();
            iVar.mo5355a(h, h2);
            iVar.mo5360c();
        } else if (z) {
            this.f2292i.mo4380c(4);
            this.f2293j.setVisibility(0);
        } else {
            this.f2292i.mo4380c(0);
            this.f2293j.setVisibility(8);
        }
    }

    /* renamed from: h */
    public Context mo2531h() {
        if (this.f2287d == null) {
            TypedValue typedValue = new TypedValue();
            this.f2286c.getTheme().resolveAttribute(C1103a.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f2287d = new ContextThemeWrapper(this.f2286c, i);
            } else {
                this.f2287d = this.f2286c;
            }
        }
        return this.f2287d;
    }

    /* renamed from: h */
    public void mo2553h(boolean z) {
        View view;
        C1147i iVar = this.f2280B;
        if (iVar != null) {
            iVar.mo5358a();
        }
        if (this.f2305v != 0 || (!this.f2281C && !z)) {
            this.f2283E.mo1764b((View) null);
            return;
        }
        this.f2291h.setAlpha(1.0f);
        this.f2291h.setTransitioning(true);
        C1147i iVar2 = new C1147i();
        float f = (float) (-this.f2291h.getHeight());
        if (z) {
            int[] iArr = {0, 0};
            this.f2291h.getLocationInWindow(iArr);
            f -= (float) iArr[1];
        }
        C0429H a = C0487v.m2264a(this.f2291h);
        a.mo1760b(f);
        a.mo1756a(this.f2285G);
        iVar2.mo5354a(a);
        if (this.f2306w && (view = this.f2294k) != null) {
            C0429H a2 = C0487v.m2264a(view);
            a2.mo1760b(f);
            iVar2.mo5354a(a2);
        }
        iVar2.mo5357a(f2277a);
        iVar2.mo5353a(250);
        iVar2.mo5356a(this.f2283E);
        this.f2280B = iVar2;
        iVar2.mo5360c();
    }

    /* renamed from: i */
    public void mo2532i() {
        if (!this.f2307x) {
            this.f2307x = true;
            m2956l(false);
        }
    }

    /* renamed from: i */
    public void mo2554i(boolean z) {
        View view;
        View view2;
        C1147i iVar = this.f2280B;
        if (iVar != null) {
            iVar.mo5358a();
        }
        this.f2291h.setVisibility(0);
        if (this.f2305v != 0 || (!this.f2281C && !z)) {
            this.f2291h.setAlpha(1.0f);
            this.f2291h.setTranslationY(0.0f);
            if (this.f2306w && (view = this.f2294k) != null) {
                view.setTranslationY(0.0f);
            }
            this.f2284F.mo1764b((View) null);
        } else {
            this.f2291h.setTranslationY(0.0f);
            float f = (float) (-this.f2291h.getHeight());
            if (z) {
                int[] iArr = {0, 0};
                this.f2291h.getLocationInWindow(iArr);
                f -= (float) iArr[1];
            }
            this.f2291h.setTranslationY(f);
            C1147i iVar2 = new C1147i();
            C0429H a = C0487v.m2264a(this.f2291h);
            a.mo1760b(0.0f);
            a.mo1756a(this.f2285G);
            iVar2.mo5354a(a);
            if (this.f2306w && (view2 = this.f2294k) != null) {
                view2.setTranslationY(f);
                C0429H a2 = C0487v.m2264a(this.f2294k);
                a2.mo1760b(0.0f);
                iVar2.mo5354a(a2);
            }
            iVar2.mo5357a(f2278b);
            iVar2.mo5353a(250);
            iVar2.mo5356a(this.f2284F);
            this.f2280B = iVar2;
            iVar2.mo5360c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2290g;
        if (actionBarOverlayLayout != null) {
            C0487v.m2262C(actionBarOverlayLayout);
        }
    }

    /* renamed from: j */
    public void mo2555j(boolean z) {
        if (!z || this.f2290g.mo3151i()) {
            this.f2282D = z;
            this.f2290g.setHideOnContentScrollEnabled(z);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    /* renamed from: k */
    public boolean mo2534k() {
        int o = mo2557o();
        return this.f2279A && (o == 0 || mo2559p() < o);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo2556n() {
        C1136b.C1137a aVar = this.f2301r;
        if (aVar != null) {
            aVar.mo2486a(this.f2300q);
            this.f2300q = null;
            this.f2301r = null;
        }
    }

    /* renamed from: o */
    public int mo2557o() {
        return this.f2291h.getHeight();
    }

    public void onWindowVisibilityChanged(int i) {
        this.f2305v = i;
    }

    /* renamed from: p */
    public int mo2559p() {
        return this.f2290g.getActionBarHideOffset();
    }

    /* renamed from: q */
    public int mo2560q() {
        return this.f2292i.mo4392k();
    }
}
