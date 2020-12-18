package p013b.p018b.p028h.p033c.p034a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.support.p007v4.view.C0463e;
import android.view.MenuItem;
import android.view.View;

/* renamed from: b.b.h.c.a.b */
public interface C1050b extends MenuItem {
    /* renamed from: a */
    C0463e mo2748a();

    /* renamed from: a */
    C1050b mo2749a(C0463e eVar);

    boolean collapseActionView();

    boolean expandActionView();

    View getActionView();

    int getAlphabeticModifiers();

    CharSequence getContentDescription();

    ColorStateList getIconTintList();

    PorterDuff.Mode getIconTintMode();

    int getNumericModifiers();

    CharSequence getTooltipText();

    boolean isActionViewExpanded();

    MenuItem setActionView(int i);

    MenuItem setActionView(View view);

    MenuItem setAlphabeticShortcut(char c, int i);

    C1050b setContentDescription(CharSequence charSequence);

    MenuItem setIconTintList(ColorStateList colorStateList);

    MenuItem setIconTintMode(PorterDuff.Mode mode);

    MenuItem setNumericShortcut(char c, int i);

    MenuItem setShortcut(char c, char c2, int i, int i2);

    void setShowAsAction(int i);

    MenuItem setShowAsActionFlags(int i);

    C1050b setTooltipText(CharSequence charSequence);
}
