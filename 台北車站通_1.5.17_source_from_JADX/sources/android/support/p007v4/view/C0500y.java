package android.support.p007v4.view;

import android.os.Build;
import android.view.ViewGroup;
import p013b.p018b.p019a.C0930a;

/* renamed from: android.support.v4.view.y */
public final class C0500y {

    /* renamed from: a */
    static final C0503c f1819a;

    /* renamed from: android.support.v4.view.y$a */
    static class C0501a extends C0503c {
        C0501a() {
        }
    }

    /* renamed from: android.support.v4.view.y$b */
    static class C0502b extends C0501a {
        C0502b() {
        }

        /* renamed from: a */
        public boolean mo2046a(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }
    }

    /* renamed from: android.support.v4.view.y$c */
    static class C0503c {
        C0503c() {
        }

        /* renamed from: a */
        public boolean mo2046a(ViewGroup viewGroup) {
            Boolean bool = (Boolean) viewGroup.getTag(C0930a.tag_transition_group);
            return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && C0487v.m2299o(viewGroup) == null) ? false : true;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f1819a = i >= 21 ? new C0502b() : i >= 18 ? new C0501a() : new C0503c();
    }

    /* renamed from: a */
    public static boolean m2417a(ViewGroup viewGroup) {
        return f1819a.mo2046a(viewGroup);
    }
}
