package android.support.p007v4.view;

import android.graphics.Rect;
import android.view.View;

/* renamed from: android.support.v4.view.C */
class C0421C implements C0482q {

    /* renamed from: a */
    private final Rect f1645a = new Rect();

    /* renamed from: b */
    final /* synthetic */ ViewPager f1646b;

    C0421C(ViewPager viewPager) {
        this.f1646b = viewPager;
    }

    /* renamed from: a */
    public C0434L mo357a(View view, C0434L l) {
        C0434L b = C0487v.m2282b(view, l);
        if (b.mo1775g()) {
            return b;
        }
        Rect rect = this.f1645a;
        rect.left = b.mo1770c();
        rect.top = b.mo1772e();
        rect.right = b.mo1771d();
        rect.bottom = b.mo1769b();
        int childCount = this.f1646b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C0434L a = C0487v.m2265a(this.f1646b.getChildAt(i), b);
            rect.left = Math.min(a.mo1770c(), rect.left);
            rect.top = Math.min(a.mo1772e(), rect.top);
            rect.right = Math.min(a.mo1771d(), rect.right);
            rect.bottom = Math.min(a.mo1769b(), rect.bottom);
        }
        return b.mo1768a(rect.left, rect.top, rect.right, rect.bottom);
    }
}
