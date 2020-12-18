package android.support.transition;

import android.os.Build;
import android.view.ViewGroup;

/* renamed from: android.support.transition.aa */
class C0214aa {

    /* renamed from: a */
    private static final C0223ea f1023a = (Build.VERSION.SDK_INT >= 18 ? new C0221da() : new C0219ca());

    /* renamed from: a */
    static C0212Z m1065a(ViewGroup viewGroup) {
        return f1023a.mo1037a(viewGroup);
    }

    /* renamed from: a */
    static void m1066a(ViewGroup viewGroup, boolean z) {
        f1023a.mo1038a(viewGroup, z);
    }
}
