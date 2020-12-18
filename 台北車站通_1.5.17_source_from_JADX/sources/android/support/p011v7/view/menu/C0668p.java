package android.support.p011v7.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p007v4.view.C0463e;
import android.support.p011v7.view.menu.C0681w;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.widget.LinearLayout;
import p013b.p018b.p028h.p031b.p032a.C1026a;
import p013b.p018b.p028h.p033c.p034a.C1050b;
import p013b.p018b.p040i.p043c.p044a.C1118b;

/* renamed from: android.support.v7.view.menu.p */
public final class C0668p implements C1050b {

    /* renamed from: a */
    private static String f2563a;

    /* renamed from: b */
    private static String f2564b;

    /* renamed from: c */
    private static String f2565c;

    /* renamed from: d */
    private static String f2566d;

    /* renamed from: A */
    private boolean f2567A = false;

    /* renamed from: B */
    private boolean f2568B = false;

    /* renamed from: C */
    private int f2569C = 16;

    /* renamed from: D */
    private int f2570D = 0;

    /* renamed from: E */
    private View f2571E;

    /* renamed from: F */
    private C0463e f2572F;

    /* renamed from: G */
    private MenuItem.OnActionExpandListener f2573G;

    /* renamed from: H */
    private boolean f2574H = false;

    /* renamed from: I */
    private ContextMenu.ContextMenuInfo f2575I;

    /* renamed from: e */
    private final int f2576e;

    /* renamed from: f */
    private final int f2577f;

    /* renamed from: g */
    private final int f2578g;

    /* renamed from: h */
    private final int f2579h;

    /* renamed from: i */
    private CharSequence f2580i;

    /* renamed from: j */
    private CharSequence f2581j;

    /* renamed from: k */
    private Intent f2582k;

    /* renamed from: l */
    private char f2583l;

    /* renamed from: m */
    private int f2584m = SVGParser.ENTITY_WATCH_BUFFER_SIZE;

    /* renamed from: n */
    private char f2585n;

    /* renamed from: o */
    private int f2586o = SVGParser.ENTITY_WATCH_BUFFER_SIZE;

    /* renamed from: p */
    private Drawable f2587p;

    /* renamed from: q */
    private int f2588q = 0;

    /* renamed from: r */
    C0662l f2589r;

    /* renamed from: s */
    private C0647D f2590s;

    /* renamed from: t */
    private Runnable f2591t;

    /* renamed from: u */
    private MenuItem.OnMenuItemClickListener f2592u;

    /* renamed from: v */
    private CharSequence f2593v;

    /* renamed from: w */
    private CharSequence f2594w;

    /* renamed from: x */
    private ColorStateList f2595x = null;

    /* renamed from: y */
    private PorterDuff.Mode f2596y = null;

    /* renamed from: z */
    private boolean f2597z = false;

    C0668p(C0662l lVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f2589r = lVar;
        this.f2576e = i2;
        this.f2577f = i;
        this.f2578g = i3;
        this.f2579h = i4;
        this.f2580i = charSequence;
        this.f2570D = i5;
    }

    /* renamed from: a */
    private Drawable m3335a(Drawable drawable) {
        if (drawable != null && this.f2568B && (this.f2597z || this.f2567A)) {
            drawable = C1026a.m5462i(drawable).mutate();
            if (this.f2597z) {
                C1026a.m5447a(drawable, this.f2595x);
            }
            if (this.f2567A) {
                C1026a.m5450a(drawable, this.f2596y);
            }
            this.f2568B = false;
        }
        return drawable;
    }

    /* renamed from: a */
    public C0463e mo2748a() {
        return this.f2572F;
    }

