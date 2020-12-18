package android.support.p011v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p007v4.view.C0429H;
import android.support.p007v4.view.C0431I;
import android.support.p007v4.view.C0487v;
import android.support.p011v7.view.menu.C0662l;
import android.support.p011v7.view.menu.C0679v;
import android.support.p011v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import p013b.p018b.p040i.p041a.C1103a;
import p013b.p018b.p040i.p041a.C1107e;
import p013b.p018b.p040i.p041a.C1108f;
import p013b.p018b.p040i.p041a.C1110h;
import p013b.p018b.p040i.p041a.C1112j;
import p013b.p018b.p040i.p043c.p044a.C1118b;

/* renamed from: android.support.v7.widget.lb */
public class C0857lb implements C0798V {

    /* renamed from: a */
    Toolbar f3517a;

    /* renamed from: b */
    private int f3518b;

    /* renamed from: c */
    private View f3519c;

    /* renamed from: d */
    private View f3520d;

    /* renamed from: e */
    private Drawable f3521e;

    /* renamed from: f */
    private Drawable f3522f;

    /* renamed from: g */
    private Drawable f3523g;

    /* renamed from: h */
    private boolean f3524h;

    /* renamed from: i */
    CharSequence f3525i;

    /* renamed from: j */
    private CharSequence f3526j;

    /* renamed from: k */
    private CharSequence f3527k;

    /* renamed from: l */
    Window.Callback f3528l;

    /* renamed from: m */
    boolean f3529m;

    /* renamed from: n */
    private ActionMenuPresenter f3530n;

    /* renamed from: o */
    private int f3531o;

    /* renamed from: p */
    private int f3532p;

    /* renamed from: q */
    private Drawable f3533q;

    public C0857lb(Toolbar toolbar, boolean z) {
        this(toolbar, z, C1110h.abc_action_bar_up_description, C1107e.abc_ic_ab_back_material);
    }

    public C0857lb(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.f3531o = 0;
        this.f3532p = 0;
        this.f3517a = toolbar;
        this.f3525i = toolbar.getTitle();
        this.f3526j = toolbar.getSubtitle();
        this.f3524h = this.f3525i != null;
        this.f3523g = toolbar.getNavigationIcon();
        C0829eb a = C0829eb.m4793a(toolbar.getContext(), (AttributeSet) null, C1112j.ActionBar, C1103a.actionBarStyle, 0);
        this.f3533q = a.mo4477b(C1112j.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence e = a.mo4483e(C1112j.ActionBar_title);
            if (!TextUtils.isEmpty(e)) {
                mo4571c(e);
            }
            CharSequence e2 = a.mo4483e(C1112j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(e2)) {
                mo4570b(e2);
            }
            Drawable b = a.mo4477b(C1112j.ActionBar_logo);
            if (b != null) {
                mo4567a(b);
            }
            Drawable b2 = a.mo4477b(C1112j.ActionBar_icon);
            if (b2 != null) {
                setIcon(b2);
            }
            if (this.f3523g == null && (drawable = this.f3533q) != null) {
                mo4569b(drawable);
            }
            mo4370a(a.mo4480d(C1112j.ActionBar_displayOptions, 0));
            int g = a.mo4486g(C1112j.ActionBar_customNavigationLayout, 0);
            if (g != 0) {
                mo4374a(LayoutInflater.from(this.f3517a.getContext()).inflate(g, this.f3517a, false));
                mo4370a(this.f3518b | 16);
            }
            int f = a.mo4484f(C1112j.ActionBar_height, 0);
            if (f > 0) {
                ViewGroup.LayoutParams layoutParams = this.f3517a.getLayoutParams();
                layoutParams.height = f;
                this.f3517a.setLayoutParams(layoutParams);
            }
            int b3 = a.mo4476b(C1112j.ActionBar_contentInsetStart, -1);
            int b4 = a.mo4476b(C1112j.ActionBar_contentInsetEnd, -1);
            if (b3 >= 0 || b4 >= 0) {
                this.f3517a.mo4270a(Math.max(b3, 0), Math.max(b4, 0));
            }
            int g2 = a.mo4486g(C1112j.ActionBar_titleTextStyle, 0);
            if (g2 != 0) {
                Toolbar toolbar2 = this.f3517a;
                toolbar2.mo4274b(toolbar2.getContext(), g2);
            }
            int g3 = a.mo4486g(C1112j.ActionBar_subtitleTextStyle, 0);
            if (g3 != 0) {
                Toolbar toolbar3 = this.f3517a;
                toolbar3.mo4271a(toolbar3.getContext(), g3);
            }
            int g4 = a.mo4486g(C1112j.ActionBar_popupTheme, 0);
            if (g4 != 0) {
                this.f3517a.setPopupTheme(g4);
            }
        } else {
            this.f3518b = m4917p();
        }
        a.mo4474a();
        mo4572d(i);
        this.f3527k = this.f3517a.getNavigationContentDescription();
        this.f3517a.setNavigationOnClickListener(new C0848jb(this));
    }

