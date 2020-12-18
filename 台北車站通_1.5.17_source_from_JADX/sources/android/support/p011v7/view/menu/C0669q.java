package android.support.p011v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p007v4.view.C0463e;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import p013b.p018b.p028h.p033c.p034a.C1050b;
import p013b.p018b.p040i.p050h.C1138c;

/* renamed from: android.support.v7.view.menu.q */
public class C0669q extends C0651c<C1050b> implements MenuItem {

    /* renamed from: e */
    private Method f2598e;

    /* renamed from: android.support.v7.view.menu.q$a */
    class C0670a extends C0463e {

        /* renamed from: d */
        final ActionProvider f2599d;

        public C0670a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f2599d = actionProvider;
        }

        /* renamed from: a */
        public void mo1936a(SubMenu subMenu) {
            this.f2599d.onPrepareSubMenu(C0669q.this.mo2814a(subMenu));
        }

        /* renamed from: a */
        public boolean mo1937a() {
            return this.f2599d.hasSubMenu();
        }

        /* renamed from: c */
        public View mo1939c() {
            return this.f2599d.onCreateActionView();
        }

        /* renamed from: d */
        public boolean mo1940d() {
            return this.f2599d.onPerformDefaultAction();
        }
    }

    /* renamed from: android.support.v7.view.menu.q$b */
    static class C0671b extends FrameLayout implements C1138c {

        /* renamed from: a */
        final CollapsibleActionView f2601a;

        C0671b(View view) {
            super(view.getContext());
            this.f2601a = (CollapsibleActionView) view;
            addView(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public View mo3026a() {
            return (View) this.f2601a;
        }

        public void onActionViewCollapsed() {
            this.f2601a.onActionViewCollapsed();
        }

        public void onActionViewExpanded() {
            this.f2601a.onActionViewExpanded();
        }
    }

    /* renamed from: android.support.v7.view.menu.q$c */
    private class C0672c extends C0652d<MenuItem.OnActionExpandListener> implements MenuItem.OnActionExpandListener {
        C0672c(MenuItem.OnActionExpandListener onActionExpandListener) {
            super(onActionExpandListener);
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return ((MenuItem.OnActionExpandListener) this.f2477a).onMenuItemActionCollapse(C0669q.this.mo2813a(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return ((MenuItem.OnActionExpandListener) this.f2477a).onMenuItemActionExpand(C0669q.this.mo2813a(menuItem));
        }
    }

    /* renamed from: android.support.v7.view.menu.q$d */
    private class C0673d extends C0652d<MenuItem.OnMenuItemClickListener> implements MenuItem.OnMenuItemClickListener {
        C0673d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            super(onMenuItemClickListener);
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return ((MenuItem.OnMenuItemClickListener) this.f2477a).onMenuItemClick(C0669q.this.mo2813a(menuItem));
        }
    }

    C0669q(Context context, C1050b bVar) {
        super(context, bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0670a mo2970a(ActionProvider actionProvider) {
        return new C0670a(this.f2474b, actionProvider);
    }

    /* renamed from: a */
    public void mo2971a(boolean z) {
        try {
            if (this.f2598e == null) {
                this.f2598e = ((C1050b) this.f2477a).getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.f2598e.invoke(this.f2477a, new Object[]{Boolean.valueOf(z)});
        } catch (Exception e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }

    public boolean collapseActionView() {
        return ((C1050b) this.f2477a).collapseActionView();
    }

    public boolean expandActionView() {
        return ((C1050b) this.f2477a).expandActionView();
    }

    public ActionProvider getActionProvider() {
        C0463e a = ((C1050b) this.f2477a).mo2748a();
        if (a instanceof C0670a) {
            return ((C0670a) a).f2599d;
        }
        return null;
    }

    public View getActionView() {
        View actionView = ((C1050b) this.f2477a).getActionView();
        return actionView instanceof C0671b ? ((C0671b) actionView).mo3026a() : actionView;
    }

    public int getAlphabeticModifiers() {
        return ((C1050b) this.f2477a).getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return ((C1050b) this.f2477a).getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return ((C1050b) this.f2477a).getContentDescription();
    }

    public int getGroupId() {
        return ((C1050b) this.f2477a).getGroupId();
    }

    public Drawable getIcon() {
        return ((C1050b) this.f2477a).getIcon();
    }

    public ColorStateList getIconTintList() {
        return ((C1050b) this.f2477a).getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return ((C1050b) this.f2477a).getIconTintMode();
    }

    public Intent getIntent() {
        return ((C1050b) this.f2477a).getIntent();
    }

    public int getItemId() {
        return ((C1050b) this.f2477a).getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return ((C1050b) this.f2477a).getMenuInfo();
    }

    public int getNumericModifiers() {
        return ((C1050b) this.f2477a).getNumericModifiers();
    }

    public char getNumericShortcut() {
        return ((C1050b) this.f2477a).getNumericShortcut();
    }

    public int getOrder() {
        return ((C1050b) this.f2477a).getOrder();
    }

    public SubMenu getSubMenu() {
        return mo2814a(((C1050b) this.f2477a).getSubMenu());
    }

    public CharSequence getTitle() {
        return ((C1050b) this.f2477a).getTitle();
    }

    public CharSequence getTitleCondensed() {
        return ((C1050b) this.f2477a).getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return ((C1050b) this.f2477a).getTooltipText();
    }

    public boolean hasSubMenu() {
        return ((C1050b) this.f2477a).hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return ((C1050b) this.f2477a).isActionViewExpanded();
    }

    public boolean isCheckable() {
        return ((C1050b) this.f2477a).isCheckable();
    }

    public boolean isChecked() {
        return ((C1050b) this.f2477a).isChecked();
    }

    public boolean isEnabled() {
        return ((C1050b) this.f2477a).isEnabled();
    }

    public boolean isVisible() {
        return ((C1050b) this.f2477a).isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        ((C1050b) this.f2477a).mo2749a(actionProvider != null ? mo2970a(actionProvider) : null);
        return this;
    }

    public MenuItem setActionView(int i) {
        ((C1050b) this.f2477a).setActionView(i);
        View actionView = ((C1050b) this.f2477a).getActionView();
        if (actionView instanceof CollapsibleActionView) {
            ((C1050b) this.f2477a).setActionView((View) new C0671b(actionView));
        }
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0671b(view);
        }
        ((C1050b) this.f2477a).setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        ((C1050b) this.f2477a).setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        ((C1050b) this.f2477a).setAlphabeticShortcut(c, i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        ((C1050b) this.f2477a).setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        ((C1050b) this.f2477a).setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        ((C1050b) this.f2477a).setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        ((C1050b) this.f2477a).setEnabled(z);
        return this;
    }

    public MenuItem setIcon(int i) {
        ((C1050b) this.f2477a).setIcon(i);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        ((C1050b) this.f2477a).setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        ((C1050b) this.f2477a).setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        ((C1050b) this.f2477a).setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        ((C1050b) this.f2477a).setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        ((C1050b) this.f2477a).setNumericShortcut(c);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        ((C1050b) this.f2477a).setNumericShortcut(c, i);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        ((C1050b) this.f2477a).setOnActionExpandListener(onActionExpandListener != null ? new C0672c(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        ((C1050b) this.f2477a).setOnMenuItemClickListener(onMenuItemClickListener != null ? new C0673d(onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        ((C1050b) this.f2477a).setShortcut(c, c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        ((C1050b) this.f2477a).setShortcut(c, c2, i, i2);
        return this;
    }

    public void setShowAsAction(int i) {
        ((C1050b) this.f2477a).setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        ((C1050b) this.f2477a).setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        ((C1050b) this.f2477a).setTitle(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        ((C1050b) this.f2477a).setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        ((C1050b) this.f2477a).setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        ((C1050b) this.f2477a).setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return ((C1050b) this.f2477a).setVisible(z);
    }
}
