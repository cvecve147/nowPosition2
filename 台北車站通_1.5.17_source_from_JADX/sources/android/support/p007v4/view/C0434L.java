package android.support.p007v4.view;

import android.os.Build;
import android.view.WindowInsets;

/* renamed from: android.support.v4.view.L */
public class C0434L {

    /* renamed from: a */
    private final Object f1660a;

    private C0434L(Object obj) {
        this.f1660a = obj;
    }

    /* renamed from: a */
    static C0434L m2016a(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C0434L(obj);
    }

    /* renamed from: a */
    static Object m2017a(C0434L l) {
        if (l == null) {
            return null;
        }
        return l.f1660a;
    }

    /* renamed from: a */
    public C0434L mo1767a() {
        if (Build.VERSION.SDK_INT >= 20) {
            return new C0434L(((WindowInsets) this.f1660a).consumeSystemWindowInsets());
        }
        return null;
    }

    /* renamed from: a */
    public C0434L mo1768a(int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 20) {
            return new C0434L(((WindowInsets) this.f1660a).replaceSystemWindowInsets(i, i2, i3, i4));
        }
        return null;
    }

    /* renamed from: b */
    public int mo1769b() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f1660a).getSystemWindowInsetBottom();
        }
        return 0;
    }

    /* renamed from: c */
    public int mo1770c() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f1660a).getSystemWindowInsetLeft();
        }
        return 0;
    }

    /* renamed from: d */
    public int mo1771d() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f1660a).getSystemWindowInsetRight();
        }
        return 0;
    }

    /* renamed from: e */
    public int mo1772e() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f1660a).getSystemWindowInsetTop();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0434L.class != obj.getClass()) {
            return false;
        }
        C0434L l = (C0434L) obj;
        Object obj2 = this.f1660a;
        return obj2 == null ? l.f1660a == null : obj2.equals(l.f1660a);
    }

    /* renamed from: f */
    public boolean mo1774f() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f1660a).hasSystemWindowInsets();
        }
        return false;
    }

    /* renamed from: g */
    public boolean mo1775g() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.f1660a).isConsumed();
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f1660a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
