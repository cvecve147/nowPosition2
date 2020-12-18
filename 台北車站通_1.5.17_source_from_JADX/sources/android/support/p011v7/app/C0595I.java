package android.support.p011v7.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.support.p007v4.view.C0487v;
import android.support.p011v7.app.C0607a;
import android.support.p011v7.view.menu.C0662l;
import android.support.p011v7.view.menu.C0679v;
import android.support.p011v7.widget.C0798V;
import android.support.p011v7.widget.C0857lb;
import android.support.p011v7.widget.Toolbar;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import java.util.ArrayList;
import p013b.p018b.p040i.p050h.C1148j;

/* renamed from: android.support.v7.app.I */
class C0595I extends C0607a {

    /* renamed from: a */
    C0798V f2248a;

    /* renamed from: b */
    boolean f2249b;

    /* renamed from: c */
    Window.Callback f2250c;

    /* renamed from: d */
    private boolean f2251d;

    /* renamed from: e */
    private boolean f2252e;

    /* renamed from: f */
    private ArrayList<C0607a.C0609b> f2253f = new ArrayList<>();

    /* renamed from: g */
    private final Runnable f2254g = new C0593G(this);

    /* renamed from: h */
    private final Toolbar.C0795c f2255h = new C0594H(this);

    /* renamed from: android.support.v7.app.I$a */
    private final class C0596a implements C0679v.C0680a {

        /* renamed from: a */
        private boolean f2256a;

        C0596a() {
        }

        /* renamed from: a */
        public void mo2484a(C0662l lVar, boolean z) {
            if (!this.f2256a) {
                this.f2256a = true;
                C0595I.this.f2248a.mo4386g();
                Window.Callback callback = C0595I.this.f2250c;
                if (callback != null) {
                    callback.onPanelClosed(108, lVar);
                }
                this.f2256a = false;
            }
        }

        /* renamed from: a */
        public boolean mo2485a(C0662l lVar) {
            Window.Callback callback = C0595I.this.f2250c;
            if (callback == null) {
                return false;
            }
            callback.onMenuOpened(108, lVar);
            return true;
        }
    }

    /* renamed from: android.support.v7.app.I$b */
    private final class C0597b implements C0662l.C0663a {
        C0597b() {
        }

        /* renamed from: a */
        public void mo362a(C0662l lVar) {
            C0595I i = C0595I.this;
            if (i.f2250c == null) {
                return;
            }
            if (i.f2248a.mo4376a()) {
                C0595I.this.f2250c.onPanelClosed(108, lVar);
            } else if (C0595I.this.f2250c.onPreparePanel(0, (View) null, lVar)) {
                C0595I.this.f2250c.onMenuOpened(108, lVar);
            }
        }

        /* renamed from: a */
        public boolean mo363a(C0662l lVar, MenuItem menuItem) {
            return false;
        }
    }

    /* renamed from: android.support.v7.app.I$c */
    private class C0598c extends C1148j {
        public C0598c(Window.Callback callback) {
            super(callback);
        }

        public View onCreatePanelView(int i) {
            return i == 0 ? new View(C0595I.this.f2248a.getContext()) : super.onCreatePanelView(i);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (onPreparePanel) {
                C0595I i2 = C0595I.this;
                if (!i2.f2249b) {
                    i2.f2248a.mo4377b();
                    C0595I.this.f2249b = true;
                }
            }
            return onPreparePanel;
        }
    }

    C0595I(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        this.f2248a = new C0857lb(toolbar, false);
        this.f2250c = new C0598c(callback);
        this.f2248a.setWindowCallback(this.f2250c);
        toolbar.setOnMenuItemClickListener(this.f2255h);
        this.f2248a.setWindowTitle(charSequence);
    }

    /* renamed from: p */
    private Menu m2911p() {
        if (!this.f2251d) {
            this.f2248a.mo4371a((C0679v.C0680a) new C0596a(), (C0662l.C0663a) new C0597b());
            this.f2251d = true;
        }
        return this.f2248a.mo4391j();
    }

