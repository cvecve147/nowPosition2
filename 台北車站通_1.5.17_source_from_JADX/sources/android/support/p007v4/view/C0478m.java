package android.support.p007v4.view;

import android.view.View;
import android.view.ViewParent;

/* renamed from: android.support.v4.view.m */
public class C0478m {

    /* renamed from: a */
    private ViewParent f1795a;

    /* renamed from: b */
    private ViewParent f1796b;

    /* renamed from: c */
    private final View f1797c;

    /* renamed from: d */
    private boolean f1798d;

    /* renamed from: e */
    private int[] f1799e;

    public C0478m(View view) {
        this.f1797c = view;
    }

    /* renamed from: a */
    private void m2213a(int i, ViewParent viewParent) {
        if (i == 0) {
            this.f1795a = viewParent;
        } else if (i == 1) {
            this.f1796b = viewParent;
        }
    }

    /* renamed from: d */
    private ViewParent m2214d(int i) {
        if (i == 0) {
            return this.f1795a;
        }
        if (i != 1) {
            return null;
        }
        return this.f1796b;
    }

    /* renamed from: a */
    public void mo1953a(boolean z) {
        if (this.f1798d) {
            C0487v.m2263D(this.f1797c);
        }
        this.f1798d = z;
    }

    /* renamed from: a */
    public boolean mo1954a() {
        return mo1957a(0);
    }

    /* renamed from: a */
    public boolean mo1955a(float f, float f2) {
        ViewParent d;
        if (!mo1963b() || (d = m2214d(0)) == null) {
            return false;
        }
        return C0423E.m1979a(d, this.f1797c, f, f2);
    }

    /* renamed from: a */
    public boolean mo1956a(float f, float f2, boolean z) {
        ViewParent d;
        if (!mo1963b() || (d = m2214d(0)) == null) {
            return false;
        }
        return C0423E.m1980a(d, this.f1797c, f, f2, z);
    }

    /* renamed from: a */
    public boolean mo1957a(int i) {
        return m2214d(i) != null;
    }

    /* renamed from: a */
    public boolean mo1958a(int i, int i2) {
        if (mo1957a(i2)) {
            return true;
        }
        if (!mo1963b()) {
            return false;
        }
        View view = this.f1797c;
        for (ViewParent parent = this.f1797c.getParent(); parent != null; parent = parent.getParent()) {
            if (C0423E.m1981b(parent, view, this.f1797c, i, i2)) {
                m2213a(i2, parent);
                C0423E.m1978a(parent, view, this.f1797c, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo1959a(int i, int i2, int i3, int i4, int[] iArr) {
        return mo1960a(i, i2, i3, i4, iArr, 0);
    }

    /* renamed from: a */
    public boolean mo1960a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        ViewParent d;
        int i6;
        int i7;
        int[] iArr2 = iArr;
        if (!mo1963b() || (d = m2214d(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
            return false;
        }
        if (iArr2 != null) {
            this.f1797c.getLocationInWindow(iArr2);
            i7 = iArr2[0];
            i6 = iArr2[1];
        } else {
            i7 = 0;
            i6 = 0;
        }
        C0423E.m1976a(d, this.f1797c, i, i2, i3, i4, i5);
        if (iArr2 != null) {
            this.f1797c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i7;
            iArr2[1] = iArr2[1] - i6;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo1961a(int i, int i2, int[] iArr, int[] iArr2) {
        return mo1962a(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: a */
    public boolean mo1962a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent d;
        int i4;
        int i5;
        if (!mo1963b() || (d = m2214d(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
            return false;
        }
        if (iArr2 != null) {
            this.f1797c.getLocationInWindow(iArr2);
            i5 = iArr2[0];
            i4 = iArr2[1];
        } else {
            i5 = 0;
            i4 = 0;
        }
        if (iArr == null) {
            if (this.f1799e == null) {
                this.f1799e = new int[2];
            }
            iArr = this.f1799e;
        }
        iArr[0] = 0;
        iArr[1] = 0;
        C0423E.m1977a(d, this.f1797c, i, i2, iArr, i3);
        if (iArr2 != null) {
            this.f1797c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i5;
            iArr2[1] = iArr2[1] - i4;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    /* renamed from: b */
    public boolean mo1963b() {
        return this.f1798d;
    }

    /* renamed from: b */
    public boolean mo1964b(int i) {
        return mo1958a(i, 0);
    }

    /* renamed from: c */
    public void mo1965c() {
        mo1966c(0);
    }

    /* renamed from: c */
    public void mo1966c(int i) {
        ViewParent d = m2214d(i);
        if (d != null) {
            C0423E.m1975a(d, this.f1797c, i);
            m2213a(i, (ViewParent) null);
        }
    }
}
