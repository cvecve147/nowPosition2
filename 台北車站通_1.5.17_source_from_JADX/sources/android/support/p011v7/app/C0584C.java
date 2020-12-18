package android.support.p011v7.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.p007v4.app.C0295W;
import android.support.p007v4.view.C0429H;
import android.support.p007v4.view.C0431I;
import android.support.p007v4.view.C0467g;
import android.support.p007v4.view.C0482q;
import android.support.p007v4.view.C0487v;
import android.support.p011v7.view.menu.C0659j;
import android.support.p011v7.view.menu.C0662l;
import android.support.p011v7.view.menu.C0679v;
import android.support.p011v7.view.menu.C0681w;
import android.support.p011v7.widget.ActionBarContextView;
import android.support.p011v7.widget.C0796U;
import android.support.p011v7.widget.C0855la;
import android.support.p011v7.widget.C0871p;
import android.support.p011v7.widget.C0884rb;
import android.support.p011v7.widget.C0902ub;
import android.support.p011v7.widget.ContentFrameLayout;
import android.support.p011v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import org.xmlpull.v1.XmlPullParser;
import p013b.p018b.p040i.p041a.C1103a;
import p013b.p018b.p040i.p041a.C1105c;
import p013b.p018b.p040i.p041a.C1108f;
import p013b.p018b.p040i.p041a.C1109g;
import p013b.p018b.p040i.p041a.C1111i;
import p013b.p018b.p040i.p041a.C1112j;
import p013b.p018b.p040i.p043c.p044a.C1118b;
import p013b.p018b.p040i.p050h.C1136b;
import p013b.p018b.p040i.p050h.C1139d;

/* renamed from: android.support.v7.app.C */
class C0584C extends C0627q implements C0662l.C0663a, LayoutInflater.Factory2 {

    /* renamed from: u */
    private static final boolean f2186u = (Build.VERSION.SDK_INT < 21);

    /* renamed from: A */
    PopupWindow f2187A;

    /* renamed from: B */
    Runnable f2188B;

    /* renamed from: C */
    C0429H f2189C = null;

    /* renamed from: D */
    private boolean f2190D;

    /* renamed from: E */
    private ViewGroup f2191E;

    /* renamed from: F */
    private TextView f2192F;

    /* renamed from: G */
    private View f2193G;

    /* renamed from: H */
    private boolean f2194H;

    /* renamed from: I */
    private boolean f2195I;

    /* renamed from: J */
    private boolean f2196J;

    /* renamed from: K */
    private C0588d[] f2197K;

    /* renamed from: L */
    private C0588d f2198L;

    /* renamed from: M */
    private boolean f2199M;

    /* renamed from: N */
    boolean f2200N;

    /* renamed from: O */
    int f2201O;

    /* renamed from: P */
    private final Runnable f2202P = new C0637v(this);

    /* renamed from: Q */
    private boolean f2203Q;

    /* renamed from: R */
    private Rect f2204R;

    /* renamed from: S */
    private Rect f2205S;

    /* renamed from: T */
    private AppCompatViewInflater f2206T;

    /* renamed from: v */
    private C0796U f2207v;

    /* renamed from: w */
    private C0585a f2208w;

    /* renamed from: x */
    private C0589e f2209x;

    /* renamed from: y */
    C1136b f2210y;

    /* renamed from: z */
    ActionBarContextView f2211z;

    /* renamed from: android.support.v7.app.C$a */
    private final class C0585a implements C0679v.C0680a {
        C0585a() {
        }

        /* renamed from: a */
        public void mo2484a(C0662l lVar, boolean z) {
            C0584C.this.mo2462b(lVar);
        }

        /* renamed from: a */
        public boolean mo2485a(C0662l lVar) {
            Window.Callback n = C0584C.this.mo2647n();
            if (n == null) {
                return true;
            }
            n.onMenuOpened(108, lVar);
            return true;
        }
    }

    /* renamed from: android.support.v7.app.C$b */
    class C0586b implements C1136b.C1137a {

        /* renamed from: a */
        private C1136b.C1137a f2213a;

        public C0586b(C1136b.C1137a aVar) {
            this.f2213a = aVar;
        }

        /* renamed from: a */
        public void mo2486a(C1136b bVar) {
            this.f2213a.mo2486a(bVar);
            C0584C c = C0584C.this;
            if (c.f2187A != null) {
                c.f2354g.getDecorView().removeCallbacks(C0584C.this.f2188B);
            }
            C0584C c2 = C0584C.this;
            if (c2.f2211z != null) {
                c2.mo2481s();
                C0584C c3 = C0584C.this;
                C0429H a = C0487v.m2264a(c3.f2211z);
                a.mo1753a(0.0f);
                c3.f2189C = a;
                C0584C.this.f2189C.mo1755a((C0431I) new C0590D(this));
            }
            C0584C c4 = C0584C.this;
            C0624n nVar = c4.f2357j;
            if (nVar != null) {
                nVar.mo2499a(c4.f2210y);
            }
            C0584C.this.f2210y = null;
        }

        /* renamed from: a */
        public boolean mo2487a(C1136b bVar, Menu menu) {
            return this.f2213a.mo2487a(bVar, menu);
        }

        /* renamed from: a */
        public boolean mo2488a(C1136b bVar, MenuItem menuItem) {
            return this.f2213a.mo2488a(bVar, menuItem);
        }

        /* renamed from: b */
        public boolean mo2489b(C1136b bVar, Menu menu) {
            return this.f2213a.mo2489b(bVar, menu);
        }
    }

    /* renamed from: android.support.v7.app.C$c */
    private class C0587c extends ContentFrameLayout {
        public C0587c(Context context) {
            super(context);
        }

        /* renamed from: a */
        private boolean m2892a(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return C0584C.this.mo2457a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !m2892a((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            C0584C.this.mo2469d(0);
            return true;
        }

        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C1118b.m5721b(getContext(), i));
        }
    }

    /* renamed from: android.support.v7.app.C$d */
    protected static final class C0588d {

        /* renamed from: a */
        int f2216a;

        /* renamed from: b */
        int f2217b;

        /* renamed from: c */
        int f2218c;

        /* renamed from: d */
        int f2219d;

        /* renamed from: e */
        int f2220e;

