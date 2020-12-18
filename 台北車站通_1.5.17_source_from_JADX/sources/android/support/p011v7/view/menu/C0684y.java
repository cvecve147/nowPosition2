package android.support.p011v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p013b.p018b.p028h.p033c.p034a.C1049a;

/* renamed from: android.support.v7.view.menu.y */
class C0684y extends C0651c<C1049a> implements Menu {
    C0684y(Context context, C1049a aVar) {
        super(context, aVar);
    }

    public MenuItem add(int i) {
        return mo2813a(((C1049a) this.f2477a).add(i));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo2813a(((C1049a) this.f2477a).add(i, i2, i3, i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo2813a(((C1049a) this.f2477a).add(i, i2, i3, charSequence));
    }

    public MenuItem add(CharSequence charSequence) {
        return mo2813a(((C1049a) this.f2477a).add(charSequence));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr;
        MenuItem[] menuItemArr3 = menuItemArr2 != null ? new MenuItem[menuItemArr2.length] : null;
        int addIntentOptions = ((C1049a) this.f2477a).addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr2[i5] = mo2813a(menuItemArr3[i5]);
            }
        }
        return addIntentOptions;
    }

    public SubMenu addSubMenu(int i) {
        return mo2814a(((C1049a) this.f2477a).addSubMenu(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return mo2814a(((C1049a) this.f2477a).addSubMenu(i, i2, i3, i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return mo2814a(((C1049a) this.f2477a).addSubMenu(i, i2, i3, charSequence));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return mo2814a(((C1049a) this.f2477a).addSubMenu(charSequence));
    }

    public void clear() {
        mo2816b();
        ((C1049a) this.f2477a).clear();
    }

    public void close() {
        ((C1049a) this.f2477a).close();
    }

    public MenuItem findItem(int i) {
        return mo2813a(((C1049a) this.f2477a).findItem(i));
    }

    public MenuItem getItem(int i) {
        return mo2813a(((C1049a) this.f2477a).getItem(i));
    }

    public boolean hasVisibleItems() {
        return ((C1049a) this.f2477a).hasVisibleItems();
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return ((C1049a) this.f2477a).isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return ((C1049a) this.f2477a).performIdentifierAction(i, i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return ((C1049a) this.f2477a).performShortcut(i, keyEvent, i2);
    }

    public void removeGroup(int i) {
        mo2815a(i);
        ((C1049a) this.f2477a).removeGroup(i);
    }

    public void removeItem(int i) {
        mo2817b(i);
        ((C1049a) this.f2477a).removeItem(i);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        ((C1049a) this.f2477a).setGroupCheckable(i, z, z2);
    }

    public void setGroupEnabled(int i, boolean z) {
        ((C1049a) this.f2477a).setGroupEnabled(i, z);
    }

    public void setGroupVisible(int i, boolean z) {
        ((C1049a) this.f2477a).setGroupVisible(i, z);
    }

    public void setQwertyMode(boolean z) {
        ((C1049a) this.f2477a).setQwertyMode(z);
    }

    public int size() {
        return ((C1049a) this.f2477a).size();
    }
}
