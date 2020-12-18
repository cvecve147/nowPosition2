package android.support.design.internal;

import android.content.Context;
import android.support.p011v7.view.menu.C0647D;
import android.support.p011v7.view.menu.C0662l;
import android.support.p011v7.view.menu.C0668p;
import android.view.SubMenu;

/* renamed from: android.support.design.internal.b */
public class C0075b extends C0662l {
    public C0075b(Context context) {
        super(context);
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0668p pVar = (C0668p) mo2853a(i, i2, i3, charSequence);
        C0089f fVar = new C0089f(mo2886e(), this, pVar);
        pVar.mo2916a((C0647D) fVar);
        return fVar;
    }
}
