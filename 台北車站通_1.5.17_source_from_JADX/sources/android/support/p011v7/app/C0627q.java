package android.support.p011v7.app;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.p011v7.view.menu.C0662l;
import android.support.p011v7.widget.C0829eb;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.Window;
import p013b.p018b.p040i.p050h.C1143g;
import p013b.p018b.p040i.p050h.C1148j;

/* renamed from: android.support.v7.app.q */
abstract class C0627q extends C0625o {

    /* renamed from: c */
    private static boolean f2350c = true;

    /* renamed from: d */
    private static final boolean f2351d = (Build.VERSION.SDK_INT < 21);

    /* renamed from: e */
    private static final int[] f2352e = {16842836};

    /* renamed from: f */
    final Context f2353f;

    /* renamed from: g */
    final Window f2354g;

    /* renamed from: h */
    final Window.Callback f2355h = this.f2354g.getCallback();

    /* renamed from: i */
    final Window.Callback f2356i;

    /* renamed from: j */
    final C0624n f2357j;

    /* renamed from: k */
    C0607a f2358k;

    /* renamed from: l */
    MenuInflater f2359l;

    /* renamed from: m */
    boolean f2360m;

    /* renamed from: n */
    boolean f2361n;

    /* renamed from: o */
    boolean f2362o;

    /* renamed from: p */
    boolean f2363p;

    /* renamed from: q */
    boolean f2364q;

    /* renamed from: r */
    private CharSequence f2365r;

    /* renamed from: s */
    private boolean f2366s;

    /* renamed from: t */
    private boolean f2367t;

    /* renamed from: android.support.v7.app.q$a */
    class C0628a extends C1148j {
        C0628a(Window.Callback callback) {
            super(callback);
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return C0627q.this.mo2457a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || C0627q.this.mo2455a(keyEvent.getKeyCode(), keyEvent);
        }

        public void onContentChanged() {
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C0662l)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            C0627q.this.mo2456a(i, menu);
            return true;
        }

        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            C0627q.this.mo2460b(i, menu);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            C0662l lVar = menu instanceof C0662l ? (C0662l) menu : null;
            if (i == 0 && lVar == null) {
                return false;
            }
            if (lVar != null) {
                lVar.mo2879c(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (lVar != null) {
                lVar.mo2879c(false);
            }
            return onPreparePanel;
        }
    }

    static {
        if (f2351d && !f2350c) {
            Thread.setDefaultUncaughtExceptionHandler(new C0626p(Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    C0627q(Context context, Window window, C0624n nVar) {
        this.f2353f = context;
        this.f2354g = window;
        this.f2357j = nVar;
        Window.Callback callback = this.f2355h;
        if (!(callback instanceof C0628a)) {
            this.f2356i = mo2644a(callback);
            this.f2354g.setCallback(this.f2356i);
            C0829eb a = C0829eb.m4792a(context, (AttributeSet) null, f2352e);
            Drawable c = a.mo4479c(0);
            if (c != null) {
                this.f2354g.setBackgroundDrawable(c);
            }
            a.mo4474a();
            return;
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract Window.Callback mo2644a(Window.Callback callback);

    /* renamed from: a */
    public final void mo2637a(CharSequence charSequence) {
        this.f2365r = charSequence;
        mo2464b(charSequence);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract boolean mo2455a(int i, KeyEvent keyEvent);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract boolean mo2456a(int i, Menu menu);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract boolean mo2457a(KeyEvent keyEvent);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo2460b(int i, Menu menu);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo2464b(CharSequence charSequence);

    /* renamed from: c */
    public MenuInflater mo2639c() {
        if (this.f2359l == null) {
            mo2477o();
            C0607a aVar = this.f2358k;
            this.f2359l = new C1143g(aVar != null ? aVar.mo2531h() : this.f2353f);
        }
        return this.f2359l;
    }

    /* renamed from: c */
    public void mo2640c(Bundle bundle) {
    }

    /* renamed from: d */
    public C0607a mo2641d() {
        mo2477o();
        return this.f2358k;
    }

    /* renamed from: h */
    public void mo2474h() {
        this.f2367t = true;
    }

    /* renamed from: j */
    public void mo2642j() {
        this.f2366s = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final Context mo2645l() {
        C0607a d = mo2641d();
        Context h = d != null ? d.mo2531h() : null;
        return h == null ? this.f2353f : h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final CharSequence mo2646m() {
        Window.Callback callback = this.f2355h;
        return callback instanceof Activity ? ((Activity) callback).getTitle() : this.f2365r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final Window.Callback mo2647n() {
        return this.f2354g.getCallback();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public abstract void mo2477o();

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final boolean mo2648p() {
        return this.f2367t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final C0607a mo2649q() {
        return this.f2358k;
    }
}
