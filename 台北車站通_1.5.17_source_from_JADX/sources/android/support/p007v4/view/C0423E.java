package android.support.p007v4.view;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* renamed from: android.support.v4.view.E */
public final class C0423E {

    /* renamed from: a */
    static final C0426c f1647a;

    /* renamed from: android.support.v4.view.E$a */
    static class C0424a extends C0426c {
        C0424a() {
        }
    }

    /* renamed from: android.support.v4.view.E$b */
    static class C0425b extends C0424a {
        C0425b() {
        }

        /* renamed from: a */
        public void mo1742a(ViewParent viewParent, View view) {
            try {
                viewParent.onStopNestedScroll(view);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface " + "method onStopNestedScroll", e);
            }
        }

        /* renamed from: a */
        public void mo1743a(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            try {
                viewParent.onNestedScroll(view, i, i2, i3, i4);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface " + "method onNestedScroll", e);
            }
        }

        /* renamed from: a */
        public void mo1744a(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            try {
                viewParent.onNestedPreScroll(view, i, i2, iArr);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface " + "method onNestedPreScroll", e);
            }
        }

        /* renamed from: a */
        public void mo1745a(ViewParent viewParent, View view, View view2, int i) {
            try {
                viewParent.onNestedScrollAccepted(view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface " + "method onNestedScrollAccepted", e);
            }
        }

        /* renamed from: a */
        public boolean mo1746a(ViewParent viewParent, View view, float f, float f2) {
            try {
                return viewParent.onNestedPreFling(view, f, f2);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface " + "method onNestedPreFling", e);
                return false;
            }
        }

        /* renamed from: a */
        public boolean mo1747a(ViewParent viewParent, View view, float f, float f2, boolean z) {
            try {
                return viewParent.onNestedFling(view, f, f2, z);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface " + "method onNestedFling", e);
                return false;
            }
        }

        /* renamed from: b */
        public boolean mo1748b(ViewParent viewParent, View view, View view2, int i) {
            try {
                return viewParent.onStartNestedScroll(view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface " + "method onStartNestedScroll", e);
                return false;
            }
        }
    }

    /* renamed from: android.support.v4.view.E$c */
    static class C0426c {
        C0426c() {
        }

        /* renamed from: a */
        public void mo1742a(ViewParent viewParent, View view) {
            if (viewParent instanceof C0480o) {
                ((C0480o) viewParent).onStopNestedScroll(view);
            }
        }

        /* renamed from: a */
        public void mo1743a(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            if (viewParent instanceof C0480o) {
                ((C0480o) viewParent).onNestedScroll(view, i, i2, i3, i4);
            }
        }

        /* renamed from: a */
        public void mo1744a(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            if (viewParent instanceof C0480o) {
                ((C0480o) viewParent).onNestedPreScroll(view, i, i2, iArr);
            }
        }

        /* renamed from: a */
        public void mo1745a(ViewParent viewParent, View view, View view2, int i) {
            if (viewParent instanceof C0480o) {
                ((C0480o) viewParent).onNestedScrollAccepted(view, view2, i);
            }
        }

        /* renamed from: a */
        public boolean mo1746a(ViewParent viewParent, View view, float f, float f2) {
            if (viewParent instanceof C0480o) {
                return ((C0480o) viewParent).onNestedPreFling(view, f, f2);
            }
            return false;
        }

        /* renamed from: a */
        public boolean mo1747a(ViewParent viewParent, View view, float f, float f2, boolean z) {
            if (viewParent instanceof C0480o) {
                return ((C0480o) viewParent).onNestedFling(view, f, f2, z);
            }
            return false;
        }

        /* renamed from: b */
        public boolean mo1748b(ViewParent viewParent, View view, View view2, int i) {
            if (viewParent instanceof C0480o) {
                return ((C0480o) viewParent).onStartNestedScroll(view, view2, i);
            }
            return false;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f1647a = i >= 21 ? new C0425b() : i >= 19 ? new C0424a() : new C0426c();
    }

    /* renamed from: a */
    public static void m1975a(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof C0479n) {
            ((C0479n) viewParent).mo523a(view, i);
        } else if (i == 0) {
            f1647a.mo1742a(viewParent, view);
        }
    }

    /* renamed from: a */
    public static void m1976a(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5) {
        if (viewParent instanceof C0479n) {
            ((C0479n) viewParent).mo525a(view, i, i2, i3, i4, i5);
        } else if (i5 == 0) {
            f1647a.mo1743a(viewParent, view, i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public static void m1977a(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof C0479n) {
            ((C0479n) viewParent).mo526a(view, i, i2, iArr, i3);
        } else if (i3 == 0) {
            f1647a.mo1744a(viewParent, view, i, i2, iArr);
        }
    }

    /* renamed from: a */
    public static void m1978a(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof C0479n) {
            ((C0479n) viewParent).mo537b(view, view2, i, i2);
        } else if (i2 == 0) {
            f1647a.mo1745a(viewParent, view, view2, i);
        }
    }

    /* renamed from: a */
    public static boolean m1979a(ViewParent viewParent, View view, float f, float f2) {
        return f1647a.mo1746a(viewParent, view, f, f2);
    }

    /* renamed from: a */
    public static boolean m1980a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        return f1647a.mo1747a(viewParent, view, f, f2, z);
    }

    /* renamed from: b */
    public static boolean m1981b(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof C0479n) {
            return ((C0479n) viewParent).mo532a(view, view2, i, i2);
        }
        if (i2 == 0) {
            return f1647a.mo1748b(viewParent, view, view2, i);
        }
        return false;
    }
}
