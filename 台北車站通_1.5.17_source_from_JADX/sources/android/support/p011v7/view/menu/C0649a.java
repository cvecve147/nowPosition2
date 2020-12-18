package android.support.p011v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p007v4.view.C0463e;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p013b.p018b.p028h.p029a.C1006a;
import p013b.p018b.p028h.p031b.p032a.C1026a;
import p013b.p018b.p028h.p033c.p034a.C1050b;

/* renamed from: android.support.v7.view.menu.a */
public class C0649a implements C1050b {

    /* renamed from: a */
    private final int f2442a;

    /* renamed from: b */
    private final int f2443b;

    /* renamed from: c */
    private final int f2444c;

    /* renamed from: d */
    private final int f2445d;

    /* renamed from: e */
    private CharSequence f2446e;

    /* renamed from: f */
    private CharSequence f2447f;

    /* renamed from: g */
    private Intent f2448g;

    /* renamed from: h */
    private char f2449h;

    /* renamed from: i */
    private int f2450i = SVGParser.ENTITY_WATCH_BUFFER_SIZE;

    /* renamed from: j */
    private char f2451j;

    /* renamed from: k */
    private int f2452k = SVGParser.ENTITY_WATCH_BUFFER_SIZE;

    /* renamed from: l */
    private Drawable f2453l;

    /* renamed from: m */
    private int f2454m = 0;

    /* renamed from: n */
    private Context f2455n;

    /* renamed from: o */
    private MenuItem.OnMenuItemClickListener f2456o;

    /* renamed from: p */
    private CharSequence f2457p;

    /* renamed from: q */
    private CharSequence f2458q;

    /* renamed from: r */
    private ColorStateList f2459r = null;

    /* renamed from: s */
    private PorterDuff.Mode f2460s = null;

    /* renamed from: t */
    private boolean f2461t = false;

    /* renamed from: u */
    private boolean f2462u = false;

    /* renamed from: v */
    private int f2463v = 16;

    public C0649a(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f2455n = context;
        this.f2442a = i2;
        this.f2443b = i;
        this.f2444c = i3;
        this.f2445d = i4;
        this.f2446e = charSequence;
    }

    /* renamed from: b */
    private void m3195b() {
        if (this.f2453l == null) {
            return;
        }
        if (this.f2461t || this.f2462u) {
            this.f2453l = C1026a.m5462i(this.f2453l);
            this.f2453l = this.f2453l.mutate();
            if (this.f2461t) {
                C1026a.m5447a(this.f2453l, this.f2459r);
            }
            if (this.f2462u) {
                C1026a.m5450a(this.f2453l, this.f2460s);
            }
        }
    }

    /* renamed from: a */
    public C0463e mo2748a() {
        return null;
    }

    /* renamed from: a */
    public C1050b mo2749a(C0463e eVar) {
        throw new UnsupportedOperationException();
    }

    public boolean collapseActionView() {
        return false;
    }

    public boolean expandActionView() {
        return false;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.f2452k;
    }

    public char getAlphabeticShortcut() {
        return this.f2451j;
    }

    public CharSequence getContentDescription() {
        return this.f2457p;
    }

    public int getGroupId() {
        return this.f2443b;
    }

    public Drawable getIcon() {
        return this.f2453l;
    }

    public ColorStateList getIconTintList() {
        return this.f2459r;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f2460s;
    }

    public Intent getIntent() {
        return this.f2448g;
    }

    public int getItemId() {
        return this.f2442a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.f2450i;
    }

    public char getNumericShortcut() {
        return this.f2449h;
    }

    public int getOrder() {
        return this.f2445d;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f2446e;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2447f;
        return charSequence != null ? charSequence : this.f2446e;
    }

    public CharSequence getTooltipText() {
        return this.f2458q;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.f2463v & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f2463v & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f2463v & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f2463v & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public C1050b setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    public C1050b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f2451j = Character.toLowerCase(c);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f2451j = Character.toLowerCase(c);
        this.f2452k = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f2463v = z | (this.f2463v & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f2463v = (z ? 2 : 0) | (this.f2463v & -3);
        return this;
    }

    public C1050b setContentDescription(CharSequence charSequence) {
        this.f2457p = charSequence;
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f2463v = (z ? 16 : 0) | (this.f2463v & -17);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f2454m = i;
        this.f2453l = C1006a.m5394c(this.f2455n, i);
        m3195b();
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f2453l = drawable;
        this.f2454m = 0;
        m3195b();
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2459r = colorStateList;
        this.f2461t = true;
        m3195b();
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2460s = mode;
        this.f2462u = true;
        m3195b();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f2448g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f2449h = c;
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f2449h = c;
        this.f2450i = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2456o = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f2449h = c;
        this.f2451j = Character.toLowerCase(c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f2449h = c;
        this.f2450i = KeyEvent.normalizeMetaState(i);
        this.f2451j = Character.toLowerCase(c2);
        this.f2452k = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public void setShowAsAction(int i) {
    }

    public C1050b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f2446e = this.f2455n.getResources().getString(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f2446e = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2447f = charSequence;
        return this;
    }

    public C1050b setTooltipText(CharSequence charSequence) {
        this.f2458q = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.f2463v & 8;
        if (z) {
            i = 0;
        }
        this.f2463v = i2 | i;
        return this;
    }
}