    /* renamed from: a */
    public C1050b mo2749a(C0463e eVar) {
        C0463e eVar2 = this.f2572F;
        if (eVar2 != null) {
            eVar2.mo1942f();
        }
        this.f2571E = null;
        this.f2572F = eVar;
        this.f2589r.mo353b(true);
        C0463e eVar3 = this.f2572F;
        if (eVar3 != null) {
            eVar3.mo1935a((C0463e.C0465b) new C0667o(this));
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public CharSequence mo2915a(C0681w.C0682a aVar) {
        return (aVar == null || !aVar.mo277a()) ? getTitle() : getTitleCondensed();
    }

    /* renamed from: a */
    public void mo2916a(C0647D d) {
        this.f2590s = d;
        d.setHeaderTitle(getTitle());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2917a(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f2575I = contextMenuInfo;
    }

    /* renamed from: a */
    public void mo2918a(boolean z) {
        this.f2574H = z;
        this.f2589r.mo353b(false);
    }

    /* renamed from: b */
    public void mo2919b() {
        this.f2589r.mo2878c(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2920b(boolean z) {
        int i = this.f2569C;
        this.f2569C = (z ? 2 : 0) | (i & -3);
        if (i != this.f2569C) {
            this.f2589r.mo353b(false);
        }
    }

    /* renamed from: c */
    public int mo2921c() {
        return this.f2579h;
    }

    /* renamed from: c */
    public void mo2922c(boolean z) {
        this.f2569C = (z ? 4 : 0) | (this.f2569C & -5);
    }

    public boolean collapseActionView() {
        if ((this.f2570D & 8) == 0) {
            return false;
        }
        if (this.f2571E == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2573G;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f2589r.mo2710a(this);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public char mo2923d() {
        return this.f2589r.mo2715o() ? this.f2585n : this.f2583l;
    }

    /* renamed from: d */
    public void mo2924d(boolean z) {
        this.f2569C = z ? this.f2569C | 32 : this.f2569C & -33;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo2925e() {
        String str;
        char d = mo2923d();
        if (d == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(f2563a);
        if (d == 8) {
            str = f2565c;
        } else if (d == 10) {
            str = f2564b;
        } else if (d != ' ') {
            sb.append(d);
            return sb.toString();
        } else {
            str = f2566d;
        }
        sb.append(str);
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo2926e(boolean z) {
        int i = this.f2569C;
        this.f2569C = (z ? 0 : 8) | (i & -9);
        return i != this.f2569C;
    }

    public boolean expandActionView() {
        if (!mo2927f()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2573G;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f2589r.mo2711b(this);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo2927f() {
        C0463e eVar;
        if ((this.f2570D & 8) == 0) {
            return false;
        }
        if (this.f2571E == null && (eVar = this.f2572F) != null) {
            this.f2571E = eVar.mo1933a((MenuItem) this);
        }
        return this.f2571E != null;
    }

    /* renamed from: g */
    public boolean mo2928g() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f2592u;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C0662l lVar = this.f2589r;
        if (lVar.mo2709a(lVar, (MenuItem) this)) {
            return true;
        }
        Runnable runnable = this.f2591t;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f2582k != null) {
            try {
                this.f2589r.mo2886e().startActivity(this.f2582k);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        C0463e eVar = this.f2572F;
        return eVar != null && eVar.mo1940d();
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        View view = this.f2571E;
        if (view != null) {
            return view;
        }
        C0463e eVar = this.f2572F;
        if (eVar == null) {
            return null;
        }
        this.f2571E = eVar.mo1933a((MenuItem) this);
        return this.f2571E;
    }

    public int getAlphabeticModifiers() {
        return this.f2586o;
    }

    public char getAlphabeticShortcut() {
        return this.f2585n;
    }

    public CharSequence getContentDescription() {
        return this.f2593v;
    }

    public int getGroupId() {
        return this.f2577f;
    }

    public Drawable getIcon() {
        Drawable drawable = this.f2587p;
        if (drawable != null) {
            return m3335a(drawable);
        }
        if (this.f2588q == 0) {
            return null;
        }
        Drawable b = C1118b.m5721b(this.f2589r.mo2886e(), this.f2588q);
        this.f2588q = 0;
        this.f2587p = b;
        return m3335a(b);
    }

    public ColorStateList getIconTintList() {
        return this.f2595x;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f2596y;
    }

    public Intent getIntent() {
        return this.f2582k;
    }

    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f2576e;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f2575I;
    }

    public int getNumericModifiers() {
        return this.f2584m;
    }

    public char getNumericShortcut() {
        return this.f2583l;
    }

    public int getOrder() {
        return this.f2578g;
    }

    public SubMenu getSubMenu() {
        return this.f2590s;
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f2580i;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2581j;
        if (charSequence == null) {
            charSequence = this.f2580i;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    public CharSequence getTooltipText() {
        return this.f2594w;
    }

    /* renamed from: h */
    public boolean mo2941h() {
        return (this.f2569C & 32) == 32;
    }

    public boolean hasSubMenu() {
        return this.f2590s != null;
    }

    /* renamed from: i */
    public boolean mo2943i() {
        return (this.f2569C & 4) != 0;
    }

    public boolean isActionViewExpanded() {
        return this.f2574H;
    }

    public boolean isCheckable() {
        return (this.f2569C & 1) == 1;
    }

    public boolean isChecked() {
        return (this.f2569C & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.f2569C & 16) != 0;
    }

    public boolean isVisible() {
        C0463e eVar = this.f2572F;
        return (eVar == null || !eVar.mo1941e()) ? (this.f2569C & 8) == 0 : (this.f2569C & 8) == 0 && this.f2572F.mo1938b();
    }

    /* renamed from: j */
    public boolean mo2948j() {
        return (this.f2570D & 1) == 1;
    }

    /* renamed from: k */
    public boolean mo2949k() {
        return (this.f2570D & 2) == 2;
    }

    /* renamed from: l */
    public boolean mo2950l() {
        return this.f2589r.mo2897k();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo2951m() {
        return this.f2589r.mo2716p() && mo2923d() != 0;
    }

    /* renamed from: n */
    public boolean mo2952n() {
        return (this.f2570D & 4) == 4;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public C1050b setActionView(int i) {
        Context e = this.f2589r.mo2886e();
        setActionView(LayoutInflater.from(e).inflate(i, new LinearLayout(e), false));
        return this;
    }

    public C1050b setActionView(View view) {
        int i;
        this.f2571E = view;
        this.f2572F = null;
        if (view != null && view.getId() == -1 && (i = this.f2576e) > 0) {
            view.setId(i);
        }
        this.f2589r.mo2878c(this);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f2585n == c) {
            return this;
        }
        this.f2585n = Character.toLowerCase(c);
        this.f2589r.mo353b(false);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f2585n == c && this.f2586o == i) {
            return this;
        }
        this.f2585n = Character.toLowerCase(c);
        this.f2586o = KeyEvent.normalizeMetaState(i);
        this.f2589r.mo353b(false);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        int i = this.f2569C;
        this.f2569C = z | (i & true) ? 1 : 0;
        if (i != this.f2569C) {
            this.f2589r.mo353b(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z) {
        if ((this.f2569C & 4) != 0) {
            this.f2589r.mo2858a((MenuItem) this);
        } else {
            mo2920b(z);
        }
        return this;
    }

    public C1050b setContentDescription(CharSequence charSequence) {
        this.f2593v = charSequence;
        this.f2589r.mo353b(false);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f2569C = z ? this.f2569C | 16 : this.f2569C & -17;
        this.f2589r.mo353b(false);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f2587p = null;
        this.f2588q = i;
        this.f2568B = true;
        this.f2589r.mo353b(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f2588q = 0;
        this.f2587p = drawable;
        this.f2568B = true;
        this.f2589r.mo353b(false);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2595x = colorStateList;
        this.f2597z = true;
        this.f2568B = true;
        this.f2589r.mo353b(false);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2596y = mode;
        this.f2567A = true;
        this.f2568B = true;
        this.f2589r.mo353b(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f2582k = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        if (this.f2583l == c) {
            return this;
        }
        this.f2583l = c;
        this.f2589r.mo353b(false);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f2583l == c && this.f2584m == i) {
            return this;
        }
        this.f2583l = c;
        this.f2584m = KeyEvent.normalizeMetaState(i);
        this.f2589r.mo353b(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2573G = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2592u = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f2583l = c;
        this.f2585n = Character.toLowerCase(c2);
        this.f2589r.mo353b(false);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f2583l = c;
        this.f2584m = KeyEvent.normalizeMetaState(i);
        this.f2585n = Character.toLowerCase(c2);
        this.f2586o = KeyEvent.normalizeMetaState(i2);
        this.f2589r.mo353b(false);
        return this;
    }

    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.f2570D = i;
            this.f2589r.mo2878c(this);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public C1050b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        setTitle((CharSequence) this.f2589r.mo2886e().getString(i));
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f2580i = charSequence;
        this.f2589r.mo353b(false);
        C0647D d = this.f2590s;
        if (d != null) {
            d.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2581j = charSequence;
        if (charSequence == null) {
            CharSequence charSequence2 = this.f2580i;
        }
        this.f2589r.mo353b(false);
        return this;
    }

    public C1050b setTooltipText(CharSequence charSequence) {
        this.f2594w = charSequence;
        this.f2589r.mo353b(false);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        if (mo2926e(z)) {
            this.f2589r.mo2885d(this);
        }
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.f2580i;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }
}