    /* renamed from: d */
    private void m4916d(CharSequence charSequence) {
        this.f3525i = charSequence;
        if ((this.f3518b & 8) != 0) {
            this.f3517a.setTitle(charSequence);
        }
    }

    /* renamed from: p */
    private int m4917p() {
        if (this.f3517a.getNavigationIcon() == null) {
            return 11;
        }
        this.f3533q = this.f3517a.getNavigationIcon();
        return 15;
    }

    /* renamed from: q */
    private void m4918q() {
        if ((this.f3518b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f3527k)) {
            this.f3517a.setNavigationContentDescription(this.f3532p);
        } else {
            this.f3517a.setNavigationContentDescription(this.f3527k);
        }
    }

    /* renamed from: r */
    private void m4919r() {
        Drawable drawable;
        Toolbar toolbar;
        if ((this.f3518b & 4) != 0) {
            toolbar = this.f3517a;
            drawable = this.f3523g;
            if (drawable == null) {
                drawable = this.f3533q;
            }
        } else {
            toolbar = this.f3517a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    /* renamed from: s */
    private void m4920s() {
        Drawable drawable;
        int i = this.f3518b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f3522f) == null) {
            drawable = this.f3521e;
        }
        this.f3517a.setLogo(drawable);
    }

    /* renamed from: a */
    public C0429H mo4369a(int i, long j) {
        C0429H a = C0487v.m2264a(this.f3517a);
        a.mo1753a(i == 0 ? 1.0f : 0.0f);
        a.mo1754a(j);
        a.mo1755a((C0431I) new C0853kb(this, i));
        return a;
    }

