package android.support.design.internal;

import android.graphics.Rect;
import android.support.p007v4.view.C0434L;
import android.support.p007v4.view.C0482q;
import android.support.p007v4.view.C0487v;
import android.view.View;

/* renamed from: android.support.design.internal.h */
class C0091h implements C0482q {

    /* renamed from: a */
    final /* synthetic */ C0092i f507a;

    C0091h(C0092i iVar) {
        this.f507a = iVar;
    }

    /* renamed from: a */
    public C0434L mo357a(View view, C0434L l) {
        C0092i iVar = this.f507a;
        if (iVar.f509b == null) {
            iVar.f509b = new Rect();
        }
        this.f507a.f509b.set(l.mo1770c(), l.mo1772e(), l.mo1771d(), l.mo1769b());
        this.f507a.mo358a(l);
        this.f507a.setWillNotDraw(!l.mo1774f() || this.f507a.f508a == null);
        C0487v.m2261B(this.f507a);
        return l.mo1767a();
    }
}
