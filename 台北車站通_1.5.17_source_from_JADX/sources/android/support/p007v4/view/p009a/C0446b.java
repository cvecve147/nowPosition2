package android.support.p007v4.view.p009a;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: android.support.v4.view.a.b */
public class C0446b {

    /* renamed from: a */
    private final AccessibilityNodeInfo f1738a;

    /* renamed from: b */
    public int f1739b = -1;

    /* renamed from: android.support.v4.view.a.b$a */
    public static class C0447a {

        /* renamed from: A */
        public static final C0447a f1740A = new C0447a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null);

        /* renamed from: B */
        public static final C0447a f1741B = new C0447a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null);

        /* renamed from: C */
        public static final C0447a f1742C = new C0447a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null);

        /* renamed from: D */
        public static final C0447a f1743D;

        /* renamed from: a */
        public static final C0447a f1744a = new C0447a(1, (CharSequence) null);

        /* renamed from: b */
        public static final C0447a f1745b = new C0447a(2, (CharSequence) null);

        /* renamed from: c */
        public static final C0447a f1746c = new C0447a(4, (CharSequence) null);

        /* renamed from: d */
        public static final C0447a f1747d = new C0447a(8, (CharSequence) null);

        /* renamed from: e */
        public static final C0447a f1748e = new C0447a(16, (CharSequence) null);

        /* renamed from: f */
        public static final C0447a f1749f = new C0447a(32, (CharSequence) null);

        /* renamed from: g */
        public static final C0447a f1750g = new C0447a(64, (CharSequence) null);

        /* renamed from: h */
        public static final C0447a f1751h = new C0447a(128, (CharSequence) null);

        /* renamed from: i */
        public static final C0447a f1752i = new C0447a(256, (CharSequence) null);

        /* renamed from: j */
        public static final C0447a f1753j = new C0447a(512, (CharSequence) null);

        /* renamed from: k */
        public static final C0447a f1754k = new C0447a(1024, (CharSequence) null);

        /* renamed from: l */
        public static final C0447a f1755l = new C0447a(2048, (CharSequence) null);

        /* renamed from: m */
        public static final C0447a f1756m = new C0447a(SVGParser.ENTITY_WATCH_BUFFER_SIZE, (CharSequence) null);

        /* renamed from: n */
        public static final C0447a f1757n = new C0447a(8192, (CharSequence) null);

        /* renamed from: o */
        public static final C0447a f1758o = new C0447a(16384, (CharSequence) null);

        /* renamed from: p */
        public static final C0447a f1759p = new C0447a(32768, (CharSequence) null);

        /* renamed from: q */
        public static final C0447a f1760q = new C0447a(65536, (CharSequence) null);

        /* renamed from: r */
        public static final C0447a f1761r = new C0447a(131072, (CharSequence) null);

        /* renamed from: s */
        public static final C0447a f1762s = new C0447a(262144, (CharSequence) null);

        /* renamed from: t */
        public static final C0447a f1763t = new C0447a(524288, (CharSequence) null);

        /* renamed from: u */
        public static final C0447a f1764u = new C0447a(1048576, (CharSequence) null);

        /* renamed from: v */
        public static final C0447a f1765v = new C0447a(2097152, (CharSequence) null);

        /* renamed from: w */
        public static final C0447a f1766w = new C0447a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null);

        /* renamed from: x */
        public static final C0447a f1767x = new C0447a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null);

        /* renamed from: y */
        public static final C0447a f1768y = new C0447a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null);

        /* renamed from: z */
        public static final C0447a f1769z = new C0447a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null);

        /* renamed from: E */
        final Object f1770E;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            if (Build.VERSION.SDK_INT >= 24) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
            }
            f1743D = new C0447a(accessibilityAction);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C0447a(int i, CharSequence charSequence) {
            this(Build.VERSION.SDK_INT >= 21 ? new AccessibilityNodeInfo.AccessibilityAction(i, charSequence) : null);
        }

        C0447a(Object obj) {
            this.f1770E = obj;
        }
    }

    /* renamed from: android.support.v4.view.a.b$b */
    public static class C0448b {

        /* renamed from: a */
        final Object f1771a;

        C0448b(Object obj) {
            this.f1771a = obj;
        }

        /* renamed from: a */
        public static C0448b m2138a(int i, int i2, boolean z, int i3) {
            int i4 = Build.VERSION.SDK_INT;
            return i4 >= 21 ? new C0448b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3)) : i4 >= 19 ? new C0448b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z)) : new C0448b((Object) null);
        }
    }

    /* renamed from: android.support.v4.view.a.b$c */
    public static class C0449c {

        /* renamed from: a */
        final Object f1772a;

        C0449c(Object obj) {
            this.f1772a = obj;
        }

        /* renamed from: a */
        public static C0449c m2139a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            int i5 = Build.VERSION.SDK_INT;
            return i5 >= 21 ? new C0449c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2)) : i5 >= 19 ? new C0449c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z)) : new C0449c((Object) null);
        }
    }

    private C0446b(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f1738a = accessibilityNodeInfo;
    }

    /* renamed from: a */
    public static C0446b m2086a(C0446b bVar) {
        return m2087a(AccessibilityNodeInfo.obtain(bVar.f1738a));
    }

    /* renamed from: a */
    public static C0446b m2087a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C0446b(accessibilityNodeInfo);
    }

    /* renamed from: b */
    private static String m2088b(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case SVGParser.ENTITY_WATCH_BUFFER_SIZE /*4096*/:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            default:
                return "ACTION_UNKNOWN";
        }
    }

    /* renamed from: a */
    public int mo1853a() {
        return this.f1738a.getActions();
    }

    /* renamed from: a */
    public void mo1854a(int i) {
        this.f1738a.addAction(i);
    }

    /* renamed from: a */
    public void mo1855a(Rect rect) {
        this.f1738a.getBoundsInParent(rect);
    }

    /* renamed from: a */
    public void mo1856a(View view) {
        this.f1738a.addChild(view);
    }

    /* renamed from: a */
    public void mo1857a(CharSequence charSequence) {
        this.f1738a.setClassName(charSequence);
    }

    /* renamed from: a */
    public void mo1858a(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f1738a.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) ((C0448b) obj).f1771a);
        }
    }

    /* renamed from: a */
    public void mo1859a(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f1738a.setAccessibilityFocused(z);
        }
    }

    /* renamed from: a */
    public boolean mo1860a(C0447a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f1738a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f1770E);
        }
        return false;
    }

    /* renamed from: b */
    public CharSequence mo1861b() {
        return this.f1738a.getClassName();
    }

    /* renamed from: b */
    public void mo1862b(Rect rect) {
        this.f1738a.getBoundsInScreen(rect);
    }

    /* renamed from: b */
    public void mo1863b(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            this.f1738a.setLabelFor(view);
        }
    }

    /* renamed from: b */
    public void mo1864b(CharSequence charSequence) {
        this.f1738a.setContentDescription(charSequence);
    }

    /* renamed from: b */
    public void mo1865b(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f1738a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) ((C0449c) obj).f1772a);
        }
    }

    /* renamed from: b */
    public void mo1866b(boolean z) {
        this.f1738a.setCheckable(z);
    }

    /* renamed from: c */
    public CharSequence mo1867c() {
        return this.f1738a.getContentDescription();
    }

    /* renamed from: c */
    public void mo1868c(Rect rect) {
        this.f1738a.setBoundsInParent(rect);
    }

    /* renamed from: c */
    public void mo1869c(View view) {
        this.f1738a.setParent(view);
    }

    /* renamed from: c */
    public void mo1870c(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f1738a.setError(charSequence);
        }
    }

    /* renamed from: c */
    public void mo1871c(boolean z) {
        this.f1738a.setChecked(z);
    }

    /* renamed from: d */
    public CharSequence mo1872d() {
        return this.f1738a.getPackageName();
    }

    /* renamed from: d */
    public void mo1873d(Rect rect) {
        this.f1738a.setBoundsInScreen(rect);
    }

    /* renamed from: d */
    public void mo1874d(View view) {
        this.f1738a.setSource(view);
    }

    /* renamed from: d */
    public void mo1875d(CharSequence charSequence) {
        this.f1738a.setPackageName(charSequence);
    }

    /* renamed from: d */
    public void mo1876d(boolean z) {
        this.f1738a.setClickable(z);
    }

    /* renamed from: e */
    public CharSequence mo1877e() {
        return this.f1738a.getText();
    }

    /* renamed from: e */
    public void mo1878e(CharSequence charSequence) {
        this.f1738a.setText(charSequence);
    }

    /* renamed from: e */
    public void mo1879e(boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f1738a.setContentInvalid(z);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0446b.class != obj.getClass()) {
            return false;
        }
        C0446b bVar = (C0446b) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f1738a;
        if (accessibilityNodeInfo == null) {
            if (bVar.f1738a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(bVar.f1738a)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public String mo1881f() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f1738a.getViewIdResourceName();
        }
        return null;
    }

    /* renamed from: f */
    public void mo1882f(boolean z) {
        this.f1738a.setEnabled(z);
    }

    /* renamed from: g */
    public void mo1883g(boolean z) {
        this.f1738a.setFocusable(z);
    }

    /* renamed from: g */
    public boolean mo1884g() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f1738a.isAccessibilityFocused();
        }
        return false;
    }

    /* renamed from: h */
    public void mo1885h(boolean z) {
        this.f1738a.setFocused(z);
    }

    /* renamed from: h */
    public boolean mo1886h() {
        return this.f1738a.isCheckable();
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f1738a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: i */
    public void mo1888i(boolean z) {
        this.f1738a.setLongClickable(z);
    }

    /* renamed from: i */
    public boolean mo1889i() {
        return this.f1738a.isChecked();
    }

    /* renamed from: j */
    public void mo1890j(boolean z) {
        this.f1738a.setScrollable(z);
    }

    /* renamed from: j */
    public boolean mo1891j() {
        return this.f1738a.isClickable();
    }

    /* renamed from: k */
    public void mo1892k(boolean z) {
        this.f1738a.setSelected(z);
    }

    /* renamed from: k */
    public boolean mo1893k() {
        return this.f1738a.isEnabled();
    }

    /* renamed from: l */
    public void mo1894l(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f1738a.setVisibleToUser(z);
        }
    }

    /* renamed from: l */
    public boolean mo1895l() {
        return this.f1738a.isFocusable();
    }

    /* renamed from: m */
    public boolean mo1896m() {
        return this.f1738a.isFocused();
    }

    /* renamed from: n */
    public boolean mo1897n() {
        return this.f1738a.isLongClickable();
    }

    /* renamed from: o */
    public boolean mo1898o() {
        return this.f1738a.isPassword();
    }

    /* renamed from: p */
    public boolean mo1899p() {
        return this.f1738a.isScrollable();
    }

    /* renamed from: q */
    public boolean mo1900q() {
        return this.f1738a.isSelected();
    }

    /* renamed from: r */
    public boolean mo1901r() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f1738a.isVisibleToUser();
        }
        return false;
    }

    /* renamed from: s */
    public void mo1902s() {
        this.f1738a.recycle();
    }

    /* renamed from: t */
    public AccessibilityNodeInfo mo1903t() {
        return this.f1738a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        mo1855a(rect);
        sb.append("; boundsInParent: " + rect);
        mo1862b(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(mo1872d());
        sb.append("; className: ");
        sb.append(mo1861b());
        sb.append("; text: ");
        sb.append(mo1877e());
        sb.append("; contentDescription: ");
        sb.append(mo1867c());
        sb.append("; viewId: ");
        sb.append(mo1881f());
        sb.append("; checkable: ");
        sb.append(mo1886h());
        sb.append("; checked: ");
        sb.append(mo1889i());
        sb.append("; focusable: ");
        sb.append(mo1895l());
        sb.append("; focused: ");
        sb.append(mo1896m());
        sb.append("; selected: ");
        sb.append(mo1900q());
        sb.append("; clickable: ");
        sb.append(mo1891j());
        sb.append("; longClickable: ");
        sb.append(mo1897n());
        sb.append("; enabled: ");
        sb.append(mo1893k());
        sb.append("; password: ");
        sb.append(mo1898o());
        sb.append("; scrollable: " + mo1899p());
        sb.append("; [");
        int a = mo1853a();
        while (a != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(a);
            a &= ~numberOfTrailingZeros;
            sb.append(m2088b(numberOfTrailingZeros));
            if (a != 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