    /* renamed from: a */
    public void mo2514a(int i) {
        mo2517a(LayoutInflater.from(this.f2248a.getContext()).inflate(i, this.f2248a.mo4393l(), false));
    }

    /* renamed from: a */
    public void mo2515a(int i, int i2) {
        this.f2248a.mo4370a((i & i2) | ((~i2) & this.f2248a.mo4394m()));
    }

    /* renamed from: a */
    public void mo2516a(Configuration configuration) {
        super.mo2516a(configuration);
    }

    /* renamed from: a */
    public void mo2517a(View view) {
        mo2518a(view, new C0607a.C0608a(-2, -2));
    }

    /* renamed from: a */
    public void mo2518a(View view, C0607a.C0608a aVar) {
        if (view != null) {
            view.setLayoutParams(aVar);
        }
        this.f2248a.mo4374a(view);
    }

    /* renamed from: a */
    public void mo2519a(CharSequence charSequence) {
        this.f2248a.setWindowTitle(charSequence);
    }

    /* renamed from: a */
    public boolean mo2520a(int i, KeyEvent keyEvent) {
        Menu p = m2911p();
        if (p == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        p.setQwertyMode(z);
        return p.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: a */
    public boolean mo2521a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo2536m();
        }
        return true;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: b */
    public void mo2522b(int i) {
        mo2515a(i, -1);
    }

    /* renamed from: b */
    public void mo2523b(boolean z) {
        if (z != this.f2252e) {
            this.f2252e = z;
            int size = this.f2253f.size();
            for (int i = 0; i < size; i++) {
                this.f2253f.get(i).onMenuVisibilityChanged(z);
            }
        }
    }

    /* renamed from: c */
    public void mo2524c(boolean z) {
    }

    /* renamed from: d */
    public void mo2525d(boolean z) {
        mo2515a(z ? 4 : 0, 4);
    }

    /* renamed from: e */
    public void mo2526e(boolean z) {
    }

    /* renamed from: e */
    public boolean mo2527e() {
        return this.f2248a.mo4384e();
    }

    /* renamed from: f */
    public void mo2528f(boolean z) {
    }

    /* renamed from: f */
    public boolean mo2529f() {
        if (!this.f2248a.mo4390i()) {
            return false;
        }
        this.f2248a.collapseActionView();
        return true;
    }

    /* renamed from: g */
    public int mo2530g() {
        return this.f2248a.mo4394m();
    }

    /* renamed from: h */
    public Context mo2531h() {
        return this.f2248a.getContext();
    }

    /* renamed from: i */
    public void mo2532i() {
        this.f2248a.mo4380c(8);
    }

    /* renamed from: j */
    public boolean mo2533j() {
        this.f2248a.mo4393l().removeCallbacks(this.f2254g);
        C0487v.m2277a((View) this.f2248a.mo4393l(), this.f2254g);
        return true;
    }

    /* renamed from: k */
    public boolean mo2534k() {
        return this.f2248a.mo4389h() == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo2535l() {
        this.f2248a.mo4393l().removeCallbacks(this.f2254g);
    }

    /* renamed from: m */
    public boolean mo2536m() {
        return this.f2248a.mo4385f();
    }

    /* renamed from: n */
    public Window.Callback mo2537n() {
        return this.f2250c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo2538o() {
        Menu p = m2911p();
        C0662l lVar = p instanceof C0662l ? (C0662l) p : null;
        if (lVar != null) {
            lVar.mo2903r();
        }
        try {
            p.clear();
            if (!this.f2250c.onCreatePanelMenu(0, p) || !this.f2250c.onPreparePanel(0, (View) null, p)) {
                p.clear();
            }
        } finally {
            if (lVar != null) {
                lVar.mo2902q();
            }
        }
    }
}
