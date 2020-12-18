package android.support.p007v4.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import p013b.p018b.p028h.p033c.p034a.C1050b;

/* renamed from: android.support.v4.view.i */
public final class C0471i {

    /* renamed from: a */
    static final C0474c f1794a = (Build.VERSION.SDK_INT >= 26 ? new C0472a() : new C0473b());

    /* renamed from: android.support.v4.view.i$a */
    static class C0472a extends C0473b {
        C0472a() {
        }

        /* renamed from: a */
        public void mo1945a(MenuItem menuItem, char c, int i) {
            menuItem.setAlphabeticShortcut(c, i);
        }

        /* renamed from: a */
        public void mo1946a(MenuItem menuItem, ColorStateList colorStateList) {
            menuItem.setIconTintList(colorStateList);
        }

        /* renamed from: a */
        public void mo1947a(MenuItem menuItem, PorterDuff.Mode mode) {
            menuItem.setIconTintMode(mode);
        }

        /* renamed from: a */
        public void mo1948a(MenuItem menuItem, CharSequence charSequence) {
            menuItem.setContentDescription(charSequence);
        }

        /* renamed from: b */
        public void mo1949b(MenuItem menuItem, char c, int i) {
            menuItem.setNumericShortcut(c, i);
        }

        /* renamed from: b */
        public void mo1950b(MenuItem menuItem, CharSequence charSequence) {
            menuItem.setTooltipText(charSequence);
        }
    }

    /* renamed from: android.support.v4.view.i$b */
    static class C0473b implements C0474c {
        C0473b() {
        }

        /* renamed from: a */
        public void mo1945a(MenuItem menuItem, char c, int i) {
        }

        /* renamed from: a */
        public void mo1946a(MenuItem menuItem, ColorStateList colorStateList) {
        }

        /* renamed from: a */
        public void mo1947a(MenuItem menuItem, PorterDuff.Mode mode) {
        }

        /* renamed from: a */
        public void mo1948a(MenuItem menuItem, CharSequence charSequence) {
        }

        /* renamed from: b */
        public void mo1949b(MenuItem menuItem, char c, int i) {
        }

        /* renamed from: b */
        public void mo1950b(MenuItem menuItem, CharSequence charSequence) {
        }
    }

    /* renamed from: android.support.v4.view.i$c */
    interface C0474c {
        /* renamed from: a */
        void mo1945a(MenuItem menuItem, char c, int i);

        /* renamed from: a */
        void mo1946a(MenuItem menuItem, ColorStateList colorStateList);

        /* renamed from: a */
        void mo1947a(MenuItem menuItem, PorterDuff.Mode mode);

        /* renamed from: a */
        void mo1948a(MenuItem menuItem, CharSequence charSequence);

        /* renamed from: b */
        void mo1949b(MenuItem menuItem, char c, int i);

        /* renamed from: b */
        void mo1950b(MenuItem menuItem, CharSequence charSequence);
    }

    /* renamed from: a */
    public static MenuItem m2181a(MenuItem menuItem, C0463e eVar) {
        if (menuItem instanceof C1050b) {
            return ((C1050b) menuItem).mo2749a(eVar);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    /* renamed from: a */
    public static void m2182a(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C1050b) {
            ((C1050b) menuItem).setAlphabeticShortcut(c, i);
        } else {
            f1794a.mo1945a(menuItem, c, i);
        }
    }

    /* renamed from: a */
    public static void m2183a(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof C1050b) {
            ((C1050b) menuItem).setIconTintList(colorStateList);
        } else {
            f1794a.mo1946a(menuItem, colorStateList);
        }
    }

    /* renamed from: a */
    public static void m2184a(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof C1050b) {
            ((C1050b) menuItem).setIconTintMode(mode);
        } else {
            f1794a.mo1947a(menuItem, mode);
        }
    }

    /* renamed from: a */
    public static void m2185a(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C1050b) {
            ((C1050b) menuItem).setContentDescription(charSequence);
        } else {
            f1794a.mo1948a(menuItem, charSequence);
        }
    }

    /* renamed from: b */
    public static void m2186b(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C1050b) {
            ((C1050b) menuItem).setNumericShortcut(c, i);
        } else {
            f1794a.mo1949b(menuItem, c, i);
        }
    }

    /* renamed from: b */
    public static void m2187b(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C1050b) {
            ((C1050b) menuItem).setTooltipText(charSequence);
        } else {
            f1794a.mo1950b(menuItem, charSequence);
        }
    }
}