    /* renamed from: a */
    public void mo4370a(int i) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i2 = this.f3518b ^ i;
        this.f3518b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m4918q();
                }
                m4919r();
            }
            if ((i2 & 3) != 0) {
                m4920s();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f3517a.setTitle(this.f3525i);
                    toolbar = this.f3517a;
                    charSequence = this.f3526j;
                } else {
                    charSequence = null;
                    this.f3517a.setTitle((CharSequence) null);
                    toolbar = this.f3517a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i2 & 16) != 0 && (view = this.f3520d) != null) {
                if ((i & 16) != 0) {
                    this.f3517a.addView(view);
                } else {
                    this.f3517a.removeView(view);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo4567a(Drawable drawable) {
        this.f3522f = drawable;
        m4920s();
    }

    /* renamed from: a */
    public void mo4371a(C0679v.C0680a aVar, C0662l.C0663a aVar2) {
        this.f3517a.mo4273a(aVar, aVar2);
    }

    /* renamed from: a */
    public void mo4372a(C0744Ra ra) {
        Toolbar toolbar;
        View view = this.f3519c;
        if (view != null && view.getParent() == (toolbar = this.f3517a)) {
            toolbar.removeView(this.f3519c);
        }
        this.f3519c = ra;
        if (ra != null && this.f3531o == 2) {
            this.f3517a.addView(this.f3519c, 0);
            Toolbar.C0794b bVar = (Toolbar.C0794b) this.f3519c.getLayoutParams();
            bVar.width = -2;
            bVar.height = -2;
            bVar.f2315a = 8388691;
            ra.setAllowCollapse(true);
        }
    }

    /* renamed from: a */
    public void mo4373a(Menu menu, C0679v.C0680a aVar) {
        if (this.f3530n == null) {
            this.f3530n = new ActionMenuPresenter(this.f3517a.getContext());
            this.f3530n.mo2806a(C1108f.action_menu_presenter);
        }
        this.f3530n.mo2695a(aVar);
        this.f3517a.mo4272a((C0662l) menu, this.f3530n);
    }

    /* renamed from: a */
    public void mo4374a(View view) {
        View view2 = this.f3520d;
        if (!(view2 == null || (this.f3518b & 16) == 0)) {
            this.f3517a.removeView(view2);
        }
        this.f3520d = view;
        if (view != null && (this.f3518b & 16) != 0) {
            this.f3517a.addView(this.f3520d);
        }
    }

    /* renamed from: a */
    public void mo4568a(CharSequence charSequence) {
        this.f3527k = charSequence;
        m4918q();
    }

    /* renamed from: a */
    public void mo4375a(boolean z) {
    }

    /* renamed from: a */
    public boolean mo4376a() {
        return this.f3517a.mo4312i();
    }

    /* renamed from: b */
    public void mo4377b() {
        this.f3529m = true;
    }

    /* renamed from: b */
    public void mo4378b(int i) {
        mo4567a(i != 0 ? C1118b.m5721b(getContext(), i) : null);
    }

    /* renamed from: b */
    public void mo4569b(Drawable drawable) {
        this.f3523g = drawable;
        m4919r();
    }

    /* renamed from: b */
    public void mo4570b(CharSequence charSequence) {
        this.f3526j = charSequence;
        if ((this.f3518b & 8) != 0) {
            this.f3517a.setSubtitle(charSequence);
        }
    }

    /* renamed from: b */
    public void mo4379b(boolean z) {
        this.f3517a.setCollapsible(z);
    }

    /* renamed from: c */
    public void mo4380c(int i) {
        this.f3517a.setVisibility(i);
    }

    /* renamed from: c */
    public void mo4571c(CharSequence charSequence) {
        this.f3524h = true;
        m4916d(charSequence);
    }

    /* renamed from: c */
    public boolean mo4381c() {
        return this.f3517a.mo4275b();
    }

    public void collapseActionView() {
        this.f3517a.mo4276c();
    }

    /* renamed from: d */
    public void mo4572d(int i) {
        if (i != this.f3532p) {
            this.f3532p = i;
            if (TextUtils.isEmpty(this.f3517a.getNavigationContentDescription())) {
                mo4573e(this.f3532p);
            }
        }
    }

    /* renamed from: d */
    public boolean mo4383d() {
        return this.f3517a.mo4311h();
    }

    /* renamed from: e */
    public void mo4573e(int i) {
        mo4568a((CharSequence) i == 0 ? null : getContext().getString(i));
    }

    /* renamed from: e */
    public boolean mo4384e() {
        return this.f3517a.mo4281g();
    }

    /* renamed from: f */
    public boolean mo4385f() {
        return this.f3517a.mo4314k();
    }

    /* renamed from: g */
    public void mo4386g() {
        this.f3517a.mo4278d();
    }

    public Context getContext() {
        return this.f3517a.getContext();
    }

    public CharSequence getTitle() {
        return this.f3517a.getTitle();
    }

    /* renamed from: h */
    public int mo4389h() {
        return this.f3517a.getVisibility();
    }

    /* renamed from: i */
    public boolean mo4390i() {
        return this.f3517a.mo4280f();
    }

    /* renamed from: j */
    public Menu mo4391j() {
        return this.f3517a.getMenu();
    }

    /* renamed from: k */
    public int mo4392k() {
        return this.f3531o;
    }

    /* renamed from: l */
    public ViewGroup mo4393l() {
        return this.f3517a;
    }

    /* renamed from: m */
    public int mo4394m() {
        return this.f3518b;
    }

    /* renamed from: n */
    public void mo4395n() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: o */
    public void mo4396o() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void setIcon(int i) {
        setIcon(i != 0 ? C1118b.m5721b(getContext(), i) : null);
    }

    public void setIcon(Drawable drawable) {
        this.f3521e = drawable;
        m4920s();
    }

    public void setWindowCallback(Window.Callback callback) {
        this.f3528l = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f3524h) {
            m4916d(charSequence);
        }
    }
}