        /* renamed from: f */
        int f2221f;

        /* renamed from: g */
        ViewGroup f2222g;

        /* renamed from: h */
        View f2223h;

        /* renamed from: i */
        View f2224i;

        /* renamed from: j */
        C0662l f2225j;

        /* renamed from: k */
        C0659j f2226k;

        /* renamed from: l */
        Context f2227l;

        /* renamed from: m */
        boolean f2228m;

        /* renamed from: n */
        boolean f2229n;

        /* renamed from: o */
        boolean f2230o;

        /* renamed from: p */
        public boolean f2231p;

        /* renamed from: q */
        boolean f2232q = false;

        /* renamed from: r */
        boolean f2233r;

        /* renamed from: s */
        Bundle f2234s;

        C0588d(int i) {
            this.f2216a = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0681w mo2493a(C0679v.C0680a aVar) {
            if (this.f2225j == null) {
                return null;
            }
            if (this.f2226k == null) {
                this.f2226k = new C0659j(this.f2227l, C1109g.abc_list_menu_item_layout);
                this.f2226k.mo2695a(aVar);
                this.f2225j.mo2856a((C0679v) this.f2226k);
            }
            return this.f2226k.mo2828a(this.f2222g);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2494a(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C1103a.actionBarPopupTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                newTheme.applyStyle(i, true);
            }
            newTheme.resolveAttribute(C1103a.panelMenuListTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 == 0) {
                i2 = C1111i.Theme_AppCompat_CompactMenu;
            }
            newTheme.applyStyle(i2, true);
            C1139d dVar = new C1139d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f2227l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(C1112j.AppCompatTheme);
            this.f2217b = obtainStyledAttributes.getResourceId(C1112j.AppCompatTheme_panelBackground, 0);
            this.f2221f = obtainStyledAttributes.getResourceId(C1112j.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2495a(C0662l lVar) {
            C0659j jVar;
            C0662l lVar2 = this.f2225j;
            if (lVar != lVar2) {
                if (lVar2 != null) {
                    lVar2.mo2874b((C0679v) this.f2226k);
                }
                this.f2225j = lVar;
                if (lVar != null && (jVar = this.f2226k) != null) {
                    lVar.mo2856a((C0679v) jVar);
                }
            }
        }

        /* renamed from: a */
        public boolean mo2496a() {
            if (this.f2223h == null) {
                return false;
            }
            if (this.f2224i != null) {
                return true;
            }
            return this.f2226k.mo2831c().getCount() > 0;
        }
    }

    /* renamed from: android.support.v7.app.C$e */
    private final class C0589e implements C0679v.C0680a {
        C0589e() {
        }

        /* renamed from: a */
        public void mo2484a(C0662l lVar, boolean z) {
            C0662l m = lVar.mo2714m();
            boolean z2 = m != lVar;
            C0584C c = C0584C.this;
            if (z2) {
                lVar = m;
            }
            C0588d a = c.mo2443a((Menu) lVar);
            if (a == null) {
                return;
            }
            if (z2) {
                C0584C.this.mo2447a(a.f2216a, a, m);
                C0584C.this.mo2450a(a, true);
                return;
            }
            C0584C.this.mo2450a(a, z);
        }

        /* renamed from: a */
        public boolean mo2485a(C0662l lVar) {
            Window.Callback n;
            if (lVar != null) {
                return true;
            }
            C0584C c = C0584C.this;
            if (!c.f2360m || (n = c.mo2647n()) == null || C0584C.this.mo2648p()) {
                return true;
            }
            n.onMenuOpened(108, lVar);
            return true;
        }
    }

    C0584C(Context context, Window window, C0624n nVar) {
        super(context, window, nVar);
    }

    /* renamed from: a */
    private void m2828a(C0588d dVar, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (!dVar.f2230o && !mo2648p()) {
            if (dVar.f2216a == 0) {
                if ((this.f2353f.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Window.Callback n = mo2647n();
            if (n == null || n.onMenuOpened(dVar.f2216a, dVar.f2225j)) {
                WindowManager windowManager = (WindowManager) this.f2353f.getSystemService("window");
                if (windowManager != null && m2834b(dVar, keyEvent)) {
                    if (dVar.f2222g == null || dVar.f2232q) {
                        ViewGroup viewGroup = dVar.f2222g;
                        if (viewGroup == null) {
                            if (!m2833b(dVar) || dVar.f2222g == null) {
                                return;
                            }
                        } else if (dVar.f2232q && viewGroup.getChildCount() > 0) {
                            dVar.f2222g.removeAllViews();
                        }
                        if (m2830a(dVar) && dVar.mo2496a()) {
                            ViewGroup.LayoutParams layoutParams2 = dVar.f2223h.getLayoutParams();
                            if (layoutParams2 == null) {
                                layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                            }
                            dVar.f2222g.setBackgroundResource(dVar.f2217b);
                            ViewParent parent = dVar.f2223h.getParent();
                            if (parent != null && (parent instanceof ViewGroup)) {
                                ((ViewGroup) parent).removeView(dVar.f2223h);
                            }
                            dVar.f2222g.addView(dVar.f2223h, layoutParams2);
                            if (!dVar.f2223h.hasFocus()) {
                                dVar.f2223h.requestFocus();
                            }
                        } else {
                            return;
                        }
                    } else {
                        View view = dVar.f2224i;
                        if (!(view == null || (layoutParams = view.getLayoutParams()) == null || layoutParams.width != -1)) {
                            i = -1;
                            dVar.f2229n = false;
                            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, dVar.f2219d, dVar.f2220e, 1002, 8519680, -3);
                            layoutParams3.gravity = dVar.f2218c;
                            layoutParams3.windowAnimations = dVar.f2221f;
                            windowManager.addView(dVar.f2222g, layoutParams3);
                            dVar.f2230o = true;
                            return;
                        }
                    }
                    i = -2;
                    dVar.f2229n = false;
                    WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, dVar.f2219d, dVar.f2220e, 1002, 8519680, -3);
                    layoutParams32.gravity = dVar.f2218c;
                    layoutParams32.windowAnimations = dVar.f2221f;
                    windowManager.addView(dVar.f2222g, layoutParams32);
                    dVar.f2230o = true;
                    return;
                }
                return;
            }
            mo2450a(dVar, true);
        }
    }

    /* renamed from: a */
    private void m2829a(C0662l lVar, boolean z) {
        C0796U u = this.f2207v;
        if (u == null || !u.mo3136c() || (ViewConfiguration.get(this.f2353f).hasPermanentMenuKey() && !this.f2207v.mo3138d())) {
            C0588d a = mo2442a(0, true);
            a.f2232q = true;
            mo2450a(a, false);
            m2828a(a, (KeyEvent) null);
            return;
        }
        Window.Callback n = mo2647n();
        if (this.f2207v.mo3134a() && z) {
            this.f2207v.mo3140e();
            if (!mo2648p()) {
                n.onPanelClosed(108, mo2442a(0, true).f2225j);
            }
        } else if (n != null && !mo2648p()) {
            if (this.f2200N && (this.f2201O & 1) != 0) {
                this.f2354g.getDecorView().removeCallbacks(this.f2202P);
                this.f2202P.run();
            }
            C0588d a2 = mo2442a(0, true);
            C0662l lVar2 = a2.f2225j;
            if (lVar2 != null && !a2.f2233r && n.onPreparePanel(0, a2.f2224i, lVar2)) {
                n.onMenuOpened(108, a2.f2225j);
                this.f2207v.mo3141f();
            }
        }
    }

    /* renamed from: a */
    private boolean m2830a(C0588d dVar) {
        View view = dVar.f2224i;
        if (view != null) {
            dVar.f2223h = view;
            return true;
        } else if (dVar.f2225j == null) {
            return false;
        } else {
            if (this.f2209x == null) {
                this.f2209x = new C0589e();
            }
            dVar.f2223h = (View) dVar.mo2493a((C0679v.C0680a) this.f2209x);
            return dVar.f2223h != null;
        }
    }

    /* renamed from: a */
    private boolean m2831a(C0588d dVar, int i, KeyEvent keyEvent, int i2) {
        C0662l lVar;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((dVar.f2228m || m2834b(dVar, keyEvent)) && (lVar = dVar.f2225j) != null) {
            z = lVar.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.f2207v == null) {
            mo2450a(dVar, true);
        }
        return z;
    }

    /* renamed from: a */
    private boolean m2832a(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f2354g.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || C0487v.m2308x((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* renamed from: b */
    private boolean m2833b(C0588d dVar) {
        dVar.mo2494a(mo2645l());
        dVar.f2222g = new C0587c(dVar.f2227l);
        dVar.f2218c = 81;
        return true;
    }

    /* renamed from: b */
    private boolean m2834b(C0588d dVar, KeyEvent keyEvent) {
        C0796U u;
        C0796U u2;
        C0796U u3;
        if (mo2648p()) {
            return false;
        }
        if (dVar.f2228m) {
            return true;
        }
        C0588d dVar2 = this.f2198L;
        if (!(dVar2 == null || dVar2 == dVar)) {
            mo2450a(dVar2, false);
        }
        Window.Callback n = mo2647n();
        if (n != null) {
            dVar.f2224i = n.onCreatePanelView(dVar.f2216a);
        }
        int i = dVar.f2216a;
        boolean z = i == 0 || i == 108;
        if (z && (u3 = this.f2207v) != null) {
            u3.mo3135b();
        }
        if (dVar.f2224i == null && (!z || !(mo2649q() instanceof C0595I))) {
            if (dVar.f2225j == null || dVar.f2233r) {
                if (dVar.f2225j == null && (!m2835c(dVar) || dVar.f2225j == null)) {
                    return false;
                }
                if (z && this.f2207v != null) {
                    if (this.f2208w == null) {
                        this.f2208w = new C0585a();
                    }
                    this.f2207v.mo3133a(dVar.f2225j, this.f2208w);
                }
                dVar.f2225j.mo2903r();
                if (!n.onCreatePanelMenu(dVar.f2216a, dVar.f2225j)) {
                    dVar.mo2495a((C0662l) null);
                    if (z && (u2 = this.f2207v) != null) {
                        u2.mo3133a((Menu) null, this.f2208w);
                    }
                    return false;
                }
                dVar.f2233r = false;
            }
            dVar.f2225j.mo2903r();
            Bundle bundle = dVar.f2234s;
            if (bundle != null) {
                dVar.f2225j.mo2855a(bundle);
                dVar.f2234s = null;
            }
            if (!n.onPreparePanel(0, dVar.f2224i, dVar.f2225j)) {
                if (z && (u = this.f2207v) != null) {
                    u.mo3133a((Menu) null, this.f2208w);
                }
                dVar.f2225j.mo2902q();
                return false;
            }
            dVar.f2231p = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            dVar.f2225j.setQwertyMode(dVar.f2231p);
            dVar.f2225j.mo2902q();
        }
        dVar.f2228m = true;
        dVar.f2229n = false;
        this.f2198L = dVar;
        return true;
    }

    /* renamed from: c */
    private boolean m2835c(C0588d dVar) {
        Context context = this.f2353f;
        int i = dVar.f2216a;
        if ((i == 0 || i == 108) && this.f2207v != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(C1103a.actionBarTheme, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(C1103a.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(C1103a.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                C1139d dVar2 = new C1139d(context, 0);
                dVar2.getTheme().setTo(theme2);
                context = dVar2;
            }
        }
        C0662l lVar = new C0662l(context);
        lVar.mo2708a((C0662l.C0663a) this);
        dVar.mo2495a(lVar);
        return true;
    }

    /* renamed from: d */
    private boolean m2836d(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        C0588d a = mo2442a(i, true);
        if (!a.f2230o) {
            return m2834b(a, keyEvent);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006e  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m2837e(int r4, android.view.KeyEvent r5) {
        /*
            r3 = this;
            b.b.i.h.b r0 = r3.f2210y
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 1
            android.support.v7.app.C$d r2 = r3.mo2442a((int) r4, (boolean) r0)
            if (r4 != 0) goto L_0x0045
            android.support.v7.widget.U r4 = r3.f2207v
            if (r4 == 0) goto L_0x0045
            boolean r4 = r4.mo3136c()
            if (r4 == 0) goto L_0x0045
            android.content.Context r4 = r3.f2353f
            android.view.ViewConfiguration r4 = android.view.ViewConfiguration.get(r4)
            boolean r4 = r4.hasPermanentMenuKey()
            if (r4 != 0) goto L_0x0045
            android.support.v7.widget.U r4 = r3.f2207v
            boolean r4 = r4.mo3134a()
            if (r4 != 0) goto L_0x003e
            boolean r4 = r3.mo2648p()
            if (r4 != 0) goto L_0x0065
            boolean r4 = r3.m2834b((android.support.p011v7.app.C0584C.C0588d) r2, (android.view.KeyEvent) r5)
            if (r4 == 0) goto L_0x0065
            android.support.v7.widget.U r4 = r3.f2207v
            boolean r4 = r4.mo3141f()
            goto L_0x006c
        L_0x003e:
            android.support.v7.widget.U r4 = r3.f2207v
            boolean r4 = r4.mo3140e()
            goto L_0x006c
        L_0x0045:
            boolean r4 = r2.f2230o
            if (r4 != 0) goto L_0x0067
            boolean r4 = r2.f2229n
            if (r4 == 0) goto L_0x004e
            goto L_0x0067
        L_0x004e:
            boolean r4 = r2.f2228m
            if (r4 == 0) goto L_0x0065
            boolean r4 = r2.f2233r
            if (r4 == 0) goto L_0x005d
            r2.f2228m = r1
            boolean r4 = r3.m2834b((android.support.p011v7.app.C0584C.C0588d) r2, (android.view.KeyEvent) r5)
            goto L_0x005e
        L_0x005d:
            r4 = r0
        L_0x005e:
            if (r4 == 0) goto L_0x0065
            r3.m2828a((android.support.p011v7.app.C0584C.C0588d) r2, (android.view.KeyEvent) r5)
            r4 = r0
            goto L_0x006c
        L_0x0065:
            r4 = r1
            goto L_0x006c
        L_0x0067:
            boolean r4 = r2.f2230o
            r3.mo2450a((android.support.p011v7.app.C0584C.C0588d) r2, (boolean) r0)
        L_0x006c:
            if (r4 == 0) goto L_0x0085
            android.content.Context r5 = r3.f2353f
            java.lang.String r0 = "audio"
            java.lang.Object r5 = r5.getSystemService(r0)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L_0x007e
            r5.playSoundEffect(r1)
            goto L_0x0085
        L_0x007e:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r0 = "Couldn't get audio manager"
            android.util.Log.w(r5, r0)
        L_0x0085:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.app.C0584C.m2837e(int, android.view.KeyEvent):boolean");
    }

    /* renamed from: g */
    private void mo2657g(int i) {
        this.f2201O = (1 << i) | this.f2201O;
        if (!this.f2200N) {
            C0487v.m2277a(this.f2354g.getDecorView(), this.f2202P);
            this.f2200N = true;
        }
    }

    /* renamed from: h */
    private int m2839h(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i != 9) {
            return i;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
    }

    /* renamed from: v */
    private void mo2658v() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f2191E.findViewById(16908290);
        View decorView = this.f2354g.getDecorView();
        contentFrameLayout.mo3304a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f2353f.obtainStyledAttributes(C1112j.AppCompatTheme);
        obtainStyledAttributes.getValue(C1112j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(C1112j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(C1112j.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes.getValue(C1112j.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(C1112j.AppCompatTheme_windowFixedWidthMinor)) {
            obtainStyledAttributes.getValue(C1112j.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(C1112j.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes.getValue(C1112j.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(C1112j.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes.getValue(C1112j.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* renamed from: w */
    private ViewGroup m2841w() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f2353f.obtainStyledAttributes(C1112j.AppCompatTheme);
        if (obtainStyledAttributes.hasValue(C1112j.AppCompatTheme_windowActionBar)) {
            if (obtainStyledAttributes.getBoolean(C1112j.AppCompatTheme_windowNoTitle, false)) {
                mo2465b(1);
            } else if (obtainStyledAttributes.getBoolean(C1112j.AppCompatTheme_windowActionBar, false)) {
                mo2465b(108);
            }
            if (obtainStyledAttributes.getBoolean(C1112j.AppCompatTheme_windowActionBarOverlay, false)) {
                mo2465b(109);
            }
            if (obtainStyledAttributes.getBoolean(C1112j.AppCompatTheme_windowActionModeOverlay, false)) {
                mo2465b(10);
            }
            this.f2363p = obtainStyledAttributes.getBoolean(C1112j.AppCompatTheme_android_windowIsFloating, false);
            obtainStyledAttributes.recycle();
            this.f2354g.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f2353f);
            if (this.f2364q) {
                viewGroup = (ViewGroup) from.inflate(this.f2362o ? C1109g.abc_screen_simple_overlay_action_mode : C1109g.abc_screen_simple, (ViewGroup) null);
                if (Build.VERSION.SDK_INT >= 21) {
                    C0487v.m2275a((View) viewGroup, (C0482q) new C0638w(this));
                } else {
                    ((C0855la) viewGroup).setOnFitSystemWindowsListener(new C0639x(this));
                }
            } else if (this.f2363p) {
                viewGroup = (ViewGroup) from.inflate(C1109g.abc_dialog_title_material, (ViewGroup) null);
                this.f2361n = false;
                this.f2360m = false;
            } else if (this.f2360m) {
                TypedValue typedValue = new TypedValue();
                this.f2353f.getTheme().resolveAttribute(C1103a.actionBarTheme, typedValue, true);
                int i = typedValue.resourceId;
                viewGroup = (ViewGroup) LayoutInflater.from(i != 0 ? new C1139d(this.f2353f, i) : this.f2353f).inflate(C1109g.abc_screen_toolbar, (ViewGroup) null);
                this.f2207v = (C0796U) viewGroup.findViewById(C1108f.decor_content_parent);
                this.f2207v.setWindowCallback(mo2647n());
                if (this.f2361n) {
                    this.f2207v.mo3132a(109);
                }
                if (this.f2194H) {
                    this.f2207v.mo3132a(2);
                }
                if (this.f2195I) {
                    this.f2207v.mo3132a(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                if (this.f2207v == null) {
                    this.f2192F = (TextView) viewGroup.findViewById(C1108f.title);
                }
                C0902ub.m5142b(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C1108f.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.f2354g.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                    }
                }
                this.f2354g.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new C0640y(this));
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f2360m + ", windowActionBarOverlay: " + this.f2361n + ", android:windowIsFloating: " + this.f2363p + ", windowActionModeOverlay: " + this.f2362o + ", windowNoTitle: " + this.f2364q + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    /* renamed from: x */
    private void m2842x() {
        if (!this.f2190D) {
            this.f2191E = m2841w();
            CharSequence m = mo2646m();
            if (!TextUtils.isEmpty(m)) {
                mo2464b(m);
            }
            mo2658v();
            mo2454a(this.f2191E);
            this.f2190D = true;
            C0588d a = mo2442a(0, false);
            if (mo2648p()) {
                return;
            }
            if (a == null || a.f2225j == null) {
                mo2657g(108);
            }
        }
    }

    /* renamed from: y */
    private void m2843y() {
        if (this.f2190D) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0588d mo2442a(int i, boolean z) {
        C0588d[] dVarArr = this.f2197K;
        if (dVarArr == null || dVarArr.length <= i) {
            C0588d[] dVarArr2 = new C0588d[(i + 1)];
            if (dVarArr != null) {
                System.arraycopy(dVarArr, 0, dVarArr2, 0, dVarArr.length);
            }
            this.f2197K = dVarArr2;
            dVarArr = dVarArr2;
        }
        C0588d dVar = dVarArr[i];
        if (dVar != null) {
            return dVar;
        }
        C0588d dVar2 = new C0588d(i);
        dVarArr[i] = dVar2;
        return dVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0588d mo2443a(Menu menu) {
        C0588d[] dVarArr = this.f2197K;
        int length = dVarArr != null ? dVarArr.length : 0;
        for (int i = 0; i < length; i++) {
            C0588d dVar = dVarArr[i];
            if (dVar != null && dVar.f2225j == menu) {
                return dVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public <T extends View> T mo2444a(int i) {
        m2842x();
        return this.f2354g.findViewById(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo2445a(View view, String str, Context context, AttributeSet attributeSet) {
        throw null;
    }

    /* renamed from: a */
    public C1136b mo2446a(C1136b.C1137a aVar) {
        C0624n nVar;
        if (aVar != null) {
            C1136b bVar = this.f2210y;
            if (bVar != null) {
                bVar.mo2561a();
            }
            C0586b bVar2 = new C0586b(aVar);
            C0607a d = mo2641d();
            if (d != null) {
                this.f2210y = d.mo2543a((C1136b.C1137a) bVar2);
                C1136b bVar3 = this.f2210y;
                if (!(bVar3 == null || (nVar = this.f2357j) == null)) {
                    nVar.mo2502b(bVar3);
                }
            }
            if (this.f2210y == null) {
                this.f2210y = mo2459b((C1136b.C1137a) bVar2);
            }
            return this.f2210y;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2447a(int i, C0588d dVar, Menu menu) {
        if (menu == null) {
            if (dVar == null && i >= 0) {
                C0588d[] dVarArr = this.f2197K;
                if (i < dVarArr.length) {
                    dVar = dVarArr[i];
                }
            }
            if (dVar != null) {
                menu = dVar.f2225j;
            }
        }
        if ((dVar == null || dVar.f2230o) && !mo2648p()) {
            this.f2355h.onPanelClosed(i, menu);
        }
    }

    /* renamed from: a */
    public void mo2448a(Configuration configuration) {
        C0607a d;
        if (this.f2360m && this.f2190D && (d = mo2641d()) != null) {
            d.mo2516a(configuration);
        }
        C0871p.m4995a().mo4627a(this.f2353f);
        mo2638a();
    }

    /* renamed from: a */
    public void mo2449a(Bundle bundle) {
        Window.Callback callback = this.f2355h;
        if ((callback instanceof Activity) && C0295W.m1320b((Activity) callback) != null) {
            C0607a q = mo2649q();
            if (q == null) {
                this.f2203Q = true;
            } else {
                q.mo2524c(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2450a(C0588d dVar, boolean z) {
        ViewGroup viewGroup;
        C0796U u;
        if (!z || dVar.f2216a != 0 || (u = this.f2207v) == null || !u.mo3134a()) {
            WindowManager windowManager = (WindowManager) this.f2353f.getSystemService("window");
            if (!(windowManager == null || !dVar.f2230o || (viewGroup = dVar.f2222g) == null)) {
                windowManager.removeView(viewGroup);
                if (z) {
                    mo2447a(dVar.f2216a, dVar, (Menu) null);
                }
            }
            dVar.f2228m = false;
            dVar.f2229n = false;
            dVar.f2230o = false;
            dVar.f2223h = null;
            dVar.f2232q = true;
            if (this.f2198L == dVar) {
                this.f2198L = null;
                return;
            }
            return;
        }
        mo2462b(dVar.f2225j);
    }

    /* renamed from: a */
    public void mo362a(C0662l lVar) {
        m2829a(lVar, true);
    }

    /* renamed from: a */
    public void mo2451a(Toolbar toolbar) {
        Window window;
        Window.Callback callback;
        if (this.f2355h instanceof Activity) {
            C0607a d = mo2641d();
            if (!(d instanceof C0605O)) {
                this.f2359l = null;
                if (d != null) {
                    d.mo2535l();
                }
                if (toolbar != null) {
                    C0595I i = new C0595I(toolbar, ((Activity) this.f2355h).getTitle(), this.f2356i);
                    this.f2358k = i;
                    window = this.f2354g;
                    callback = i.mo2537n();
                } else {
                    this.f2358k = null;
                    window = this.f2354g;
                    callback = this.f2356i;
                }
                window.setCallback(callback);
                mo2473f();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    /* renamed from: a */
    public void mo2452a(View view) {
        m2842x();
        ViewGroup viewGroup = (ViewGroup) this.f2191E.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f2355h.onContentChanged();
    }

    /* renamed from: a */
    public void mo2453a(View view, ViewGroup.LayoutParams layoutParams) {
        m2842x();
        ((ViewGroup) this.f2191E.findViewById(16908290)).addView(view, layoutParams);
        this.f2355h.onContentChanged();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2454a(ViewGroup viewGroup) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo2455a(int i, KeyEvent keyEvent) {
        C0607a d = mo2641d();
        if (d != null && d.mo2520a(i, keyEvent)) {
            return true;
        }
        C0588d dVar = this.f2198L;
        if (dVar == null || !m2831a(dVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.f2198L == null) {
                C0588d a = mo2442a(0, true);
                m2834b(a, keyEvent);
                boolean a2 = m2831a(a, keyEvent.getKeyCode(), keyEvent, 1);
                a.f2228m = false;
                if (a2) {
                    return true;
                }
            }
            return false;
        }
        C0588d dVar2 = this.f2198L;
        if (dVar2 != null) {
            dVar2.f2229n = true;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo2456a(int i, Menu menu) {
        if (i != 108) {
            return false;
        }
        C0607a d = mo2641d();
        if (d != null) {
            d.mo2523b(true);
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo363a(C0662l lVar, MenuItem menuItem) {
        C0588d a;
        Window.Callback n = mo2647n();
        if (n == null || mo2648p() || (a = mo2443a((Menu) lVar.mo2714m())) == null) {
            return false;
        }
        return n.onMenuItemSelected(a.f2216a, menuItem);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo2457a(KeyEvent keyEvent) {
        boolean z = true;
        if (keyEvent.getKeyCode() == 82 && this.f2355h.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z = false;
        }
        return z ? mo2466b(keyCode, keyEvent) : mo2468c(keyCode, keyEvent);
    }

    /* renamed from: b */
    public View mo2458b(View view, String str, Context context, AttributeSet attributeSet) {
        AppCompatViewInflater appCompatViewInflater;
        boolean z = false;
        if (this.f2206T == null) {
            String string = this.f2353f.obtainStyledAttributes(C1112j.AppCompatTheme).getString(C1112j.AppCompatTheme_viewInflaterClass);
            if (string == null || AppCompatViewInflater.class.getName().equals(string)) {
                appCompatViewInflater = new AppCompatViewInflater();
            } else {
                try {
                    this.f2206T = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    appCompatViewInflater = new AppCompatViewInflater();
                }
            }
            this.f2206T = appCompatViewInflater;
        }
        if (f2186u) {
            if (!(attributeSet instanceof XmlPullParser)) {
                z = m2832a((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z = true;
            }
        }
        return this.f2206T.mo2428a(view, str, context, attributeSet, z, f2186u, true, C0884rb.m5059a());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002d  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p013b.p018b.p040i.p050h.C1136b mo2459b(p013b.p018b.p040i.p050h.C1136b.C1137a r8) {
        /*
            r7 = this;
            r7.mo2481s()
            b.b.i.h.b r0 = r7.f2210y
            if (r0 == 0) goto L_0x000a
            r0.mo2561a()
        L_0x000a:
            boolean r0 = r8 instanceof android.support.p011v7.app.C0584C.C0586b
            if (r0 != 0) goto L_0x0014
            android.support.v7.app.C$b r0 = new android.support.v7.app.C$b
            r0.<init>(r8)
            r8 = r0
        L_0x0014:
            android.support.v7.app.n r0 = r7.f2357j
            r1 = 0
            if (r0 == 0) goto L_0x0026
            boolean r0 = r7.mo2648p()
            if (r0 != 0) goto L_0x0026
            android.support.v7.app.n r0 = r7.f2357j     // Catch:{ AbstractMethodError -> 0x0026 }
            b.b.i.h.b r0 = r0.mo2498a((p013b.p018b.p040i.p050h.C1136b.C1137a) r8)     // Catch:{ AbstractMethodError -> 0x0026 }
            goto L_0x0027
        L_0x0026:
            r0 = r1
        L_0x0027:
            if (r0 == 0) goto L_0x002d
            r7.f2210y = r0
            goto L_0x0169
        L_0x002d:
            android.support.v7.widget.ActionBarContextView r0 = r7.f2211z
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x00da
            boolean r0 = r7.f2363p
            if (r0 == 0) goto L_0x00bb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r4 = r7.f2353f
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int r5 = p013b.p018b.p040i.p041a.C1103a.actionBarTheme
            r4.resolveAttribute(r5, r0, r3)
            int r5 = r0.resourceId
            if (r5 == 0) goto L_0x006c
            android.content.Context r5 = r7.f2353f
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            r5.setTo(r4)
            int r4 = r0.resourceId
            r5.applyStyle(r4, r3)
            b.b.i.h.d r4 = new b.b.i.h.d
            android.content.Context r6 = r7.f2353f
            r4.<init>((android.content.Context) r6, (int) r2)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r5)
            goto L_0x006e
        L_0x006c:
            android.content.Context r4 = r7.f2353f
        L_0x006e:
            android.support.v7.widget.ActionBarContextView r5 = new android.support.v7.widget.ActionBarContextView
            r5.<init>(r4)
            r7.f2211z = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            int r6 = p013b.p018b.p040i.p041a.C1103a.actionModePopupWindowStyle
            r5.<init>(r4, r1, r6)
            r7.f2187A = r5
            android.widget.PopupWindow r5 = r7.f2187A
            r6 = 2
            android.support.p007v4.widget.C0565s.m2763a((android.widget.PopupWindow) r5, (int) r6)
            android.widget.PopupWindow r5 = r7.f2187A
            android.support.v7.widget.ActionBarContextView r6 = r7.f2211z
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r7.f2187A
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r4.getTheme()
            int r6 = p013b.p018b.p040i.p041a.C1103a.actionBarSize
            r5.resolveAttribute(r6, r0, r3)
            int r0 = r0.data
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r4)
            android.support.v7.widget.ActionBarContextView r4 = r7.f2211z
            r4.setContentHeight(r0)
            android.widget.PopupWindow r0 = r7.f2187A
            r4 = -2
            r0.setHeight(r4)
            android.support.v7.app.A r0 = new android.support.v7.app.A
            r0.<init>(r7)
            r7.f2188B = r0
            goto L_0x00da
        L_0x00bb:
            android.view.ViewGroup r0 = r7.f2191E
            int r4 = p013b.p018b.p040i.p041a.C1108f.action_mode_bar_stub
            android.view.View r0 = r0.findViewById(r4)
            android.support.v7.widget.ViewStubCompat r0 = (android.support.p011v7.widget.ViewStubCompat) r0
            if (r0 == 0) goto L_0x00da
            android.content.Context r4 = r7.mo2645l()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0.setLayoutInflater(r4)
            android.view.View r0 = r0.mo4402a()
            android.support.v7.widget.ActionBarContextView r0 = (android.support.p011v7.widget.ActionBarContextView) r0
            r7.f2211z = r0
        L_0x00da:
            android.support.v7.widget.ActionBarContextView r0 = r7.f2211z
            if (r0 == 0) goto L_0x0169
            r7.mo2481s()
            android.support.v7.widget.ActionBarContextView r0 = r7.f2211z
            r0.mo3111c()
            b.b.i.h.e r0 = new b.b.i.h.e
            android.support.v7.widget.ActionBarContextView r4 = r7.f2211z
            android.content.Context r4 = r4.getContext()
            android.support.v7.widget.ActionBarContextView r5 = r7.f2211z
            android.widget.PopupWindow r6 = r7.f2187A
            if (r6 != 0) goto L_0x00f5
            goto L_0x00f6
        L_0x00f5:
            r3 = r2
        L_0x00f6:
            r0.<init>(r4, r5, r8, r3)
            android.view.Menu r3 = r0.mo2569c()
            boolean r8 = r8.mo2487a((p013b.p018b.p040i.p050h.C1136b) r0, (android.view.Menu) r3)
            if (r8 == 0) goto L_0x0167
            r0.mo2573i()
            android.support.v7.widget.ActionBarContextView r8 = r7.f2211z
            r8.mo3109a(r0)
            r7.f2210y = r0
            boolean r8 = r7.mo2483u()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x0131
            android.support.v7.widget.ActionBarContextView r8 = r7.f2211z
            r1 = 0
            r8.setAlpha(r1)
            android.support.v7.widget.ActionBarContextView r8 = r7.f2211z
            android.support.v4.view.H r8 = android.support.p007v4.view.C0487v.m2264a(r8)
            r8.mo1753a((float) r0)
            r7.f2189C = r8
            android.support.v4.view.H r8 = r7.f2189C
            android.support.v7.app.B r0 = new android.support.v7.app.B
            r0.<init>(r7)
            r8.mo1755a((android.support.p007v4.view.C0431I) r0)
            goto L_0x0157
        L_0x0131:
            android.support.v7.widget.ActionBarContextView r8 = r7.f2211z
            r8.setAlpha(r0)
            android.support.v7.widget.ActionBarContextView r8 = r7.f2211z
            r8.setVisibility(r2)
            android.support.v7.widget.ActionBarContextView r8 = r7.f2211z
            r0 = 32
            r8.sendAccessibilityEvent(r0)
            android.support.v7.widget.ActionBarContextView r8 = r7.f2211z
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x0157
            android.support.v7.widget.ActionBarContextView r8 = r7.f2211z
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            android.support.p007v4.view.C0487v.m2262C(r8)
        L_0x0157:
            android.widget.PopupWindow r8 = r7.f2187A
            if (r8 == 0) goto L_0x0169
            android.view.Window r8 = r7.f2354g
            android.view.View r8 = r8.getDecorView()
            java.lang.Runnable r0 = r7.f2188B
            r8.post(r0)
            goto L_0x0169
        L_0x0167:
            r7.f2210y = r1
        L_0x0169:
            b.b.i.h.b r8 = r7.f2210y
            if (r8 == 0) goto L_0x0174
            android.support.v7.app.n r0 = r7.f2357j
            if (r0 == 0) goto L_0x0174
            r0.mo2502b(r8)
        L_0x0174:
            b.b.i.h.b r8 = r7.f2210y
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.app.C0584C.mo2459b(b.b.i.h.b$a):b.b.i.h.b");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2460b(int i, Menu menu) {
        if (i == 108) {
            C0607a d = mo2641d();
            if (d != null) {
                d.mo2523b(false);
            }
        } else if (i == 0) {
            C0588d a = mo2442a(i, true);
            if (a.f2230o) {
                mo2450a(a, false);
            }
        }
    }

    /* renamed from: b */
    public void mo2461b(Bundle bundle) {
        m2842x();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2462b(C0662l lVar) {
        if (!this.f2196J) {
            this.f2196J = true;
            this.f2207v.mo3143g();
            Window.Callback n = mo2647n();
            if (n != null && !mo2648p()) {
                n.onPanelClosed(108, lVar);
            }
            this.f2196J = false;
        }
    }

    /* renamed from: b */
    public void mo2463b(View view, ViewGroup.LayoutParams layoutParams) {
        m2842x();
        ViewGroup viewGroup = (ViewGroup) this.f2191E.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f2355h.onContentChanged();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2464b(CharSequence charSequence) {
        C0796U u = this.f2207v;
        if (u != null) {
            u.setWindowTitle(charSequence);
        } else if (mo2649q() != null) {
            mo2649q().mo2519a(charSequence);
        } else {
            TextView textView = this.f2192F;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    /* renamed from: b */
    public boolean mo2465b(int i) {
        int h = m2839h(i);
        if (this.f2364q && h == 108) {
            return false;
        }
        if (this.f2360m && h == 1) {
            this.f2360m = false;
        }
        if (h == 1) {
            m2843y();
            this.f2364q = true;
            return true;
        } else if (h == 2) {
            m2843y();
            this.f2194H = true;
            return true;
        } else if (h == 5) {
            m2843y();
            this.f2195I = true;
            return true;
        } else if (h == 10) {
            m2843y();
            this.f2362o = true;
            return true;
        } else if (h == 108) {
            m2843y();
            this.f2360m = true;
            return true;
        } else if (h != 109) {
            return this.f2354g.requestFeature(h);
        } else {
            m2843y();
            this.f2361n = true;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo2466b(int i, KeyEvent keyEvent) {
        boolean z = true;
        if (i == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z = false;
            }
            this.f2199M = z;
        } else if (i == 82) {
            m2836d(0, keyEvent);
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public void mo2467c(int i) {
        m2842x();
        ViewGroup viewGroup = (ViewGroup) this.f2191E.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f2353f).inflate(i, viewGroup);
        this.f2355h.onContentChanged();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo2468c(int i, KeyEvent keyEvent) {
        if (i == 4) {
            boolean z = this.f2199M;
            this.f2199M = false;
            C0588d a = mo2442a(0, false);
            if (a != null && a.f2230o) {
                if (!z) {
                    mo2450a(a, true);
                }
                return true;
            } else if (mo2482t()) {
                return true;
            }
        } else if (i == 82) {
            m2837e(0, keyEvent);
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo2469d(int i) {
        mo2450a(mo2442a(i, true), true);
    }

    /* renamed from: e */
    public void mo2470e() {
        LayoutInflater from = LayoutInflater.from(this.f2353f);
        if (from.getFactory() == null) {
            C0467g.m2173b(from, this);
        } else if (!(from.getFactory2() instanceof C0584C)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo2471e(int i) {
        C0588d a;
        C0588d a2 = mo2442a(i, true);
        if (a2.f2225j != null) {
            Bundle bundle = new Bundle();
            a2.f2225j.mo2877c(bundle);
            if (bundle.size() > 0) {
                a2.f2234s = bundle;
            }
            a2.f2225j.mo2903r();
            a2.f2225j.clear();
        }
        a2.f2233r = true;
        a2.f2232q = true;
        if ((i == 108 || i == 0) && this.f2207v != null && (a = mo2442a(0, false)) != null) {
            a.f2228m = false;
            m2834b(a, (KeyEvent) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo2472f(int i) {
        boolean z;
        boolean z2;
        ActionBarContextView actionBarContextView = this.f2211z;
        int i2 = 0;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2211z.getLayoutParams();
            z = true;
            if (this.f2211z.isShown()) {
                if (this.f2204R == null) {
                    this.f2204R = new Rect();
                    this.f2205S = new Rect();
                }
                Rect rect = this.f2204R;
                Rect rect2 = this.f2205S;
                rect.set(0, i, 0, 0);
                C0902ub.m5140a(this.f2191E, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    View view = this.f2193G;
                    if (view == null) {
                        this.f2193G = new View(this.f2353f);
                        this.f2193G.setBackgroundColor(this.f2353f.getResources().getColor(C1105c.abc_input_method_navigation_guard));
                        this.f2191E.addView(this.f2193G, -1, new ViewGroup.LayoutParams(-1, i));
                    } else {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.f2193G.setLayoutParams(layoutParams);
                        }
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.f2193G == null) {
                    z = false;
                }
                if (!this.f2362o && z) {
                    i = 0;
                }
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z2 = true;
                z = false;
            } else {
                z2 = false;
                z = false;
            }
            if (z2) {
                this.f2211z.setLayoutParams(marginLayoutParams);
            }
        }
        View view2 = this.f2193G;
        if (view2 != null) {
            if (!z) {
                i2 = 8;
            }
            view2.setVisibility(i2);
        }
        return i;
    }

    /* renamed from: f */
    public void mo2473f() {
        C0607a d = mo2641d();
        if (d == null || !d.mo2533j()) {
            mo2657g(0);
        }
    }

    /* renamed from: h */
    public void mo2474h() {
        if (this.f2200N) {
            this.f2354g.getDecorView().removeCallbacks(this.f2202P);
        }
        super.mo2474h();
        C0607a aVar = this.f2358k;
        if (aVar != null) {
            aVar.mo2535l();
        }
    }

    /* renamed from: i */
    public void mo2475i() {
        C0607a d = mo2641d();
        if (d != null) {
            d.mo2528f(true);
        }
    }

    /* renamed from: k */
    public void mo2476k() {
        C0607a d = mo2641d();
        if (d != null) {
            d.mo2528f(false);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2477o() {
        /*
            r3 = this;
            r3.m2842x()
            boolean r0 = r3.f2360m
            if (r0 == 0) goto L_0x0033
            android.support.v7.app.a r0 = r3.f2358k
            if (r0 == 0) goto L_0x000c
            goto L_0x0033
        L_0x000c:
            android.view.Window$Callback r0 = r3.f2355h
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x001e
            android.support.v7.app.O r1 = new android.support.v7.app.O
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r2 = r3.f2361n
            r1.<init>(r0, r2)
        L_0x001b:
            r3.f2358k = r1
            goto L_0x002a
        L_0x001e:
            boolean r1 = r0 instanceof android.app.Dialog
            if (r1 == 0) goto L_0x002a
            android.support.v7.app.O r1 = new android.support.v7.app.O
            android.app.Dialog r0 = (android.app.Dialog) r0
            r1.<init>(r0)
            goto L_0x001b
        L_0x002a:
            android.support.v7.app.a r0 = r3.f2358k
            if (r0 == 0) goto L_0x0033
            boolean r1 = r3.f2203Q
            r0.mo2524c(r1)
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.app.C0584C.mo2477o():void");
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View a = mo2445a(view, str, context, attributeSet);
        return a != null ? a : mo2458b(view, str, context, attributeSet);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo2480r() {
        C0662l lVar;
        C0796U u = this.f2207v;
        if (u != null) {
            u.mo3143g();
        }
        if (this.f2187A != null) {
            this.f2354g.getDecorView().removeCallbacks(this.f2188B);
            if (this.f2187A.isShowing()) {
                try {
                    this.f2187A.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f2187A = null;
        }
        mo2481s();
        C0588d a = mo2442a(0, false);
        if (a != null && (lVar = a.f2225j) != null) {
            lVar.close();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo2481s() {
        C0429H h = this.f2189C;
        if (h != null) {
            h.mo1758a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean mo2482t() {
        C1136b bVar = this.f2210y;
        if (bVar != null) {
            bVar.mo2561a();
            return true;
        }
        C0607a d = mo2641d();
        return d != null && d.mo2529f();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f2191E;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo2483u() {
        /*
            r1 = this;
            boolean r0 = r1.f2190D
            if (r0 == 0) goto L_0x0010
            android.view.ViewGroup r0 = r1.f2191E
            if (r0 == 0) goto L_0x0010
            boolean r0 = android.support.p007v4.view.C0487v.m2309y(r0)
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p011v7.app.C0584C.mo2483u():boolean");
    }
}
